
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OtherCharges"/>
 *     &lt;enumeration value="ServiceCharge"/>
 *     &lt;enumeration value="CreditCardCharge"/>
 *     &lt;enumeration value="TrainSuperFastCharge"/>
 *     &lt;enumeration value="TrainReservationCharge"/>
 *     &lt;enumeration value="TrainOtherCharge"/>
 *     &lt;enumeration value="TrainBedRollCharge"/>
 *     &lt;enumeration value="SupplierMarkup"/>
 *     &lt;enumeration value="CurrencyConversionCharges"/>
 *     &lt;enumeration value="TboMarkup"/>
 *     &lt;enumeration value="BankHandlingCharges"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChargeType")
@XmlEnum
public enum ChargeType {

    @XmlEnumValue("OtherCharges")
    OTHER_CHARGES("OtherCharges"),
    @XmlEnumValue("ServiceCharge")
    SERVICE_CHARGE("ServiceCharge"),
    @XmlEnumValue("CreditCardCharge")
    CREDIT_CARD_CHARGE("CreditCardCharge"),
    @XmlEnumValue("TrainSuperFastCharge")
    TRAIN_SUPER_FAST_CHARGE("TrainSuperFastCharge"),
    @XmlEnumValue("TrainReservationCharge")
    TRAIN_RESERVATION_CHARGE("TrainReservationCharge"),
    @XmlEnumValue("TrainOtherCharge")
    TRAIN_OTHER_CHARGE("TrainOtherCharge"),
    @XmlEnumValue("TrainBedRollCharge")
    TRAIN_BED_ROLL_CHARGE("TrainBedRollCharge"),
    @XmlEnumValue("SupplierMarkup")
    SUPPLIER_MARKUP("SupplierMarkup"),
    @XmlEnumValue("CurrencyConversionCharges")
    CURRENCY_CONVERSION_CHARGES("CurrencyConversionCharges"),
    @XmlEnumValue("TboMarkup")
    TBO_MARKUP("TboMarkup"),
    @XmlEnumValue("BankHandlingCharges")
    BANK_HANDLING_CHARGES("BankHandlingCharges");
    private final String value;

    ChargeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChargeType fromValue(String v) {
        for (ChargeType c: ChargeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
