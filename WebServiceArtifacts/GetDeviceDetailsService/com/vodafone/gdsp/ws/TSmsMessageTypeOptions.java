
package com.vodafone.gdsp.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tSmsMessageTypeOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tSmsMessageTypeOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Binary"/>
 *     &lt;enumeration value="Unicode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tSmsMessageTypeOptions")
@XmlEnum
public enum TSmsMessageTypeOptions {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Binary")
    BINARY("Binary"),
    @XmlEnumValue("Unicode")
    UNICODE("Unicode");
    private final String value;

    TSmsMessageTypeOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TSmsMessageTypeOptions fromValue(String v) {
        for (TSmsMessageTypeOptions c: TSmsMessageTypeOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
