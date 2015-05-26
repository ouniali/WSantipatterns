
package com.epostcode.ws.uk.postcodeutilities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ListAddressPremise">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="List_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Unique_Delivery_Point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Return_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ListAddressThoroughfare">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="List_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Return_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Nearest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Postcode_Datum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Postcode_Return" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Postcode_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Ordinal_Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Distance_Metres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Distance_Kilometres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Distance_Miles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Distance_NauticalMiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Return_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Geographic">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Grid_Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="x_Coord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="y_Coord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Latitude_Deg_Min_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Longitude_Deg_Min_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Latitude_Degrees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Longitude_Degrees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Country_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Country_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Administrative_County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Local_Auth_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Local_Auth_Ward_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Local_Auth_Ward_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NHS_Regional_Office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NHS_Strat_Health_Board_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NHS_Strat_Health_Board_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NHS_Primary_Health_Auth_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NHS_Primary_Health_Board_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NHS_Primary_Health_Board_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="M_Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="G_Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Return_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AddressPremise">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Unique_Delivery_Point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Organisation_Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Organisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Sub_Building_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Building_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Dependent_Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Double_Dependent_Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Dependent_Locality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Post_Town" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="County_LocalAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="County_Administrative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="County_Traditional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="County_FormerPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Post_Office_Box" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="User_Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Mailsort_Sortcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Delivery_Point_Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Return_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="License">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenseTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenseTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CurrentCreditsAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AllowedIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LicenseInUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Return_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listAddressPremiseOrListAddressThoroughfareOrNearest"
})
@XmlRootElement(name = "PostcodeUtilities")
public class PostcodeUtilities {

    @XmlElements({
        @XmlElement(name = "ListAddressPremise", type = PostcodeUtilities.ListAddressPremise.class),
        @XmlElement(name = "ListAddressThoroughfare", type = PostcodeUtilities.ListAddressThoroughfare.class),
        @XmlElement(name = "Nearest", type = PostcodeUtilities.Nearest.class),
        @XmlElement(name = "Geographic", type = PostcodeUtilities.Geographic.class),
        @XmlElement(name = "AddressPremise", type = PostcodeUtilities.AddressPremise.class),
        @XmlElement(name = "License", type = PostcodeUtilities.License.class)
    })
    protected List<Object> listAddressPremiseOrListAddressThoroughfareOrNearest;

