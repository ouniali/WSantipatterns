
package org.opentravel.ota._2003._05;

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
 * <p>Java class for GuestRoomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestRoomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Quantities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaximumAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MinBillableGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Occupancy" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OccupancyGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AgeQualifyingGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Room" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RoomGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Amenities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Amenity" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="AmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoomLevelFees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeesType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalGuestAmount" type="{http://www.opentravel.org/OTA/2003/05}AdditionalGuestAmountType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRoomType", propOrder = {
    "quantities",
    "occupancy",
    "room",
    "amenities",
    "roomLevelFees",
    "additionalGuestAmount",
    "description"
})
public class GuestRoomType {

    @XmlElement(name = "Quantities")
    protected GuestRoomType.Quantities quantities;
    @XmlElement(name = "Occupancy")
    protected List<GuestRoomType.Occupancy> occupancy;
    @XmlElement(name = "Room")
    protected GuestRoomType.Room room;
    @XmlElement(name = "Amenities")
    protected GuestRoomType.Amenities amenities;
    @XmlElement(name = "RoomLevelFees")
    protected GuestRoomType.RoomLevelFees roomLevelFees;
    @XmlElement(name = "AdditionalGuestAmount")
    protected List<AdditionalGuestAmountType> additionalGuestAmount;
    @XmlElement(name = "Description")
    protected ParagraphType description;

    /**
     * Gets the value of the quantities property.
     * 
     * @return
     *     possible object is
     *     {@link GuestRoomType.Quantities }
     *     
     */
    public GuestRoomType.Quantities getQuantities() {
        return quantities;
    }

