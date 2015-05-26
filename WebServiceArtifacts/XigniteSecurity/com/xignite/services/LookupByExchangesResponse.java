
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
 *         &lt;element name="LookupByExchangesResult" type="{http://www.xignite.com/services/}ArrayOfLookupItem" minOccurs="0"/>
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
    "lookupByExchangesResult"
})
@XmlRootElement(name = "LookupByExchangesResponse")
public class LookupByExchangesResponse {

    @XmlElement(name = "LookupByExchangesResult")
    protected ArrayOfLookupItem lookupByExchangesResult;

    /**
     * Gets the value of the lookupByExchangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLookupItem }
     *     
     */
    public ArrayOfLookupItem getLookupByExchangesResult() {
        return lookupByExchangesResult;
    }

    /**
     * Sets the value of the lookupByExchangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLookupItem }
     *     
     */
    public void setLookupByExchangesResult(ArrayOfLookupItem value) {
        this.lookupByExchangesResult = value;
    }

}
