
package com.flightstats.weather.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zoneForecastResponseV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zoneForecastResponseV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.weather.flightstats.com/}responseImpl">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v1.service.weather.flightstats.com/}weatherRequestBaseV1" minOccurs="0"/>
 *         &lt;element name="zoneForecast" type="{http://v1.service.weather.flightstats.com/}zoneForecastV1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zoneForecastResponseV1", propOrder = {
    "request",
    "zoneForecast"
})
public class ZoneForecastResponseV1
    extends ResponseImpl
{

    protected WeatherRequestBaseV1 request;
    protected ZoneForecastV1 zoneForecast;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherRequestBaseV1 }
     *     
     */
    public WeatherRequestBaseV1 getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherRequestBaseV1 }
     *     
     */
    public void setRequest(WeatherRequestBaseV1 value) {
        this.request = value;
    }

    /**
     * Gets the value of the zoneForecast property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneForecastV1 }
     *     
     */
    public ZoneForecastV1 getZoneForecast() {
        return zoneForecast;
    }

    /**
     * Sets the value of the zoneForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneForecastV1 }
     *     
     */
    public void setZoneForecast(ZoneForecastV1 value) {
        this.zoneForecast = value;
    }

}
