
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReleaseSourceTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReleaseSourceTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="SEC"/>
 *     &lt;enumeration value="BusinessWire"/>
 *     &lt;enumeration value="PRNewsWire"/>
 *     &lt;enumeration value="MarketWire"/>
 *     &lt;enumeration value="CNW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReleaseSourceTypes")
@XmlEnum
public enum ReleaseSourceTypes {

    @XmlEnumValue("All")
    ALL("All"),
    SEC("SEC"),
    @XmlEnumValue("BusinessWire")
    BUSINESS_WIRE("BusinessWire"),
    @XmlEnumValue("PRNewsWire")
    PR_NEWS_WIRE("PRNewsWire"),
    @XmlEnumValue("MarketWire")
    MARKET_WIRE("MarketWire"),
    CNW("CNW");
    private final String value;

    ReleaseSourceTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReleaseSourceTypes fromValue(String v) {
        for (ReleaseSourceTypes c: ReleaseSourceTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
