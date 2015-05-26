
package com.conducivetech.cache.delayindex.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for delayIndexV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delayIndexV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airport" type="{http://v1.service.delayindex.cache.conducivetech.com/}airportV1"/>
 *         &lt;element name="rawScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="normalizedScore" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flights" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="observations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="canceled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="onTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="delayed15" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="delayed30" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="delayed45" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="delta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delayIndexV1", propOrder = {
    "airport",
    "rawScore",
    "normalizedScore",
    "dateStart",
    "dateEnd",
    "flights",
    "observations",
    "canceled",
    "onTime",
    "delayed15",
    "delayed30",
    "delayed45",
    "delta"
})
public class DelayIndexV1 {

    @XmlElement(required = true)
    protected AirportV1 airport;
    protected double rawScore;
    protected double normalizedScore;
    @XmlElement(required = true)
    protected String dateStart;
    @XmlElement(required = true)
    protected String dateEnd;
    protected int flights;
    protected int observations;
    protected int canceled;
    protected int onTime;
    protected int delayed15;
    protected int delayed30;
    protected int delayed45;
    protected double delta;

    /**
     * Gets the value of the airport property.
     * 
     * @return
     *     possible object is
     *     {@link AirportV1 }
     *     
     */
    public AirportV1 getAirport() {
        return airport;
    }

    /**
     * Sets the value of the airport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportV1 }
     *     
     */
    public void setAirport(AirportV1 value) {
        this.airport = value;
    }

    /**
     * Gets the value of the rawScore property.
     * 
     */
    public double getRawScore() {
        return rawScore;
    }

    /**
     * Sets the value of the rawScore property.
     * 
     */
    public void setRawScore(double value) {
        this.rawScore = value;
    }

    /**
     * Gets the value of the normalizedScore property.
     * 
     */
    public double getNormalizedScore() {
        return normalizedScore;
    }

    /**
     * Sets the value of the normalizedScore property.
     * 
     */
    public void setNormalizedScore(double value) {
        this.normalizedScore = value;
    }

    /**
     * Gets the value of the dateStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateStart() {
        return dateStart;
    }

    /**
     * Sets the value of the dateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateStart(String value) {
        this.dateStart = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEnd(String value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the flights property.
     * 
     */
    public int getFlights() {
        return flights;
    }

    /**
     * Sets the value of the flights property.
     * 
     */
    public void setFlights(int value) {
        this.flights = value;
    }

    /**
     * Gets the value of the observations property.
     * 
     */
    public int getObservations() {
        return observations;
    }

    /**
     * Sets the value of the observations property.
     * 
     */
    public void setObservations(int value) {
        this.observations = value;
    }

    /**
     * Gets the value of the canceled property.
     * 
     */
    public int getCanceled() {
        return canceled;
    }

    /**
     * Sets the value of the canceled property.
     * 
     */
    public void setCanceled(int value) {
        this.canceled = value;
    }

    /**
     * Gets the value of the onTime property.
     * 
     */
    public int getOnTime() {
        return onTime;
    }

    /**
     * Sets the value of the onTime property.
     * 
     */
    public void setOnTime(int value) {
        this.onTime = value;
    }

    /**
     * Gets the value of the delayed15 property.
     * 
     */
    public int getDelayed15() {
        return delayed15;
    }

    /**
     * Sets the value of the delayed15 property.
     * 
     */
    public void setDelayed15(int value) {
        this.delayed15 = value;
    }

    /**
     * Gets the value of the delayed30 property.
     * 
     */
    public int getDelayed30() {
        return delayed30;
    }

    /**
     * Sets the value of the delayed30 property.
     * 
     */
    public void setDelayed30(int value) {
        this.delayed30 = value;
    }

    /**
     * Gets the value of the delayed45 property.
     * 
     */
    public int getDelayed45() {
        return delayed45;
    }

    /**
     * Sets the value of the delayed45 property.
     * 
     */
    public void setDelayed45(int value) {
        this.delayed45 = value;
    }

    /**
     * Gets the value of the delta property.
     * 
     */
    public double getDelta() {
        return delta;
    }

    /**
     * Sets the value of the delta property.
     * 
     */
    public void setDelta(double value) {
        this.delta = value;
    }

}
