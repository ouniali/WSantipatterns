
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickUpDropOffType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PickUpDropOffType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Airport"/>
 *     &lt;enumeration value="Property"/>
 *     &lt;enumeration value="Resort"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PickUpDropOffType")
@XmlEnum
public enum PickUpDropOffType {

    @XmlEnumValue("Airport")
    AIRPORT("Airport"),
    @XmlEnumValue("Property")
    PROPERTY("Property"),
    @XmlEnumValue("Resort")
    RESORT("Resort");
    private final String value;

    PickUpDropOffType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PickUpDropOffType fromValue(String v) {
        for (PickUpDropOffType c: PickUpDropOffType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
