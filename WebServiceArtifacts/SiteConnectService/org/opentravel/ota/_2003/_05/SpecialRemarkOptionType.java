
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialRemarkOptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialRemarkOptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Itinerary"/>
 *     &lt;enumeration value="Invoice"/>
 *     &lt;enumeration value="Endorsement"/>
 *     &lt;enumeration value="Save"/>
 *     &lt;enumeration value="Confidential"/>
 *     &lt;enumeration value="Free"/>
 *     &lt;enumeration value="GRMS"/>
 *     &lt;enumeration value="Split"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpecialRemarkOptionType")
@XmlEnum
public enum SpecialRemarkOptionType {

    @XmlEnumValue("Itinerary")
    ITINERARY("Itinerary"),
    @XmlEnumValue("Invoice")
    INVOICE("Invoice"),
    @XmlEnumValue("Endorsement")
    ENDORSEMENT("Endorsement"),
    @XmlEnumValue("Save")
    SAVE("Save"),
    @XmlEnumValue("Confidential")
    CONFIDENTIAL("Confidential"),
    @XmlEnumValue("Free")
    FREE("Free"),
    GRMS("GRMS"),
    @XmlEnumValue("Split")
    SPLIT("Split");
    private final String value;

    SpecialRemarkOptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialRemarkOptionType fromValue(String v) {
        for (SpecialRemarkOptionType c: SpecialRemarkOptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
