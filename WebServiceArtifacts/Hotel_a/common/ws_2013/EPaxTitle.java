
package common.ws_2013;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ePaxTitle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ePaxTitle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Mr"/>
 *     &lt;enumeration value="Mrs"/>
 *     &lt;enumeration value="MS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ePaxTitle")
@XmlEnum
public enum EPaxTitle {

    @XmlEnumValue("Mr")
    MR("Mr"),
    @XmlEnumValue("Mrs")
    MRS("Mrs"),
    MS("MS");
    private final String value;

    EPaxTitle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPaxTitle fromValue(String v) {
        for (EPaxTitle c: EPaxTitle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
