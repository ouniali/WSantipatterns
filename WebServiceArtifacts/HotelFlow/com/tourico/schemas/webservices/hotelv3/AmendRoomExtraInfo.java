
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmendRoomExtraInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendRoomExtraInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boardBase" type="{http://schemas.tourico.com/webservices/hotelv3}BoardBaseType" minOccurs="0"/>
 *         &lt;element name="Supplements" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSupplement" minOccurs="0"/>
 *         &lt;element name="roomInfo" type="{http://schemas.tourico.com/webservices/hotelv3}RoomInfo" minOccurs="0"/>
 *         &lt;element name="hotelRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="roomId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="roomTypeCategoryId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="roomTypeCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dblBed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="occupId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumOfBathrooms" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendRoomExtraInfo", propOrder = {
    "boardBase",
    "supplements",
    "roomInfo",
    "hotelRoomTypeId"
})
public class AmendRoomExtraInfo {

    protected BoardBaseType boardBase;
    @XmlElement(name = "Supplements")
    protected ArrayOfSupplement supplements;
    protected RoomInfo roomInfo;
    protected int hotelRoomTypeId;
    @XmlAttribute(name = "roomId")
    protected Integer roomId;
    @XmlAttribute(name = "roomTypeCategoryId", required = true)
    protected int roomTypeCategoryId;
    @XmlAttribute(name = "roomTypeCategory")
    protected String roomTypeCategory;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "dblBed", required = true)
    protected boolean dblBed;
    @XmlAttribute(name = "occupId")
    protected String occupId;
    @XmlAttribute(name = "NumOfBathrooms", required = true)
    protected int numOfBathrooms;

    /**
     * Gets the value of the boardBase property.
     * 
     * @return
     *     possible object is
     *     {@link BoardBaseType }
     *     
     */
    public BoardBaseType getBoardBase() {
        return boardBase;
    }

    /**
     * Sets the value of the boardBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardBaseType }
     *     
     */
    public void setBoardBase(BoardBaseType value) {
        this.boardBase = value;
    }

    /**
     * Gets the value of the supplements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplement }
     *     
     */
    public ArrayOfSupplement getSupplements() {
        return supplements;
    }

    /**
     * Sets the value of the supplements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplement }
     *     
     */
    public void setSupplements(ArrayOfSupplement value) {
        this.supplements = value;
    }

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
     * Gets the value of the roomId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of the roomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoomId(Integer value) {
        this.roomId = value;
    }

    /**
     * Gets the value of the roomTypeCategoryId property.
     * 
     */
    public int getRoomTypeCategoryId() {
        return roomTypeCategoryId;
    }

    /**
     * Sets the value of the roomTypeCategoryId property.
     * 
     */
    public void setRoomTypeCategoryId(int value) {
        this.roomTypeCategoryId = value;
    }

    /**
     * Gets the value of the roomTypeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCategory() {
        return roomTypeCategory;
    }

    /**
     * Sets the value of the roomTypeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCategory(String value) {
        this.roomTypeCategory = value;
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
     * Gets the value of the dblBed property.
     * 
     */
    public boolean isDblBed() {
        return dblBed;
    }

    /**
     * Sets the value of the dblBed property.
     * 
     */
    public void setDblBed(boolean value) {
        this.dblBed = value;
    }

    /**
     * Gets the value of the occupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupId() {
        return occupId;
    }

    /**
     * Sets the value of the occupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupId(String value) {
        this.occupId = value;
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

}
