
package travel.whl.api.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RoomDetails" type="{http://api.whl.travel/soap}RoomDetailsType"/>
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
@XmlType(name = "RoomType", propOrder = {
    "hotelId",
    "hotelName",
    "checkIn",
    "checkOut",
    "roomDetails",
    "amount",
    "owingAmount"
})
public class RoomType {

    @XmlElement(name = "HotelId", required = true)
    protected String hotelId;
    @XmlElement(name = "HotelName", required = true)
    protected String hotelName;
    @XmlElement(name = "CheckIn", required = true)
    protected String checkIn;
    @XmlElement(name = "CheckOut", required = true)
    protected String checkOut;
    @XmlElement(name = "RoomDetails", required = true)
    protected RoomDetailsType roomDetails;
    @XmlElement(name = "Amount", required = true)
    protected String amount;
    @XmlElement(name = "OwingAmount", required = true)
    protected String owingAmount;

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
     * Gets the value of the roomDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RoomDetailsType }
     *     
     */
    public RoomDetailsType getRoomDetails() {
        return roomDetails;
    }

    /**
     * Sets the value of the roomDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomDetailsType }
     *     
     */
    public void setRoomDetails(RoomDetailsType value) {
        this.roomDetails = value;
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
