
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PR_BookingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PR_BookingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConditionsOfUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingSummaryMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PR_BookingInformationType", propOrder = {
    "bookingTerms",
    "conditionsOfUse",
    "bookingSummaryMessage"
})
public class PRBookingInformationType {

    @XmlElement(name = "BookingTerms")
    protected String bookingTerms;
    @XmlElement(name = "ConditionsOfUse")
    protected String conditionsOfUse;
    @XmlElement(name = "BookingSummaryMessage")
    protected String bookingSummaryMessage;

    /**
     * Gets the value of the bookingTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTerms() {
        return bookingTerms;
    }

    /**
     * Sets the value of the bookingTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingTerms(String value) {
        this.bookingTerms = value;
    }

    /**
     * Gets the value of the conditionsOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionsOfUse() {
        return conditionsOfUse;
    }

    /**
     * Sets the value of the conditionsOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionsOfUse(String value) {
        this.conditionsOfUse = value;
    }

    /**
     * Gets the value of the bookingSummaryMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingSummaryMessage() {
        return bookingSummaryMessage;
    }

    /**
     * Sets the value of the bookingSummaryMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingSummaryMessage(String value) {
        this.bookingSummaryMessage = value;
    }

}
