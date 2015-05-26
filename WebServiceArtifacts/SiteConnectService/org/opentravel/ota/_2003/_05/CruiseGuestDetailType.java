
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CruiseGuestDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CruiseGuestDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SelectedFareCode" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContactInfo" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GuestInfoGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GuestTransportation" type="{http://www.opentravel.org/OTA/2003/05}GuestTransportationType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="LoyaltyInfo" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LinkedTraveler" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType">
 *                 &lt;attribute name="LinkTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TravelDocument" type="{http://www.opentravel.org/OTA/2003/05}DocumentType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="SelectedDining" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseDiningGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SelectedInsurance" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseInsuranceGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SelectedOptions" type="{http://www.opentravel.org/OTA/2003/05}AmenityOptionType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="SelectedPackages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SelectedPackage" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CruisePackageType">
 *                           &lt;sequence>
 *                             &lt;element name="AirInfo" type="{http://www.opentravel.org/OTA/2003/05}AirInfoType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SelectedSpecialServices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SelectedSpecialService" type="{http://www.opentravel.org/OTA/2003/05}SpecialServiceType" maxOccurs="10" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AirAccommodations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AirAccommodation" maxOccurs="10" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirInfoType">
 *                           &lt;attribute name="Comment" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                           &lt;attribute name="AirAccommodationType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CruiseDocument" type="{http://www.opentravel.org/OTA/2003/05}DocumentHandlingType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}CruiseProfileType" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GuestExistsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RepeatGuestIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseGuestDetailType", propOrder = {
    "selectedFareCode",
    "contactInfo",
    "guestTransportation",
    "loyaltyInfo",
    "linkedTraveler",
    "travelDocument",
    "selectedDining",
    "selectedInsurance",
    "selectedOptions",
    "selectedPackages",
    "selectedSpecialServices",
    "airAccommodations",
    "cruiseDocument",
    "profiles"
})
public class CruiseGuestDetailType {

    @XmlElement(name = "SelectedFareCode")
    protected List<CruiseGuestDetailType.SelectedFareCode> selectedFareCode;
    @XmlElement(name = "ContactInfo")
    protected List<CruiseGuestDetailType.ContactInfo> contactInfo;
    @XmlElement(name = "GuestTransportation")
    protected List<GuestTransportationType> guestTransportation;
    @XmlElement(name = "LoyaltyInfo")
    protected List<CruiseGuestDetailType.LoyaltyInfo> loyaltyInfo;
    @XmlElement(name = "LinkedTraveler")
    protected List<CruiseGuestDetailType.LinkedTraveler> linkedTraveler;
    @XmlElement(name = "TravelDocument")
    protected List<DocumentType> travelDocument;
    @XmlElement(name = "SelectedDining")
    protected List<CruiseGuestDetailType.SelectedDining> selectedDining;
    @XmlElement(name = "SelectedInsurance")
    protected List<CruiseGuestDetailType.SelectedInsurance> selectedInsurance;
    @XmlElement(name = "SelectedOptions")
    protected List<AmenityOptionType> selectedOptions;
    @XmlElement(name = "SelectedPackages")
    protected CruiseGuestDetailType.SelectedPackages selectedPackages;
    @XmlElement(name = "SelectedSpecialServices")
    protected CruiseGuestDetailType.SelectedSpecialServices selectedSpecialServices;
    @XmlElement(name = "AirAccommodations")
    protected CruiseGuestDetailType.AirAccommodations airAccommodations;
    @XmlElement(name = "CruiseDocument")
    protected List<DocumentHandlingType> cruiseDocument;
    @XmlElement(name = "Profiles")
    protected List<CruiseProfileType> profiles;
    @XmlAttribute(name = "GuestExistsIndicator")
    protected Boolean guestExistsIndicator;
    @XmlAttribute(name = "RepeatGuestIndicator")
    protected Boolean repeatGuestIndicator;

