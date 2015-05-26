
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
 *         &lt;element name="RoomStatusChangeResult" type="{https://NewHotel/Web/Services/}BaseResponse" minOccurs="0"/>
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
    "roomStatusChangeResult"
})
@XmlRootElement(name = "RoomStatusChangeResponse")
public class RoomStatusChangeResponse {

    @XmlElement(name = "RoomStatusChangeResult")
    protected BaseResponse roomStatusChangeResult;

    /**
     * Gets the value of the roomStatusChangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResponse }
     *     
     */
    public BaseResponse getRoomStatusChangeResult() {
        return roomStatusChangeResult;
    }

    /**
     * Sets the value of the roomStatusChangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResponse }
     *     
     */
    public void setRoomStatusChangeResult(BaseResponse value) {
        this.roomStatusChangeResult = value;
    }

}
