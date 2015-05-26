
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PR_ProviderLongRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PR_ProviderLongRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PR_BusinessDetailsType" minOccurs="0"/>
 *         &lt;element name="ContactDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PR_ContactDetailsType" minOccurs="0"/>
 *         &lt;element name="MerchantDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PR_MerchantDetailsType" minOccurs="0"/>
 *         &lt;element name="MarketingDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PR_MarketingDetailsType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Images" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfCO_ImageType" minOccurs="0"/>
 *         &lt;element name="Products" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfPR_ProductType" minOccurs="0"/>
 *         &lt;element name="BookingDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PR_BookingInformationType" minOccurs="0"/>
 *         &lt;element name="OptInDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PR_OptInInformationType" minOccurs="0"/>
 *         &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegionGeocodeDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PR_RegionGeocodeDetailsType" minOccurs="0"/>
 *         &lt;element name="ECommerceDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}ArrayOfCO_TypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="short_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="content_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creation_date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="modification_date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_ProviderEnumType" />
 *       &lt;attribute name="status" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_StatusEnumType" />
 *       &lt;attribute name="supplier_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="integration_type" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_IntegrationModeEnumType" />
 *       &lt;attribute name="supplier_short_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allow_pickup_locations" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="is_test" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="full_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minimum_guide_price" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="maximum_guide_price" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="minimum_guide_price_aet" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="maximum_guide_price_aet" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="minimum_guide_price_accomm" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="maximum_guide_price_accomm" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="bookability" use="required" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}CO_BookabilityEnumType" />
 *       &lt;attribute name="supplier_obx_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="obx_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PR_ProviderLongRSType", propOrder = {
    "businessDetails",
    "contactDetails",
    "merchantDetails",
    "marketingDetails",
    "description",
    "images",
    "products",
    "bookingDetails",
    "optInDetails",
    "shortDescription",
    "regionGeocodeDetails",
    "eCommerceDetails"
})
public class PRProviderLongRSType {

    @XmlElement(name = "BusinessDetails")
    protected PRBusinessDetailsType businessDetails;
    @XmlElement(name = "ContactDetails")
    protected PRContactDetailsType contactDetails;
    @XmlElement(name = "MerchantDetails")
    protected PRMerchantDetailsType merchantDetails;
    @XmlElement(name = "MarketingDetails")
    protected PRMarketingDetailsType marketingDetails;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Images")
    protected ArrayOfCOImageType images;
    @XmlElement(name = "Products")
    protected ArrayOfPRProductType products;
    @XmlElement(name = "BookingDetails")
    protected PRBookingInformationType bookingDetails;
    @XmlElement(name = "OptInDetails")
    protected PROptInInformationType optInDetails;
    @XmlElement(name = "ShortDescription")
    protected String shortDescription;
    @XmlElement(name = "RegionGeocodeDetails")
    protected PRRegionGeocodeDetailsType regionGeocodeDetails;
    @XmlElement(name = "ECommerceDetails")
    protected ArrayOfCOTypeType eCommerceDetails;
    @XmlAttribute(name = "short_name")
    protected String shortName;
    @XmlAttribute(name = "content_id")
    protected String contentId;
    @XmlAttribute(name = "creation_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    @XmlAttribute(name = "modification_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar modificationDate;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "type", required = true)
    protected COProviderEnumType type;
    @XmlAttribute(name = "status", required = true)
    protected COStatusEnumType status;
    @XmlAttribute(name = "supplier_id")
    protected String supplierId;
    @XmlAttribute(name = "integration_type", required = true)
    protected COIntegrationModeEnumType integrationType;
    @XmlAttribute(name = "supplier_short_name")
    protected String supplierShortName;
    @XmlAttribute(name = "allow_pickup_locations", required = true)
    protected boolean allowPickupLocations;
    @XmlAttribute(name = "is_test")
    protected Boolean isTest;
    @XmlAttribute(name = "full_name")
    protected String fullName;
    @XmlAttribute(name = "minimum_guide_price", required = true)
    protected BigDecimal minimumGuidePrice;
    @XmlAttribute(name = "maximum_guide_price", required = true)
    protected BigDecimal maximumGuidePrice;
    @XmlAttribute(name = "minimum_guide_price_aet", required = true)
    protected BigDecimal minimumGuidePriceAet;
    @XmlAttribute(name = "maximum_guide_price_aet", required = true)
    protected BigDecimal maximumGuidePriceAet;
    @XmlAttribute(name = "minimum_guide_price_accomm", required = true)
    protected BigDecimal minimumGuidePriceAccomm;
    @XmlAttribute(name = "maximum_guide_price_accomm", required = true)
    protected BigDecimal maximumGuidePriceAccomm;
    @XmlAttribute(name = "bookability", required = true)
    protected COBookabilityEnumType bookability;
    @XmlAttribute(name = "supplier_obx_id")
    protected String supplierObxId;
    @XmlAttribute(name = "obx_id")
    protected String obxId;

