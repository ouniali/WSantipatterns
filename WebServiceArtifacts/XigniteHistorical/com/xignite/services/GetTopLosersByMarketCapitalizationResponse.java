
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
 *         &lt;element name="GetTopLosersByMarketCapitalizationResult" type="{http://www.xignite.com/services/}ArrayOfTopByCapitalization" minOccurs="0"/>
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
    "getTopLosersByMarketCapitalizationResult"
})
@XmlRootElement(name = "GetTopLosersByMarketCapitalizationResponse")
public class GetTopLosersByMarketCapitalizationResponse {

    @XmlElement(name = "GetTopLosersByMarketCapitalizationResult")
    protected ArrayOfTopByCapitalization getTopLosersByMarketCapitalizationResult;

    /**
     * Gets the value of the getTopLosersByMarketCapitalizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTopByCapitalization }
     *     
     */
    public ArrayOfTopByCapitalization getGetTopLosersByMarketCapitalizationResult() {
        return getTopLosersByMarketCapitalizationResult;
    }

    /**
     * Sets the value of the getTopLosersByMarketCapitalizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTopByCapitalization }
     *     
     */
    public void setGetTopLosersByMarketCapitalizationResult(ArrayOfTopByCapitalization value) {
        this.getTopLosersByMarketCapitalizationResult = value;
    }

}
