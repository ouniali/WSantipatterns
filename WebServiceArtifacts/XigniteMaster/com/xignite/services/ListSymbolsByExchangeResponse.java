
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
 *         &lt;element name="ListSymbolsByExchangeResult" type="{http://www.xignite.com/services/}SymbolList" minOccurs="0"/>
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
    "listSymbolsByExchangeResult"
})
@XmlRootElement(name = "ListSymbolsByExchangeResponse")
public class ListSymbolsByExchangeResponse {

    @XmlElement(name = "ListSymbolsByExchangeResult")
    protected SymbolList listSymbolsByExchangeResult;

    /**
     * Gets the value of the listSymbolsByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolList }
     *     
     */
    public SymbolList getListSymbolsByExchangeResult() {
        return listSymbolsByExchangeResult;
    }

    /**
     * Sets the value of the listSymbolsByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolList }
     *     
     */
    public void setListSymbolsByExchangeResult(SymbolList value) {
        this.listSymbolsByExchangeResult = value;
    }

}
