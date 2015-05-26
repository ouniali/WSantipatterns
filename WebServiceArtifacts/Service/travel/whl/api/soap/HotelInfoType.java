
package travel.whl.api.soap;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * General information of hotel: Unique ID, Name, Category, Type, Room Category, ...
 * 
 * <p>Java class for HotelInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="HotelShortName" type="{http://api.whl.travel/soap}StringLength1to64" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CategoryCodes" type="{http://api.whl.travel/soap}CategoryCodesType" minOccurs="0"/>
 *         &lt;element name="Descriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FullDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GettingThere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="GettingThereLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RoomIntroduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Disclosures" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FacilitiesDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BookingNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PhotoIntroduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Position" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://api.whl.travel/soap}PositionGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Service" type="{http://api.whl.travel/soap}ServiceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Languages" type="{http://api.whl.travel/soap}LanguagesType" minOccurs="0"/>
 *         &lt;element name="MinPrice" type="{http://api.whl.travel/soap}Money" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FacilityInfo" type="{http://api.whl.travel/soap}FacilityInfoType" minOccurs="0"/>
 *         &lt;element name="HostInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Introduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CaringForDestination" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FocusArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Commitment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Sustainability" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Verification" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://api.whl.travel/soap}StringLength1to16" />
 *       &lt;attribute name="Category" type="{http://api.whl.travel/soap}StringLength1to32" />
 *       &lt;attribute name="PriceRange" type="{http://api.whl.travel/soap}StringLength1to32" />
 *       &lt;attribute name="StarRating" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfoType", propOrder = {
    "hotelName",
    "categoryCodes",
    "descriptions",
    "position",
    "services",
    "languages",
    "minPrice",
    "image",
    "facilityInfo",
    "hostInfo",
    "caringForDestination"
})
public class HotelInfoType {

