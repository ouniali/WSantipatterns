
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
 *         &lt;element name="GetMissingTickRangesResult" type="{http://www.xignite.com/services/}ArrayOfMissingTickRange" minOccurs="0"/>
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
    "getMissingTickRangesResult"
})
@XmlRootElement(name = "GetMissingTickRangesResponse")
public class GetMissingTickRangesResponse {

    @XmlElement(name = "GetMissingTickRangesResult")
    protected ArrayOfMissingTickRange getMissingTickRangesResult;

    /**
     * Gets the value of the getMissingTickRangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMissingTickRange }
     *     
     */
    public ArrayOfMissingTickRange getGetMissingTickRangesResult() {
        return getMissingTickRangesResult;
    }

    /**
     * Sets the value of the getMissingTickRangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMissingTickRange }
     *     
     */
    public void setGetMissingTickRangesResult(ArrayOfMissingTickRange value) {
        this.getMissingTickRangesResult = value;
    }

}
