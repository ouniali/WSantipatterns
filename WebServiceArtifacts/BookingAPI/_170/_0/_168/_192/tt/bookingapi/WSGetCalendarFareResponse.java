
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSGetCalendarFareResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSGetCalendarFareResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheapestFareOfEntireMonth" type="{http://192.168.0.170/TT/BookingAPI}WSCheapestFareOfEntireMonth" minOccurs="0"/>
 *         &lt;element name="LowestFareOfDayInMonth" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSLowestFareOfDayInMonth" minOccurs="0"/>
 *         &lt;element name="NewSearchParametersForCheapestFlight" type="{http://192.168.0.170/TT/BookingAPI}WSCheapestFlightSearchParameters" minOccurs="0"/>
 *         &lt;element name="SessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "WSGetCalendarFareResponse", propOrder = {
    "cheapestFareOfEntireMonth",
    "lowestFareOfDayInMonth",
    "newSearchParametersForCheapestFlight",
    "sessionId",
    "status"
})
public class WSGetCalendarFareResponse {

    @XmlElement(name = "CheapestFareOfEntireMonth")
    protected WSCheapestFareOfEntireMonth cheapestFareOfEntireMonth;
    @XmlElement(name = "LowestFareOfDayInMonth")
    protected ArrayOfWSLowestFareOfDayInMonth lowestFareOfDayInMonth;
    @XmlElement(name = "NewSearchParametersForCheapestFlight")
    protected WSCheapestFlightSearchParameters newSearchParametersForCheapestFlight;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElement(name = "Status")
    protected WSStatus status;

    /**
     * Gets the value of the cheapestFareOfEntireMonth property.
     * 
     * @return
     *     possible object is
     *     {@link WSCheapestFareOfEntireMonth }
     *     
     */
    public WSCheapestFareOfEntireMonth getCheapestFareOfEntireMonth() {
        return cheapestFareOfEntireMonth;
    }

    /**
     * Sets the value of the cheapestFareOfEntireMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCheapestFareOfEntireMonth }
     *     
     */
    public void setCheapestFareOfEntireMonth(WSCheapestFareOfEntireMonth value) {
        this.cheapestFareOfEntireMonth = value;
    }

    /**
     * Gets the value of the lowestFareOfDayInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSLowestFareOfDayInMonth }
     *     
     */
    public ArrayOfWSLowestFareOfDayInMonth getLowestFareOfDayInMonth() {
        return lowestFareOfDayInMonth;
    }

    /**
     * Sets the value of the lowestFareOfDayInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSLowestFareOfDayInMonth }
     *     
     */
    public void setLowestFareOfDayInMonth(ArrayOfWSLowestFareOfDayInMonth value) {
        this.lowestFareOfDayInMonth = value;
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
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
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
