
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KioskReservationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskReservationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://NewHotel/Web/Services/}ReservationState"/>
 *         &lt;element name="Arrival" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Departure" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Paxs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HideRate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ReservationId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ReservedRoomType" type="{https://NewHotel/Web/Services/}KioskRoomTypeInfo" minOccurs="0"/>
 *         &lt;element name="OccupedRoomType" type="{https://NewHotel/Web/Services/}KioskRoomTypeInfo" minOccurs="0"/>
 *         &lt;element name="Prices" type="{https://NewHotel/Web/Services/}ArrayOfKioskRoomTypePriceInfo" minOccurs="0"/>
 *         &lt;element name="Guests" type="{https://NewHotel/Web/Services/}ArrayOfKioskReservationGuest" minOccurs="0"/>
 *         &lt;element name="Room" type="{https://NewHotel/Web/Services/}KioskRoomInfo" minOccurs="0"/>
 *         &lt;element name="Account" type="{https://NewHotel/Web/Services/}KioskReservationAccountInfo" minOccurs="0"/>
 *         &lt;element name="UpsellItems" type="{https://NewHotel/Web/Services/}ArrayOfKioskReservationUpsellItem" minOccurs="0"/>
 *         &lt;element name="UsedUpsellItems" type="{https://NewHotel/Web/Services/}ArrayOfKioskReservationUpsellItem" minOccurs="0"/>
 *         &lt;element name="Invoices" type="{https://NewHotel/Web/Services/}ArrayOfKioskReservationInvoice" minOccurs="0"/>
 *         &lt;element name="CheckInAuthorization" type="{https://NewHotel/Web/Services/}CheckInAuthorize"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskReservationDetail", propOrder = {
    "reservationName",
    "status",
    "arrival",
    "departure",
    "paxs",
    "hideRate",
    "reservationId",
    "reservedRoomType",
    "occupedRoomType",
    "prices",
    "guests",
    "room",
    "account",
    "upsellItems",
    "usedUpsellItems",
    "invoices",
    "checkInAuthorization"
})
public class KioskReservationDetail {

