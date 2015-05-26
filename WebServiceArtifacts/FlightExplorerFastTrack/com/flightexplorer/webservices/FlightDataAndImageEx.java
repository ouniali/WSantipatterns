
package com.flightexplorer.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightDataAndImageEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightDataAndImageEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="OriginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginTemp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OriginWindSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OriginWindDir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginWeatherDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationTemp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DestinationWindSpeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DestinationWindDir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationWeatherDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDataAndImageEx", propOrder = {
    "response",
    "status",
    "imagePath",
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
    "airlineName",
    "originName",
    "originLocation",
    "originTime",
    "originTemp",
    "originWindSpeed",
    "originWindDir",
    "originWeatherDesc",
    "destinationName",
    "destinationLocation",
    "destinationTime",
    "destinationTemp",
    "destinationWindSpeed",
    "destinationWindDir",
    "destinationWeatherDesc"
})
public class FlightDataAndImageEx {

    @XmlElement(name = "Response")
    protected int response;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ImagePath")
    protected String imagePath;
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
    @XmlElement(name = "OriginName")
    protected String originName;
    @XmlElement(name = "OriginLocation")
    protected String originLocation;
    @XmlElement(name = "OriginTime")
    protected String originTime;
    @XmlElement(name = "OriginTemp")
    protected int originTemp;
    @XmlElement(name = "OriginWindSpeed")
    protected int originWindSpeed;
    @XmlElement(name = "OriginWindDir")
    protected String originWindDir;
    @XmlElement(name = "OriginWeatherDesc")
    protected String originWeatherDesc;
    @XmlElement(name = "DestinationName")
    protected String destinationName;
    @XmlElement(name = "DestinationLocation")
    protected String destinationLocation;
    @XmlElement(name = "DestinationTime")
    protected String destinationTime;
    @XmlElement(name = "DestinationTemp")
    protected int destinationTemp;
    @XmlElement(name = "DestinationWindSpeed")
    protected int destinationWindSpeed;
    @XmlElement(name = "DestinationWindDir")
    protected String destinationWindDir;
    @XmlElement(name = "DestinationWeatherDesc")
    protected String destinationWeatherDesc;

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
     * Gets the value of the imagePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Sets the value of the imagePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath(String value) {
        this.imagePath = value;
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
     * Gets the value of the originLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginLocation() {
        return originLocation;
    }

    /**
     * Sets the value of the originLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginLocation(String value) {
        this.originLocation = value;
    }

    /**
     * Gets the value of the originTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginTime() {
        return originTime;
    }

    /**
     * Sets the value of the originTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginTime(String value) {
        this.originTime = value;
    }

    /**
     * Gets the value of the originTemp property.
     * 
     */
    public int getOriginTemp() {
        return originTemp;
    }

    /**
     * Sets the value of the originTemp property.
     * 
     */
    public void setOriginTemp(int value) {
        this.originTemp = value;
    }

    /**
     * Gets the value of the originWindSpeed property.
     * 
     */
    public int getOriginWindSpeed() {
        return originWindSpeed;
    }

    /**
     * Sets the value of the originWindSpeed property.
     * 
     */
    public void setOriginWindSpeed(int value) {
        this.originWindSpeed = value;
    }

    /**
     * Gets the value of the originWindDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginWindDir() {
        return originWindDir;
    }

    /**
     * Sets the value of the originWindDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginWindDir(String value) {
        this.originWindDir = value;
    }

    /**
     * Gets the value of the originWeatherDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginWeatherDesc() {
        return originWeatherDesc;
    }

    /**
     * Sets the value of the originWeatherDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginWeatherDesc(String value) {
        this.originWeatherDesc = value;
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
     * Gets the value of the destinationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLocation() {
        return destinationLocation;
    }

    /**
     * Sets the value of the destinationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLocation(String value) {
        this.destinationLocation = value;
    }

    /**
     * Gets the value of the destinationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationTime() {
        return destinationTime;
    }

    /**
     * Sets the value of the destinationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationTime(String value) {
        this.destinationTime = value;
    }

    /**
     * Gets the value of the destinationTemp property.
     * 
     */
    public int getDestinationTemp() {
        return destinationTemp;
    }

    /**
     * Sets the value of the destinationTemp property.
     * 
     */
    public void setDestinationTemp(int value) {
        this.destinationTemp = value;
    }

    /**
     * Gets the value of the destinationWindSpeed property.
     * 
     */
    public int getDestinationWindSpeed() {
        return destinationWindSpeed;
    }

    /**
     * Sets the value of the destinationWindSpeed property.
     * 
     */
    public void setDestinationWindSpeed(int value) {
        this.destinationWindSpeed = value;
    }

    /**
     * Gets the value of the destinationWindDir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationWindDir() {
        return destinationWindDir;
    }

    /**
     * Sets the value of the destinationWindDir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationWindDir(String value) {
        this.destinationWindDir = value;
    }

    /**
     * Gets the value of the destinationWeatherDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationWeatherDesc() {
        return destinationWeatherDesc;
    }

    /**
     * Sets the value of the destinationWeatherDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationWeatherDesc(String value) {
        this.destinationWeatherDesc = value;
    }

}
