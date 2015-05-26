
package _170._0._168._192.tt.bookingapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSUpdateFeeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSUpdateFeeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookingId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TransactionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ServiceFeeDisplay" type="{http://192.168.0.170/TT/BookingAPI}ServiceFeeDisplay"/>
 *         &lt;element name="TransactionFeeOrDiscount" type="{http://192.168.0.170/TT/BookingAPI}TransactionFeeOrDiscount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSUpdateFeeRequest", propOrder = {
    "ticketId",
    "bookingId",
    "transactionFee",
    "discount",
    "serviceFeeDisplay",
    "transactionFeeOrDiscount"
})
public class WSUpdateFeeRequest {

    @XmlElement(name = "TicketId")
    protected int ticketId;
    @XmlElement(name = "BookingId")
    protected int bookingId;
    @XmlElement(name = "TransactionFee", required = true)
    protected BigDecimal transactionFee;
    @XmlElement(name = "Discount", required = true)
    protected BigDecimal discount;
    @XmlElement(name = "ServiceFeeDisplay", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceFeeDisplay serviceFeeDisplay;
    @XmlElement(name = "TransactionFeeOrDiscount", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionFeeOrDiscount transactionFeeOrDiscount;

    /**
     * Gets the value of the ticketId property.
     * 
     */
    public int getTicketId() {
        return ticketId;
    }

    /**
     * Sets the value of the ticketId property.
     * 
     */
    public void setTicketId(int value) {
        this.ticketId = value;
    }

    /**
     * Gets the value of the bookingId property.
     * 
     */
    public int getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     */
    public void setBookingId(int value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the transactionFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionFee() {
        return transactionFee;
    }

    /**
     * Sets the value of the transactionFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionFee(BigDecimal value) {
        this.transactionFee = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the serviceFeeDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeeDisplay }
     *     
     */
    public ServiceFeeDisplay getServiceFeeDisplay() {
        return serviceFeeDisplay;
    }

    /**
     * Sets the value of the serviceFeeDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeeDisplay }
     *     
     */
    public void setServiceFeeDisplay(ServiceFeeDisplay value) {
        this.serviceFeeDisplay = value;
    }

    /**
     * Gets the value of the transactionFeeOrDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionFeeOrDiscount }
     *     
     */
    public TransactionFeeOrDiscount getTransactionFeeOrDiscount() {
        return transactionFeeOrDiscount;
    }

    /**
     * Sets the value of the transactionFeeOrDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionFeeOrDiscount }
     *     
     */
    public void setTransactionFeeOrDiscount(TransactionFeeOrDiscount value) {
        this.transactionFeeOrDiscount = value;
    }

}
