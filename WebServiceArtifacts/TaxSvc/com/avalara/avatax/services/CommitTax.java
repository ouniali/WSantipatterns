
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
 *         &lt;element name="CommitTaxRequest" type="{http://avatax.avalara.com/services}CommitTaxRequest" minOccurs="0"/>
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
    "commitTaxRequest"
})
@XmlRootElement(name = "CommitTax")
public class CommitTax {

    @XmlElement(name = "CommitTaxRequest")
    protected CommitTaxRequest commitTaxRequest;

    /**
     * Gets the value of the commitTaxRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CommitTaxRequest }
     *     
     */
    public CommitTaxRequest getCommitTaxRequest() {
        return commitTaxRequest;
    }

    /**
     * Sets the value of the commitTaxRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitTaxRequest }
     *     
     */
    public void setCommitTaxRequest(CommitTaxRequest value) {
        this.commitTaxRequest = value;
    }

}
