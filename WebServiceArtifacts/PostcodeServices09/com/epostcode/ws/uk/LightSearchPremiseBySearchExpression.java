
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
 *         &lt;element name="sField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "sField",
    "sValue",
    "sAccountName",
    "sguid",
    "sLicenseID"
})
@XmlRootElement(name = "LightSearchPremise_BySearchExpression")
public class LightSearchPremiseBySearchExpression {

    protected String sField;
    protected String sValue;
    protected String sAccountName;
    @XmlElement(name = "sGUID")
    protected String sguid;
    protected String sLicenseID;

    /**
     * Gets the value of the sField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSField() {
        return sField;
    }

    /**
     * Sets the value of the sField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSField(String value) {
        this.sField = value;
    }

    /**
     * Gets the value of the sValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSValue() {
        return sValue;
    }

    /**
     * Sets the value of the sValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSValue(String value) {
        this.sValue = value;
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