    /**
     * Gets the value of the listAddressPremiseOrListAddressThoroughfareOrNearest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listAddressPremiseOrListAddressThoroughfareOrNearest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListAddressPremiseOrListAddressThoroughfareOrNearest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostcodeUtilities.ListAddressPremise }
     * {@link PostcodeUtilities.ListAddressThoroughfare }
     * {@link PostcodeUtilities.Nearest }
     * {@link PostcodeUtilities.Geographic }
     * {@link PostcodeUtilities.AddressPremise }
     * {@link PostcodeUtilities.License }
     * 
     * 
     */
    public List<Object> getListAddressPremiseOrListAddressThoroughfareOrNearest() {
        if (listAddressPremiseOrListAddressThoroughfareOrNearest == null) {
            listAddressPremiseOrListAddressThoroughfareOrNearest = new ArrayList<Object>();
        }
        return this.listAddressPremiseOrListAddressThoroughfareOrNearest;
    }


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
     *         &lt;element name="County_Traditional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="County_FormerPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Post_Office_Box" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="User_Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Mailsort_Sortcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Delivery_Point_Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
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
        "countyTraditional",
        "countyFormerPostal",
        "country",
        "postcode",
        "postOfficeBox",
        "userCategory",
        "mailsortSortcode",
        "deliveryPointSuffix",
        "returnCode"
    })
    public static class AddressPremise {

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
        @XmlElement(name = "County_Traditional")
        protected String countyTraditional;
        @XmlElement(name = "County_FormerPostal")
        protected String countyFormerPostal;
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
     *         &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Grid_Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="x_Coord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="y_Coord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Latitude_Deg_Min_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Longitude_Deg_Min_Sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Latitude_Degrees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Longitude_Degrees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Country_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Country_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Administrative_County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Local_Auth_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Local_Auth_Ward_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Local_Auth_Ward_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NHS_Regional_Office" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NHS_Strat_Health_Board_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NHS_Strat_Health_Board_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NHS_Primary_Health_Auth_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NHS_Primary_Health_Board_Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NHS_Primary_Health_Board_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="M_Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="G_Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "postcode",
        "gridReference",
        "xCoord",
        "yCoord",
        "latitudeDegMinSec",
        "longitudeDegMinSec",
        "latitudeDegrees",
        "longitudeDegrees",
        "countryCode",
        "countryName",
        "administrativeCounty",
        "localAuthName",
        "localAuthWardCode",
        "localAuthWardName",
        "nhsRegionalOffice",
        "nhsStratHealthBoardCode",
        "nhsStratHealthBoardName",
        "nhsPrimaryHealthAuthCode",
        "nhsPrimaryHealthBoardCode",
        "nhsPrimaryHealthBoardName",
        "mDetails",
        "gDetails",
        "returnCode"
    })
    public static class Geographic {

        @XmlElement(name = "Postcode")
        protected String postcode;
        @XmlElement(name = "Grid_Reference")
        protected String gridReference;
        @XmlElement(name = "x_Coord")
        protected String xCoord;
        @XmlElement(name = "y_Coord")
        protected String yCoord;
        @XmlElement(name = "Latitude_Deg_Min_Sec")
        protected String latitudeDegMinSec;
        @XmlElement(name = "Longitude_Deg_Min_Sec")
        protected String longitudeDegMinSec;
        @XmlElement(name = "Latitude_Degrees")
        protected String latitudeDegrees;
        @XmlElement(name = "Longitude_Degrees")
        protected String longitudeDegrees;
        @XmlElement(name = "Country_Code")
        protected String countryCode;
        @XmlElement(name = "Country_Name")
        protected String countryName;
        @XmlElement(name = "Administrative_County")
        protected String administrativeCounty;
        @XmlElement(name = "Local_Auth_Name")
        protected String localAuthName;
        @XmlElement(name = "Local_Auth_Ward_Code")
        protected String localAuthWardCode;
        @XmlElement(name = "Local_Auth_Ward_Name")
        protected String localAuthWardName;
        @XmlElement(name = "NHS_Regional_Office")
        protected String nhsRegionalOffice;
        @XmlElement(name = "NHS_Strat_Health_Board_Code")
        protected String nhsStratHealthBoardCode;
        @XmlElement(name = "NHS_Strat_Health_Board_Name")
        protected String nhsStratHealthBoardName;
        @XmlElement(name = "NHS_Primary_Health_Auth_Code")
        protected String nhsPrimaryHealthAuthCode;
        @XmlElement(name = "NHS_Primary_Health_Board_Code")
        protected String nhsPrimaryHealthBoardCode;
        @XmlElement(name = "NHS_Primary_Health_Board_Name")
        protected String nhsPrimaryHealthBoardName;
        @XmlElement(name = "M_Details")
        protected String mDetails;
        @XmlElement(name = "G_Details")
        protected String gDetails;
        @XmlElement(name = "Return_Code")
        protected String returnCode;

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
         * Gets the value of the gridReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGridReference() {
            return gridReference;
        }

        /**
         * Sets the value of the gridReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGridReference(String value) {
            this.gridReference = value;
        }

        /**
         * Gets the value of the xCoord property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXCoord() {
            return xCoord;
        }

        /**
         * Sets the value of the xCoord property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXCoord(String value) {
            this.xCoord = value;
        }

        /**
         * Gets the value of the yCoord property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYCoord() {
            return yCoord;
        }

        /**
         * Sets the value of the yCoord property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYCoord(String value) {
            this.yCoord = value;
        }

        /**
         * Gets the value of the latitudeDegMinSec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitudeDegMinSec() {
            return latitudeDegMinSec;
        }

        /**
         * Sets the value of the latitudeDegMinSec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitudeDegMinSec(String value) {
            this.latitudeDegMinSec = value;
        }

        /**
         * Gets the value of the longitudeDegMinSec property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitudeDegMinSec() {
            return longitudeDegMinSec;
        }

        /**
         * Sets the value of the longitudeDegMinSec property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitudeDegMinSec(String value) {
            this.longitudeDegMinSec = value;
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
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the countryName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryName() {
            return countryName;
        }

        /**
         * Sets the value of the countryName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryName(String value) {
            this.countryName = value;
        }

        /**
         * Gets the value of the administrativeCounty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdministrativeCounty() {
            return administrativeCounty;
        }

        /**
         * Sets the value of the administrativeCounty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdministrativeCounty(String value) {
            this.administrativeCounty = value;
        }

        /**
         * Gets the value of the localAuthName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalAuthName() {
            return localAuthName;
        }

        /**
         * Sets the value of the localAuthName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalAuthName(String value) {
            this.localAuthName = value;
        }

        /**
         * Gets the value of the localAuthWardCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalAuthWardCode() {
            return localAuthWardCode;
        }

        /**
         * Sets the value of the localAuthWardCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalAuthWardCode(String value) {
            this.localAuthWardCode = value;
        }

        /**
         * Gets the value of the localAuthWardName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalAuthWardName() {
            return localAuthWardName;
        }

        /**
         * Sets the value of the localAuthWardName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalAuthWardName(String value) {
            this.localAuthWardName = value;
        }

        /**
         * Gets the value of the nhsRegionalOffice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNHSRegionalOffice() {
            return nhsRegionalOffice;
        }

        /**
         * Sets the value of the nhsRegionalOffice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNHSRegionalOffice(String value) {
            this.nhsRegionalOffice = value;
        }

        /**
         * Gets the value of the nhsStratHealthBoardCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNHSStratHealthBoardCode() {
            return nhsStratHealthBoardCode;
        }

        /**
         * Sets the value of the nhsStratHealthBoardCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNHSStratHealthBoardCode(String value) {
            this.nhsStratHealthBoardCode = value;
        }

        /**
         * Gets the value of the nhsStratHealthBoardName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNHSStratHealthBoardName() {
            return nhsStratHealthBoardName;
        }

        /**
         * Sets the value of the nhsStratHealthBoardName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNHSStratHealthBoardName(String value) {
            this.nhsStratHealthBoardName = value;
        }

        /**
         * Gets the value of the nhsPrimaryHealthAuthCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNHSPrimaryHealthAuthCode() {
            return nhsPrimaryHealthAuthCode;
        }

        /**
         * Sets the value of the nhsPrimaryHealthAuthCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNHSPrimaryHealthAuthCode(String value) {
            this.nhsPrimaryHealthAuthCode = value;
        }

        /**
         * Gets the value of the nhsPrimaryHealthBoardCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNHSPrimaryHealthBoardCode() {
            return nhsPrimaryHealthBoardCode;
        }

        /**
         * Sets the value of the nhsPrimaryHealthBoardCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNHSPrimaryHealthBoardCode(String value) {
            this.nhsPrimaryHealthBoardCode = value;
        }

        /**
         * Gets the value of the nhsPrimaryHealthBoardName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNHSPrimaryHealthBoardName() {
            return nhsPrimaryHealthBoardName;
        }

        /**
         * Sets the value of the nhsPrimaryHealthBoardName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNHSPrimaryHealthBoardName(String value) {
            this.nhsPrimaryHealthBoardName = value;
        }

        /**
         * Gets the value of the mDetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMDetails() {
            return mDetails;
        }

        /**
         * Sets the value of the mDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMDetails(String value) {
            this.mDetails = value;
        }

        /**
         * Gets the value of the gDetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGDetails() {
            return gDetails;
        }

        /**
         * Sets the value of the gDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGDetails(String value) {
            this.gDetails = value;
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
     *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenseTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenseTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CurrentCreditsAvailable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AllowedIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LicenseInUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "accountName",
        "guid",
        "licenseID",
        "licenseTypeName",
        "licenseTypeDesc",
        "expiryDate",
        "currentCreditsAvailable",
        "allowedIpAddress",
        "licenseInUse",
        "available",
        "status",
        "returnCode"
    })
    public static class License {

        @XmlElement(name = "AccountName")
        protected String accountName;
        @XmlElement(name = "Guid")
        protected String guid;
        @XmlElement(name = "LicenseID")
        protected String licenseID;
        @XmlElement(name = "LicenseTypeName")
        protected String licenseTypeName;
        @XmlElement(name = "LicenseTypeDesc")
        protected String licenseTypeDesc;
        @XmlElement(name = "ExpiryDate")
        protected String expiryDate;
        @XmlElement(name = "CurrentCreditsAvailable")
        protected String currentCreditsAvailable;
        @XmlElement(name = "AllowedIpAddress")
        protected String allowedIpAddress;
        @XmlElement(name = "LicenseInUse")
        protected String licenseInUse;
        @XmlElement(name = "Available")
        protected String available;
        @XmlElement(name = "Status")
        protected String status;
        @XmlElement(name = "Return_Code")
        protected String returnCode;

        /**
         * Gets the value of the accountName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountName() {
            return accountName;
        }

        /**
         * Sets the value of the accountName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountName(String value) {
            this.accountName = value;
        }

        /**
         * Gets the value of the guid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuid() {
            return guid;
        }

        /**
         * Sets the value of the guid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuid(String value) {
            this.guid = value;
        }

        /**
         * Gets the value of the licenseID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseID() {
            return licenseID;
        }

        /**
         * Sets the value of the licenseID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseID(String value) {
            this.licenseID = value;
        }

        /**
         * Gets the value of the licenseTypeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseTypeName() {
            return licenseTypeName;
        }

        /**
         * Sets the value of the licenseTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseTypeName(String value) {
            this.licenseTypeName = value;
        }

        /**
         * Gets the value of the licenseTypeDesc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseTypeDesc() {
            return licenseTypeDesc;
        }

        /**
         * Sets the value of the licenseTypeDesc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseTypeDesc(String value) {
            this.licenseTypeDesc = value;
        }

        /**
         * Gets the value of the expiryDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpiryDate() {
            return expiryDate;
        }

        /**
         * Sets the value of the expiryDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpiryDate(String value) {
            this.expiryDate = value;
        }

        /**
         * Gets the value of the currentCreditsAvailable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrentCreditsAvailable() {
            return currentCreditsAvailable;
        }

        /**
         * Sets the value of the currentCreditsAvailable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrentCreditsAvailable(String value) {
            this.currentCreditsAvailable = value;
        }

        /**
         * Gets the value of the allowedIpAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllowedIpAddress() {
            return allowedIpAddress;
        }

        /**
         * Sets the value of the allowedIpAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllowedIpAddress(String value) {
            this.allowedIpAddress = value;
        }

        /**
         * Gets the value of the licenseInUse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseInUse() {
            return licenseInUse;
        }

        /**
         * Sets the value of the licenseInUse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseInUse(String value) {
            this.licenseInUse = value;
        }

        /**
         * Gets the value of the available property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvailable() {
            return available;
        }

        /**
         * Sets the value of the available property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvailable(String value) {
            this.available = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
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
     *         &lt;element name="List_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Unique_Delivery_Point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "listAddress",
        "uniqueDeliveryPoint",
        "returnCode"
    })
    public static class ListAddressPremise {

        @XmlElement(name = "List_Address")
        protected String listAddress;
        @XmlElement(name = "Unique_Delivery_Point")
        protected String uniqueDeliveryPoint;
        @XmlElement(name = "Return_Code")
        protected String returnCode;

        /**
         * Gets the value of the listAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListAddress() {
            return listAddress;
        }

        /**
         * Sets the value of the listAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListAddress(String value) {
            this.listAddress = value;
        }

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
     *         &lt;element name="List_Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "listAddress",
        "identifier",
        "returnCode"
    })
    public static class ListAddressThoroughfare {

        @XmlElement(name = "List_Address")
        protected String listAddress;
        @XmlElement(name = "Identifier")
        protected String identifier;
        @XmlElement(name = "Return_Code")
        protected String returnCode;

        /**
         * Gets the value of the listAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListAddress() {
            return listAddress;
        }

        /**
         * Sets the value of the listAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListAddress(String value) {
            this.listAddress = value;
        }

        /**
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifier() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifier(String value) {
            this.identifier = value;
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
     *         &lt;element name="Postcode_Datum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Postcode_Return" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Postcode_Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Ordinal_Position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Distance_Metres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Distance_Kilometres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Distance_Miles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Distance_NauticalMiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "postcodeDatum",
        "postcodeReturn",
        "postcodeDescription",
        "ordinalPosition",
        "distanceMetres",
        "distanceKilometres",
        "distanceMiles",
        "distanceNauticalMiles",
        "returnCode"
    })
    public static class Nearest {

        @XmlElement(name = "Postcode_Datum")
        protected String postcodeDatum;
        @XmlElement(name = "Postcode_Return")
        protected String postcodeReturn;
        @XmlElement(name = "Postcode_Description")
        protected String postcodeDescription;
        @XmlElement(name = "Ordinal_Position")
        protected String ordinalPosition;
        @XmlElement(name = "Distance_Metres")
        protected String distanceMetres;
        @XmlElement(name = "Distance_Kilometres")
        protected String distanceKilometres;
        @XmlElement(name = "Distance_Miles")
        protected String distanceMiles;
        @XmlElement(name = "Distance_NauticalMiles")
        protected String distanceNauticalMiles;
        @XmlElement(name = "Return_Code")
        protected String returnCode;

        /**
         * Gets the value of the postcodeDatum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostcodeDatum() {
            return postcodeDatum;
        }

        /**
         * Sets the value of the postcodeDatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostcodeDatum(String value) {
            this.postcodeDatum = value;
        }

        /**
         * Gets the value of the postcodeReturn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostcodeReturn() {
            return postcodeReturn;
        }

        /**
         * Sets the value of the postcodeReturn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostcodeReturn(String value) {
            this.postcodeReturn = value;
        }

        /**
         * Gets the value of the postcodeDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostcodeDescription() {
            return postcodeDescription;
        }

        /**
         * Sets the value of the postcodeDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostcodeDescription(String value) {
            this.postcodeDescription = value;
        }

        /**
         * Gets the value of the ordinalPosition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrdinalPosition() {
            return ordinalPosition;
        }

        /**
         * Sets the value of the ordinalPosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrdinalPosition(String value) {
            this.ordinalPosition = value;
        }

        /**
         * Gets the value of the distanceMetres property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceMetres() {
            return distanceMetres;
        }

        /**
         * Sets the value of the distanceMetres property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceMetres(String value) {
            this.distanceMetres = value;
        }

        /**
         * Gets the value of the distanceKilometres property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceKilometres() {
            return distanceKilometres;
        }

        /**
         * Sets the value of the distanceKilometres property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceKilometres(String value) {
            this.distanceKilometres = value;
        }

        /**
         * Gets the value of the distanceMiles property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceMiles() {
            return distanceMiles;
        }

        /**
         * Sets the value of the distanceMiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceMiles(String value) {
            this.distanceMiles = value;
        }

        /**
         * Gets the value of the distanceNauticalMiles property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceNauticalMiles() {
            return distanceNauticalMiles;
        }

        /**
         * Sets the value of the distanceNauticalMiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceNauticalMiles(String value) {
            this.distanceNauticalMiles = value;
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

}
