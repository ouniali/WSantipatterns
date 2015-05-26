
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BackupOptionTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BackupOptionTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Option1"/>
 *     &lt;enumeration value="Option2"/>
 *     &lt;enumeration value="Option3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BackupOptionTypes")
@XmlEnum
public enum BackupOptionTypes {

    @XmlEnumValue("Option1")
    OPTION_1("Option1"),
    @XmlEnumValue("Option2")
    OPTION_2("Option2"),
    @XmlEnumValue("Option3")
    OPTION_3("Option3");
    private final String value;

    BackupOptionTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BackupOptionTypes fromValue(String v) {
        for (BackupOptionTypes c: BackupOptionTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
