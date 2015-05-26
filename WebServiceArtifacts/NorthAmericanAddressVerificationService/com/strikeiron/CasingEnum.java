
package com.strikeiron;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CasingEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CasingEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UPPER"/>
 *     &lt;enumeration value="LOWER"/>
 *     &lt;enumeration value="PROPER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CasingEnum")
@XmlEnum
public enum CasingEnum {

    UPPER,
    LOWER,
    PROPER;

    public String value() {
        return name();
    }

    public static CasingEnum fromValue(String v) {
        return valueOf(v);
    }

}
