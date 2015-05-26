
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
 *         &lt;element name="GetRealTimeCrossRateGMTResult" type="{http://www.xignite.com/services/}CrossRate" minOccurs="0"/>
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
    "getRealTimeCrossRateGMTResult"
})
@XmlRootElement(name = "GetRealTimeCrossRateGMTResponse")
public class GetRealTimeCrossRateGMTResponse {

    @XmlElement(name = "GetRealTimeCrossRateGMTResult")
    protected CrossRate getRealTimeCrossRateGMTResult;

    /**
     * Gets the value of the getRealTimeCrossRateGMTResult property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRate }
     *     
     */
    public CrossRate getGetRealTimeCrossRateGMTResult() {
        return getRealTimeCrossRateGMTResult;
    }

    /**
     * Sets the value of the getRealTimeCrossRateGMTResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRate }
     *     
     */
    public void setGetRealTimeCrossRateGMTResult(CrossRate value) {
        this.getRealTimeCrossRateGMTResult = value;
    }

}
