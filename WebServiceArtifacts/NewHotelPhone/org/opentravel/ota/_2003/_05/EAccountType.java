
package org.opentravel.ota._2003._05;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EAccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Master"/>
 *     &lt;enumeration value="Extra1"/>
 *     &lt;enumeration value="Extra2"/>
 *     &lt;enumeration value="Extra3"/>
 *     &lt;enumeration value="Extra4"/>
 *     &lt;enumeration value="Extra5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EAccountType")
@XmlEnum
public enum EAccountType {

    @XmlEnumValue("Master")
    MASTER("Master"),
    @XmlEnumValue("Extra1")
    EXTRA_1("Extra1"),
    @XmlEnumValue("Extra2")
    EXTRA_2("Extra2"),
    @XmlEnumValue("Extra3")
    EXTRA_3("Extra3"),
    @XmlEnumValue("Extra4")
    EXTRA_4("Extra4"),
    @XmlEnumValue("Extra5")
    EXTRA_5("Extra5");
    private final String value;

    EAccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EAccountType fromValue(String v) {
        for (EAccountType c: EAccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
