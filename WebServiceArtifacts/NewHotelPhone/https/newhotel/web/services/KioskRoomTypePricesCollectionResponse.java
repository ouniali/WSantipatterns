
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskRoomTypePricesCollectionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskRoomTypePricesCollectionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseResponse">
 *       &lt;sequence>
 *         &lt;element name="RoomTypePrices" type="{https://NewHotel/Web/Services/}ArrayOfKioskRoomTypePriceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskRoomTypePricesCollectionResponse", propOrder = {
    "roomTypePrices"
})
public class KioskRoomTypePricesCollectionResponse
    extends KioskBaseResponse
{

    @XmlElement(name = "RoomTypePrices")
    protected ArrayOfKioskRoomTypePriceInfo roomTypePrices;

    /**
     * Gets the value of the roomTypePrices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskRoomTypePriceInfo }
     *     
     */
    public ArrayOfKioskRoomTypePriceInfo getRoomTypePrices() {
        return roomTypePrices;
    }

    /**
     * Sets the value of the roomTypePrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskRoomTypePriceInfo }
     *     
     */
    public void setRoomTypePrices(ArrayOfKioskRoomTypePriceInfo value) {
        this.roomTypePrices = value;
    }

}
