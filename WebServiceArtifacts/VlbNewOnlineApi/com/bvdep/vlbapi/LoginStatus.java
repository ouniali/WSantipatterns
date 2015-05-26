
package com.bvdep.vlbapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoginStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ok"/>
 *     &lt;enumeration value="BadLogin"/>
 *     &lt;enumeration value="UserInUse"/>
 *     &lt;enumeration value="Blocked"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="NotLoggedIn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoginStatus")
@XmlEnum
public enum LoginStatus {

    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("BadLogin")
    BAD_LOGIN("BadLogin"),
    @XmlEnumValue("UserInUse")
    USER_IN_USE("UserInUse"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("NotLoggedIn")
    NOT_LOGGED_IN("NotLoggedIn");
    private final String value;

    LoginStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoginStatus fromValue(String v) {
        for (LoginStatus c: LoginStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
