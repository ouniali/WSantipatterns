
package com.bvdep.vlbapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ranking"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Isbn"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="Author"/>
 *     &lt;enumeration value="Publisher"/>
 *     &lt;enumeration value="PublicationDate"/>
 *     &lt;enumeration value="Price"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortOrder")
@XmlEnum
public enum SortOrder {

    @XmlEnumValue("Ranking")
    RANKING("Ranking"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Isbn")
    ISBN("Isbn"),
    @XmlEnumValue("Title")
    TITLE("Title"),
    @XmlEnumValue("Author")
    AUTHOR("Author"),
    @XmlEnumValue("Publisher")
    PUBLISHER("Publisher"),
    @XmlEnumValue("PublicationDate")
    PUBLICATION_DATE("PublicationDate"),
    @XmlEnumValue("Price")
    PRICE("Price");
    private final String value;

    SortOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortOrder fromValue(String v) {
        for (SortOrder c: SortOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
