
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InFlightAircraftStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InFlightAircraftStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faFlightID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ident" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstPositionTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arrivalTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="lowLongitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="lowLatitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="highLongitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="highLatitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="groundspeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="altitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="heading" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="altitudeStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="updateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="altitudeChange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="waypoints" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InFlightAircraftStruct", propOrder = {
    "faFlightID",
    "ident",
    "prefix",
    "type",
    "suffix",
    "origin",
    "destination",
    "timeout",
    "timestamp",
    "departureTime",
    "firstPositionTime",
    "arrivalTime",
    "longitude",
    "latitude",
    "lowLongitude",
    "lowLatitude",
    "highLongitude",
    "highLatitude",
    "groundspeed",
    "altitude",
    "heading",
    "altitudeStatus",
    "updateType",
    "altitudeChange",
    "waypoints"
})
public class InFlightAircraftStruct {

    @XmlElement(required = true)
    protected String faFlightID;
    @XmlElement(required = true)
    protected String ident;
    @XmlElement(required = true)
    protected String prefix;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String suffix;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String timeout;
    protected int timestamp;
    protected int departureTime;
    protected int firstPositionTime;
    protected int arrivalTime;
    protected float longitude;
    protected float latitude;
    protected float lowLongitude;
    protected float lowLatitude;
    protected float highLongitude;
    protected float highLatitude;
    protected int groundspeed;
    protected int altitude;
    protected int heading;
    @XmlElement(required = true)
    protected String altitudeStatus;
    @XmlElement(required = true)
    protected String updateType;
    @XmlElement(required = true)
    protected String altitudeChange;
    @XmlElement(required = true)
    protected String waypoints;

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
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
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
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeout(String value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     */
    public int getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     */
    public void setTimestamp(int value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     */
    public int getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     */
    public void setDepartureTime(int value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the firstPositionTime property.
     * 
     */
    public int getFirstPositionTime() {
        return firstPositionTime;
    }

    /**
     * Sets the value of the firstPositionTime property.
     * 
     */
    public void setFirstPositionTime(int value) {
        this.firstPositionTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     */
    public void setArrivalTime(int value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(float value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(float value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the lowLongitude property.
     * 
     */
    public float getLowLongitude() {
        return lowLongitude;
    }

    /**
     * Sets the value of the lowLongitude property.
     * 
     */
    public void setLowLongitude(float value) {
        this.lowLongitude = value;
    }

    /**
     * Gets the value of the lowLatitude property.
     * 
     */
    public float getLowLatitude() {
        return lowLatitude;
    }

    /**
     * Sets the value of the lowLatitude property.
     * 
     */
    public void setLowLatitude(float value) {
        this.lowLatitude = value;
    }

    /**
     * Gets the value of the highLongitude property.
     * 
     */
    public float getHighLongitude() {
        return highLongitude;
    }

    /**
     * Sets the value of the highLongitude property.
     * 
     */
    public void setHighLongitude(float value) {
        this.highLongitude = value;
    }

    /**
     * Gets the value of the highLatitude property.
     * 
     */
    public float getHighLatitude() {
        return highLatitude;
    }

    /**
     * Sets the value of the highLatitude property.
     * 
     */
    public void setHighLatitude(float value) {
        this.highLatitude = value;
    }

    /**
     * Gets the value of the groundspeed property.
     * 
     */
    public int getGroundspeed() {
        return groundspeed;
    }

    /**
     * Sets the value of the groundspeed property.
     * 
     */
    public void setGroundspeed(int value) {
        this.groundspeed = value;
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
     * Gets the value of the heading property.
     * 
     */
    public int getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     */
    public void setHeading(int value) {
        this.heading = value;
    }

    /**
     * Gets the value of the altitudeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitudeStatus() {
        return altitudeStatus;
    }

    /**
     * Sets the value of the altitudeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitudeStatus(String value) {
        this.altitudeStatus = value;
    }

    /**
     * Gets the value of the updateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateType() {
        return updateType;
    }

    /**
     * Sets the value of the updateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateType(String value) {
        this.updateType = value;
    }

    /**
     * Gets the value of the altitudeChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitudeChange() {
        return altitudeChange;
    }

    /**
     * Sets the value of the altitudeChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitudeChange(String value) {
        this.altitudeChange = value;
    }

    /**
     * Gets the value of the waypoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaypoints() {
        return waypoints;
    }

    /**
     * Sets the value of the waypoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaypoints(String value) {
        this.waypoints = value;
    }

}
