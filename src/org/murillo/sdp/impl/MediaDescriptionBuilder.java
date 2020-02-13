/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.murillo.sdp.impl;


import org.murillo.abnf.Rule_bandwidth_field;
import org.murillo.abnf.Rule_connection_field;
import org.murillo.abnf.Rule_information_field;
import org.murillo.abnf.Rule_key_field;
import org.murillo.abnf.Rule_media_description;
import org.murillo.abnf.Rule_attribute_field;
import org.murillo.abnf.Rule_proto;
import org.murillo.abnf.Rule_port;
import org.murillo.abnf.Rule_number_of_ports;
import org.murillo.abnf.Rule_fmt;
import org.murillo.abnf.Rule_media;
import org.murillo.sdp.Attribute;
import org.murillo.sdp.Bandwidth;
import org.murillo.sdp.Connection;
import org.murillo.sdp.Information;
import org.murillo.sdp.Key;
import org.murillo.sdp.MediaDescription;
/**
 *
 * @author Sergio
 */
class MediaDescriptionBuilder extends  Builder {

    public MediaDescription media;

    @Override
    public Object visit(Rule_media_description rule) {
        //New object
        media = new MediaDescription();
        //Parse it
        super.visit(rule);
        //return media
        return media;
    }

    @Override
    public Object visit(Rule_port rule) {
        //Get port
        Integer port = Integer.parseInt(rule.toString());
        //Set it
        media.setPort(port);
        //Return it
        return port;
    }

    @Override
    public Object visit(Rule_number_of_ports rule) {
        //Get port
        Integer number = Integer.parseInt(rule.toString());
        //Set it
        media.setNumberOfPorts(number);
        //Return it
        return number;
    }

    @Override
    public Object visit(Rule_proto rule) {
        //Get protocol
        String proto = rule.toString();
        //Set it
        media.setProtoString(proto);
        //Return it
        return proto;
    }

    @Override
    public Object visit(Rule_media rule) {
        //Get media
        String name = rule.toString();
        //Set it
        media.setMedia(name);
        //Return it
        return name;
    }

    @Override
    public Object visit(Rule_fmt rule) {
        //Get protocol
        String fmt = rule.toString();
        //Set it
        media.addFormat(fmt);
        //Return it
        return fmt;
    }

    @Override
    public Object visit(Rule_key_field rule) {
        //Create builder
        KeyBuilder builder = new KeyBuilder();
        //Generate it
        Key key = (Key)builder.visit(rule);
        //Add it
        media.setKey(key);
        //Return it
        return key;
    }

    @Override
    public Object visit(Rule_connection_field rule) {
        //Create builder
        ConnectionBuilder builder = new ConnectionBuilder();
        //Parse it
        Connection connection = (Connection)builder.visit(rule);
        //Set it
        media.addConnection(connection);
        //Return connection
        return connection;
    }

    @Override
    public Object visit(Rule_bandwidth_field rule) {
        //Create builder
        BandwitdhBuilder builder = new BandwitdhBuilder();
        //Generate it
        Bandwidth bandwidth = (Bandwidth)builder.visit(rule);
        //Add it
        media.addBandwidth(bandwidth);
        //Return it
        return bandwidth;
    }

    @Override
    public Object visit(Rule_information_field rule) {
        //Create new session name
        InformationBuilder builder = new InformationBuilder();
        //Generate
        Information info = (Information) builder.visit(rule);
        //Set it
        media.setInformation(info);
        //Return it
        return info;
    }

    @Override
    public Object visit(Rule_attribute_field rule) {
        //Create new session name
        AttributeBuilder builder = new AttributeBuilder();
        //Generate
        Attribute attr = (Attribute) builder.visit(rule);
        //Set it
        media.addAttribute(attr);
        //Return it
        return attr;
    }
}
