
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
 *         &lt;element name="GetInstrumentTransformationsAllResult" type="{http://www.xignite.com/services/}ArrayOfInstrumentTransformation" minOccurs="0"/>
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
    "getInstrumentTransformationsAllResult"
})
@XmlRootElement(name = "GetInstrumentTransformationsAllResponse")
public class GetInstrumentTransformationsAllResponse {

    @XmlElement(name = "GetInstrumentTransformationsAllResult")
    protected ArrayOfInstrumentTransformation getInstrumentTransformationsAllResult;

    /**
     * Gets the value of the getInstrumentTransformationsAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstrumentTransformation }
     *     
     */
    public ArrayOfInstrumentTransformation getGetInstrumentTransformationsAllResult() {
        return getInstrumentTransformationsAllResult;
    }

    /**
     * Sets the value of the getInstrumentTransformationsAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstrumentTransformation }
     *     
     */
    public void setGetInstrumentTransformationsAllResult(ArrayOfInstrumentTransformation value) {
        this.getInstrumentTransformationsAllResult = value;
    }

}
