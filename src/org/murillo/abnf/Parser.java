/* -----------------------------------------------------------------------------
 * Parser.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Thu Feb 13 17:50:21 EET 2020
 *
 * -----------------------------------------------------------------------------
 */

package org.murillo.abnf;

import java.util.Stack;
import java.util.Properties;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;

public class Parser
{
  private Parser() {}

  static public void main(String[] args)
  {
    Properties arguments = new Properties();
    String error = "";
    boolean ok = args.length > 0;

    if (ok)
    {
      arguments.setProperty("Trace", "Off");
      arguments.setProperty("Rule", "session-description");

      for (int i = 0; i < args.length; i++)
      {
        if (args[i].equals("-trace"))
          arguments.setProperty("Trace", "On");
        else if (args[i].equals("-visitor"))
          arguments.setProperty("Visitor", args[++i]);
        else if (args[i].equals("-file"))
          arguments.setProperty("File", args[++i]);
        else if (args[i].equals("-string"))
          arguments.setProperty("String", args[++i]);
        else if (args[i].equals("-rule"))
          arguments.setProperty("Rule", args[++i]);
        else
        {
          error = "unknown argument: " + args[i];
          ok = false;
        }
      }
    }

    if (ok)
    {
      if (arguments.getProperty("File") == null &&
          arguments.getProperty("String") == null)
      {
        error = "insufficient arguments: -file or -string required";
        ok = false;
      }
    }

    if (!ok)
    {
      System.out.println("error: " + error);
      System.out.println("usage: Parser [-rule rulename] [-trace] <-file file | -string string> [-visitor visitor]");
    }
    else
    {
      try
      {
        Rule rule = null;

        if (arguments.getProperty("File") != null)
        {
          rule = 
            parse(
              arguments.getProperty("Rule"), 
              new File(arguments.getProperty("File")), 
              arguments.getProperty("Trace").equals("On"));
        }
        else if (arguments.getProperty("String") != null)
        {
          rule = 
            parse(
              arguments.getProperty("Rule"), 
              arguments.getProperty("String"), 
              arguments.getProperty("Trace").equals("On"));
        }

        if (arguments.getProperty("Visitor") != null)
        {
          Visitor visitor = 
            (Visitor)Class.forName(arguments.getProperty("Visitor")).newInstance();
          rule.accept(visitor);
        }
      }
      catch (IllegalArgumentException e)
      {
        System.out.println("argument error: " + e.getMessage());
      }
      catch (IOException e)
      {
        System.out.println("io error: " + e.getMessage());
      }
      catch (ParserException e)
      {
        System.out.println("parser error: " + e.getMessage());
      }
      catch (ClassNotFoundException e)
      {
        System.out.println("visitor error: class not found - " + e.getMessage());
      }
      catch (IllegalAccessException e)
      {
        System.out.println("visitor error: illegal access - " + e.getMessage());
      }
      catch (InstantiationException e)
      {
        System.out.println("visitor error: instantiation failure - " + e.getMessage());
      }
    }
  }

  static public Rule parse(String rulename, String string)
  throws IllegalArgumentException,
         ParserException
  {
    return parse(rulename, string, false);
  }

