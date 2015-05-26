
package com.serviceobjects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetWeatherByStationIDResult" type="{http://www.serviceobjects.com/}WeatherByStation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getWeatherByStationIDResult"
})
@XmlRootElement(name = "GetWeatherByStationIDResponse")
public class GetWeatherByStationIDResponse {

    @XmlElement(name = "GetWeatherByStationIDResult")
    protected WeatherByStation getWeatherByStationIDResult;

    /**
     * Gets the value of the getWeatherByStationIDResult property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherByStation }
     *     
     */
    public WeatherByStation getGetWeatherByStationIDResult() {
        return getWeatherByStationIDResult;
    }

    /**
     * Sets the value of the getWeatherByStationIDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherByStation }
     *     
     */
    public void setGetWeatherByStationIDResult(WeatherByStation value) {
        this.getWeatherByStationIDResult = value;
    }

}
