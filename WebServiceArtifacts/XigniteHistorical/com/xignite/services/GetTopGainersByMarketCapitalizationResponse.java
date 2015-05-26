
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
 *         &lt;element name="GetTopGainersByMarketCapitalizationResult" type="{http://www.xignite.com/services/}ArrayOfTopByCapitalization" minOccurs="0"/>
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
    "getTopGainersByMarketCapitalizationResult"
})
@XmlRootElement(name = "GetTopGainersByMarketCapitalizationResponse")
public class GetTopGainersByMarketCapitalizationResponse {

    @XmlElement(name = "GetTopGainersByMarketCapitalizationResult")
    protected ArrayOfTopByCapitalization getTopGainersByMarketCapitalizationResult;

    /**
     * Gets the value of the getTopGainersByMarketCapitalizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTopByCapitalization }
     *     
     */
    public ArrayOfTopByCapitalization getGetTopGainersByMarketCapitalizationResult() {
        return getTopGainersByMarketCapitalizationResult;
    }

    /**
     * Sets the value of the getTopGainersByMarketCapitalizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTopByCapitalization }
     *     
     */
    public void setGetTopGainersByMarketCapitalizationResult(ArrayOfTopByCapitalization value) {
        this.getTopGainersByMarketCapitalizationResult = value;
    }

}
