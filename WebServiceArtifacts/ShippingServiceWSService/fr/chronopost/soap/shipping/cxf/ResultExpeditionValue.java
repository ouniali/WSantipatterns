
package fr.chronopost.soap.shipping.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for resultExpeditionValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultExpeditionValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESDFullNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="skybill" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="skybillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultExpeditionValue", propOrder = {
    "esdFullNumber",
    "esdNumber",
    "errorCode",
    "errorMessage",
    "pickupDate",
    "skybill",
    "skybillNumber"
})
public class ResultExpeditionValue {

    @XmlElement(name = "ESDFullNumber")
    protected String esdFullNumber;
    @XmlElement(name = "ESDNumber")
    protected String esdNumber;
    protected int errorCode;
    protected String errorMessage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupDate;
    protected byte[] skybill;
    protected String skybillNumber;

    /**
     * Gets the value of the esdFullNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESDFullNumber() {
        return esdFullNumber;
    }

    /**
     * Sets the value of the esdFullNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESDFullNumber(String value) {
        this.esdFullNumber = value;
    }

    /**
     * Gets the value of the esdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESDNumber() {
        return esdNumber;
    }

    /**
     * Sets the value of the esdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESDNumber(String value) {
        this.esdNumber = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the pickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupDate() {
        return pickupDate;
    }

    /**
     * Sets the value of the pickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupDate(XMLGregorianCalendar value) {
        this.pickupDate = value;
    }

    /**
     * Gets the value of the skybill property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSkybill() {
        return skybill;
    }

    /**
     * Sets the value of the skybill property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSkybill(byte[] value) {
        this.skybill = value;
    }

    /**
     * Gets the value of the skybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkybillNumber() {
        return skybillNumber;
    }

    /**
     * Sets the value of the skybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkybillNumber(String value) {
        this.skybillNumber = value;
    }

}
