
package com.epostcode.ws.uk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressPremise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressPremise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unique_Delivery_Point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation_Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Organisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sub_Building_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Building_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dependent_Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Double_Dependent_Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dependent_Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Post_Town" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County_LocalAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County_Administrative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County_FormerPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County_Traditional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Post_Office_Box" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User_Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mailsort_Sortcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Delivery_Point_Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude_Degrees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude_Degrees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Return_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressPremise", propOrder = {
    "uniqueDeliveryPoint",
    "organisationDepartment",
    "organisation",
    "subBuildingName",
    "buildingName",
    "number",
    "dependentStreet",
    "street",
    "doubleDependentLocality",
    "dependentLocality",
    "postTown",
    "countyLocalAuthority",
    "countyAdministrative",
    "countyFormerPostal",
    "countyTraditional",
    "country",
    "postcode",
    "postOfficeBox",
    "userCategory",
    "mailsortSortcode",
    "deliveryPointSuffix",
    "latitudeDegrees",
    "longitudeDegrees",
    "isError",
    "errorMessage",
    "fullAddress",
    "returnCode"
})
public class AddressPremise {

    @XmlElement(name = "Unique_Delivery_Point")
    protected String uniqueDeliveryPoint;
    @XmlElement(name = "Organisation_Department")
    protected String organisationDepartment;
    @XmlElement(name = "Organisation")
    protected String organisation;
    @XmlElement(name = "Sub_Building_Name")
    protected String subBuildingName;
    @XmlElement(name = "Building_Name")
    protected String buildingName;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Dependent_Street")
    protected String dependentStreet;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "Double_Dependent_Locality")
    protected String doubleDependentLocality;
    @XmlElement(name = "Dependent_Locality")
    protected String dependentLocality;
    @XmlElement(name = "Post_Town")
    protected String postTown;
    @XmlElement(name = "County_LocalAuthority")
    protected String countyLocalAuthority;
    @XmlElement(name = "County_Administrative")
    protected String countyAdministrative;
    @XmlElement(name = "County_FormerPostal")
    protected String countyFormerPostal;
    @XmlElement(name = "County_Traditional")
    protected String countyTraditional;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Postcode")
    protected String postcode;
    @XmlElement(name = "Post_Office_Box")
    protected String postOfficeBox;
    @XmlElement(name = "User_Category")
    protected String userCategory;
    @XmlElement(name = "Mailsort_Sortcode")
    protected String mailsortSortcode;
    @XmlElement(name = "Delivery_Point_Suffix")
    protected String deliveryPointSuffix;
    @XmlElement(name = "Latitude_Degrees")
    protected String latitudeDegrees;
    @XmlElement(name = "Longitude_Degrees")
    protected String longitudeDegrees;
    @XmlElement(name = "IsError")
    protected boolean isError;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "FullAddress")
    protected String fullAddress;
    @XmlElement(name = "Return_Code")
    protected String returnCode;

    /**
     * Gets the value of the uniqueDeliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueDeliveryPoint() {
        return uniqueDeliveryPoint;
    }

    /**
     * Sets the value of the uniqueDeliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueDeliveryPoint(String value) {
        this.uniqueDeliveryPoint = value;
    }

    /**
     * Gets the value of the organisationDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationDepartment() {
        return organisationDepartment;
    }

    /**
     * Sets the value of the organisationDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationDepartment(String value) {
        this.organisationDepartment = value;
    }

    /**
     * Gets the value of the organisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisation(String value) {
        this.organisation = value;
    }

    /**
     * Gets the value of the subBuildingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBuildingName() {
        return subBuildingName;
    }

    /**
     * Sets the value of the subBuildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBuildingName(String value) {
        this.subBuildingName = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingName(String value) {
        this.buildingName = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the dependentStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentStreet() {
        return dependentStreet;
    }

    /**
     * Sets the value of the dependentStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentStreet(String value) {
        this.dependentStreet = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the doubleDependentLocality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoubleDependentLocality() {
        return doubleDependentLocality;
    }

    /**
     * Sets the value of the doubleDependentLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoubleDependentLocality(String value) {
        this.doubleDependentLocality = value;
    }

    /**
     * Gets the value of the dependentLocality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentLocality() {
        return dependentLocality;
    }

    /**
     * Sets the value of the dependentLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentLocality(String value) {
        this.dependentLocality = value;
    }

    /**
     * Gets the value of the postTown property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostTown() {
        return postTown;
    }

    /**
     * Sets the value of the postTown property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostTown(String value) {
        this.postTown = value;
    }

    /**
     * Gets the value of the countyLocalAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyLocalAuthority() {
        return countyLocalAuthority;
    }

    /**
     * Sets the value of the countyLocalAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyLocalAuthority(String value) {
        this.countyLocalAuthority = value;
    }

    /**
     * Gets the value of the countyAdministrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyAdministrative() {
        return countyAdministrative;
    }

    /**
     * Sets the value of the countyAdministrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyAdministrative(String value) {
        this.countyAdministrative = value;
    }

    /**
     * Gets the value of the countyFormerPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyFormerPostal() {
        return countyFormerPostal;
    }

    /**
     * Sets the value of the countyFormerPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyFormerPostal(String value) {
        this.countyFormerPostal = value;
    }

    /**
     * Gets the value of the countyTraditional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyTraditional() {
        return countyTraditional;
    }

    /**
     * Sets the value of the countyTraditional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyTraditional(String value) {
        this.countyTraditional = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the postOfficeBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOfficeBox() {
        return postOfficeBox;
    }

    /**
     * Sets the value of the postOfficeBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOfficeBox(String value) {
        this.postOfficeBox = value;
    }

    /**
     * Gets the value of the userCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCategory() {
        return userCategory;
    }

    /**
     * Sets the value of the userCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCategory(String value) {
        this.userCategory = value;
    }

    /**
     * Gets the value of the mailsortSortcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailsortSortcode() {
        return mailsortSortcode;
    }

    /**
     * Sets the value of the mailsortSortcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailsortSortcode(String value) {
        this.mailsortSortcode = value;
    }

    /**
     * Gets the value of the deliveryPointSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPointSuffix() {
        return deliveryPointSuffix;
    }

    /**
     * Sets the value of the deliveryPointSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPointSuffix(String value) {
        this.deliveryPointSuffix = value;
    }

    /**
     * Gets the value of the latitudeDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeDegrees() {
        return latitudeDegrees;
    }

    /**
     * Sets the value of the latitudeDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeDegrees(String value) {
        this.latitudeDegrees = value;
    }

    /**
     * Gets the value of the longitudeDegrees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudeDegrees() {
        return longitudeDegrees;
    }

    /**
     * Sets the value of the longitudeDegrees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeDegrees(String value) {
        this.longitudeDegrees = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     */
    public boolean isIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     */
    public void setIsError(boolean value) {
        this.isError = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the fullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * Sets the value of the fullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAddress(String value) {
        this.fullAddress = value;
    }

    /**
     * Gets the value of the returnCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Sets the value of the returnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

}
