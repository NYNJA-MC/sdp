/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.abnf.Rule_rtpmap_attr;
import org.murillo.abnf.Rule_fmt;
import org.murillo.abnf.Rule_name;
import org.murillo.abnf.Rule_rate;
import org.murillo.abnf.Rule_parameters;
import org.murillo.sdp.RTPMapAttribute;

/**
 *
 * @author Sergio
 */
public class RTPMapAttributeBuilder extends Builder {
    private RTPMapAttribute attr;

    @Override
    public Object visit(Rule_rtpmap_attr rule) {
        //New attr
        attr = new RTPMapAttribute();
        //Generate it
        super.visit(rule);
        //Return it
        return attr;
    }

    @Override
    public Object visit(Rule_fmt rule) {
        //Get type
        Integer fmt = Integer.parseInt(rule.toString());
        //Set type
        attr.setFormat(fmt);
        //Return it
        return fmt;
    }

    @Override
    public Object visit(Rule_name rule) {
        //Get type
        String name = rule.toString();
        //Set type
        attr.setName(name);
        //Return it
        return name;
    }

    @Override
    public Object visit(Rule_rate rule) {
        //Get type
        Integer rate = Integer.parseInt(rule.toString());
        //Set type
        attr.setRate(rate);
        //Return it
        return rate;
    }

    @Override
    public Object visit(Rule_parameters rule) {
        //Get type
        String parameters = rule.toString();
        //Set type
        attr.setParameters(parameters);
        //Return it
        return parameters;
    }
}
