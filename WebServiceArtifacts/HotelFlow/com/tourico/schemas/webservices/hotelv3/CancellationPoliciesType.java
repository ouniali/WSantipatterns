
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationPoliciesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancellationPoliciesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrigPolicy" type="{http://schemas.tourico.com/webservices/hotelv3}PolicyType" minOccurs="0"/>
 *         &lt;element name="NewPolicy" type="{http://schemas.tourico.com/webservices/hotelv3}PolicyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationPoliciesType", propOrder = {
    "origPolicy",
    "newPolicy"
})
public class CancellationPoliciesType {

    @XmlElement(name = "OrigPolicy")
    protected PolicyType origPolicy;
    @XmlElement(name = "NewPolicy")
    protected PolicyType newPolicy;

    /**
     * Gets the value of the origPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getOrigPolicy() {
        return origPolicy;
    }

    /**
     * Sets the value of the origPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setOrigPolicy(PolicyType value) {
        this.origPolicy = value;
    }

    /**
     * Gets the value of the newPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType }
     *     
     */
    public PolicyType getNewPolicy() {
        return newPolicy;
    }

    /**
     * Sets the value of the newPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType }
     *     
     */
    public void setNewPolicy(PolicyType value) {
        this.newPolicy = value;
    }

}
