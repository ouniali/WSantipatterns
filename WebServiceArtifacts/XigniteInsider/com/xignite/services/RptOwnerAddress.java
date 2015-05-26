
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rptOwnerAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rptOwnerAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rptOwnerStreet1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rptOwnerStreet2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rptOwnerCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rptOwnerState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rptOwnerZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rptOwnerStateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rptOwnerAddress", propOrder = {
    "rptOwnerStreet1",
    "rptOwnerStreet2",
    "rptOwnerCity",
    "rptOwnerState",
    "rptOwnerZipCode",
    "rptOwnerStateDescription"
})
public class RptOwnerAddress {

    protected String rptOwnerStreet1;
    protected String rptOwnerStreet2;
    protected String rptOwnerCity;
    protected String rptOwnerState;
    protected String rptOwnerZipCode;
    protected String rptOwnerStateDescription;

    /**
     * Gets the value of the rptOwnerStreet1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptOwnerStreet1() {
        return rptOwnerStreet1;
    }

    /**
     * Sets the value of the rptOwnerStreet1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptOwnerStreet1(String value) {
        this.rptOwnerStreet1 = value;
    }

    /**
     * Gets the value of the rptOwnerStreet2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptOwnerStreet2() {
        return rptOwnerStreet2;
    }

    /**
     * Sets the value of the rptOwnerStreet2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptOwnerStreet2(String value) {
        this.rptOwnerStreet2 = value;
    }

    /**
     * Gets the value of the rptOwnerCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptOwnerCity() {
        return rptOwnerCity;
    }

    /**
     * Sets the value of the rptOwnerCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptOwnerCity(String value) {
        this.rptOwnerCity = value;
    }

    /**
     * Gets the value of the rptOwnerState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptOwnerState() {
        return rptOwnerState;
    }

    /**
     * Sets the value of the rptOwnerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptOwnerState(String value) {
        this.rptOwnerState = value;
    }

    /**
     * Gets the value of the rptOwnerZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptOwnerZipCode() {
        return rptOwnerZipCode;
    }

    /**
     * Sets the value of the rptOwnerZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptOwnerZipCode(String value) {
        this.rptOwnerZipCode = value;
    }

    /**
     * Gets the value of the rptOwnerStateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptOwnerStateDescription() {
        return rptOwnerStateDescription;
    }

    /**
     * Sets the value of the rptOwnerStateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptOwnerStateDescription(String value) {
        this.rptOwnerStateDescription = value;
    }

}
