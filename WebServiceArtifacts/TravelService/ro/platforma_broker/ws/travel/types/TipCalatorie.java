
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipCalatorie.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipCalatorie">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Individuala"/>
 *     &lt;enumeration value="Familia"/>
 *     &lt;enumeration value="Grup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipCalatorie")
@XmlEnum
public enum TipCalatorie {

    @XmlEnumValue("Individuala")
    INDIVIDUALA("Individuala"),
    @XmlEnumValue("Familia")
    FAMILIA("Familia"),
    @XmlEnumValue("Grup")
    GRUP("Grup");
    private final String value;

    TipCalatorie(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipCalatorie fromValue(String v) {
        for (TipCalatorie c: TipCalatorie.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
