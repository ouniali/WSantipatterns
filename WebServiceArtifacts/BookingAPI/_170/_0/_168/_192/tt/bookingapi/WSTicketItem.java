
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSTicketItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTicketItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDomestic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://192.168.0.170/TT/BookingAPI}BookingSource"/>
 *         &lt;element name="PNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BookingCreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsRefundable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PaxWiseInfo" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSTicketItemPaxWiseInformation" minOccurs="0"/>
 *         &lt;element name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTicketItem", propOrder = {
    "bookingId",
    "isDomestic",
    "airlineCode",
    "origin",
    "destination",
    "source",
    "pnr",
    "travelDate",
    "bookingCreatedOn",
    "isRefundable",
    "paxWiseInfo",
    "bookingStatus"
})
public class WSTicketItem {

    @XmlElement(name = "BookingId")
    protected String bookingId;
    @XmlElement(name = "IsDomestic")
    protected boolean isDomestic;
    @XmlElement(name = "AirlineCode")
    protected String airlineCode;
    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "Source", required = true)
    @XmlSchemaType(name = "string")
    protected BookingSource source;
    @XmlElement(name = "PNR")
    protected String pnr;
    @XmlElement(name = "TravelDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar travelDate;
    @XmlElement(name = "BookingCreatedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookingCreatedOn;
    @XmlElement(name = "IsRefundable")
    protected boolean isRefundable;
    @XmlElement(name = "PaxWiseInfo")
    protected ArrayOfWSTicketItemPaxWiseInformation paxWiseInfo;
    @XmlElement(name = "BookingStatus")
    protected String bookingStatus;

    /**
     * Gets the value of the bookingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingId(String value) {
        this.bookingId = value;
    }

    /**
     * Gets the value of the isDomestic property.
     * 
     */
    public boolean isIsDomestic() {
        return isDomestic;
    }

    /**
     * Sets the value of the isDomestic property.
     * 
     */
    public void setIsDomestic(boolean value) {
        this.isDomestic = value;
    }

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link BookingSource }
     *     
     */
    public BookingSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingSource }
     *     
     */
    public void setSource(BookingSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the pnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNR() {
        return pnr;
    }

    /**
     * Sets the value of the pnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNR(String value) {
        this.pnr = value;
    }

    /**
     * Gets the value of the travelDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDate() {
        return travelDate;
    }

    /**
     * Sets the value of the travelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDate(XMLGregorianCalendar value) {
        this.travelDate = value;
    }

    /**
     * Gets the value of the bookingCreatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingCreatedOn() {
        return bookingCreatedOn;
    }

    /**
     * Sets the value of the bookingCreatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingCreatedOn(XMLGregorianCalendar value) {
        this.bookingCreatedOn = value;
    }

    /**
     * Gets the value of the isRefundable property.
     * 
     */
    public boolean isIsRefundable() {
        return isRefundable;
    }

    /**
     * Sets the value of the isRefundable property.
     * 
     */
    public void setIsRefundable(boolean value) {
        this.isRefundable = value;
    }

    /**
     * Gets the value of the paxWiseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSTicketItemPaxWiseInformation }
     *     
     */
    public ArrayOfWSTicketItemPaxWiseInformation getPaxWiseInfo() {
        return paxWiseInfo;
    }

    /**
     * Sets the value of the paxWiseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSTicketItemPaxWiseInformation }
     *     
     */
    public void setPaxWiseInfo(ArrayOfWSTicketItemPaxWiseInformation value) {
        this.paxWiseInfo = value;
    }

    /**
     * Gets the value of the bookingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingStatus() {
        return bookingStatus;
    }

    /**
     * Sets the value of the bookingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingStatus(String value) {
        this.bookingStatus = value;
    }

}
