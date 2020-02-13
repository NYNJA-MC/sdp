/* -----------------------------------------------------------------------------
 * XmlDisplayer.java
 * -----------------------------------------------------------------------------
 *
 * Producer : com.parse2.aparse.Parser 2.5
 * Produced : Thu Feb 13 17:50:21 EET 2020
 *
 * -----------------------------------------------------------------------------
 */

package org.murillo.abnf;

import java.util.ArrayList;

public class XmlDisplayer implements Visitor
{
  private boolean terminal = true;

  public Object visit(Rule_session_description rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<session-description>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</session-description>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_proto_version rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<proto-version>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</proto-version>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_origin_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<origin-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</origin-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_session_name_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<session-name-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</session-name-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_information_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<information-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</information-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_uri_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<uri-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</uri-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_email_fields rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<email-fields>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</email-fields>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_email_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<email-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</email-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_phone_fields rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<phone-fields>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</phone-fields>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_phone_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<phone-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</phone-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_connection_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<connection-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</connection-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_bandwidth_fields rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<bandwidth-fields>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</bandwidth-fields>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_bandwidth_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<bandwidth-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</bandwidth-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_time_fields rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<time-fields>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</time-fields>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_time_repeat_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<time-repeat-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</time-repeat-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_time_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<time-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</time-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_repeat_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<repeat-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</repeat-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_zone_adjustments rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<zone-adjustments>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</zone-adjustments>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_key_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_attribute_fields rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<attribute-fields>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</attribute-fields>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_attribute_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<attribute-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</attribute-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_gen_attribute rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<gen-attribute>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</gen-attribute>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_sctpmap_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<sctpmap-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</sctpmap-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_sctpmap_number rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<sctpmap-number>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</sctpmap-number>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_app rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<app>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</app>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_streams rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<streams>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</streams>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_fingerprint_attribute rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fingerprint-attribute>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fingerprint-attribute>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_hash_func rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<hash-func>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</hash-func>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_fingerprint rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fingerprint>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fingerprint>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_extmap_attribute rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<extmap-attribute>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</extmap-attribute>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_extension_identifier rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<extension-identifier>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</extension-identifier>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_extension_name rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<extension-name>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</extension-name>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_direction rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<direction>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</direction>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_extension_attributes rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<extension-attributes>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</extension-attributes>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_candidate_attribute rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<candidate-attribute>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</candidate-attribute>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_foundation rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<foundation>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</foundation>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_component_id rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<component-id>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</component-id>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_transport rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<transport>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</transport>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_transport_extension rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<transport-extension>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</transport-extension>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_priority rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<priority>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</priority>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cand_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cand-type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cand-type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_candidate_types rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<candidate-types>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</candidate-types>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_rel_addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<rel-addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</rel-addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_rel_port rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<rel-port>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</rel-port>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_extension_att rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<extension-att>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</extension-att>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_extension_att_name rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<extension-att-name>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</extension-att-name>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_extension_att_value rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<extension-att-value>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</extension-att-value>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_ice_char rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ice-char>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ice-char>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_crypto_attribute rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<crypto-attribute>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</crypto-attribute>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_tag rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<tag>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</tag>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_crypto_suite rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<crypto-suite>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</crypto-suite>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_key_params rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-params>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-params>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_key_param rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-param>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-param>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_key_method rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-method>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-method>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_key_method_ext rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-method-ext>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-method-ext>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_key_info rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-info>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-info>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_session_param rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<session-param>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</session-param>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_mid_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<mid-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</mid-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_identification_tag rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<identification-tag>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</identification-tag>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_group_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<group-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</group-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_group_semantics rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<group-semantics>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</group-semantics>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_ssrc_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ssrc-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ssrc-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_ssrc_id rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ssrc-id>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ssrc-id>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_ssrc_group_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ssrc-group-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ssrc-group-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_ssrc_group_semantics rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ssrc-group-semantics>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ssrc-group-semantics>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cname_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cname-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cname-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_cname rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<cname>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</cname>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_previous_ssrc_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<previous-ssrc-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</previous-ssrc-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_rtpmap_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<rtpmap-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</rtpmap-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_name rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<name>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</name>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_rate rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<rate>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</rate>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_parameters rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<parameters>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</parameters>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_fmtp_attr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fmtp-attr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fmtp-attr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_param_list rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<param-list>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</param-list>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_media_descriptions rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<media-descriptions>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</media-descriptions>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_media_description rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<media-description>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</media-description>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_media_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<media-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</media-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_username rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<username>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</username>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_sess_id rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<sess-id>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</sess-id>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_sess_version rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<sess-version>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</sess-version>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_nettype rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<nettype>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</nettype>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_addrtype rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<addrtype>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</addrtype>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_email_address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<email-address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</email-address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_address_and_comment rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<address-and-comment>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</address-and-comment>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dispname_and_address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dispname-and-address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dispname-and-address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_phone_number rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<phone-number>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</phone-number>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_phone rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<phone>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</phone>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_connection_address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<connection-address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</connection-address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_unicast_address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<unicast-address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</unicast-address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_bwtype rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<bwtype>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</bwtype>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_bandwidth rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<bandwidth>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</bandwidth>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_start_time rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<start-time>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</start-time>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_stop_time rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<stop-time>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</stop-time>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_time rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<time>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</time>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_repeat_interval rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<repeat-interval>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</repeat-interval>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_typed_time rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<typed-time>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</typed-time>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_fixed_len_time_unit rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fixed-len-time-unit>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fixed-len-time-unit>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_key_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<key-type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</key-type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_prompt_key_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<prompt-key-type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</prompt-key-type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_clear_key_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<clear-key-type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</clear-key-type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_base64_key_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<base64-key-type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</base64-key-type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_uri_key_type rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<uri-key-type>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</uri-key-type>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_base64 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<base64>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</base64>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_base64_unit rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<base64-unit>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</base64-unit>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_base64_pad rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<base64-pad>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</base64-pad>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_base64_char rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<base64-char>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</base64-char>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_attribute rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<attribute>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</attribute>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_att_field rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<att-field>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</att-field>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_att_value rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<att-value>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</att-value>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_media rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<media>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</media>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_fmt rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fmt>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fmt>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_proto rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<proto>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</proto>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_port rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<port>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</port>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_number_of_ports rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<number-of-ports>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</number-of-ports>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_IP4_multicast rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IP4-multicast>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IP4-multicast>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_m1 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<m1>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</m1>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_IP6_multicast rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IP6-multicast>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IP6-multicast>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_ttl rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ttl>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ttl>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_FQDN rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<FQDN>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</FQDN>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_email_safe rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<email-safe>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</email-safe>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_URI rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<URI>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</URI>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_hier_part rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<hier-part>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</hier-part>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_URI_reference rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<URI-reference>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</URI-reference>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_absolute_URI rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<absolute-URI>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</absolute-URI>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_relative_ref rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<relative-ref>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</relative-ref>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_relative_part rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<relative-part>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</relative-part>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_scheme rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<scheme>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</scheme>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_authority rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<authority>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</authority>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_userinfo rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<userinfo>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</userinfo>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_host rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<host>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</host>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_IP_literal rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IP-literal>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IP-literal>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_IPvFuture rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IPvFuture>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IPvFuture>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_IPv6address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IPv6address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IPv6address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_h16 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<h16>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</h16>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_ls32 rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ls32>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ls32>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_IPv4address rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<IPv4address>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</IPv4address>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dec_octet rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dec-octet>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dec-octet>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_reg_name rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<reg-name>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</reg-name>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_path rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<path>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</path>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_path_abempty rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<path-abempty>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</path-abempty>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_path_absolute rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<path-absolute>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</path-absolute>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_path_noscheme rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<path-noscheme>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</path-noscheme>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_path_rootless rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<path-rootless>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</path-rootless>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_path_empty rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<path-empty>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</path-empty>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_segment rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<segment>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</segment>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_segment_nz rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<segment-nz>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</segment-nz>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_segment_nz_nc rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<segment-nz-nc>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</segment-nz-nc>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_pchar rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<pchar>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</pchar>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_query rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<query>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</query>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_fragment rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<fragment>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</fragment>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_pct_encoded rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<pct-encoded>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</pct-encoded>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_unreserved rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<unreserved>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</unreserved>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_reserved rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<reserved>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</reserved>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_gen_delims rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<gen-delims>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</gen-delims>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_sub_delims rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<sub-delims>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</sub-delims>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_addr_spec rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<addr-spec>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</addr-spec>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_local_part rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<local-part>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</local-part>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_domain rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<domain>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</domain>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_domain_literal rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<domain-literal>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</domain-literal>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dcontent rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dcontent>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dcontent>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dtext rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dtext>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dtext>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_NO_WS_CTL rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<NO-WS-CTL>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</NO-WS-CTL>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_quoted_pair rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<quoted-pair>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</quoted-pair>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_text rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<text>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</text>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_FWS rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<FWS>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</FWS>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_comment rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<comment>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</comment>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_ccontent rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ccontent>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ccontent>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_ctext rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ctext>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ctext>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dot_atom rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dot-atom>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dot-atom>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_dot_atom_text rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<dot-atom-text>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</dot-atom-text>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_atext rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<atext>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</atext>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_integer rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<integer>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</integer>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_alpha_numeric rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<alpha-numeric>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</alpha-numeric>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_decimal_uchar rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<decimal-uchar>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</decimal-uchar>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_decimal_uchar_1xx rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<decimal-uchar-1xx>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</decimal-uchar-1xx>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_decimal_uchar_2xx rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<decimal-uchar-2xx>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</decimal-uchar-2xx>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_decimal_uchar_25x rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<decimal-uchar-25x>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</decimal-uchar-25x>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_BIT rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<BIT>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</BIT>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_CHAR rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CHAR>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CHAR>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_CR rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CR>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CR>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_CTL rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CTL>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CTL>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_HEXDIG rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<HEXDIG>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</HEXDIG>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_HTAB rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<HTAB>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</HTAB>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_LF rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<LF>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</LF>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_LWSP rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<LWSP>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</LWSP>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_OCTET rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<OCTET>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</OCTET>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_SP rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<SP>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</SP>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_VCHAR rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<VCHAR>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</VCHAR>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_quoted_string rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<quoted-string>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</quoted-string>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_qcontent rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<qcontent>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</qcontent>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_qtext rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<qtext>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</qtext>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_obs_local_part rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<obs-local-part>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</obs-local-part>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_obs_domain rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<obs-domain>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</obs-domain>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_obs_FWS rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<obs-FWS>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</obs-FWS>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_obs_qp rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<obs-qp>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</obs-qp>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_obs_text rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<obs-text>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</obs-text>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_obs_char rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<obs-char>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</obs-char>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_CFWS rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CFWS>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CFWS>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_WSP rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<WSP>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</WSP>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_atom rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<atom>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</atom>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_word rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<word>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</word>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_extn_addr rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<extn-addr>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</extn-addr>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_non_ws_string rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<non-ws-string>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</non-ws-string>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_byte_string rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<byte-string>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</byte-string>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_CRLF rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<CRLF>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</CRLF>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_token rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<token>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</token>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_ALPHA rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<ALPHA>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</ALPHA>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_DIGIT rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<DIGIT>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</DIGIT>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_POS_DIGIT rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<POS-DIGIT>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</POS-DIGIT>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_DQUOTE rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<DQUOTE>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</DQUOTE>");
    terminal = false;
    return null;
  }

