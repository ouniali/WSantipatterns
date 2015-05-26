
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskRoomTypeCollectionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskRoomTypeCollectionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseResponse">
 *       &lt;sequence>
 *         &lt;element name="RoomTypes" type="{https://NewHotel/Web/Services/}ArrayOfKioskRoomTypeInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskRoomTypeCollectionResponse", propOrder = {
    "roomTypes"
})
public class KioskRoomTypeCollectionResponse
    extends KioskBaseResponse
{

    @XmlElement(name = "RoomTypes")
    protected ArrayOfKioskRoomTypeInfo roomTypes;

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskRoomTypeInfo }
     *     
     */
    public ArrayOfKioskRoomTypeInfo getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskRoomTypeInfo }
     *     
     */
    public void setRoomTypes(ArrayOfKioskRoomTypeInfo value) {
        this.roomTypes = value;
    }

}
