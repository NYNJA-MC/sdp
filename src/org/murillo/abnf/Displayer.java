/* -----------------------------------------------------------------------------
 * Displayer.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Thu Feb 13 17:50:21 EET 2020
 *
 * -----------------------------------------------------------------------------
 */

package org.murillo.abnf;

import java.util.ArrayList;

public class Displayer implements Visitor
{

  public Object visit(Rule_session_description rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_proto_version rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_origin_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_session_name_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_information_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_uri_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_email_fields rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_email_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_phone_fields rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_phone_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_connection_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_bandwidth_fields rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_bandwidth_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_time_fields rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_time_repeat_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_time_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_repeat_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_zone_adjustments rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_key_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_attribute_fields rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_attribute_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_gen_attribute rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_sctpmap_attr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_sctpmap_number rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_app rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_streams rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_fingerprint_attribute rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_hash_func rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_fingerprint rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_extmap_attribute rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_extension_identifier rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_extension_name rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_direction rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_extension_attributes rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_candidate_attribute rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_foundation rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_component_id rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_transport rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_transport_extension rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_priority rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cand_type rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_candidate_types rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_rel_addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_rel_port rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_extension_att rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_extension_att_name rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_extension_att_value rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_ice_char rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_crypto_attribute rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_tag rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_crypto_suite rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_key_params rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_key_param rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_key_method rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_key_method_ext rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_key_info rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_session_param rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_mid_attr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_identification_tag rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_group_attr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_group_semantics rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_ssrc_attr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_ssrc_id rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_ssrc_group_attr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_ssrc_group_semantics rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cname_attr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_cname rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_previous_ssrc_attr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_rtpmap_attr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_name rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_rate rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_parameters rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_fmtp_attr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_param_list rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_media_descriptions rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_media_description rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_media_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_username rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_sess_id rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_sess_version rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_nettype rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_addrtype rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_email_address rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_address_and_comment rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dispname_and_address rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_phone_number rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_phone rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_connection_address rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_unicast_address rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_bwtype rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_bandwidth rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_start_time rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_stop_time rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_time rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_repeat_interval rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_typed_time rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_fixed_len_time_unit rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_key_type rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_prompt_key_type rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_clear_key_type rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_base64_key_type rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_uri_key_type rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_base64 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_base64_unit rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_base64_pad rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_base64_char rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_attribute rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_att_field rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_att_value rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_media rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_fmt rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_proto rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_port rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_number_of_ports rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_IP4_multicast rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_m1 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_IP6_multicast rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_ttl rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_FQDN rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_email_safe rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_URI rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_hier_part rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_URI_reference rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_absolute_URI rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_relative_ref rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_relative_part rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_scheme rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_authority rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_userinfo rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_host rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_IP_literal rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_IPvFuture rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_IPv6address rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_h16 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_ls32 rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_IPv4address rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dec_octet rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_reg_name rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_path rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_path_abempty rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_path_absolute rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_path_noscheme rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_path_rootless rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_path_empty rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_segment rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_segment_nz rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_segment_nz_nc rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_pchar rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_query rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_fragment rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_pct_encoded rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_unreserved rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_reserved rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_gen_delims rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_sub_delims rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_addr_spec rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_local_part rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_domain rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_domain_literal rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dcontent rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dtext rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_NO_WS_CTL rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_quoted_pair rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_text rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_FWS rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_comment rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_ccontent rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_ctext rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dot_atom rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_dot_atom_text rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_atext rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_integer rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_alpha_numeric rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_decimal_uchar rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_decimal_uchar_1xx rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_decimal_uchar_2xx rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_decimal_uchar_25x rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_BIT rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_CHAR rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_CR rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_CTL rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_HEXDIG rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_HTAB rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_LF rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_LWSP rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_OCTET rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_SP rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_VCHAR rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_quoted_string rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_qcontent rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_qtext rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_obs_local_part rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_obs_domain rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_obs_FWS rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_obs_qp rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_obs_text rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_obs_char rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_CFWS rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_WSP rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_atom rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_word rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_extn_addr rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_non_ws_string rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_byte_string rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_CRLF rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_token rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_ALPHA rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_DIGIT rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_POS_DIGIT rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_DQUOTE rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(Rule_EQUALS rule)
  {
    return visitRules(rule.rules);
  }

  public Object visit(org.murillo.abnf.precomp.CRLF rule)
  {
    System.out.print(rule.spelling);
    return null;
  }

  public Object visit(org.murillo.abnf.precomp.Token rule)
  {
    System.out.print(rule.spelling);
    return null;
  }

  public Object visit(org.murillo.abnf.precomp.ALPHA rule)
  {
    System.out.print(rule.spelling);
    return null;
  }

  public Object visit(org.murillo.abnf.precomp.ByteString rule)
  {
    System.out.print(rule.spelling);
    return null;
  }

  public Object visit(Terminal_StringValue value)
  {
    System.out.print(value.spelling);
    return null;
  }

  public Object visit(Terminal_NumericValue value)
  {
    System.out.print(value.spelling);
    return null;
  }

  private Object visitRules(ArrayList<Rule> rules)
  {
    for (Rule rule : rules)
      rule.accept(this);
    return null;
  }
}

/* -----------------------------------------------------------------------------
 * eof
 * -----------------------------------------------------------------------------
 */
