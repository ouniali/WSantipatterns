
package hotel.ws_2013.cangooroo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.HotelResultBase;


/**
 * <p>Java class for HotelResultCancellationPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelResultCancellationPolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{WS_2013.Hotel}HotelResultBase">
 *       &lt;sequence>
 *         &lt;element name="Rooms" type="{Cangooroo.WS_2013.Hotel}ArrayOfRoomResultCancellationPolicies" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelResultCancellationPolicy", propOrder = {
    "rooms"
})
public class HotelResultCancellationPolicy
    extends HotelResultBase
{

    @XmlElement(name = "Rooms")
    protected ArrayOfRoomResultCancellationPolicies rooms;

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomResultCancellationPolicies }
     *     
     */
    public ArrayOfRoomResultCancellationPolicies getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomResultCancellationPolicies }
     *     
     */
    public void setRooms(ArrayOfRoomResultCancellationPolicies value) {
        this.rooms = value;
    }

}
