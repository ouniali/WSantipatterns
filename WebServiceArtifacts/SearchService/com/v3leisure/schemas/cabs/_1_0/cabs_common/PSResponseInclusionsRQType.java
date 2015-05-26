
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PS_ResponseInclusionsRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PS_ResponseInclusionsRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncludeContactDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeMarketingDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeDescription" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeImages" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeProducts" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeProductDescription" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeProductRates" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeProductImages" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeProductMarketingDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeOptInDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeBusinessDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeBookingDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeProductPickupLocations" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeShortDescription" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeRegionGeocodeDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeECommerceDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *         &lt;element name="IncludeMerchantDetails" type="{http://www.v3leisure.com/Schemas/CABS/1.0/CABS_Common.xsd}PS_ResponseInclusionRQType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PS_ResponseInclusionsRQType", propOrder = {
    "includeContactDetails",
    "includeMarketingDetails",
    "includeDescription",
    "includeImages",
    "includeProducts",
    "includeProductDescription",
    "includeProductRates",
    "includeProductImages",
    "includeProductMarketingDetails",
    "includeOptInDetails",
    "includeBusinessDetails",
    "includeBookingDetails",
    "includeProductPickupLocations",
    "includeShortDescription",
    "includeRegionGeocodeDetails",
    "includeECommerceDetails",
    "includeMerchantDetails"
})
public class PSResponseInclusionsRQType {

    @XmlElement(name = "IncludeContactDetails")
    protected PSResponseInclusionRQType includeContactDetails;
    @XmlElement(name = "IncludeMarketingDetails")
    protected PSResponseInclusionRQType includeMarketingDetails;
    @XmlElement(name = "IncludeDescription")
    protected PSResponseInclusionRQType includeDescription;
    @XmlElement(name = "IncludeImages")
    protected PSResponseInclusionRQType includeImages;
    @XmlElement(name = "IncludeProducts")
    protected PSResponseInclusionRQType includeProducts;
    @XmlElement(name = "IncludeProductDescription")
    protected PSResponseInclusionRQType includeProductDescription;
    @XmlElement(name = "IncludeProductRates")
    protected PSResponseInclusionRQType includeProductRates;
    @XmlElement(name = "IncludeProductImages")
    protected PSResponseInclusionRQType includeProductImages;
    @XmlElement(name = "IncludeProductMarketingDetails")
    protected PSResponseInclusionRQType includeProductMarketingDetails;
    @XmlElement(name = "IncludeOptInDetails")
    protected PSResponseInclusionRQType includeOptInDetails;
    @XmlElement(name = "IncludeBusinessDetails")
    protected PSResponseInclusionRQType includeBusinessDetails;
    @XmlElement(name = "IncludeBookingDetails")
    protected PSResponseInclusionRQType includeBookingDetails;
    @XmlElement(name = "IncludeProductPickupLocations")
    protected PSResponseInclusionRQType includeProductPickupLocations;
    @XmlElement(name = "IncludeShortDescription")
    protected PSResponseInclusionRQType includeShortDescription;
    @XmlElement(name = "IncludeRegionGeocodeDetails")
    protected PSResponseInclusionRQType includeRegionGeocodeDetails;
    @XmlElement(name = "IncludeECommerceDetails")
    protected PSResponseInclusionRQType includeECommerceDetails;
    @XmlElement(name = "IncludeMerchantDetails")
    protected PSResponseInclusionRQType includeMerchantDetails;

