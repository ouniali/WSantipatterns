
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgressiveTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgressiveTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Amount"/>
 *     &lt;enumeration value="Percent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgressiveTypes")
@XmlEnum
public enum ProgressiveTypes {

    @XmlEnumValue("Amount")
    AMOUNT("Amount"),
    @XmlEnumValue("Percent")
    PERCENT("Percent");
    private final String value;

    ProgressiveTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProgressiveTypes fromValue(String v) {
        for (ProgressiveTypes c: ProgressiveTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
