
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tImeiDeviceActionOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tImeiDeviceActionOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="L"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tImeiDeviceActionOptions")
@XmlEnum
public enum TImeiDeviceActionOptions {


    /**
     * No action
     * 
     */
    N,

    /**
     * Tear down device session
     * 
     */
    T,

    /**
     * Tear down device session and suspend SIM
     * 
     */
    L;

    public String value() {
        return name();
    }

    public static TImeiDeviceActionOptions fromValue(String v) {
        return valueOf(v);
    }

}
