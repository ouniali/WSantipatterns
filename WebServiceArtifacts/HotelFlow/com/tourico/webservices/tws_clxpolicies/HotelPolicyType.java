
package com.tourico.webservices.tws_clxpolicies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomTypePolicy" type="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}RoomTypePolicyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelPolicyType", propOrder = {
    "roomTypePolicy"
})
public class HotelPolicyType {

    @XmlElement(name = "RoomTypePolicy")
    protected RoomTypePolicyType roomTypePolicy;
    @XmlAttribute(name = "hotelId")
    protected Integer hotelId;

    /**
     * Gets the value of the roomTypePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link RoomTypePolicyType }
     *     
     */
    public RoomTypePolicyType getRoomTypePolicy() {
        return roomTypePolicy;
    }

    /**
     * Sets the value of the roomTypePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypePolicyType }
     *     
     */
    public void setRoomTypePolicy(RoomTypePolicyType value) {
        this.roomTypePolicy = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotelId(Integer value) {
        this.hotelId = value;
    }

}
