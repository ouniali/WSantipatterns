
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
 *         &lt;element name="GetAllHistoricalEnergySwapsResult" type="{http://www.xignite.com/services/}ArrayOfFutureQuote" minOccurs="0"/>
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
    "getAllHistoricalEnergySwapsResult"
})
@XmlRootElement(name = "GetAllHistoricalEnergySwapsResponse")
public class GetAllHistoricalEnergySwapsResponse {

    @XmlElement(name = "GetAllHistoricalEnergySwapsResult")
    protected ArrayOfFutureQuote getAllHistoricalEnergySwapsResult;

    /**
     * Gets the value of the getAllHistoricalEnergySwapsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFutureQuote }
     *     
     */
    public ArrayOfFutureQuote getGetAllHistoricalEnergySwapsResult() {
        return getAllHistoricalEnergySwapsResult;
    }

    /**
     * Sets the value of the getAllHistoricalEnergySwapsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFutureQuote }
     *     
     */
    public void setGetAllHistoricalEnergySwapsResult(ArrayOfFutureQuote value) {
        this.getAllHistoricalEnergySwapsResult = value;
    }

}
