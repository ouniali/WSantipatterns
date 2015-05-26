
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanDocType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScanDocType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DNI"/>
 *     &lt;enumeration value="Passport"/>
 *     &lt;enumeration value="DriverLicence"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScanDocType")
@XmlEnum
public enum ScanDocType {

    DNI("DNI"),
    @XmlEnumValue("Passport")
    PASSPORT("Passport"),
    @XmlEnumValue("DriverLicence")
    DRIVER_LICENCE("DriverLicence");
    private final String value;

    ScanDocType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScanDocType fromValue(String v) {
        for (ScanDocType c: ScanDocType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
