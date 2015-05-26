
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
 *         &lt;element name="GetInstrumentTransformationsByExchangeResult" type="{http://www.xignite.com/services/}ArrayOfInstrumentTransformation" minOccurs="0"/>
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
    "getInstrumentTransformationsByExchangeResult"
})
@XmlRootElement(name = "GetInstrumentTransformationsByExchangeResponse")
public class GetInstrumentTransformationsByExchangeResponse {

    @XmlElement(name = "GetInstrumentTransformationsByExchangeResult")
    protected ArrayOfInstrumentTransformation getInstrumentTransformationsByExchangeResult;

    /**
     * Gets the value of the getInstrumentTransformationsByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstrumentTransformation }
     *     
     */
    public ArrayOfInstrumentTransformation getGetInstrumentTransformationsByExchangeResult() {
        return getInstrumentTransformationsByExchangeResult;
    }

    /**
     * Sets the value of the getInstrumentTransformationsByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstrumentTransformation }
     *     
     */
    public void setGetInstrumentTransformationsByExchangeResult(ArrayOfInstrumentTransformation value) {
        this.getInstrumentTransformationsByExchangeResult = value;
    }

}
