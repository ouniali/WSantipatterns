
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
 *         &lt;element name="GetOfficialCrossRateResult" type="{http://www.xignite.com/services/}HistoricalCrossRate" minOccurs="0"/>
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
    "getOfficialCrossRateResult"
})
@XmlRootElement(name = "GetOfficialCrossRateResponse")
public class GetOfficialCrossRateResponse {

    @XmlElement(name = "GetOfficialCrossRateResult")
    protected HistoricalCrossRate getOfficialCrossRateResult;

    /**
     * Gets the value of the getOfficialCrossRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalCrossRate }
     *     
     */
    public HistoricalCrossRate getGetOfficialCrossRateResult() {
        return getOfficialCrossRateResult;
    }

    /**
     * Sets the value of the getOfficialCrossRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalCrossRate }
     *     
     */
    public void setGetOfficialCrossRateResult(HistoricalCrossRate value) {
        this.getOfficialCrossRateResult = value;
    }

}
