
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
 *         &lt;element name="GetEquityOptionBySymbolResult" type="{http://www.xignite.com/services/}Option" minOccurs="0"/>
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
    "getEquityOptionBySymbolResult"
})
@XmlRootElement(name = "GetEquityOptionBySymbolResponse")
public class GetEquityOptionBySymbolResponse {

    @XmlElement(name = "GetEquityOptionBySymbolResult")
    protected Option getEquityOptionBySymbolResult;

    /**
     * Gets the value of the getEquityOptionBySymbolResult property.
     * 
     * @return
     *     possible object is
     *     {@link Option }
     *     
     */
    public Option getGetEquityOptionBySymbolResult() {
        return getEquityOptionBySymbolResult;
    }

    /**
     * Sets the value of the getEquityOptionBySymbolResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Option }
     *     
     */
    public void setGetEquityOptionBySymbolResult(Option value) {
        this.getEquityOptionBySymbolResult = value;
    }

}
