
package com.serviceobjects;

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
 *         &lt;element name="GetTaxInfoResult" type="{http://www.serviceobjects.com/}TaxInfo" minOccurs="0"/>
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
    "getTaxInfoResult"
})
@XmlRootElement(name = "GetTaxInfoResponse")
public class GetTaxInfoResponse {

    @XmlElement(name = "GetTaxInfoResult")
    protected TaxInfo getTaxInfoResult;

    /**
     * Gets the value of the getTaxInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link TaxInfo }
     *     
     */
    public TaxInfo getGetTaxInfoResult() {
        return getTaxInfoResult;
    }

    /**
     * Sets the value of the getTaxInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxInfo }
     *     
     */
    public void setGetTaxInfoResult(TaxInfo value) {
        this.getTaxInfoResult = value;
    }

}
