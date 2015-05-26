
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
 *         &lt;element name="GetHistoricalSwaptionFamilyResult" type="{http://www.xignite.com/services/}ArrayOfSwaption" minOccurs="0"/>
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
    "getHistoricalSwaptionFamilyResult"
})
@XmlRootElement(name = "GetHistoricalSwaptionFamilyResponse")
public class GetHistoricalSwaptionFamilyResponse {

    @XmlElement(name = "GetHistoricalSwaptionFamilyResult")
    protected ArrayOfSwaption getHistoricalSwaptionFamilyResult;

    /**
     * Gets the value of the getHistoricalSwaptionFamilyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSwaption }
     *     
     */
    public ArrayOfSwaption getGetHistoricalSwaptionFamilyResult() {
        return getHistoricalSwaptionFamilyResult;
    }

    /**
     * Sets the value of the getHistoricalSwaptionFamilyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSwaption }
     *     
     */
    public void setGetHistoricalSwaptionFamilyResult(ArrayOfSwaption value) {
        this.getHistoricalSwaptionFamilyResult = value;
    }

}
