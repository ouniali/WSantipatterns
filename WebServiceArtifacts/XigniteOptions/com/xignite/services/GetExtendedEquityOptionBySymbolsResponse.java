
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
 *         &lt;element name="GetExtendedEquityOptionBySymbolsResult" type="{http://www.xignite.com/services/}ArrayOfExtendedOption" minOccurs="0"/>
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
    "getExtendedEquityOptionBySymbolsResult"
})
@XmlRootElement(name = "GetExtendedEquityOptionBySymbolsResponse")
public class GetExtendedEquityOptionBySymbolsResponse {

    @XmlElement(name = "GetExtendedEquityOptionBySymbolsResult")
    protected ArrayOfExtendedOption getExtendedEquityOptionBySymbolsResult;

    /**
     * Gets the value of the getExtendedEquityOptionBySymbolsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtendedOption }
     *     
     */
    public ArrayOfExtendedOption getGetExtendedEquityOptionBySymbolsResult() {
        return getExtendedEquityOptionBySymbolsResult;
    }

    /**
     * Sets the value of the getExtendedEquityOptionBySymbolsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtendedOption }
     *     
     */
    public void setGetExtendedEquityOptionBySymbolsResult(ArrayOfExtendedOption value) {
        this.getExtendedEquityOptionBySymbolsResult = value;
    }

}
