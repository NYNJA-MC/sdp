/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.abnf.Rule_app;
import org.murillo.abnf.Rule_sctpmap_attr;
import org.murillo.abnf.Rule_sctpmap_number;
import org.murillo.abnf.Rule_streams;
import org.murillo.sdp.SCTPMapAttribute;
/**
 *
 * @author Sergio
 */
class SCTPMapAttributeBuilder extends Builder {

	private SCTPMapAttribute sctpmap;

	@Override
	public Object visit(Rule_sctpmap_attr rule) {
		 //New attr
		sctpmap = new SCTPMapAttribute();
		//Generate it
		super.visit(rule);
		//Return it
		return sctpmap;
	}

	@Override
	public Object visit(Rule_sctpmap_number rule) {
		 //Get number
		Integer value = Integer.parseInt(rule.toString());
		//Set type
		sctpmap.setNumber(value);
		//Return it
		return value;
	}

	@Override
	public Object visit(Rule_app rule) {
		 //Get app
		String value = rule.toString();
		//Set type
		sctpmap.setApp(value);
		//Return it
		return value;
	}


	@Override
	public Object visit(Rule_streams rule) {
		 //Get number
		Integer value = Integer.parseInt(rule.toString());
		//Set type
		sctpmap.setStreams(value);
		//Return it
		return value;
	}
    
}
