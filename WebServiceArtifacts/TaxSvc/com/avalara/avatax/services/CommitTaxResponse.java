
package com.avalara.avatax.services;

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
 *         &lt;element name="CommitTaxResult" type="{http://avatax.avalara.com/services}CommitTaxResult" minOccurs="0"/>
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
    "commitTaxResult"
})
@XmlRootElement(name = "CommitTaxResponse")
public class CommitTaxResponse {

    @XmlElement(name = "CommitTaxResult")
    protected CommitTaxResult commitTaxResult;

    /**
     * Gets the value of the commitTaxResult property.
     * 
     * @return
     *     possible object is
     *     {@link CommitTaxResult }
     *     
     */
    public CommitTaxResult getCommitTaxResult() {
        return commitTaxResult;
    }

    /**
     * Sets the value of the commitTaxResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitTaxResult }
     *     
     */
    public void setCommitTaxResult(CommitTaxResult value) {
        this.commitTaxResult = value;
    }

}
