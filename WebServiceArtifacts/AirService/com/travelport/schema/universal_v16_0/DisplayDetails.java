
package com.travelport.schema.universal_v16_0;

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
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}DisplayDetail" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}DisplayContents"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/universal_v16_0}attrProviderReservationDetails"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "displayDetail",
    "displayContents"
})
@XmlRootElement(name = "DisplayDetails")
public class DisplayDetails {

    @XmlElement(name = "DisplayDetail")
    protected List<DisplayDetail> displayDetail;
    @XmlElement(name = "DisplayContents")
    protected String displayContents;
    @XmlAttribute(name = "ProviderReservationDetail")
    protected Boolean providerReservationDetail;
    @XmlAttribute(name = "CustomCheck")
    protected Boolean customCheck;
    @XmlAttribute(name = "ReviewBooking")
    protected Boolean reviewBooking;
    @XmlAttribute(name = "ProviderProfile")
    protected Boolean providerProfile;
    @XmlAttribute(name = "DivideDetails")
    protected Boolean divideDetails;
    @XmlAttribute(name = "EnhancedItinModifiers")
    protected Boolean enhancedItinModifiers;
    @XmlAttribute(name = "IntegratedContent")
    protected Boolean integratedContent;
    @XmlAttribute(name = "Cruise")
    protected Boolean cruise;
    @XmlAttribute(name = "MCO")
    protected Boolean mco;
    @XmlAttribute(name = "RailSegment")
    protected Boolean railSegment;

    /**
     * Gets the value of the displayDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayDetail }
     * 
     * 
     */
    public List<DisplayDetail> getDisplayDetail() {
        if (displayDetail == null) {
            displayDetail = new ArrayList<DisplayDetail>();
        }
        return this.displayDetail;
    }

    /**
     * Gets the value of the displayContents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayContents() {
        return displayContents;
    }

    /**
     * Sets the value of the displayContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayContents(String value) {
        this.displayContents = value;
    }

    /**
     * Gets the value of the providerReservationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProviderReservationDetail() {
        return providerReservationDetail;
    }

    /**
     * Sets the value of the providerReservationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProviderReservationDetail(Boolean value) {
        this.providerReservationDetail = value;
    }

    /**
     * Gets the value of the customCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomCheck() {
        return customCheck;
    }

    /**
     * Sets the value of the customCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomCheck(Boolean value) {
        this.customCheck = value;
    }

    /**
     * Gets the value of the reviewBooking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReviewBooking() {
        return reviewBooking;
    }

    /**
     * Sets the value of the reviewBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReviewBooking(Boolean value) {
        this.reviewBooking = value;
    }

    /**
     * Gets the value of the providerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProviderProfile() {
        return providerProfile;
    }

    /**
     * Sets the value of the providerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProviderProfile(Boolean value) {
        this.providerProfile = value;
    }

    /**
     * Gets the value of the divideDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDivideDetails() {
        return divideDetails;
    }

    /**
     * Sets the value of the divideDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDivideDetails(Boolean value) {
        this.divideDetails = value;
    }

    /**
     * Gets the value of the enhancedItinModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnhancedItinModifiers() {
        return enhancedItinModifiers;
    }

    /**
     * Sets the value of the enhancedItinModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnhancedItinModifiers(Boolean value) {
        this.enhancedItinModifiers = value;
    }

    /**
     * Gets the value of the integratedContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratedContent() {
        return integratedContent;
    }

    /**
     * Sets the value of the integratedContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratedContent(Boolean value) {
        this.integratedContent = value;
    }

    /**
     * Gets the value of the cruise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCruise() {
        return cruise;
    }

    /**
     * Sets the value of the cruise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCruise(Boolean value) {
        this.cruise = value;
    }

    /**
     * Gets the value of the mco property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMCO() {
        return mco;
    }

    /**
     * Sets the value of the mco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMCO(Boolean value) {
        this.mco = value;
    }

    /**
     * Gets the value of the railSegment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRailSegment() {
        return railSegment;
    }

    /**
     * Sets the value of the railSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRailSegment(Boolean value) {
        this.railSegment = value;
    }

}
