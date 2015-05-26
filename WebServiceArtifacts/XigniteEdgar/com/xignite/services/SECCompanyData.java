
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SECCompanyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SECCompanyData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompanyConformedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CentralIndexKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SICCode" type="{http://www.xignite.com/services/}SICCode" minOccurs="0"/>
 *         &lt;element name="IRSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalYearEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SECCompanyData", propOrder = {
    "companyConformedName",
    "centralIndexKey",
    "sicCode",
    "irsNumber",
    "stateOfIncorporation",
    "fiscalYearEnd"
})
public class SECCompanyData {

    @XmlElement(name = "CompanyConformedName")
    protected String companyConformedName;
    @XmlElement(name = "CentralIndexKey")
    protected String centralIndexKey;
    @XmlElement(name = "SICCode")
    protected SICCode sicCode;
    @XmlElement(name = "IRSNumber")
    protected String irsNumber;
    @XmlElement(name = "StateOfIncorporation")
    protected String stateOfIncorporation;
    @XmlElement(name = "FiscalYearEnd")
    protected String fiscalYearEnd;

    /**
     * Gets the value of the companyConformedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyConformedName() {
        return companyConformedName;
    }

    /**
     * Sets the value of the companyConformedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyConformedName(String value) {
        this.companyConformedName = value;
    }

    /**
     * Gets the value of the centralIndexKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentralIndexKey() {
        return centralIndexKey;
    }

    /**
     * Sets the value of the centralIndexKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralIndexKey(String value) {
        this.centralIndexKey = value;
    }

    /**
     * Gets the value of the sicCode property.
     * 
     * @return
     *     possible object is
     *     {@link SICCode }
     *     
     */
    public SICCode getSICCode() {
        return sicCode;
    }

    /**
     * Sets the value of the sicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SICCode }
     *     
     */
    public void setSICCode(SICCode value) {
        this.sicCode = value;
    }

    /**
     * Gets the value of the irsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIRSNumber() {
        return irsNumber;
    }

    /**
     * Sets the value of the irsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIRSNumber(String value) {
        this.irsNumber = value;
    }

    /**
     * Gets the value of the stateOfIncorporation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOfIncorporation() {
        return stateOfIncorporation;
    }

    /**
     * Sets the value of the stateOfIncorporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOfIncorporation(String value) {
        this.stateOfIncorporation = value;
    }

    /**
     * Gets the value of the fiscalYearEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiscalYearEnd() {
        return fiscalYearEnd;
    }

    /**
     * Sets the value of the fiscalYearEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiscalYearEnd(String value) {
        this.fiscalYearEnd = value;
    }

}
