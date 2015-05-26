
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
 *         &lt;element name="KioskGetHotelSettingsResult" type="{https://NewHotel/Web/Services/}KioskHotelSettingsResponse" minOccurs="0"/>
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
    "kioskGetHotelSettingsResult"
})
@XmlRootElement(name = "KioskGetHotelSettingsResponse")
public class KioskGetHotelSettingsResponse {

    @XmlElement(name = "KioskGetHotelSettingsResult")
    protected KioskHotelSettingsResponse kioskGetHotelSettingsResult;

    /**
     * Gets the value of the kioskGetHotelSettingsResult property.
     * 
     * @return
     *     possible object is
     *     {@link KioskHotelSettingsResponse }
     *     
     */
    public KioskHotelSettingsResponse getKioskGetHotelSettingsResult() {
        return kioskGetHotelSettingsResult;
    }

    /**
     * Sets the value of the kioskGetHotelSettingsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskHotelSettingsResponse }
     *     
     */
    public void setKioskGetHotelSettingsResult(KioskHotelSettingsResponse value) {
        this.kioskGetHotelSettingsResult = value;
    }

}
