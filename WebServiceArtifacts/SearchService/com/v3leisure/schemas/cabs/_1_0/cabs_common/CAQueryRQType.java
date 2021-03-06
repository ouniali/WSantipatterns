
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CA_QueryRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CA_QueryRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndustryCategory" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IndustryCategoryEnumType"/>
 *         &lt;element name="IndustryCategoryGroup" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IndustryCategoryGroupEnumType" form="unqualified"/>
 *         &lt;element name="Criteria" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CA_CriteriaRQType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cache" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_CacheEnumType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CA_QueryRQType", propOrder = {
    "industryCategory",
    "industryCategoryGroup",
    "criteria"
})
public class CAQueryRQType {

    @XmlElement(name = "IndustryCategory", required = true)
    @XmlSchemaType(name = "string")
    protected COIndustryCategoryEnumType industryCategory;
    @XmlElement(name = "IndustryCategoryGroup", namespace = "", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected COIndustryCategoryGroupEnumType industryCategoryGroup;
    @XmlElement(name = "Criteria")
    protected CACriteriaRQType criteria;
    @XmlAttribute(name = "cache")
    protected COCacheEnumType cache;

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
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link CACriteriaRQType }
     *     
     */
    public CACriteriaRQType getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACriteriaRQType }
     *     
     */
    public void setCriteria(CACriteriaRQType value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the cache property.
     * 
     * @return
     *     possible object is
     *     {@link COCacheEnumType }
     *     
     */
    public COCacheEnumType getCache() {
        return cache;
    }

    /**
     * Sets the value of the cache property.
     * 
     * @param value
     *     allowed object is
     *     {@link COCacheEnumType }
     *     
     */
    public void setCache(COCacheEnumType value) {
        this.cache = value;
    }

}
