
package com.flightexplorer.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Altitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AircraftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lat" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Lon" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Bearing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ETA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PTA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AircraftName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightData", propOrder = {
    "response",
    "status",
    "origin",
    "destination",
    "speed",
    "altitude",
    "aircraftType",
    "lat",
    "lon",
    "distance",
    "bearing",
    "edt",
    "eta",
    "pdt",
    "pta",
    "aircraftName",
    "airlineName"
})
public class FlightData {

    @XmlElement(name = "Response")
    protected int response;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "Speed")
    protected int speed;
    @XmlElement(name = "Altitude")
    protected int altitude;
    @XmlElement(name = "AircraftType")
    protected String aircraftType;
    @XmlElement(name = "Lat")
    protected double lat;
    @XmlElement(name = "Lon")
    protected double lon;
    @XmlElement(name = "Distance")
    protected int distance;
    @XmlElement(name = "Bearing")
    protected String bearing;
    @XmlElement(name = "EDT")
    protected String edt;
    @XmlElement(name = "ETA")
    protected String eta;
    @XmlElement(name = "PDT")
    protected String pdt;
    @XmlElement(name = "PTA")
    protected String pta;
    @XmlElement(name = "AircraftName")
    protected String aircraftName;
    @XmlElement(name = "AirlineName")
    protected String airlineName;

    /**
     * Gets the value of the response property.
     * 
     */
    public int getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     */
    public void setResponse(int value) {
        this.response = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the speed property.
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     */
    public int getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     */
    public void setAltitude(int value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the aircraftType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftType() {
        return aircraftType;
    }

    /**
     * Sets the value of the aircraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftType(String value) {
        this.aircraftType = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     */
    public double getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     */
    public void setLat(double value) {
        this.lat = value;
    }

    /**
     * Gets the value of the lon property.
     * 
     */
    public double getLon() {
        return lon;
    }

    /**
     * Sets the value of the lon property.
     * 
     */
    public void setLon(double value) {
        this.lon = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     */
    public int getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    public void setDistance(int value) {
        this.distance = value;
    }

    /**
     * Gets the value of the bearing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBearing() {
        return bearing;
    }

    /**
     * Sets the value of the bearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBearing(String value) {
        this.bearing = value;
    }

    /**
     * Gets the value of the edt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDT() {
        return edt;
    }

    /**
     * Sets the value of the edt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDT(String value) {
        this.edt = value;
    }

    /**
     * Gets the value of the eta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETA() {
        return eta;
    }

    /**
     * Sets the value of the eta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETA(String value) {
        this.eta = value;
    }

    /**
     * Gets the value of the pdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDT() {
        return pdt;
    }

    /**
     * Sets the value of the pdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDT(String value) {
        this.pdt = value;
    }

    /**
     * Gets the value of the pta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTA() {
        return pta;
    }

    /**
     * Sets the value of the pta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTA(String value) {
        this.pta = value;
    }

    /**
     * Gets the value of the aircraftName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftName() {
        return aircraftName;
    }

    /**
     * Sets the value of the aircraftName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftName(String value) {
        this.aircraftName = value;
    }

    /**
     * Gets the value of the airlineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineName() {
        return airlineName;
    }

    /**
     * Sets the value of the airlineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineName(String value) {
        this.airlineName = value;
    }

}
