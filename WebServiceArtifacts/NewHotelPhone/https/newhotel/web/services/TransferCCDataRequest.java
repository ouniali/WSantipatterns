
package https.newhotel.web.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferCCDataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferCCDataRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="TransferCCId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatorUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TransferCCValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferCCDataRequest", propOrder = {
    "transferCCId",
    "operatorUser",
    "ticketId",
    "operationType",
    "transferCCValue"
})
public class TransferCCDataRequest
    extends BaseRequest
{

    @XmlElement(name = "TransferCCId")
    protected String transferCCId;
    @XmlElement(name = "OperatorUser")
    protected String operatorUser;
    @XmlElement(name = "TicketId")
    protected String ticketId;
    @XmlElement(name = "OperationType")
    protected long operationType;
    @XmlElement(name = "TransferCCValue", required = true)
    protected BigDecimal transferCCValue;

    /**
     * Gets the value of the transferCCId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferCCId() {
        return transferCCId;
    }

    /**
     * Sets the value of the transferCCId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferCCId(String value) {
        this.transferCCId = value;
    }

    /**
     * Gets the value of the operatorUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorUser() {
        return operatorUser;
    }

    /**
     * Sets the value of the operatorUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorUser(String value) {
        this.operatorUser = value;
    }

    /**
     * Gets the value of the ticketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * Sets the value of the ticketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketId(String value) {
        this.ticketId = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     */
    public long getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     */
    public void setOperationType(long value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the transferCCValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransferCCValue() {
        return transferCCValue;
    }

    /**
     * Sets the value of the transferCCValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransferCCValue(BigDecimal value) {
        this.transferCCValue = value;
    }

}
