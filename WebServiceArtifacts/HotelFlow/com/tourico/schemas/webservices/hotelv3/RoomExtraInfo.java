
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomExtraInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomExtraInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomInfo" type="{http://schemas.tourico.com/webservices/hotelv3}RoomInfo" minOccurs="0"/>
 *         &lt;element name="BoardBase" type="{http://schemas.tourico.com/webservices/hotelv3}Boardbase" minOccurs="0"/>
 *         &lt;element name="SelectedSupplements" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSupplement" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hotelRoomTypeId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="NumOfBathrooms" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="roomId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bedding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomExtraInfo", propOrder = {
    "roomInfo",
    "boardBase",
    "selectedSupplements"
})
public class RoomExtraInfo {

    @XmlElement(name = "RoomInfo")
    protected RoomInfo roomInfo;
    @XmlElement(name = "BoardBase")
    protected Boardbase boardBase;
    @XmlElement(name = "SelectedSupplements")
    protected ArrayOfSupplement selectedSupplements;
    @XmlAttribute(name = "hotelRoomTypeId", required = true)
    protected int hotelRoomTypeId;
    @XmlAttribute(name = "NumOfBathrooms", required = true)
    protected int numOfBathrooms;
    @XmlAttribute(name = "roomId", required = true)
    protected int roomId;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "bedding")
    protected String bedding;

    /**
     * Gets the value of the roomInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RoomInfo }
     *     
     */
    public RoomInfo getRoomInfo() {
        return roomInfo;
    }

    /**
     * Sets the value of the roomInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomInfo }
     *     
     */
    public void setRoomInfo(RoomInfo value) {
        this.roomInfo = value;
    }

    /**
     * Gets the value of the boardBase property.
     * 
     * @return
     *     possible object is
     *     {@link Boardbase }
     *     
     */
    public Boardbase getBoardBase() {
        return boardBase;
    }

    /**
     * Sets the value of the boardBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boardbase }
     *     
     */
    public void setBoardBase(Boardbase value) {
        this.boardBase = value;
    }

    /**
     * Gets the value of the selectedSupplements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplement }
     *     
     */
    public ArrayOfSupplement getSelectedSupplements() {
        return selectedSupplements;
    }

    /**
     * Sets the value of the selectedSupplements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplement }
     *     
     */
    public void setSelectedSupplements(ArrayOfSupplement value) {
        this.selectedSupplements = value;
    }

    /**
     * Gets the value of the hotelRoomTypeId property.
     * 
     */
    public int getHotelRoomTypeId() {
        return hotelRoomTypeId;
    }

    /**
     * Sets the value of the hotelRoomTypeId property.
     * 
     */
    public void setHotelRoomTypeId(int value) {
        this.hotelRoomTypeId = value;
    }

    /**
     * Gets the value of the numOfBathrooms property.
     * 
     */
    public int getNumOfBathrooms() {
        return numOfBathrooms;
    }

    /**
     * Sets the value of the numOfBathrooms property.
     * 
     */
    public void setNumOfBathrooms(int value) {
        this.numOfBathrooms = value;
    }

    /**
     * Gets the value of the roomId property.
     * 
     */
    public int getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of the roomId property.
     * 
     */
    public void setRoomId(int value) {
        this.roomId = value;
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
     * Gets the value of the bedding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedding() {
        return bedding;
    }

    /**
     * Sets the value of the bedding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedding(String value) {
        this.bedding = value;
    }

}
