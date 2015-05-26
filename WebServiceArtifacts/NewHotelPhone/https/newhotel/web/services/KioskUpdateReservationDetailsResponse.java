
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
 *         &lt;element name="KioskUpdateReservationDetailsResult" type="{https://NewHotel/Web/Services/}KioskReservationDetailResponse" minOccurs="0"/>
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
    "kioskUpdateReservationDetailsResult"
})
@XmlRootElement(name = "KioskUpdateReservationDetailsResponse")
public class KioskUpdateReservationDetailsResponse {

    @XmlElement(name = "KioskUpdateReservationDetailsResult")
    protected KioskReservationDetailResponse kioskUpdateReservationDetailsResult;

    /**
     * Gets the value of the kioskUpdateReservationDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link KioskReservationDetailResponse }
     *     
     */
    public KioskReservationDetailResponse getKioskUpdateReservationDetailsResult() {
        return kioskUpdateReservationDetailsResult;
    }

    /**
     * Sets the value of the kioskUpdateReservationDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskReservationDetailResponse }
     *     
     */
    public void setKioskUpdateReservationDetailsResult(KioskReservationDetailResponse value) {
        this.kioskUpdateReservationDetailsResult = value;
    }

}
