
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeItineraryOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeItineraryOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoFare"/>
 *     &lt;enumeration value="NoAmount"/>
 *     &lt;enumeration value="SequenceNumber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeItineraryOption")
@XmlEnum
public enum TypeItineraryOption {

    @XmlEnumValue("NoFare")
    NO_FARE("NoFare"),
    @XmlEnumValue("NoAmount")
    NO_AMOUNT("NoAmount"),
    @XmlEnumValue("SequenceNumber")
    SEQUENCE_NUMBER("SequenceNumber");
    private final String value;

    TypeItineraryOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeItineraryOption fromValue(String v) {
        for (TypeItineraryOption c: TypeItineraryOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
