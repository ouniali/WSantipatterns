
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
 *         &lt;element name="GetSingleQuoteResult" type="{http://www.xignite.com/services/}Quote" minOccurs="0"/>
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
    "getSingleQuoteResult"
})
@XmlRootElement(name = "GetSingleQuoteResponse")
public class GetSingleQuoteResponse {

    @XmlElement(name = "GetSingleQuoteResult")
    protected Quote getSingleQuoteResult;

    /**
     * Gets the value of the getSingleQuoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link Quote }
     *     
     */
    public Quote getGetSingleQuoteResult() {
        return getSingleQuoteResult;
    }

    /**
     * Sets the value of the getSingleQuoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quote }
     *     
     */
    public void setGetSingleQuoteResult(Quote value) {
        this.getSingleQuoteResult = value;
    }

}
