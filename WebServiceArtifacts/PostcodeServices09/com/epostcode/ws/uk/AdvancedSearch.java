
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
 *         &lt;element name="sSearchExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sSearchExpression",
    "sAccountName",
    "sguid",
    "sipAddress",
    "sLicenseID"
})
@XmlRootElement(name = "AdvancedSearch")
public class AdvancedSearch {

    protected String sSearchExpression;
    protected String sAccountName;
    @XmlElement(name = "sGUID")
    protected String sguid;
    @XmlElement(name = "sIPAddress")
    protected String sipAddress;
    protected String sLicenseID;

    /**
     * Gets the value of the sSearchExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSearchExpression() {
        return sSearchExpression;
    }

    /**
     * Sets the value of the sSearchExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSearchExpression(String value) {
        this.sSearchExpression = value;
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
     * Gets the value of the sipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPAddress() {
        return sipAddress;
    }

    /**
     * Sets the value of the sipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPAddress(String value) {
        this.sipAddress = value;
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
