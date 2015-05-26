
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirlineInsightStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineInsightStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="layover" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="opcarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flights_scheduled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flights_performed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_passengers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_seats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_payload" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="total_mail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="percent" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="fare_min" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fare_median" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fare_max" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineInsightStruct", propOrder = {
    "origin",
    "layover",
    "destination",
    "carrier",
    "opcarrier",
    "flightsScheduled",
    "flightsPerformed",
    "totalPassengers",
    "totalSeats",
    "totalPayload",
    "totalMail",
    "percent",
    "fareMin",
    "fareMedian",
    "fareMax"
})
public class AirlineInsightStruct {

    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String layover;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String carrier;
    @XmlElement(required = true)
    protected String opcarrier;
    @XmlElement(name = "flights_scheduled")
    protected int flightsScheduled;
    @XmlElement(name = "flights_performed")
    protected int flightsPerformed;
    @XmlElement(name = "total_passengers")
    protected int totalPassengers;
    @XmlElement(name = "total_seats")
    protected int totalSeats;
    @XmlElement(name = "total_payload")
    protected int totalPayload;
    @XmlElement(name = "total_mail")
    protected int totalMail;
    protected float percent;
    @XmlElement(name = "fare_min", required = true)
    protected String fareMin;
    @XmlElement(name = "fare_median", required = true)
    protected String fareMedian;
    @XmlElement(name = "fare_max", required = true)
    protected String fareMax;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the layover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayover() {
        return layover;
    }

    /**
     * Sets the value of the layover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayover(String value) {
        this.layover = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the opcarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcarrier() {
        return opcarrier;
    }

    /**
     * Sets the value of the opcarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcarrier(String value) {
        this.opcarrier = value;
    }

    /**
     * Gets the value of the flightsScheduled property.
     * 
     */
    public int getFlightsScheduled() {
        return flightsScheduled;
    }

    /**
     * Sets the value of the flightsScheduled property.
     * 
     */
    public void setFlightsScheduled(int value) {
        this.flightsScheduled = value;
    }

    /**
     * Gets the value of the flightsPerformed property.
     * 
     */
    public int getFlightsPerformed() {
        return flightsPerformed;
    }

    /**
     * Sets the value of the flightsPerformed property.
     * 
     */
    public void setFlightsPerformed(int value) {
        this.flightsPerformed = value;
    }

    /**
     * Gets the value of the totalPassengers property.
     * 
     */
    public int getTotalPassengers() {
        return totalPassengers;
    }

    /**
     * Sets the value of the totalPassengers property.
     * 
     */
    public void setTotalPassengers(int value) {
        this.totalPassengers = value;
    }

    /**
     * Gets the value of the totalSeats property.
     * 
     */
    public int getTotalSeats() {
        return totalSeats;
    }

    /**
     * Sets the value of the totalSeats property.
     * 
     */
    public void setTotalSeats(int value) {
        this.totalSeats = value;
    }

    /**
     * Gets the value of the totalPayload property.
     * 
     */
    public int getTotalPayload() {
        return totalPayload;
    }

    /**
     * Sets the value of the totalPayload property.
     * 
     */
    public void setTotalPayload(int value) {
        this.totalPayload = value;
    }

    /**
     * Gets the value of the totalMail property.
     * 
     */
    public int getTotalMail() {
        return totalMail;
    }

    /**
     * Sets the value of the totalMail property.
     * 
     */
    public void setTotalMail(int value) {
        this.totalMail = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     */
    public float getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     */
    public void setPercent(float value) {
        this.percent = value;
    }

    /**
     * Gets the value of the fareMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareMin() {
        return fareMin;
    }

    /**
     * Sets the value of the fareMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareMin(String value) {
        this.fareMin = value;
    }

    /**
     * Gets the value of the fareMedian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareMedian() {
        return fareMedian;
    }

    /**
     * Sets the value of the fareMedian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareMedian(String value) {
        this.fareMedian = value;
    }

    /**
     * Gets the value of the fareMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareMax() {
        return fareMax;
    }

    /**
     * Sets the value of the fareMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareMax(String value) {
        this.fareMax = value;
    }

}
