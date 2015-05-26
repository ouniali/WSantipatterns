
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}typePaymentCard">
 *       &lt;attribute name="ExtendedPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AcceptanceOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ThirdPartyPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "CreditCard")
public class CreditCard
    extends TypePaymentCard
{

    @XmlAttribute(name = "ExtendedPayment")
    protected String extendedPayment;
    @XmlAttribute(name = "CustomerReference")
    protected String customerReference;
    @XmlAttribute(name = "AcceptanceOverride")
    protected Boolean acceptanceOverride;
    @XmlAttribute(name = "ThirdPartyPayment")
    protected Boolean thirdPartyPayment;

    /**
     * Gets the value of the extendedPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedPayment() {
        return extendedPayment;
    }

    /**
     * Sets the value of the extendedPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedPayment(String value) {
        this.extendedPayment = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the acceptanceOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptanceOverride() {
        return acceptanceOverride;
    }

    /**
     * Sets the value of the acceptanceOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptanceOverride(Boolean value) {
        this.acceptanceOverride = value;
    }

    /**
     * Gets the value of the thirdPartyPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isThirdPartyPayment() {
        if (thirdPartyPayment == null) {
            return false;
        } else {
            return thirdPartyPayment;
        }
    }

    /**
     * Sets the value of the thirdPartyPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setThirdPartyPayment(Boolean value) {
        this.thirdPartyPayment = value;
    }

}
