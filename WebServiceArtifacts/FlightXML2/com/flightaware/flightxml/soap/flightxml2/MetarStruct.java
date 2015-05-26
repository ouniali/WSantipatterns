
package com.flightaware.flightxml.soap.flightxml2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetarStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetarStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cloud_friendly" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cloud_altitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cloud_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conditions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pressure" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="temp_air" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="temp_dewpoint" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="temp_relhum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="wind_friendly" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wind_direction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wind_speed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="wind_speed_gust" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="raw_data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetarStruct", propOrder = {
    "airport",
    "time",
    "cloudFriendly",
    "cloudAltitude",
    "cloudType",
    "conditions",
    "pressure",
    "tempAir",
    "tempDewpoint",
    "tempRelhum",
    "visibility",
    "windFriendly",
    "windDirection",
    "windSpeed",
    "windSpeedGust",
    "rawData"
})
public class MetarStruct {

    @XmlElement(required = true)
    protected String airport;
    protected int time;
    @XmlElement(name = "cloud_friendly", required = true)
    protected String cloudFriendly;
    @XmlElement(name = "cloud_altitude")
    protected int cloudAltitude;
    @XmlElement(name = "cloud_type", required = true)
    protected String cloudType;
    @XmlElement(required = true)
    protected String conditions;
    protected float pressure;
    @XmlElement(name = "temp_air")
    protected int tempAir;
    @XmlElement(name = "temp_dewpoint")
    protected int tempDewpoint;
    @XmlElement(name = "temp_relhum")
    protected int tempRelhum;
    protected float visibility;
    @XmlElement(name = "wind_friendly", required = true)
    protected String windFriendly;
    @XmlElement(name = "wind_direction")
    protected int windDirection;
    @XmlElement(name = "wind_speed")
    protected int windSpeed;
    @XmlElement(name = "wind_speed_gust")
    protected int windSpeedGust;
    @XmlElement(name = "raw_data", required = true)
    protected String rawData;

    /**
     * Gets the value of the airport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirport() {
        return airport;
    }

    /**
     * Sets the value of the airport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirport(String value) {
        this.airport = value;
    }

    /**
     * Gets the value of the time property.
     * 
     */
    public int getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     */
    public void setTime(int value) {
        this.time = value;
    }

    /**
     * Gets the value of the cloudFriendly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudFriendly() {
        return cloudFriendly;
    }

    /**
     * Sets the value of the cloudFriendly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudFriendly(String value) {
        this.cloudFriendly = value;
    }

    /**
     * Gets the value of the cloudAltitude property.
     * 
     */
    public int getCloudAltitude() {
        return cloudAltitude;
    }

    /**
     * Sets the value of the cloudAltitude property.
     * 
     */
    public void setCloudAltitude(int value) {
        this.cloudAltitude = value;
    }

    /**
     * Gets the value of the cloudType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloudType() {
        return cloudType;
    }

    /**
     * Sets the value of the cloudType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloudType(String value) {
        this.cloudType = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * Sets the value of the conditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditions(String value) {
        this.conditions = value;
    }

    /**
     * Gets the value of the pressure property.
     * 
     */
    public float getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     */
    public void setPressure(float value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the tempAir property.
     * 
     */
    public int getTempAir() {
        return tempAir;
    }

    /**
     * Sets the value of the tempAir property.
     * 
     */
    public void setTempAir(int value) {
        this.tempAir = value;
    }

    /**
     * Gets the value of the tempDewpoint property.
     * 
     */
    public int getTempDewpoint() {
        return tempDewpoint;
    }

    /**
     * Sets the value of the tempDewpoint property.
     * 
     */
    public void setTempDewpoint(int value) {
        this.tempDewpoint = value;
    }

    /**
     * Gets the value of the tempRelhum property.
     * 
     */
    public int getTempRelhum() {
        return tempRelhum;
    }

    /**
     * Sets the value of the tempRelhum property.
     * 
     */
    public void setTempRelhum(int value) {
        this.tempRelhum = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     */
    public float getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     */
    public void setVisibility(float value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the windFriendly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindFriendly() {
        return windFriendly;
    }

    /**
     * Sets the value of the windFriendly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindFriendly(String value) {
        this.windFriendly = value;
    }

    /**
     * Gets the value of the windDirection property.
     * 
     */
    public int getWindDirection() {
        return windDirection;
    }

    /**
     * Sets the value of the windDirection property.
     * 
     */
    public void setWindDirection(int value) {
        this.windDirection = value;
    }

    /**
     * Gets the value of the windSpeed property.
     * 
     */
    public int getWindSpeed() {
        return windSpeed;
    }

    /**
     * Sets the value of the windSpeed property.
     * 
     */
    public void setWindSpeed(int value) {
        this.windSpeed = value;
    }

    /**
     * Gets the value of the windSpeedGust property.
     * 
     */
    public int getWindSpeedGust() {
        return windSpeedGust;
    }

    /**
     * Sets the value of the windSpeedGust property.
     * 
     */
    public void setWindSpeedGust(int value) {
        this.windSpeedGust = value;
    }

    /**
     * Gets the value of the rawData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawData() {
        return rawData;
    }

    /**
     * Sets the value of the rawData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawData(String value) {
        this.rawData = value;
    }

}
