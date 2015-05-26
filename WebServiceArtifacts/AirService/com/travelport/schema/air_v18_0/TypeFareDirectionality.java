
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeFareDirectionality.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeFareDirectionality">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Outbound"/>
 *     &lt;enumeration value="Return"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeFareDirectionality")
@XmlEnum
public enum TypeFareDirectionality {

    @XmlEnumValue("Outbound")
    OUTBOUND("Outbound"),
    @XmlEnumValue("Return")
    RETURN("Return"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    TypeFareDirectionality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeFareDirectionality fromValue(String v) {
        for (TypeFareDirectionality c: TypeFareDirectionality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
