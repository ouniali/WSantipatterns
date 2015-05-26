
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Judet.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Judet">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AG"/>
 *     &lt;enumeration value="BC"/>
 *     &lt;enumeration value="BH"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="BT"/>
 *     &lt;enumeration value="BV"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="BZ"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CJ"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="DJ"/>
 *     &lt;enumeration value="DB"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="GJ"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="HD"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="IF"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="NT"/>
 *     &lt;enumeration value="OT"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="SJ"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TM"/>
 *     &lt;enumeration value="TL"/>
 *     &lt;enumeration value="VS"/>
 *     &lt;enumeration value="VN"/>
 *     &lt;enumeration value="VL"/>
 *     &lt;enumeration value="B1"/>
 *     &lt;enumeration value="B2"/>
 *     &lt;enumeration value="B3"/>
 *     &lt;enumeration value="B4"/>
 *     &lt;enumeration value="B5"/>
 *     &lt;enumeration value="B6"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Judet")
@XmlEnum
public enum Judet {

    AB("AB"),
    AR("AR"),
    AG("AG"),
    BC("BC"),
    BH("BH"),
    BN("BN"),
    BT("BT"),
    BV("BV"),
    BR("BR"),
    BZ("BZ"),
    CS("CS"),
    CJ("CJ"),
    CT("CT"),
    CV("CV"),
    CL("CL"),
    DJ("DJ"),
    DB("DB"),
    GL("GL"),
    GR("GR"),
    GJ("GJ"),
    HR("HR"),
    HD("HD"),
    IL("IL"),
    IS("IS"),
    IF("IF"),
    MM("MM"),
    MH("MH"),
    MS("MS"),
    NT("NT"),
    OT("OT"),
    PH("PH"),
    SM("SM"),
    SB("SB"),
    SV("SV"),
    SJ("SJ"),
    TR("TR"),
    TM("TM"),
    TL("TL"),
    VS("VS"),
    VN("VN"),
    VL("VL"),
    @XmlEnumValue("B1")
    B_1("B1"),
    @XmlEnumValue("B2")
    B_2("B2"),
    @XmlEnumValue("B3")
    B_3("B3"),
    @XmlEnumValue("B4")
    B_4("B4"),
    @XmlEnumValue("B5")
    B_5("B5"),
    @XmlEnumValue("B6")
    B_6("B6");
    private final String value;

    Judet(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Judet fromValue(String v) {
        for (Judet c: Judet.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
