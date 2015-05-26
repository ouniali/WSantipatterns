
package com.unisys.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherForecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherForecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sunrise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sunset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentTemp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DayForecast" type="{http://www.unisys.com/WebServices/}ArrayOfDailyForecast" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherForecast", propOrder = {
    "zipCode",
    "cityShortName",
    "time",
    "sunrise",
    "sunset",
    "currentTemp",
    "dayForecast"
})
public class WeatherForecast {

    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "CityShortName")
    protected String cityShortName;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "Sunrise")
    protected String sunrise;
    @XmlElement(name = "Sunset")
    protected String sunset;
    @XmlElement(name = "CurrentTemp")
    protected String currentTemp;
    @XmlElement(name = "DayForecast")
    protected ArrayOfDailyForecast dayForecast;

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

    /**
     * Gets the value of the cityShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityShortName() {
        return cityShortName;
    }

    /**
     * Sets the value of the cityShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityShortName(String value) {
        this.cityShortName = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
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
     * Gets the value of the currentTemp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTemp() {
        return currentTemp;
    }

    /**
     * Sets the value of the currentTemp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTemp(String value) {
        this.currentTemp = value;
    }

    /**
     * Gets the value of the dayForecast property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDailyForecast }
     *     
     */
    public ArrayOfDailyForecast getDayForecast() {
        return dayForecast;
    }

    /**
     * Sets the value of the dayForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDailyForecast }
     *     
     */
    public void setDayForecast(ArrayOfDailyForecast value) {
        this.dayForecast = value;
    }

}
