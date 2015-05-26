
package com.corona.cis618;

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
 *         &lt;element name="GetAllInfoResult" type="{http://corona.com/cis618/}WeatherInfo" minOccurs="0"/>
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
    "getAllInfoResult"
})
@XmlRootElement(name = "GetAllInfoResponse")
public class GetAllInfoResponse {

    @XmlElement(name = "GetAllInfoResult")
    protected WeatherInfo getAllInfoResult;

    /**
     * Gets the value of the getAllInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherInfo }
     *     
     */
    public WeatherInfo getGetAllInfoResult() {
        return getAllInfoResult;
    }

    /**
     * Sets the value of the getAllInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherInfo }
     *     
     */
    public void setGetAllInfoResult(WeatherInfo value) {
        this.getAllInfoResult = value;
    }

}
