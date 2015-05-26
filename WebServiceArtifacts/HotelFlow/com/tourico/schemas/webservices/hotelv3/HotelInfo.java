
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}ProductInfo">
 *       &lt;sequence>
 *         &lt;element name="RoomExtraInfo" type="{http://schemas.tourico.com/webservices/hotelv3}RoomExtraInfo" minOccurs="0"/>
 *         &lt;element name="Passenger" type="{http://schemas.tourico.com/webservices/hotelv3}Passenger" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NumOfRoom" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PropertySubType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PropertyType" use="required" type="{http://schemas.tourico.com/webservices/hotelv3}PropertyType" />
 *       &lt;attribute name="hotelId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumOfBathrooms" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="roomTypeCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bestVal" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="roomTypeCategoryId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="roomType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numOfStars" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelInfo", propOrder = {
    "roomExtraInfo",
    "passenger"
})
public class HotelInfo
    extends ProductInfo
{

    @XmlElement(name = "RoomExtraInfo")
    protected RoomExtraInfo roomExtraInfo;
    @XmlElement(name = "Passenger")
    protected Passenger passenger;
    @XmlAttribute(name = "NumOfRoom", required = true)
    protected int numOfRoom;
    @XmlAttribute(name = "PropertySubType")
    protected String propertySubType;
    @XmlAttribute(name = "PropertyType", required = true)
    protected PropertyType propertyType;
    @XmlAttribute(name = "hotelId", required = true)
    protected int hotelId;
    @XmlAttribute(name = "thumb")
    protected String thumb;
    @XmlAttribute(name = "NumOfBathrooms", required = true)
    protected int numOfBathrooms;
    @XmlAttribute(name = "roomTypeCategory")
    protected String roomTypeCategory;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "address")
    protected String address;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "bestVal", required = true)
    protected boolean bestVal;
    @XmlAttribute(name = "roomTypeCategoryId", required = true)
    protected int roomTypeCategoryId;
    @XmlAttribute(name = "roomType")
    protected String roomType;
    @XmlAttribute(name = "numOfStars", required = true)
    protected BigDecimal numOfStars;

    /**
     * Gets the value of the roomExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RoomExtraInfo }
     *     
     */
    public RoomExtraInfo getRoomExtraInfo() {
        return roomExtraInfo;
    }

    /**
     * Sets the value of the roomExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomExtraInfo }
     *     
     */
    public void setRoomExtraInfo(RoomExtraInfo value) {
        this.roomExtraInfo = value;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * @return
     *     possible object is
     *     {@link Passenger }
     *     
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * Sets the value of the passenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passenger }
     *     
     */
    public void setPassenger(Passenger value) {
        this.passenger = value;
    }

    /**
     * Gets the value of the numOfRoom property.
     * 
     */
    public int getNumOfRoom() {
        return numOfRoom;
    }

    /**
     * Sets the value of the numOfRoom property.
     * 
     */
    public void setNumOfRoom(int value) {
        this.numOfRoom = value;
    }

    /**
     * Gets the value of the propertySubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertySubType() {
        return propertySubType;
    }

    /**
     * Sets the value of the propertySubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertySubType(String value) {
        this.propertySubType = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setPropertyType(PropertyType value) {
        this.propertyType = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     */
    public int getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     */
    public void setHotelId(int value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the thumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * Sets the value of the thumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumb(String value) {
        this.thumb = value;
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
     * Gets the value of the bestVal property.
     * 
     */
    public boolean isBestVal() {
        return bestVal;
    }

    /**
     * Sets the value of the bestVal property.
     * 
     */
    public void setBestVal(boolean value) {
        this.bestVal = value;
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
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the numOfStars property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumOfStars() {
        return numOfStars;
    }

    /**
     * Sets the value of the numOfStars property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumOfStars(BigDecimal value) {
        this.numOfStars = value;
    }

}
