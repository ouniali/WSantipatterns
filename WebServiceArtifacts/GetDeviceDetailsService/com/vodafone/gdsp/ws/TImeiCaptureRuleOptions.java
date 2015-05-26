
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tImeiCaptureRuleOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tImeiCaptureRuleOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tImeiCaptureRuleOptions")
@XmlEnum
public enum TImeiCaptureRuleOptions {


    /**
     * Auto detect on first ever IMSI use
     * 
     */
    F,

    /**
     * Auto detect on first use in Active.Live state
     * 
     */
    L,

    /**
     * Manually configured
     * 
     */
    E;

    public String value() {
        return name();
    }

    public static TImeiCaptureRuleOptions fromValue(String v) {
        return valueOf(v);
    }

}
