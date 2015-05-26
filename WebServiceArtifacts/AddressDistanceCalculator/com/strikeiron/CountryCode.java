
package com.strikeiron;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="CA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CountryCode")
@XmlEnum
public enum CountryCode {

    US,
    CA;

    public String value() {
        return name();
    }

    public static CountryCode fromValue(String v) {
        return valueOf(v);
    }

}
