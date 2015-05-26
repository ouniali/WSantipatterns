
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LastFormTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LastFormTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Form10Q"/>
 *     &lt;enumeration value="Form10K"/>
 *     &lt;enumeration value="Form14A"/>
 *     &lt;enumeration value="Form10X"/>
 *     &lt;enumeration value="Any"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LastFormTypes")
@XmlEnum
public enum LastFormTypes {

    @XmlEnumValue("Form10Q")
    FORM_10_Q("Form10Q"),
    @XmlEnumValue("Form10K")
    FORM_10_K("Form10K"),
    @XmlEnumValue("Form14A")
    FORM_14_A("Form14A"),
    @XmlEnumValue("Form10X")
    FORM_10_X("Form10X"),
    @XmlEnumValue("Any")
    ANY("Any");
    private final String value;

    LastFormTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LastFormTypes fromValue(String v) {
        for (LastFormTypes c: LastFormTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
