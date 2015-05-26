
package common.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ePaxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ePaxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Main"/>
 *     &lt;enumeration value="PAX2"/>
 *     &lt;enumeration value="PAX3"/>
 *     &lt;enumeration value="PAX4"/>
 *     &lt;enumeration value="PAX5"/>
 *     &lt;enumeration value="PAX6"/>
 *     &lt;enumeration value="PAX7"/>
 *     &lt;enumeration value="PAX8"/>
 *     &lt;enumeration value="PAX9"/>
 *     &lt;enumeration value="PAX10"/>
 *     &lt;enumeration value="ExtraBed1"/>
 *     &lt;enumeration value="ExtraBed2"/>
 *     &lt;enumeration value="ExtraBed3"/>
 *     &lt;enumeration value="ExtraBed4"/>
 *     &lt;enumeration value="ExtraBed5"/>
 *     &lt;enumeration value="ExtraBed6"/>
 *     &lt;enumeration value="ExtraBed7"/>
 *     &lt;enumeration value="ExtraBed8"/>
 *     &lt;enumeration value="ExtraBed9"/>
 *     &lt;enumeration value="ExtraBed10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ePaxType")
@XmlEnum
public enum EPaxType {

    @XmlEnumValue("Main")
    MAIN("Main"),
    @XmlEnumValue("PAX2")
    PAX_2("PAX2"),
    @XmlEnumValue("PAX3")
    PAX_3("PAX3"),
    @XmlEnumValue("PAX4")
    PAX_4("PAX4"),
    @XmlEnumValue("PAX5")
    PAX_5("PAX5"),
    @XmlEnumValue("PAX6")
    PAX_6("PAX6"),
    @XmlEnumValue("PAX7")
    PAX_7("PAX7"),
    @XmlEnumValue("PAX8")
    PAX_8("PAX8"),
    @XmlEnumValue("PAX9")
    PAX_9("PAX9"),
    @XmlEnumValue("PAX10")
    PAX_10("PAX10"),
    @XmlEnumValue("ExtraBed1")
    EXTRA_BED_1("ExtraBed1"),
    @XmlEnumValue("ExtraBed2")
    EXTRA_BED_2("ExtraBed2"),
    @XmlEnumValue("ExtraBed3")
    EXTRA_BED_3("ExtraBed3"),
    @XmlEnumValue("ExtraBed4")
    EXTRA_BED_4("ExtraBed4"),
    @XmlEnumValue("ExtraBed5")
    EXTRA_BED_5("ExtraBed5"),
    @XmlEnumValue("ExtraBed6")
    EXTRA_BED_6("ExtraBed6"),
    @XmlEnumValue("ExtraBed7")
    EXTRA_BED_7("ExtraBed7"),
    @XmlEnumValue("ExtraBed8")
    EXTRA_BED_8("ExtraBed8"),
    @XmlEnumValue("ExtraBed9")
    EXTRA_BED_9("ExtraBed9"),
    @XmlEnumValue("ExtraBed10")
    EXTRA_BED_10("ExtraBed10");
    private final String value;

    EPaxType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPaxType fromValue(String v) {
        for (EPaxType c: EPaxType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
