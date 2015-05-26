
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeReqSeat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeReqSeat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="Aisle"/>
 *     &lt;enumeration value="Bulkhead"/>
 *     &lt;enumeration value="Exit"/>
 *     &lt;enumeration value="Window"/>
 *     &lt;enumeration value="Middle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeReqSeat")
@XmlEnum
public enum TypeReqSeat {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Aisle")
    AISLE("Aisle"),
    @XmlEnumValue("Bulkhead")
    BULKHEAD("Bulkhead"),
    @XmlEnumValue("Exit")
    EXIT("Exit"),
    @XmlEnumValue("Window")
    WINDOW("Window"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle");
    private final String value;

    TypeReqSeat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeReqSeat fromValue(String v) {
        for (TypeReqSeat c: TypeReqSeat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
