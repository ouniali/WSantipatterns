
package com.epostcode.ws.uk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sLocality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sTownOrCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sLicenseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sPostcode",
    "sCompany",
    "sStreet",
    "sLocality",
    "sTownOrCity",
    "sNumber",
    "sAccountName",
    "sguid",
    "sOperator",
    "sLicenseID"
})
@XmlRootElement(name = "SearchMultiByMultiKeywords")
public class SearchMultiByMultiKeywords {

    protected String sPostcode;
    protected String sCompany;
    protected String sStreet;
    protected String sLocality;
    protected String sTownOrCity;
    protected String sNumber;
    protected String sAccountName;
    @XmlElement(name = "sGUID")
    protected String sguid;
    protected String sOperator;
    protected String sLicenseID;

    /**
     * Gets the value of the sPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPostcode() {
        return sPostcode;
    }

    /**
     * Sets the value of the sPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPostcode(String value) {
        this.sPostcode = value;
    }

    /**
     * Gets the value of the sCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCompany() {
        return sCompany;
    }

    /**
     * Sets the value of the sCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCompany(String value) {
        this.sCompany = value;
    }

    /**
     * Gets the value of the sStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSStreet() {
        return sStreet;
    }

    /**
     * Sets the value of the sStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSStreet(String value) {
        this.sStreet = value;
    }

    /**
     * Gets the value of the sLocality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLocality() {
        return sLocality;
    }

    /**
     * Sets the value of the sLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLocality(String value) {
        this.sLocality = value;
    }

    /**
     * Gets the value of the sTownOrCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTownOrCity() {
        return sTownOrCity;
    }

    /**
     * Sets the value of the sTownOrCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTownOrCity(String value) {
        this.sTownOrCity = value;
    }

    /**
     * Gets the value of the sNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNumber() {
        return sNumber;
    }

    /**
     * Sets the value of the sNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNumber(String value) {
        this.sNumber = value;
    }

    /**
     * Gets the value of the sAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAccountName() {
        return sAccountName;
    }

    /**
     * Sets the value of the sAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAccountName(String value) {
        this.sAccountName = value;
    }

    /**
     * Gets the value of the sguid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGUID() {
        return sguid;
    }

    /**
     * Sets the value of the sguid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGUID(String value) {
        this.sguid = value;
    }

    /**
     * Gets the value of the sOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOperator() {
        return sOperator;
    }

    /**
     * Sets the value of the sOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOperator(String value) {
        this.sOperator = value;
    }

    /**
     * Gets the value of the sLicenseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLicenseID() {
        return sLicenseID;
    }

    /**
     * Sets the value of the sLicenseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLicenseID(String value) {
        this.sLicenseID = value;
    }

}
