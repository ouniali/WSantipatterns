
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
 *         &lt;element name="GetHistoricalRatesResult" type="{http://www.xignite.com/services/}ArrayOfHistoricalRate" minOccurs="0"/>
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
    "getHistoricalRatesResult"
})
@XmlRootElement(name = "GetHistoricalRatesResponse")
public class GetHistoricalRatesResponse {

    @XmlElement(name = "GetHistoricalRatesResult")
    protected ArrayOfHistoricalRate getHistoricalRatesResult;

    /**
     * Gets the value of the getHistoricalRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricalRate }
     *     
     */
    public ArrayOfHistoricalRate getGetHistoricalRatesResult() {
        return getHistoricalRatesResult;
    }

    /**
     * Sets the value of the getHistoricalRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricalRate }
     *     
     */
    public void setGetHistoricalRatesResult(ArrayOfHistoricalRate value) {
        this.getHistoricalRatesResult = value;
    }

}
