
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="Subscribed"/>
 *     &lt;enumeration value="Unregistered"/>
 *     &lt;enumeration value="NeverRegistered"/>
 *     &lt;enumeration value="AlreadyRegistered"/>
 *     &lt;enumeration value="Undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusTypes")
@XmlEnum
public enum StatusTypes {

    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("Subscribed")
    SUBSCRIBED("Subscribed"),
    @XmlEnumValue("Unregistered")
    UNREGISTERED("Unregistered"),
    @XmlEnumValue("NeverRegistered")
    NEVER_REGISTERED("NeverRegistered"),
    @XmlEnumValue("AlreadyRegistered")
    ALREADY_REGISTERED("AlreadyRegistered"),
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined");
    private final String value;

    StatusTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusTypes fromValue(String v) {
        for (StatusTypes c: StatusTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
