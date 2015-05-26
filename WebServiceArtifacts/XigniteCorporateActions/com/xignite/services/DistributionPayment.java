
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionPayment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}AbstractPublicWebServiceObj">
 *       &lt;sequence>
 *         &lt;element name="IsDefaultDistribution" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Payment" type="{http://www.xignite.com/services/}Payment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionPayment", propOrder = {
    "isDefaultDistribution",
    "payment"
})
public class DistributionPayment
    extends AbstractPublicWebServiceObj
{

    @XmlElement(name = "IsDefaultDistribution")
    protected boolean isDefaultDistribution;
    @XmlElement(name = "Payment")
    protected Payment payment;

    /**
     * Gets the value of the isDefaultDistribution property.
     * 
     */
    public boolean isIsDefaultDistribution() {
        return isDefaultDistribution;
    }

    /**
     * Sets the value of the isDefaultDistribution property.
     * 
     */
    public void setIsDefaultDistribution(boolean value) {
        this.isDefaultDistribution = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

}
