
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
 *         &lt;element name="GetRealTimeCrossRatesResult" type="{http://www.xignite.com/services/}ArrayOfCrossRate" minOccurs="0"/>
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
    "getRealTimeCrossRatesResult"
})
@XmlRootElement(name = "GetRealTimeCrossRatesResponse")
public class GetRealTimeCrossRatesResponse {

    @XmlElement(name = "GetRealTimeCrossRatesResult")
    protected ArrayOfCrossRate getRealTimeCrossRatesResult;

    /**
     * Gets the value of the getRealTimeCrossRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCrossRate }
     *     
     */
    public ArrayOfCrossRate getGetRealTimeCrossRatesResult() {
        return getRealTimeCrossRatesResult;
    }

    /**
     * Sets the value of the getRealTimeCrossRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCrossRate }
     *     
     */
    public void setGetRealTimeCrossRatesResult(ArrayOfCrossRate value) {
        this.getRealTimeCrossRatesResult = value;
    }

}
