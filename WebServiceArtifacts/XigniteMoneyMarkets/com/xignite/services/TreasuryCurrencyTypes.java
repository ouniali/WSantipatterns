
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TreasuryCurrencyTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TreasuryCurrencyTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TreasuryCurrencyTypes")
@XmlEnum
public enum TreasuryCurrencyTypes {

    USD;

    public String value() {
        return name();
    }

    public static TreasuryCurrencyTypes fromValue(String v) {
        return valueOf(v);
    }

}
