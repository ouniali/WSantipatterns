
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
 *         &lt;element name="sOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MachineID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sOrganisation",
    "sTown",
    "accountName",
    "licenceID",
    "machineID"
})
@XmlRootElement(name = "SearchPremise_ByOrganisation_Dataset")
public class SearchPremiseByOrganisationDataset {

    protected String sOrganisation;
    protected String sTown;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "LicenceID")
    protected String licenceID;
    @XmlElement(name = "MachineID")
    protected String machineID;

    /**
     * Gets the value of the sOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSOrganisation() {
        return sOrganisation;
    }

    /**
     * Sets the value of the sOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSOrganisation(String value) {
        this.sOrganisation = value;
    }

    /**
     * Gets the value of the sTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTown() {
        return sTown;
    }

    /**
     * Sets the value of the sTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTown(String value) {
        this.sTown = value;
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

}
