
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
 *         &lt;element name="KioskUpdateReservationStatusResult" type="{https://NewHotel/Web/Services/}KioskReservationDetailResponse" minOccurs="0"/>
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
    "kioskUpdateReservationStatusResult"
})
@XmlRootElement(name = "KioskUpdateReservationStatusResponse")
public class KioskUpdateReservationStatusResponse {

    @XmlElement(name = "KioskUpdateReservationStatusResult")
    protected KioskReservationDetailResponse kioskUpdateReservationStatusResult;

    /**
     * Gets the value of the kioskUpdateReservationStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link KioskReservationDetailResponse }
     *     
     */
    public KioskReservationDetailResponse getKioskUpdateReservationStatusResult() {
        return kioskUpdateReservationStatusResult;
    }

    /**
     * Sets the value of the kioskUpdateReservationStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskReservationDetailResponse }
     *     
     */
    public void setKioskUpdateReservationStatusResult(KioskReservationDetailResponse value) {
        this.kioskUpdateReservationStatusResult = value;
    }

}
