
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
 *         &lt;element name="KioskAddReservationPaymentResult" type="{https://NewHotel/Web/Services/}KioskReservationDetailResponse" minOccurs="0"/>
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
    "kioskAddReservationPaymentResult"
})
@XmlRootElement(name = "KioskAddReservationPaymentResponse")
public class KioskAddReservationPaymentResponse {

    @XmlElement(name = "KioskAddReservationPaymentResult")
    protected KioskReservationDetailResponse kioskAddReservationPaymentResult;

    /**
     * Gets the value of the kioskAddReservationPaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link KioskReservationDetailResponse }
     *     
     */
    public KioskReservationDetailResponse getKioskAddReservationPaymentResult() {
        return kioskAddReservationPaymentResult;
    }

    /**
     * Sets the value of the kioskAddReservationPaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskReservationDetailResponse }
     *     
     */
    public void setKioskAddReservationPaymentResult(KioskReservationDetailResponse value) {
        this.kioskAddReservationPaymentResult = value;
    }

}
