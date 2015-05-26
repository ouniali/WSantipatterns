
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
 *         &lt;element name="LookupCIKResult" type="{http://www.xignite.com/services/}ArrayOfCIKLookup" minOccurs="0"/>
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
    "lookupCIKResult"
})
@XmlRootElement(name = "LookupCIKResponse")
public class LookupCIKResponse {

    @XmlElement(name = "LookupCIKResult")
    protected ArrayOfCIKLookup lookupCIKResult;

    /**
     * Gets the value of the lookupCIKResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCIKLookup }
     *     
     */
    public ArrayOfCIKLookup getLookupCIKResult() {
        return lookupCIKResult;
    }

    /**
     * Sets the value of the lookupCIKResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCIKLookup }
     *     
     */
    public void setLookupCIKResult(ArrayOfCIKLookup value) {
        this.lookupCIKResult = value;
    }

}
