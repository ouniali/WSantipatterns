
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskUpdateReservationGuestsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskUpdateReservationGuestsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ReservationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Guests" type="{https://NewHotel/Web/Services/}ArrayOfKioskReservationGuest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskUpdateReservationGuestsRequest", propOrder = {
    "reservationName",
    "guests"
})
public class KioskUpdateReservationGuestsRequest
    extends KioskBaseRequest
{

    @XmlElement(name = "ReservationName")
    protected String reservationName;
    @XmlElement(name = "Guests")
    protected ArrayOfKioskReservationGuest guests;

    /**
     * Gets the value of the reservationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationName() {
        return reservationName;
    }

    /**
     * Sets the value of the reservationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationName(String value) {
        this.reservationName = value;
    }

    /**
     * Gets the value of the guests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskReservationGuest }
     *     
     */
    public ArrayOfKioskReservationGuest getGuests() {
        return guests;
    }

    /**
     * Sets the value of the guests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskReservationGuest }
     *     
     */
    public void setGuests(ArrayOfKioskReservationGuest value) {
        this.guests = value;
    }

}
