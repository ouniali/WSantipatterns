
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO_AvailReqType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CO_AvailReqType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Package"/>
 *     &lt;enumeration value="SpecialOffer"/>
 *     &lt;enumeration value="Any"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CO_AvailReqType")
@XmlEnum
public enum COAvailReqType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("SpecialOffer")
    SPECIAL_OFFER("SpecialOffer"),
    @XmlEnumValue("Any")
    ANY("Any");
    private final String value;

    COAvailReqType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COAvailReqType fromValue(String v) {
        for (COAvailReqType c: COAvailReqType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
