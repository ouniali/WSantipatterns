
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
 *         &lt;element name="GetCUSIPFundResult" type="{http://www.xignite.com/services/}Cusip" minOccurs="0"/>
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
    "getCUSIPFundResult"
})
@XmlRootElement(name = "GetCUSIPFundResponse")
public class GetCUSIPFundResponse {

    @XmlElement(name = "GetCUSIPFundResult")
    protected Cusip getCUSIPFundResult;

    /**
     * Gets the value of the getCUSIPFundResult property.
     * 
     * @return
     *     possible object is
     *     {@link Cusip }
     *     
     */
    public Cusip getGetCUSIPFundResult() {
        return getCUSIPFundResult;
    }

    /**
     * Sets the value of the getCUSIPFundResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cusip }
     *     
     */
    public void setGetCUSIPFundResult(Cusip value) {
        this.getCUSIPFundResult = value;
    }

}
