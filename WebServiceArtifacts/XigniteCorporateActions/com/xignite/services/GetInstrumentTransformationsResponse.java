
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
 *         &lt;element name="GetInstrumentTransformationsResult" type="{http://www.xignite.com/services/}ArrayOfInstrumentTransformation" minOccurs="0"/>
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
    "getInstrumentTransformationsResult"
})
@XmlRootElement(name = "GetInstrumentTransformationsResponse")
public class GetInstrumentTransformationsResponse {

    @XmlElement(name = "GetInstrumentTransformationsResult")
    protected ArrayOfInstrumentTransformation getInstrumentTransformationsResult;

    /**
     * Gets the value of the getInstrumentTransformationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstrumentTransformation }
     *     
     */
    public ArrayOfInstrumentTransformation getGetInstrumentTransformationsResult() {
        return getInstrumentTransformationsResult;
    }

    /**
     * Sets the value of the getInstrumentTransformationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstrumentTransformation }
     *     
     */
    public void setGetInstrumentTransformationsResult(ArrayOfInstrumentTransformation value) {
        this.getInstrumentTransformationsResult = value;
    }

}
