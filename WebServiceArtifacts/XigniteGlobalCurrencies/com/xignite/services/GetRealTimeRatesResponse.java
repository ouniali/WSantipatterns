
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
 *         &lt;element name="GetRealTimeRatesResult" type="{http://www.xignite.com/services/}ArrayOfRate" minOccurs="0"/>
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
    "getRealTimeRatesResult"
})
@XmlRootElement(name = "GetRealTimeRatesResponse")
public class GetRealTimeRatesResponse {

    @XmlElement(name = "GetRealTimeRatesResult")
    protected ArrayOfRate getRealTimeRatesResult;

    /**
     * Gets the value of the getRealTimeRatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRate }
     *     
     */
    public ArrayOfRate getGetRealTimeRatesResult() {
        return getRealTimeRatesResult;
    }

    /**
     * Sets the value of the getRealTimeRatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRate }
     *     
     */
    public void setGetRealTimeRatesResult(ArrayOfRate value) {
        this.getRealTimeRatesResult = value;
    }

}
