
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelExtraInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelExtraInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="hotelId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stars" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="hotelPhone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hotelFax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="provider" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="roomId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PropertyType" use="required" type="{http://schemas.tourico.com/webservices/hotelv3}PropertyType" />
 *       &lt;attribute name="PropertySubType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumOfRoom" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelExtraInfo")
public class HotelExtraInfo {

    @XmlAttribute(name = "hotelId", required = true)
    protected int hotelId;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "stars", required = true)
    protected float stars;
    @XmlAttribute(name = "hotelPhone")
    protected String hotelPhone;
    @XmlAttribute(name = "hotelFax")
    protected String hotelFax;
    @XmlAttribute(name = "provider")
    protected String provider;
    @XmlAttribute(name = "roomId")
    protected Integer roomId;
    @XmlAttribute(name = "PropertyType", required = true)
    protected PropertyType propertyType;
    @XmlAttribute(name = "PropertySubType")
    protected String propertySubType;
    @XmlAttribute(name = "NumOfRoom", required = true)
    protected int numOfRoom;

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
     * Gets the value of the stars property.
     * 
     */
    public float getStars() {
        return stars;
    }

    /**
     * Sets the value of the stars property.
     * 
     */
    public void setStars(float value) {
        this.stars = value;
    }

    /**
     * Gets the value of the hotelPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelPhone() {
        return hotelPhone;
    }

    /**
     * Sets the value of the hotelPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelPhone(String value) {
        this.hotelPhone = value;
    }

    /**
     * Gets the value of the hotelFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelFax() {
        return hotelFax;
    }

    /**
     * Sets the value of the hotelFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelFax(String value) {
        this.hotelFax = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
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

}
