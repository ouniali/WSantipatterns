
package com.serviceobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherByStation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherByStation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error" type="{http://www.serviceobjects.com/}Err" minOccurs="0"/>
 *         &lt;element name="StationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemperatureF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DewpointF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Humidity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WindSpeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WindDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WindGust" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatteryVoltage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherByStation", propOrder = {
    "error",
    "stationID",
    "lastUpdated",
    "temperatureF",
    "dewpointF",
    "humidity",
    "windSpeed",
    "windDirection",
    "windGust",
    "batteryVoltage"
})
public class WeatherByStation {

    @XmlElement(name = "Error")
    protected Err error;
    @XmlElement(name = "StationID")
    protected String stationID;
    @XmlElement(name = "LastUpdated")
    protected String lastUpdated;
    @XmlElement(name = "TemperatureF")
    protected String temperatureF;
    @XmlElement(name = "DewpointF")
    protected String dewpointF;
    @XmlElement(name = "Humidity")
    protected String humidity;
    @XmlElement(name = "WindSpeed")
    protected String windSpeed;
    @XmlElement(name = "WindDirection")
    protected String windDirection;
    @XmlElement(name = "WindGust")
    protected String windGust;
    @XmlElement(name = "BatteryVoltage")
    protected String batteryVoltage;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Err }
     *     
     */
    public Err getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Err }
     *     
     */
    public void setError(Err value) {
        this.error = value;
    }

    /**
     * Gets the value of the stationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationID() {
        return stationID;
    }

    /**
     * Sets the value of the stationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationID(String value) {
        this.stationID = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdated(String value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the temperatureF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureF() {
        return temperatureF;
    }

    /**
     * Sets the value of the temperatureF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureF(String value) {
        this.temperatureF = value;
    }

    /**
     * Gets the value of the dewpointF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDewpointF() {
        return dewpointF;
    }

    /**
     * Sets the value of the dewpointF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDewpointF(String value) {
        this.dewpointF = value;
    }

    /**
     * Gets the value of the humidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHumidity(String value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the windSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindSpeed() {
        return windSpeed;
    }

    /**
     * Sets the value of the windSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindSpeed(String value) {
        this.windSpeed = value;
    }

    /**
     * Gets the value of the windDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindDirection() {
        return windDirection;
    }

    /**
     * Sets the value of the windDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindDirection(String value) {
        this.windDirection = value;
    }

    /**
     * Gets the value of the windGust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindGust() {
        return windGust;
    }

    /**
     * Sets the value of the windGust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindGust(String value) {
        this.windGust = value;
    }

    /**
     * Gets the value of the batteryVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatteryVoltage() {
        return batteryVoltage;
    }

    /**
     * Sets the value of the batteryVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatteryVoltage(String value) {
        this.batteryVoltage = value;
    }

}
