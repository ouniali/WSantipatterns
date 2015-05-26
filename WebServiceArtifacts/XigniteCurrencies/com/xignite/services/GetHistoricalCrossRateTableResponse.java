
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
 *         &lt;element name="GetHistoricalCrossRateTableResult" type="{http://www.xignite.com/services/}CrossRateTable" minOccurs="0"/>
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
    "getHistoricalCrossRateTableResult"
})
@XmlRootElement(name = "GetHistoricalCrossRateTableResponse")
public class GetHistoricalCrossRateTableResponse {

    @XmlElement(name = "GetHistoricalCrossRateTableResult")
    protected CrossRateTable getHistoricalCrossRateTableResult;

    /**
     * Gets the value of the getHistoricalCrossRateTableResult property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRateTable }
     *     
     */
    public CrossRateTable getGetHistoricalCrossRateTableResult() {
        return getHistoricalCrossRateTableResult;
    }

    /**
     * Sets the value of the getHistoricalCrossRateTableResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRateTable }
     *     
     */
    public void setGetHistoricalCrossRateTableResult(CrossRateTable value) {
        this.getHistoricalCrossRateTableResult = value;
    }

}
