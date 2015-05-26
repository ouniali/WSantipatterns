
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
 *         &lt;element name="QueryMasterDocumentsResult" type="{http://www.xignite.com/services/}MasterDocumentsResult" minOccurs="0"/>
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
    "queryMasterDocumentsResult"
})
@XmlRootElement(name = "QueryMasterDocumentsResponse")
public class QueryMasterDocumentsResponse {

    @XmlElement(name = "QueryMasterDocumentsResult")
    protected MasterDocumentsResult queryMasterDocumentsResult;

    /**
     * Gets the value of the queryMasterDocumentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link MasterDocumentsResult }
     *     
     */
    public MasterDocumentsResult getQueryMasterDocumentsResult() {
        return queryMasterDocumentsResult;
    }

    /**
     * Sets the value of the queryMasterDocumentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterDocumentsResult }
     *     
     */
    public void setQueryMasterDocumentsResult(MasterDocumentsResult value) {
        this.queryMasterDocumentsResult = value;
    }

}
