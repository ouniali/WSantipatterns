
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SECFilingValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SECFilingValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SECFileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilmNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SECAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SECFilingValues", propOrder = {
    "formType",
    "secFileNumber",
    "filmNumber",
    "secAct"
})
public class SECFilingValues {

    @XmlElement(name = "FormType")
    protected String formType;
    @XmlElement(name = "SECFileNumber")
    protected String secFileNumber;
    @XmlElement(name = "FilmNumber")
    protected String filmNumber;
    @XmlElement(name = "SECAct")
    protected String secAct;

    /**
     * Gets the value of the formType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormType() {
        return formType;
    }

    /**
     * Sets the value of the formType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormType(String value) {
        this.formType = value;
    }

    /**
     * Gets the value of the secFileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECFileNumber() {
        return secFileNumber;
    }

    /**
     * Sets the value of the secFileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECFileNumber(String value) {
        this.secFileNumber = value;
    }

    /**
     * Gets the value of the filmNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilmNumber() {
        return filmNumber;
    }

    /**
     * Sets the value of the filmNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilmNumber(String value) {
        this.filmNumber = value;
    }

    /**
     * Gets the value of the secAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECAct() {
        return secAct;
    }

    /**
     * Sets the value of the secAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECAct(String value) {
        this.secAct = value;
    }

}
