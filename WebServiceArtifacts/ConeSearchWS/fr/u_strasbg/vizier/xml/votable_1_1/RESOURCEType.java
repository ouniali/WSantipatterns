
package fr.u_strasbg.vizier.xml.votable_1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RESOURCEType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RESOURCEType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="results"/>
 *     &lt;enumeration value="meta"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RESOURCEType")
@XmlEnum
public enum RESOURCEType {

    @XmlEnumValue("results")
    RESULTS("results"),
    @XmlEnumValue("meta")
    META("meta");
    private final String value;

    RESOURCEType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RESOURCEType fromValue(String v) {
        for (RESOURCEType c: RESOURCEType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