    /**
     * Sets the value of the quantities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRoomType.Quantities }
     *     
     */
    public void setQuantities(GuestRoomType.Quantities value) {
        this.quantities = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestRoomType.Occupancy }
     * 
     * 
     */
    public List<GuestRoomType.Occupancy> getOccupancy() {
        if (occupancy == null) {
            occupancy = new ArrayList<GuestRoomType.Occupancy>();
        }
        return this.occupancy;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link GuestRoomType.Room }
     *     
     */
    public GuestRoomType.Room getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRoomType.Room }
     *     
     */
    public void setRoom(GuestRoomType.Room value) {
        this.room = value;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link GuestRoomType.Amenities }
     *     
     */
    public GuestRoomType.Amenities getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRoomType.Amenities }
     *     
     */
    public void setAmenities(GuestRoomType.Amenities value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the roomLevelFees property.
     * 
     * @return
     *     possible object is
     *     {@link GuestRoomType.RoomLevelFees }
     *     
     */
    public GuestRoomType.RoomLevelFees getRoomLevelFees() {
        return roomLevelFees;
    }

    /**
     * Sets the value of the roomLevelFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestRoomType.RoomLevelFees }
     *     
     */
    public void setRoomLevelFees(GuestRoomType.RoomLevelFees value) {
        this.roomLevelFees = value;
    }

    /**
     * Gets the value of the additionalGuestAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalGuestAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalGuestAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalGuestAmountType }
     * 
     * 
     */
    public List<AdditionalGuestAmountType> getAdditionalGuestAmount() {
        if (additionalGuestAmount == null) {
            additionalGuestAmount = new ArrayList<AdditionalGuestAmountType>();
        }
        return this.additionalGuestAmount;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link ParagraphType }
     *     
     */
    public ParagraphType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParagraphType }
     *     
     */
    public void setDescription(ParagraphType value) {
        this.description = value;
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
     *         &lt;element name="Amenity" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="AmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *               &lt;/restriction>
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
        "amenity"
    })
    public static class Amenities {

        @XmlElement(name = "Amenity", required = true)
        protected List<GuestRoomType.Amenities.Amenity> amenity;

        /**
         * Gets the value of the amenity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amenity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmenity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GuestRoomType.Amenities.Amenity }
         * 
         * 
         */
        public List<GuestRoomType.Amenities.Amenity> getAmenity() {
            if (amenity == null) {
                amenity = new ArrayList<GuestRoomType.Amenities.Amenity>();
            }
            return this.amenity;
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
         *       &lt;attribute name="AmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Amenity {

            @XmlAttribute(name = "AmenityCode")
            protected String amenityCode;

            /**
             * Gets the value of the amenityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmenityCode() {
                return amenityCode;
            }

            /**
             * Sets the value of the amenityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmenityCode(String value) {
                this.amenityCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OccupancyGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AgeQualifyingGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Occupancy {

        @XmlAttribute(name = "MinOccupancy")
        protected Integer minOccupancy;
        @XmlAttribute(name = "MaxOccupancy")
        protected Integer maxOccupancy;
        @XmlAttribute(name = "AgeQualifyingCode")
        protected String ageQualifyingCode;
        @XmlAttribute(name = "MinAge")
        protected Integer minAge;
        @XmlAttribute(name = "MaxAge")
        protected Integer maxAge;
        @XmlAttribute(name = "AgeTimeUnit")
        protected TimeUnitType ageTimeUnit;

        /**
         * Gets the value of the minOccupancy property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMinOccupancy() {
            return minOccupancy;
        }

        /**
         * Sets the value of the minOccupancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMinOccupancy(Integer value) {
            this.minOccupancy = value;
        }

        /**
         * Gets the value of the maxOccupancy property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMaxOccupancy() {
            return maxOccupancy;
        }

        /**
         * Sets the value of the maxOccupancy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMaxOccupancy(Integer value) {
            this.maxOccupancy = value;
        }

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
         * Gets the value of the minAge property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMinAge() {
            return minAge;
        }

        /**
         * Sets the value of the minAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMinAge(Integer value) {
            this.minAge = value;
        }

        /**
         * Gets the value of the maxAge property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMaxAge() {
            return maxAge;
        }

        /**
         * Sets the value of the maxAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMaxAge(Integer value) {
            this.maxAge = value;
        }

        /**
         * Gets the value of the ageTimeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link TimeUnitType }
         *     
         */
        public TimeUnitType getAgeTimeUnit() {
            return ageTimeUnit;
        }

        /**
         * Sets the value of the ageTimeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeUnitType }
         *     
         */
        public void setAgeTimeUnit(TimeUnitType value) {
            this.ageTimeUnit = value;
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
     *       &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaximumAdditionalGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MinBillableGuests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Quantities {

        @XmlAttribute(name = "MaxRollaways")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxRollaways;
        @XmlAttribute(name = "StandardNumBeds")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger standardNumBeds;
        @XmlAttribute(name = "MaximumAdditionalGuests")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maximumAdditionalGuests;
        @XmlAttribute(name = "MinBillableGuests")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minBillableGuests;

        /**
         * Gets the value of the maxRollaways property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxRollaways() {
            return maxRollaways;
        }

        /**
         * Sets the value of the maxRollaways property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxRollaways(BigInteger value) {
            this.maxRollaways = value;
        }

        /**
         * Gets the value of the standardNumBeds property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStandardNumBeds() {
            return standardNumBeds;
        }

        /**
         * Sets the value of the standardNumBeds property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStandardNumBeds(BigInteger value) {
            this.standardNumBeds = value;
        }

        /**
         * Gets the value of the maximumAdditionalGuests property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumAdditionalGuests() {
            return maximumAdditionalGuests;
        }

        /**
         * Sets the value of the maximumAdditionalGuests property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumAdditionalGuests(BigInteger value) {
            this.maximumAdditionalGuests = value;
        }

        /**
         * Gets the value of the minBillableGuests property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinBillableGuests() {
            return minBillableGuests;
        }

        /**
         * Sets the value of the minBillableGuests property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinBillableGuests(BigInteger value) {
            this.minBillableGuests = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RoomGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Room {

        @XmlAttribute(name = "RoomType")
        protected String roomType;
        @XmlAttribute(name = "RoomTypeCode")
        protected String roomTypeCode;
        @XmlAttribute(name = "RoomCategory")
        protected String roomCategory;
        @XmlAttribute(name = "RoomID")
        protected String roomID;
        @XmlAttribute(name = "Floor")
        protected Integer floor;
        @XmlAttribute(name = "InvBlockCode")
        protected String invBlockCode;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "PromotionVendorCode")
        protected List<String> promotionVendorCode;
        @XmlAttribute(name = "RoomLocationCode")
        protected String roomLocationCode;
        @XmlAttribute(name = "RoomViewCode")
        protected String roomViewCode;
        @XmlAttribute(name = "BedTypeCode")
        protected List<String> bedTypeCode;
        @XmlAttribute(name = "NonSmoking")
        protected Boolean nonSmoking;
        @XmlAttribute(name = "Configuration")
        protected String configuration;
        @XmlAttribute(name = "SizeMeasurement")
        protected String sizeMeasurement;
        @XmlAttribute(name = "Quantity")
        protected Integer quantity;
        @XmlAttribute(name = "Composite")
        protected Boolean composite;
        @XmlAttribute(name = "RoomClassificationCode")
        protected String roomClassificationCode;
        @XmlAttribute(name = "RoomArchitectureCode")
        protected String roomArchitectureCode;

        /**
         * Gets the value of the roomType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomType() {
            return roomType;
        }

        /**
         * Sets the value of the roomType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomType(String value) {
            this.roomType = value;
        }

        /**
         * Gets the value of the roomTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomTypeCode() {
            return roomTypeCode;
        }

        /**
         * Sets the value of the roomTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomTypeCode(String value) {
            this.roomTypeCode = value;
        }

        /**
         * Gets the value of the roomCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomCategory() {
            return roomCategory;
        }

        /**
         * Sets the value of the roomCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomCategory(String value) {
            this.roomCategory = value;
        }

        /**
         * Gets the value of the roomID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomID() {
            return roomID;
        }

        /**
         * Sets the value of the roomID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomID(String value) {
            this.roomID = value;
        }

        /**
         * Gets the value of the floor property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFloor() {
            return floor;
        }

        /**
         * Sets the value of the floor property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFloor(Integer value) {
            this.floor = value;
        }

        /**
         * Gets the value of the invBlockCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvBlockCode() {
            return invBlockCode;
        }

        /**
         * Sets the value of the invBlockCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInvBlockCode(String value) {
            this.invBlockCode = value;
        }

        /**
         * Gets the value of the promotionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotionCode() {
            return promotionCode;
        }

        /**
         * Sets the value of the promotionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotionCode(String value) {
            this.promotionCode = value;
        }

        /**
         * Gets the value of the promotionVendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotionVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPromotionVendorCode() {
            if (promotionVendorCode == null) {
                promotionVendorCode = new ArrayList<String>();
            }
            return this.promotionVendorCode;
        }

        /**
         * Gets the value of the roomLocationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomLocationCode() {
            return roomLocationCode;
        }

        /**
         * Sets the value of the roomLocationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomLocationCode(String value) {
            this.roomLocationCode = value;
        }

        /**
         * Gets the value of the roomViewCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomViewCode() {
            return roomViewCode;
        }

        /**
         * Sets the value of the roomViewCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomViewCode(String value) {
            this.roomViewCode = value;
        }

        /**
         * Gets the value of the bedTypeCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bedTypeCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBedTypeCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBedTypeCode() {
            if (bedTypeCode == null) {
                bedTypeCode = new ArrayList<String>();
            }
            return this.bedTypeCode;
        }

        /**
         * Gets the value of the nonSmoking property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonSmoking() {
            return nonSmoking;
        }

        /**
         * Sets the value of the nonSmoking property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonSmoking(Boolean value) {
            this.nonSmoking = value;
        }

        /**
         * Gets the value of the configuration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfiguration() {
            return configuration;
        }

        /**
         * Sets the value of the configuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfiguration(String value) {
            this.configuration = value;
        }

        /**
         * Gets the value of the sizeMeasurement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSizeMeasurement() {
            return sizeMeasurement;
        }

        /**
         * Sets the value of the sizeMeasurement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSizeMeasurement(String value) {
            this.sizeMeasurement = value;
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

        /**
         * Gets the value of the composite property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isComposite() {
            return composite;
        }

        /**
         * Sets the value of the composite property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setComposite(Boolean value) {
            this.composite = value;
        }

        /**
         * Gets the value of the roomClassificationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomClassificationCode() {
            return roomClassificationCode;
        }

        /**
         * Sets the value of the roomClassificationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomClassificationCode(String value) {
            this.roomClassificationCode = value;
        }

        /**
         * Gets the value of the roomArchitectureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomArchitectureCode() {
            return roomArchitectureCode;
        }

        /**
         * Sets the value of the roomArchitectureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomArchitectureCode(String value) {
            this.roomArchitectureCode = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FeesType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RoomLevelFees
        extends FeesType
    {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;

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
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        /**
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

    }

}
