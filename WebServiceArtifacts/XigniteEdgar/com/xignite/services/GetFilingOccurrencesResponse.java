
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
 *         &lt;element name="GetFilingOccurrencesResult" type="{http://www.xignite.com/services/}ArrayOfFilingOccurrence" minOccurs="0"/>
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
    "getFilingOccurrencesResult"
})
@XmlRootElement(name = "GetFilingOccurrencesResponse")
public class GetFilingOccurrencesResponse {

    @XmlElement(name = "GetFilingOccurrencesResult")
    protected ArrayOfFilingOccurrence getFilingOccurrencesResult;

    /**
     * Gets the value of the getFilingOccurrencesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFilingOccurrence }
     *     
     */
    public ArrayOfFilingOccurrence getGetFilingOccurrencesResult() {
        return getFilingOccurrencesResult;
    }

    /**
     * Sets the value of the getFilingOccurrencesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFilingOccurrence }
     *     
     */
    public void setGetFilingOccurrencesResult(ArrayOfFilingOccurrence value) {
        this.getFilingOccurrencesResult = value;
    }

}
