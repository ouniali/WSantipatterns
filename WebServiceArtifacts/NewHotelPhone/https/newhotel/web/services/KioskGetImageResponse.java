
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
 *         &lt;element name="KioskGetImageResult" type="{https://NewHotel/Web/Services/}KioskImageResponse" minOccurs="0"/>
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
    "kioskGetImageResult"
})
@XmlRootElement(name = "KioskGetImageResponse")
public class KioskGetImageResponse {

    @XmlElement(name = "KioskGetImageResult")
    protected KioskImageResponse kioskGetImageResult;

    /**
     * Gets the value of the kioskGetImageResult property.
     * 
     * @return
     *     possible object is
     *     {@link KioskImageResponse }
     *     
     */
    public KioskImageResponse getKioskGetImageResult() {
        return kioskGetImageResult;
    }

    /**
     * Sets the value of the kioskGetImageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskImageResponse }
     *     
     */
    public void setKioskGetImageResult(KioskImageResponse value) {
        this.kioskGetImageResult = value;
    }

}
