
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
 *         &lt;element name="GetOfficialRateResult" type="{http://www.xignite.com/services/}HistoricalRateBidAsk" minOccurs="0"/>
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
    "getOfficialRateResult"
})
@XmlRootElement(name = "GetOfficialRateResponse")
public class GetOfficialRateResponse {

    @XmlElement(name = "GetOfficialRateResult")
    protected HistoricalRateBidAsk getOfficialRateResult;

    /**
     * Gets the value of the getOfficialRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalRateBidAsk }
     *     
     */
    public HistoricalRateBidAsk getGetOfficialRateResult() {
        return getOfficialRateResult;
    }

    /**
     * Sets the value of the getOfficialRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalRateBidAsk }
     *     
     */
    public void setGetOfficialRateResult(HistoricalRateBidAsk value) {
        this.getOfficialRateResult = value;
    }

}
