
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="request" type="{https://NewHotel/Web/Services/}KioskUpdateReservationStatusRequest" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "KioskUpdateReservationStatus")
public class KioskUpdateReservationStatus {

    protected KioskUpdateReservationStatusRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link KioskUpdateReservationStatusRequest }
     *     
     */
    public KioskUpdateReservationStatusRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskUpdateReservationStatusRequest }
     *     
     */
    public void setRequest(KioskUpdateReservationStatusRequest value) {
        this.request = value;
    }

}
