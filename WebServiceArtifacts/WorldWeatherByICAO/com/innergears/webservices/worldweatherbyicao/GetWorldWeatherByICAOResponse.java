
package com.innergears.webservices.worldweatherbyicao;

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
 *         &lt;element name="GetWorldWeatherByICAOResult" type="{http://innergears.com/WebServices/WorldWeatherByICAO}ArrayOfString" minOccurs="0"/>
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
    "getWorldWeatherByICAOResult"
})
@XmlRootElement(name = "GetWorldWeatherByICAOResponse")
public class GetWorldWeatherByICAOResponse {

    @XmlElement(name = "GetWorldWeatherByICAOResult")
    protected ArrayOfString getWorldWeatherByICAOResult;

    /**
     * Gets the value of the getWorldWeatherByICAOResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetWorldWeatherByICAOResult() {
        return getWorldWeatherByICAOResult;
    }

    /**
     * Sets the value of the getWorldWeatherByICAOResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetWorldWeatherByICAOResult(ArrayOfString value) {
        this.getWorldWeatherByICAOResult = value;
    }

}
