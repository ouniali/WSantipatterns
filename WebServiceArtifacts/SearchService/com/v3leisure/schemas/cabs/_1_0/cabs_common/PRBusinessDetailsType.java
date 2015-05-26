
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PR_BusinessDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PR_BusinessDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountHolder" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_PersonType" minOccurs="0"/>
 *         &lt;element name="PrivateEmail" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_EmailType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="acn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="abn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tax_exempt" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PR_BusinessDetailsType", propOrder = {
    "accountHolder",
    "privateEmail"
})
public class PRBusinessDetailsType {

    @XmlElement(name = "AccountHolder")
    protected COPersonType accountHolder;
    @XmlElement(name = "PrivateEmail")
    protected COEmailType privateEmail;
    @XmlAttribute(name = "acn")
    protected String acn;
    @XmlAttribute(name = "abn")
    protected String abn;
    @XmlAttribute(name = "tax_exempt")
    protected Boolean taxExempt;

    /**
     * Gets the value of the accountHolder property.
     * 
     * @return
     *     possible object is
     *     {@link COPersonType }
     *     
     */
    public COPersonType getAccountHolder() {
        return accountHolder;
    }

    /**
     * Sets the value of the accountHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link COPersonType }
     *     
     */
    public void setAccountHolder(COPersonType value) {
        this.accountHolder = value;
    }

    /**
     * Gets the value of the privateEmail property.
     * 
     * @return
     *     possible object is
     *     {@link COEmailType }
     *     
     */
    public COEmailType getPrivateEmail() {
        return privateEmail;
    }

    /**
     * Sets the value of the privateEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link COEmailType }
     *     
     */
    public void setPrivateEmail(COEmailType value) {
        this.privateEmail = value;
    }

    /**
     * Gets the value of the acn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcn() {
        return acn;
    }

    /**
     * Sets the value of the acn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcn(String value) {
        this.acn = value;
    }

    /**
     * Gets the value of the abn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbn() {
        return abn;
    }

    /**
     * Sets the value of the abn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbn(String value) {
        this.abn = value;
    }

    /**
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExempt(Boolean value) {
        this.taxExempt = value;
    }

}
