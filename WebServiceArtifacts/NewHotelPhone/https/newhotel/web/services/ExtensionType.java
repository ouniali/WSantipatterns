
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtensionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtensionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="PayTv"/>
 *     &lt;enumeration value="Keys"/>
 *     &lt;enumeration value="Internet"/>
 *     &lt;enumeration value="Gates"/>
 *     &lt;enumeration value="AirCondition"/>
 *     &lt;enumeration value="ExternalPOS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtensionType")
@XmlEnum
public enum ExtensionType {

    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("PayTv")
    PAY_TV("PayTv"),
    @XmlEnumValue("Keys")
    KEYS("Keys"),
    @XmlEnumValue("Internet")
    INTERNET("Internet"),
    @XmlEnumValue("Gates")
    GATES("Gates"),
    @XmlEnumValue("AirCondition")
    AIR_CONDITION("AirCondition"),
    @XmlEnumValue("ExternalPOS")
    EXTERNAL_POS("ExternalPOS");
    private final String value;

    ExtensionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtensionType fromValue(String v) {
        for (ExtensionType c: ExtensionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
