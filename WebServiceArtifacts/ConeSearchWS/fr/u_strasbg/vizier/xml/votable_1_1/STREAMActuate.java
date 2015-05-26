
package fr.u_strasbg.vizier.xml.votable_1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STREAMActuate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="STREAMActuate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="onLoad"/>
 *     &lt;enumeration value="onRequest"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "STREAMActuate")
@XmlEnum
public enum STREAMActuate {

    @XmlEnumValue("onLoad")
    ON_LOAD("onLoad"),
    @XmlEnumValue("onRequest")
    ON_REQUEST("onRequest"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    STREAMActuate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STREAMActuate fromValue(String v) {
        for (STREAMActuate c: STREAMActuate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
