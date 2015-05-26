
package com.exactor.ns;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorityLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthorityLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="County"/>
 *     &lt;enumeration value="District"/>
 *     &lt;enumeration value="StateOrProvince"/>
 *     &lt;enumeration value="Country"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthorityLevelType")
@XmlEnum
public enum AuthorityLevelType {

    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("County")
    COUNTY("County"),
    @XmlEnumValue("District")
    DISTRICT("District"),
    @XmlEnumValue("StateOrProvince")
    STATE_OR_PROVINCE("StateOrProvince"),
    @XmlEnumValue("Country")
    COUNTRY("Country");
    private final String value;

    AuthorityLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthorityLevelType fromValue(String v) {
        for (AuthorityLevelType c: AuthorityLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
