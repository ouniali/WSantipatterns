
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
 *         &lt;element name="ListCurrenciesResult" type="{http://www.xignite.com/services/}CurrencyList" minOccurs="0"/>
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
    "listCurrenciesResult"
})
@XmlRootElement(name = "ListCurrenciesResponse")
public class ListCurrenciesResponse {

    @XmlElement(name = "ListCurrenciesResult")
    protected CurrencyList listCurrenciesResult;

    /**
     * Gets the value of the listCurrenciesResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyList }
     *     
     */
    public CurrencyList getListCurrenciesResult() {
        return listCurrenciesResult;
    }

    /**
     * Sets the value of the listCurrenciesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyList }
     *     
     */
    public void setListCurrenciesResult(CurrencyList value) {
        this.listCurrenciesResult = value;
    }

}
