
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
 *         &lt;element name="GetHistoricalEnergyCommodityRangeResult" type="{http://www.xignite.com/services/}FutureQuotes" minOccurs="0"/>
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
    "getHistoricalEnergyCommodityRangeResult"
})
@XmlRootElement(name = "GetHistoricalEnergyCommodityRangeResponse")
public class GetHistoricalEnergyCommodityRangeResponse {

    @XmlElement(name = "GetHistoricalEnergyCommodityRangeResult")
    protected FutureQuotes getHistoricalEnergyCommodityRangeResult;

    /**
     * Gets the value of the getHistoricalEnergyCommodityRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link FutureQuotes }
     *     
     */
    public FutureQuotes getGetHistoricalEnergyCommodityRangeResult() {
        return getHistoricalEnergyCommodityRangeResult;
    }

    /**
     * Sets the value of the getHistoricalEnergyCommodityRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureQuotes }
     *     
     */
    public void setGetHistoricalEnergyCommodityRangeResult(FutureQuotes value) {
        this.getHistoricalEnergyCommodityRangeResult = value;
    }

}
