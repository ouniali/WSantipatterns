
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
 *         &lt;element name="GetLastWSJRateByDescriptionResult" type="{http://www.xignite.com/services/}WSJRate" minOccurs="0"/>
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
    "getLastWSJRateByDescriptionResult"
})
@XmlRootElement(name = "GetLastWSJRateByDescriptionResponse")
public class GetLastWSJRateByDescriptionResponse {

    @XmlElement(name = "GetLastWSJRateByDescriptionResult")
    protected WSJRate getLastWSJRateByDescriptionResult;

    /**
     * Gets the value of the getLastWSJRateByDescriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSJRate }
     *     
     */
    public WSJRate getGetLastWSJRateByDescriptionResult() {
        return getLastWSJRateByDescriptionResult;
    }

    /**
     * Sets the value of the getLastWSJRateByDescriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSJRate }
     *     
     */
    public void setGetLastWSJRateByDescriptionResult(WSJRate value) {
        this.getLastWSJRateByDescriptionResult = value;
    }

}