  static public Rule parse(String rulename, InputStream in)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    return parse(rulename, in, false);
  }

  static public Rule parse(String rulename, File file)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    return parse(rulename, file, false);
  }

  static private Rule parse(String rulename, String string, boolean trace)
  throws IllegalArgumentException,
         ParserException
  {
    if (rulename == null)
      throw new IllegalArgumentException("null rulename");
    if (string == null)
      throw new IllegalArgumentException("null string");

    ParserContext context = new ParserContext(string, trace);

    Rule rule = null;
    if (rulename.equalsIgnoreCase("session-description")) rule = Rule_session_description.parse(context);
    else if (rulename.equalsIgnoreCase("proto-version")) rule = Rule_proto_version.parse(context);
    else if (rulename.equalsIgnoreCase("origin-field")) rule = Rule_origin_field.parse(context);
    else if (rulename.equalsIgnoreCase("session-name-field")) rule = Rule_session_name_field.parse(context);
    else if (rulename.equalsIgnoreCase("information-field")) rule = Rule_information_field.parse(context);
    else if (rulename.equalsIgnoreCase("uri-field")) rule = Rule_uri_field.parse(context);
    else if (rulename.equalsIgnoreCase("email-fields")) rule = Rule_email_fields.parse(context);
    else if (rulename.equalsIgnoreCase("email-field")) rule = Rule_email_field.parse(context);
    else if (rulename.equalsIgnoreCase("phone-fields")) rule = Rule_phone_fields.parse(context);
    else if (rulename.equalsIgnoreCase("phone-field")) rule = Rule_phone_field.parse(context);
    else if (rulename.equalsIgnoreCase("connection-field")) rule = Rule_connection_field.parse(context);
    else if (rulename.equalsIgnoreCase("bandwidth-fields")) rule = Rule_bandwidth_fields.parse(context);
    else if (rulename.equalsIgnoreCase("bandwidth-field")) rule = Rule_bandwidth_field.parse(context);
    else if (rulename.equalsIgnoreCase("time-fields")) rule = Rule_time_fields.parse(context);
    else if (rulename.equalsIgnoreCase("time-repeat-field")) rule = Rule_time_repeat_field.parse(context);
    else if (rulename.equalsIgnoreCase("time-field")) rule = Rule_time_field.parse(context);
    else if (rulename.equalsIgnoreCase("repeat-field")) rule = Rule_repeat_field.parse(context);
    else if (rulename.equalsIgnoreCase("zone-adjustments")) rule = Rule_zone_adjustments.parse(context);
    else if (rulename.equalsIgnoreCase("key-field")) rule = Rule_key_field.parse(context);
    else if (rulename.equalsIgnoreCase("attribute-fields")) rule = Rule_attribute_fields.parse(context);
    else if (rulename.equalsIgnoreCase("attribute-field")) rule = Rule_attribute_field.parse(context);
    else if (rulename.equalsIgnoreCase("gen-attribute")) rule = Rule_gen_attribute.parse(context);
    else if (rulename.equalsIgnoreCase("sctpmap-attr")) rule = Rule_sctpmap_attr.parse(context);
    else if (rulename.equalsIgnoreCase("sctpmap-number")) rule = Rule_sctpmap_number.parse(context);
    else if (rulename.equalsIgnoreCase("app")) rule = Rule_app.parse(context);
    else if (rulename.equalsIgnoreCase("streams")) rule = Rule_streams.parse(context);
    else if (rulename.equalsIgnoreCase("fingerprint-attribute")) rule = Rule_fingerprint_attribute.parse(context);
    else if (rulename.equalsIgnoreCase("hash-func")) rule = Rule_hash_func.parse(context);
    else if (rulename.equalsIgnoreCase("fingerprint")) rule = Rule_fingerprint.parse(context);
    else if (rulename.equalsIgnoreCase("extmap-attribute")) rule = Rule_extmap_attribute.parse(context);
    else if (rulename.equalsIgnoreCase("extension-identifier")) rule = Rule_extension_identifier.parse(context);
    else if (rulename.equalsIgnoreCase("extension-name")) rule = Rule_extension_name.parse(context);
    else if (rulename.equalsIgnoreCase("direction")) rule = Rule_direction.parse(context);
    else if (rulename.equalsIgnoreCase("extension-attributes")) rule = Rule_extension_attributes.parse(context);
    else if (rulename.equalsIgnoreCase("candidate-attribute")) rule = Rule_candidate_attribute.parse(context);
    else if (rulename.equalsIgnoreCase("foundation")) rule = Rule_foundation.parse(context);
    else if (rulename.equalsIgnoreCase("component-id")) rule = Rule_component_id.parse(context);
    else if (rulename.equalsIgnoreCase("transport")) rule = Rule_transport.parse(context);
    else if (rulename.equalsIgnoreCase("transport-extension")) rule = Rule_transport_extension.parse(context);
    else if (rulename.equalsIgnoreCase("priority")) rule = Rule_priority.parse(context);
    else if (rulename.equalsIgnoreCase("cand-type")) rule = Rule_cand_type.parse(context);
    else if (rulename.equalsIgnoreCase("candidate-types")) rule = Rule_candidate_types.parse(context);
    else if (rulename.equalsIgnoreCase("rel-addr")) rule = Rule_rel_addr.parse(context);
    else if (rulename.equalsIgnoreCase("rel-port")) rule = Rule_rel_port.parse(context);
    else if (rulename.equalsIgnoreCase("extension-att")) rule = Rule_extension_att.parse(context);
    else if (rulename.equalsIgnoreCase("extension-att-name")) rule = Rule_extension_att_name.parse(context);
    else if (rulename.equalsIgnoreCase("extension-att-value")) rule = Rule_extension_att_value.parse(context);
    else if (rulename.equalsIgnoreCase("ice-char")) rule = Rule_ice_char.parse(context);
    else if (rulename.equalsIgnoreCase("crypto-attribute")) rule = Rule_crypto_attribute.parse(context);
    else if (rulename.equalsIgnoreCase("tag")) rule = Rule_tag.parse(context);
    else if (rulename.equalsIgnoreCase("crypto-suite")) rule = Rule_crypto_suite.parse(context);
    else if (rulename.equalsIgnoreCase("key-params")) rule = Rule_key_params.parse(context);
    else if (rulename.equalsIgnoreCase("key-param")) rule = Rule_key_param.parse(context);
    else if (rulename.equalsIgnoreCase("key-method")) rule = Rule_key_method.parse(context);
    else if (rulename.equalsIgnoreCase("key-method-ext")) rule = Rule_key_method_ext.parse(context);
    else if (rulename.equalsIgnoreCase("key-info")) rule = Rule_key_info.parse(context);
    else if (rulename.equalsIgnoreCase("session-param")) rule = Rule_session_param.parse(context);
    else if (rulename.equalsIgnoreCase("mid-attr")) rule = Rule_mid_attr.parse(context);
    else if (rulename.equalsIgnoreCase("identification-tag")) rule = Rule_identification_tag.parse(context);
    else if (rulename.equalsIgnoreCase("group-attr")) rule = Rule_group_attr.parse(context);
    else if (rulename.equalsIgnoreCase("group-semantics")) rule = Rule_group_semantics.parse(context);
    else if (rulename.equalsIgnoreCase("ssrc-attr")) rule = Rule_ssrc_attr.parse(context);
    else if (rulename.equalsIgnoreCase("ssrc-id")) rule = Rule_ssrc_id.parse(context);
    else if (rulename.equalsIgnoreCase("ssrc-group-attr")) rule = Rule_ssrc_group_attr.parse(context);
    else if (rulename.equalsIgnoreCase("ssrc-group-semantics")) rule = Rule_ssrc_group_semantics.parse(context);
    else if (rulename.equalsIgnoreCase("cname-attr")) rule = Rule_cname_attr.parse(context);
    else if (rulename.equalsIgnoreCase("cname")) rule = Rule_cname.parse(context);
    else if (rulename.equalsIgnoreCase("previous-ssrc-attr")) rule = Rule_previous_ssrc_attr.parse(context);
    else if (rulename.equalsIgnoreCase("rtpmap-attr")) rule = Rule_rtpmap_attr.parse(context);
    else if (rulename.equalsIgnoreCase("name")) rule = Rule_name.parse(context);
    else if (rulename.equalsIgnoreCase("rate")) rule = Rule_rate.parse(context);
    else if (rulename.equalsIgnoreCase("parameters")) rule = Rule_parameters.parse(context);
    else if (rulename.equalsIgnoreCase("fmtp-attr")) rule = Rule_fmtp_attr.parse(context);
    else if (rulename.equalsIgnoreCase("param-list")) rule = Rule_param_list.parse(context);
    else if (rulename.equalsIgnoreCase("media-descriptions")) rule = Rule_media_descriptions.parse(context);
    else if (rulename.equalsIgnoreCase("media-description")) rule = Rule_media_description.parse(context);
    else if (rulename.equalsIgnoreCase("media-field")) rule = Rule_media_field.parse(context);
    else if (rulename.equalsIgnoreCase("username")) rule = Rule_username.parse(context);
    else if (rulename.equalsIgnoreCase("sess-id")) rule = Rule_sess_id.parse(context);
    else if (rulename.equalsIgnoreCase("sess-version")) rule = Rule_sess_version.parse(context);
    else if (rulename.equalsIgnoreCase("nettype")) rule = Rule_nettype.parse(context);
    else if (rulename.equalsIgnoreCase("addrtype")) rule = Rule_addrtype.parse(context);
    else if (rulename.equalsIgnoreCase("email-address")) rule = Rule_email_address.parse(context);
    else if (rulename.equalsIgnoreCase("address-and-comment")) rule = Rule_address_and_comment.parse(context);
    else if (rulename.equalsIgnoreCase("dispname-and-address")) rule = Rule_dispname_and_address.parse(context);
    else if (rulename.equalsIgnoreCase("phone-number")) rule = Rule_phone_number.parse(context);
    else if (rulename.equalsIgnoreCase("phone")) rule = Rule_phone.parse(context);
    else if (rulename.equalsIgnoreCase("connection-address")) rule = Rule_connection_address.parse(context);
    else if (rulename.equalsIgnoreCase("unicast-address")) rule = Rule_unicast_address.parse(context);
    else if (rulename.equalsIgnoreCase("bwtype")) rule = Rule_bwtype.parse(context);
    else if (rulename.equalsIgnoreCase("bandwidth")) rule = Rule_bandwidth.parse(context);
    else if (rulename.equalsIgnoreCase("start-time")) rule = Rule_start_time.parse(context);
    else if (rulename.equalsIgnoreCase("stop-time")) rule = Rule_stop_time.parse(context);
    else if (rulename.equalsIgnoreCase("time")) rule = Rule_time.parse(context);
    else if (rulename.equalsIgnoreCase("repeat-interval")) rule = Rule_repeat_interval.parse(context);
    else if (rulename.equalsIgnoreCase("typed-time")) rule = Rule_typed_time.parse(context);
    else if (rulename.equalsIgnoreCase("fixed-len-time-unit")) rule = Rule_fixed_len_time_unit.parse(context);
    else if (rulename.equalsIgnoreCase("key-type")) rule = Rule_key_type.parse(context);
    else if (rulename.equalsIgnoreCase("prompt-key-type")) rule = Rule_prompt_key_type.parse(context);
    else if (rulename.equalsIgnoreCase("clear-key-type")) rule = Rule_clear_key_type.parse(context);
    else if (rulename.equalsIgnoreCase("base64-key-type")) rule = Rule_base64_key_type.parse(context);
    else if (rulename.equalsIgnoreCase("uri-key-type")) rule = Rule_uri_key_type.parse(context);
    else if (rulename.equalsIgnoreCase("base64")) rule = Rule_base64.parse(context);
    else if (rulename.equalsIgnoreCase("base64-unit")) rule = Rule_base64_unit.parse(context);
    else if (rulename.equalsIgnoreCase("base64-pad")) rule = Rule_base64_pad.parse(context);
    else if (rulename.equalsIgnoreCase("base64-char")) rule = Rule_base64_char.parse(context);
    else if (rulename.equalsIgnoreCase("attribute")) rule = Rule_attribute.parse(context);
    else if (rulename.equalsIgnoreCase("att-field")) rule = Rule_att_field.parse(context);
    else if (rulename.equalsIgnoreCase("att-value")) rule = Rule_att_value.parse(context);
    else if (rulename.equalsIgnoreCase("media")) rule = Rule_media.parse(context);
    else if (rulename.equalsIgnoreCase("fmt")) rule = Rule_fmt.parse(context);
    else if (rulename.equalsIgnoreCase("proto")) rule = Rule_proto.parse(context);
    else if (rulename.equalsIgnoreCase("port")) rule = Rule_port.parse(context);
    else if (rulename.equalsIgnoreCase("number-of-ports")) rule = Rule_number_of_ports.parse(context);
    else if (rulename.equalsIgnoreCase("IP4-multicast")) rule = Rule_IP4_multicast.parse(context);
    else if (rulename.equalsIgnoreCase("m1")) rule = Rule_m1.parse(context);
    else if (rulename.equalsIgnoreCase("IP6-multicast")) rule = Rule_IP6_multicast.parse(context);
    else if (rulename.equalsIgnoreCase("ttl")) rule = Rule_ttl.parse(context);
    else if (rulename.equalsIgnoreCase("FQDN")) rule = Rule_FQDN.parse(context);
    else if (rulename.equalsIgnoreCase("email-safe")) rule = Rule_email_safe.parse(context);
    else if (rulename.equalsIgnoreCase("URI")) rule = Rule_URI.parse(context);
    else if (rulename.equalsIgnoreCase("hier-part")) rule = Rule_hier_part.parse(context);
    else if (rulename.equalsIgnoreCase("URI-reference")) rule = Rule_URI_reference.parse(context);
    else if (rulename.equalsIgnoreCase("absolute-URI")) rule = Rule_absolute_URI.parse(context);
    else if (rulename.equalsIgnoreCase("relative-ref")) rule = Rule_relative_ref.parse(context);
    else if (rulename.equalsIgnoreCase("relative-part")) rule = Rule_relative_part.parse(context);
    else if (rulename.equalsIgnoreCase("scheme")) rule = Rule_scheme.parse(context);
    else if (rulename.equalsIgnoreCase("authority")) rule = Rule_authority.parse(context);
    else if (rulename.equalsIgnoreCase("userinfo")) rule = Rule_userinfo.parse(context);
    else if (rulename.equalsIgnoreCase("host")) rule = Rule_host.parse(context);
    else if (rulename.equalsIgnoreCase("IP-literal")) rule = Rule_IP_literal.parse(context);
    else if (rulename.equalsIgnoreCase("IPvFuture")) rule = Rule_IPvFuture.parse(context);
    else if (rulename.equalsIgnoreCase("IPv6address")) rule = Rule_IPv6address.parse(context);
    else if (rulename.equalsIgnoreCase("h16")) rule = Rule_h16.parse(context);
    else if (rulename.equalsIgnoreCase("ls32")) rule = Rule_ls32.parse(context);
    else if (rulename.equalsIgnoreCase("IPv4address")) rule = Rule_IPv4address.parse(context);
    else if (rulename.equalsIgnoreCase("dec-octet")) rule = Rule_dec_octet.parse(context);
    else if (rulename.equalsIgnoreCase("reg-name")) rule = Rule_reg_name.parse(context);
    else if (rulename.equalsIgnoreCase("path")) rule = Rule_path.parse(context);
    else if (rulename.equalsIgnoreCase("path-abempty")) rule = Rule_path_abempty.parse(context);
    else if (rulename.equalsIgnoreCase("path-absolute")) rule = Rule_path_absolute.parse(context);
    else if (rulename.equalsIgnoreCase("path-noscheme")) rule = Rule_path_noscheme.parse(context);
    else if (rulename.equalsIgnoreCase("path-rootless")) rule = Rule_path_rootless.parse(context);
    else if (rulename.equalsIgnoreCase("path-empty")) rule = Rule_path_empty.parse(context);
    else if (rulename.equalsIgnoreCase("segment")) rule = Rule_segment.parse(context);
    else if (rulename.equalsIgnoreCase("segment-nz")) rule = Rule_segment_nz.parse(context);
    else if (rulename.equalsIgnoreCase("segment-nz-nc")) rule = Rule_segment_nz_nc.parse(context);
    else if (rulename.equalsIgnoreCase("pchar")) rule = Rule_pchar.parse(context);
    else if (rulename.equalsIgnoreCase("query")) rule = Rule_query.parse(context);
    else if (rulename.equalsIgnoreCase("fragment")) rule = Rule_fragment.parse(context);
    else if (rulename.equalsIgnoreCase("pct-encoded")) rule = Rule_pct_encoded.parse(context);
    else if (rulename.equalsIgnoreCase("unreserved")) rule = Rule_unreserved.parse(context);
    else if (rulename.equalsIgnoreCase("reserved")) rule = Rule_reserved.parse(context);
    else if (rulename.equalsIgnoreCase("gen-delims")) rule = Rule_gen_delims.parse(context);
    else if (rulename.equalsIgnoreCase("sub-delims")) rule = Rule_sub_delims.parse(context);
    else if (rulename.equalsIgnoreCase("addr-spec")) rule = Rule_addr_spec.parse(context);
    else if (rulename.equalsIgnoreCase("local-part")) rule = Rule_local_part.parse(context);
    else if (rulename.equalsIgnoreCase("domain")) rule = Rule_domain.parse(context);
    else if (rulename.equalsIgnoreCase("domain-literal")) rule = Rule_domain_literal.parse(context);
    else if (rulename.equalsIgnoreCase("dcontent")) rule = Rule_dcontent.parse(context);
    else if (rulename.equalsIgnoreCase("dtext")) rule = Rule_dtext.parse(context);
    else if (rulename.equalsIgnoreCase("NO-WS-CTL")) rule = Rule_NO_WS_CTL.parse(context);
    else if (rulename.equalsIgnoreCase("quoted-pair")) rule = Rule_quoted_pair.parse(context);
    else if (rulename.equalsIgnoreCase("text")) rule = Rule_text.parse(context);
    else if (rulename.equalsIgnoreCase("FWS")) rule = Rule_FWS.parse(context);
    else if (rulename.equalsIgnoreCase("comment")) rule = Rule_comment.parse(context);
    else if (rulename.equalsIgnoreCase("ccontent")) rule = Rule_ccontent.parse(context);
    else if (rulename.equalsIgnoreCase("ctext")) rule = Rule_ctext.parse(context);
    else if (rulename.equalsIgnoreCase("dot-atom")) rule = Rule_dot_atom.parse(context);
    else if (rulename.equalsIgnoreCase("dot-atom-text")) rule = Rule_dot_atom_text.parse(context);
    else if (rulename.equalsIgnoreCase("atext")) rule = Rule_atext.parse(context);
    else if (rulename.equalsIgnoreCase("integer")) rule = Rule_integer.parse(context);
    else if (rulename.equalsIgnoreCase("alpha-numeric")) rule = Rule_alpha_numeric.parse(context);
    else if (rulename.equalsIgnoreCase("decimal-uchar")) rule = Rule_decimal_uchar.parse(context);
    else if (rulename.equalsIgnoreCase("decimal-uchar-1xx")) rule = Rule_decimal_uchar_1xx.parse(context);
    else if (rulename.equalsIgnoreCase("decimal-uchar-2xx")) rule = Rule_decimal_uchar_2xx.parse(context);
    else if (rulename.equalsIgnoreCase("decimal-uchar-25x")) rule = Rule_decimal_uchar_25x.parse(context);
    else if (rulename.equalsIgnoreCase("BIT")) rule = Rule_BIT.parse(context);
    else if (rulename.equalsIgnoreCase("CHAR")) rule = Rule_CHAR.parse(context);
    else if (rulename.equalsIgnoreCase("CR")) rule = Rule_CR.parse(context);
    else if (rulename.equalsIgnoreCase("CTL")) rule = Rule_CTL.parse(context);
    else if (rulename.equalsIgnoreCase("HEXDIG")) rule = Rule_HEXDIG.parse(context);
    else if (rulename.equalsIgnoreCase("HTAB")) rule = Rule_HTAB.parse(context);
    else if (rulename.equalsIgnoreCase("LF")) rule = Rule_LF.parse(context);
    else if (rulename.equalsIgnoreCase("LWSP")) rule = Rule_LWSP.parse(context);
    else if (rulename.equalsIgnoreCase("OCTET")) rule = Rule_OCTET.parse(context);
    else if (rulename.equalsIgnoreCase("SP")) rule = Rule_SP.parse(context);
    else if (rulename.equalsIgnoreCase("VCHAR")) rule = Rule_VCHAR.parse(context);
    else if (rulename.equalsIgnoreCase("quoted-string")) rule = Rule_quoted_string.parse(context);
    else if (rulename.equalsIgnoreCase("qcontent")) rule = Rule_qcontent.parse(context);
    else if (rulename.equalsIgnoreCase("qtext")) rule = Rule_qtext.parse(context);
    else if (rulename.equalsIgnoreCase("obs-local-part")) rule = Rule_obs_local_part.parse(context);
    else if (rulename.equalsIgnoreCase("obs-domain")) rule = Rule_obs_domain.parse(context);
    else if (rulename.equalsIgnoreCase("obs-FWS")) rule = Rule_obs_FWS.parse(context);
    else if (rulename.equalsIgnoreCase("obs-qp")) rule = Rule_obs_qp.parse(context);
    else if (rulename.equalsIgnoreCase("obs-text")) rule = Rule_obs_text.parse(context);
    else if (rulename.equalsIgnoreCase("obs-char")) rule = Rule_obs_char.parse(context);
    else if (rulename.equalsIgnoreCase("CFWS")) rule = Rule_CFWS.parse(context);
    else if (rulename.equalsIgnoreCase("WSP")) rule = Rule_WSP.parse(context);
    else if (rulename.equalsIgnoreCase("atom")) rule = Rule_atom.parse(context);
    else if (rulename.equalsIgnoreCase("word")) rule = Rule_word.parse(context);
    else if (rulename.equalsIgnoreCase("extn-addr")) rule = Rule_extn_addr.parse(context);
    else if (rulename.equalsIgnoreCase("non-ws-string")) rule = Rule_non_ws_string.parse(context);
    else if (rulename.equalsIgnoreCase("byte-string")) rule = Rule_byte_string.parse(context);
    else if (rulename.equalsIgnoreCase("CRLF")) rule = Rule_CRLF.parse(context);
    else if (rulename.equalsIgnoreCase("token")) rule = Rule_token.parse(context);
    else if (rulename.equalsIgnoreCase("ALPHA")) rule = Rule_ALPHA.parse(context);
    else if (rulename.equalsIgnoreCase("DIGIT")) rule = Rule_DIGIT.parse(context);
    else if (rulename.equalsIgnoreCase("POS-DIGIT")) rule = Rule_POS_DIGIT.parse(context);
    else if (rulename.equalsIgnoreCase("DQUOTE")) rule = Rule_DQUOTE.parse(context);
    else if (rulename.equalsIgnoreCase("EQUALS")) rule = Rule_EQUALS.parse(context);
    else throw new IllegalArgumentException("unknown rule");

    if (rule == null)
    {
      throw new ParserException(
        "rule \"" + (String)context.getErrorStack().peek() + "\" failed",
        context.text,
        context.getErrorIndex(),
        context.getErrorStack());
    }

    if (context.text.length() > context.index)
    {
      ParserException primaryError = 
        new ParserException(
          "extra data found",
          context.text,
          context.index,
          new Stack<String>());

      if (context.getErrorIndex() > context.index)
      {
        ParserException secondaryError = 
          new ParserException(
            "rule \"" + (String)context.getErrorStack().peek() + "\" failed",
            context.text,
            context.getErrorIndex(),
            context.getErrorStack());

        primaryError.initCause(secondaryError);
      }

      throw primaryError;
    }

    return rule;
  }

  static private Rule parse(String rulename, InputStream in, boolean trace)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    if (rulename == null)
      throw new IllegalArgumentException("null rulename");
    if (in == null)
      throw new IllegalArgumentException("null input stream");

    int ch = 0;
    StringBuffer out = new StringBuffer();
    while ((ch = in.read()) != -1)
      out.append((char)ch);

    return parse(rulename, out.toString(), trace);
  }

  static private Rule parse(String rulename, File file, boolean trace)
  throws IllegalArgumentException,
         IOException,
         ParserException
  {
    if (rulename == null)
      throw new IllegalArgumentException("null rulename");
    if (file == null)
      throw new IllegalArgumentException("null file");

    BufferedReader in = new BufferedReader(new FileReader(file));
    int ch = 0;
    StringBuffer out = new StringBuffer();
    while ((ch = in.read()) != -1)
      out.append((char)ch);

    in.close();

    return parse(rulename, out.toString(), trace);
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
