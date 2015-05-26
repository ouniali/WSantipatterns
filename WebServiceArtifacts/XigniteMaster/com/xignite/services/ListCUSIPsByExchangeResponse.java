
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
 *         &lt;element name="ListCUSIPsByExchangeResult" type="{http://www.xignite.com/services/}CUSIPList" minOccurs="0"/>
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
    "listCUSIPsByExchangeResult"
})
@XmlRootElement(name = "ListCUSIPsByExchangeResponse")
public class ListCUSIPsByExchangeResponse {

    @XmlElement(name = "ListCUSIPsByExchangeResult")
    protected CUSIPList listCUSIPsByExchangeResult;

    /**
     * Gets the value of the listCUSIPsByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link CUSIPList }
     *     
     */
    public CUSIPList getListCUSIPsByExchangeResult() {
        return listCUSIPsByExchangeResult;
    }

    /**
     * Sets the value of the listCUSIPsByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CUSIPList }
     *     
     */
    public void setListCUSIPsByExchangeResult(CUSIPList value) {
        this.listCUSIPsByExchangeResult = value;
    }

}
