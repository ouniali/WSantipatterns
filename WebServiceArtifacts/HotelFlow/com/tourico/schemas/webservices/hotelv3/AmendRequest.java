
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AmendRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecordLocatorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HotelRoomTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CheckIn" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CheckOut" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SelectedReservations" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfReservationType" minOccurs="0"/>
 *         &lt;element name="Cci" type="{http://schemas.tourico.com/webservices/hotelv3}CciType" minOccurs="0"/>
 *         &lt;element name="AmendmentPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AmendType" type="{http://schemas.tourico.com/webservices/hotelv3}PaymentType"/>
 *         &lt;element name="DeltaPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgentRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOnlyAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RgldRefNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PropertyType" type="{http://schemas.tourico.com/webservices/hotelv3}PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendRequest", propOrder = {
    "recordLocatorId",
    "hotelId",
    "hotelRoomTypeId",
    "checkIn",
    "checkOut",
    "selectedReservations",
    "cci",
    "amendmentPrice",
    "amendType",
    "deltaPrice",
    "currency",
    "agentRefNumber",
    "isOnlyAvailable",
    "rgldRefNum",
    "propertyType"
})
public class AmendRequest {

    @XmlElement(name = "RecordLocatorId", required = true, type = Integer.class, nillable = true)
    protected Integer recordLocatorId;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "HotelRoomTypeId")
    protected int hotelRoomTypeId;
    @XmlElement(name = "CheckIn", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkIn;
    @XmlElement(name = "CheckOut", required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkOut;
    @XmlElement(name = "SelectedReservations")
    protected ArrayOfReservationType selectedReservations;
    @XmlElement(name = "Cci")
    protected CciType cci;
    @XmlElement(name = "AmendmentPrice", required = true, nillable = true)
    protected BigDecimal amendmentPrice;
    @XmlElement(name = "AmendType", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentType amendType;
    @XmlElement(name = "DeltaPrice", required = true, nillable = true)
    protected BigDecimal deltaPrice;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "AgentRefNumber")
    protected String agentRefNumber;
    @XmlElement(name = "IsOnlyAvailable")
    protected boolean isOnlyAvailable;
    @XmlElement(name = "RgldRefNum")
    protected String rgldRefNum;
    @XmlElement(name = "PropertyType", required = true)
    @XmlSchemaType(name = "string")
    protected PropertyType propertyType;

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
     * Gets the value of the cci property.
     * 
     * @return
     *     possible object is
     *     {@link CciType }
     *     
     */
    public CciType getCci() {
        return cci;
    }

    /**
     * Sets the value of the cci property.
     * 
     * @param value
     *     allowed object is
     *     {@link CciType }
     *     
     */
    public void setCci(CciType value) {
        this.cci = value;
    }

    /**
     * Gets the value of the amendmentPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmendmentPrice() {
        return amendmentPrice;
    }

    /**
     * Sets the value of the amendmentPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmendmentPrice(BigDecimal value) {
        this.amendmentPrice = value;
    }

    /**
     * Gets the value of the amendType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getAmendType() {
        return amendType;
    }

    /**
     * Sets the value of the amendType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setAmendType(PaymentType value) {
        this.amendType = value;
    }

    /**
     * Gets the value of the deltaPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeltaPrice() {
        return deltaPrice;
    }

    /**
     * Sets the value of the deltaPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeltaPrice(BigDecimal value) {
        this.deltaPrice = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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

    /**
     * Gets the value of the rgldRefNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgldRefNum() {
        return rgldRefNum;
    }

    /**
     * Sets the value of the rgldRefNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgldRefNum(String value) {
        this.rgldRefNum = value;
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

}
