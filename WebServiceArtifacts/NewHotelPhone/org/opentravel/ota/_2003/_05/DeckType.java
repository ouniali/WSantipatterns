
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeckType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeckType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Regular-OneLevelOnly"/>
 *     &lt;enumeration value="LowerLevel"/>
 *     &lt;enumeration value="UpperLevel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeckType")
@XmlEnum
public enum DeckType {

    @XmlEnumValue("Regular-OneLevelOnly")
    REGULAR_ONE_LEVEL_ONLY("Regular-OneLevelOnly"),
    @XmlEnumValue("LowerLevel")
    LOWER_LEVEL("LowerLevel"),
    @XmlEnumValue("UpperLevel")
    UPPER_LEVEL("UpperLevel");
    private final String value;

    DeckType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeckType fromValue(String v) {
        for (DeckType c: DeckType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
