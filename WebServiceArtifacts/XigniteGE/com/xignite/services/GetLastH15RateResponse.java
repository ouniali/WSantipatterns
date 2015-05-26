
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
 *         &lt;element name="GetLastH15RateResult" type="{http://www.xignite.com/services/}InterestRate" minOccurs="0"/>
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
    "getLastH15RateResult"
})
@XmlRootElement(name = "GetLastH15RateResponse")
public class GetLastH15RateResponse {

    @XmlElement(name = "GetLastH15RateResult")
    protected InterestRate getLastH15RateResult;

    /**
     * Gets the value of the getLastH15RateResult property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate }
     *     
     */
    public InterestRate getGetLastH15RateResult() {
        return getLastH15RateResult;
    }

    /**
     * Sets the value of the getLastH15RateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate }
     *     
     */
    public void setGetLastH15RateResult(InterestRate value) {
        this.getLastH15RateResult = value;
    }

}
