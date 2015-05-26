
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
 *         &lt;element name="GetBestCrossRatesResult" type="{http://www.xignite.com/services/}ArrayOfRate" minOccurs="0"/>
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
    "getBestCrossRatesResult"
})
@XmlRootElement(name = "GetBestCrossRatesResponse")
public class GetBestCrossRatesResponse {

    @XmlElement(name = "GetBestCrossRatesResult")
    protected ArrayOfRate getBestCrossRatesResult;

    /**
     * Gets the value of the getBestCrossRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRate }
     *     
     */
    public ArrayOfRate getGetBestCrossRatesResult() {
        return getBestCrossRatesResult;
    }

    /**
     * Sets the value of the getBestCrossRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRate }
     *     
     */
    public void setGetBestCrossRatesResult(ArrayOfRate value) {
        this.getBestCrossRatesResult = value;
    }

}
