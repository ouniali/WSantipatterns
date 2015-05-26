
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightExStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightExStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faFlightID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aircrafttype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filed_ete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filed_time" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filed_departuretime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filed_airspeed_kts" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="filed_airspeed_mach" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filed_altitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="route" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actualdeparturetime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="estimatedarrivaltime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="actualarrivaltime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="diverted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destinationCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightExStruct", propOrder = {
    "faFlightID",
    "ident",
    "aircrafttype",
    "filedEte",
    "filedTime",
    "filedDeparturetime",
    "filedAirspeedKts",
    "filedAirspeedMach",
    "filedAltitude",
    "route",
    "actualdeparturetime",
    "estimatedarrivaltime",
    "actualarrivaltime",
    "diverted",
    "origin",
    "destination",
    "originName",
    "originCity",
    "destinationName",
    "destinationCity"
})
public class FlightExStruct {

    @XmlElement(required = true)
    protected String faFlightID;
    @XmlElement(required = true)
    protected String ident;
    @XmlElement(required = true)
    protected String aircrafttype;
    @XmlElement(name = "filed_ete", required = true)
    protected String filedEte;
    @XmlElement(name = "filed_time")
    protected int filedTime;
    @XmlElement(name = "filed_departuretime")
    protected int filedDeparturetime;
    @XmlElement(name = "filed_airspeed_kts")
    protected int filedAirspeedKts;
    @XmlElement(name = "filed_airspeed_mach", required = true)
    protected String filedAirspeedMach;
    @XmlElement(name = "filed_altitude")
    protected int filedAltitude;
    @XmlElement(required = true)
    protected String route;
    protected int actualdeparturetime;
    protected int estimatedarrivaltime;
    protected int actualarrivaltime;
    @XmlElement(required = true)
    protected String diverted;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String originName;
    @XmlElement(required = true)
    protected String originCity;
    @XmlElement(required = true)
    protected String destinationName;
    @XmlElement(required = true)
    protected String destinationCity;

    /**
     * Gets the value of the faFlightID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaFlightID() {
        return faFlightID;
    }

    /**
     * Sets the value of the faFlightID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaFlightID(String value) {
        this.faFlightID = value;
    }

    /**
     * Gets the value of the ident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Sets the value of the ident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

    /**
     * Gets the value of the aircrafttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircrafttype() {
        return aircrafttype;
    }

    /**
     * Sets the value of the aircrafttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircrafttype(String value) {
        this.aircrafttype = value;
    }

    /**
     * Gets the value of the filedEte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledEte() {
        return filedEte;
    }

    /**
     * Sets the value of the filedEte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledEte(String value) {
        this.filedEte = value;
    }

    /**
     * Gets the value of the filedTime property.
     * 
     */
    public int getFiledTime() {
        return filedTime;
    }

    /**
     * Sets the value of the filedTime property.
     * 
     */
    public void setFiledTime(int value) {
        this.filedTime = value;
    }

    /**
     * Gets the value of the filedDeparturetime property.
     * 
     */
    public int getFiledDeparturetime() {
        return filedDeparturetime;
    }

    /**
     * Sets the value of the filedDeparturetime property.
     * 
     */
    public void setFiledDeparturetime(int value) {
        this.filedDeparturetime = value;
    }

    /**
     * Gets the value of the filedAirspeedKts property.
     * 
     */
    public int getFiledAirspeedKts() {
        return filedAirspeedKts;
    }

    /**
     * Sets the value of the filedAirspeedKts property.
     * 
     */
    public void setFiledAirspeedKts(int value) {
        this.filedAirspeedKts = value;
    }

    /**
     * Gets the value of the filedAirspeedMach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledAirspeedMach() {
        return filedAirspeedMach;
    }

    /**
     * Sets the value of the filedAirspeedMach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledAirspeedMach(String value) {
        this.filedAirspeedMach = value;
    }

    /**
     * Gets the value of the filedAltitude property.
     * 
     */
    public int getFiledAltitude() {
        return filedAltitude;
    }

    /**
     * Sets the value of the filedAltitude property.
     * 
     */
    public void setFiledAltitude(int value) {
        this.filedAltitude = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the actualdeparturetime property.
     * 
     */
    public int getActualdeparturetime() {
        return actualdeparturetime;
    }

    /**
     * Sets the value of the actualdeparturetime property.
     * 
     */
    public void setActualdeparturetime(int value) {
        this.actualdeparturetime = value;
    }

    /**
     * Gets the value of the estimatedarrivaltime property.
     * 
     */
    public int getEstimatedarrivaltime() {
        return estimatedarrivaltime;
    }

    /**
     * Sets the value of the estimatedarrivaltime property.
     * 
     */
    public void setEstimatedarrivaltime(int value) {
        this.estimatedarrivaltime = value;
    }

    /**
     * Gets the value of the actualarrivaltime property.
     * 
     */
    public int getActualarrivaltime() {
        return actualarrivaltime;
    }

    /**
     * Sets the value of the actualarrivaltime property.
     * 
     */
    public void setActualarrivaltime(int value) {
        this.actualarrivaltime = value;
    }

    /**
     * Gets the value of the diverted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiverted() {
        return diverted;
    }

    /**
     * Sets the value of the diverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiverted(String value) {
        this.diverted = value;
    }

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
     * Gets the value of the originName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginName() {
        return originName;
    }

    /**
     * Sets the value of the originName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginName(String value) {
        this.originName = value;
    }

    /**
     * Gets the value of the originCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCity() {
        return originCity;
    }

    /**
     * Sets the value of the originCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCity(String value) {
        this.originCity = value;
    }

    /**
     * Gets the value of the destinationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationName() {
        return destinationName;
    }

    /**
     * Sets the value of the destinationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationName(String value) {
        this.destinationName = value;
    }

    /**
     * Gets the value of the destinationCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCity() {
        return destinationCity;
    }

    /**
     * Sets the value of the destinationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCity(String value) {
        this.destinationCity = value;
    }

}
