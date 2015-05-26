
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO_BookabilityEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CO_BookabilityEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Book_Online"/>
 *     &lt;enumeration value="Content_Only"/>
 *     &lt;enumeration value="Any"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CO_BookabilityEnumType")
@XmlEnum
public enum COBookabilityEnumType {

    @XmlEnumValue("Book_Online")
    BOOK_ONLINE("Book_Online"),
    @XmlEnumValue("Content_Only")
    CONTENT_ONLY("Content_Only"),
    @XmlEnumValue("Any")
    ANY("Any");
    private final String value;

    COBookabilityEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COBookabilityEnumType fromValue(String v) {
        for (COBookabilityEnumType c: COBookabilityEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
