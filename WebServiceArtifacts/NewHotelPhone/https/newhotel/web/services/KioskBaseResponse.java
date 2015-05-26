
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KioskBaseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskBaseResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseResponse">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskBaseResponse")
@XmlSeeAlso({
    KioskHotelSettingsResponse.class,
    KioskRoomTypePricesCollectionResponse.class,
    KioskImageResponse.class,
    KioskImageCollectionResponse.class,
    KioskReservationDetailResponse.class,
    KioskReservationInfoResponse.class,
    KioskRoomCollectionResponse.class,
    KioskRoomTypeCollectionResponse.class
})
public class KioskBaseResponse
    extends BaseResponse
{


}
