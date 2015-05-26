
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
 *         &lt;element name="ListActiveCurrenciesResult" type="{http://www.xignite.com/services/}Currencies" minOccurs="0"/>
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
    "listActiveCurrenciesResult"
})
@XmlRootElement(name = "ListActiveCurrenciesResponse")
public class ListActiveCurrenciesResponse {

    @XmlElement(name = "ListActiveCurrenciesResult")
    protected Currencies listActiveCurrenciesResult;

    /**
     * Gets the value of the listActiveCurrenciesResult property.
     * 
     * @return
     *     possible object is
     *     {@link Currencies }
     *     
     */
    public Currencies getListActiveCurrenciesResult() {
        return listActiveCurrenciesResult;
    }

    /**
     * Sets the value of the listActiveCurrenciesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currencies }
     *     
     */
    public void setListActiveCurrenciesResult(Currencies value) {
        this.listActiveCurrenciesResult = value;
    }

}
