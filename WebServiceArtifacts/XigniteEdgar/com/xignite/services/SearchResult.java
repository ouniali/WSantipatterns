
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xignite.com/services/}Common">
 *       &lt;sequence>
 *         &lt;element name="CIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SICCode" type="{http://www.xignite.com/services/}SICCode" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOfIncorporation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalYearEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailingAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Filings" type="{http://www.xignite.com/services/}ArrayOfFiling" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResult", propOrder = {
    "cik",
    "company",
    "sicCode",
    "state",
    "stateOfIncorporation",
    "fiscalYearEnd",
    "businessAddress",
    "mailingAddress",
    "filings"
})
public class SearchResult
    extends Common
{

    @XmlElement(name = "CIK")
    protected String cik;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "SICCode")
    protected SICCode sicCode;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "StateOfIncorporation")
    protected String stateOfIncorporation;
    @XmlElement(name = "FiscalYearEnd")
    protected String fiscalYearEnd;
    @XmlElement(name = "BusinessAddress")
    protected String businessAddress;
    @XmlElement(name = "MailingAddress")
    protected String mailingAddress;
    @XmlElement(name = "Filings")
    protected ArrayOfFiling filings;

    /**
     * Gets the value of the cik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIK() {
        return cik;
    }

    /**
     * Sets the value of the cik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIK(String value) {
        this.cik = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
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
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
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

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessAddress(String value) {
        this.businessAddress = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailingAddress(String value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the filings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFiling }
     *     
     */
    public ArrayOfFiling getFilings() {
        return filings;
    }

    /**
     * Sets the value of the filings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFiling }
     *     
     */
    public void setFilings(ArrayOfFiling value) {
        this.filings = value;
    }

}
