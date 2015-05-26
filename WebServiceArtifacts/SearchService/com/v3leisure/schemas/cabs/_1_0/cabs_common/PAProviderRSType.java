
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PA_ProviderRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PA_ProviderRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductGroups" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfPA_ProductGroupRSType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="short_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="content_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="obx_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="supplier_obx_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="supplier_short_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="supplier_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PA_ProviderRSType", propOrder = {
    "productGroups"
})
public class PAProviderRSType {

    @XmlElement(name = "ProductGroups")
    protected ArrayOfPAProductGroupRSType productGroups;
    @XmlAttribute(name = "short_name")
    protected String shortName;
    @XmlAttribute(name = "content_id")
    protected String contentId;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "obx_id")
    protected String obxId;
    @XmlAttribute(name = "supplier_obx_id")
    protected String supplierObxId;
    @XmlAttribute(name = "supplier_short_name")
    protected String supplierShortName;
    @XmlAttribute(name = "supplier_id")
    protected String supplierId;

    /**
     * Gets the value of the productGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPAProductGroupRSType }
     *     
     */
    public ArrayOfPAProductGroupRSType getProductGroups() {
        return productGroups;
    }

    /**
     * Sets the value of the productGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPAProductGroupRSType }
     *     
     */
    public void setProductGroups(ArrayOfPAProductGroupRSType value) {
        this.productGroups = value;
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

    /**
     * Gets the value of the supplierObxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierObxId() {
        return supplierObxId;
    }

    /**
     * Sets the value of the supplierObxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierObxId(String value) {
        this.supplierObxId = value;
    }

    /**
     * Gets the value of the supplierShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierShortName() {
        return supplierShortName;
    }

    /**
     * Sets the value of the supplierShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierShortName(String value) {
        this.supplierShortName = value;
    }

    /**
     * Gets the value of the supplierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierId(String value) {
        this.supplierId = value;
    }

}
