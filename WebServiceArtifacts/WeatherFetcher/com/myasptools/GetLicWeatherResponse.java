
package com.myasptools;

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
 *         &lt;element name="GetLicWeatherResult" type="{http://www.myasptools.com/}Weather" minOccurs="0"/>
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
    "getLicWeatherResult"
})
@XmlRootElement(name = "GetLicWeatherResponse")
public class GetLicWeatherResponse {

    @XmlElement(name = "GetLicWeatherResult")
    protected Weather getLicWeatherResult;

    /**
     * Gets the value of the getLicWeatherResult property.
     * 
     * @return
     *     possible object is
     *     {@link Weather }
     *     
     */
    public Weather getGetLicWeatherResult() {
        return getLicWeatherResult;
    }

    /**
     * Sets the value of the getLicWeatherResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weather }
     *     
     */
    public void setGetLicWeatherResult(Weather value) {
        this.getLicWeatherResult = value;
    }

}
