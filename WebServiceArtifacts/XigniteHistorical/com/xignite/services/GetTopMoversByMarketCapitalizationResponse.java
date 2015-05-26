
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
 *         &lt;element name="GetTopMoversByMarketCapitalizationResult" type="{http://www.xignite.com/services/}ArrayOfTopByCapitalization" minOccurs="0"/>
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
    "getTopMoversByMarketCapitalizationResult"
})
@XmlRootElement(name = "GetTopMoversByMarketCapitalizationResponse")
public class GetTopMoversByMarketCapitalizationResponse {

    @XmlElement(name = "GetTopMoversByMarketCapitalizationResult")
    protected ArrayOfTopByCapitalization getTopMoversByMarketCapitalizationResult;

    /**
     * Gets the value of the getTopMoversByMarketCapitalizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTopByCapitalization }
     *     
     */
    public ArrayOfTopByCapitalization getGetTopMoversByMarketCapitalizationResult() {
        return getTopMoversByMarketCapitalizationResult;
    }

    /**
     * Sets the value of the getTopMoversByMarketCapitalizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTopByCapitalization }
     *     
     */
    public void setGetTopMoversByMarketCapitalizationResult(ArrayOfTopByCapitalization value) {
        this.getTopMoversByMarketCapitalizationResult = value;
    }

}
