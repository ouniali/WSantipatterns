
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
 *         &lt;element name="sPostcodeDatum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sPostcodeList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sPostcodeDescriptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sNumberToReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sGoogleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MachineID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sRadius" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sPostcodeDatum",
    "sPostcodeList",
    "sPostcodeDescriptions",
    "sNumberToReturn",
    "sGoogleKey",
    "accountName",
    "licenceID",
    "machineID",
    "sRadius",
    "sType"
})
@XmlRootElement(name = "NearestData_ForPostcodeWithinAMaximumRadius")
public class NearestDataForPostcodeWithinAMaximumRadius {

    protected String sPostcodeDatum;
    protected String sPostcodeList;
    protected String sPostcodeDescriptions;
    protected String sNumberToReturn;
    protected String sGoogleKey;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "LicenceID")
    protected String licenceID;
    @XmlElement(name = "MachineID")
    protected String machineID;
    protected String sRadius;
    protected String sType;

    /**
     * Gets the value of the sPostcodeDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPostcodeDatum() {
        return sPostcodeDatum;
    }

    /**
     * Sets the value of the sPostcodeDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPostcodeDatum(String value) {
        this.sPostcodeDatum = value;
    }

    /**
     * Gets the value of the sPostcodeList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPostcodeList() {
        return sPostcodeList;
    }

    /**
     * Sets the value of the sPostcodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPostcodeList(String value) {
        this.sPostcodeList = value;
    }

    /**
     * Gets the value of the sPostcodeDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPostcodeDescriptions() {
        return sPostcodeDescriptions;
    }

    /**
     * Sets the value of the sPostcodeDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPostcodeDescriptions(String value) {
        this.sPostcodeDescriptions = value;
    }

    /**
     * Gets the value of the sNumberToReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNumberToReturn() {
        return sNumberToReturn;
    }

    /**
     * Sets the value of the sNumberToReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNumberToReturn(String value) {
        this.sNumberToReturn = value;
    }

    /**
     * Gets the value of the sGoogleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSGoogleKey() {
        return sGoogleKey;
    }

    /**
     * Sets the value of the sGoogleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSGoogleKey(String value) {
        this.sGoogleKey = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the licenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenceID() {
        return licenceID;
    }

    /**
     * Sets the value of the licenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenceID(String value) {
        this.licenceID = value;
    }

    /**
     * Gets the value of the machineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachineID() {
        return machineID;
    }

    /**
     * Sets the value of the machineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachineID(String value) {
        this.machineID = value;
    }

    /**
     * Gets the value of the sRadius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRadius() {
        return sRadius;
    }

    /**
     * Sets the value of the sRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRadius(String value) {
        this.sRadius = value;
    }

    /**
     * Gets the value of the sType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSType() {
        return sType;
    }

    /**
     * Sets the value of the sType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSType(String value) {
        this.sType = value;
    }

}
