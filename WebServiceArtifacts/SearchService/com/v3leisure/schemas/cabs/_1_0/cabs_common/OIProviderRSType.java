
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OI_ProviderRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OI_ProviderRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="short_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="content_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="opted_in" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="is_blocked" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="product_count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="opted_in_effective" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="supplier_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="integration_mode" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IntegrationModeEnumType" />
 *       &lt;attribute name="effective_last_opted_out" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="effective_last_opted_in" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="obx_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="supplier_obx_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="supplier_short_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OI_ProviderRSType")
public class OIProviderRSType {

    @XmlAttribute(name = "short_name")
    protected String shortName;
    @XmlAttribute(name = "content_id")
    protected String contentId;
    @XmlAttribute(name = "opted_in", required = true)
    protected boolean optedIn;
    @XmlAttribute(name = "is_blocked", required = true)
    protected boolean isBlocked;
    @XmlAttribute(name = "product_count", required = true)
    protected int productCount;
    @XmlAttribute(name = "opted_in_effective", required = true)
    protected boolean optedInEffective;
    @XmlAttribute(name = "supplier_id")
    protected String supplierId;
    @XmlAttribute(name = "integration_mode", required = true)
    protected COIntegrationModeEnumType integrationMode;
    @XmlAttribute(name = "effective_last_opted_out")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveLastOptedOut;
    @XmlAttribute(name = "effective_last_opted_in")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveLastOptedIn;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "obx_id")
    protected String obxId;
    @XmlAttribute(name = "supplier_obx_id")
    protected String supplierObxId;
    @XmlAttribute(name = "supplier_short_name")
    protected String supplierShortName;

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
     * Gets the value of the optedIn property.
     * 
     */
    public boolean isOptedIn() {
        return optedIn;
    }

    /**
     * Sets the value of the optedIn property.
     * 
     */
    public void setOptedIn(boolean value) {
        this.optedIn = value;
    }

    /**
     * Gets the value of the isBlocked property.
     * 
     */
    public boolean isIsBlocked() {
        return isBlocked;
    }

    /**
     * Sets the value of the isBlocked property.
     * 
     */
    public void setIsBlocked(boolean value) {
        this.isBlocked = value;
    }

    /**
     * Gets the value of the productCount property.
     * 
     */
    public int getProductCount() {
        return productCount;
    }

    /**
     * Sets the value of the productCount property.
     * 
     */
    public void setProductCount(int value) {
        this.productCount = value;
    }

    /**
     * Gets the value of the optedInEffective property.
     * 
     */
    public boolean isOptedInEffective() {
        return optedInEffective;
    }

    /**
     * Sets the value of the optedInEffective property.
     * 
     */
    public void setOptedInEffective(boolean value) {
        this.optedInEffective = value;
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

    /**
     * Gets the value of the integrationMode property.
     * 
     * @return
     *     possible object is
     *     {@link COIntegrationModeEnumType }
     *     
     */
    public COIntegrationModeEnumType getIntegrationMode() {
        return integrationMode;
    }

    /**
     * Sets the value of the integrationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link COIntegrationModeEnumType }
     *     
     */
    public void setIntegrationMode(COIntegrationModeEnumType value) {
        this.integrationMode = value;
    }

    /**
     * Gets the value of the effectiveLastOptedOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveLastOptedOut() {
        return effectiveLastOptedOut;
    }

    /**
     * Sets the value of the effectiveLastOptedOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveLastOptedOut(XMLGregorianCalendar value) {
        this.effectiveLastOptedOut = value;
    }

    /**
     * Gets the value of the effectiveLastOptedIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveLastOptedIn() {
        return effectiveLastOptedIn;
    }

    /**
     * Sets the value of the effectiveLastOptedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveLastOptedIn(XMLGregorianCalendar value) {
        this.effectiveLastOptedIn = value;
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

}
