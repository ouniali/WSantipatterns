
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StareSanatate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StareSanatate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Satisfacatoare"/>
 *     &lt;enumeration value="Buna"/>
 *     &lt;enumeration value="FoarteBuna"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StareSanatate")
@XmlEnum
public enum StareSanatate {

    @XmlEnumValue("Satisfacatoare")
    SATISFACATOARE("Satisfacatoare"),
    @XmlEnumValue("Buna")
    BUNA("Buna"),
    @XmlEnumValue("FoarteBuna")
    FOARTE_BUNA("FoarteBuna");
    private final String value;

    StareSanatate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StareSanatate fromValue(String v) {
        for (StareSanatate c: StareSanatate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
