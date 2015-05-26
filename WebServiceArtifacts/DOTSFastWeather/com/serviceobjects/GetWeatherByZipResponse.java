
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
 *         &lt;element name="GetWeatherByZipResult" type="{http://www.serviceobjects.com/}Weather" minOccurs="0"/>
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
    "getWeatherByZipResult"
})
@XmlRootElement(name = "GetWeatherByZipResponse")
public class GetWeatherByZipResponse {

    @XmlElement(name = "GetWeatherByZipResult")
    protected Weather getWeatherByZipResult;

    /**
     * Gets the value of the getWeatherByZipResult property.
     * 
     * @return
     *     possible object is
     *     {@link Weather }
     *     
     */
    public Weather getGetWeatherByZipResult() {
        return getWeatherByZipResult;
    }

    /**
     * Sets the value of the getWeatherByZipResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weather }
     *     
     */
    public void setGetWeatherByZipResult(Weather value) {
        this.getWeatherByZipResult = value;
    }

}
