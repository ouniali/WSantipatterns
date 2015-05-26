
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
 *         &lt;element name="GetLatestCrossRateResult" type="{http://www.xignite.com/services/}Rate" minOccurs="0"/>
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
    "getLatestCrossRateResult"
})
@XmlRootElement(name = "GetLatestCrossRateResponse")
public class GetLatestCrossRateResponse {

    @XmlElement(name = "GetLatestCrossRateResult")
    protected Rate getLatestCrossRateResult;

    /**
     * Gets the value of the getLatestCrossRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getGetLatestCrossRateResult() {
        return getLatestCrossRateResult;
    }

    /**
     * Sets the value of the getLatestCrossRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setGetLatestCrossRateResult(Rate value) {
        this.getLatestCrossRateResult = value;
    }

}
