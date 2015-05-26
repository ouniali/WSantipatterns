
package com.bvdep.vlbapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchArea.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchArea">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Autor"/>
 *     &lt;enumeration value="Verlag"/>
 *     &lt;enumeration value="Schlagwort"/>
 *     &lt;enumeration value="Schlagwortkette"/>
 *     &lt;enumeration value="ISBN"/>
 *     &lt;enumeration value="Reihe"/>
 *     &lt;enumeration value="Titel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchArea")
@XmlEnum
public enum SearchArea {

    @XmlEnumValue("Autor")
    AUTOR("Autor"),
    @XmlEnumValue("Verlag")
    VERLAG("Verlag"),
    @XmlEnumValue("Schlagwort")
    SCHLAGWORT("Schlagwort"),
    @XmlEnumValue("Schlagwortkette")
    SCHLAGWORTKETTE("Schlagwortkette"),
    ISBN("ISBN"),
    @XmlEnumValue("Reihe")
    REIHE("Reihe"),
    @XmlEnumValue("Titel")
    TITEL("Titel");
    private final String value;

    SearchArea(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchArea fromValue(String v) {
        for (SearchArea c: SearchArea.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