    /**
     * Gets the value of the businessDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PRBusinessDetailsType }
     *     
     */
    public PRBusinessDetailsType getBusinessDetails() {
        return businessDetails;
    }

    /**
     * Sets the value of the businessDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRBusinessDetailsType }
     *     
     */
    public void setBusinessDetails(PRBusinessDetailsType value) {
        this.businessDetails = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PRContactDetailsType }
     *     
     */
    public PRContactDetailsType getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRContactDetailsType }
     *     
     */
    public void setContactDetails(PRContactDetailsType value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the merchantDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PRMerchantDetailsType }
     *     
     */
    public PRMerchantDetailsType getMerchantDetails() {
        return merchantDetails;
    }

    /**
     * Sets the value of the merchantDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRMerchantDetailsType }
     *     
     */
    public void setMerchantDetails(PRMerchantDetailsType value) {
        this.merchantDetails = value;
    }

    /**
     * Gets the value of the marketingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PRMarketingDetailsType }
     *     
     */
    public PRMarketingDetailsType getMarketingDetails() {
        return marketingDetails;
    }

    /**
     * Sets the value of the marketingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRMarketingDetailsType }
     *     
     */
    public void setMarketingDetails(PRMarketingDetailsType value) {
        this.marketingDetails = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCOImageType }
     *     
     */
    public ArrayOfCOImageType getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCOImageType }
     *     
     */
    public void setImages(ArrayOfCOImageType value) {
        this.images = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPRProductType }
     *     
     */
    public ArrayOfPRProductType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPRProductType }
     *     
     */
    public void setProducts(ArrayOfPRProductType value) {
        this.products = value;
    }

    /**
     * Gets the value of the bookingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PRBookingInformationType }
     *     
     */
    public PRBookingInformationType getBookingDetails() {
        return bookingDetails;
    }

    /**
     * Sets the value of the bookingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRBookingInformationType }
     *     
     */
    public void setBookingDetails(PRBookingInformationType value) {
        this.bookingDetails = value;
    }

    /**
     * Gets the value of the optInDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PROptInInformationType }
     *     
     */
    public PROptInInformationType getOptInDetails() {
        return optInDetails;
    }

    /**
     * Sets the value of the optInDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PROptInInformationType }
     *     
     */
    public void setOptInDetails(PROptInInformationType value) {
        this.optInDetails = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the regionGeocodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PRRegionGeocodeDetailsType }
     *     
     */
    public PRRegionGeocodeDetailsType getRegionGeocodeDetails() {
        return regionGeocodeDetails;
    }

    /**
     * Sets the value of the regionGeocodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRRegionGeocodeDetailsType }
     *     
     */
    public void setRegionGeocodeDetails(PRRegionGeocodeDetailsType value) {
        this.regionGeocodeDetails = value;
    }

    /**
     * Gets the value of the eCommerceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCOTypeType }
     *     
     */
    public ArrayOfCOTypeType getECommerceDetails() {
        return eCommerceDetails;
    }

    /**
     * Sets the value of the eCommerceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCOTypeType }
     *     
     */
    public void setECommerceDetails(ArrayOfCOTypeType value) {
        this.eCommerceDetails = value;
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
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the modificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the value of the modificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationDate(XMLGregorianCalendar value) {
        this.modificationDate = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link COProviderEnumType }
     *     
     */
    public COProviderEnumType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link COProviderEnumType }
     *     
     */
    public void setType(COProviderEnumType value) {
        this.type = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link COStatusEnumType }
     *     
     */
    public COStatusEnumType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link COStatusEnumType }
     *     
     */
    public void setStatus(COStatusEnumType value) {
        this.status = value;
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
     * Gets the value of the integrationType property.
     * 
     * @return
     *     possible object is
     *     {@link COIntegrationModeEnumType }
     *     
     */
    public COIntegrationModeEnumType getIntegrationType() {
        return integrationType;
    }

    /**
     * Sets the value of the integrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link COIntegrationModeEnumType }
     *     
     */
    public void setIntegrationType(COIntegrationModeEnumType value) {
        this.integrationType = value;
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
     * Gets the value of the allowPickupLocations property.
     * 
     */
    public boolean isAllowPickupLocations() {
        return allowPickupLocations;
    }

    /**
     * Sets the value of the allowPickupLocations property.
     * 
     */
    public void setAllowPickupLocations(boolean value) {
        this.allowPickupLocations = value;
    }

    /**
     * Gets the value of the isTest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTest() {
        return isTest;
    }

    /**
     * Sets the value of the isTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTest(Boolean value) {
        this.isTest = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the minimumGuidePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumGuidePrice() {
        return minimumGuidePrice;
    }

    /**
     * Sets the value of the minimumGuidePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumGuidePrice(BigDecimal value) {
        this.minimumGuidePrice = value;
    }

    /**
     * Gets the value of the maximumGuidePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumGuidePrice() {
        return maximumGuidePrice;
    }

    /**
     * Sets the value of the maximumGuidePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumGuidePrice(BigDecimal value) {
        this.maximumGuidePrice = value;
    }

    /**
     * Gets the value of the minimumGuidePriceAet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumGuidePriceAet() {
        return minimumGuidePriceAet;
    }

    /**
     * Sets the value of the minimumGuidePriceAet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumGuidePriceAet(BigDecimal value) {
        this.minimumGuidePriceAet = value;
    }

    /**
     * Gets the value of the maximumGuidePriceAet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumGuidePriceAet() {
        return maximumGuidePriceAet;
    }

    /**
     * Sets the value of the maximumGuidePriceAet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumGuidePriceAet(BigDecimal value) {
        this.maximumGuidePriceAet = value;
    }

    /**
     * Gets the value of the minimumGuidePriceAccomm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumGuidePriceAccomm() {
        return minimumGuidePriceAccomm;
    }

    /**
     * Sets the value of the minimumGuidePriceAccomm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumGuidePriceAccomm(BigDecimal value) {
        this.minimumGuidePriceAccomm = value;
    }

    /**
     * Gets the value of the maximumGuidePriceAccomm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumGuidePriceAccomm() {
        return maximumGuidePriceAccomm;
    }

    /**
     * Sets the value of the maximumGuidePriceAccomm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumGuidePriceAccomm(BigDecimal value) {
        this.maximumGuidePriceAccomm = value;
    }

    /**
     * Gets the value of the bookability property.
     * 
     * @return
     *     possible object is
     *     {@link COBookabilityEnumType }
     *     
     */
    public COBookabilityEnumType getBookability() {
        return bookability;
    }

    /**
     * Sets the value of the bookability property.
     * 
     * @param value
     *     allowed object is
     *     {@link COBookabilityEnumType }
     *     
     */
    public void setBookability(COBookabilityEnumType value) {
        this.bookability = value;
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
