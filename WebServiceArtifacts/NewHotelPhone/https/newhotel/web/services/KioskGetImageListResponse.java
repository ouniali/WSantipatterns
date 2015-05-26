
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
 *         &lt;element name="KioskGetImageListResult" type="{https://NewHotel/Web/Services/}KioskImageCollectionResponse" minOccurs="0"/>
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
    "kioskGetImageListResult"
})
@XmlRootElement(name = "KioskGetImageListResponse")
public class KioskGetImageListResponse {

    @XmlElement(name = "KioskGetImageListResult")
    protected KioskImageCollectionResponse kioskGetImageListResult;

    /**
     * Gets the value of the kioskGetImageListResult property.
     * 
     * @return
     *     possible object is
     *     {@link KioskImageCollectionResponse }
     *     
     */
    public KioskImageCollectionResponse getKioskGetImageListResult() {
        return kioskGetImageListResult;
    }

    /**
     * Sets the value of the kioskGetImageListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskImageCollectionResponse }
     *     
     */
    public void setKioskGetImageListResult(KioskImageCollectionResponse value) {
        this.kioskGetImageListResult = value;
    }

}
