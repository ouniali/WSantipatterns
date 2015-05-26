
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskGetReservationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskGetReservationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="GroupReservationId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="GroupReservationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ReservationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskGetReservationRequest", propOrder = {
    "groupReservationId",
    "groupReservationName",
    "reservationId",
    "reservationName"
})
public class KioskGetReservationRequest
    extends KioskBaseRequest
{

    @XmlElement(name = "GroupReservationId", required = true, nillable = true)
    protected String groupReservationId;
    @XmlElement(name = "GroupReservationName")
    protected String groupReservationName;
    @XmlElement(name = "ReservationId", required = true, nillable = true)
    protected String reservationId;
    @XmlElement(name = "ReservationName")
    protected String reservationName;

    /**
     * Gets the value of the groupReservationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupReservationId() {
        return groupReservationId;
    }

    /**
     * Sets the value of the groupReservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupReservationId(String value) {
        this.groupReservationId = value;
    }

    /**
     * Gets the value of the groupReservationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupReservationName() {
        return groupReservationName;
    }

    /**
     * Sets the value of the groupReservationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupReservationName(String value) {
        this.groupReservationName = value;
    }

    /**
     * Gets the value of the reservationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationId(String value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the reservationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationName() {
        return reservationName;
    }

    /**
     * Sets the value of the reservationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationName(String value) {
        this.reservationName = value;
    }

}
