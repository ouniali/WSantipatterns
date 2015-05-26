
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeMCOFeeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeMCOFeeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CURRENTLY"/>
 *     &lt;enumeration value="UNDEFINED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeMCOFeeType")
@XmlEnum
public enum TypeMCOFeeType {

    CURRENTLY,
    UNDEFINED;

    public String value() {
        return name();
    }

    public static TypeMCOFeeType fromValue(String v) {
        return valueOf(v);
    }

}
