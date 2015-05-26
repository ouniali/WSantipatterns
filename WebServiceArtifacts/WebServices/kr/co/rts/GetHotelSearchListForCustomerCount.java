
package kr.co.rts;

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
 *         &lt;element name="HotelSearchListNetGuestCount" type="{http://www.rts.co.kr/}ST_GetHotelSearchListNetForGuestCount"/>
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
    "hotelSearchListNetGuestCount"
})
@XmlRootElement(name = "GetHotelSearchListForCustomerCount")
public class GetHotelSearchListForCustomerCount {

    @XmlElement(name = "HotelSearchListNetGuestCount", required = true)
    protected STGetHotelSearchListNetForGuestCount hotelSearchListNetGuestCount;

    /**
     * Gets the value of the hotelSearchListNetGuestCount property.
     * 
     * @return
     *     possible object is
     *     {@link STGetHotelSearchListNetForGuestCount }
     *     
     */
    public STGetHotelSearchListNetForGuestCount getHotelSearchListNetGuestCount() {
        return hotelSearchListNetGuestCount;
    }

    /**
     * Sets the value of the hotelSearchListNetGuestCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link STGetHotelSearchListNetForGuestCount }
     *     
     */
    public void setHotelSearchListNetGuestCount(STGetHotelSearchListNetForGuestCount value) {
        this.hotelSearchListNetGuestCount = value;
    }

}
