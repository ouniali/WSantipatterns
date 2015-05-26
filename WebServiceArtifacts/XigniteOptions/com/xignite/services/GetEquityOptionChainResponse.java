
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
 *         &lt;element name="GetEquityOptionChainResult" type="{http://www.xignite.com/services/}Options" minOccurs="0"/>
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
    "getEquityOptionChainResult"
})
@XmlRootElement(name = "GetEquityOptionChainResponse")
public class GetEquityOptionChainResponse {

    @XmlElement(name = "GetEquityOptionChainResult")
    protected Options getEquityOptionChainResult;

    /**
     * Gets the value of the getEquityOptionChainResult property.
     * 
     * @return
     *     possible object is
     *     {@link Options }
     *     
     */
    public Options getGetEquityOptionChainResult() {
        return getEquityOptionChainResult;
    }

    /**
     * Sets the value of the getEquityOptionChainResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Options }
     *     
     */
    public void setGetEquityOptionChainResult(Options value) {
        this.getEquityOptionChainResult = value;
    }

}
