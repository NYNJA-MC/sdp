/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.sdp.ExtMapAttribute;
import org.murillo.abnf.Rule_extmap_attribute;
import org.murillo.abnf.Rule_direction;
import org.murillo.abnf.Rule_extension_identifier;
import org.murillo.abnf.Rule_extension_name;
import org.murillo.abnf.Rule_extension_attributes;

/**
 *
 * @author Sergio
 */
public class ExtMapAttributeBuilder extends Builder {

    ExtMapAttribute extmap;

    @Override
    public Object visit(Rule_extmap_attribute rule) {
        //New attr
        extmap = new ExtMapAttribute();
        //Generate it
        super.visit(rule);
        //Return it
        return extmap;
    }

   @Override
    public Object visit(Rule_direction rule) {
        //Get value
        String value = rule.toString();
        //Set type
        extmap.setDirection(value);
        //Return it
        return value;
    }

    @Override
    public Object visit(Rule_extension_identifier rule) {
        //Get type
        Integer value = Integer.parseInt(rule.toString());
        //Set type
        extmap.setId(value);
        //Return it
        return value;
    }

    @Override
    public Object visit(Rule_extension_name rule) {
        //Get value
        String value = rule.toString();
        //Set type
        extmap.setName(value);
        //Return it
        return value;
    }

    @Override
    public Object visit(Rule_extension_attributes rule) {
        //Get value
        String value = rule.toString();
        //Set type
        extmap.setAttributes(value);
        //Return it
        return value;
    }
}
