
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
 *         &lt;element name="GetTaxHistoryRequest" type="{http://avatax.avalara.com/services}GetTaxHistoryRequest" minOccurs="0"/>
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
    "getTaxHistoryRequest"
})
@XmlRootElement(name = "GetTaxHistory")
public class GetTaxHistory {

    @XmlElement(name = "GetTaxHistoryRequest")
    protected GetTaxHistoryRequest getTaxHistoryRequest;

    /**
     * Gets the value of the getTaxHistoryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetTaxHistoryRequest }
     *     
     */
    public GetTaxHistoryRequest getGetTaxHistoryRequest() {
        return getTaxHistoryRequest;
    }

    /**
     * Sets the value of the getTaxHistoryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTaxHistoryRequest }
     *     
     */
    public void setGetTaxHistoryRequest(GetTaxHistoryRequest value) {
        this.getTaxHistoryRequest = value;
    }

}
