
package travel.caval._20091127.hotelbooking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for room complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="room">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfRooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="adultsPerRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="childrenPerRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="childrenAges" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="roomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "room", propOrder = {
    "checkin",
    "checkout",
    "numberOfRooms",
    "adultsPerRoom",
    "childrenPerRoom",
    "childrenAges",
    "roomCode",
    "roomName",
    "boardCode",
    "boardName"
})
public class Room {

    protected String checkin;
    protected String checkout;
    protected Integer numberOfRooms;
    protected Integer adultsPerRoom;
    protected Integer childrenPerRoom;
    @XmlElement(nillable = true)
    protected List<Integer> childrenAges;
    protected String roomCode;
    protected String roomName;
    protected String boardCode;
    protected String boardName;

    /**
     * Gets the value of the checkin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckin() {
        return checkin;
    }

    /**
     * Sets the value of the checkin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckin(String value) {
        this.checkin = value;
    }

    /**
     * Gets the value of the checkout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckout() {
        return checkout;
    }

    /**
     * Sets the value of the checkout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckout(String value) {
        this.checkout = value;
    }

    /**
     * Gets the value of the numberOfRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRooms(Integer value) {
        this.numberOfRooms = value;
    }

    /**
     * Gets the value of the adultsPerRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdultsPerRoom() {
        return adultsPerRoom;
    }

    /**
     * Sets the value of the adultsPerRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdultsPerRoom(Integer value) {
        this.adultsPerRoom = value;
    }

    /**
     * Gets the value of the childrenPerRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildrenPerRoom() {
        return childrenPerRoom;
    }

    /**
     * Sets the value of the childrenPerRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildrenPerRoom(Integer value) {
        this.childrenPerRoom = value;
    }

    /**
     * Gets the value of the childrenAges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childrenAges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildrenAges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getChildrenAges() {
        if (childrenAges == null) {
            childrenAges = new ArrayList<Integer>();
        }
        return this.childrenAges;
    }

    /**
     * Gets the value of the roomCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomCode() {
        return roomCode;
    }

    /**
     * Sets the value of the roomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomCode(String value) {
        this.roomCode = value;
    }

    /**
     * Gets the value of the roomName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * Sets the value of the roomName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomName(String value) {
        this.roomName = value;
    }

    /**
     * Gets the value of the boardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardCode() {
        return boardCode;
    }

    /**
     * Sets the value of the boardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardCode(String value) {
        this.boardCode = value;
    }

    /**
     * Gets the value of the boardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardName() {
        return boardName;
    }

    /**
     * Sets the value of the boardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardName(String value) {
        this.boardName = value;
    }

}
