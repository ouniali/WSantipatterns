
package ro.platforma_broker.security;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InvalidUserNameOrPassword"/>
 *     &lt;enumeration value="InvalidUserNameFormat"/>
 *     &lt;enumeration value="InvalidBrokerCode"/>
 *     &lt;enumeration value="UserPasswordExpired"/>
 *     &lt;enumeration value="AdministratorPrivilegesRequired"/>
 *     &lt;enumeration value="GenericError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationStatus", namespace = "http://www.platforma-broker.ro/security")
@XmlEnum
public enum AuthenticationStatus {

    @XmlEnumValue("InvalidUserNameOrPassword")
    INVALID_USER_NAME_OR_PASSWORD("InvalidUserNameOrPassword"),
    @XmlEnumValue("InvalidUserNameFormat")
    INVALID_USER_NAME_FORMAT("InvalidUserNameFormat"),
    @XmlEnumValue("InvalidBrokerCode")
    INVALID_BROKER_CODE("InvalidBrokerCode"),
    @XmlEnumValue("UserPasswordExpired")
    USER_PASSWORD_EXPIRED("UserPasswordExpired"),
    @XmlEnumValue("AdministratorPrivilegesRequired")
    ADMINISTRATOR_PRIVILEGES_REQUIRED("AdministratorPrivilegesRequired"),
    @XmlEnumValue("GenericError")
    GENERIC_ERROR("GenericError");
    private final String value;

    AuthenticationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationStatus fromValue(String v) {
        for (AuthenticationStatus c: AuthenticationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
