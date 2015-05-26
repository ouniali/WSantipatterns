
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tAccessRightsOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tAccessRightsOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="W"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tAccessRightsOptions")
@XmlEnum
public enum TAccessRightsOptions {


    /**
     * Read only
     * 
     */
    R,

    /**
     * Read/Write
     * 
     */
    W,

    /**
     * Read/Write/Delete
     * 
     */
    D,

    /**
     * Administrative-Read/Write/Delete/Maintain users
     * 
     */
    S;

    public String value() {
        return name();
    }

    public static TAccessRightsOptions fromValue(String v) {
        return valueOf(v);
    }

}
