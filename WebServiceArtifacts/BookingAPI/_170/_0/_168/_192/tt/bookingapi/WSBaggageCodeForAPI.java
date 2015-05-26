
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSBaggageCodeForAPI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WSBaggageCodeForAPI">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Notset"/>
 *     &lt;enumeration value="Nobaggage"/>
 *     &lt;enumeration value="ADD_15KG"/>
 *     &lt;enumeration value="ADD_20KG"/>
 *     &lt;enumeration value="ADD_25KG"/>
 *     &lt;enumeration value="ADD_30KG"/>
 *     &lt;enumeration value="ADD_35KG"/>
 *     &lt;enumeration value="ADD_40KG"/>
 *     &lt;enumeration value="ADD_5KG"/>
 *     &lt;enumeration value="ADD_10KG"/>
 *     &lt;enumeration value="ADD_3KG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WSBaggageCodeForAPI")
@XmlEnum
public enum WSBaggageCodeForAPI {

    @XmlEnumValue("Notset")
    NOTSET("Notset"),
    @XmlEnumValue("Nobaggage")
    NOBAGGAGE("Nobaggage"),
    @XmlEnumValue("ADD_15KG")
    ADD_15_KG("ADD_15KG"),
    @XmlEnumValue("ADD_20KG")
    ADD_20_KG("ADD_20KG"),
    @XmlEnumValue("ADD_25KG")
    ADD_25_KG("ADD_25KG"),
    @XmlEnumValue("ADD_30KG")
    ADD_30_KG("ADD_30KG"),
    @XmlEnumValue("ADD_35KG")
    ADD_35_KG("ADD_35KG"),
    @XmlEnumValue("ADD_40KG")
    ADD_40_KG("ADD_40KG"),
    @XmlEnumValue("ADD_5KG")
    ADD_5_KG("ADD_5KG"),
    @XmlEnumValue("ADD_10KG")
    ADD_10_KG("ADD_10KG"),
    @XmlEnumValue("ADD_3KG")
    ADD_3_KG("ADD_3KG");
    private final String value;

    WSBaggageCodeForAPI(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WSBaggageCodeForAPI fromValue(String v) {
        for (WSBaggageCodeForAPI c: WSBaggageCodeForAPI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
