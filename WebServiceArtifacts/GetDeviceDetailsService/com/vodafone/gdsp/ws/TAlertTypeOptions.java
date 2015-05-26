
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tAlertTypeOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tAlertTypeOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ROGUE_USAGE_ALERT"/>
 *     &lt;enumeration value="HIGH_USAGE_ALERT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tAlertTypeOptions")
@XmlEnum
public enum TAlertTypeOptions {


    /**
     * For rogue usage alerts
     * 
     */
    ROGUE_USAGE_ALERT,

    /**
     * For high usage alerts
     * 
     */
    HIGH_USAGE_ALERT;

    public String value() {
        return name();
    }

    public static TAlertTypeOptions fromValue(String v) {
        return valueOf(v);
    }

}
