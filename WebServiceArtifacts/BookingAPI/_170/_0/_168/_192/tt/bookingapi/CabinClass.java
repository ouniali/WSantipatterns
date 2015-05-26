
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CabinClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Economy"/>
 *     &lt;enumeration value="PremiumEconomy"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="PremiumBusiness"/>
 *     &lt;enumeration value="First"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CabinClass")
@XmlEnum
public enum CabinClass {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy"),
    @XmlEnumValue("PremiumEconomy")
    PREMIUM_ECONOMY("PremiumEconomy"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("PremiumBusiness")
    PREMIUM_BUSINESS("PremiumBusiness"),
    @XmlEnumValue("First")
    FIRST("First");
    private final String value;

    CabinClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CabinClass fromValue(String v) {
        for (CabinClass c: CabinClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
