
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
 *         &lt;element name="GetExtendedEquityOptionChainResult" type="{http://www.xignite.com/services/}ExtendedOptions" minOccurs="0"/>
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
    "getExtendedEquityOptionChainResult"
})
@XmlRootElement(name = "GetExtendedEquityOptionChainResponse")
public class GetExtendedEquityOptionChainResponse {

    @XmlElement(name = "GetExtendedEquityOptionChainResult")
    protected ExtendedOptions getExtendedEquityOptionChainResult;

    /**
     * Gets the value of the getExtendedEquityOptionChainResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedOptions }
     *     
     */
    public ExtendedOptions getGetExtendedEquityOptionChainResult() {
        return getExtendedEquityOptionChainResult;
    }

    /**
     * Sets the value of the getExtendedEquityOptionChainResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedOptions }
     *     
     */
    public void setGetExtendedEquityOptionChainResult(ExtendedOptions value) {
        this.getExtendedEquityOptionChainResult = value;
    }

}
