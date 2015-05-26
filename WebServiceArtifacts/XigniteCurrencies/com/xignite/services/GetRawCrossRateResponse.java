
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
 *         &lt;element name="GetRawCrossRateResult" type="{http://www.xignite.com/services/}CrossRate" minOccurs="0"/>
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
    "getRawCrossRateResult"
})
@XmlRootElement(name = "GetRawCrossRateResponse")
public class GetRawCrossRateResponse {

    @XmlElement(name = "GetRawCrossRateResult")
    protected CrossRate getRawCrossRateResult;

    /**
     * Gets the value of the getRawCrossRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRate }
     *     
     */
    public CrossRate getGetRawCrossRateResult() {
        return getRawCrossRateResult;
    }

    /**
     * Sets the value of the getRawCrossRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRate }
     *     
     */
    public void setGetRawCrossRateResult(CrossRate value) {
        this.getRawCrossRateResult = value;
    }

}
