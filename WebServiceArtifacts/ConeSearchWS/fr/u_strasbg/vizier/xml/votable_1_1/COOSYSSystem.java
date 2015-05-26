
package fr.u_strasbg.vizier.xml.votable_1_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for COOSYSSystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="COOSYSSystem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="eq_FK4"/>
 *     &lt;enumeration value="eq_FK5"/>
 *     &lt;enumeration value="ICRS"/>
 *     &lt;enumeration value="ecl_FK4"/>
 *     &lt;enumeration value="ecl_FK5"/>
 *     &lt;enumeration value="galactic"/>
 *     &lt;enumeration value="supergalactic"/>
 *     &lt;enumeration value="xy"/>
 *     &lt;enumeration value="barycentric"/>
 *     &lt;enumeration value="geo_app"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "COOSYSSystem")
@XmlEnum
public enum COOSYSSystem {

    @XmlEnumValue("eq_FK4")
    EQ_FK_4("eq_FK4"),
    @XmlEnumValue("eq_FK5")
    EQ_FK_5("eq_FK5"),
    ICRS("ICRS"),
    @XmlEnumValue("ecl_FK4")
    ECL_FK_4("ecl_FK4"),
    @XmlEnumValue("ecl_FK5")
    ECL_FK_5("ecl_FK5"),
    @XmlEnumValue("galactic")
    GALACTIC("galactic"),
    @XmlEnumValue("supergalactic")
    SUPERGALACTIC("supergalactic"),
    @XmlEnumValue("xy")
    XY("xy"),
    @XmlEnumValue("barycentric")
    BARYCENTRIC("barycentric"),
    @XmlEnumValue("geo_app")
    GEO_APP("geo_app");
    private final String value;

    COOSYSSystem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static COOSYSSystem fromValue(String v) {
        for (COOSYSSystem c: COOSYSSystem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
