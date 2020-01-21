/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Sergio
 */
public class SSRCGroupAttribute implements Attribute {

    private String semantics;
    private ArrayList<Long> SSRCIds;

    public SSRCGroupAttribute() {
	SSRCIds = new ArrayList<Long>();
    }

    public SSRCGroupAttribute(String semantics) {
        this.semantics = semantics;
	SSRCIds = new ArrayList<Long>();
    }
    
    public SSRCGroupAttribute(String semantics, List<Long> ssrcs) {
        this.semantics = semantics;
	this.SSRCIds = new ArrayList<Long>(ssrcs);
    }
    
    @Override
    public SSRCGroupAttribute clone() {
	    return new SSRCGroupAttribute(semantics, SSRCIds);
    }
  

    @Override
    public String toString() {
        //Get value
        String value = getValue();
        //Generic attr
        return "a="+ getField() + (value!=null ? ":" + value : "") + "\r\n";
    }

    @Override
    public String getField() {
        return "ssrc-group";
    }

    @Override
    public String getValue() {
        String value = semantics;
        for (Long id : SSRCIds)
            value += " " + id;
        return value;
    }

    public ArrayList<Long> getSSRCIds() {
        return SSRCIds;
    }

    public void setSSRCIds(ArrayList<Long> SSRCIds) {
        this.SSRCIds = SSRCIds;
    }
    
   public void addSSRCId(Long ssrcId) {
       SSRCIds.add(ssrcId);
   }

    public String getSemantics() {
        return semantics;
    }

    public void setSemantics(String semantics) {
        this.semantics = semantics;
    }

    @Override
    public boolean equals(Object rhsObject) {
        if (!(rhsObject instanceof SSRCGroupAttribute)) {
            return false;
        }
        SSRCGroupAttribute rhs = (SSRCGroupAttribute)rhsObject;
        return
            Objects.equals(semantics, rhs.semantics)
            && Objects.equals(SSRCIds, rhs.SSRCIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(semantics, SSRCIds);
    }
}
