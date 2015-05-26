
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
 *         &lt;element name="IssuerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuerIdentifierType" type="{http://www.xignite.com/services/}IdentifierTypes"/>
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
    "issuerIdentifier",
    "issuerIdentifierType"
})
@XmlRootElement(name = "GetIssuerOwnerships")
public class GetIssuerOwnerships {

    @XmlElement(name = "IssuerIdentifier")
    protected String issuerIdentifier;
    @XmlElement(name = "IssuerIdentifierType", required = true)
    @XmlSchemaType(name = "string")
    protected IdentifierTypes issuerIdentifierType;

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

}
