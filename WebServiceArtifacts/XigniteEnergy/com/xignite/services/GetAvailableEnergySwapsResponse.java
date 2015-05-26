
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
 *         &lt;element name="GetAvailableEnergySwapsResult" type="{http://www.xignite.com/services/}ArrayOfFuture" minOccurs="0"/>
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
    "getAvailableEnergySwapsResult"
})
@XmlRootElement(name = "GetAvailableEnergySwapsResponse")
public class GetAvailableEnergySwapsResponse {

    @XmlElement(name = "GetAvailableEnergySwapsResult")
    protected ArrayOfFuture getAvailableEnergySwapsResult;

    /**
     * Gets the value of the getAvailableEnergySwapsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFuture }
     *     
     */
    public ArrayOfFuture getGetAvailableEnergySwapsResult() {
        return getAvailableEnergySwapsResult;
    }

    /**
     * Sets the value of the getAvailableEnergySwapsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFuture }
     *     
     */
    public void setGetAvailableEnergySwapsResult(ArrayOfFuture value) {
        this.getAvailableEnergySwapsResult = value;
    }

}