    /**
     * Gets the value of the includeContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeContactDetails() {
        return includeContactDetails;
    }

    /**
     * Sets the value of the includeContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeContactDetails(PSResponseInclusionRQType value) {
        this.includeContactDetails = value;
    }

    /**
     * Gets the value of the includeMarketingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeMarketingDetails() {
        return includeMarketingDetails;
    }

    /**
     * Sets the value of the includeMarketingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeMarketingDetails(PSResponseInclusionRQType value) {
        this.includeMarketingDetails = value;
    }

    /**
     * Gets the value of the includeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeDescription() {
        return includeDescription;
    }

    /**
     * Sets the value of the includeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeDescription(PSResponseInclusionRQType value) {
        this.includeDescription = value;
    }

    /**
     * Gets the value of the includeImages property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeImages() {
        return includeImages;
    }

    /**
     * Sets the value of the includeImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeImages(PSResponseInclusionRQType value) {
        this.includeImages = value;
    }

    /**
     * Gets the value of the includeProducts property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeProducts() {
        return includeProducts;
    }

    /**
     * Sets the value of the includeProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeProducts(PSResponseInclusionRQType value) {
        this.includeProducts = value;
    }

    /**
     * Gets the value of the includeProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeProductDescription() {
        return includeProductDescription;
    }

    /**
     * Sets the value of the includeProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeProductDescription(PSResponseInclusionRQType value) {
        this.includeProductDescription = value;
    }

    /**
     * Gets the value of the includeProductRates property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeProductRates() {
        return includeProductRates;
    }

    /**
     * Sets the value of the includeProductRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeProductRates(PSResponseInclusionRQType value) {
        this.includeProductRates = value;
    }

    /**
     * Gets the value of the includeProductImages property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeProductImages() {
        return includeProductImages;
    }

    /**
     * Sets the value of the includeProductImages property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeProductImages(PSResponseInclusionRQType value) {
        this.includeProductImages = value;
    }

    /**
     * Gets the value of the includeProductMarketingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeProductMarketingDetails() {
        return includeProductMarketingDetails;
    }

    /**
     * Sets the value of the includeProductMarketingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeProductMarketingDetails(PSResponseInclusionRQType value) {
        this.includeProductMarketingDetails = value;
    }

    /**
     * Gets the value of the includeOptInDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeOptInDetails() {
        return includeOptInDetails;
    }

    /**
     * Sets the value of the includeOptInDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeOptInDetails(PSResponseInclusionRQType value) {
        this.includeOptInDetails = value;
    }

    /**
     * Gets the value of the includeBusinessDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeBusinessDetails() {
        return includeBusinessDetails;
    }

    /**
     * Sets the value of the includeBusinessDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeBusinessDetails(PSResponseInclusionRQType value) {
        this.includeBusinessDetails = value;
    }

    /**
     * Gets the value of the includeBookingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeBookingDetails() {
        return includeBookingDetails;
    }

    /**
     * Sets the value of the includeBookingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeBookingDetails(PSResponseInclusionRQType value) {
        this.includeBookingDetails = value;
    }

    /**
     * Gets the value of the includeProductPickupLocations property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeProductPickupLocations() {
        return includeProductPickupLocations;
    }

    /**
     * Sets the value of the includeProductPickupLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeProductPickupLocations(PSResponseInclusionRQType value) {
        this.includeProductPickupLocations = value;
    }

    /**
     * Gets the value of the includeShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeShortDescription() {
        return includeShortDescription;
    }

    /**
     * Sets the value of the includeShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeShortDescription(PSResponseInclusionRQType value) {
        this.includeShortDescription = value;
    }

    /**
     * Gets the value of the includeRegionGeocodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeRegionGeocodeDetails() {
        return includeRegionGeocodeDetails;
    }

    /**
     * Sets the value of the includeRegionGeocodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeRegionGeocodeDetails(PSResponseInclusionRQType value) {
        this.includeRegionGeocodeDetails = value;
    }

    /**
     * Gets the value of the includeECommerceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeECommerceDetails() {
        return includeECommerceDetails;
    }

    /**
     * Sets the value of the includeECommerceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeECommerceDetails(PSResponseInclusionRQType value) {
        this.includeECommerceDetails = value;
    }

    /**
     * Gets the value of the includeMerchantDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public PSResponseInclusionRQType getIncludeMerchantDetails() {
        return includeMerchantDetails;
    }

    /**
     * Sets the value of the includeMerchantDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSResponseInclusionRQType }
     *     
     */
    public void setIncludeMerchantDetails(PSResponseInclusionRQType value) {
        this.includeMerchantDetails = value;
    }

}
