
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalEntryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalEntryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Breakfast"/>
 *     &lt;enumeration value="Lunch"/>
 *     &lt;enumeration value="Dinner"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdditionalEntryType")
@XmlEnum
public enum AdditionalEntryType {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Breakfast")
    BREAKFAST("Breakfast"),
    @XmlEnumValue("Lunch")
    LUNCH("Lunch"),
    @XmlEnumValue("Dinner")
    DINNER("Dinner");
    private final String value;

    AdditionalEntryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdditionalEntryType fromValue(String v) {
        for (AdditionalEntryType c: AdditionalEntryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
