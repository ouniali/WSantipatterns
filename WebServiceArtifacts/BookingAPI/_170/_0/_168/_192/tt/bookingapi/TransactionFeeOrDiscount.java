
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionFeeOrDiscount.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionFeeOrDiscount">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UpdateTrasactionFee"/>
 *     &lt;enumeration value="UpdateDiscount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionFeeOrDiscount")
@XmlEnum
public enum TransactionFeeOrDiscount {

    @XmlEnumValue("UpdateTrasactionFee")
    UPDATE_TRASACTION_FEE("UpdateTrasactionFee"),
    @XmlEnumValue("UpdateDiscount")
    UPDATE_DISCOUNT("UpdateDiscount");
    private final String value;

    TransactionFeeOrDiscount(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionFeeOrDiscount fromValue(String v) {
        for (TransactionFeeOrDiscount c: TransactionFeeOrDiscount.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
