
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchHotelsByDestinationIdsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchHotelsByDestinationIdsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationIdsInfo" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfDestinationIdInfo" minOccurs="0"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="RoomsInformation" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfRoomInfo" minOccurs="0"/>
 *         &lt;element name="MaxPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="StarLevel" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AvailableOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PropertyType" type="{http://schemas.tourico.com/webservices/hotelv3}PropertyType"/>
 *         &lt;element name="ExactDestination" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchHotelsByDestinationIdsRequest", propOrder = {
    "destinationIdsInfo",
    "checkIn",
    "checkOut",
    "roomsInformation",
    "maxPrice",
    "starLevel",
    "availableOnly",
    "propertyType",
    "exactDestination"
})
public class SearchHotelsByDestinationIdsRequest {

    @XmlElement(name = "DestinationIdsInfo")
    protected ArrayOfDestinationIdInfo destinationIdsInfo;
    @XmlElement(name = "CheckIn", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkIn;
    @XmlElement(name = "CheckOut", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkOut;
    @XmlElement(name = "RoomsInformation")
    protected ArrayOfRoomInfo roomsInformation;
    @XmlElement(name = "MaxPrice", required = true)
    protected BigDecimal maxPrice;
    @XmlElement(name = "StarLevel", required = true)
    protected BigDecimal starLevel;
    @XmlElement(name = "AvailableOnly")
    protected boolean availableOnly;
    @XmlElement(name = "PropertyType", required = true)
    @XmlSchemaType(name = "string")
    protected PropertyType propertyType;
    @XmlElement(name = "ExactDestination")
    protected boolean exactDestination;

    /**
     * Gets the value of the destinationIdsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDestinationIdInfo }
     *     
     */
    public ArrayOfDestinationIdInfo getDestinationIdsInfo() {
        return destinationIdsInfo;
    }

    /**
     * Sets the value of the destinationIdsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDestinationIdInfo }
     *     
     */
    public void setDestinationIdsInfo(ArrayOfDestinationIdInfo value) {
        this.destinationIdsInfo = value;
    }

    /**
     * Gets the value of the checkIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckIn() {
        return checkIn;
    }

    /**
     * Sets the value of the checkIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckIn(XMLGregorianCalendar value) {
        this.checkIn = value;
    }

    /**
     * Gets the value of the checkOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOut() {
        return checkOut;
    }

    /**
     * Sets the value of the checkOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOut(XMLGregorianCalendar value) {
        this.checkOut = value;
    }

    /**
     * Gets the value of the roomsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomInfo }
     *     
     */
    public ArrayOfRoomInfo getRoomsInformation() {
        return roomsInformation;
    }

    /**
     * Sets the value of the roomsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomInfo }
     *     
     */
    public void setRoomsInformation(ArrayOfRoomInfo value) {
        this.roomsInformation = value;
    }

    /**
     * Gets the value of the maxPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    /**
     * Sets the value of the maxPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPrice(BigDecimal value) {
        this.maxPrice = value;
    }

    /**
     * Gets the value of the starLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStarLevel() {
        return starLevel;
    }

    /**
     * Sets the value of the starLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStarLevel(BigDecimal value) {
        this.starLevel = value;
    }

    /**
     * Gets the value of the availableOnly property.
     * 
     */
    public boolean isAvailableOnly() {
        return availableOnly;
    }

    /**
     * Sets the value of the availableOnly property.
     * 
     */
    public void setAvailableOnly(boolean value) {
        this.availableOnly = value;
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
     * Gets the value of the exactDestination property.
     * 
     */
    public boolean isExactDestination() {
        return exactDestination;
    }

    /**
     * Sets the value of the exactDestination property.
     * 
     */
    public void setExactDestination(boolean value) {
        this.exactDestination = value;
    }

}
