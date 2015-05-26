
package hotel.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.cangooroo.HotelResultCancellationPolicy;


/**
 * <p>Java class for ResponseCancellationPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseCancellationPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectedHotel" type="{Cangooroo.WS_2013.Hotel}HotelResultCancellationPolicy" minOccurs="0"/>
 *         &lt;element name="StatusCancellationPolicy" type="{WS_2013.Hotel}eStatusCancellationPolicy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseCancellationPolicy", propOrder = {
    "token",
    "selectedHotel",
    "statusCancellationPolicy"
})
public class ResponseCancellationPolicy {

    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "SelectedHotel")
    protected HotelResultCancellationPolicy selectedHotel;
    @XmlElement(name = "StatusCancellationPolicy", required = true)
    @XmlSchemaType(name = "string")
    protected EStatusCancellationPolicy statusCancellationPolicy;

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
     * Gets the value of the selectedHotel property.
     * 
     * @return
     *     possible object is
     *     {@link HotelResultCancellationPolicy }
     *     
     */
    public HotelResultCancellationPolicy getSelectedHotel() {
        return selectedHotel;
    }

    /**
     * Sets the value of the selectedHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelResultCancellationPolicy }
     *     
     */
    public void setSelectedHotel(HotelResultCancellationPolicy value) {
        this.selectedHotel = value;
    }

    /**
     * Gets the value of the statusCancellationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link EStatusCancellationPolicy }
     *     
     */
    public EStatusCancellationPolicy getStatusCancellationPolicy() {
        return statusCancellationPolicy;
    }

    /**
     * Sets the value of the statusCancellationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EStatusCancellationPolicy }
     *     
     */
    public void setStatusCancellationPolicy(EStatusCancellationPolicy value) {
        this.statusCancellationPolicy = value;
    }

}
