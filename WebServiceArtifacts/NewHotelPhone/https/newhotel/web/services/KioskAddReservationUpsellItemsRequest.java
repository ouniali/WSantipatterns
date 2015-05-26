
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskAddReservationUpsellItemsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskAddReservationUpsellItemsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ReservationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpsellItemsIds" type="{https://NewHotel/Web/Services/}ArrayOfGuid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskAddReservationUpsellItemsRequest", propOrder = {
    "reservationName",
    "upsellItemsIds"
})
public class KioskAddReservationUpsellItemsRequest
    extends KioskBaseRequest
{

    @XmlElement(name = "ReservationName")
    protected String reservationName;
    @XmlElement(name = "UpsellItemsIds")
    protected ArrayOfGuid upsellItemsIds;

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

    /**
     * Gets the value of the upsellItemsIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGuid }
     *     
     */
    public ArrayOfGuid getUpsellItemsIds() {
        return upsellItemsIds;
    }

    /**
     * Sets the value of the upsellItemsIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGuid }
     *     
     */
    public void setUpsellItemsIds(ArrayOfGuid value) {
        this.upsellItemsIds = value;
    }

}
