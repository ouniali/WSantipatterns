
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
 *         &lt;element name="ReconcileTaxHistoryResult" type="{http://avatax.avalara.com/services}ReconcileTaxHistoryResult" minOccurs="0"/>
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
    "reconcileTaxHistoryResult"
})
@XmlRootElement(name = "ReconcileTaxHistoryResponse")
public class ReconcileTaxHistoryResponse {

    @XmlElement(name = "ReconcileTaxHistoryResult")
    protected ReconcileTaxHistoryResult reconcileTaxHistoryResult;

    /**
     * Gets the value of the reconcileTaxHistoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReconcileTaxHistoryResult }
     *     
     */
    public ReconcileTaxHistoryResult getReconcileTaxHistoryResult() {
        return reconcileTaxHistoryResult;
    }

    /**
     * Sets the value of the reconcileTaxHistoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconcileTaxHistoryResult }
     *     
     */
    public void setReconcileTaxHistoryResult(ReconcileTaxHistoryResult value) {
        this.reconcileTaxHistoryResult = value;
    }

}
