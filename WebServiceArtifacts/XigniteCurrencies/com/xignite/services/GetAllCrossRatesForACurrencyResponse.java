
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
 *         &lt;element name="GetAllCrossRatesForACurrencyResult" type="{http://www.xignite.com/services/}CrossRateTableLineWithBidAsk" minOccurs="0"/>
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
    "getAllCrossRatesForACurrencyResult"
})
@XmlRootElement(name = "GetAllCrossRatesForACurrencyResponse")
public class GetAllCrossRatesForACurrencyResponse {

    @XmlElement(name = "GetAllCrossRatesForACurrencyResult")
    protected CrossRateTableLineWithBidAsk getAllCrossRatesForACurrencyResult;

    /**
     * Gets the value of the getAllCrossRatesForACurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRateTableLineWithBidAsk }
     *     
     */
    public CrossRateTableLineWithBidAsk getGetAllCrossRatesForACurrencyResult() {
        return getAllCrossRatesForACurrencyResult;
    }

    /**
     * Sets the value of the getAllCrossRatesForACurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRateTableLineWithBidAsk }
     *     
     */
    public void setGetAllCrossRatesForACurrencyResult(CrossRateTableLineWithBidAsk value) {
        this.getAllCrossRatesForACurrencyResult = value;
    }

}
