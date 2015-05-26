
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JobCompletionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobCompletionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JobID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompletionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CompletionStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TransferCCInfoDetails" type="{https://NewHotel/Web/Services/}TransferCCRequest" minOccurs="0"/>
 *         &lt;element name="DigitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageReceived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobCompletionRequest", propOrder = {
    "jobID",
    "completionDateTime",
    "completionStatus",
    "transferCCInfoDetails",
    "digitCode",
    "messageReceived"
})
public class JobCompletionRequest {

    @XmlElement(name = "JobID")
    protected String jobID;
    @XmlElement(name = "CompletionDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionDateTime;
    @XmlElement(name = "CompletionStatus")
    protected int completionStatus;
    @XmlElement(name = "TransferCCInfoDetails")
    protected TransferCCRequest transferCCInfoDetails;
    @XmlElement(name = "DigitCode")
    protected String digitCode;
    @XmlElement(name = "MessageReceived")
    protected boolean messageReceived;

    /**
     * Gets the value of the jobID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobID() {
        return jobID;
    }

    /**
     * Sets the value of the jobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobID(String value) {
        this.jobID = value;
    }

    /**
     * Gets the value of the completionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionDateTime() {
        return completionDateTime;
    }

    /**
     * Sets the value of the completionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionDateTime(XMLGregorianCalendar value) {
        this.completionDateTime = value;
    }

    /**
     * Gets the value of the completionStatus property.
     * 
     */
    public int getCompletionStatus() {
        return completionStatus;
    }

    /**
     * Sets the value of the completionStatus property.
     * 
     */
    public void setCompletionStatus(int value) {
        this.completionStatus = value;
    }

    /**
     * Gets the value of the transferCCInfoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCCRequest }
     *     
     */
    public TransferCCRequest getTransferCCInfoDetails() {
        return transferCCInfoDetails;
    }

    /**
     * Sets the value of the transferCCInfoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCCRequest }
     *     
     */
    public void setTransferCCInfoDetails(TransferCCRequest value) {
        this.transferCCInfoDetails = value;
    }

    /**
     * Gets the value of the digitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitCode() {
        return digitCode;
    }

    /**
     * Sets the value of the digitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitCode(String value) {
        this.digitCode = value;
    }

    /**
     * Gets the value of the messageReceived property.
     * 
     */
    public boolean isMessageReceived() {
        return messageReceived;
    }

    /**
     * Sets the value of the messageReceived property.
     * 
     */
    public void setMessageReceived(boolean value) {
        this.messageReceived = value;
    }

}
