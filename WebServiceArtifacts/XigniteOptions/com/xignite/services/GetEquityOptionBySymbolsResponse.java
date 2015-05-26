
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
 *         &lt;element name="GetEquityOptionBySymbolsResult" type="{http://www.xignite.com/services/}ArrayOfOption" minOccurs="0"/>
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
    "getEquityOptionBySymbolsResult"
})
@XmlRootElement(name = "GetEquityOptionBySymbolsResponse")
public class GetEquityOptionBySymbolsResponse {

    @XmlElement(name = "GetEquityOptionBySymbolsResult")
    protected ArrayOfOption getEquityOptionBySymbolsResult;

    /**
     * Gets the value of the getEquityOptionBySymbolsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOption }
     *     
     */
    public ArrayOfOption getGetEquityOptionBySymbolsResult() {
        return getEquityOptionBySymbolsResult;
    }

    /**
     * Sets the value of the getEquityOptionBySymbolsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOption }
     *     
     */
    public void setGetEquityOptionBySymbolsResult(ArrayOfOption value) {
        this.getEquityOptionBySymbolsResult = value;
    }

}
