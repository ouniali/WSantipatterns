
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScopCalatorie.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScopCalatorie">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Turism"/>
 *     &lt;enumeration value="Afaceri"/>
 *     &lt;enumeration value="PrestareMunca"/>
 *     &lt;enumeration value="Sofer"/>
 *     &lt;enumeration value="SportFaraSporturiPericuloase"/>
 *     &lt;enumeration value="AgrementSporturiActivitatiPericuloase"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScopCalatorie")
@XmlEnum
public enum ScopCalatorie {

    @XmlEnumValue("Turism")
    TURISM("Turism"),
    @XmlEnumValue("Afaceri")
    AFACERI("Afaceri"),
    @XmlEnumValue("PrestareMunca")
    PRESTARE_MUNCA("PrestareMunca"),
    @XmlEnumValue("Sofer")
    SOFER("Sofer"),
    @XmlEnumValue("SportFaraSporturiPericuloase")
    SPORT_FARA_SPORTURI_PERICULOASE("SportFaraSporturiPericuloase"),
    @XmlEnumValue("AgrementSporturiActivitatiPericuloase")
    AGREMENT_SPORTURI_ACTIVITATI_PERICULOASE("AgrementSporturiActivitatiPericuloase");
    private final String value;

    ScopCalatorie(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScopCalatorie fromValue(String v) {
        for (ScopCalatorie c: ScopCalatorie.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
