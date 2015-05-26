
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
 *         &lt;element name="GetHistoricalMarketCapitalizationCustomResult" type="{http://www.xignite.com/services/}HistoricalMarketCapitalization" minOccurs="0"/>
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
    "getHistoricalMarketCapitalizationCustomResult"
})
@XmlRootElement(name = "GetHistoricalMarketCapitalizationCustomResponse")
public class GetHistoricalMarketCapitalizationCustomResponse {

    @XmlElement(name = "GetHistoricalMarketCapitalizationCustomResult")
    protected HistoricalMarketCapitalization getHistoricalMarketCapitalizationCustomResult;

    /**
     * Gets the value of the getHistoricalMarketCapitalizationCustomResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalMarketCapitalization }
     *     
     */
    public HistoricalMarketCapitalization getGetHistoricalMarketCapitalizationCustomResult() {
        return getHistoricalMarketCapitalizationCustomResult;
    }

    /**
     * Sets the value of the getHistoricalMarketCapitalizationCustomResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalMarketCapitalization }
     *     
     */
    public void setGetHistoricalMarketCapitalizationCustomResult(HistoricalMarketCapitalization value) {
        this.getHistoricalMarketCapitalizationCustomResult = value;
    }

}
