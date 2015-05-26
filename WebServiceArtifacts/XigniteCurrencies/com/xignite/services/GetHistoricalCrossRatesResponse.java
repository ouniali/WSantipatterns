
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
 *         &lt;element name="GetHistoricalCrossRatesResult" type="{http://www.xignite.com/services/}ArrayOfHistoricalCrossRate" minOccurs="0"/>
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
    "getHistoricalCrossRatesResult"
})
@XmlRootElement(name = "GetHistoricalCrossRatesResponse")
public class GetHistoricalCrossRatesResponse {

    @XmlElement(name = "GetHistoricalCrossRatesResult")
    protected ArrayOfHistoricalCrossRate getHistoricalCrossRatesResult;

    /**
     * Gets the value of the getHistoricalCrossRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricalCrossRate }
     *     
     */
    public ArrayOfHistoricalCrossRate getGetHistoricalCrossRatesResult() {
        return getHistoricalCrossRatesResult;
    }

    /**
     * Sets the value of the getHistoricalCrossRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricalCrossRate }
     *     
     */
    public void setGetHistoricalCrossRatesResult(ArrayOfHistoricalCrossRate value) {
        this.getHistoricalCrossRatesResult = value;
    }

}
