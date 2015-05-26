
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FlightSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PreferredArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="flightCabinClass" type="{http://192.168.0.170/TT/BookingAPI}CabinClass"/>
 *         &lt;element name="PreferredAirlines" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegment", propOrder = {
    "origin",
    "destination",
    "preferredDepartureTime",
    "preferredArrivalTime",
    "flightCabinClass",
    "preferredAirlines"
})
public class FlightSegment {

    @XmlElement(name = "Origin")
    protected String origin;
    @XmlElement(name = "Destination")
    protected String destination;
    @XmlElement(name = "PreferredDepartureTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar preferredDepartureTime;
    @XmlElement(name = "PreferredArrivalTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar preferredArrivalTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CabinClass flightCabinClass;
    @XmlElement(name = "PreferredAirlines")
    protected ArrayOfString preferredAirlines;

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
     * Gets the value of the preferredDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreferredDepartureTime() {
        return preferredDepartureTime;
    }

    /**
     * Sets the value of the preferredDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreferredDepartureTime(XMLGregorianCalendar value) {
        this.preferredDepartureTime = value;
    }

    /**
     * Gets the value of the preferredArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreferredArrivalTime() {
        return preferredArrivalTime;
    }

    /**
     * Sets the value of the preferredArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreferredArrivalTime(XMLGregorianCalendar value) {
        this.preferredArrivalTime = value;
    }

    /**
     * Gets the value of the flightCabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClass }
     *     
     */
    public CabinClass getFlightCabinClass() {
        return flightCabinClass;
    }

    /**
     * Sets the value of the flightCabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClass }
     *     
     */
    public void setFlightCabinClass(CabinClass value) {
        this.flightCabinClass = value;
    }

    /**
     * Gets the value of the preferredAirlines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPreferredAirlines() {
        return preferredAirlines;
    }

    /**
     * Sets the value of the preferredAirlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPreferredAirlines(ArrayOfString value) {
        this.preferredAirlines = value;
    }

}
