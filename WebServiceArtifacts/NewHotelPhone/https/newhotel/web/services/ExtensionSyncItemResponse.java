
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtensionSyncItemResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtensionSyncItemResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{https://NewHotel/Web/Services/}ExtensionResponse" minOccurs="0"/>
 *         &lt;element name="ReservationDetails" type="{https://NewHotel/Web/Services/}ReservationDetailsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionSyncItemResponse", propOrder = {
    "extension",
    "reservationDetails"
})
public class ExtensionSyncItemResponse {

    @XmlElement(name = "Extension")
    protected ExtensionResponse extension;
    @XmlElement(name = "ReservationDetails")
    protected ReservationDetailsResponse reservationDetails;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionResponse }
     *     
     */
    public ExtensionResponse getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionResponse }
     *     
     */
    public void setExtension(ExtensionResponse value) {
        this.extension = value;
    }

    /**
     * Gets the value of the reservationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationDetailsResponse }
     *     
     */
    public ReservationDetailsResponse getReservationDetails() {
        return reservationDetails;
    }

    /**
     * Sets the value of the reservationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationDetailsResponse }
     *     
     */
    public void setReservationDetails(ReservationDetailsResponse value) {
        this.reservationDetails = value;
    }

}
