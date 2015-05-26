
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
 *         &lt;element name="GetAllEquityOptionChainResult" type="{http://www.xignite.com/services/}Options" minOccurs="0"/>
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
    "getAllEquityOptionChainResult"
})
@XmlRootElement(name = "GetAllEquityOptionChainResponse")
public class GetAllEquityOptionChainResponse {

    @XmlElement(name = "GetAllEquityOptionChainResult")
    protected Options getAllEquityOptionChainResult;

    /**
     * Gets the value of the getAllEquityOptionChainResult property.
     * 
     * @return
     *     possible object is
     *     {@link Options }
     *     
     */
    public Options getGetAllEquityOptionChainResult() {
        return getAllEquityOptionChainResult;
    }

    /**
     * Sets the value of the getAllEquityOptionChainResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Options }
     *     
     */
    public void setGetAllEquityOptionChainResult(Options value) {
        this.getAllEquityOptionChainResult = value;
    }

}
