
package com.addressdoctor.validator2.addbatch.batch;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineSeparatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineSeparatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LST_LF"/>
 *     &lt;enumeration value="LST_SEMICOLON"/>
 *     &lt;enumeration value="LST_COMMA"/>
 *     &lt;enumeration value="LST_TAB"/>
 *     &lt;enumeration value="LST_NO_SEPARATOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineSeparatorType")
@XmlEnum
public enum LineSeparatorType {

    LST_LF,
    LST_SEMICOLON,
    LST_COMMA,
    LST_TAB,
    LST_NO_SEPARATOR;

    public String value() {
        return name();
    }

    public static LineSeparatorType fromValue(String v) {
        return valueOf(v);
    }

}
