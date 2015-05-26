
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tImeiMatchRuleOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tImeiMatchRuleOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="F"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tImeiMatchRuleOptions")
@XmlEnum
public enum TImeiMatchRuleOptions {


    /**
     * No IMEI Checking
     * 
     */
    N,

    /**
     * Match TAC
     * 
     */
    T,

    /**
     * Match IMEI
     * 
     */
    F;

    public String value() {
        return name();
    }

    public static TImeiMatchRuleOptions fromValue(String v) {
        return valueOf(v);
    }

}
