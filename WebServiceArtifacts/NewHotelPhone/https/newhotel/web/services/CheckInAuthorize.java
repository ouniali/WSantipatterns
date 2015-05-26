
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckInAuthorize.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckInAuthorize">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotRequire"/>
 *     &lt;enumeration value="Authorized"/>
 *     &lt;enumeration value="NotAuthorized"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckInAuthorize")
@XmlEnum
public enum CheckInAuthorize {

    @XmlEnumValue("NotRequire")
    NOT_REQUIRE("NotRequire"),
    @XmlEnumValue("Authorized")
    AUTHORIZED("Authorized"),
    @XmlEnumValue("NotAuthorized")
    NOT_AUTHORIZED("NotAuthorized");
    private final String value;

    CheckInAuthorize(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckInAuthorize fromValue(String v) {
        for (CheckInAuthorize c: CheckInAuthorize.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
