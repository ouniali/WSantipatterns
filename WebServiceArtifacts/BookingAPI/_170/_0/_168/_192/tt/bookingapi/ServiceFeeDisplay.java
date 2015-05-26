
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceFeeDisplay.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceFeeDisplay">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ShowInTax"/>
 *     &lt;enumeration value="ShowSeparately"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceFeeDisplay")
@XmlEnum
public enum ServiceFeeDisplay {

    @XmlEnumValue("ShowInTax")
    SHOW_IN_TAX("ShowInTax"),
    @XmlEnumValue("ShowSeparately")
    SHOW_SEPARATELY("ShowSeparately");
    private final String value;

    ServiceFeeDisplay(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceFeeDisplay fromValue(String v) {
        for (ServiceFeeDisplay c: ServiceFeeDisplay.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
