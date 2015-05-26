
package travel.caval._20091127.hotelbooking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cavalHotelAvailabilityRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cavalHotelAvailabilityRQ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caval.travel/20091127/hotelBooking}abstractAuthenticatedAgencyRQ">
 *       &lt;sequence>
 *         &lt;element name="stateIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cityIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="establishmentIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="airportIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="checkIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="occupations" type="{http://caval.travel/20091127/hotelBooking}availRQOccupation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hotelCategoryGroupFilter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="boardGroupFilter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roomGroupFilter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="establishmentClassificationFilter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="establishmentNameFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excludeOnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="onlyOffers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="removeHotelInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fromRow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numRows" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="coverageArea" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="googleLatitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="googleLongitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="includeCancellationCostsAndRemarks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="guestCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cavalHotelAvailabilityRQ", propOrder = {
    "stateIds",
    "cityIds",
    "establishmentIds",
    "airportIds",
    "checkIn",
    "checkOut",
    "occupations",
    "hotelCategoryGroupFilter",
    "boardGroupFilter",
    "roomGroupFilter",
    "establishmentClassificationFilter",
    "establishmentNameFilter",
    "excludeOnRequest",
    "onlyOffers",
    "removeHotelInfo",
    "fromRow",
    "numRows",
    "coverageArea",
    "includeCancellationCostsAndRemarks",
    "guestCountryCode"
})
public class CavalHotelAvailabilityRQ
    extends AbstractAuthenticatedAgencyRQ
{

    @XmlElement(nillable = true)
    protected List<String> stateIds;
    @XmlElement(nillable = true)
    protected List<String> cityIds;
    @XmlElement(nillable = true)
    protected List<String> establishmentIds;
    @XmlElement(nillable = true)
    protected List<String> airportIds;
    @XmlElement(required = true)
    protected String checkIn;
    @XmlElement(required = true)
    protected String checkOut;
    @XmlElement(nillable = true)
    protected List<AvailRQOccupation> occupations;
    @XmlElement(nillable = true)
    protected List<String> hotelCategoryGroupFilter;
    @XmlElement(nillable = true)
    protected List<String> boardGroupFilter;
    @XmlElement(nillable = true)
    protected List<String> roomGroupFilter;
    @XmlElement(nillable = true)
    protected List<String> establishmentClassificationFilter;
    protected String establishmentNameFilter;
    protected Boolean excludeOnRequest;
    protected Boolean onlyOffers;
    protected Boolean removeHotelInfo;
    protected Integer fromRow;
    protected Integer numRows;
    protected CavalHotelAvailabilityRQ.CoverageArea coverageArea;
    protected Boolean includeCancellationCostsAndRemarks;
    protected String guestCountryCode;

    /**
     * Gets the value of the stateIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStateIds() {
        if (stateIds == null) {
            stateIds = new ArrayList<String>();
        }
        return this.stateIds;
    }

    /**
     * Gets the value of the cityIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCityIds() {
        if (cityIds == null) {
            cityIds = new ArrayList<String>();
        }
        return this.cityIds;
    }

    /**
     * Gets the value of the establishmentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the establishmentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstablishmentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEstablishmentIds() {
        if (establishmentIds == null) {
            establishmentIds = new ArrayList<String>();
        }
        return this.establishmentIds;
    }

    /**
     * Gets the value of the airportIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAirportIds() {
        if (airportIds == null) {
            airportIds = new ArrayList<String>();
        }
        return this.airportIds;
    }

    /**
     * Gets the value of the checkIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckIn() {
        return checkIn;
    }

    /**
     * Sets the value of the checkIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckIn(String value) {
        this.checkIn = value;
    }

    /**
     * Gets the value of the checkOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOut() {
        return checkOut;
    }

    /**
     * Sets the value of the checkOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOut(String value) {
        this.checkOut = value;
    }

    /**
     * Gets the value of the occupations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailRQOccupation }
     * 
     * 
     */
    public List<AvailRQOccupation> getOccupations() {
        if (occupations == null) {
            occupations = new ArrayList<AvailRQOccupation>();
        }
        return this.occupations;
    }

    /**
     * Gets the value of the hotelCategoryGroupFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelCategoryGroupFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelCategoryGroupFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHotelCategoryGroupFilter() {
        if (hotelCategoryGroupFilter == null) {
            hotelCategoryGroupFilter = new ArrayList<String>();
        }
        return this.hotelCategoryGroupFilter;
    }

    /**
     * Gets the value of the boardGroupFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardGroupFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardGroupFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBoardGroupFilter() {
        if (boardGroupFilter == null) {
            boardGroupFilter = new ArrayList<String>();
        }
        return this.boardGroupFilter;
    }

    /**
     * Gets the value of the roomGroupFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomGroupFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomGroupFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoomGroupFilter() {
        if (roomGroupFilter == null) {
            roomGroupFilter = new ArrayList<String>();
        }
        return this.roomGroupFilter;
    }

    /**
     * Gets the value of the establishmentClassificationFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the establishmentClassificationFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstablishmentClassificationFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEstablishmentClassificationFilter() {
        if (establishmentClassificationFilter == null) {
            establishmentClassificationFilter = new ArrayList<String>();
        }
        return this.establishmentClassificationFilter;
    }

    /**
     * Gets the value of the establishmentNameFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstablishmentNameFilter() {
        return establishmentNameFilter;
    }

    /**
     * Sets the value of the establishmentNameFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstablishmentNameFilter(String value) {
        this.establishmentNameFilter = value;
    }

    /**
     * Gets the value of the excludeOnRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeOnRequest() {
        return excludeOnRequest;
    }

    /**
     * Sets the value of the excludeOnRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeOnRequest(Boolean value) {
        this.excludeOnRequest = value;
    }

    /**
     * Gets the value of the onlyOffers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyOffers() {
        return onlyOffers;
    }

    /**
     * Sets the value of the onlyOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyOffers(Boolean value) {
        this.onlyOffers = value;
    }

    /**
     * Gets the value of the removeHotelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveHotelInfo() {
        return removeHotelInfo;
    }

    /**
     * Sets the value of the removeHotelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveHotelInfo(Boolean value) {
        this.removeHotelInfo = value;
    }

    /**
     * Gets the value of the fromRow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFromRow() {
        return fromRow;
    }

    /**
     * Sets the value of the fromRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFromRow(Integer value) {
        this.fromRow = value;
    }

    /**
     * Gets the value of the numRows property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRows() {
        return numRows;
    }

    /**
     * Sets the value of the numRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRows(Integer value) {
        this.numRows = value;
    }

    /**
     * Gets the value of the coverageArea property.
     * 
     * @return
     *     possible object is
     *     {@link CavalHotelAvailabilityRQ.CoverageArea }
     *     
     */
    public CavalHotelAvailabilityRQ.CoverageArea getCoverageArea() {
        return coverageArea;
    }

    /**
     * Sets the value of the coverageArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link CavalHotelAvailabilityRQ.CoverageArea }
     *     
     */
    public void setCoverageArea(CavalHotelAvailabilityRQ.CoverageArea value) {
        this.coverageArea = value;
    }

    /**
     * Gets the value of the includeCancellationCostsAndRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCancellationCostsAndRemarks() {
        return includeCancellationCostsAndRemarks;
    }

    /**
     * Sets the value of the includeCancellationCostsAndRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCancellationCostsAndRemarks(Boolean value) {
        this.includeCancellationCostsAndRemarks = value;
    }

    /**
     * Gets the value of the guestCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestCountryCode() {
        return guestCountryCode;
    }

    /**
     * Sets the value of the guestCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestCountryCode(String value) {
        this.guestCountryCode = value;
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
     *         &lt;element name="googleLatitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="googleLongitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "googleLatitude",
        "googleLongitude",
        "radius"
    })
    public static class CoverageArea {

        @XmlElement(required = true)
        protected String googleLatitude;
        @XmlElement(required = true)
        protected String googleLongitude;
        @XmlElement(required = true)
        protected String radius;

        /**
         * Gets the value of the googleLatitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGoogleLatitude() {
            return googleLatitude;
        }

        /**
         * Sets the value of the googleLatitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGoogleLatitude(String value) {
            this.googleLatitude = value;
        }

        /**
         * Gets the value of the googleLongitude property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGoogleLongitude() {
            return googleLongitude;
        }

        /**
         * Sets the value of the googleLongitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGoogleLongitude(String value) {
            this.googleLongitude = value;
        }

        /**
         * Gets the value of the radius property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRadius() {
            return radius;
        }

        /**
         * Sets the value of the radius property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRadius(String value) {
            this.radius = value;
        }

    }

}
