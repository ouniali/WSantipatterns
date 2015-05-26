
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SECFiler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SECFiler">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyData" type="{http://www.xignite.com/services/}SECCompanyData" minOccurs="0"/>
 *         &lt;element name="FilingValues" type="{http://www.xignite.com/services/}SECFilingValues" minOccurs="0"/>
 *         &lt;element name="BusinessAddress" type="{http://www.xignite.com/services/}SECBusinessAddress" minOccurs="0"/>
 *         &lt;element name="MailAddress" type="{http://www.xignite.com/services/}SECBusinessAddress" minOccurs="0"/>
 *         &lt;element name="FormerCompanyNames" type="{http://www.xignite.com/services/}ArrayOfSECFormerCompanyName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SECFiler", propOrder = {
    "companyData",
    "filingValues",
    "businessAddress",
    "mailAddress",
    "formerCompanyNames"
})
public class SECFiler {

    @XmlElement(name = "CompanyData")
    protected SECCompanyData companyData;
    @XmlElement(name = "FilingValues")
    protected SECFilingValues filingValues;
    @XmlElement(name = "BusinessAddress")
    protected SECBusinessAddress businessAddress;
    @XmlElement(name = "MailAddress")
    protected SECBusinessAddress mailAddress;
    @XmlElement(name = "FormerCompanyNames")
    protected ArrayOfSECFormerCompanyName formerCompanyNames;

    /**
     * Gets the value of the companyData property.
     * 
     * @return
     *     possible object is
     *     {@link SECCompanyData }
     *     
     */
    public SECCompanyData getCompanyData() {
        return companyData;
    }

    /**
     * Sets the value of the companyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECCompanyData }
     *     
     */
    public void setCompanyData(SECCompanyData value) {
        this.companyData = value;
    }

    /**
     * Gets the value of the filingValues property.
     * 
     * @return
     *     possible object is
     *     {@link SECFilingValues }
     *     
     */
    public SECFilingValues getFilingValues() {
        return filingValues;
    }

    /**
     * Sets the value of the filingValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECFilingValues }
     *     
     */
    public void setFilingValues(SECFilingValues value) {
        this.filingValues = value;
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SECBusinessAddress }
     *     
     */
    public SECBusinessAddress getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECBusinessAddress }
     *     
     */
    public void setBusinessAddress(SECBusinessAddress value) {
        this.businessAddress = value;
    }

    /**
     * Gets the value of the mailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SECBusinessAddress }
     *     
     */
    public SECBusinessAddress getMailAddress() {
        return mailAddress;
    }

    /**
     * Sets the value of the mailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SECBusinessAddress }
     *     
     */
    public void setMailAddress(SECBusinessAddress value) {
        this.mailAddress = value;
    }

    /**
     * Gets the value of the formerCompanyNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSECFormerCompanyName }
     *     
     */
    public ArrayOfSECFormerCompanyName getFormerCompanyNames() {
        return formerCompanyNames;
    }

    /**
     * Sets the value of the formerCompanyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSECFormerCompanyName }
     *     
     */
    public void setFormerCompanyNames(ArrayOfSECFormerCompanyName value) {
        this.formerCompanyNames = value;
    }

}
