
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
 *         &lt;element name="ListOperationsResult" type="{http://www.xignite.com/services/}ArrayOfOperation" minOccurs="0"/>
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
    "listOperationsResult"
})
@XmlRootElement(name = "ListOperationsResponse")
public class ListOperationsResponse {

    @XmlElement(name = "ListOperationsResult")
    protected ArrayOfOperation listOperationsResult;

    /**
     * Gets the value of the listOperationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperation }
     *     
     */
    public ArrayOfOperation getListOperationsResult() {
        return listOperationsResult;
    }

    /**
     * Sets the value of the listOperationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperation }
     *     
     */
    public void setListOperationsResult(ArrayOfOperation value) {
        this.listOperationsResult = value;
    }

}
