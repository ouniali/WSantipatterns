
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapitalizationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CapitalizationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_CHANGE"/>
 *     &lt;enumeration value="UPPER_CASE"/>
 *     &lt;enumeration value="LOWER_CASE"/>
 *     &lt;enumeration value="MIXED_CASE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CapitalizationType")
@XmlEnum
public enum CapitalizationType {

    NO_CHANGE,
    UPPER_CASE,
    LOWER_CASE,
    MIXED_CASE;

    public String value() {
        return name();
    }

    public static CapitalizationType fromValue(String v) {
        return valueOf(v);
    }

}
