
package com.conducivetech.cache.ratings.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ratingV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ratingV1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureAirport" type="{http://v1.service.ratings.cache.conducivetech.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="departureAirportFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalAirport" type="{http://v1.service.ratings.cache.conducivetech.com/}airportV1" minOccurs="0"/>
 *         &lt;element name="arrivalAirportFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airline" type="{http://v1.service.ratings.cache.conducivetech.com/}airlineV1" minOccurs="0"/>
 *         &lt;element name="airlineFsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeshares" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="directs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="observations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ontime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="late15" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="late30" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="late45" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cancelled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="diverted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ontimePercent" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="delayObservations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="delayMean" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="delayStandardDeviation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="delayMin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="delayMax" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="allOntimeCumulative" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="allOntimeStars" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="allDelayCumulative" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="allDelayStars" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="allStars" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ratingV1", propOrder = {
    "departureAirport",
    "departureAirportFsCode",
    "arrivalAirport",
    "arrivalAirportFsCode",
    "airline",
    "airlineFsCode",
    "flightNumber",
    "codeshares",
    "directs",
    "observations",
    "ontime",
    "late15",
    "late30",
    "late45",
    "cancelled",
    "diverted",
    "ontimePercent",
    "delayObservations",
    "delayMean",
    "delayStandardDeviation",
    "delayMin",
    "delayMax",
    "allOntimeCumulative",
    "allOntimeStars",
    "allDelayCumulative",
    "allDelayStars",
    "allStars"
})
public class RatingV1 {

