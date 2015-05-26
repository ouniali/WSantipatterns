
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CA_ProviderRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CA_ProviderRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Availability" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfCA_AvailabilityDateRSType" minOccurs="0"/>
 *         &lt;element name="Products" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfCA_ProductRSType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="short_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="content_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="obx_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CA_ProviderRSType", propOrder = {
    "availability",
    "products"
})
public class CAProviderRSType {

    @XmlElement(name = "Availability")
    protected ArrayOfCAAvailabilityDateRSType availability;
    @XmlElement(name = "Products")
    protected ArrayOfCAProductRSType products;
    @XmlAttribute(name = "short_name")
    protected String shortName;
    @XmlAttribute(name = "content_id")
    protected String contentId;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "obx_id")
    protected String obxId;

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
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCAProductRSType }
     *     
     */
    public ArrayOfCAProductRSType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCAProductRSType }
     *     
     */
    public void setProducts(ArrayOfCAProductRSType value) {
        this.products = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the contentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentId() {
        return contentId;
    }

    /**
     * Sets the value of the contentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentId(String value) {
        this.contentId = value;
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
     * Gets the value of the obxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObxId() {
        return obxId;
    }

    /**
     * Sets the value of the obxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObxId(String value) {
        this.obxId = value;
    }

}
