
package com.ukmail.services.contracts.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreDeliveryNotificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PreDeliveryNotificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NonRequired"/>
 *     &lt;enumeration value="Telephone"/>
 *     &lt;enumeration value="Email"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreDeliveryNotificationType")
@XmlEnum
public enum PreDeliveryNotificationType {

    @XmlEnumValue("NonRequired")
    NON_REQUIRED("NonRequired"),
    @XmlEnumValue("Telephone")
    TELEPHONE("Telephone"),
    @XmlEnumValue("Email")
    EMAIL("Email");
    private final String value;

    PreDeliveryNotificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreDeliveryNotificationType fromValue(String v) {
        for (PreDeliveryNotificationType c: PreDeliveryNotificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
