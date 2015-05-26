
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSFlightItinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSFlightItinerary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastTicketedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FlightBookingSource" type="{http://192.168.0.170/TT/BookingAPI}BookingSource"/>
 *         &lt;element name="ValidatingAirlineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Segments" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSFlightInfo" minOccurs="0"/>
 *         &lt;element name="FlightId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Passengers" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSPassengerForQueue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSFlightItinerary", propOrder = {
    "lastTicketedDate",
    "createdOn",
    "flightBookingSource",
    "validatingAirlineCode",
    "agencyId",
    "pnr",
    "segments",
    "flightId",
    "passengers"
})
public class WSFlightItinerary {

    @XmlElement(name = "LastTicketedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTicketedDate;
    @XmlElement(name = "CreatedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdOn;
    @XmlElement(name = "FlightBookingSource", required = true)
    @XmlSchemaType(name = "string")
    protected BookingSource flightBookingSource;
    @XmlElement(name = "ValidatingAirlineCode")
    protected String validatingAirlineCode;
    @XmlElement(name = "AgencyId")
    protected int agencyId;
    @XmlElement(name = "PNR")
    protected String pnr;
    @XmlElement(name = "Segments")
    protected ArrayOfWSFlightInfo segments;
    @XmlElement(name = "FlightId")
    protected int flightId;
    @XmlElement(name = "Passengers")
    protected ArrayOfWSPassengerForQueue passengers;

    /**
     * Gets the value of the lastTicketedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTicketedDate() {
        return lastTicketedDate;
    }

    /**
     * Sets the value of the lastTicketedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTicketedDate(XMLGregorianCalendar value) {
        this.lastTicketedDate = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedOn(XMLGregorianCalendar value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the flightBookingSource property.
     * 
     * @return
     *     possible object is
     *     {@link BookingSource }
     *     
     */
    public BookingSource getFlightBookingSource() {
        return flightBookingSource;
    }

    /**
     * Sets the value of the flightBookingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingSource }
     *     
     */
    public void setFlightBookingSource(BookingSource value) {
        this.flightBookingSource = value;
    }

    /**
     * Gets the value of the validatingAirlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingAirlineCode() {
        return validatingAirlineCode;
    }

    /**
     * Sets the value of the validatingAirlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingAirlineCode(String value) {
        this.validatingAirlineCode = value;
    }

    /**
     * Gets the value of the agencyId property.
     * 
     */
    public int getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     */
    public void setAgencyId(int value) {
        this.agencyId = value;
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
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSFlightInfo }
     *     
     */
    public ArrayOfWSFlightInfo getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSFlightInfo }
     *     
     */
    public void setSegments(ArrayOfWSFlightInfo value) {
        this.segments = value;
    }

    /**
     * Gets the value of the flightId property.
     * 
     */
    public int getFlightId() {
        return flightId;
    }

    /**
     * Sets the value of the flightId property.
     * 
     */
    public void setFlightId(int value) {
        this.flightId = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSPassengerForQueue }
     *     
     */
    public ArrayOfWSPassengerForQueue getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSPassengerForQueue }
     *     
     */
    public void setPassengers(ArrayOfWSPassengerForQueue value) {
        this.passengers = value;
    }

}
