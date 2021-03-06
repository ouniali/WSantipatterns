
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
 *         &lt;element name="InsiderCIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsiderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsiderAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuerIdentifierType" type="{http://www.xignite.com/services/}IdentifierTypes"/>
 *         &lt;element name="IssuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "insiderCIK",
    "insiderName",
    "insiderAddress",
    "issuerIdentifier",
    "issuerIdentifierType",
    "issuerName"
})
@XmlRootElement(name = "GetRole")
public class GetRole {

    @XmlElement(name = "InsiderCIK")
    protected String insiderCIK;
    @XmlElement(name = "InsiderName")
    protected String insiderName;
    @XmlElement(name = "InsiderAddress")
    protected String insiderAddress;
    @XmlElement(name = "IssuerIdentifier")
    protected String issuerIdentifier;
    @XmlElement(name = "IssuerIdentifierType", required = true)
    @XmlSchemaType(name = "string")
    protected IdentifierTypes issuerIdentifierType;
    @XmlElement(name = "IssuerName")
    protected String issuerName;

    /**
     * Gets the value of the insiderCIK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsiderCIK() {
        return insiderCIK;
    }

    /**
     * Sets the value of the insiderCIK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsiderCIK(String value) {
        this.insiderCIK = value;
    }

    /**
     * Gets the value of the insiderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsiderName() {
        return insiderName;
    }

    /**
     * Sets the value of the insiderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsiderName(String value) {
        this.insiderName = value;
    }

    /**
     * Gets the value of the insiderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsiderAddress() {
        return insiderAddress;
    }

    /**
     * Sets the value of the insiderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsiderAddress(String value) {
        this.insiderAddress = value;
    }

    /**
     * Gets the value of the issuerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerIdentifier() {
        return issuerIdentifier;
    }

    /**
     * Sets the value of the issuerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerIdentifier(String value) {
        this.issuerIdentifier = value;
    }

    /**
     * Gets the value of the issuerIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierTypes }
     *     
     */
    public IdentifierTypes getIssuerIdentifierType() {
        return issuerIdentifierType;
    }

    /**
     * Sets the value of the issuerIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierTypes }
     *     
     */
    public void setIssuerIdentifierType(IdentifierTypes value) {
        this.issuerIdentifierType = value;
    }

    /**
     * Gets the value of the issuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerName() {
        return issuerName;
    }

    /**
     * Sets the value of the issuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerName(String value) {
        this.issuerName = value;
    }

}
