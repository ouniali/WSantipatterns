
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
 *         &lt;element name="GetOfficialRatesResult" type="{http://www.xignite.com/services/}ArrayOfHistoricalRateBidAsk" minOccurs="0"/>
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
    "getOfficialRatesResult"
})
@XmlRootElement(name = "GetOfficialRatesResponse")
public class GetOfficialRatesResponse {

    @XmlElement(name = "GetOfficialRatesResult")
    protected ArrayOfHistoricalRateBidAsk getOfficialRatesResult;

    /**
     * Gets the value of the getOfficialRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricalRateBidAsk }
     *     
     */
    public ArrayOfHistoricalRateBidAsk getGetOfficialRatesResult() {
        return getOfficialRatesResult;
    }

    /**
     * Sets the value of the getOfficialRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricalRateBidAsk }
     *     
     */
    public void setGetOfficialRatesResult(ArrayOfHistoricalRateBidAsk value) {
        this.getOfficialRatesResult = value;
    }

}
