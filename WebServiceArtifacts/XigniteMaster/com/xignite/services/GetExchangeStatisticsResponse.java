
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
 *         &lt;element name="GetExchangeStatisticsResult" type="{http://www.xignite.com/services/}ExchangeStatistics" minOccurs="0"/>
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
    "getExchangeStatisticsResult"
})
@XmlRootElement(name = "GetExchangeStatisticsResponse")
public class GetExchangeStatisticsResponse {

    @XmlElement(name = "GetExchangeStatisticsResult")
    protected ExchangeStatistics getExchangeStatisticsResult;

    /**
     * Gets the value of the getExchangeStatisticsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeStatistics }
     *     
     */
    public ExchangeStatistics getGetExchangeStatisticsResult() {
        return getExchangeStatisticsResult;
    }

    /**
     * Sets the value of the getExchangeStatisticsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeStatistics }
     *     
     */
    public void setGetExchangeStatisticsResult(ExchangeStatistics value) {
        this.getExchangeStatisticsResult = value;
    }

}
