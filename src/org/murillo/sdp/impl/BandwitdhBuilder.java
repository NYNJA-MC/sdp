/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;
import  org.murillo.sdp.Bandwidth;
import  org.murillo.abnf.Rule_bandwidth;
import  org.murillo.abnf.Rule_bandwidth_field;
import  org.murillo.abnf.Rule_bwtype;

/**
 *
 * @author Sergio
 */
class BandwitdhBuilder extends Builder {

    private Bandwidth bandwidth;

    @Override
    public Object visit(Rule_bandwidth_field rule) {
        //Create object
        bandwidth = new Bandwidth();
        //Generate
        visitRules(rule.rules);
        //Return it
        return bandwidth;
    }


    @Override
    public Object visit(Rule_bandwidth rule) {
        //Generate
        String b = rule.toString();
        //Set it
        bandwidth.setBandwidth(b);
        //Return it
        return b;
    }

    @Override
    public Object visit(Rule_bwtype rule) {
        //Generate
        String type = rule.toString();
        //Set
        bandwidth.setType(type);;
        //Return it
        return type;
    }
}
