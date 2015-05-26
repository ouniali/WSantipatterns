
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.cangooroo.HotelResult;


/**
 * <p>Java class for HotelResultBase_b complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelResultBase_b">
 *   &lt;complexContent>
 *     &lt;extension base="{WS_2013.Hotel}HotelResultBase">
 *       &lt;sequence>
 *         &lt;element name="Rooms" type="{WS_2013.Hotel}ArrayOfRoomResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelResultBase_b", propOrder = {
    "rooms"
})
@XmlSeeAlso({
    HotelResult.class
})
public abstract class HotelResultBaseB
    extends HotelResultBase
{

    @XmlElement(name = "Rooms")
    protected ArrayOfRoomResult rooms;

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoomResult }
     *     
     */
    public ArrayOfRoomResult getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoomResult }
     *     
     */
    public void setRooms(ArrayOfRoomResult value) {
        this.rooms = value;
    }

}
