
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
 *         &lt;element name="LookupNameByCIKResult" type="{http://www.xignite.com/services/}CIKLookup" minOccurs="0"/>
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
    "lookupNameByCIKResult"
})
@XmlRootElement(name = "LookupNameByCIKResponse")
public class LookupNameByCIKResponse {

    @XmlElement(name = "LookupNameByCIKResult")
    protected CIKLookup lookupNameByCIKResult;

    /**
     * Gets the value of the lookupNameByCIKResult property.
     * 
     * @return
     *     possible object is
     *     {@link CIKLookup }
     *     
     */
    public CIKLookup getLookupNameByCIKResult() {
        return lookupNameByCIKResult;
    }

    /**
     * Sets the value of the lookupNameByCIKResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIKLookup }
     *     
     */
    public void setLookupNameByCIKResult(CIKLookup value) {
        this.lookupNameByCIKResult = value;
    }

}
