
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FormTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Schedule4"/>
 *     &lt;enumeration value="Schedule5"/>
 *     &lt;enumeration value="Schedule3"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FormTypes")
@XmlEnum
public enum FormTypes {

    @XmlEnumValue("Schedule4")
    SCHEDULE_4("Schedule4"),
    @XmlEnumValue("Schedule5")
    SCHEDULE_5("Schedule5"),
    @XmlEnumValue("Schedule3")
    SCHEDULE_3("Schedule3"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    FormTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FormTypes fromValue(String v) {
        for (FormTypes c: FormTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
