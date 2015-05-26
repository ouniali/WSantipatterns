
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
 *         &lt;element name="GetPricedIndexComponentsResult" type="{http://www.xignite.com/services/}PricedComponents" minOccurs="0"/>
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
    "getPricedIndexComponentsResult"
})
@XmlRootElement(name = "GetPricedIndexComponentsResponse")
public class GetPricedIndexComponentsResponse {

    @XmlElement(name = "GetPricedIndexComponentsResult")
    protected PricedComponents getPricedIndexComponentsResult;

    /**
     * Gets the value of the getPricedIndexComponentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link PricedComponents }
     *     
     */
    public PricedComponents getGetPricedIndexComponentsResult() {
        return getPricedIndexComponentsResult;
    }

    /**
     * Sets the value of the getPricedIndexComponentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedComponents }
     *     
     */
    public void setGetPricedIndexComponentsResult(PricedComponents value) {
        this.getPricedIndexComponentsResult = value;
    }

}
