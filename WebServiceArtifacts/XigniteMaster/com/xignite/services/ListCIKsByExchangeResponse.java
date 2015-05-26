
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
 *         &lt;element name="ListCIKsByExchangeResult" type="{http://www.xignite.com/services/}CIKList" minOccurs="0"/>
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
    "listCIKsByExchangeResult"
})
@XmlRootElement(name = "ListCIKsByExchangeResponse")
public class ListCIKsByExchangeResponse {

    @XmlElement(name = "ListCIKsByExchangeResult")
    protected CIKList listCIKsByExchangeResult;

    /**
     * Gets the value of the listCIKsByExchangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link CIKList }
     *     
     */
    public CIKList getListCIKsByExchangeResult() {
        return listCIKsByExchangeResult;
    }

    /**
     * Sets the value of the listCIKsByExchangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIKList }
     *     
     */
    public void setListCIKsByExchangeResult(CIKList value) {
        this.listCIKsByExchangeResult = value;
    }

}
