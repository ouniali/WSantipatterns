
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
 *         &lt;element name="GetOfficialHistoricalRatesResult" type="{http://www.xignite.com/services/}ArrayOfHistoricalRate" minOccurs="0"/>
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
    "getOfficialHistoricalRatesResult"
})
@XmlRootElement(name = "GetOfficialHistoricalRatesResponse")
public class GetOfficialHistoricalRatesResponse {

    @XmlElement(name = "GetOfficialHistoricalRatesResult")
    protected ArrayOfHistoricalRate getOfficialHistoricalRatesResult;

    /**
     * Gets the value of the getOfficialHistoricalRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricalRate }
     *     
     */
    public ArrayOfHistoricalRate getGetOfficialHistoricalRatesResult() {
        return getOfficialHistoricalRatesResult;
    }

    /**
     * Sets the value of the getOfficialHistoricalRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricalRate }
     *     
     */
    public void setGetOfficialHistoricalRatesResult(ArrayOfHistoricalRate value) {
        this.getOfficialHistoricalRatesResult = value;
    }

}
