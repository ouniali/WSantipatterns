
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operationalTimesV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operationalTimesV2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publishedDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="publishedArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="scheduledGateDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="estimatedGateDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="actualGateDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="flightPlanPlannedDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="estimatedRunwayDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="actualRunwayDeparture" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="scheduledGateArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="estimatedGateArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="actualGateArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="flightPlanPlannedArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="estimatedRunwayArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *         &lt;element name="actualRunwayArrival" type="{http://v2.api_internal.flighthistory.cache.conducivetech.com/}dateInfoV2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operationalTimesV2", propOrder = {
    "publishedDeparture",
    "publishedArrival",
    "scheduledGateDeparture",
    "estimatedGateDeparture",
    "actualGateDeparture",
    "flightPlanPlannedDeparture",
    "estimatedRunwayDeparture",
    "actualRunwayDeparture",
    "scheduledGateArrival",
    "estimatedGateArrival",
    "actualGateArrival",
    "flightPlanPlannedArrival",
    "estimatedRunwayArrival",
    "actualRunwayArrival"
})
public class OperationalTimesV2 {

    protected DateInfoV2 publishedDeparture;
    protected DateInfoV2 publishedArrival;
    protected DateInfoV2 scheduledGateDeparture;
    protected DateInfoV2 estimatedGateDeparture;
    protected DateInfoV2 actualGateDeparture;
    protected DateInfoV2 flightPlanPlannedDeparture;
    protected DateInfoV2 estimatedRunwayDeparture;
    protected DateInfoV2 actualRunwayDeparture;
    protected DateInfoV2 scheduledGateArrival;
    protected DateInfoV2 estimatedGateArrival;
    protected DateInfoV2 actualGateArrival;
    protected DateInfoV2 flightPlanPlannedArrival;
    protected DateInfoV2 estimatedRunwayArrival;
    protected DateInfoV2 actualRunwayArrival;

    /**
     * Gets the value of the publishedDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getPublishedDeparture() {
        return publishedDeparture;
    }

    /**
     * Sets the value of the publishedDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setPublishedDeparture(DateInfoV2 value) {
        this.publishedDeparture = value;
    }

    /**
     * Gets the value of the publishedArrival property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getPublishedArrival() {
        return publishedArrival;
    }

    /**
     * Sets the value of the publishedArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setPublishedArrival(DateInfoV2 value) {
        this.publishedArrival = value;
    }

    /**
     * Gets the value of the scheduledGateDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getScheduledGateDeparture() {
        return scheduledGateDeparture;
    }

    /**
     * Sets the value of the scheduledGateDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setScheduledGateDeparture(DateInfoV2 value) {
        this.scheduledGateDeparture = value;
    }

    /**
     * Gets the value of the estimatedGateDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getEstimatedGateDeparture() {
        return estimatedGateDeparture;
    }

    /**
     * Sets the value of the estimatedGateDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setEstimatedGateDeparture(DateInfoV2 value) {
        this.estimatedGateDeparture = value;
    }

    /**
     * Gets the value of the actualGateDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getActualGateDeparture() {
        return actualGateDeparture;
    }

    /**
     * Sets the value of the actualGateDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setActualGateDeparture(DateInfoV2 value) {
        this.actualGateDeparture = value;
    }

    /**
     * Gets the value of the flightPlanPlannedDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getFlightPlanPlannedDeparture() {
        return flightPlanPlannedDeparture;
    }

    /**
     * Sets the value of the flightPlanPlannedDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setFlightPlanPlannedDeparture(DateInfoV2 value) {
        this.flightPlanPlannedDeparture = value;
    }

    /**
     * Gets the value of the estimatedRunwayDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getEstimatedRunwayDeparture() {
        return estimatedRunwayDeparture;
    }

    /**
     * Sets the value of the estimatedRunwayDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setEstimatedRunwayDeparture(DateInfoV2 value) {
        this.estimatedRunwayDeparture = value;
    }

    /**
     * Gets the value of the actualRunwayDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getActualRunwayDeparture() {
        return actualRunwayDeparture;
    }

    /**
     * Sets the value of the actualRunwayDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setActualRunwayDeparture(DateInfoV2 value) {
        this.actualRunwayDeparture = value;
    }

    /**
     * Gets the value of the scheduledGateArrival property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getScheduledGateArrival() {
        return scheduledGateArrival;
    }

    /**
     * Sets the value of the scheduledGateArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setScheduledGateArrival(DateInfoV2 value) {
        this.scheduledGateArrival = value;
    }

    /**
     * Gets the value of the estimatedGateArrival property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getEstimatedGateArrival() {
        return estimatedGateArrival;
    }

    /**
     * Sets the value of the estimatedGateArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setEstimatedGateArrival(DateInfoV2 value) {
        this.estimatedGateArrival = value;
    }

    /**
     * Gets the value of the actualGateArrival property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getActualGateArrival() {
        return actualGateArrival;
    }

    /**
     * Sets the value of the actualGateArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setActualGateArrival(DateInfoV2 value) {
        this.actualGateArrival = value;
    }

    /**
     * Gets the value of the flightPlanPlannedArrival property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getFlightPlanPlannedArrival() {
        return flightPlanPlannedArrival;
    }

    /**
     * Sets the value of the flightPlanPlannedArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setFlightPlanPlannedArrival(DateInfoV2 value) {
        this.flightPlanPlannedArrival = value;
    }

    /**
     * Gets the value of the estimatedRunwayArrival property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getEstimatedRunwayArrival() {
        return estimatedRunwayArrival;
    }

    /**
     * Sets the value of the estimatedRunwayArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setEstimatedRunwayArrival(DateInfoV2 value) {
        this.estimatedRunwayArrival = value;
    }

    /**
     * Gets the value of the actualRunwayArrival property.
     * 
     * @return
     *     possible object is
     *     {@link DateInfoV2 }
     *     
     */
    public DateInfoV2 getActualRunwayArrival() {
        return actualRunwayArrival;
    }

    /**
     * Sets the value of the actualRunwayArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInfoV2 }
     *     
     */
    public void setActualRunwayArrival(DateInfoV2 value) {
        this.actualRunwayArrival = value;
    }

}
