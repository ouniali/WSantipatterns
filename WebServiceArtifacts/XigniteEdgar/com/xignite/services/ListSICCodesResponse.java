
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
 *         &lt;element name="ListSICCodesResult" type="{http://www.xignite.com/services/}ArrayOfSICCode" minOccurs="0"/>
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
    "listSICCodesResult"
})
@XmlRootElement(name = "ListSICCodesResponse")
public class ListSICCodesResponse {

    @XmlElement(name = "ListSICCodesResult")
    protected ArrayOfSICCode listSICCodesResult;

    /**
     * Gets the value of the listSICCodesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSICCode }
     *     
     */
    public ArrayOfSICCode getListSICCodesResult() {
        return listSICCodesResult;
    }

    /**
     * Sets the value of the listSICCodesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSICCode }
     *     
     */
    public void setListSICCodesResult(ArrayOfSICCode value) {
        this.listSICCodesResult = value;
    }

}
