
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
 *         &lt;element name="GetHistoricalCrossRatesBidAskResult" type="{http://www.xignite.com/services/}ArrayOfFullHistoricalCrossRate" minOccurs="0"/>
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
    "getHistoricalCrossRatesBidAskResult"
})
@XmlRootElement(name = "GetHistoricalCrossRatesBidAskResponse")
public class GetHistoricalCrossRatesBidAskResponse {

    @XmlElement(name = "GetHistoricalCrossRatesBidAskResult")
    protected ArrayOfFullHistoricalCrossRate getHistoricalCrossRatesBidAskResult;

    /**
     * Gets the value of the getHistoricalCrossRatesBidAskResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFullHistoricalCrossRate }
     *     
     */
    public ArrayOfFullHistoricalCrossRate getGetHistoricalCrossRatesBidAskResult() {
        return getHistoricalCrossRatesBidAskResult;
    }

    /**
     * Sets the value of the getHistoricalCrossRatesBidAskResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFullHistoricalCrossRate }
     *     
     */
    public void setGetHistoricalCrossRatesBidAskResult(ArrayOfFullHistoricalCrossRate value) {
        this.getHistoricalCrossRatesBidAskResult = value;
    }

}
