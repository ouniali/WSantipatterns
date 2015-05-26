
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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryItemResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryItemResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Accommodation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identity" type="{http://www.opentravel.org/OTA/2003/05}PropertyIdentityType" minOccurs="0"/>
 *                   &lt;element name="AccommodationClass" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AccommodationClassGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType"/>
 *                   &lt;element name="RoomProfiles" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RoomProfile" maxOccurs="9">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomProfileType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Prices" maxOccurs="9" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Price" maxOccurs="9">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="SupplementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="MealPlanRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MealPlans" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MealPlan" type="{http://www.opentravel.org/OTA/2003/05}MealPlanType" maxOccurs="9"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DestinationLevelGroup"/>
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="ResortName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="ResortCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Flight" type="{http://www.opentravel.org/OTA/2003/05}PkgFlightSegmentType"/>
 *         &lt;element name="RentalCar">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType">
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PackageItemPositionGroup"/>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryItemResponseType", propOrder = {
    "accommodation",
    "flight",
    "rentalCar"
})
public class ItineraryItemResponseType {

    @XmlElement(name = "Accommodation")
    protected ItineraryItemResponseType.Accommodation accommodation;
    @XmlElement(name = "Flight")
    protected PkgFlightSegmentType flight;
    @XmlElement(name = "RentalCar")
    protected ItineraryItemResponseType.RentalCar rentalCar;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "ItinerarySequence")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger itinerarySequence;
    @XmlAttribute(name = "ChronologicalSequence")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger chronologicalSequence;

    /**
     * Gets the value of the accommodation property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryItemResponseType.Accommodation }
     *     
     */
    public ItineraryItemResponseType.Accommodation getAccommodation() {
        return accommodation;
    }

    /**
     * Sets the value of the accommodation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryItemResponseType.Accommodation }
     *     
     */
    public void setAccommodation(ItineraryItemResponseType.Accommodation value) {
        this.accommodation = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link PkgFlightSegmentType }
     *     
     */
    public PkgFlightSegmentType getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PkgFlightSegmentType }
     *     
     */
    public void setFlight(PkgFlightSegmentType value) {
        this.flight = value;
    }

    /**
     * Gets the value of the rentalCar property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryItemResponseType.RentalCar }
     *     
     */
    public ItineraryItemResponseType.RentalCar getRentalCar() {
        return rentalCar;
    }

    /**
     * Sets the value of the rentalCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryItemResponseType.RentalCar }
     *     
     */
    public void setRentalCar(ItineraryItemResponseType.RentalCar value) {
        this.rentalCar = value;
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
     * Gets the value of the itinerarySequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItinerarySequence() {
        return itinerarySequence;
    }

    /**
     * Sets the value of the itinerarySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItinerarySequence(BigInteger value) {
        this.itinerarySequence = value;
    }

    /**
     * Gets the value of the chronologicalSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChronologicalSequence() {
        return chronologicalSequence;
    }

    /**
     * Sets the value of the chronologicalSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChronologicalSequence(BigInteger value) {
        this.chronologicalSequence = value;
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
     *         &lt;element name="Identity" type="{http://www.opentravel.org/OTA/2003/05}PropertyIdentityType" minOccurs="0"/>
     *         &lt;element name="AccommodationClass" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AccommodationClassGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DateRange" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType"/>
     *         &lt;element name="RoomProfiles" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RoomProfile" maxOccurs="9">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomProfileType">
     *                           &lt;sequence>
     *                             &lt;element name="Prices" maxOccurs="9" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Price" maxOccurs="9">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="SupplementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="MealPlanRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="MealPlans" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MealPlan" type="{http://www.opentravel.org/OTA/2003/05}MealPlanType" maxOccurs="9"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DestinationLevelGroup"/>
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="ResortName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="ResortCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "identity",
        "accommodationClass",
        "dateRange",
        "roomProfiles",
        "mealPlans"
    })
    public static class Accommodation {

        @XmlElement(name = "Identity")
        protected PropertyIdentityType identity;
        @XmlElement(name = "AccommodationClass")
        protected ItineraryItemResponseType.Accommodation.AccommodationClass accommodationClass;
        @XmlElement(name = "DateRange", required = true)
        protected DateTimeSpanType dateRange;
        @XmlElement(name = "RoomProfiles")
        protected ItineraryItemResponseType.Accommodation.RoomProfiles roomProfiles;
        @XmlElement(name = "MealPlans")
        protected ItineraryItemResponseType.Accommodation.MealPlans mealPlans;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "ResortName")
        protected String resortName;
        @XmlAttribute(name = "ResortCode")
        protected String resortCode;
        @XmlAttribute(name = "DestinationCode")
        protected String destinationCode;
        @XmlAttribute(name = "DestinationLevel")
        protected DestinationLevelType destinationLevel;
        @XmlAttribute(name = "DestinationName")
        protected String destinationName;

        /**
         * Gets the value of the identity property.
         * 
         * @return
         *     possible object is
         *     {@link PropertyIdentityType }
         *     
         */
        public PropertyIdentityType getIdentity() {
            return identity;
        }

        /**
         * Sets the value of the identity property.
         * 
         * @param value
         *     allowed object is
         *     {@link PropertyIdentityType }
         *     
         */
        public void setIdentity(PropertyIdentityType value) {
            this.identity = value;
        }

        /**
         * Gets the value of the accommodationClass property.
         * 
         * @return
         *     possible object is
         *     {@link ItineraryItemResponseType.Accommodation.AccommodationClass }
         *     
         */
        public ItineraryItemResponseType.Accommodation.AccommodationClass getAccommodationClass() {
            return accommodationClass;
        }

        /**
         * Sets the value of the accommodationClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItineraryItemResponseType.Accommodation.AccommodationClass }
         *     
         */
        public void setAccommodationClass(ItineraryItemResponseType.Accommodation.AccommodationClass value) {
            this.accommodationClass = value;
        }

        /**
         * Gets the value of the dateRange property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimeSpanType }
         *     
         */
        public DateTimeSpanType getDateRange() {
            return dateRange;
        }

        /**
         * Sets the value of the dateRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeSpanType }
         *     
         */
        public void setDateRange(DateTimeSpanType value) {
            this.dateRange = value;
        }

        /**
         * Gets the value of the roomProfiles property.
         * 
         * @return
         *     possible object is
         *     {@link ItineraryItemResponseType.Accommodation.RoomProfiles }
         *     
         */
        public ItineraryItemResponseType.Accommodation.RoomProfiles getRoomProfiles() {
            return roomProfiles;
        }

        /**
         * Sets the value of the roomProfiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItineraryItemResponseType.Accommodation.RoomProfiles }
         *     
         */
        public void setRoomProfiles(ItineraryItemResponseType.Accommodation.RoomProfiles value) {
            this.roomProfiles = value;
        }

        /**
         * Gets the value of the mealPlans property.
         * 
         * @return
         *     possible object is
         *     {@link ItineraryItemResponseType.Accommodation.MealPlans }
         *     
         */
        public ItineraryItemResponseType.Accommodation.MealPlans getMealPlans() {
            return mealPlans;
        }

        /**
         * Sets the value of the mealPlans property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItineraryItemResponseType.Accommodation.MealPlans }
         *     
         */
        public void setMealPlans(ItineraryItemResponseType.Accommodation.MealPlans value) {
            this.mealPlans = value;
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
         * Gets the value of the resortName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResortName() {
            return resortName;
        }

        /**
         * Sets the value of the resortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResortName(String value) {
            this.resortName = value;
        }

        /**
         * Gets the value of the resortCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResortCode() {
            return resortCode;
        }

        /**
         * Sets the value of the resortCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResortCode(String value) {
            this.resortCode = value;
        }

        /**
         * Gets the value of the destinationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationCode() {
            return destinationCode;
        }

        /**
         * Sets the value of the destinationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationCode(String value) {
            this.destinationCode = value;
        }

        /**
         * Gets the value of the destinationLevel property.
         * 
         * @return
         *     possible object is
         *     {@link DestinationLevelType }
         *     
         */
        public DestinationLevelType getDestinationLevel() {
            return destinationLevel;
        }

        /**
         * Sets the value of the destinationLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link DestinationLevelType }
         *     
         */
        public void setDestinationLevel(DestinationLevelType value) {
            this.destinationLevel = value;
        }

        /**
         * Gets the value of the destinationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationName() {
            return destinationName;
        }

        /**
         * Sets the value of the destinationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationName(String value) {
            this.destinationName = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AccommodationClassGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AccommodationClass {

            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "NationalCode")
            protected String nationalCode;
            @XmlAttribute(name = "OfficialName")
            protected String officialName;

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
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the nationalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNationalCode() {
                return nationalCode;
            }

            /**
             * Sets the value of the nationalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNationalCode(String value) {
                this.nationalCode = value;
            }

            /**
             * Gets the value of the officialName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOfficialName() {
                return officialName;
            }

            /**
             * Sets the value of the officialName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOfficialName(String value) {
                this.officialName = value;
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
         *         &lt;element name="MealPlan" type="{http://www.opentravel.org/OTA/2003/05}MealPlanType" maxOccurs="9"/>
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
            "mealPlan"
        })
        public static class MealPlans {

            @XmlElement(name = "MealPlan", required = true)
            protected List<MealPlanType> mealPlan;

            /**
             * Gets the value of the mealPlan property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mealPlan property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMealPlan().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MealPlanType }
             * 
             * 
             */
            public List<MealPlanType> getMealPlan() {
                if (mealPlan == null) {
                    mealPlan = new ArrayList<MealPlanType>();
                }
                return this.mealPlan;
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
         *         &lt;element name="RoomProfile" maxOccurs="9">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomProfileType">
         *                 &lt;sequence>
         *                   &lt;element name="Prices" maxOccurs="9" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Price" maxOccurs="9">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="SupplementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="MealPlanRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            "roomProfile"
        })
        public static class RoomProfiles {

            @XmlElement(name = "RoomProfile", required = true)
            protected List<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile> roomProfile;

            /**
             * Gets the value of the roomProfile property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the roomProfile property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoomProfile().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile }
             * 
             * 
             */
            public List<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile> getRoomProfile() {
                if (roomProfile == null) {
                    roomProfile = new ArrayList<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile>();
                }
                return this.roomProfile;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomProfileType">
             *       &lt;sequence>
             *         &lt;element name="Prices" maxOccurs="9" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Price" maxOccurs="9">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="SupplementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="MealPlanRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "prices"
            })
            public static class RoomProfile
                extends RoomProfileType
            {

                @XmlElement(name = "Prices")
                protected List<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices> prices;

                /**
                 * Gets the value of the prices property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the prices property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPrices().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices }
                 * 
                 * 
                 */
                public List<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices> getPrices() {
                    if (prices == null) {
                        prices = new ArrayList<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices>();
                    }
                    return this.prices;
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
                 *         &lt;element name="Price" maxOccurs="9">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="SupplementIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="MealPlanRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "price"
                })
                public static class Prices {

                    @XmlElement(name = "Price", required = true)
                    protected List<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price> price;
                    @XmlAttribute(name = "SupplementIndicator")
                    protected Boolean supplementIndicator;
                    @XmlAttribute(name = "MealPlanRPH")
                    protected String mealPlanRPH;

                    /**
                     * Gets the value of the price property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the price property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPrice().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price }
                     * 
                     * 
                     */
                    public List<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price> getPrice() {
                        if (price == null) {
                            price = new ArrayList<ItineraryItemResponseType.Accommodation.RoomProfiles.RoomProfile.Prices.Price>();
                        }
                        return this.price;
                    }

                    /**
                     * Gets the value of the supplementIndicator property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isSupplementIndicator() {
                        return supplementIndicator;
                    }

                    /**
                     * Sets the value of the supplementIndicator property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setSupplementIndicator(Boolean value) {
                        this.supplementIndicator = value;
                    }

                    /**
                     * Gets the value of the mealPlanRPH property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMealPlanRPH() {
                        return mealPlanRPH;
                    }

                    /**
                     * Sets the value of the mealPlanRPH property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMealPlanRPH(String value) {
                        this.mealPlanRPH = value;
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
                     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Price {

                        @XmlAttribute(name = "AgeQualifyingCode")
                        protected String ageQualifyingCode;
                        @XmlAttribute(name = "Age")
                        protected Integer age;
                        @XmlAttribute(name = "Count")
                        protected Integer count;
                        @XmlAttribute(name = "PriceQualifier")
                        protected Integer priceQualifier;
                        @XmlAttribute(name = "PriceBasis")
                        protected PricingType priceBasis;
                        @XmlAttribute(name = "Amount")
                        protected BigDecimal amount;
                        @XmlAttribute(name = "CurrencyCode")
                        protected String currencyCode;
                        @XmlAttribute(name = "DecimalPlaces")
                        @XmlSchemaType(name = "nonNegativeInteger")
                        protected BigInteger decimalPlaces;

                        /**
                         * Gets the value of the ageQualifyingCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAgeQualifyingCode() {
                            return ageQualifyingCode;
                        }

                        /**
                         * Sets the value of the ageQualifyingCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAgeQualifyingCode(String value) {
                            this.ageQualifyingCode = value;
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
                         * Gets the value of the count property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getCount() {
                            return count;
                        }

                        /**
                         * Sets the value of the count property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setCount(Integer value) {
                            this.count = value;
                        }

                        /**
                         * Gets the value of the priceQualifier property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getPriceQualifier() {
                            return priceQualifier;
                        }

                        /**
                         * Sets the value of the priceQualifier property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setPriceQualifier(Integer value) {
                            this.priceQualifier = value;
                        }

                        /**
                         * Gets the value of the priceBasis property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link PricingType }
                         *     
                         */
                        public PricingType getPriceBasis() {
                            return priceBasis;
                        }

                        /**
                         * Sets the value of the priceBasis property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PricingType }
                         *     
                         */
                        public void setPriceBasis(PricingType value) {
                            this.priceBasis = value;
                        }

                        /**
                         * Gets the value of the amount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getAmount() {
                            return amount;
                        }

                        /**
                         * Sets the value of the amount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setAmount(BigDecimal value) {
                            this.amount = value;
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

                }

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType">
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RentalCar
        extends VehicleRentalCoreType
    {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Code")
        protected String code;

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
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

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
