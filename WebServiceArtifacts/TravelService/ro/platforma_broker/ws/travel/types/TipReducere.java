
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipReducere.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipReducere">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NuSeAplica"/>
 *     &lt;enumeration value="Tineri"/>
 *     &lt;enumeration value="Grup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipReducere")
@XmlEnum
public enum TipReducere {

    @XmlEnumValue("NuSeAplica")
    NU_SE_APLICA("NuSeAplica"),
    @XmlEnumValue("Tineri")
    TINERI("Tineri"),
    @XmlEnumValue("Grup")
    GRUP("Grup");
    private final String value;

    TipReducere(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipReducere fromValue(String v) {
        for (TipReducere c: TipReducere.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
