
package com.serviceobjects;

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
 *         &lt;element name="Error" type="{http://www.serviceobjects.com/}Err" minOccurs="0"/>
 *         &lt;element name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemperatureF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Windchill" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HeatIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Humidity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dewpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pressure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Conditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Visibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sunrise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sunset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Moonrise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Moonset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "error",
    "lastUpdated",
    "temperatureF",
    "windchill",
    "heatIndex",
    "humidity",
    "dewpoint",
    "wind",
    "pressure",
    "conditions",
    "visibility",
    "sunrise",
    "sunset",
    "city",
    "state",
    "moonrise",
    "moonset"
})
public class Weather {

    @XmlElement(name = "Error")
    protected Err error;
    @XmlElement(name = "LastUpdated")
    protected String lastUpdated;
    @XmlElement(name = "TemperatureF")
    protected String temperatureF;
    @XmlElement(name = "Windchill")
    protected String windchill;
    @XmlElement(name = "HeatIndex")
    protected String heatIndex;
    @XmlElement(name = "Humidity")
    protected String humidity;
    @XmlElement(name = "Dewpoint")
    protected String dewpoint;
    @XmlElement(name = "Wind")
    protected String wind;
    @XmlElement(name = "Pressure")
    protected String pressure;
    @XmlElement(name = "Conditions")
    protected String conditions;
    @XmlElement(name = "Visibility")
    protected String visibility;
    @XmlElement(name = "Sunrise")
    protected String sunrise;
    @XmlElement(name = "Sunset")
    protected String sunset;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Moonrise")
    protected String moonrise;
    @XmlElement(name = "Moonset")
    protected String moonset;

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
     * Gets the value of the windchill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindchill() {
        return windchill;
    }

    /**
     * Sets the value of the windchill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindchill(String value) {
        this.windchill = value;
    }

    /**
     * Gets the value of the heatIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatIndex() {
        return heatIndex;
    }

    /**
     * Sets the value of the heatIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatIndex(String value) {
        this.heatIndex = value;
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
     * Gets the value of the dewpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDewpoint() {
        return dewpoint;
    }

    /**
     * Sets the value of the dewpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDewpoint(String value) {
        this.dewpoint = value;
    }

    /**
     * Gets the value of the wind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWind() {
        return wind;
    }

    /**
     * Sets the value of the wind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWind(String value) {
        this.wind = value;
    }

    /**
     * Gets the value of the pressure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPressure(String value) {
        this.pressure = value;
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
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the sunrise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSunrise() {
        return sunrise;
    }

    /**
     * Sets the value of the sunrise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSunrise(String value) {
        this.sunrise = value;
    }

    /**
     * Gets the value of the sunset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSunset() {
        return sunset;
    }

    /**
     * Sets the value of the sunset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSunset(String value) {
        this.sunset = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the moonrise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoonrise() {
        return moonrise;
    }

    /**
     * Sets the value of the moonrise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoonrise(String value) {
        this.moonrise = value;
    }

    /**
     * Gets the value of the moonset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoonset() {
        return moonset;
    }

    /**
     * Sets the value of the moonset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoonset(String value) {
        this.moonset = value;
    }

}
