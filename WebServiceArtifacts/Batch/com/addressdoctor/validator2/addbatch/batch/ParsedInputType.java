
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParsedInputType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParsedInputType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEVER"/>
 *     &lt;enumeration value="ONLY_FOR_P"/>
 *     &lt;enumeration value="ONLY_PARSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParsedInputType")
@XmlEnum
public enum ParsedInputType {

    NEVER,
    ONLY_FOR_P,
    ONLY_PARSED;

    public String value() {
        return name();
    }

    public static ParsedInputType fromValue(String v) {
        return valueOf(v);
    }

}
