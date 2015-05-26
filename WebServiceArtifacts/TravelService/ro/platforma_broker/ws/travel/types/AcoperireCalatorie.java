
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcoperireCalatorie.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcoperireCalatorie">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TariLimitrofeExceptandBulgariaSiUngaria"/>
 *     &lt;enumeration value="TarileDinUESiIslandaNorvegiaElvetiaTurcia"/>
 *     &lt;enumeration value="AmericaDeNordSiIsrael"/>
 *     &lt;enumeration value="CelelalteTari"/>
 *     &lt;enumeration value="WorldWide"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcoperireCalatorie")
@XmlEnum
public enum AcoperireCalatorie {

    @XmlEnumValue("TariLimitrofeExceptandBulgariaSiUngaria")
    TARI_LIMITROFE_EXCEPTAND_BULGARIA_SI_UNGARIA("TariLimitrofeExceptandBulgariaSiUngaria"),
    @XmlEnumValue("TarileDinUESiIslandaNorvegiaElvetiaTurcia")
    TARILE_DIN_UE_SI_ISLANDA_NORVEGIA_ELVETIA_TURCIA("TarileDinUESiIslandaNorvegiaElvetiaTurcia"),
    @XmlEnumValue("AmericaDeNordSiIsrael")
    AMERICA_DE_NORD_SI_ISRAEL("AmericaDeNordSiIsrael"),
    @XmlEnumValue("CelelalteTari")
    CELELALTE_TARI("CelelalteTari"),
    @XmlEnumValue("WorldWide")
    WORLD_WIDE("WorldWide");
    private final String value;

    AcoperireCalatorie(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcoperireCalatorie fromValue(String v) {
        for (AcoperireCalatorie c: AcoperireCalatorie.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
