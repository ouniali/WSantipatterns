
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="Img"/>
 *     &lt;enumeration value="XML"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileTypes")
@XmlEnum
public enum FileTypes {

    @XmlEnumValue("Text")
    TEXT("Text"),
    HTML("HTML"),
    @XmlEnumValue("Img")
    IMG("Img"),
    XML("XML"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    FileTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileTypes fromValue(String v) {
        for (FileTypes c: FileTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
