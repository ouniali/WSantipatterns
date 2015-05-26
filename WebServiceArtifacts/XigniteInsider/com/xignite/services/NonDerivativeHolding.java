
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nonDerivativeHolding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nonDerivativeHolding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="securityTitle" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="postTransactionAmounts" type="{http://www.xignite.com/services/}postTransactionAmounts" minOccurs="0"/>
 *         &lt;element name="ownershipNature" type="{http://www.xignite.com/services/}ownershipNature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nonDerivativeHolding", propOrder = {
    "securityTitle",
    "postTransactionAmounts",
    "ownershipNature"
})
public class NonDerivativeHolding {

    protected Value securityTitle;
    protected PostTransactionAmounts postTransactionAmounts;
    protected OwnershipNature ownershipNature;

    /**
     * Gets the value of the securityTitle property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getSecurityTitle() {
        return securityTitle;
    }

    /**
     * Sets the value of the securityTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setSecurityTitle(Value value) {
        this.securityTitle = value;
    }

    /**
     * Gets the value of the postTransactionAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link PostTransactionAmounts }
     *     
     */
    public PostTransactionAmounts getPostTransactionAmounts() {
        return postTransactionAmounts;
    }

    /**
     * Sets the value of the postTransactionAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostTransactionAmounts }
     *     
     */
    public void setPostTransactionAmounts(PostTransactionAmounts value) {
        this.postTransactionAmounts = value;
    }

    /**
     * Gets the value of the ownershipNature property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipNature }
     *     
     */
    public OwnershipNature getOwnershipNature() {
        return ownershipNature;
    }

    /**
     * Sets the value of the ownershipNature property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipNature }
     *     
     */
    public void setOwnershipNature(OwnershipNature value) {
        this.ownershipNature = value;
    }

}
