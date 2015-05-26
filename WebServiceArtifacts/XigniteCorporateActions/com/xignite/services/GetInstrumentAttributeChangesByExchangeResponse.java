
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
 *         &lt;element name="GetInstrumentAttributeChangesByExchangeResult" type="{http://www.xignite.com/services/}ArrayOfInstrumentAttributeChange" minOccurs="0"/>
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
    "getInstrumentAttributeChangesByExchangeResult"
})
@XmlRootElement(name = "GetInstrumentAttributeChangesByExchangeResponse")
public class GetInstrumentAttributeChangesByExchangeResponse {

    @XmlElement(name = "GetInstrumentAttributeChangesByExchangeResult")
    protected ArrayOfInstrumentAttributeChange getInstrumentAttributeChangesByExchangeResult;

    /**
     * Gets the value of the getInstrumentAttributeChangesByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstrumentAttributeChange }
     *     
     */
    public ArrayOfInstrumentAttributeChange getGetInstrumentAttributeChangesByExchangeResult() {
        return getInstrumentAttributeChangesByExchangeResult;
    }

    /**
     * Sets the value of the getInstrumentAttributeChangesByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstrumentAttributeChange }
     *     
     */
    public void setGetInstrumentAttributeChangesByExchangeResult(ArrayOfInstrumentAttributeChange value) {
        this.getInstrumentAttributeChangesByExchangeResult = value;
    }

}
