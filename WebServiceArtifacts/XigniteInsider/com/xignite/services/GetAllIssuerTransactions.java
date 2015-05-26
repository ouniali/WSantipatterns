
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="OnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionCode" type="{http://www.xignite.com/services/}TransactionCodes"/>
 *         &lt;element name="SecurityType" type="{http://www.xignite.com/services/}SecurityTypes"/>
 *         &lt;element name="OwnershipType" type="{http://www.xignite.com/services/}OwnershipTypes"/>
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
    "onDate",
    "transactionCode",
    "securityType",
    "ownershipType"
})
@XmlRootElement(name = "GetAllIssuerTransactions")
public class GetAllIssuerTransactions {

    @XmlElement(name = "OnDate")
    protected String onDate;
    @XmlElement(name = "TransactionCode", required = true)
    @XmlSchemaType(name = "string")
    protected TransactionCodes transactionCode;
    @XmlElement(name = "SecurityType", required = true)
    @XmlSchemaType(name = "string")
    protected SecurityTypes securityType;
    @XmlElement(name = "OwnershipType", required = true)
    @XmlSchemaType(name = "string")
    protected OwnershipTypes ownershipType;

    /**
     * Gets the value of the onDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnDate() {
        return onDate;
    }

    /**
     * Sets the value of the onDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnDate(String value) {
        this.onDate = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCodes }
     *     
     */
    public TransactionCodes getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCodes }
     *     
     */
    public void setTransactionCode(TransactionCodes value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the securityType property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityTypes }
     *     
     */
    public SecurityTypes getSecurityType() {
        return securityType;
    }

    /**
     * Sets the value of the securityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityTypes }
     *     
     */
    public void setSecurityType(SecurityTypes value) {
        this.securityType = value;
    }

    /**
     * Gets the value of the ownershipType property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipTypes }
     *     
     */
    public OwnershipTypes getOwnershipType() {
        return ownershipType;
    }

    /**
     * Sets the value of the ownershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipTypes }
     *     
     */
    public void setOwnershipType(OwnershipTypes value) {
        this.ownershipType = value;
    }

}
