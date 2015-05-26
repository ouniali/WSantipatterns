
package ws_2013.cangooroo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.HotelBookingRoomResult;


/**
 * <p>Java class for ArrayOfHotelBookingRoomResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelBookingRoomResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelBookingRoomResult" type="{WS_2013.Hotel}HotelBookingRoomResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelBookingRoomResult", propOrder = {
    "hotelBookingRoomResult"
})
public class ArrayOfHotelBookingRoomResult {

    @XmlElement(name = "HotelBookingRoomResult", nillable = true)
    protected List<HotelBookingRoomResult> hotelBookingRoomResult;

    /**
     * Gets the value of the hotelBookingRoomResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelBookingRoomResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelBookingRoomResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelBookingRoomResult }
     * 
     * 
     */
    public List<HotelBookingRoomResult> getHotelBookingRoomResult() {
        if (hotelBookingRoomResult == null) {
            hotelBookingRoomResult = new ArrayList<HotelBookingRoomResult>();
        }
        return this.hotelBookingRoomResult;
    }

}
