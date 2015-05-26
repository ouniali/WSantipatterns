
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
 *         &lt;element name="GetOfficialCrossRateBidAskResult" type="{http://www.xignite.com/services/}FullHistoricalCrossRate" minOccurs="0"/>
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
    "getOfficialCrossRateBidAskResult"
})
@XmlRootElement(name = "GetOfficialCrossRateBidAskResponse")
public class GetOfficialCrossRateBidAskResponse {

    @XmlElement(name = "GetOfficialCrossRateBidAskResult")
    protected FullHistoricalCrossRate getOfficialCrossRateBidAskResult;

    /**
     * Gets the value of the getOfficialCrossRateBidAskResult property.
     * 
     * @return
     *     possible object is
     *     {@link FullHistoricalCrossRate }
     *     
     */
    public FullHistoricalCrossRate getGetOfficialCrossRateBidAskResult() {
        return getOfficialCrossRateBidAskResult;
    }

    /**
     * Sets the value of the getOfficialCrossRateBidAskResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullHistoricalCrossRate }
     *     
     */
    public void setGetOfficialCrossRateBidAskResult(FullHistoricalCrossRate value) {
        this.getOfficialCrossRateBidAskResult = value;
    }

}
