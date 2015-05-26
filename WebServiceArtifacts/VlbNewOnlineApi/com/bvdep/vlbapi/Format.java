
package com.bvdep.vlbapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Format.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Format">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ONIX_SHORT"/>
 *     &lt;enumeration value="ONIX_REF"/>
 *     &lt;enumeration value="SHORT"/>
 *     &lt;enumeration value="FULL"/>
 *     &lt;enumeration value="CUSTOM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Format")
@XmlEnum
public enum Format {

    ONIX_SHORT,
    ONIX_REF,
    SHORT,
    FULL,
    CUSTOM;

    public String value() {
        return name();
    }

    public static Format fromValue(String v) {
        return valueOf(v);
    }

}
