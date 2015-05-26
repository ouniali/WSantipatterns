
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
 *         &lt;element name="GetOfficialCrossRatesBidAskResult" type="{http://www.xignite.com/services/}ArrayOfFullHistoricalCrossRate" minOccurs="0"/>
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
    "getOfficialCrossRatesBidAskResult"
})
@XmlRootElement(name = "GetOfficialCrossRatesBidAskResponse")
public class GetOfficialCrossRatesBidAskResponse {

    @XmlElement(name = "GetOfficialCrossRatesBidAskResult")
    protected ArrayOfFullHistoricalCrossRate getOfficialCrossRatesBidAskResult;

    /**
     * Gets the value of the getOfficialCrossRatesBidAskResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFullHistoricalCrossRate }
     *     
     */
    public ArrayOfFullHistoricalCrossRate getGetOfficialCrossRatesBidAskResult() {
        return getOfficialCrossRatesBidAskResult;
    }

    /**
     * Sets the value of the getOfficialCrossRatesBidAskResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFullHistoricalCrossRate }
     *     
     */
    public void setGetOfficialCrossRatesBidAskResult(ArrayOfFullHistoricalCrossRate value) {
        this.getOfficialCrossRatesBidAskResult = value;
    }

}
