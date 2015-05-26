
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
 *         &lt;element name="GetH15RatesResult" type="{http://www.xignite.com/services/}ArrayOfInterestRate" minOccurs="0"/>
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
    "getH15RatesResult"
})
@XmlRootElement(name = "GetH15RatesResponse")
public class GetH15RatesResponse {

    @XmlElement(name = "GetH15RatesResult")
    protected ArrayOfInterestRate getH15RatesResult;

    /**
     * Gets the value of the getH15RatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInterestRate }
     *     
     */
    public ArrayOfInterestRate getGetH15RatesResult() {
        return getH15RatesResult;
    }

    /**
     * Sets the value of the getH15RatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInterestRate }
     *     
     */
    public void setGetH15RatesResult(ArrayOfInterestRate value) {
        this.getH15RatesResult = value;
    }

}
