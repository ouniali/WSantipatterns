
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="CountryCode" type="{http://www.travelport.com/schema/common_v15_0}typeCountry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxCategory" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AllTaxes" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TaxTerritory">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CompanyName">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="24"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "countryCode",
    "taxCategory"
})
@XmlRootElement(name = "ExemptTaxes")
public class ExemptTaxes {

    @XmlElement(name = "CountryCode")
    protected List<String> countryCode;
    @XmlElement(name = "TaxCategory")
    protected List<String> taxCategory;
    @XmlAttribute(name = "AllTaxes")
    protected Boolean allTaxes;
    @XmlAttribute(name = "TaxTerritory")
    protected String taxTerritory;
    @XmlAttribute(name = "CompanyName")
    protected String companyName;

    /**
     * Gets the value of the countryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountryCode() {
        if (countryCode == null) {
            countryCode = new ArrayList<String>();
        }
        return this.countryCode;
    }

    /**
     * Gets the value of the taxCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTaxCategory() {
        if (taxCategory == null) {
            taxCategory = new ArrayList<String>();
        }
        return this.taxCategory;
    }

    /**
     * Gets the value of the allTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllTaxes() {
        return allTaxes;
    }

    /**
     * Sets the value of the allTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllTaxes(Boolean value) {
        this.allTaxes = value;
    }

    /**
     * Gets the value of the taxTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTerritory() {
        return taxTerritory;
    }

    /**
     * Sets the value of the taxTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxTerritory(String value) {
        this.taxTerritory = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

}
