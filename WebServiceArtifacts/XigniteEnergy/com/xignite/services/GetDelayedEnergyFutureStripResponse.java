
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
 *         &lt;element name="GetDelayedEnergyFutureStripResult" type="{http://www.xignite.com/services/}Strip" minOccurs="0"/>
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
    "getDelayedEnergyFutureStripResult"
})
@XmlRootElement(name = "GetDelayedEnergyFutureStripResponse")
public class GetDelayedEnergyFutureStripResponse {

    @XmlElement(name = "GetDelayedEnergyFutureStripResult")
    protected Strip getDelayedEnergyFutureStripResult;

    /**
     * Gets the value of the getDelayedEnergyFutureStripResult property.
     * 
     * @return
     *     possible object is
     *     {@link Strip }
     *     
     */
    public Strip getGetDelayedEnergyFutureStripResult() {
        return getDelayedEnergyFutureStripResult;
    }

    /**
     * Sets the value of the getDelayedEnergyFutureStripResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strip }
     *     
     */
    public void setGetDelayedEnergyFutureStripResult(Strip value) {
        this.getDelayedEnergyFutureStripResult = value;
    }

}
