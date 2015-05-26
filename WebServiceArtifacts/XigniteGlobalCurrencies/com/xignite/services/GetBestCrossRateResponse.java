
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
 *         &lt;element name="GetBestCrossRateResult" type="{http://www.xignite.com/services/}Rate" minOccurs="0"/>
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
    "getBestCrossRateResult"
})
@XmlRootElement(name = "GetBestCrossRateResponse")
public class GetBestCrossRateResponse {

    @XmlElement(name = "GetBestCrossRateResult")
    protected Rate getBestCrossRateResult;

    /**
     * Gets the value of the getBestCrossRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getGetBestCrossRateResult() {
        return getBestCrossRateResult;
    }

    /**
     * Sets the value of the getBestCrossRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setGetBestCrossRateResult(Rate value) {
        this.getBestCrossRateResult = value;
    }

}
