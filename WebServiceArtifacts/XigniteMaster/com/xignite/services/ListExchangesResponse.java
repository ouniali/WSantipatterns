
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
 *         &lt;element name="ListExchangesResult" type="{http://www.xignite.com/services/}ArrayOfExchange" minOccurs="0"/>
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
    "listExchangesResult"
})
@XmlRootElement(name = "ListExchangesResponse")
public class ListExchangesResponse {

    @XmlElement(name = "ListExchangesResult")
    protected ArrayOfExchange listExchangesResult;

    /**
     * Gets the value of the listExchangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExchange }
     *     
     */
    public ArrayOfExchange getListExchangesResult() {
        return listExchangesResult;
    }

    /**
     * Sets the value of the listExchangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExchange }
     *     
     */
    public void setListExchangesResult(ArrayOfExchange value) {
        this.listExchangesResult = value;
    }

}
