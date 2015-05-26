
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
 *         &lt;element name="ListSECFilingTypesResult" type="{http://www.xignite.com/services/}ArrayOfSubmission" minOccurs="0"/>
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
    "listSECFilingTypesResult"
})
@XmlRootElement(name = "ListSECFilingTypesResponse")
public class ListSECFilingTypesResponse {

    @XmlElement(name = "ListSECFilingTypesResult")
    protected ArrayOfSubmission listSECFilingTypesResult;

    /**
     * Gets the value of the listSECFilingTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubmission }
     *     
     */
    public ArrayOfSubmission getListSECFilingTypesResult() {
        return listSECFilingTypesResult;
    }

    /**
     * Sets the value of the listSECFilingTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubmission }
     *     
     */
    public void setListSECFilingTypesResult(ArrayOfSubmission value) {
        this.listSECFilingTypesResult = value;
    }

}
