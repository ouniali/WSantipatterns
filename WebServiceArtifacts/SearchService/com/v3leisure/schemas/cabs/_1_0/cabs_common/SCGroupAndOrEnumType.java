
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_GroupAndOrEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SC_GroupAndOrEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="OR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SC_GroupAndOrEnumType")
@XmlEnum
public enum SCGroupAndOrEnumType {

    AND,
    OR;

    public String value() {
        return name();
    }

    public static SCGroupAndOrEnumType fromValue(String v) {
        return valueOf(v);
    }

}
