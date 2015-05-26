
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PhoneCallRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneCallRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BasePhoneRequest">
 *       &lt;sequence>
 *         &lt;element name="CallNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CallPulse" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CallLenght" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceIDs" type="{https://NewHotel/Web/Services/}ArrayOfPhonePriceCollection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneCallRequest", propOrder = {
    "callNumber",
    "callDateTime",
    "callPulse",
    "callLenght",
    "priceIDs"
})
public class PhoneCallRequest
    extends BasePhoneRequest
{

    @XmlElement(name = "CallNumber")
    protected String callNumber;
    @XmlElement(name = "CallDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callDateTime;
    @XmlElement(name = "CallPulse")
    protected long callPulse;
    @XmlElement(name = "CallLenght")
    protected String callLenght;
    @XmlElement(name = "PriceIDs")
    protected ArrayOfPhonePriceCollection priceIDs;

    /**
     * Gets the value of the callNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallNumber() {
        return callNumber;
    }

    /**
     * Sets the value of the callNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallNumber(String value) {
        this.callNumber = value;
    }

    /**
     * Gets the value of the callDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallDateTime() {
        return callDateTime;
    }

    /**
     * Sets the value of the callDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallDateTime(XMLGregorianCalendar value) {
        this.callDateTime = value;
    }

    /**
     * Gets the value of the callPulse property.
     * 
     */
    public long getCallPulse() {
        return callPulse;
    }

    /**
     * Sets the value of the callPulse property.
     * 
     */
    public void setCallPulse(long value) {
        this.callPulse = value;
    }

    /**
     * Gets the value of the callLenght property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallLenght() {
        return callLenght;
    }

    /**
     * Sets the value of the callLenght property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallLenght(String value) {
        this.callLenght = value;
    }

    /**
     * Gets the value of the priceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhonePriceCollection }
     *     
     */
    public ArrayOfPhonePriceCollection getPriceIDs() {
        return priceIDs;
    }

    /**
     * Sets the value of the priceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhonePriceCollection }
     *     
     */
    public void setPriceIDs(ArrayOfPhonePriceCollection value) {
        this.priceIDs = value;
    }

}
