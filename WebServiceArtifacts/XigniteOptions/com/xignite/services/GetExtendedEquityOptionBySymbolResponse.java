
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
 *         &lt;element name="GetExtendedEquityOptionBySymbolResult" type="{http://www.xignite.com/services/}ExtendedOption" minOccurs="0"/>
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
    "getExtendedEquityOptionBySymbolResult"
})
@XmlRootElement(name = "GetExtendedEquityOptionBySymbolResponse")
public class GetExtendedEquityOptionBySymbolResponse {

    @XmlElement(name = "GetExtendedEquityOptionBySymbolResult")
    protected ExtendedOption getExtendedEquityOptionBySymbolResult;

    /**
     * Gets the value of the getExtendedEquityOptionBySymbolResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedOption }
     *     
     */
    public ExtendedOption getGetExtendedEquityOptionBySymbolResult() {
        return getExtendedEquityOptionBySymbolResult;
    }

    /**
     * Sets the value of the getExtendedEquityOptionBySymbolResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedOption }
     *     
     */
    public void setGetExtendedEquityOptionBySymbolResult(ExtendedOption value) {
        this.getExtendedEquityOptionBySymbolResult = value;
    }

}
