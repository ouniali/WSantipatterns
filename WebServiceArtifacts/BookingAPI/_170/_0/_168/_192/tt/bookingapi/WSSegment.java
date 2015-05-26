
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SegmentIndicator" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Airline" type="{http://192.168.0.170/TT/BookingAPI}WSAirline"/>
 *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlinePNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Origin" type="{http://192.168.0.170/TT/BookingAPI}WSAirport" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://192.168.0.170/TT/BookingAPI}WSAirport" minOccurs="0"/>
 *         &lt;element name="DepTIme" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ArrTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ETicketEligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stop" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Craft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSegment", propOrder = {
    "segmentIndicator",
    "airline",
    "flightNumber",
    "fareClass",
    "airlinePNR",
    "origin",
    "destination",
    "depTIme",
    "arrTime",
    "eTicketEligible",
    "duration",
    "stop",
    "craft",
    "status",
    "operatingCarrier"
})
public class WSSegment {

    @XmlElement(name = "SegmentIndicator")
    protected int segmentIndicator;
    @XmlElement(name = "Airline", required = true)
    protected WSAirline airline;
    @XmlElement(name = "FlightNumber")
    protected String flightNumber;
    @XmlElement(name = "FareClass")
    protected String fareClass;
    @XmlElement(name = "AirlinePNR")
    protected String airlinePNR;
    @XmlElement(name = "Origin")
    protected WSAirport origin;
    @XmlElement(name = "Destination")
    protected WSAirport destination;
    @XmlElement(name = "DepTIme", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depTIme;
    @XmlElement(name = "ArrTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrTime;
    @XmlElement(name = "ETicketEligible")
    protected boolean eTicketEligible;
    @XmlElement(name = "Duration")
    protected String duration;
    @XmlElement(name = "Stop")
    protected int stop;
    @XmlElement(name = "Craft")
    protected String craft;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "OperatingCarrier")
    protected String operatingCarrier;

    /**
     * Gets the value of the segmentIndicator property.
     * 
     */
    public int getSegmentIndicator() {
        return segmentIndicator;
    }

    /**
     * Sets the value of the segmentIndicator property.
     * 
     */
    public void setSegmentIndicator(int value) {
        this.segmentIndicator = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link WSAirline }
     *     
     */
    public WSAirline getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSAirline }
     *     
     */
    public void setAirline(WSAirline value) {
        this.airline = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the fareClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareClass() {
        return fareClass;
    }

    /**
     * Sets the value of the fareClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareClass(String value) {
        this.fareClass = value;
    }

    /**
     * Gets the value of the airlinePNR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlinePNR() {
        return airlinePNR;
    }

    /**
     * Sets the value of the airlinePNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlinePNR(String value) {
        this.airlinePNR = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link WSAirport }
     *     
     */
    public WSAirport getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSAirport }
     *     
     */
    public void setOrigin(WSAirport value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link WSAirport }
     *     
     */
    public WSAirport getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSAirport }
     *     
     */
    public void setDestination(WSAirport value) {
        this.destination = value;
    }

    /**
     * Gets the value of the depTIme property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepTIme() {
        return depTIme;
    }

    /**
     * Sets the value of the depTIme property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepTIme(XMLGregorianCalendar value) {
        this.depTIme = value;
    }

    /**
     * Gets the value of the arrTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrTime() {
        return arrTime;
    }

    /**
     * Sets the value of the arrTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrTime(XMLGregorianCalendar value) {
        this.arrTime = value;
    }

    /**
     * Gets the value of the eTicketEligible property.
     * 
     */
    public boolean isETicketEligible() {
        return eTicketEligible;
    }

    /**
     * Sets the value of the eTicketEligible property.
     * 
     */
    public void setETicketEligible(boolean value) {
        this.eTicketEligible = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the stop property.
     * 
     */
    public int getStop() {
        return stop;
    }

    /**
     * Sets the value of the stop property.
     * 
     */
    public void setStop(int value) {
        this.stop = value;
    }

    /**
     * Gets the value of the craft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCraft() {
        return craft;
    }

    /**
     * Sets the value of the craft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCraft(String value) {
        this.craft = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCarrier(String value) {
        this.operatingCarrier = value;
    }

}
