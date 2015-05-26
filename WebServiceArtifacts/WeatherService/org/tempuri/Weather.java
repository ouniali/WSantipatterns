
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Weather complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Weather">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NextDayForecastTempLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NextDayForecastTempHi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitOfMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeelsLike" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Humidity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RawXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IconType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastRetrieved" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Temperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Weather", propOrder = {
    "nextDayForecastTempLow",
    "nextDayForecastTempHi",
    "unitOfMeasure",
    "description",
    "latitude",
    "longitude",
    "feelsLike",
    "humidity",
    "rawXml",
    "iconType",
    "lastUpdated",
    "lastRetrieved",
    "location",
    "temperature",
    "zipCode"
})
public class Weather {

    @XmlElement(name = "NextDayForecastTempLow")
    protected String nextDayForecastTempLow;
    @XmlElement(name = "NextDayForecastTempHi")
    protected String nextDayForecastTempHi;
    @XmlElement(name = "UnitOfMeasure")
    protected String unitOfMeasure;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "FeelsLike")
    protected String feelsLike;
    @XmlElement(name = "Humidity")
    protected String humidity;
    @XmlElement(name = "RawXml")
    protected String rawXml;
    @XmlElement(name = "IconType")
    protected String iconType;
    @XmlElement(name = "LastUpdated")
    protected String lastUpdated;
    @XmlElement(name = "LastRetrieved")
    protected String lastRetrieved;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "Temperature")
    protected String temperature;
    @XmlElement(name = "ZipCode")
    protected String zipCode;

    /**
     * Gets the value of the nextDayForecastTempLow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextDayForecastTempLow() {
        return nextDayForecastTempLow;
    }

    /**
     * Sets the value of the nextDayForecastTempLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextDayForecastTempLow(String value) {
        this.nextDayForecastTempLow = value;
    }

    /**
     * Gets the value of the nextDayForecastTempHi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextDayForecastTempHi() {
        return nextDayForecastTempHi;
    }

    /**
     * Sets the value of the nextDayForecastTempHi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextDayForecastTempHi(String value) {
        this.nextDayForecastTempHi = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the feelsLike property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeelsLike() {
        return feelsLike;
    }

    /**
     * Sets the value of the feelsLike property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeelsLike(String value) {
        this.feelsLike = value;
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
     * Gets the value of the rawXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawXml() {
        return rawXml;
    }

    /**
     * Sets the value of the rawXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawXml(String value) {
        this.rawXml = value;
    }

    /**
     * Gets the value of the iconType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconType() {
        return iconType;
    }

    /**
     * Sets the value of the iconType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconType(String value) {
        this.iconType = value;
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
     * Gets the value of the lastRetrieved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRetrieved() {
        return lastRetrieved;
    }

    /**
     * Sets the value of the lastRetrieved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRetrieved(String value) {
        this.lastRetrieved = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperature(String value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
