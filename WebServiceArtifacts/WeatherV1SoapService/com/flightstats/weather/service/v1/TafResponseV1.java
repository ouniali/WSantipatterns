
package com.flightstats.weather.service.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tafResponseV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tafResponseV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://v1.service.weather.flightstats.com/}responseImpl">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://v1.service.weather.flightstats.com/}weatherRequestBaseV1" minOccurs="0"/>
 *         &lt;element name="taf" type="{http://v1.service.weather.flightstats.com/}tafV1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tafResponseV1", propOrder = {
    "request",
    "taf"
})
public class TafResponseV1
    extends ResponseImpl
{

    protected WeatherRequestBaseV1 request;
    protected TafV1 taf;

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

}
