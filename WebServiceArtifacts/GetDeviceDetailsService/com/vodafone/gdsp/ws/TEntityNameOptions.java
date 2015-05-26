
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tEntityNameOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tEntityNameOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CUSTOMER"/>
 *     &lt;enumeration value="CUSTOMERSERVICEPROFILE"/>
 *     &lt;enumeration value="DEVICE"/>
 *     &lt;enumeration value="USER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tEntityNameOptions")
@XmlEnum
public enum TEntityNameOptions {

    CUSTOMER,
    CUSTOMERSERVICEPROFILE,
    DEVICE,
    USER;

    public String value() {
        return name();
    }

    public static TEntityNameOptions fromValue(String v) {
        return valueOf(v);
    }

}
