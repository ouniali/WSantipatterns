
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
 *         &lt;element name="ListIndustriesResult" type="{http://www.xignite.com/services/}ArrayOfIndustry" minOccurs="0"/>
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
    "listIndustriesResult"
})
@XmlRootElement(name = "ListIndustriesResponse")
public class ListIndustriesResponse {

    @XmlElement(name = "ListIndustriesResult")
    protected ArrayOfIndustry listIndustriesResult;

    /**
     * Gets the value of the listIndustriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIndustry }
     *     
     */
    public ArrayOfIndustry getListIndustriesResult() {
        return listIndustriesResult;
    }

    /**
     * Sets the value of the listIndustriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIndustry }
     *     
     */
    public void setListIndustriesResult(ArrayOfIndustry value) {
        this.listIndustriesResult = value;
    }

}
