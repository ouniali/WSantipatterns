
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CostAmendRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostAmendRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordLocatorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HotelRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SelectedReservations" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfReservationType" minOccurs="0"/>
 *         &lt;element name="AgentRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOnlyAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostAmendRequest", propOrder = {
    "recordLocatorId",
    "hotelId",
    "hotelRoomTypeId",
    "checkIn",
    "checkOut",
    "selectedReservations",
    "agentRefNumber",
    "isOnlyAvailable"
})
public class CostAmendRequest {

    @XmlElement(name = "RecordLocatorId", required = true, type = Integer.class, nillable = true)
    protected Integer recordLocatorId;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "HotelRoomTypeId")
    protected int hotelRoomTypeId;
    @XmlElement(name = "CheckIn", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkIn;
    @XmlElement(name = "CheckOut", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkOut;
    @XmlElement(name = "SelectedReservations")
    protected ArrayOfReservationType selectedReservations;
    @XmlElement(name = "AgentRefNumber")
    protected String agentRefNumber;
    @XmlElement(name = "IsOnlyAvailable")
    protected boolean isOnlyAvailable;

    /**
     * Gets the value of the recordLocatorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecordLocatorId() {
        return recordLocatorId;
    }

    /**
     * Sets the value of the recordLocatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecordLocatorId(Integer value) {
        this.recordLocatorId = value;
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
     * Gets the value of the selectedReservations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReservationType }
     *     
     */
    public ArrayOfReservationType getSelectedReservations() {
        return selectedReservations;
    }

    /**
     * Sets the value of the selectedReservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReservationType }
     *     
     */
    public void setSelectedReservations(ArrayOfReservationType value) {
        this.selectedReservations = value;
    }

    /**
     * Gets the value of the agentRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentRefNumber() {
        return agentRefNumber;
    }

    /**
     * Sets the value of the agentRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentRefNumber(String value) {
        this.agentRefNumber = value;
    }

    /**
     * Gets the value of the isOnlyAvailable property.
     * 
     */
    public boolean isIsOnlyAvailable() {
        return isOnlyAvailable;
    }

    /**
     * Sets the value of the isOnlyAvailable property.
     * 
     */
    public void setIsOnlyAvailable(boolean value) {
        this.isOnlyAvailable = value;
    }

}