    /**
     * Gets the value of the selectedFareCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedFareCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedFareCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.SelectedFareCode }
     * 
     * 
     */
    public List<CruiseGuestDetailType.SelectedFareCode> getSelectedFareCode() {
        if (selectedFareCode == null) {
            selectedFareCode = new ArrayList<CruiseGuestDetailType.SelectedFareCode>();
        }
        return this.selectedFareCode;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.ContactInfo }
     * 
     * 
     */
    public List<CruiseGuestDetailType.ContactInfo> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<CruiseGuestDetailType.ContactInfo>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the guestTransportation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestTransportation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestTransportation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestTransportationType }
     * 
     * 
     */
    public List<GuestTransportationType> getGuestTransportation() {
        if (guestTransportation == null) {
            guestTransportation = new ArrayList<GuestTransportationType>();
        }
        return this.guestTransportation;
    }

    /**
     * Gets the value of the loyaltyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.LoyaltyInfo }
     * 
     * 
     */
    public List<CruiseGuestDetailType.LoyaltyInfo> getLoyaltyInfo() {
        if (loyaltyInfo == null) {
            loyaltyInfo = new ArrayList<CruiseGuestDetailType.LoyaltyInfo>();
        }
        return this.loyaltyInfo;
    }

    /**
     * Gets the value of the linkedTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.LinkedTraveler }
     * 
     * 
     */
    public List<CruiseGuestDetailType.LinkedTraveler> getLinkedTraveler() {
        if (linkedTraveler == null) {
            linkedTraveler = new ArrayList<CruiseGuestDetailType.LinkedTraveler>();
        }
        return this.linkedTraveler;
    }

    /**
     * Gets the value of the travelDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     * 
     * 
     */
    public List<DocumentType> getTravelDocument() {
        if (travelDocument == null) {
            travelDocument = new ArrayList<DocumentType>();
        }
        return this.travelDocument;
    }

    /**
     * Gets the value of the selectedDining property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedDining property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedDining().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.SelectedDining }
     * 
     * 
     */
    public List<CruiseGuestDetailType.SelectedDining> getSelectedDining() {
        if (selectedDining == null) {
            selectedDining = new ArrayList<CruiseGuestDetailType.SelectedDining>();
        }
        return this.selectedDining;
    }

    /**
     * Gets the value of the selectedInsurance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedInsurance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedInsurance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseGuestDetailType.SelectedInsurance }
     * 
     * 
     */
    public List<CruiseGuestDetailType.SelectedInsurance> getSelectedInsurance() {
        if (selectedInsurance == null) {
            selectedInsurance = new ArrayList<CruiseGuestDetailType.SelectedInsurance>();
        }
        return this.selectedInsurance;
    }

    /**
     * Gets the value of the selectedOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmenityOptionType }
     * 
     * 
     */
    public List<AmenityOptionType> getSelectedOptions() {
        if (selectedOptions == null) {
            selectedOptions = new ArrayList<AmenityOptionType>();
        }
        return this.selectedOptions;
    }

    /**
     * Gets the value of the selectedPackages property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestDetailType.SelectedPackages }
     *     
     */
    public CruiseGuestDetailType.SelectedPackages getSelectedPackages() {
        return selectedPackages;
    }

    /**
     * Sets the value of the selectedPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestDetailType.SelectedPackages }
     *     
     */
    public void setSelectedPackages(CruiseGuestDetailType.SelectedPackages value) {
        this.selectedPackages = value;
    }

    /**
     * Gets the value of the selectedSpecialServices property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestDetailType.SelectedSpecialServices }
     *     
     */
    public CruiseGuestDetailType.SelectedSpecialServices getSelectedSpecialServices() {
        return selectedSpecialServices;
    }

    /**
     * Sets the value of the selectedSpecialServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestDetailType.SelectedSpecialServices }
     *     
     */
    public void setSelectedSpecialServices(CruiseGuestDetailType.SelectedSpecialServices value) {
        this.selectedSpecialServices = value;
    }

    /**
     * Gets the value of the airAccommodations property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseGuestDetailType.AirAccommodations }
     *     
     */
    public CruiseGuestDetailType.AirAccommodations getAirAccommodations() {
        return airAccommodations;
    }

    /**
     * Sets the value of the airAccommodations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseGuestDetailType.AirAccommodations }
     *     
     */
    public void setAirAccommodations(CruiseGuestDetailType.AirAccommodations value) {
        this.airAccommodations = value;
    }

    /**
     * Gets the value of the cruiseDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cruiseDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCruiseDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentHandlingType }
     * 
     * 
     */
    public List<DocumentHandlingType> getCruiseDocument() {
        if (cruiseDocument == null) {
            cruiseDocument = new ArrayList<DocumentHandlingType>();
        }
        return this.cruiseDocument;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseProfileType }
     * 
     * 
     */
    public List<CruiseProfileType> getProfiles() {
        if (profiles == null) {
            profiles = new ArrayList<CruiseProfileType>();
        }
        return this.profiles;
    }

    /**
     * Gets the value of the guestExistsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuestExistsIndicator() {
        return guestExistsIndicator;
    }

    /**
     * Sets the value of the guestExistsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuestExistsIndicator(Boolean value) {
        this.guestExistsIndicator = value;
    }

    /**
     * Gets the value of the repeatGuestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepeatGuestIndicator() {
        return repeatGuestIndicator;
    }

    /**
     * Sets the value of the repeatGuestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatGuestIndicator(Boolean value) {
        this.repeatGuestIndicator = value;
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
     *         &lt;element name="AirAccommodation" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirInfoType">
     *                 &lt;attribute name="Comment" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *                 &lt;attribute name="AirAccommodationType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "airAccommodation"
    })
    public static class AirAccommodations {

        @XmlElement(name = "AirAccommodation")
        protected List<CruiseGuestDetailType.AirAccommodations.AirAccommodation> airAccommodation;

        /**
         * Gets the value of the airAccommodation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airAccommodation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirAccommodation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseGuestDetailType.AirAccommodations.AirAccommodation }
         * 
         * 
         */
        public List<CruiseGuestDetailType.AirAccommodations.AirAccommodation> getAirAccommodation() {
            if (airAccommodation == null) {
                airAccommodation = new ArrayList<CruiseGuestDetailType.AirAccommodations.AirAccommodation>();
            }
            return this.airAccommodation;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirInfoType">
         *       &lt;attribute name="Comment" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
         *       &lt;attribute name="AirAccommodationType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AirAccommodation
            extends AirInfoType
        {

            @XmlAttribute(name = "Comment")
            protected String comment;
            @XmlAttribute(name = "AirAccommodationType")
            protected String airAccommodationType;

            /**
             * Gets the value of the comment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComment() {
                return comment;
            }

            /**
             * Sets the value of the comment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComment(String value) {
                this.comment = value;
            }

            /**
             * Gets the value of the airAccommodationType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAirAccommodationType() {
                return airAccommodationType;
            }

            /**
             * Sets the value of the airAccommodationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAirAccommodationType(String value) {
                this.airAccommodationType = value;
            }

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ContactPersonType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GuestInfoGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ContactInfo
        extends ContactPersonType
    {

        @XmlAttribute(name = "GuestRefNumber")
        protected String guestRefNumber;
        @XmlAttribute(name = "Age")
        protected Integer age;
        @XmlAttribute(name = "Nationality")
        protected String nationality;
        @XmlAttribute(name = "GuestOccupation")
        protected String guestOccupation;
        @XmlAttribute(name = "BirthDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;
        @XmlAttribute(name = "Gender")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String gender;
        @XmlAttribute(name = "LoyaltyMembershipID")
        protected String loyaltyMembershipID;
        @XmlAttribute(name = "LoyalLevel")
        protected String loyalLevel;
        @XmlAttribute(name = "LoyalLevelCode")
        protected Integer loyalLevelCode;

        /**
         * Gets the value of the guestRefNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuestRefNumber() {
            return guestRefNumber;
        }

        /**
         * Sets the value of the guestRefNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuestRefNumber(String value) {
            this.guestRefNumber = value;
        }

        /**
         * Gets the value of the age property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAge() {
            return age;
        }

        /**
         * Sets the value of the age property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAge(Integer value) {
            this.age = value;
        }

        /**
         * Gets the value of the nationality property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationality() {
            return nationality;
        }

        /**
         * Sets the value of the nationality property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationality(String value) {
            this.nationality = value;
        }

        /**
         * Gets the value of the guestOccupation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuestOccupation() {
            return guestOccupation;
        }

        /**
         * Sets the value of the guestOccupation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuestOccupation(String value) {
            this.guestOccupation = value;
        }

        /**
         * Gets the value of the birthDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGender(String value) {
            this.gender = value;
        }

        /**
         * Gets the value of the loyaltyMembershipID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoyaltyMembershipID() {
            return loyaltyMembershipID;
        }

        /**
         * Sets the value of the loyaltyMembershipID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoyaltyMembershipID(String value) {
            this.loyaltyMembershipID = value;
        }

        /**
         * Gets the value of the loyalLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoyalLevel() {
            return loyalLevel;
        }

        /**
         * Sets the value of the loyalLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoyalLevel(String value) {
            this.loyalLevel = value;
        }

        /**
         * Gets the value of the loyalLevelCode property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLoyalLevelCode() {
            return loyalLevelCode;
        }

        /**
         * Sets the value of the loyalLevelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLoyalLevelCode(Integer value) {
            this.loyalLevelCode = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RelatedTravelerType">
     *       &lt;attribute name="LinkTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LinkedTraveler
        extends RelatedTravelerType
    {

        @XmlAttribute(name = "LinkTypeCode")
        protected String linkTypeCode;

        /**
         * Gets the value of the linkTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLinkTypeCode() {
            return linkTypeCode;
        }

        /**
         * Sets the value of the linkTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLinkTypeCode(String value) {
            this.linkTypeCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LoyaltyInfo {

        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;
        @XmlAttribute(name = "ProgramID")
        protected String programID;
        @XmlAttribute(name = "MembershipID")
        protected String membershipID;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "LoyalLevel")
        protected String loyalLevel;
        @XmlAttribute(name = "LoyalLevelCode")
        protected Integer loyalLevelCode;
        @XmlAttribute(name = "SingleVendorInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String singleVendorInd;
        @XmlAttribute(name = "SignupDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signupDate;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "VendorCode")
        protected List<String> vendorCode;
        @XmlAttribute(name = "PrimaryLoyaltyIndicator")
        protected Boolean primaryLoyaltyIndicator;
        @XmlAttribute(name = "AllianceLoyaltyLevelName")
        protected String allianceLoyaltyLevelName;
        @XmlAttribute(name = "CustomerType")
        protected String customerType;
        @XmlAttribute(name = "CustomerValue")
        protected String customerValue;

        /**
         * Gets the value of the shareSynchInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * Sets the value of the shareSynchInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * Gets the value of the shareMarketInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * Sets the value of the shareMarketInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

        /**
         * Gets the value of the programID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramID() {
            return programID;
        }

        /**
         * Sets the value of the programID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramID(String value) {
            this.programID = value;
        }

        /**
         * Gets the value of the membershipID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMembershipID() {
            return membershipID;
        }

        /**
         * Sets the value of the membershipID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMembershipID(String value) {
            this.membershipID = value;
        }

        /**
         * Gets the value of the travelSector property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * Sets the value of the travelSector property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

        /**
         * Gets the value of the loyalLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoyalLevel() {
            return loyalLevel;
        }

        /**
         * Sets the value of the loyalLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoyalLevel(String value) {
            this.loyalLevel = value;
        }

        /**
         * Gets the value of the loyalLevelCode property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLoyalLevelCode() {
            return loyalLevelCode;
        }

        /**
         * Sets the value of the loyalLevelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLoyalLevelCode(Integer value) {
            this.loyalLevelCode = value;
        }

        /**
         * Gets the value of the singleVendorInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingleVendorInd() {
            return singleVendorInd;
        }

        /**
         * Sets the value of the singleVendorInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingleVendorInd(String value) {
            this.singleVendorInd = value;
        }

        /**
         * Gets the value of the signupDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSignupDate() {
            return signupDate;
        }

        /**
         * Sets the value of the signupDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSignupDate(XMLGregorianCalendar value) {
            this.signupDate = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the expireDateExclusiveIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExpireDateExclusiveIndicator() {
            return expireDateExclusiveIndicator;
        }

        /**
         * Sets the value of the expireDateExclusiveIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExpireDateExclusiveIndicator(Boolean value) {
            this.expireDateExclusiveIndicator = value;
        }

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the vendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVendorCode() {
            if (vendorCode == null) {
                vendorCode = new ArrayList<String>();
            }
            return this.vendorCode;
        }

        /**
         * Gets the value of the primaryLoyaltyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrimaryLoyaltyIndicator() {
            return primaryLoyaltyIndicator;
        }

        /**
         * Sets the value of the primaryLoyaltyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrimaryLoyaltyIndicator(Boolean value) {
            this.primaryLoyaltyIndicator = value;
        }

        /**
         * Gets the value of the allianceLoyaltyLevelName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllianceLoyaltyLevelName() {
            return allianceLoyaltyLevelName;
        }

        /**
         * Sets the value of the allianceLoyaltyLevelName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllianceLoyaltyLevelName(String value) {
            this.allianceLoyaltyLevelName = value;
        }

        /**
         * Gets the value of the customerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerType() {
            return customerType;
        }

        /**
         * Sets the value of the customerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerType(String value) {
            this.customerType = value;
        }

        /**
         * Gets the value of the customerValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerValue() {
            return customerValue;
        }

        /**
         * Sets the value of the customerValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerValue(String value) {
            this.customerValue = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseDiningGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedDining {

        @XmlAttribute(name = "SmokingCode")
        protected String smokingCode;
        @XmlAttribute(name = "DiningRoom")
        protected String diningRoom;
        @XmlAttribute(name = "TableSize")
        protected String tableSize;
        @XmlAttribute(name = "AgeCode")
        protected String ageCode;
        @XmlAttribute(name = "Language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlAttribute(name = "Sitting", required = true)
        protected String sitting;
        @XmlAttribute(name = "Status")
        protected String status;
        @XmlAttribute(name = "Preference")
        protected PreferLevelType preference;

        /**
         * Gets the value of the smokingCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSmokingCode() {
            return smokingCode;
        }

        /**
         * Sets the value of the smokingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSmokingCode(String value) {
            this.smokingCode = value;
        }

        /**
         * Gets the value of the diningRoom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiningRoom() {
            return diningRoom;
        }

        /**
         * Sets the value of the diningRoom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiningRoom(String value) {
            this.diningRoom = value;
        }

        /**
         * Gets the value of the tableSize property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTableSize() {
            return tableSize;
        }

        /**
         * Sets the value of the tableSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTableSize(String value) {
            this.tableSize = value;
        }

        /**
         * Gets the value of the ageCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeCode() {
            return ageCode;
        }

        /**
         * Sets the value of the ageCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeCode(String value) {
            this.ageCode = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Gets the value of the sitting property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSitting() {
            return sitting;
        }

        /**
         * Sets the value of the sitting property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSitting(String value) {
            this.sitting = value;
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
         * Gets the value of the preference property.
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreference() {
            return preference;
        }

        /**
         * Sets the value of the preference property.
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreference(PreferLevelType value) {
            this.preference = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedFareCode {

        @XmlAttribute(name = "FareCode")
        protected String fareCode;
        @XmlAttribute(name = "GroupCode")
        protected String groupCode;

        /**
         * Gets the value of the fareCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareCode() {
            return fareCode;
        }

        /**
         * Sets the value of the fareCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareCode(String value) {
            this.fareCode = value;
        }

        /**
         * Gets the value of the groupCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupCode() {
            return groupCode;
        }

        /**
         * Sets the value of the groupCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupCode(String value) {
            this.groupCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseInsuranceGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SelectedInsurance {

        @XmlAttribute(name = "InsuranceCode")
        protected String insuranceCode;
        @XmlAttribute(name = "SelectedOptionIndicator")
        protected Boolean selectedOptionIndicator;
        @XmlAttribute(name = "DefaultIndicator")
        protected Boolean defaultIndicator;
        @XmlAttribute(name = "Status")
        protected String status;

        /**
         * Gets the value of the insuranceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsuranceCode() {
            return insuranceCode;
        }

        /**
         * Sets the value of the insuranceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsuranceCode(String value) {
            this.insuranceCode = value;
        }

        /**
         * Gets the value of the selectedOptionIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSelectedOptionIndicator() {
            return selectedOptionIndicator;
        }

        /**
         * Sets the value of the selectedOptionIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSelectedOptionIndicator(Boolean value) {
            this.selectedOptionIndicator = value;
        }

        /**
         * Gets the value of the defaultIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefaultIndicator() {
            return defaultIndicator;
        }

        /**
         * Sets the value of the defaultIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefaultIndicator(Boolean value) {
            this.defaultIndicator = value;
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
     *         &lt;element name="SelectedPackage" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CruisePackageType">
     *                 &lt;sequence>
     *                   &lt;element name="AirInfo" type="{http://www.opentravel.org/OTA/2003/05}AirInfoType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "selectedPackage"
    })
    public static class SelectedPackages {

        @XmlElement(name = "SelectedPackage")
        protected List<CruiseGuestDetailType.SelectedPackages.SelectedPackage> selectedPackage;

        /**
         * Gets the value of the selectedPackage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedPackage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedPackage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CruiseGuestDetailType.SelectedPackages.SelectedPackage }
         * 
         * 
         */
        public List<CruiseGuestDetailType.SelectedPackages.SelectedPackage> getSelectedPackage() {
            if (selectedPackage == null) {
                selectedPackage = new ArrayList<CruiseGuestDetailType.SelectedPackages.SelectedPackage>();
            }
            return this.selectedPackage;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CruisePackageType">
         *       &lt;sequence>
         *         &lt;element name="AirInfo" type="{http://www.opentravel.org/OTA/2003/05}AirInfoType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "airInfo"
        })
        public static class SelectedPackage
            extends CruisePackageType
        {

            @XmlElement(name = "AirInfo")
            protected AirInfoType airInfo;

            /**
             * Gets the value of the airInfo property.
             * 
             * @return
             *     possible object is
             *     {@link AirInfoType }
             *     
             */
            public AirInfoType getAirInfo() {
                return airInfo;
            }

            /**
             * Sets the value of the airInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirInfoType }
             *     
             */
            public void setAirInfo(AirInfoType value) {
                this.airInfo = value;
            }

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
     *         &lt;element name="SelectedSpecialService" type="{http://www.opentravel.org/OTA/2003/05}SpecialServiceType" maxOccurs="10" minOccurs="0"/>
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
        "selectedSpecialService"
    })
    public static class SelectedSpecialServices {

        @XmlElement(name = "SelectedSpecialService")
        protected List<SpecialServiceType> selectedSpecialService;

        /**
         * Gets the value of the selectedSpecialService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedSpecialService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedSpecialService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialServiceType }
         * 
         * 
         */
        public List<SpecialServiceType> getSelectedSpecialService() {
            if (selectedSpecialService == null) {
                selectedSpecialService = new ArrayList<SpecialServiceType>();
            }
            return this.selectedSpecialService;
        }

    }

}
