
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskReservationDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskReservationDetailResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseResponse">
 *       &lt;sequence>
 *         &lt;element name="GroupReservationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsGroup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GroupReservationId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Reservations" type="{https://NewHotel/Web/Services/}ArrayOfKioskReservationDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskReservationDetailResponse", propOrder = {
    "groupReservationName",
    "isGroup",
    "groupReservationId",
    "reservations"
})
public class KioskReservationDetailResponse
    extends KioskBaseResponse
{

    @XmlElement(name = "GroupReservationName")
    protected String groupReservationName;
    @XmlElement(name = "IsGroup")
    protected boolean isGroup;
    @XmlElement(name = "GroupReservationId", required = true)
    protected String groupReservationId;
    @XmlElement(name = "Reservations")
    protected ArrayOfKioskReservationDetail reservations;

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
     * Gets the value of the isGroup property.
     * 
     */
    public boolean isIsGroup() {
        return isGroup;
    }

    /**
     * Sets the value of the isGroup property.
     * 
     */
    public void setIsGroup(boolean value) {
        this.isGroup = value;
    }

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
     * Gets the value of the reservations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKioskReservationDetail }
     *     
     */
    public ArrayOfKioskReservationDetail getReservations() {
        return reservations;
    }

    /**
     * Sets the value of the reservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKioskReservationDetail }
     *     
     */
    public void setReservations(ArrayOfKioskReservationDetail value) {
        this.reservations = value;
    }

}
