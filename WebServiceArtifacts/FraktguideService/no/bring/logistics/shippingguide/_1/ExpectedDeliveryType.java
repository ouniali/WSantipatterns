
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpectedDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpectedDeliveryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkingDays" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpectedDeliveryDate" type="{http://www.bring.no/logistics/shippingguide/1.0}DateAndTimeType" minOccurs="0"/>
 *         &lt;element name="AlternativeDeliveryDates" type="{http://www.bring.no/logistics/shippingguide/1.0}AlternativeDeliveryDatesType" minOccurs="0"/>
 *         &lt;element name="FormattedEarliestPickupDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EarliestPickupDate" type="{http://www.bring.no/logistics/shippingguide/1.0}DateAndTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedDeliveryType", propOrder = {
    "workingDays",
    "userMessage",
    "formattedExpectedDeliveryDate",
    "expectedDeliveryDate",
    "alternativeDeliveryDates",
    "formattedEarliestPickupDate",
    "earliestPickupDate"
})
public class ExpectedDeliveryType {

    @XmlElement(name = "WorkingDays", required = true)
    protected String workingDays;
    @XmlElement(name = "UserMessage")
    protected String userMessage;
    @XmlElement(name = "FormattedExpectedDeliveryDate")
    protected String formattedExpectedDeliveryDate;
    @XmlElement(name = "ExpectedDeliveryDate")
    protected DateAndTimeType expectedDeliveryDate;
    @XmlElement(name = "AlternativeDeliveryDates")
    protected AlternativeDeliveryDatesType alternativeDeliveryDates;
    @XmlElement(name = "FormattedEarliestPickupDate")
    protected String formattedEarliestPickupDate;
    @XmlElement(name = "EarliestPickupDate")
    protected DateAndTimeType earliestPickupDate;

    /**
     * Gets the value of the workingDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingDays() {
        return workingDays;
    }

    /**
     * Sets the value of the workingDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingDays(String value) {
        this.workingDays = value;
    }

    /**
     * Gets the value of the userMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMessage() {
        return userMessage;
    }

    /**
     * Sets the value of the userMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMessage(String value) {
        this.userMessage = value;
    }

    /**
     * Gets the value of the formattedExpectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedExpectedDeliveryDate() {
        return formattedExpectedDeliveryDate;
    }

    /**
     * Sets the value of the formattedExpectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedExpectedDeliveryDate(String value) {
        this.formattedExpectedDeliveryDate = value;
    }

    /**
     * Gets the value of the expectedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeType }
     *     
     */
    public DateAndTimeType getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    /**
     * Sets the value of the expectedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeType }
     *     
     */
    public void setExpectedDeliveryDate(DateAndTimeType value) {
        this.expectedDeliveryDate = value;
    }

    /**
     * Gets the value of the alternativeDeliveryDates property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeDeliveryDatesType }
     *     
     */
    public AlternativeDeliveryDatesType getAlternativeDeliveryDates() {
        return alternativeDeliveryDates;
    }

    /**
     * Sets the value of the alternativeDeliveryDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeDeliveryDatesType }
     *     
     */
    public void setAlternativeDeliveryDates(AlternativeDeliveryDatesType value) {
        this.alternativeDeliveryDates = value;
    }

    /**
     * Gets the value of the formattedEarliestPickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedEarliestPickupDate() {
        return formattedEarliestPickupDate;
    }

    /**
     * Sets the value of the formattedEarliestPickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedEarliestPickupDate(String value) {
        this.formattedEarliestPickupDate = value;
    }

    /**
     * Gets the value of the earliestPickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeType }
     *     
     */
    public DateAndTimeType getEarliestPickupDate() {
        return earliestPickupDate;
    }

    /**
     * Sets the value of the earliestPickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeType }
     *     
     */
    public void setEarliestPickupDate(DateAndTimeType value) {
        this.earliestPickupDate = value;
    }

}