    @XmlElement(name = "HotelName")
    protected HotelInfoType.HotelName hotelName;
    @XmlElement(name = "CategoryCodes")
    protected CategoryCodesType categoryCodes;
    @XmlElement(name = "Descriptions")
    protected HotelInfoType.Descriptions descriptions;
    @XmlElement(name = "Position")
    protected HotelInfoType.Position position;
    @XmlElement(name = "Services")
    protected HotelInfoType.Services services;
    @XmlElement(name = "Languages")
    protected LanguagesType languages;
    @XmlElement(name = "MinPrice")
    protected BigDecimal minPrice;
    @XmlElement(name = "Image", required = true)
    protected String image;
    @XmlElement(name = "FacilityInfo")
    protected FacilityInfoType facilityInfo;
    @XmlElement(name = "HostInfo")
    protected HotelInfoType.HostInfo hostInfo;
    @XmlElement(name = "CaringForDestination")
    protected HotelInfoType.CaringForDestination caringForDestination;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "Category")
    protected String category;
    @XmlAttribute(name = "PriceRange")
    protected String priceRange;
    @XmlAttribute(name = "StarRating")
    protected BigDecimal starRating;

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.HotelName }
     *     
     */
    public HotelInfoType.HotelName getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.HotelName }
     *     
     */
    public void setHotelName(HotelInfoType.HotelName value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the categoryCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryCodesType }
     *     
     */
    public CategoryCodesType getCategoryCodes() {
        return categoryCodes;
    }

    /**
     * Sets the value of the categoryCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryCodesType }
     *     
     */
    public void setCategoryCodes(CategoryCodesType value) {
        this.categoryCodes = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.Descriptions }
     *     
     */
    public HotelInfoType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.Descriptions }
     *     
     */
    public void setDescriptions(HotelInfoType.Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.Position }
     *     
     */
    public HotelInfoType.Position getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.Position }
     *     
     */
    public void setPosition(HotelInfoType.Position value) {
        this.position = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.Services }
     *     
     */
    public HotelInfoType.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.Services }
     *     
     */
    public void setServices(HotelInfoType.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link LanguagesType }
     *     
     */
    public LanguagesType getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguagesType }
     *     
     */
    public void setLanguages(LanguagesType value) {
        this.languages = value;
    }

    /**
     * Gets the value of the minPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPrice() {
        return minPrice;
    }

    /**
     * Sets the value of the minPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinPrice(BigDecimal value) {
        this.minPrice = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Gets the value of the facilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityInfoType }
     *     
     */
    public FacilityInfoType getFacilityInfo() {
        return facilityInfo;
    }

    /**
     * Sets the value of the facilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityInfoType }
     *     
     */
    public void setFacilityInfo(FacilityInfoType value) {
        this.facilityInfo = value;
    }

    /**
     * Gets the value of the hostInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.HostInfo }
     *     
     */
    public HotelInfoType.HostInfo getHostInfo() {
        return hostInfo;
    }

    /**
     * Sets the value of the hostInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.HostInfo }
     *     
     */
    public void setHostInfo(HotelInfoType.HostInfo value) {
        this.hostInfo = value;
    }

    /**
     * Gets the value of the caringForDestination property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoType.CaringForDestination }
     *     
     */
    public HotelInfoType.CaringForDestination getCaringForDestination() {
        return caringForDestination;
    }

    /**
     * Sets the value of the caringForDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoType.CaringForDestination }
     *     
     */
    public void setCaringForDestination(HotelInfoType.CaringForDestination value) {
        this.caringForDestination = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the priceRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRange() {
        return priceRange;
    }

    /**
     * Sets the value of the priceRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRange(String value) {
        this.priceRange = value;
    }

    /**
     * Gets the value of the starRating property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStarRating() {
        return starRating;
    }

    /**
     * Sets the value of the starRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStarRating(BigDecimal value) {
        this.starRating = value;
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
     *         &lt;element name="FocusArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Commitment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Sustainability" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Verification" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "focusArea",
        "commitment"
    })
    public static class CaringForDestination {

        @XmlElement(name = "FocusArea")
        protected String focusArea;
        @XmlElement(name = "Commitment")
        protected String commitment;
        @XmlAttribute(name = "Sustainability")
        protected Boolean sustainability;
        @XmlAttribute(name = "Verification")
        protected String verification;

        /**
         * Gets the value of the focusArea property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFocusArea() {
            return focusArea;
        }

        /**
         * Sets the value of the focusArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFocusArea(String value) {
            this.focusArea = value;
        }

        /**
         * Gets the value of the commitment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommitment() {
            return commitment;
        }

        /**
         * Sets the value of the commitment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommitment(String value) {
            this.commitment = value;
        }

        /**
         * Gets the value of the sustainability property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSustainability() {
            return sustainability;
        }

        /**
         * Sets the value of the sustainability property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSustainability(Boolean value) {
            this.sustainability = value;
        }

        /**
         * Gets the value of the verification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerification() {
            return verification;
        }

        /**
         * Sets the value of the verification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerification(String value) {
            this.verification = value;
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
     *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FullDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GettingThere" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="GettingThereLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RoomIntroduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Disclosures" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FacilitiesDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BookingNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PhotoIntroduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "descriptiveText",
        "fullDescription",
        "location",
        "gettingThere",
        "gettingThereLocal",
        "roomIntroduction",
        "disclosures",
        "facilitiesDescription",
        "bookingNotes",
        "photoIntroduction"
    })
    public static class Descriptions {

        @XmlElement(name = "DescriptiveText")
        protected String descriptiveText;
        @XmlElement(name = "FullDescription")
        protected String fullDescription;
        @XmlElement(name = "Location")
        protected String location;
        @XmlElement(name = "GettingThere")
        protected String gettingThere;
        @XmlElement(name = "GettingThereLocal")
        protected String gettingThereLocal;
        @XmlElement(name = "RoomIntroduction")
        protected String roomIntroduction;
        @XmlElement(name = "Disclosures")
        protected String disclosures;
        @XmlElement(name = "FacilitiesDescription")
        protected String facilitiesDescription;
        @XmlElement(name = "BookingNotes")
        protected String bookingNotes;
        @XmlElement(name = "PhotoIntroduction")
        protected String photoIntroduction;

        /**
         * Gets the value of the descriptiveText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescriptiveText() {
            return descriptiveText;
        }

        /**
         * Sets the value of the descriptiveText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescriptiveText(String value) {
            this.descriptiveText = value;
        }

        /**
         * Gets the value of the fullDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullDescription() {
            return fullDescription;
        }

        /**
         * Sets the value of the fullDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullDescription(String value) {
            this.fullDescription = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * Gets the value of the gettingThere property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGettingThere() {
            return gettingThere;
        }

        /**
         * Sets the value of the gettingThere property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGettingThere(String value) {
            this.gettingThere = value;
        }

        /**
         * Gets the value of the gettingThereLocal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGettingThereLocal() {
            return gettingThereLocal;
        }

        /**
         * Sets the value of the gettingThereLocal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGettingThereLocal(String value) {
            this.gettingThereLocal = value;
        }

        /**
         * Gets the value of the roomIntroduction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomIntroduction() {
            return roomIntroduction;
        }

        /**
         * Sets the value of the roomIntroduction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomIntroduction(String value) {
            this.roomIntroduction = value;
        }

        /**
         * Gets the value of the disclosures property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisclosures() {
            return disclosures;
        }

        /**
         * Sets the value of the disclosures property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisclosures(String value) {
            this.disclosures = value;
        }

        /**
         * Gets the value of the facilitiesDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacilitiesDescription() {
            return facilitiesDescription;
        }

        /**
         * Sets the value of the facilitiesDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacilitiesDescription(String value) {
            this.facilitiesDescription = value;
        }

        /**
         * Gets the value of the bookingNotes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingNotes() {
            return bookingNotes;
        }

        /**
         * Sets the value of the bookingNotes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingNotes(String value) {
            this.bookingNotes = value;
        }

        /**
         * Gets the value of the photoIntroduction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhotoIntroduction() {
            return photoIntroduction;
        }

        /**
         * Sets the value of the photoIntroduction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhotoIntroduction(String value) {
            this.photoIntroduction = value;
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
     *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Introduction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "title",
        "introduction"
    })
    public static class HostInfo {

        @XmlElement(name = "Title")
        protected String title;
        @XmlElement(name = "Introduction")
        protected String introduction;

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the introduction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntroduction() {
            return introduction;
        }

        /**
         * Sets the value of the introduction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntroduction(String value) {
            this.introduction = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="HotelShortName" type="{http://api.whl.travel/soap}StringLength1to64" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class HotelName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "HotelShortName")
        protected String hotelShortName;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the hotelShortName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelShortName() {
            return hotelShortName;
        }

        /**
         * Sets the value of the hotelShortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelShortName(String value) {
            this.hotelShortName = value;
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
     *       &lt;attGroup ref="{http://api.whl.travel/soap}PositionGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Position {

        @XmlAttribute(name = "Latitude")
        protected String latitude;
        @XmlAttribute(name = "Longitude")
        protected String longitude;
        @XmlAttribute(name = "Altitude")
        protected String altitude;
        @XmlAttribute(name = "AltitudeUnitOfMeasureCode")
        protected String altitudeUnitOfMeasureCode;
        @XmlAttribute(name = "PositionAccuracy")
        protected String positionAccuracy;

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the altitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitude() {
            return altitude;
        }

        /**
         * Sets the value of the altitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitude(String value) {
            this.altitude = value;
        }

        /**
         * Gets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltitudeUnitOfMeasureCode() {
            return altitudeUnitOfMeasureCode;
        }

        /**
         * Sets the value of the altitudeUnitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltitudeUnitOfMeasureCode(String value) {
            this.altitudeUnitOfMeasureCode = value;
        }

        /**
         * Gets the value of the positionAccuracy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPositionAccuracy() {
            return positionAccuracy;
        }

        /**
         * Sets the value of the positionAccuracy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPositionAccuracy(String value) {
            this.positionAccuracy = value;
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
     *         &lt;element name="Service" type="{http://api.whl.travel/soap}ServiceType" maxOccurs="unbounded"/>
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
        "service"
    })
    public static class Services {

        @XmlElement(name = "Service", required = true)
        protected List<ServiceType> service;

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
         * {@link ServiceType }
         * 
         * 
         */
        public List<ServiceType> getService() {
            if (service == null) {
                service = new ArrayList<ServiceType>();
            }
            return this.service;
        }

    }

}
