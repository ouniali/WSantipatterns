
package travel.whl.api.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Reservation class contains the point of sale, reservation identifier, room stay, service, guest, payment, loyalty program, comments, confirmation and queue information for the reservation being created or modify.
 * 
 * <p>Java class for HotelReservationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomStays" type="{http://api.whl.travel/soap}RoomStaysType" minOccurs="0"/>
 *         &lt;element name="ResGuests" type="{http://api.whl.travel/soap}ResGuestsType" minOccurs="0"/>
 *         &lt;element name="ResGlobalInfo" type="{http://api.whl.travel/soap}ResGlobalInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RoomStayReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ResStatus" type="{http://api.whl.travel/soap}HotelResStatusType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationType", propOrder = {
    "roomStays",
    "resGuests",
    "resGlobalInfo"
})
public class HotelReservationType {

    @XmlElement(name = "RoomStays")
    protected RoomStaysType roomStays;
    @XmlElement(name = "ResGuests")
    protected ResGuestsType resGuests;
    @XmlElement(name = "ResGlobalInfo")
    protected ResGlobalInfoType resGlobalInfo;
    @XmlAttribute(name = "RoomStayReservation")
    protected Boolean roomStayReservation;
    @XmlAttribute(name = "ResStatus")
    protected String resStatus;

    /**
     * Gets the value of the roomStays property.
     * 
     * @return
     *     possible object is
     *     {@link RoomStaysType }
     *     
     */
    public RoomStaysType getRoomStays() {
        return roomStays;
    }

    /**
     * Sets the value of the roomStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStaysType }
     *     
     */
    public void setRoomStays(RoomStaysType value) {
        this.roomStays = value;
    }

    /**
     * Gets the value of the resGuests property.
     * 
     * @return
     *     possible object is
     *     {@link ResGuestsType }
     *     
     */
    public ResGuestsType getResGuests() {
        return resGuests;
    }

    /**
     * Sets the value of the resGuests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResGuestsType }
     *     
     */
    public void setResGuests(ResGuestsType value) {
        this.resGuests = value;
    }

    /**
     * Gets the value of the resGlobalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResGlobalInfoType }
     *     
     */
    public ResGlobalInfoType getResGlobalInfo() {
        return resGlobalInfo;
    }

    /**
     * Sets the value of the resGlobalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResGlobalInfoType }
     *     
     */
    public void setResGlobalInfo(ResGlobalInfoType value) {
        this.resGlobalInfo = value;
    }

    /**
     * Gets the value of the roomStayReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoomStayReservation() {
        return roomStayReservation;
    }

    /**
     * Sets the value of the roomStayReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoomStayReservation(Boolean value) {
        this.roomStayReservation = value;
    }

    /**
     * Gets the value of the resStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResStatus() {
        return resStatus;
    }

    /**
     * Sets the value of the resStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResStatus(String value) {
        this.resStatus = value;
    }

}
