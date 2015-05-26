
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tContactPurposeOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tContactPurposeOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ROGUE_USAGE_EMAIL"/>
 *     &lt;enumeration value="HIGH_USAGE_EMAIL"/>
 *     &lt;enumeration value="IMEI_CHANGE_EMAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tContactPurposeOptions")
@XmlEnum
public enum TContactPurposeOptions {


    /**
     * Contact to be used to email rogue usage alerts
     * 
     */
    ROGUE_USAGE_EMAIL,

    /**
     * Contact to be used to email high usage alerts
     * 
     */
    HIGH_USAGE_EMAIL,

    /**
     * Contact to be used to email IMEI changes
     * 
     */
    IMEI_CHANGE_EMAIL;

    public String value() {
        return name();
    }

    public static TContactPurposeOptions fromValue(String v) {
        return valueOf(v);
    }

}
