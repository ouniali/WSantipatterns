
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MovementCompletionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MovementCompletionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MovementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompletionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CompletionStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovementCompletionRequest", propOrder = {
    "movementID",
    "completionDateTime",
    "completionStatus"
})
public class MovementCompletionRequest {

    @XmlElement(name = "MovementID")
    protected String movementID;
    @XmlElement(name = "CompletionDateTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionDateTime;
    @XmlElement(name = "CompletionStatus")
    protected int completionStatus;

    /**
     * Gets the value of the movementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementID() {
        return movementID;
    }

    /**
     * Sets the value of the movementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementID(String value) {
        this.movementID = value;
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

}
