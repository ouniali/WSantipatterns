
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
 *         &lt;element name="KioskFindReservationResult" type="{https://NewHotel/Web/Services/}KioskReservationInfoResponse" minOccurs="0"/>
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
    "kioskFindReservationResult"
})
@XmlRootElement(name = "KioskFindReservationResponse")
public class KioskFindReservationResponse {

    @XmlElement(name = "KioskFindReservationResult")
    protected KioskReservationInfoResponse kioskFindReservationResult;

    /**
     * Gets the value of the kioskFindReservationResult property.
     * 
     * @return
     *     possible object is
     *     {@link KioskReservationInfoResponse }
     *     
     */
    public KioskReservationInfoResponse getKioskFindReservationResult() {
        return kioskFindReservationResult;
    }

    /**
     * Sets the value of the kioskFindReservationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskReservationInfoResponse }
     *     
     */
    public void setKioskFindReservationResult(KioskReservationInfoResponse value) {
        this.kioskFindReservationResult = value;
    }

}
