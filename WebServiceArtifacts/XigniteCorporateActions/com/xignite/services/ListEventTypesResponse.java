
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
 *         &lt;element name="ListEventTypesResult" type="{http://www.xignite.com/services/}PossibleValues" minOccurs="0"/>
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
    "listEventTypesResult"
})
@XmlRootElement(name = "ListEventTypesResponse")
public class ListEventTypesResponse {

    @XmlElement(name = "ListEventTypesResult")
    protected PossibleValues listEventTypesResult;

    /**
     * Gets the value of the listEventTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link PossibleValues }
     *     
     */
    public PossibleValues getListEventTypesResult() {
        return listEventTypesResult;
    }

    /**
     * Sets the value of the listEventTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossibleValues }
     *     
     */
    public void setListEventTypesResult(PossibleValues value) {
        this.listEventTypesResult = value;
    }

}
