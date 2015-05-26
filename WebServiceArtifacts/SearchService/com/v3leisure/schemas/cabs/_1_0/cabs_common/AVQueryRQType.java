
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AV_QueryRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AV_QueryRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndustryCategory" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IndustryCategoryEnumType"/>
 *         &lt;element name="IndustryCategoryGroup" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IndustryCategoryGroupEnumType" form="unqualified"/>
 *         &lt;element name="SearchCriteria" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}SC_AvailabilityRQType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AV_QueryRQType", propOrder = {
    "industryCategory",
    "industryCategoryGroup",
    "searchCriteria"
})
public class AVQueryRQType {

    @XmlElement(name = "IndustryCategory", required = true)
    @XmlSchemaType(name = "string")
    protected COIndustryCategoryEnumType industryCategory;
    @XmlElement(name = "IndustryCategoryGroup", namespace = "", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected COIndustryCategoryGroupEnumType industryCategoryGroup;
    @XmlElement(name = "SearchCriteria")
    protected SCAvailabilityRQType searchCriteria;

    /**
     * Gets the value of the industryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link COIndustryCategoryEnumType }
     *     
     */
    public COIndustryCategoryEnumType getIndustryCategory() {
        return industryCategory;
    }

    /**
     * Sets the value of the industryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link COIndustryCategoryEnumType }
     *     
     */
    public void setIndustryCategory(COIndustryCategoryEnumType value) {
        this.industryCategory = value;
    }

    /**
     * Gets the value of the industryCategoryGroup property.
     * 
     * @return
     *     possible object is
     *     {@link COIndustryCategoryGroupEnumType }
     *     
     */
    public COIndustryCategoryGroupEnumType getIndustryCategoryGroup() {
        return industryCategoryGroup;
    }

    /**
     * Sets the value of the industryCategoryGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link COIndustryCategoryGroupEnumType }
     *     
     */
    public void setIndustryCategoryGroup(COIndustryCategoryGroupEnumType value) {
        this.industryCategoryGroup = value;
    }

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SCAvailabilityRQType }
     *     
     */
    public SCAvailabilityRQType getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCAvailabilityRQType }
     *     
     */
    public void setSearchCriteria(SCAvailabilityRQType value) {
        this.searchCriteria = value;
    }

}
