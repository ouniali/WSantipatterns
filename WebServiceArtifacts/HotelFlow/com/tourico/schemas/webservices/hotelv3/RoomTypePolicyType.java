
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoomTypePolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomTypePolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelPolicy" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfCancelPenaltyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hotelRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="checkIn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checkOut" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomTypePolicyType", propOrder = {
    "cancelPolicy"
})
public class RoomTypePolicyType {

    @XmlElement(name = "CancelPolicy")
    protected ArrayOfCancelPenaltyType cancelPolicy;
    @XmlAttribute(name = "hotelRoomTypeId")
    protected Integer hotelRoomTypeId;
    @XmlAttribute(name = "checkIn")
    protected String checkIn;
    @XmlAttribute(name = "checkOut")
    protected String checkOut;

    /**
     * Gets the value of the cancelPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancelPenaltyType }
     *     
     */
    public ArrayOfCancelPenaltyType getCancelPolicy() {
        return cancelPolicy;
    }

    /**
     * Sets the value of the cancelPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancelPenaltyType }
     *     
     */
    public void setCancelPolicy(ArrayOfCancelPenaltyType value) {
        this.cancelPolicy = value;
    }

    /**
     * Gets the value of the hotelRoomTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelRoomTypeId() {
        return hotelRoomTypeId;
    }

    /**
     * Sets the value of the hotelRoomTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelRoomTypeId(Integer value) {
        this.hotelRoomTypeId = value;
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

}
