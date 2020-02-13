/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;

import org.murillo.sdp.Time;
import org.murillo.abnf.Rule_time_repeat_field;
import org.murillo.abnf.Rule_start_time;
import org.murillo.abnf.Rule_stop_time;
/**
 *
 * @author Sergio
 */
public class TimeBuilder extends Builder{

    private Time time;

    @Override
    public Object visit(Rule_time_repeat_field rule) {
        //Create object
        time = new Time();
        //Generate it
        super.visit(rule);
        //Return it
        return time;
    }

    @Override
    public Object visit(Rule_start_time rule) {
        //Get start
        Integer start = Integer.parseInt(rule.toString());
        //Set start
        time.setStart(start);
        //Return it
        return start;
    }

    @Override
    public Object visit(Rule_stop_time rule) {
        //Get stop
        Integer stop = Integer.parseInt(rule.toString());
        //Set start
        time.setStop(stop);
        //Return it
        return stop;
    }
}
