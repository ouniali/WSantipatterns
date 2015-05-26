
package com.xignite.services;

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
 *         &lt;element name="GetEnergyTickResult" type="{http://www.xignite.com/services/}SingleTick" minOccurs="0"/>
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
    "getEnergyTickResult"
})
@XmlRootElement(name = "GetEnergyTickResponse")
public class GetEnergyTickResponse {

    @XmlElement(name = "GetEnergyTickResult")
    protected SingleTick getEnergyTickResult;

    /**
     * Gets the value of the getEnergyTickResult property.
     * 
     * @return
     *     possible object is
     *     {@link SingleTick }
     *     
     */
    public SingleTick getGetEnergyTickResult() {
        return getEnergyTickResult;
    }

    /**
     * Sets the value of the getEnergyTickResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleTick }
     *     
     */
    public void setGetEnergyTickResult(SingleTick value) {
        this.getEnergyTickResult = value;
    }

}
