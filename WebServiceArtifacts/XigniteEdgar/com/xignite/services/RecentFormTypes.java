
package com.xignite.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecentFormTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecentFormTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Form10K"/>
 *     &lt;enumeration value="Form10Q"/>
 *     &lt;enumeration value="Form14"/>
 *     &lt;enumeration value="Form485"/>
 *     &lt;enumeration value="Form8K"/>
 *     &lt;enumeration value="FormS8"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecentFormTypes")
@XmlEnum
public enum RecentFormTypes {

    @XmlEnumValue("Form10K")
    FORM_10_K("Form10K"),
    @XmlEnumValue("Form10Q")
    FORM_10_Q("Form10Q"),
    @XmlEnumValue("Form14")
    FORM_14("Form14"),
    @XmlEnumValue("Form485")
    FORM_485("Form485"),
    @XmlEnumValue("Form8K")
    FORM_8_K("Form8K"),
    @XmlEnumValue("FormS8")
    FORM_S_8("FormS8"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    RecentFormTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecentFormTypes fromValue(String v) {
        for (RecentFormTypes c: RecentFormTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
