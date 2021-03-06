
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
 *         &lt;element name="GetOfficialHistoricalRateResult" type="{http://www.xignite.com/services/}HistoricalRate" minOccurs="0"/>
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
    "getOfficialHistoricalRateResult"
})
@XmlRootElement(name = "GetOfficialHistoricalRateResponse")
public class GetOfficialHistoricalRateResponse {

    @XmlElement(name = "GetOfficialHistoricalRateResult")
    protected HistoricalRate getOfficialHistoricalRateResult;

    /**
     * Gets the value of the getOfficialHistoricalRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalRate }
     *     
     */
    public HistoricalRate getGetOfficialHistoricalRateResult() {
        return getOfficialHistoricalRateResult;
    }

    /**
     * Sets the value of the getOfficialHistoricalRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalRate }
     *     
     */
    public void setGetOfficialHistoricalRateResult(HistoricalRate value) {
        this.getOfficialHistoricalRateResult = value;
    }

}
