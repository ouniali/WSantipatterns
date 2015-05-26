
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
 *         &lt;element name="KioskGetRoomTypesResult" type="{https://NewHotel/Web/Services/}KioskRoomTypeCollectionResponse" minOccurs="0"/>
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
    "kioskGetRoomTypesResult"
})
@XmlRootElement(name = "KioskGetRoomTypesResponse")
public class KioskGetRoomTypesResponse {

    @XmlElement(name = "KioskGetRoomTypesResult")
    protected KioskRoomTypeCollectionResponse kioskGetRoomTypesResult;

    /**
     * Gets the value of the kioskGetRoomTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link KioskRoomTypeCollectionResponse }
     *     
     */
    public KioskRoomTypeCollectionResponse getKioskGetRoomTypesResult() {
        return kioskGetRoomTypesResult;
    }

    /**
     * Sets the value of the kioskGetRoomTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskRoomTypeCollectionResponse }
     *     
     */
    public void setKioskGetRoomTypesResult(KioskRoomTypeCollectionResponse value) {
        this.kioskGetRoomTypesResult = value;
    }

}
