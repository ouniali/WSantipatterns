
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tTriggerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tTriggerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="CSD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tTriggerType")
@XmlEnum
public enum TTriggerType {

    SMS,

    /**
     * Note: CSD is not supported in this release
     * 
     */
    CSD;

    public String value() {
        return name();
    }

    public static TTriggerType fromValue(String v) {
        return valueOf(v);
    }

}
