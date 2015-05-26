
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentGatewaySource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentGatewaySource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HDFC"/>
 *     &lt;enumeration value="AMEX"/>
 *     &lt;enumeration value="ICICI"/>
 *     &lt;enumeration value="OXICASH"/>
 *     &lt;enumeration value="APICustomer"/>
 *     &lt;enumeration value="SBI"/>
 *     &lt;enumeration value="CCAvenue"/>
 *     &lt;enumeration value="Beam"/>
 *     &lt;enumeration value="TicketVala"/>
 *     &lt;enumeration value="Axis"/>
 *     &lt;enumeration value="BillDesk"/>
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="EBS"/>
 *     &lt;enumeration value="Citrus"/>
 *     &lt;enumeration value="PayU"/>
 *     &lt;enumeration value="Atom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentGatewaySource")
@XmlEnum
public enum PaymentGatewaySource {

    HDFC("HDFC"),
    AMEX("AMEX"),
    ICICI("ICICI"),
    OXICASH("OXICASH"),
    @XmlEnumValue("APICustomer")
    API_CUSTOMER("APICustomer"),
    SBI("SBI"),
    @XmlEnumValue("CCAvenue")
    CC_AVENUE("CCAvenue"),
    @XmlEnumValue("Beam")
    BEAM("Beam"),
    @XmlEnumValue("TicketVala")
    TICKET_VALA("TicketVala"),
    @XmlEnumValue("Axis")
    AXIS("Axis"),
    @XmlEnumValue("BillDesk")
    BILL_DESK("BillDesk"),
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),
    EBS("EBS"),
    @XmlEnumValue("Citrus")
    CITRUS("Citrus"),
    @XmlEnumValue("PayU")
    PAY_U("PayU"),
    @XmlEnumValue("Atom")
    ATOM("Atom");
    private final String value;

    PaymentGatewaySource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentGatewaySource fromValue(String v) {
        for (PaymentGatewaySource c: PaymentGatewaySource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
