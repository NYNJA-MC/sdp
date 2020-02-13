/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.sdp.Connection;
import org.murillo.abnf.Rule_connection_field;
import org.murillo.abnf.Rule_addrtype;
import org.murillo.abnf.Rule_nettype;
import org.murillo.abnf.Rule_connection_address;
/**
 *
 * @author Sergio
 */
class ConnectionBuilder extends Builder {

    private Connection conn;

    @Override
    public Object visit(Rule_connection_field rule) {
        //Create object
        conn = new Connection();
        //Generate
        visitRules(rule.rules);
        //Return it
        return conn;
    }

    
    @Override
    public Object visit(Rule_nettype rule) {
        //Generate
        String nettype = rule.toString();
        //Set it
        conn.setNetType(nettype);
        //Return it
        return nettype;
    }

    @Override
    public Object visit(Rule_addrtype rule) {
        //Generate
        String addrtype = rule.toString();
        //Set
        conn.setAddrType(addrtype);
        //Return it
        return addrtype;
    }

    @Override
    public Object visit(Rule_connection_address rule) {
        //Generate
        String address = rule.toString();
        //Set it
        conn.setAddress(address);
        //Return it
        return address;
    }

}
