
package com.travelport.schema.universal_v16_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckInDate" type="{http://www.travelport.com/schema/universal_v16_0}typeDateSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="HotelChainCode" type="{http://www.travelport.com/schema/common_v15_0}typeHotelChainCode" />
 *       &lt;attribute name="HotelCode" type="{http://www.travelport.com/schema/common_v15_0}typeHotelCode" />
 *       &lt;attribute name="HotelConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Location" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
 *       &lt;attribute name="PassiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checkInDate"
})
@XmlRootElement(name = "HotelReservationCriteria")
public class HotelReservationCriteria {

    @XmlElement(name = "CheckInDate")
    protected TypeDateSpec checkInDate;
    @XmlAttribute(name = "HotelChainCode")
    protected String hotelChainCode;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "HotelConfirmation")
    protected String hotelConfirmation;
    @XmlAttribute(name = "Location")
    protected String location;
    @XmlAttribute(name = "PassiveOnly")
    protected Boolean passiveOnly;

    /**
     * Gets the value of the checkInDate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDateSpec }
     *     
     */
    public TypeDateSpec getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the value of the checkInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDateSpec }
     *     
     */
    public void setCheckInDate(TypeDateSpec value) {
        this.checkInDate = value;
    }

    /**
     * Gets the value of the hotelChainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelChainCode() {
        return hotelChainCode;
    }

    /**
     * Sets the value of the hotelChainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelChainCode(String value) {
        this.hotelChainCode = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the hotelConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelConfirmation() {
        return hotelConfirmation;
    }

    /**
     * Sets the value of the hotelConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelConfirmation(String value) {
        this.hotelConfirmation = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the passiveOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPassiveOnly() {
        if (passiveOnly == null) {
            return false;
        } else {
            return passiveOnly;
        }
    }

    /**
     * Sets the value of the passiveOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassiveOnly(Boolean value) {
        this.passiveOnly = value;
    }

}
