
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipPolita.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipPolita">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Complex"/>
 *     &lt;enumeration value="Premium"/>
 *     &lt;enumeration value="Adventure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipPolita")
@XmlEnum
public enum TipPolita {

    @XmlEnumValue("Complex")
    COMPLEX("Complex"),
    @XmlEnumValue("Premium")
    PREMIUM("Premium"),
    @XmlEnumValue("Adventure")
    ADVENTURE("Adventure");
    private final String value;

    TipPolita(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipPolita fromValue(String v) {
        for (TipPolita c: TipPolita.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
