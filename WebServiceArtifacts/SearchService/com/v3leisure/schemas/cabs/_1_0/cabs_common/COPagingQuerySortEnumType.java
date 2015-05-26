
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CO_PagingQuerySortEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CO_PagingQuerySortEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Short Name Ascending"/>
 *     &lt;enumeration value="Short Name Descending"/>
 *     &lt;enumeration value="Full Name Ascending"/>
 *     &lt;enumeration value="Full Name Descending"/>
 *     &lt;enumeration value="Random"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CO_PagingQuerySortEnumType")
@XmlEnum
public enum COPagingQuerySortEnumType {

    @XmlEnumValue("Short Name Ascending")
    SHORT_NAME_ASCENDING("Short Name Ascending"),
    @XmlEnumValue("Short Name Descending")
    SHORT_NAME_DESCENDING("Short Name Descending"),
    @XmlEnumValue("Full Name Ascending")
    FULL_NAME_ASCENDING("Full Name Ascending"),
    @XmlEnumValue("Full Name Descending")
    FULL_NAME_DESCENDING("Full Name Descending"),
    @XmlEnumValue("Random")
    RANDOM("Random");
    private final String value;

    COPagingQuerySortEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COPagingQuerySortEnumType fromValue(String v) {
        for (COPagingQuerySortEnumType c: COPagingQuerySortEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
