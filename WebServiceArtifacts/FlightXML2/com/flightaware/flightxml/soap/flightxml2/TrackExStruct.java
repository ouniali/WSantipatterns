
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackExStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackExStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faFlightID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="groundspeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="altitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="altitudeStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="updateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="altitudeChange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackExStruct", propOrder = {
    "faFlightID",
    "timestamp",
    "latitude",
    "longitude",
    "groundspeed",
    "altitude",
    "altitudeStatus",
    "updateType",
    "altitudeChange"
})
public class TrackExStruct {

    @XmlElement(required = true)
    protected String faFlightID;
    protected int timestamp;
    protected float latitude;
    protected float longitude;
    protected int groundspeed;
    protected int altitude;
    @XmlElement(required = true)
    protected String altitudeStatus;
    @XmlElement(required = true)
    protected String updateType;
    @XmlElement(required = true)
    protected String altitudeChange;

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

}
