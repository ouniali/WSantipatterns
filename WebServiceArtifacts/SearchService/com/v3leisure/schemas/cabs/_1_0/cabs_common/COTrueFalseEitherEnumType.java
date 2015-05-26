
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO_TrueFalseEitherEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CO_TrueFalseEitherEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="True"/>
 *     &lt;enumeration value="False"/>
 *     &lt;enumeration value="Either"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CO_TrueFalseEitherEnumType")
@XmlEnum
public enum COTrueFalseEitherEnumType {

    @XmlEnumValue("True")
    TRUE("True"),
    @XmlEnumValue("False")
    FALSE("False"),
    @XmlEnumValue("Either")
    EITHER("Either");
    private final String value;

    COTrueFalseEitherEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COTrueFalseEitherEnumType fromValue(String v) {
        for (COTrueFalseEitherEnumType c: COTrueFalseEitherEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
