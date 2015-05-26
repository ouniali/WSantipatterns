
package fr.u_strasbg.vizier.xml.votable_1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STREAMType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="STREAMType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="locator"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "STREAMType")
@XmlEnum
public enum STREAMType {

    @XmlEnumValue("locator")
    LOCATOR("locator"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    STREAMType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STREAMType fromValue(String v) {
        for (STREAMType c: STREAMType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
