
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Incoming"/>
 *     &lt;enumeration value="Outgoing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeDirection")
@XmlEnum
public enum TypeDirection {

    @XmlEnumValue("Incoming")
    INCOMING("Incoming"),
    @XmlEnumValue("Outgoing")
    OUTGOING("Outgoing");
    private final String value;

    TypeDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDirection fromValue(String v) {
        for (TypeDirection c: TypeDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
