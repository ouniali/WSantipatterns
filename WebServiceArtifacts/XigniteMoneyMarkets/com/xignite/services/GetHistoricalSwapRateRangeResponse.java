
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
 *         &lt;element name="GetHistoricalSwapRateRangeResult" type="{http://www.xignite.com/services/}ArrayOfSwapRate" minOccurs="0"/>
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
    "getHistoricalSwapRateRangeResult"
})
@XmlRootElement(name = "GetHistoricalSwapRateRangeResponse")
public class GetHistoricalSwapRateRangeResponse {

    @XmlElement(name = "GetHistoricalSwapRateRangeResult")
    protected ArrayOfSwapRate getHistoricalSwapRateRangeResult;

    /**
     * Gets the value of the getHistoricalSwapRateRangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSwapRate }
     *     
     */
    public ArrayOfSwapRate getGetHistoricalSwapRateRangeResult() {
        return getHistoricalSwapRateRangeResult;
    }

    /**
     * Sets the value of the getHistoricalSwapRateRangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSwapRate }
     *     
     */
    public void setGetHistoricalSwapRateRangeResult(ArrayOfSwapRate value) {
        this.getHistoricalSwapRateRangeResult = value;
    }

}
