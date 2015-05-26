
package travel.caval._20091127.hotelbooking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cavalHotelBookingNotificationRQ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cavalHotelBookingNotificationRQ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://caval.travel/20091127/hotelBooking}abstractAuthenticatedAgencyRQ">
 *       &lt;sequence>
 *         &lt;element name="bookings" type="{http://caval.travel/20091127/hotelBooking}hotelBooking" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cavalHotelBookingNotificationRQ", propOrder = {
    "bookings"
})
public class CavalHotelBookingNotificationRQ
    extends AbstractAuthenticatedAgencyRQ
{

    @XmlElement(nillable = true)
    protected List<HotelBooking> bookings;

    /**
     * Gets the value of the bookings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelBooking }
     * 
     * 
     */
    public List<HotelBooking> getBookings() {
        if (bookings == null) {
            bookings = new ArrayList<HotelBooking>();
        }
        return this.bookings;
    }

}
