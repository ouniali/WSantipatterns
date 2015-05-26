
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskBaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskBaseRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ExternalChannelID" type="{http://microsoft.com/wsdl/types/}guid"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskBaseRequest", propOrder = {
    "externalChannelID"
})
@XmlSeeAlso({
    KioskAddReservationPaymentRequest.class,
    KioskGetRoomTypePricesRequest.class,
    KioskGetReservationRequest.class,
    KioskGetRoomTypesRequest.class,
    KioskCreateReservationDetailsRequest.class,
    KioskUpdateReservationDetailsRequest.class,
    KioskUpdateReservationGuestsRequest.class,
    KioskUpdateGroupStatusRequest.class,
    KioskGetRoomsRequest.class,
    KioskAssignRoomRequest.class,
    KioskUpdateReservationStatusRequest.class,
    KioskAddReservationUpsellItemsRequest.class,
    KioskFindReservationRequest.class,
    KioskImageRequest.class
})
public class KioskBaseRequest
    extends BaseRequest
{

    @XmlElement(name = "ExternalChannelID", required = true)
    protected String externalChannelID;

    /**
     * Gets the value of the externalChannelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalChannelID() {
        return externalChannelID;
    }

    /**
     * Sets the value of the externalChannelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalChannelID(String value) {
        this.externalChannelID = value;
    }

}
