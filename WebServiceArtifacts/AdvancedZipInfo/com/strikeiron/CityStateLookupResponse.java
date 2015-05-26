
package com.strikeiron;

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
 *         &lt;element name="CityStateLookupResult" type="{http://www.strikeiron.com}SIWsOutputOfCityStateResult" minOccurs="0"/>
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
    "cityStateLookupResult"
})
@XmlRootElement(name = "CityStateLookupResponse")
public class CityStateLookupResponse {

    @XmlElement(name = "CityStateLookupResult")
    protected SIWsOutputOfCityStateResult cityStateLookupResult;

    /**
     * Gets the value of the cityStateLookupResult property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsOutputOfCityStateResult }
     *     
     */
    public SIWsOutputOfCityStateResult getCityStateLookupResult() {
        return cityStateLookupResult;
    }

    /**
     * Sets the value of the cityStateLookupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsOutputOfCityStateResult }
     *     
     */
    public void setCityStateLookupResult(SIWsOutputOfCityStateResult value) {
        this.cityStateLookupResult = value;
    }

}
