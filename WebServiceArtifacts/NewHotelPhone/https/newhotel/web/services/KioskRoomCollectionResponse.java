
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskRoomCollectionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskRoomCollectionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Rooms" type="{https://NewHotel/Web/Services/}ArrayOfKioskRoomInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskRoomCollectionResponse", propOrder = {
    "rooms"
})
public class KioskRoomCollectionResponse
    extends KioskBaseResponse
{

    @XmlElement(name = "Rooms")
    protected ArrayOfKioskRoomInfo rooms;

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskRoomInfo }
     *     
     */
    public ArrayOfKioskRoomInfo getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskRoomInfo }
     *     
     */
    public void setRooms(ArrayOfKioskRoomInfo value) {
        this.rooms = value;
    }

}
