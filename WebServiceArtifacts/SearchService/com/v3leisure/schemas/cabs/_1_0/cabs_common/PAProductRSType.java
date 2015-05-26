
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PA_ProductRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PA_ProductRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Availability" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PA_AvailabilityDatesRSType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="offer_type" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_AvailReqType" />
 *       &lt;attribute name="maximum_capacity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="industry_category" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IndustryCategoryEnumType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PA_ProductRSType", propOrder = {
    "availability"
})
public class PAProductRSType {

    @XmlElement(name = "Availability")
    protected PAAvailabilityDatesRSType availability;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "offer_type", required = true)
    protected COAvailReqType offerType;
    @XmlAttribute(name = "maximum_capacity", required = true)
    protected int maximumCapacity;
    @XmlAttribute(name = "industry_category", required = true)
    protected COIndustryCategoryEnumType industryCategory;

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link PAAvailabilityDatesRSType }
     *     
     */
    public PAAvailabilityDatesRSType getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link PAAvailabilityDatesRSType }
     *     
     */
    public void setAvailability(PAAvailabilityDatesRSType value) {
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
     * Gets the value of the offerType property.
     * 
     * @return
     *     possible object is
     *     {@link COAvailReqType }
     *     
     */
    public COAvailReqType getOfferType() {
        return offerType;
    }

    /**
     * Sets the value of the offerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link COAvailReqType }
     *     
     */
    public void setOfferType(COAvailReqType value) {
        this.offerType = value;
    }

    /**
     * Gets the value of the maximumCapacity property.
     * 
     */
    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    /**
     * Sets the value of the maximumCapacity property.
     * 
     */
    public void setMaximumCapacity(int value) {
        this.maximumCapacity = value;
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
