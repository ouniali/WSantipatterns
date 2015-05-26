
package com.familytreemaker.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Self"/>
 *     &lt;enumeration value="Parent"/>
 *     &lt;enumeration value="Father"/>
 *     &lt;enumeration value="Mother"/>
 *     &lt;enumeration value="Spouse"/>
 *     &lt;enumeration value="Husband"/>
 *     &lt;enumeration value="Wife"/>
 *     &lt;enumeration value="Child"/>
 *     &lt;enumeration value="Son"/>
 *     &lt;enumeration value="Daughter"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleType")
@XmlEnum
public enum RoleType {

    @XmlEnumValue("Self")
    SELF("Self"),
    @XmlEnumValue("Parent")
    PARENT("Parent"),
    @XmlEnumValue("Father")
    FATHER("Father"),
    @XmlEnumValue("Mother")
    MOTHER("Mother"),
    @XmlEnumValue("Spouse")
    SPOUSE("Spouse"),
    @XmlEnumValue("Husband")
    HUSBAND("Husband"),
    @XmlEnumValue("Wife")
    WIFE("Wife"),
    @XmlEnumValue("Child")
    CHILD("Child"),
    @XmlEnumValue("Son")
    SON("Son"),
    @XmlEnumValue("Daughter")
    DAUGHTER("Daughter"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RoleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleType fromValue(String v) {
        for (RoleType c: RoleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
