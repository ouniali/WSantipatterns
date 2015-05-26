
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeProfileEntityStatusWithDelete.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeProfileEntityStatusWithDelete">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Inactive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeProfileEntityStatusWithDelete")
@XmlEnum
public enum TypeProfileEntityStatusWithDelete {

    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive");
    private final String value;

    TypeProfileEntityStatusWithDelete(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeProfileEntityStatusWithDelete fromValue(String v) {
        for (TypeProfileEntityStatusWithDelete c: TypeProfileEntityStatusWithDelete.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
