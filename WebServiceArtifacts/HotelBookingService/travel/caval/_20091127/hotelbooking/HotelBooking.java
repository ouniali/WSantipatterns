
package travel.caval._20091127.hotelbooking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hotelBooking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hotelBooking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tourOperatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengers" type="{http://caval.travel/20091127/hotelBooking}passenger" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="commentsForHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commentsForBookingDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rooms" type="{http://caval.travel/20091127/hotelBooking}room" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wantsArrivalTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="arrivalFlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalFlightDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalFlightTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalFlightOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wantsDepartureTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="departureFlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureFlightDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureFlightTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureFlightDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://caval.travel/20091127/hotelBooking}amount" minOccurs="0"/>
 *         &lt;element name="formalizationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModificationTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotelBooking", propOrder = {
    "contractId",
    "tourOperatorId",
    "reference",
    "status",
    "hotelId",
    "hotelName",
    "titular",
    "email",
    "telephone",
    "address",
    "cityId",
    "cityName",
    "countryId",
    "countryName",
    "passengers",
    "commentsForHotel",
    "commentsForBookingDepartment",
    "rooms",
    "wantsArrivalTransfer",
    "arrivalFlightNumber",
    "arrivalFlightDate",
    "arrivalFlightTime",
    "arrivalFlightOrigin",
    "wantsDepartureTransfer",
    "departureFlightNumber",
    "departureFlightDate",
    "departureFlightTime",
    "departureFlightDestination",
    "price",
    "formalizationTime",
    "lastModificationTime"
})
public class HotelBooking {

    protected String contractId;
    protected String tourOperatorId;
    protected String reference;
    protected String status;
    protected String hotelId;
    protected String hotelName;
    protected String titular;
    protected String email;
    protected String telephone;
    protected String address;
    protected String cityId;
    protected String cityName;
    protected String countryId;
    protected String countryName;
    @XmlElement(nillable = true)
    protected List<Passenger> passengers;
    protected String commentsForHotel;
    protected String commentsForBookingDepartment;
    @XmlElement(nillable = true)
    protected List<Room> rooms;
    protected Boolean wantsArrivalTransfer;
    protected String arrivalFlightNumber;
    protected String arrivalFlightDate;
    protected String arrivalFlightTime;
    protected String arrivalFlightOrigin;
    protected Boolean wantsDepartureTransfer;
    protected String departureFlightNumber;
    protected String departureFlightDate;
    protected String departureFlightTime;
    protected String departureFlightDestination;
    protected Amount price;
    protected String formalizationTime;
    protected String lastModificationTime;

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the tourOperatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorId() {
        return tourOperatorId;
    }

    /**
     * Sets the value of the tourOperatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorId(String value) {
        this.tourOperatorId = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
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
     * Gets the value of the hotelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelId(String value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the titular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Sets the value of the titular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitular(String value) {
        this.titular = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the cityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityId(String value) {
        this.cityId = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryId(String value) {
        this.countryId = value;
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
     * Gets the value of the passengers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Passenger }
     * 
     * 
     */
    public List<Passenger> getPassengers() {
        if (passengers == null) {
            passengers = new ArrayList<Passenger>();
        }
        return this.passengers;
    }

    /**
     * Gets the value of the commentsForHotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentsForHotel() {
        return commentsForHotel;
    }

    /**
     * Sets the value of the commentsForHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentsForHotel(String value) {
        this.commentsForHotel = value;
    }

    /**
     * Gets the value of the commentsForBookingDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentsForBookingDepartment() {
        return commentsForBookingDepartment;
    }

    /**
     * Sets the value of the commentsForBookingDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentsForBookingDepartment(String value) {
        this.commentsForBookingDepartment = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rooms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRooms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Room }
     * 
     * 
     */
    public List<Room> getRooms() {
        if (rooms == null) {
            rooms = new ArrayList<Room>();
        }
        return this.rooms;
    }

    /**
     * Gets the value of the wantsArrivalTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantsArrivalTransfer() {
        return wantsArrivalTransfer;
    }

    /**
     * Sets the value of the wantsArrivalTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantsArrivalTransfer(Boolean value) {
        this.wantsArrivalTransfer = value;
    }

    /**
     * Gets the value of the arrivalFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalFlightNumber() {
        return arrivalFlightNumber;
    }

    /**
     * Sets the value of the arrivalFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalFlightNumber(String value) {
        this.arrivalFlightNumber = value;
    }

    /**
     * Gets the value of the arrivalFlightDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalFlightDate() {
        return arrivalFlightDate;
    }

    /**
     * Sets the value of the arrivalFlightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalFlightDate(String value) {
        this.arrivalFlightDate = value;
    }

    /**
     * Gets the value of the arrivalFlightTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalFlightTime() {
        return arrivalFlightTime;
    }

    /**
     * Sets the value of the arrivalFlightTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalFlightTime(String value) {
        this.arrivalFlightTime = value;
    }

    /**
     * Gets the value of the arrivalFlightOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalFlightOrigin() {
        return arrivalFlightOrigin;
    }

    /**
     * Sets the value of the arrivalFlightOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalFlightOrigin(String value) {
        this.arrivalFlightOrigin = value;
    }

    /**
     * Gets the value of the wantsDepartureTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantsDepartureTransfer() {
        return wantsDepartureTransfer;
    }

    /**
     * Sets the value of the wantsDepartureTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantsDepartureTransfer(Boolean value) {
        this.wantsDepartureTransfer = value;
    }

    /**
     * Gets the value of the departureFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureFlightNumber() {
        return departureFlightNumber;
    }

    /**
     * Sets the value of the departureFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureFlightNumber(String value) {
        this.departureFlightNumber = value;
    }

    /**
     * Gets the value of the departureFlightDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureFlightDate() {
        return departureFlightDate;
    }

    /**
     * Sets the value of the departureFlightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureFlightDate(String value) {
        this.departureFlightDate = value;
    }

    /**
     * Gets the value of the departureFlightTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureFlightTime() {
        return departureFlightTime;
    }

    /**
     * Sets the value of the departureFlightTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureFlightTime(String value) {
        this.departureFlightTime = value;
    }

    /**
     * Gets the value of the departureFlightDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureFlightDestination() {
        return departureFlightDestination;
    }

    /**
     * Sets the value of the departureFlightDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureFlightDestination(String value) {
        this.departureFlightDestination = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPrice(Amount value) {
        this.price = value;
    }

    /**
     * Gets the value of the formalizationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormalizationTime() {
        return formalizationTime;
    }

    /**
     * Sets the value of the formalizationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormalizationTime(String value) {
        this.formalizationTime = value;
    }

    /**
     * Gets the value of the lastModificationTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModificationTime() {
        return lastModificationTime;
    }

    /**
     * Sets the value of the lastModificationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModificationTime(String value) {
        this.lastModificationTime = value;
    }

}
