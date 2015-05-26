
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomeniuActivitate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DomeniuActivitate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NuSeAplica"/>
 *     &lt;enumeration value="Agricultura"/>
 *     &lt;enumeration value="Industrie"/>
 *     &lt;enumeration value="ComertServicii"/>
 *     &lt;enumeration value="Constructii"/>
 *     &lt;enumeration value="Transporturi"/>
 *     &lt;enumeration value="SocialSanatateCultura"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DomeniuActivitate")
@XmlEnum
public enum DomeniuActivitate {

    @XmlEnumValue("NuSeAplica")
    NU_SE_APLICA("NuSeAplica"),
    @XmlEnumValue("Agricultura")
    AGRICULTURA("Agricultura"),
    @XmlEnumValue("Industrie")
    INDUSTRIE("Industrie"),
    @XmlEnumValue("ComertServicii")
    COMERT_SERVICII("ComertServicii"),
    @XmlEnumValue("Constructii")
    CONSTRUCTII("Constructii"),
    @XmlEnumValue("Transporturi")
    TRANSPORTURI("Transporturi"),
    @XmlEnumValue("SocialSanatateCultura")
    SOCIAL_SANATATE_CULTURA("SocialSanatateCultura");
    private final String value;

    DomeniuActivitate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DomeniuActivitate fromValue(String v) {
        for (DomeniuActivitate c: DomeniuActivitate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
