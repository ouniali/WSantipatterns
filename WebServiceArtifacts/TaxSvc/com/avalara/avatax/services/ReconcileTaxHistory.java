
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
 *         &lt;element name="ReconcileTaxHistoryRequest" type="{http://avatax.avalara.com/services}ReconcileTaxHistoryRequest" minOccurs="0"/>
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
    "reconcileTaxHistoryRequest"
})
@XmlRootElement(name = "ReconcileTaxHistory")
public class ReconcileTaxHistory {

    @XmlElement(name = "ReconcileTaxHistoryRequest")
    protected ReconcileTaxHistoryRequest reconcileTaxHistoryRequest;

    /**
     * Gets the value of the reconcileTaxHistoryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ReconcileTaxHistoryRequest }
     *     
     */
    public ReconcileTaxHistoryRequest getReconcileTaxHistoryRequest() {
        return reconcileTaxHistoryRequest;
    }

    /**
     * Sets the value of the reconcileTaxHistoryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconcileTaxHistoryRequest }
     *     
     */
    public void setReconcileTaxHistoryRequest(ReconcileTaxHistoryRequest value) {
        this.reconcileTaxHistoryRequest = value;
    }

}
