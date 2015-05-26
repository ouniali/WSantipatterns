
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Flight"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Car"/>
 *     &lt;enumeration value="ICICIInsurance"/>
 *     &lt;enumeration value="Transfers"/>
 *     &lt;enumeration value="SightSeeing"/>
 *     &lt;enumeration value="Train"/>
 *     &lt;enumeration value="SMSPack"/>
 *     &lt;enumeration value="Insurance"/>
 *     &lt;enumeration value="MobileRecharge"/>
 *     &lt;enumeration value="Bus"/>
 *     &lt;enumeration value="Packages"/>
 *     &lt;enumeration value="Cruise"/>
 *     &lt;enumeration value="Miscellaneous"/>
 *     &lt;enumeration value="Marhaba"/>
 *     &lt;enumeration value="SMSServiceCharge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductType")
@XmlEnum
public enum ProductType {

    @XmlEnumValue("Flight")
    FLIGHT("Flight"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Car")
    CAR("Car"),
    @XmlEnumValue("ICICIInsurance")
    ICICI_INSURANCE("ICICIInsurance"),
    @XmlEnumValue("Transfers")
    TRANSFERS("Transfers"),
    @XmlEnumValue("SightSeeing")
    SIGHT_SEEING("SightSeeing"),
    @XmlEnumValue("Train")
    TRAIN("Train"),
    @XmlEnumValue("SMSPack")
    SMS_PACK("SMSPack"),
    @XmlEnumValue("Insurance")
    INSURANCE("Insurance"),
    @XmlEnumValue("MobileRecharge")
    MOBILE_RECHARGE("MobileRecharge"),
    @XmlEnumValue("Bus")
    BUS("Bus"),
    @XmlEnumValue("Packages")
    PACKAGES("Packages"),
    @XmlEnumValue("Cruise")
    CRUISE("Cruise"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous"),
    @XmlEnumValue("Marhaba")
    MARHABA("Marhaba"),
    @XmlEnumValue("SMSServiceCharge")
    SMS_SERVICE_CHARGE("SMSServiceCharge");
    private final String value;

    ProductType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductType fromValue(String v) {
        for (ProductType c: ProductType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
