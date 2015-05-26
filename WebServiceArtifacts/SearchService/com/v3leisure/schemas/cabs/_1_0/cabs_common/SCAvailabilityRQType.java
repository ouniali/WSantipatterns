
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SC_AvailabilityRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC_AvailabilityRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LengthNights" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_LengthNightsType" minOccurs="0"/>
 *         &lt;element name="LengthDays" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_LengthDaysType" minOccurs="0"/>
 *         &lt;element name="CommencingWindow" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_DateWindowRQType" minOccurs="0"/>
 *         &lt;element name="CommencingSpecific" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_DateSpecificType" minOccurs="0"/>
 *         &lt;element name="Consumers" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfSC_ConsumerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SC_AvailabilityRQType", propOrder = {
    "lengthNights",
    "lengthDays",
    "commencingWindow",
    "commencingSpecific",
    "consumers"
})
public class SCAvailabilityRQType {

    @XmlElement(name = "LengthNights")
    protected SCLengthNightsType lengthNights;
    @XmlElement(name = "LengthDays")
    protected SCLengthDaysType lengthDays;
    @XmlElement(name = "CommencingWindow")
    protected SCDateWindowRQType commencingWindow;
    @XmlElement(name = "CommencingSpecific")
    protected SCDateSpecificType commencingSpecific;
    @XmlElement(name = "Consumers")
    protected ArrayOfSCConsumerType consumers;

    /**
     * Gets the value of the lengthNights property.
     * 
     * @return
     *     possible object is
     *     {@link SCLengthNightsType }
     *     
     */
    public SCLengthNightsType getLengthNights() {
        return lengthNights;
    }

    /**
     * Sets the value of the lengthNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCLengthNightsType }
     *     
     */
    public void setLengthNights(SCLengthNightsType value) {
        this.lengthNights = value;
    }

    /**
     * Gets the value of the lengthDays property.
     * 
     * @return
     *     possible object is
     *     {@link SCLengthDaysType }
     *     
     */
    public SCLengthDaysType getLengthDays() {
        return lengthDays;
    }

    /**
     * Sets the value of the lengthDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCLengthDaysType }
     *     
     */
    public void setLengthDays(SCLengthDaysType value) {
        this.lengthDays = value;
    }

    /**
     * Gets the value of the commencingWindow property.
     * 
     * @return
     *     possible object is
     *     {@link SCDateWindowRQType }
     *     
     */
    public SCDateWindowRQType getCommencingWindow() {
        return commencingWindow;
    }

    /**
     * Sets the value of the commencingWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCDateWindowRQType }
     *     
     */
    public void setCommencingWindow(SCDateWindowRQType value) {
        this.commencingWindow = value;
    }

    /**
     * Gets the value of the commencingSpecific property.
     * 
     * @return
     *     possible object is
     *     {@link SCDateSpecificType }
     *     
     */
    public SCDateSpecificType getCommencingSpecific() {
        return commencingSpecific;
    }

    /**
     * Sets the value of the commencingSpecific property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCDateSpecificType }
     *     
     */
    public void setCommencingSpecific(SCDateSpecificType value) {
        this.commencingSpecific = value;
    }

    /**
     * Gets the value of the consumers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSCConsumerType }
     *     
     */
    public ArrayOfSCConsumerType getConsumers() {
        return consumers;
    }

    /**
     * Sets the value of the consumers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSCConsumerType }
     *     
     */
    public void setConsumers(ArrayOfSCConsumerType value) {
        this.consumers = value;
    }

}