    protected AirportV1 departureAirport;
    protected String departureAirportFsCode;
    protected AirportV1 arrivalAirport;
    protected String arrivalAirportFsCode;
    protected AirlineV1 airline;
    protected String airlineFsCode;
    protected String flightNumber;
    protected int codeshares;
    protected int directs;
    protected int observations;
    protected int ontime;
    protected int late15;
    protected int late30;
    protected int late45;
    protected int cancelled;
    protected int diverted;
    protected double ontimePercent;
    protected int delayObservations;
    protected double delayMean;
    protected double delayStandardDeviation;
    protected int delayMin;
    protected int delayMax;
    protected double allOntimeCumulative;
    protected double allOntimeStars;
    protected double allDelayCumulative;
    protected double allDelayStars;
    protected double allStars;

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link AirportV1 }
     *     
     */
    public AirportV1 getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportV1 }
     *     
     */
    public void setDepartureAirport(AirportV1 value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the departureAirportFsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirportFsCode() {
        return departureAirportFsCode;
    }

    /**
     * Sets the value of the departureAirportFsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirportFsCode(String value) {
        this.departureAirportFsCode = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link AirportV1 }
     *     
     */
    public AirportV1 getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportV1 }
     *     
     */
    public void setArrivalAirport(AirportV1 value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the arrivalAirportFsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirportFsCode() {
        return arrivalAirportFsCode;
    }

    /**
     * Sets the value of the arrivalAirportFsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirportFsCode(String value) {
        this.arrivalAirportFsCode = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineV1 }
     *     
     */
    public AirlineV1 getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineV1 }
     *     
     */
    public void setAirline(AirlineV1 value) {
        this.airline = value;
    }

    /**
     * Gets the value of the airlineFsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineFsCode() {
        return airlineFsCode;
    }

    /**
     * Sets the value of the airlineFsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineFsCode(String value) {
        this.airlineFsCode = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the codeshares property.
     * 
     */
    public int getCodeshares() {
        return codeshares;
    }

    /**
     * Sets the value of the codeshares property.
     * 
     */
    public void setCodeshares(int value) {
        this.codeshares = value;
    }

    /**
     * Gets the value of the directs property.
     * 
     */
    public int getDirects() {
        return directs;
    }

    /**
     * Sets the value of the directs property.
     * 
     */
    public void setDirects(int value) {
        this.directs = value;
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
     * Gets the value of the ontime property.
     * 
     */
    public int getOntime() {
        return ontime;
    }

    /**
     * Sets the value of the ontime property.
     * 
     */
    public void setOntime(int value) {
        this.ontime = value;
    }

    /**
     * Gets the value of the late15 property.
     * 
     */
    public int getLate15() {
        return late15;
    }

    /**
     * Sets the value of the late15 property.
     * 
     */
    public void setLate15(int value) {
        this.late15 = value;
    }

    /**
     * Gets the value of the late30 property.
     * 
     */
    public int getLate30() {
        return late30;
    }

    /**
     * Sets the value of the late30 property.
     * 
     */
    public void setLate30(int value) {
        this.late30 = value;
    }

    /**
     * Gets the value of the late45 property.
     * 
     */
    public int getLate45() {
        return late45;
    }

    /**
     * Sets the value of the late45 property.
     * 
     */
    public void setLate45(int value) {
        this.late45 = value;
    }

    /**
     * Gets the value of the cancelled property.
     * 
     */
    public int getCancelled() {
        return cancelled;
    }

    /**
     * Sets the value of the cancelled property.
     * 
     */
    public void setCancelled(int value) {
        this.cancelled = value;
    }

    /**
     * Gets the value of the diverted property.
     * 
     */
    public int getDiverted() {
        return diverted;
    }

    /**
     * Sets the value of the diverted property.
     * 
     */
    public void setDiverted(int value) {
        this.diverted = value;
    }

    /**
     * Gets the value of the ontimePercent property.
     * 
     */
    public double getOntimePercent() {
        return ontimePercent;
    }

    /**
     * Sets the value of the ontimePercent property.
     * 
     */
    public void setOntimePercent(double value) {
        this.ontimePercent = value;
    }

    /**
     * Gets the value of the delayObservations property.
     * 
     */
    public int getDelayObservations() {
        return delayObservations;
    }

    /**
     * Sets the value of the delayObservations property.
     * 
     */
    public void setDelayObservations(int value) {
        this.delayObservations = value;
    }

    /**
     * Gets the value of the delayMean property.
     * 
     */
    public double getDelayMean() {
        return delayMean;
    }

    /**
     * Sets the value of the delayMean property.
     * 
     */
    public void setDelayMean(double value) {
        this.delayMean = value;
    }

    /**
     * Gets the value of the delayStandardDeviation property.
     * 
     */
    public double getDelayStandardDeviation() {
        return delayStandardDeviation;
    }

    /**
     * Sets the value of the delayStandardDeviation property.
     * 
     */
    public void setDelayStandardDeviation(double value) {
        this.delayStandardDeviation = value;
    }

    /**
     * Gets the value of the delayMin property.
     * 
     */
    public int getDelayMin() {
        return delayMin;
    }

    /**
     * Sets the value of the delayMin property.
     * 
     */
    public void setDelayMin(int value) {
        this.delayMin = value;
    }

    /**
     * Gets the value of the delayMax property.
     * 
     */
    public int getDelayMax() {
        return delayMax;
    }

    /**
     * Sets the value of the delayMax property.
     * 
     */
    public void setDelayMax(int value) {
        this.delayMax = value;
    }

    /**
     * Gets the value of the allOntimeCumulative property.
     * 
     */
    public double getAllOntimeCumulative() {
        return allOntimeCumulative;
    }

    /**
     * Sets the value of the allOntimeCumulative property.
     * 
     */
    public void setAllOntimeCumulative(double value) {
        this.allOntimeCumulative = value;
    }

    /**
     * Gets the value of the allOntimeStars property.
     * 
     */
    public double getAllOntimeStars() {
        return allOntimeStars;
    }

    /**
     * Sets the value of the allOntimeStars property.
     * 
     */
    public void setAllOntimeStars(double value) {
        this.allOntimeStars = value;
    }

    /**
     * Gets the value of the allDelayCumulative property.
     * 
     */
    public double getAllDelayCumulative() {
        return allDelayCumulative;
    }

    /**
     * Sets the value of the allDelayCumulative property.
     * 
     */
    public void setAllDelayCumulative(double value) {
        this.allDelayCumulative = value;
    }

    /**
     * Gets the value of the allDelayStars property.
     * 
     */
    public double getAllDelayStars() {
        return allDelayStars;
    }

    /**
     * Sets the value of the allDelayStars property.
     * 
     */
    public void setAllDelayStars(double value) {
        this.allDelayStars = value;
    }

    /**
     * Gets the value of the allStars property.
     * 
     */
    public double getAllStars() {
        return allStars;
    }

    /**
     * Sets the value of the allStars property.
     * 
     */
    public void setAllStars(double value) {
        this.allStars = value;
    }

}
