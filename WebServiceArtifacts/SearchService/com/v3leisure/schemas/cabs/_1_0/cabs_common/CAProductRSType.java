
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CA_ProductRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CA_ProductRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Availability" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfCA_AvailabilityDateRSType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="industry_category" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IndustryCategoryEnumType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CA_ProductRSType", propOrder = {
    "availability"
})
public class CAProductRSType {

    @XmlElement(name = "Availability")
    protected ArrayOfCAAvailabilityDateRSType availability;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "industry_category", required = true)
    protected COIndustryCategoryEnumType industryCategory;

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCAAvailabilityDateRSType }
     *     
     */
    public ArrayOfCAAvailabilityDateRSType getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCAAvailabilityDateRSType }
     *     
     */
    public void setAvailability(ArrayOfCAAvailabilityDateRSType value) {
        this.availability = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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

}
