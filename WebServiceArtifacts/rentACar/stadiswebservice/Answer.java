
package stadiswebservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for answer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="answer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="failureMessages" type="{http://stadiswebservice/}failureMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://stadiswebservice/}answerStatus" minOccurs="0"/>
 *         &lt;element name="warningMessages" type="{http://stadiswebservice/}warningMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "answer", propOrder = {
    "failureMessages",
    "status",
    "warningMessages"
})
@XmlSeeAlso({
    CarDataResponse.class
})
public class Answer {

    @XmlElement(nillable = true)
    protected List<FailureMessage> failureMessages;
    @XmlSchemaType(name = "string")
    protected AnswerStatus status;
    @XmlElement(nillable = true)
    protected List<WarningMessage> warningMessages;

    /**
     * Gets the value of the failureMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failureMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailureMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailureMessage }
     * 
     * 
     */
    public List<FailureMessage> getFailureMessages() {
        if (failureMessages == null) {
            failureMessages = new ArrayList<FailureMessage>();
        }
        return this.failureMessages;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AnswerStatus }
     *     
     */
    public AnswerStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerStatus }
     *     
     */
    public void setStatus(AnswerStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the warningMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningMessage }
     * 
     * 
     */
    public List<WarningMessage> getWarningMessages() {
        if (warningMessages == null) {
            warningMessages = new ArrayList<WarningMessage>();
        }
        return this.warningMessages;
    }

}
