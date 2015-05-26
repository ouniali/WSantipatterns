
package com.travelport.schema.hotel_v17_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeAllImageSize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeAllImageSize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeAllImageSize")
@XmlEnum
public enum TypeAllImageSize {

    A;

    public String value() {
        return name();
    }

    public static TypeAllImageSize fromValue(String v) {
        return valueOf(v);
    }

}
