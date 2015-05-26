
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
 *         &lt;element name="sAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iLicenseID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sMachineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sAccountName",
    "sguid",
    "iLicenseID",
    "sMachineName"
})
@XmlRootElement(name = "UnregisterLicense")
public class UnregisterLicense {

    protected String sAccountName;
    @XmlElement(name = "sGUID")
    protected String sguid;
    protected int iLicenseID;
    protected String sMachineName;

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
     * Gets the value of the iLicenseID property.
     * 
     */
    public int getILicenseID() {
        return iLicenseID;
    }

    /**
     * Sets the value of the iLicenseID property.
     * 
     */
    public void setILicenseID(int value) {
        this.iLicenseID = value;
    }

    /**
     * Gets the value of the sMachineName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMachineName() {
        return sMachineName;
    }

    /**
     * Sets the value of the sMachineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMachineName(String value) {
        this.sMachineName = value;
    }

}
