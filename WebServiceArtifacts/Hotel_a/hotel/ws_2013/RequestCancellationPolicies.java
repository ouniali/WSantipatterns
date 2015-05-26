
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestCancellationPolicies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestCancellationPolicies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RoomsIds" type="{WS_2013.Hotel}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestCancellationPolicies", propOrder = {
    "token",
    "hotelId",
    "roomsIds"
})
public class RequestCancellationPolicies {

    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "RoomsIds")
    protected ArrayOfString roomsIds;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     */
    public int getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     */
    public void setHotelId(int value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the roomsIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getRoomsIds() {
        return roomsIds;
    }

    /**
     * Sets the value of the roomsIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setRoomsIds(ArrayOfString value) {
        this.roomsIds = value;
    }

}
