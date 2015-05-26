
package no.bring.logistics.shippingguide._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternativeDeliveryDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternativeDeliveryDateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingDate" type="{http://www.bring.no/logistics/shippingguide/1.0}DateAndTimeType"/>
 *         &lt;element name="UserMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormattedExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpectedDeliveryDate" type="{http://www.bring.no/logistics/shippingguide/1.0}DateAndTimeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternativeDeliveryDateType", propOrder = {
    "shippingDate",
    "userMessage",
    "formattedExpectedDeliveryDate",
    "expectedDeliveryDate"
})
public class AlternativeDeliveryDateType {

    @XmlElement(name = "ShippingDate", required = true)
    protected DateAndTimeType shippingDate;
    @XmlElement(name = "UserMessage")
    protected String userMessage;
    @XmlElement(name = "FormattedExpectedDeliveryDate")
    protected String formattedExpectedDeliveryDate;
    @XmlElement(name = "ExpectedDeliveryDate", required = true)
    protected DateAndTimeType expectedDeliveryDate;

    /**
     * Gets the value of the shippingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeType }
     *     
     */
    public DateAndTimeType getShippingDate() {
        return shippingDate;
    }

    /**
     * Sets the value of the shippingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeType }
     *     
     */
    public void setShippingDate(DateAndTimeType value) {
        this.shippingDate = value;
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

}
