
package com.exactor.ns_impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alcohol"/>
 *     &lt;enumeration value="Computer"/>
 *     &lt;enumeration value="Construction"/>
 *     &lt;enumeration value="Food"/>
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Lease"/>
 *     &lt;enumeration value="Manufacturing"/>
 *     &lt;enumeration value="Restaurant"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Tobacco"/>
 *     &lt;enumeration value="Utility"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxItemType")
@XmlEnum
public enum TaxItemType {

    @XmlEnumValue("Alcohol")
    ALCOHOL("Alcohol"),
    @XmlEnumValue("Computer")
    COMPUTER("Computer"),
    @XmlEnumValue("Construction")
    CONSTRUCTION("Construction"),
    @XmlEnumValue("Food")
    FOOD("Food"),
    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Lease")
    LEASE("Lease"),
    @XmlEnumValue("Manufacturing")
    MANUFACTURING("Manufacturing"),
    @XmlEnumValue("Restaurant")
    RESTAURANT("Restaurant"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Tobacco")
    TOBACCO("Tobacco"),
    @XmlEnumValue("Utility")
    UTILITY("Utility");
    private final String value;

    TaxItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxItemType fromValue(String v) {
        for (TaxItemType c: TaxItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
