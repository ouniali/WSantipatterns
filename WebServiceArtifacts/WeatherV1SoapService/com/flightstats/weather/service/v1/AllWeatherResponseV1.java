
package com.flightstats.weather.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allWeatherResponseV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allWeatherResponseV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.weather.flightstats.com/}responseImpl">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v1.service.weather.flightstats.com/}weatherRequestBaseV1" minOccurs="0"/>
 *         &lt;element name="metar" type="{http://v1.service.weather.flightstats.com/}metarV1" minOccurs="0"/>
 *         &lt;element name="taf" type="{http://v1.service.weather.flightstats.com/}tafV1" minOccurs="0"/>
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
@XmlType(name = "allWeatherResponseV1", propOrder = {
    "request",
    "metar",
    "taf",
    "zoneForecast"
})
public class AllWeatherResponseV1
    extends ResponseImpl
{

    protected WeatherRequestBaseV1 request;
    protected MetarV1 metar;
    protected TafV1 taf;
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
     * Gets the value of the metar property.
     * 
     * @return
     *     possible object is
     *     {@link MetarV1 }
     *     
     */
    public MetarV1 getMetar() {
        return metar;
    }

    /**
     * Sets the value of the metar property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetarV1 }
     *     
     */
    public void setMetar(MetarV1 value) {
        this.metar = value;
    }

    /**
     * Gets the value of the taf property.
     * 
     * @return
     *     possible object is
     *     {@link TafV1 }
     *     
     */
    public TafV1 getTaf() {
        return taf;
    }

    /**
     * Sets the value of the taf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TafV1 }
     *     
     */
    public void setTaf(TafV1 value) {
        this.taf = value;
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
