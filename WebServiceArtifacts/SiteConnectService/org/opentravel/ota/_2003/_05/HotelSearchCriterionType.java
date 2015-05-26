
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelSearchCriterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelSearchCriterionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ItemSearchCriterionType">
 *       &lt;sequence>
 *         &lt;element name="HotelAmenity" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="ComplimentaryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoomAmenity" type="{http://www.opentravel.org/OTA/2003/05}RoomAmenityPrefType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="HotelFeature" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="SecurityFeatureCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="AccessibilityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Award" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Recreation" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Service" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="BusinessServiceCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="ServiceInventoryCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="Quantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Transportation" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StayDateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="RateRange" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateRangeGroup"/>
 *                 &lt;attribute name="RoomStayCandidateRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="RateMode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}RatePlanCandidatesType" minOccurs="0"/>
 *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType" minOccurs="0"/>
 *         &lt;element name="RoomStayCandidates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomStayCandidate" type="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AcceptedPayments" type="{http://www.opentravel.org/OTA/2003/05}AcceptedPaymentsType" minOccurs="0"/>
 *         &lt;element name="Media" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ContentCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelMeetingFacility" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MeetingRoomCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="LargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="LargestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="UnitOfMeasureCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MealPlan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelSearchCriterionType", propOrder = {
    "hotelAmenity",
    "roomAmenity",
    "hotelFeature",
    "award",
    "recreation",
    "service",
    "transportation",
    "stayDateRange",
    "rateRange",
    "ratePlanCandidates",
    "profiles",
    "roomStayCandidates",
    "acceptedPayments",
    "media",
    "hotelMeetingFacility",
    "mealPlan",
    "tpaExtensions"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.HotelSearchCriteriaType.Criterion.class
})
public class HotelSearchCriterionType
    extends ItemSearchCriterionType
{

    @XmlElement(name = "HotelAmenity")
    protected List<HotelSearchCriterionType.HotelAmenity> hotelAmenity;
    @XmlElement(name = "RoomAmenity")
    protected List<RoomAmenityPrefType> roomAmenity;
    @XmlElement(name = "HotelFeature")
    protected List<HotelSearchCriterionType.HotelFeature> hotelFeature;
    @XmlElement(name = "Award")
    protected List<HotelSearchCriterionType.Award> award;
    @XmlElement(name = "Recreation")
    protected List<HotelSearchCriterionType.Recreation> recreation;
    @XmlElement(name = "Service")
    protected List<HotelSearchCriterionType.Service> service;
    @XmlElement(name = "Transportation")
    protected List<HotelSearchCriterionType.Transportation> transportation;
    @XmlElement(name = "StayDateRange")
    protected DateTimeSpanType stayDateRange;
    @XmlElement(name = "RateRange")
    protected List<HotelSearchCriterionType.RateRange> rateRange;
    @XmlElement(name = "RatePlanCandidates")
    protected RatePlanCandidatesType ratePlanCandidates;
    @XmlElement(name = "Profiles")
    protected ProfilesType profiles;
    @XmlElement(name = "RoomStayCandidates")
    protected HotelSearchCriterionType.RoomStayCandidates roomStayCandidates;
    @XmlElement(name = "AcceptedPayments")
    protected AcceptedPaymentsType acceptedPayments;
    @XmlElement(name = "Media")
    protected List<HotelSearchCriterionType.Media> media;
    @XmlElement(name = "HotelMeetingFacility")
    protected HotelSearchCriterionType.HotelMeetingFacility hotelMeetingFacility;
    @XmlElement(name = "MealPlan")
    protected HotelSearchCriterionType.MealPlan mealPlan;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Gets the value of the hotelAmenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelAmenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelAmenity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.HotelAmenity }
     * 
     * 
     */
    public List<HotelSearchCriterionType.HotelAmenity> getHotelAmenity() {
        if (hotelAmenity == null) {
            hotelAmenity = new ArrayList<HotelSearchCriterionType.HotelAmenity>();
        }
        return this.hotelAmenity;
    }

    /**
     * Gets the value of the roomAmenity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomAmenity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomAmenity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomAmenityPrefType }
     * 
     * 
     */
    public List<RoomAmenityPrefType> getRoomAmenity() {
        if (roomAmenity == null) {
            roomAmenity = new ArrayList<RoomAmenityPrefType>();
        }
        return this.roomAmenity;
    }

    /**
     * Gets the value of the hotelFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.HotelFeature }
     * 
     * 
     */
    public List<HotelSearchCriterionType.HotelFeature> getHotelFeature() {
        if (hotelFeature == null) {
            hotelFeature = new ArrayList<HotelSearchCriterionType.HotelFeature>();
        }
        return this.hotelFeature;
    }

    /**
     * Gets the value of the award property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the award property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Award }
     * 
     * 
     */
    public List<HotelSearchCriterionType.Award> getAward() {
        if (award == null) {
            award = new ArrayList<HotelSearchCriterionType.Award>();
        }
        return this.award;
    }

    /**
     * Gets the value of the recreation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recreation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecreation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Recreation }
     * 
     * 
     */
    public List<HotelSearchCriterionType.Recreation> getRecreation() {
        if (recreation == null) {
            recreation = new ArrayList<HotelSearchCriterionType.Recreation>();
        }
        return this.recreation;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Service }
     * 
     * 
     */
    public List<HotelSearchCriterionType.Service> getService() {
        if (service == null) {
            service = new ArrayList<HotelSearchCriterionType.Service>();
        }
        return this.service;
    }

    /**
     * Gets the value of the transportation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Transportation }
     * 
     * 
     */
    public List<HotelSearchCriterionType.Transportation> getTransportation() {
        if (transportation == null) {
            transportation = new ArrayList<HotelSearchCriterionType.Transportation>();
        }
        return this.transportation;
    }

    /**
     * Gets the value of the stayDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getStayDateRange() {
        return stayDateRange;
    }

    /**
     * Sets the value of the stayDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setStayDateRange(DateTimeSpanType value) {
        this.stayDateRange = value;
    }

    /**
     * Gets the value of the rateRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.RateRange }
     * 
     * 
     */
    public List<HotelSearchCriterionType.RateRange> getRateRange() {
        if (rateRange == null) {
            rateRange = new ArrayList<HotelSearchCriterionType.RateRange>();
        }
        return this.rateRange;
    }

    /**
     * Gets the value of the ratePlanCandidates property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlanCandidatesType }
     *     
     */
    public RatePlanCandidatesType getRatePlanCandidates() {
        return ratePlanCandidates;
    }

    /**
     * Sets the value of the ratePlanCandidates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlanCandidatesType }
     *     
     */
    public void setRatePlanCandidates(RatePlanCandidatesType value) {
        this.ratePlanCandidates = value;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link ProfilesType }
     *     
     */
    public ProfilesType getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfilesType }
     *     
     */
    public void setProfiles(ProfilesType value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the roomStayCandidates property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchCriterionType.RoomStayCandidates }
     *     
     */
    public HotelSearchCriterionType.RoomStayCandidates getRoomStayCandidates() {
        return roomStayCandidates;
    }

    /**
     * Sets the value of the roomStayCandidates property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchCriterionType.RoomStayCandidates }
     *     
     */
    public void setRoomStayCandidates(HotelSearchCriterionType.RoomStayCandidates value) {
        this.roomStayCandidates = value;
    }

    /**
     * Gets the value of the acceptedPayments property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedPaymentsType }
     *     
     */
    public AcceptedPaymentsType getAcceptedPayments() {
        return acceptedPayments;
    }

    /**
     * Sets the value of the acceptedPayments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedPaymentsType }
     *     
     */
    public void setAcceptedPayments(AcceptedPaymentsType value) {
        this.acceptedPayments = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the media property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType.Media }
     * 
     * 
     */
    public List<HotelSearchCriterionType.Media> getMedia() {
        if (media == null) {
            media = new ArrayList<HotelSearchCriterionType.Media>();
        }
        return this.media;
    }

    /**
     * Gets the value of the hotelMeetingFacility property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchCriterionType.HotelMeetingFacility }
     *     
     */
    public HotelSearchCriterionType.HotelMeetingFacility getHotelMeetingFacility() {
        return hotelMeetingFacility;
    }

    /**
     * Sets the value of the hotelMeetingFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchCriterionType.HotelMeetingFacility }
     *     
     */
    public void setHotelMeetingFacility(HotelSearchCriterionType.HotelMeetingFacility value) {
        this.hotelMeetingFacility = value;
    }

    /**
     * Gets the value of the mealPlan property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSearchCriterionType.MealPlan }
     *     
     */
    public HotelSearchCriterionType.MealPlan getMealPlan() {
        return mealPlan;
    }

    /**
     * Sets the value of the mealPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSearchCriterionType.MealPlan }
     *     
     */
    public void setMealPlan(HotelSearchCriterionType.MealPlan value) {
        this.mealPlan = value;
    }

    /**
     * Gets the value of the tpaExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * Sets the value of the tpaExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
     *       &lt;attribute name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Rating" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Award {

        @XmlAttribute(name = "Provider")
        protected String provider;
        @XmlAttribute(name = "Rating")
        protected String rating;

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProvider() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProvider(String value) {
            this.provider = value;
        }

        /**
         * Gets the value of the rating property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRating() {
            return rating;
        }

        /**
         * Sets the value of the rating property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRating(String value) {
            this.rating = value;
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
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="ComplimentaryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelAmenity {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "ComplimentaryInd")
        protected Boolean complimentaryInd;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the complimentaryInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isComplimentaryInd() {
            return complimentaryInd;
        }

        /**
         * Sets the value of the complimentaryInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setComplimentaryInd(Boolean value) {
            this.complimentaryInd = value;
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
     *       &lt;attribute name="SecurityFeatureCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="AccessibilityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelFeature {

        @XmlAttribute(name = "SecurityFeatureCode")
        protected String securityFeatureCode;
        @XmlAttribute(name = "AccessibilityCode")
        protected String accessibilityCode;

        /**
         * Gets the value of the securityFeatureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecurityFeatureCode() {
            return securityFeatureCode;
        }

        /**
         * Sets the value of the securityFeatureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecurityFeatureCode(String value) {
            this.securityFeatureCode = value;
        }

        /**
         * Gets the value of the accessibilityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccessibilityCode() {
            return accessibilityCode;
        }

        /**
         * Sets the value of the accessibilityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccessibilityCode(String value) {
            this.accessibilityCode = value;
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
     *       &lt;attribute name="MeetingRoomCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="LargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="LargestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="UnitOfMeasureCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelMeetingFacility {

        @XmlAttribute(name = "MeetingRoomCount")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger meetingRoomCount;
        @XmlAttribute(name = "LargestSeatingCapacity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger largestSeatingCapacity;
        @XmlAttribute(name = "LargestRoomSpace")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger largestRoomSpace;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * Gets the value of the meetingRoomCount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMeetingRoomCount() {
            return meetingRoomCount;
        }

        /**
         * Sets the value of the meetingRoomCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMeetingRoomCount(BigInteger value) {
            this.meetingRoomCount = value;
        }

        /**
         * Gets the value of the largestSeatingCapacity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLargestSeatingCapacity() {
            return largestSeatingCapacity;
        }

        /**
         * Sets the value of the largestSeatingCapacity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLargestSeatingCapacity(BigInteger value) {
            this.largestSeatingCapacity = value;
        }

        /**
         * Gets the value of the largestRoomSpace property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLargestRoomSpace() {
            return largestRoomSpace;
        }

        /**
         * Sets the value of the largestRoomSpace property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLargestRoomSpace(BigInteger value) {
            this.largestRoomSpace = value;
        }

        /**
         * Gets the value of the unitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * Sets the value of the unitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
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
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MealPlan {

        @XmlAttribute(name = "Code")
        protected List<String> code;

        /**
         * Gets the value of the code property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the code property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCode() {
            if (code == null) {
                code = new ArrayList<String>();
            }
            return this.code;
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
     *       &lt;attribute name="ContentCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Media {

        @XmlAttribute(name = "ContentCode")
        protected String contentCode;

        /**
         * Gets the value of the contentCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContentCode() {
            return contentCode;
        }

        /**
         * Sets the value of the contentCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContentCode(String value) {
            this.contentCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateRangeGroup"/>
     *       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="RateMode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RateRange {

        @XmlAttribute(name = "RoomStayCandidateRPH")
        protected String roomStayCandidateRPH;
        @XmlAttribute(name = "RateMode")
        protected String rateMode;
        @XmlAttribute(name = "MinRate")
        protected BigDecimal minRate;
        @XmlAttribute(name = "MaxRate")
        protected BigDecimal maxRate;
        @XmlAttribute(name = "FixedRate")
        protected BigDecimal fixedRate;
        @XmlAttribute(name = "RateTimeUnit")
        protected TimeUnitType rateTimeUnit;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * Gets the value of the roomStayCandidateRPH property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomStayCandidateRPH() {
            return roomStayCandidateRPH;
        }

        /**
         * Sets the value of the roomStayCandidateRPH property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomStayCandidateRPH(String value) {
            this.roomStayCandidateRPH = value;
        }

        /**
         * Gets the value of the rateMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateMode() {
            return rateMode;
        }

        /**
         * Sets the value of the rateMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateMode(String value) {
            this.rateMode = value;
        }

        /**
         * Gets the value of the minRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMinRate() {
            return minRate;
        }

        /**
         * Sets the value of the minRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMinRate(BigDecimal value) {
            this.minRate = value;
        }

        /**
         * Gets the value of the maxRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxRate() {
            return maxRate;
        }

        /**
         * Sets the value of the maxRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxRate(BigDecimal value) {
            this.maxRate = value;
        }

        /**
         * Gets the value of the fixedRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFixedRate() {
            return fixedRate;
        }

        /**
         * Sets the value of the fixedRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFixedRate(BigDecimal value) {
            this.fixedRate = value;
        }

        /**
         * Gets the value of the rateTimeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getRateTimeUnit() {
            return rateTimeUnit;
        }

        /**
         * Sets the value of the rateTimeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setRateTimeUnit(TimeUnitType value) {
            this.rateTimeUnit = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the decimalPlaces property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDecimalPlaces() {
            return decimalPlaces;
        }

        /**
         * Sets the value of the decimalPlaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDecimalPlaces(BigInteger value) {
            this.decimalPlaces = value;
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
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Recreation {

        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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
     *         &lt;element name="RoomStayCandidate" type="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType" maxOccurs="unbounded"/>
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
        "roomStayCandidate"
    })
    public static class RoomStayCandidates {

        @XmlElement(name = "RoomStayCandidate", required = true)
        protected List<RoomStayCandidateType> roomStayCandidate;

        /**
         * Gets the value of the roomStayCandidate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomStayCandidate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomStayCandidate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomStayCandidateType }
         * 
         * 
         */
        public List<RoomStayCandidateType> getRoomStayCandidate() {
            if (roomStayCandidate == null) {
                roomStayCandidate = new ArrayList<RoomStayCandidateType>();
            }
            return this.roomStayCandidate;
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
     *       &lt;attribute name="BusinessServiceCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="ServiceInventoryCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="Quantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Service {

        @XmlAttribute(name = "BusinessServiceCode")
        protected String businessServiceCode;
        @XmlAttribute(name = "ServiceInventoryCode")
        protected String serviceInventoryCode;
        @XmlAttribute(name = "Quantity")
        protected Integer quantity;

        /**
         * Gets the value of the businessServiceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessServiceCode() {
            return businessServiceCode;
        }

        /**
         * Sets the value of the businessServiceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessServiceCode(String value) {
            this.businessServiceCode = value;
        }

        /**
         * Gets the value of the serviceInventoryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceInventoryCode() {
            return serviceInventoryCode;
        }

        /**
         * Sets the value of the serviceInventoryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceInventoryCode(String value) {
            this.serviceInventoryCode = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQuantity(Integer value) {
            this.quantity = value;
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
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Transportation {

        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

    }

}
