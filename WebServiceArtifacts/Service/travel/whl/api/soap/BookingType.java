
package travel.whl.api.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BookingDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Guests" type="{http://api.whl.travel/soap}GuestsType"/>
 *         &lt;element name="Rooms" type="{http://api.whl.travel/soap}RoomsType"/>
 *         &lt;element name="Extras" type="{http://api.whl.travel/soap}ExtrasType"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OwingAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingType", propOrder = {
    "bookingId",
    "bookingDate",
    "bookingStatus",
    "note",
    "currency",
    "guests",
    "rooms",
    "extras",
    "amount",
    "owingAmount"
})
public class BookingType {

    @XmlElement(name = "BookingId", required = true)
    protected String bookingId;
    @XmlElement(name = "BookingDate", required = true)
    protected String bookingDate;
    @XmlElement(name = "BookingStatus", required = true)
    protected String bookingStatus;
    @XmlElement(name = "Note", required = true)
    protected String note;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Guests", required = true)
    protected GuestsType guests;
    @XmlElement(name = "Rooms", required = true)
    protected RoomsType rooms;
    @XmlElement(name = "Extras", required = true)
    protected ExtrasType extras;
    @XmlElement(name = "Amount", required = true)
    protected String amount;
    @XmlElement(name = "OwingAmount", required = true)
    protected String owingAmount;

    /**
     * Gets the value of the bookingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingId(String value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDate(String value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the bookingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingStatus() {
        return bookingStatus;
    }

    /**
     * Sets the value of the bookingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingStatus(String value) {
        this.bookingStatus = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the guests property.
     * 
     * @return
     *     possible object is
     *     {@link GuestsType }
     *     
     */
    public GuestsType getGuests() {
        return guests;
    }

    /**
     * Sets the value of the guests property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestsType }
     *     
     */
    public void setGuests(GuestsType value) {
        this.guests = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link RoomsType }
     *     
     */
    public RoomsType getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomsType }
     *     
     */
    public void setRooms(RoomsType value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the extras property.
     * 
     * @return
     *     possible object is
     *     {@link ExtrasType }
     *     
     */
    public ExtrasType getExtras() {
        return extras;
    }

    /**
     * Sets the value of the extras property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrasType }
     *     
     */
    public void setExtras(ExtrasType value) {
        this.extras = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the owingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwingAmount() {
        return owingAmount;
    }

    /**
     * Sets the value of the owingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwingAmount(String value) {
        this.owingAmount = value;
    }

}
