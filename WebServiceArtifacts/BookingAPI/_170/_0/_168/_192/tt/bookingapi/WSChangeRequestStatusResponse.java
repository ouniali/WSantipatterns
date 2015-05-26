
package _170._0._168._192.tt.bookingapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSChangeRequestStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSChangeRequestStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RefundedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CancellationCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ChangeRequestStatus" type="{http://192.168.0.170/TT/BookingAPI}ChangeRequestStatus"/>
 *         &lt;element name="Status" type="{http://192.168.0.170/TT/BookingAPI}WSStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSChangeRequestStatusResponse", propOrder = {
    "requestId",
    "refundedAmount",
    "cancellationCharge",
    "changeRequestStatus",
    "status"
})
public class WSChangeRequestStatusResponse {

    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "RefundedAmount", required = true)
    protected BigDecimal refundedAmount;
    @XmlElement(name = "CancellationCharge", required = true)
    protected BigDecimal cancellationCharge;
    @XmlElement(name = "ChangeRequestStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ChangeRequestStatus changeRequestStatus;
    @XmlElement(name = "Status")
    protected WSStatus status;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the refundedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundedAmount() {
        return refundedAmount;
    }

    /**
     * Sets the value of the refundedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundedAmount(BigDecimal value) {
        this.refundedAmount = value;
    }

    /**
     * Gets the value of the cancellationCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCancellationCharge() {
        return cancellationCharge;
    }

    /**
     * Sets the value of the cancellationCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCancellationCharge(BigDecimal value) {
        this.cancellationCharge = value;
    }

    /**
     * Gets the value of the changeRequestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeRequestStatus }
     *     
     */
    public ChangeRequestStatus getChangeRequestStatus() {
        return changeRequestStatus;
    }

    /**
     * Sets the value of the changeRequestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeRequestStatus }
     *     
     */
    public void setChangeRequestStatus(ChangeRequestStatus value) {
        this.changeRequestStatus = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WSStatus }
     *     
     */
    public WSStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSStatus }
     *     
     */
    public void setStatus(WSStatus value) {
        this.status = value;
    }

}
