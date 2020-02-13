/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.abnf.Rule_candidate_attribute;
import org.murillo.abnf.Rule_foundation;
import org.murillo.abnf.Rule_component_id;
import org.murillo.abnf.Rule_transport;
import org.murillo.abnf.Rule_priority;
import org.murillo.abnf.Rule_candidate_types;
import org.murillo.abnf.Rule_rel_addr;
import org.murillo.abnf.Rule_rel_port;
import org.murillo.abnf.Rule_extension_att;
import org.murillo.abnf.Rule_extension_att_name;
import org.murillo.abnf.Rule_extension_att_value;
import org.murillo.abnf.Rule_connection_address;
import org.murillo.abnf.Rule_port;

import org.murillo.sdp.CandidateAttribute;
/**
 *
 * @author Sergio
 */
class CandidateAttributeBuilder extends Builder {

    private CandidateAttribute candidate;
    private CandidateAttribute.Extension extension;

    @Override
    public Object visit(Rule_candidate_attribute rule) {
        //New attr
        candidate = new CandidateAttribute();
        //Generate it
        super.visit(rule);
        //Return it
        return candidate;
    }

   @Override
    public Object visit(Rule_foundation rule) {
        //Get value
        String value = rule.toString();
        //Set type
        candidate.setFundation(value);
        //Return it
        return value;
    }

    @Override
    public Object visit(Rule_component_id rule) {
        //Get type
        Integer value = Integer.parseInt(rule.toString());
        //Set type
        candidate.setComponentId(value);
        //Return it
        return value;
    }

    @Override
    public Object visit(Rule_transport rule) {
        //Get value
        String value = rule.toString();
        //Set type
        candidate.setTransport(value);
        //Return it
        return value;
    }

    @Override
    public Object visit(Rule_priority rule) {
        //Get type
        Integer value = Integer.parseInt(rule.toString());
        //Set type
        candidate.setPriority(value);
        //Return it
        return value;
    }
    
    @Override
    public Object visit(Rule_connection_address rule) {
        //Get value
        String value = rule.toString();
        //Set type
        candidate.setAddress(value);
        //Return it
        return value;
    }

    @Override
    public Object visit(Rule_port rule) {
         //Get type
        Integer value = Integer.parseInt(rule.toString());
        //Set type
        candidate.setPort(value);
        //Return it
        return value;
    }

    @Override
    public Object visit(Rule_candidate_types rule) {
        //Get value
        String value = rule.toString();
        //Set type
        candidate.setType(value);
        //Return it
        return value;
    }

    @Override
    public Object visit(Rule_rel_addr rule) {
        //Get value
        String value = rule.toString();
        //Set type
        candidate.setRelAddr(value);
        //Return it
        return value;
    }

    @Override
    public Object visit(Rule_rel_port rule) {
        //Get type
        Integer value = Integer.parseInt(rule.toString());
        //Set type
        candidate.setRelPort(value);
        //Return it
        return value;
    }

    @Override
    public Object visit(Rule_extension_att rule) {
        //New attr
        extension = new CandidateAttribute.Extension();
        //Generate it
        super.visit(rule);
        //Add it
        candidate.addExtension(extension);
        //Return it
        return extension;
    }

    @Override
    public Object visit(Rule_extension_att_name rule) {
        //Get value
        String value = rule.toString();
        //Set type
        extension.setName(value);
        //Return it
        return value;
    }

    @Override
    public Object visit(Rule_extension_att_value rule) {
        //Get value
        String value = rule.toString();
        //Set type
        extension.setValue(value);
        //Return it
        return value;
    }
}
