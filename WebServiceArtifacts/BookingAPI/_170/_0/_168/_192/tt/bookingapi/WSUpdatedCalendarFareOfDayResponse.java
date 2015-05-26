
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSUpdatedCalendarFareOfDayResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSUpdatedCalendarFareOfDayResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheapestFareOfDay" type="{http://192.168.0.170/TT/BookingAPI}WSCheapestFareOfDay" minOccurs="0"/>
 *         &lt;element name="NewSearchParametersForCheapestFlight" type="{http://192.168.0.170/TT/BookingAPI}WSCheapestFlightSearchParameters" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://192.168.0.170/TT/BookingAPI}WSStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSUpdatedCalendarFareOfDayResponse", propOrder = {
    "cheapestFareOfDay",
    "newSearchParametersForCheapestFlight",
    "status"
})
public class WSUpdatedCalendarFareOfDayResponse {

    @XmlElement(name = "CheapestFareOfDay")
    protected WSCheapestFareOfDay cheapestFareOfDay;
    @XmlElement(name = "NewSearchParametersForCheapestFlight")
    protected WSCheapestFlightSearchParameters newSearchParametersForCheapestFlight;
    @XmlElement(name = "Status")
    protected WSStatus status;

    /**
     * Gets the value of the cheapestFareOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link WSCheapestFareOfDay }
     *     
     */
    public WSCheapestFareOfDay getCheapestFareOfDay() {
        return cheapestFareOfDay;
    }

    /**
     * Sets the value of the cheapestFareOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCheapestFareOfDay }
     *     
     */
    public void setCheapestFareOfDay(WSCheapestFareOfDay value) {
        this.cheapestFareOfDay = value;
    }

    /**
     * Gets the value of the newSearchParametersForCheapestFlight property.
     * 
     * @return
     *     possible object is
     *     {@link WSCheapestFlightSearchParameters }
     *     
     */
    public WSCheapestFlightSearchParameters getNewSearchParametersForCheapestFlight() {
        return newSearchParametersForCheapestFlight;
    }

    /**
     * Sets the value of the newSearchParametersForCheapestFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCheapestFlightSearchParameters }
     *     
     */
    public void setNewSearchParametersForCheapestFlight(WSCheapestFlightSearchParameters value) {
        this.newSearchParametersForCheapestFlight = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WSStatus }
     *     
     */
    public WSStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSStatus }
     *     
     */
    public void setStatus(WSStatus value) {
        this.status = value;
    }

}
