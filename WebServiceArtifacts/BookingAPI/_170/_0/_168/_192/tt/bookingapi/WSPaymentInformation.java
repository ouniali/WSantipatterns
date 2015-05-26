
package _170._0._168._192.tt.bookingapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPaymentInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPaymentInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentInformationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaymentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PaymentGateway" type="{http://192.168.0.170/TT/BookingAPI}PaymentGatewaySource"/>
 *         &lt;element name="PaymentModeType" type="{http://192.168.0.170/TT/BookingAPI}PaymentModeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPaymentInformation", propOrder = {
    "paymentInformationId",
    "invoiceNumber",
    "paymentId",
    "amount",
    "ipAddress",
    "trackId",
    "paymentGateway",
    "paymentModeType"
})
public class WSPaymentInformation {

    @XmlElement(name = "PaymentInformationId")
    protected int paymentInformationId;
    @XmlElement(name = "InvoiceNumber")
    protected int invoiceNumber;
    @XmlElement(name = "PaymentId")
    protected String paymentId;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "IPAddress")
    protected String ipAddress;
    @XmlElement(name = "TrackId")
    protected long trackId;
    @XmlElement(name = "PaymentGateway", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentGatewaySource paymentGateway;
    @XmlElement(name = "PaymentModeType", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentModeType paymentModeType;

    /**
     * Gets the value of the paymentInformationId property.
     * 
     */
    public int getPaymentInformationId() {
        return paymentInformationId;
    }

    /**
     * Sets the value of the paymentInformationId property.
     * 
     */
    public void setPaymentInformationId(int value) {
        this.paymentInformationId = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     */
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     */
    public void setInvoiceNumber(int value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the trackId property.
     * 
     */
    public long getTrackId() {
        return trackId;
    }

    /**
     * Sets the value of the trackId property.
     * 
     */
    public void setTrackId(long value) {
        this.trackId = value;
    }

    /**
     * Gets the value of the paymentGateway property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentGatewaySource }
     *     
     */
    public PaymentGatewaySource getPaymentGateway() {
        return paymentGateway;
    }

    /**
     * Sets the value of the paymentGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentGatewaySource }
     *     
     */
    public void setPaymentGateway(PaymentGatewaySource value) {
        this.paymentGateway = value;
    }

    /**
     * Gets the value of the paymentModeType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentModeType }
     *     
     */
    public PaymentModeType getPaymentModeType() {
        return paymentModeType;
    }

    /**
     * Sets the value of the paymentModeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentModeType }
     *     
     */
    public void setPaymentModeType(PaymentModeType value) {
        this.paymentModeType = value;
    }

}
