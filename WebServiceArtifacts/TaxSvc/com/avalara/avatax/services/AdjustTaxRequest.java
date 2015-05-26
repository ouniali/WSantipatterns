
package com.avalara.avatax.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustTaxRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustTaxRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustmentReason" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdjustmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GetTaxRequest" type="{http://avatax.avalara.com/services}GetTaxRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustTaxRequest", propOrder = {
    "adjustmentReason",
    "adjustmentDescription",
    "getTaxRequest"
})
public class AdjustTaxRequest {

    @XmlElement(name = "AdjustmentReason")
    protected int adjustmentReason;
    @XmlElement(name = "AdjustmentDescription")
    protected String adjustmentDescription;
    @XmlElement(name = "GetTaxRequest")
    protected GetTaxRequest getTaxRequest;

    /**
     * Gets the value of the adjustmentReason property.
     * 
     */
    public int getAdjustmentReason() {
        return adjustmentReason;
    }

    /**
     * Sets the value of the adjustmentReason property.
     * 
     */
    public void setAdjustmentReason(int value) {
        this.adjustmentReason = value;
    }

    /**
     * Gets the value of the adjustmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentDescription() {
        return adjustmentDescription;
    }

    /**
     * Sets the value of the adjustmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentDescription(String value) {
        this.adjustmentDescription = value;
    }

    /**
     * Gets the value of the getTaxRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetTaxRequest }
     *     
     */
    public GetTaxRequest getGetTaxRequest() {
        return getTaxRequest;
    }

    /**
     * Sets the value of the getTaxRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTaxRequest }
     *     
     */
    public void setGetTaxRequest(GetTaxRequest value) {
        this.getTaxRequest = value;
    }

}
