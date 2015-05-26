
package fr.chronopost.soap.shipping.cxf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for resultReservationMultiParcelExpeditionValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultReservationMultiParcelExpeditionValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ESDFullNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ESDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reservationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultParcelValue" type="{http://cxf.shipping.soap.chronopost.fr/}resultParcelValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultReservationMultiParcelExpeditionValue", propOrder = {
    "esdFullNumber",
    "esdNumber",
    "errorCode",
    "errorMessage",
    "pickupDate",
    "reservationNumber",
    "resultParcelValue"
})
public class ResultReservationMultiParcelExpeditionValue {

    @XmlElement(name = "ESDFullNumber")
    protected String esdFullNumber;
    @XmlElement(name = "ESDNumber")
    protected String esdNumber;
    protected int errorCode;
    protected String errorMessage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupDate;
    protected String reservationNumber;
    @XmlElement(nillable = true)
    protected List<ResultParcelValue> resultParcelValue;

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
     * Gets the value of the reservationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationNumber() {
        return reservationNumber;
    }

    /**
     * Sets the value of the reservationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationNumber(String value) {
        this.reservationNumber = value;
    }

    /**
     * Gets the value of the resultParcelValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultParcelValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultParcelValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultParcelValue }
     * 
     * 
     */
    public List<ResultParcelValue> getResultParcelValue() {
        if (resultParcelValue == null) {
            resultParcelValue = new ArrayList<ResultParcelValue>();
        }
        return this.resultParcelValue;
    }

}
