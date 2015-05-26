
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
 *         &lt;element name="GetLatestCrossRatesResult" type="{http://www.xignite.com/services/}ArrayOfCrossRate" minOccurs="0"/>
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
    "getLatestCrossRatesResult"
})
@XmlRootElement(name = "GetLatestCrossRatesResponse")
public class GetLatestCrossRatesResponse {

    @XmlElement(name = "GetLatestCrossRatesResult")
    protected ArrayOfCrossRate getLatestCrossRatesResult;

    /**
     * Gets the value of the getLatestCrossRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrossRate }
     *     
     */
    public ArrayOfCrossRate getGetLatestCrossRatesResult() {
        return getLatestCrossRatesResult;
    }

    /**
     * Sets the value of the getLatestCrossRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrossRate }
     *     
     */
    public void setGetLatestCrossRatesResult(ArrayOfCrossRate value) {
        this.getLatestCrossRatesResult = value;
    }

}
