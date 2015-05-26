
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="AvailabilityBreakdown" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfAvailability" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://schemas.tourico.com/webservices/hotelv3}Promotion" minOccurs="0"/>
 *         &lt;element name="Occupancies" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfOccupancy" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isNonRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NumOfBathrooms" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="roomTypeCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="roomTypeCategoryId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="nights" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="startDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="hotelRoomTypeId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="roomId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="isAvailable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomType", propOrder = {
    "availabilityBreakdown",
    "discount",
    "occupancies"
})
public class RoomType {

    @XmlElement(name = "AvailabilityBreakdown")
    protected ArrayOfAvailability availabilityBreakdown;
    @XmlElement(name = "Discount")
    protected Promotion discount;
    @XmlElement(name = "Occupancies")
    protected ArrayOfOccupancy occupancies;
    @XmlAttribute(name = "isNonRefundable")
    protected Boolean isNonRefundable;
    @XmlAttribute(name = "NumOfBathrooms", required = true)
    protected int numOfBathrooms;
    @XmlAttribute(name = "roomTypeCategory")
    protected String roomTypeCategory;
    @XmlAttribute(name = "roomTypeCategoryId", required = true)
    protected int roomTypeCategoryId;
    @XmlAttribute(name = "nights", required = true)
    protected int nights;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "productId")
    protected String productId;
    @XmlAttribute(name = "startDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "hotelRoomTypeId", required = true)
    protected int hotelRoomTypeId;
    @XmlAttribute(name = "roomId", required = true)
    protected int roomId;
    @XmlAttribute(name = "isAvailable", required = true)
    protected boolean isAvailable;

    /**
     * Gets the value of the availabilityBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAvailability }
     *     
     */
    public ArrayOfAvailability getAvailabilityBreakdown() {
        return availabilityBreakdown;
    }

    /**
     * Sets the value of the availabilityBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAvailability }
     *     
     */
    public void setAvailabilityBreakdown(ArrayOfAvailability value) {
        this.availabilityBreakdown = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link Promotion }
     *     
     */
    public Promotion getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotion }
     *     
     */
    public void setDiscount(Promotion value) {
        this.discount = value;
    }

    /**
     * Gets the value of the occupancies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOccupancy }
     *     
     */
    public ArrayOfOccupancy getOccupancies() {
        return occupancies;
    }

    /**
     * Sets the value of the occupancies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOccupancy }
     *     
     */
    public void setOccupancies(ArrayOfOccupancy value) {
        this.occupancies = value;
    }

    /**
     * Gets the value of the isNonRefundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNonRefundable() {
        return isNonRefundable;
    }

    /**
     * Sets the value of the isNonRefundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonRefundable(Boolean value) {
        this.isNonRefundable = value;
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
     * Gets the value of the nights property.
     * 
     */
    public int getNights() {
        return nights;
    }

    /**
     * Sets the value of the nights property.
     * 
     */
    public void setNights(int value) {
        this.nights = value;
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
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
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
     * Gets the value of the isAvailable property.
     * 
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     */
    public void setIsAvailable(boolean value) {
        this.isAvailable = value;
    }

}
