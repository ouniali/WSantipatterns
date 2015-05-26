
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentRelatedTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstrumentRelatedTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Securities"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InstrumentRelatedTypes")
@XmlEnum
public enum InstrumentRelatedTypes {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Securities")
    SECURITIES("Securities");
    private final String value;

    InstrumentRelatedTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstrumentRelatedTypes fromValue(String v) {
        for (InstrumentRelatedTypes c: InstrumentRelatedTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
