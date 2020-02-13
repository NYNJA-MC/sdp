/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.abnf.Rule_origin_field;
import org.murillo.abnf.Rule_addrtype;
import org.murillo.abnf.Rule_nettype;
import org.murillo.abnf.Rule_sess_id;
import org.murillo.abnf.Rule_sess_version;
import org.murillo.abnf.Rule_userinfo;
import org.murillo.abnf.Rule_username;
import org.murillo.abnf.Rule_unicast_address;
import org.murillo.sdp.Origin;

/**
 *
 * @author Sergio
 */
class OriginBuilder extends Builder {

    private Origin origin;

    @Override
    public Object visit(Rule_origin_field rule) {
        //Create object
        origin = new Origin();
        //Generate
        visitRules(rule.rules);
        //Return it
        return origin;
    }

    @Override
    public Object visit(Rule_username rule) {
        //Generate
        String username = rule.toString();
        //Set it
        origin.setUsername(username);
        //Return it
        return username;
    }

    @Override
    public Object visit(Rule_sess_id rule) {
        //Generate
        Long sessId = Long.parseLong(rule.toString());
        //Set it
        origin.setSessId(sessId);
        //Return it
        return sessId;
    }

    @Override
    public Object visit(Rule_sess_version rule) {
        //Generate
        Long sessVersion = Long.parseLong(rule.toString());
        //Sset it
        origin.setSessVersion(sessVersion);
        //Return it
        return sessVersion;
    }

    @Override
    public Object visit(Rule_nettype rule) {
        //Generate
        String nettype = rule.toString();
        //Set it
        origin.setNettype(nettype);
        //Return it
        return nettype;
    }

    @Override
    public Object visit(Rule_addrtype rule) {
        //Generate
        String addrtype = rule.toString();
        //Set
        origin.setAddrtype(addrtype);
        //Return it
        return addrtype;
    }

    @Override
    public Object visit(Rule_unicast_address rule) {
        //Generate
        String address = rule.toString();
        //Set it
        origin.setAddress(address);
        //Return it
        return address;
    }
}
