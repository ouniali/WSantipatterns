
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
 *         &lt;element name="GetHistoricalEnergySwapStripResult" type="{http://www.xignite.com/services/}Strip" minOccurs="0"/>
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
    "getHistoricalEnergySwapStripResult"
})
@XmlRootElement(name = "GetHistoricalEnergySwapStripResponse")
public class GetHistoricalEnergySwapStripResponse {

    @XmlElement(name = "GetHistoricalEnergySwapStripResult")
    protected Strip getHistoricalEnergySwapStripResult;

    /**
     * Gets the value of the getHistoricalEnergySwapStripResult property.
     * 
     * @return
     *     possible object is
     *     {@link Strip }
     *     
     */
    public Strip getGetHistoricalEnergySwapStripResult() {
        return getHistoricalEnergySwapStripResult;
    }

    /**
     * Sets the value of the getHistoricalEnergySwapStripResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strip }
     *     
     */
    public void setGetHistoricalEnergySwapStripResult(Strip value) {
        this.getHistoricalEnergySwapStripResult = value;
    }

}
