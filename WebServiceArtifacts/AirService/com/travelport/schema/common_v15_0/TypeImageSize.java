
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeImageSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeImageSize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeImageSize")
@XmlEnum
public enum TypeImageSize {

    T,
    I,
    S,
    M,
    L,
    E;

    public String value() {
        return name();
    }

    public static TypeImageSize fromValue(String v) {
        return valueOf(v);
    }

}
