
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
 *         &lt;element name="ListTopExchangesResult" type="{http://www.xignite.com/services/}ArrayOfTopExchange" minOccurs="0"/>
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
    "listTopExchangesResult"
})
@XmlRootElement(name = "ListTopExchangesResponse")
public class ListTopExchangesResponse {

    @XmlElement(name = "ListTopExchangesResult")
    protected ArrayOfTopExchange listTopExchangesResult;

    /**
     * Gets the value of the listTopExchangesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTopExchange }
     *     
     */
    public ArrayOfTopExchange getListTopExchangesResult() {
        return listTopExchangesResult;
    }

    /**
     * Sets the value of the listTopExchangesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTopExchange }
     *     
     */
    public void setListTopExchangesResult(ArrayOfTopExchange value) {
        this.listTopExchangesResult = value;
    }

}
