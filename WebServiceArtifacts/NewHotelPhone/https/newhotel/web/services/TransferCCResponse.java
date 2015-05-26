
package https.newhotel.web.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferCCResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferCCResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="OperatorUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TransferCCValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DevolutionDetails" type="{https://NewHotel/Web/Services/}DevolutionDetailsResponse" minOccurs="0"/>
 *         &lt;element name="ReplieDetails" type="{https://NewHotel/Web/Services/}ReplieDetailsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferCCResponse", propOrder = {
    "operatorUser",
    "ticketId",
    "operationType",
    "transferCCValue",
    "devolutionDetails",
    "replieDetails"
})
public class TransferCCResponse
    extends BaseResponse
{

    @XmlElement(name = "OperatorUser")
    protected String operatorUser;
    @XmlElement(name = "TicketId")
    protected String ticketId;
    @XmlElement(name = "OperationType")
    protected long operationType;
    @XmlElement(name = "TransferCCValue", required = true)
    protected BigDecimal transferCCValue;
    @XmlElement(name = "DevolutionDetails")
    protected DevolutionDetailsResponse devolutionDetails;
    @XmlElement(name = "ReplieDetails")
    protected ReplieDetailsResponse replieDetails;

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

    /**
     * Gets the value of the devolutionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DevolutionDetailsResponse }
     *     
     */
    public DevolutionDetailsResponse getDevolutionDetails() {
        return devolutionDetails;
    }

    /**
     * Sets the value of the devolutionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevolutionDetailsResponse }
     *     
     */
    public void setDevolutionDetails(DevolutionDetailsResponse value) {
        this.devolutionDetails = value;
    }

    /**
     * Gets the value of the replieDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReplieDetailsResponse }
     *     
     */
    public ReplieDetailsResponse getReplieDetails() {
        return replieDetails;
    }

    /**
     * Sets the value of the replieDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplieDetailsResponse }
     *     
     */
    public void setReplieDetails(ReplieDetailsResponse value) {
        this.replieDetails = value;
    }

}
