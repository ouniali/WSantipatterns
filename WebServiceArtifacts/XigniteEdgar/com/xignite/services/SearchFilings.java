
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
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentifierType" type="{http://www.xignite.com/services/}IdentifierTypes"/>
 *         &lt;element name="Form" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnershipForms" type="{http://www.xignite.com/services/}OwnershipFormTypes"/>
 *         &lt;element name="PriorToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutputType" type="{http://www.xignite.com/services/}OutputTypes"/>
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
    "identifier",
    "identifierType",
    "form",
    "ownershipForms",
    "priorToDate",
    "outputType"
})
@XmlRootElement(name = "SearchFilings")
public class SearchFilings {

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "IdentifierType", required = true)
    @XmlSchemaType(name = "string")
    protected IdentifierTypes identifierType;
    @XmlElement(name = "Form")
    protected String form;
    @XmlElement(name = "OwnershipForms", required = true)
    @XmlSchemaType(name = "string")
    protected OwnershipFormTypes ownershipForms;
    @XmlElement(name = "PriorToDate")
    protected String priorToDate;
    @XmlElement(name = "OutputType", required = true)
    @XmlSchemaType(name = "string")
    protected OutputTypes outputType;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the identifierType property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierTypes }
     *     
     */
    public IdentifierTypes getIdentifierType() {
        return identifierType;
    }

    /**
     * Sets the value of the identifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierTypes }
     *     
     */
    public void setIdentifierType(IdentifierTypes value) {
        this.identifierType = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForm(String value) {
        this.form = value;
    }

    /**
     * Gets the value of the ownershipForms property.
     * 
     * @return
     *     possible object is
     *     {@link OwnershipFormTypes }
     *     
     */
    public OwnershipFormTypes getOwnershipForms() {
        return ownershipForms;
    }

    /**
     * Sets the value of the ownershipForms property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnershipFormTypes }
     *     
     */
    public void setOwnershipForms(OwnershipFormTypes value) {
        this.ownershipForms = value;
    }

    /**
     * Gets the value of the priorToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorToDate() {
        return priorToDate;
    }

    /**
     * Sets the value of the priorToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorToDate(String value) {
        this.priorToDate = value;
    }

    /**
     * Gets the value of the outputType property.
     * 
     * @return
     *     possible object is
     *     {@link OutputTypes }
     *     
     */
    public OutputTypes getOutputType() {
        return outputType;
    }

    /**
     * Sets the value of the outputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputTypes }
     *     
     */
    public void setOutputType(OutputTypes value) {
        this.outputType = value;
    }

}