  public Object visit(Rule_EQUALS rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<EQUALS>");
    terminal = false;
    visitRules(rule.rules);
    if (!terminal) System.out.println();
    System.out.print("</EQUALS>");
    terminal = false;
    return null;
  }

  public Object visit(org.murillo.abnf.precomp.CRLF rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<org.murillo.abnf.precomp.CRLF>");
    System.out.print(rule.spelling);
    System.out.print("</org.murillo.abnf.precomp.CRLF>");
    terminal = false;
    return null;
  }

  public Object visit(org.murillo.abnf.precomp.Token rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<org.murillo.abnf.precomp.Token>");
    System.out.print(rule.spelling);
    System.out.print("</org.murillo.abnf.precomp.Token>");
    terminal = false;
    return null;
  }

  public Object visit(org.murillo.abnf.precomp.ALPHA rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<org.murillo.abnf.precomp.ALPHA>");
    System.out.print(rule.spelling);
    System.out.print("</org.murillo.abnf.precomp.ALPHA>");
    terminal = false;
    return null;
  }

  public Object visit(org.murillo.abnf.precomp.ByteString rule)
  {
    if (!terminal) System.out.println();
    System.out.print("<org.murillo.abnf.precomp.ByteString>");
    System.out.print(rule.spelling);
    System.out.print("</org.murillo.abnf.precomp.ByteString>");
    terminal = false;
    return null;
  }

  public Object visit(Terminal_StringValue value)
  {
    System.out.print(value.spelling);
    terminal = true;
    return null;
  }

  public Object visit(Terminal_NumericValue value)
  {
    System.out.print(value.spelling);
    terminal = true;
    return null;
  }

  private Boolean visitRules(ArrayList<Rule> rules)
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
