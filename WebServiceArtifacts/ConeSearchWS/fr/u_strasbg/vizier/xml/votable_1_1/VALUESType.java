
package fr.u_strasbg.vizier.xml.votable_1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VALUESType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VALUESType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="legal"/>
 *     &lt;enumeration value="actual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VALUESType")
@XmlEnum
public enum VALUESType {

    @XmlEnumValue("legal")
    LEGAL("legal"),
    @XmlEnumValue("actual")
    ACTUAL("actual");
    private final String value;

    VALUESType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VALUESType fromValue(String v) {
        for (VALUESType c: VALUESType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
