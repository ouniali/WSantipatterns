
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
 *         &lt;element name="GetInstrumentAttributeChangesResult" type="{http://www.xignite.com/services/}ArrayOfInstrumentAttributeChange" minOccurs="0"/>
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
    "getInstrumentAttributeChangesResult"
})
@XmlRootElement(name = "GetInstrumentAttributeChangesResponse")
public class GetInstrumentAttributeChangesResponse {

    @XmlElement(name = "GetInstrumentAttributeChangesResult")
    protected ArrayOfInstrumentAttributeChange getInstrumentAttributeChangesResult;

    /**
     * Gets the value of the getInstrumentAttributeChangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstrumentAttributeChange }
     *     
     */
    public ArrayOfInstrumentAttributeChange getGetInstrumentAttributeChangesResult() {
        return getInstrumentAttributeChangesResult;
    }

    /**
     * Sets the value of the getInstrumentAttributeChangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstrumentAttributeChange }
     *     
     */
    public void setGetInstrumentAttributeChangesResult(ArrayOfInstrumentAttributeChange value) {
        this.getInstrumentAttributeChangesResult = value;
    }

}
