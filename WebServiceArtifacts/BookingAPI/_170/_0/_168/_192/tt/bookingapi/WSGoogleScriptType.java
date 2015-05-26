
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSGoogleScriptType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WSGoogleScriptType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Analytics"/>
 *     &lt;enumeration value="PPC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WSGoogleScriptType")
@XmlEnum
public enum WSGoogleScriptType {

    @XmlEnumValue("Analytics")
    ANALYTICS("Analytics"),
    PPC("PPC");
    private final String value;

    WSGoogleScriptType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WSGoogleScriptType fromValue(String v) {
        for (WSGoogleScriptType c: WSGoogleScriptType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