    @XmlElement(name = "ReservationName")
    protected String reservationName;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected ReservationState status;
    @XmlElement(name = "Arrival", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrival;
    @XmlElement(name = "Departure", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departure;
    @XmlElement(name = "Paxs")
    protected int paxs;
    @XmlElement(name = "HideRate")
    protected boolean hideRate;
    @XmlElement(name = "ReservationId", required = true)
    protected String reservationId;
    @XmlElement(name = "ReservedRoomType")
    protected KioskRoomTypeInfo reservedRoomType;
    @XmlElement(name = "OccupedRoomType")
    protected KioskRoomTypeInfo occupedRoomType;
    @XmlElement(name = "Prices")
    protected ArrayOfKioskRoomTypePriceInfo prices;
    @XmlElement(name = "Guests")
    protected ArrayOfKioskReservationGuest guests;
    @XmlElement(name = "Room")
    protected KioskRoomInfo room;
    @XmlElement(name = "Account")
    protected KioskReservationAccountInfo account;
    @XmlElement(name = "UpsellItems")
    protected ArrayOfKioskReservationUpsellItem upsellItems;
    @XmlElement(name = "UsedUpsellItems")
    protected ArrayOfKioskReservationUpsellItem usedUpsellItems;
    @XmlElement(name = "Invoices")
    protected ArrayOfKioskReservationInvoice invoices;
    @XmlElement(name = "CheckInAuthorization", required = true)
    @XmlSchemaType(name = "string")
    protected CheckInAuthorize checkInAuthorization;

    /**
     * Gets the value of the reservationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationName() {
        return reservationName;
    }

    /**
     * Sets the value of the reservationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationName(String value) {
        this.reservationName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationState }
     *     
     */
    public ReservationState getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationState }
     *     
     */
    public void setStatus(ReservationState value) {
        this.status = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrival(XMLGregorianCalendar value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeparture(XMLGregorianCalendar value) {
        this.departure = value;
    }

    /**
     * Gets the value of the paxs property.
     * 
     */
    public int getPaxs() {
        return paxs;
    }

    /**
     * Sets the value of the paxs property.
     * 
     */
    public void setPaxs(int value) {
        this.paxs = value;
    }

    /**
     * Gets the value of the hideRate property.
     * 
     */
    public boolean isHideRate() {
        return hideRate;
    }

    /**
     * Sets the value of the hideRate property.
     * 
     */
    public void setHideRate(boolean value) {
        this.hideRate = value;
    }

    /**
     * Gets the value of the reservationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationId(String value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the reservedRoomType property.
     * 
     * @return
     *     possible object is
     *     {@link KioskRoomTypeInfo }
     *     
     */
    public KioskRoomTypeInfo getReservedRoomType() {
        return reservedRoomType;
    }

    /**
     * Sets the value of the reservedRoomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskRoomTypeInfo }
     *     
     */
    public void setReservedRoomType(KioskRoomTypeInfo value) {
        this.reservedRoomType = value;
    }

    /**
     * Gets the value of the occupedRoomType property.
     * 
     * @return
     *     possible object is
     *     {@link KioskRoomTypeInfo }
     *     
     */
    public KioskRoomTypeInfo getOccupedRoomType() {
        return occupedRoomType;
    }

    /**
     * Sets the value of the occupedRoomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskRoomTypeInfo }
     *     
     */
    public void setOccupedRoomType(KioskRoomTypeInfo value) {
        this.occupedRoomType = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskRoomTypePriceInfo }
     *     
     */
    public ArrayOfKioskRoomTypePriceInfo getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskRoomTypePriceInfo }
     *     
     */
    public void setPrices(ArrayOfKioskRoomTypePriceInfo value) {
        this.prices = value;
    }

    /**
     * Gets the value of the guests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskReservationGuest }
     *     
     */
    public ArrayOfKioskReservationGuest getGuests() {
        return guests;
    }

    /**
     * Sets the value of the guests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskReservationGuest }
     *     
     */
    public void setGuests(ArrayOfKioskReservationGuest value) {
        this.guests = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link KioskRoomInfo }
     *     
     */
    public KioskRoomInfo getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskRoomInfo }
     *     
     */
    public void setRoom(KioskRoomInfo value) {
        this.room = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link KioskReservationAccountInfo }
     *     
     */
    public KioskReservationAccountInfo getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskReservationAccountInfo }
     *     
     */
    public void setAccount(KioskReservationAccountInfo value) {
        this.account = value;
    }

    /**
     * Gets the value of the upsellItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskReservationUpsellItem }
     *     
     */
    public ArrayOfKioskReservationUpsellItem getUpsellItems() {
        return upsellItems;
    }

    /**
     * Sets the value of the upsellItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskReservationUpsellItem }
     *     
     */
    public void setUpsellItems(ArrayOfKioskReservationUpsellItem value) {
        this.upsellItems = value;
    }

    /**
     * Gets the value of the usedUpsellItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskReservationUpsellItem }
     *     
     */
    public ArrayOfKioskReservationUpsellItem getUsedUpsellItems() {
        return usedUpsellItems;
    }

    /**
     * Sets the value of the usedUpsellItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskReservationUpsellItem }
     *     
     */
    public void setUsedUpsellItems(ArrayOfKioskReservationUpsellItem value) {
        this.usedUpsellItems = value;
    }

    /**
     * Gets the value of the invoices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskReservationInvoice }
     *     
     */
    public ArrayOfKioskReservationInvoice getInvoices() {
        return invoices;
    }

    /**
     * Sets the value of the invoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskReservationInvoice }
     *     
     */
    public void setInvoices(ArrayOfKioskReservationInvoice value) {
        this.invoices = value;
    }

    /**
     * Gets the value of the checkInAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link CheckInAuthorize }
     *     
     */
    public CheckInAuthorize getCheckInAuthorization() {
        return checkInAuthorization;
    }

    /**
     * Sets the value of the checkInAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckInAuthorize }
     *     
     */
    public void setCheckInAuthorization(CheckInAuthorize value) {
        this.checkInAuthorization = value;
    }

}
