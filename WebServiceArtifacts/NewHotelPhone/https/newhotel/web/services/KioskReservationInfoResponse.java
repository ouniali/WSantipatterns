
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskReservationInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskReservationInfoResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Reservations" type="{https://NewHotel/Web/Services/}ArrayOfKioskReservationInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskReservationInfoResponse", propOrder = {
    "reservations"
})
public class KioskReservationInfoResponse
    extends KioskBaseResponse
{

    @XmlElement(name = "Reservations")
    protected ArrayOfKioskReservationInfo reservations;

    /**
     * Gets the value of the reservations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskReservationInfo }
     *     
     */
    public ArrayOfKioskReservationInfo getReservations() {
        return reservations;
    }

    /**
     * Sets the value of the reservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskReservationInfo }
     *     
     */
    public void setReservations(ArrayOfKioskReservationInfo value) {
        this.reservations = value;
    }

}
