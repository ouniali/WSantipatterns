
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KioskGetRoomsResult" type="{https://NewHotel/Web/Services/}KioskRoomCollectionResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kioskGetRoomsResult"
})
@XmlRootElement(name = "KioskGetRoomsResponse")
public class KioskGetRoomsResponse {

    @XmlElement(name = "KioskGetRoomsResult")
    protected KioskRoomCollectionResponse kioskGetRoomsResult;

    /**
     * Gets the value of the kioskGetRoomsResult property.
     * 
     * @return
     *     possible object is
     *     {@link KioskRoomCollectionResponse }
     *     
     */
    public KioskRoomCollectionResponse getKioskGetRoomsResult() {
        return kioskGetRoomsResult;
    }

    /**
     * Sets the value of the kioskGetRoomsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskRoomCollectionResponse }
     *     
     */
    public void setKioskGetRoomsResult(KioskRoomCollectionResponse value) {
        this.kioskGetRoomsResult = value;
    }

}
