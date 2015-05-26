
package net.cangooroo.services.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.cangooroo.HotelResultWithAmenities;


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
 *         &lt;element name="getHotelDetailAndAmenitiesResult" type="{Cangooroo.WS_2013.Hotel}HotelResultWithAmenities" minOccurs="0"/>
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
    "getHotelDetailAndAmenitiesResult"
})
@XmlRootElement(name = "getHotelDetailAndAmenitiesResponse")
public class GetHotelDetailAndAmenitiesResponse {

    protected HotelResultWithAmenities getHotelDetailAndAmenitiesResult;

    /**
     * Gets the value of the getHotelDetailAndAmenitiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link HotelResultWithAmenities }
     *     
     */
    public HotelResultWithAmenities getGetHotelDetailAndAmenitiesResult() {
        return getHotelDetailAndAmenitiesResult;
    }

    /**
     * Sets the value of the getHotelDetailAndAmenitiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelResultWithAmenities }
     *     
     */
    public void setGetHotelDetailAndAmenitiesResult(HotelResultWithAmenities value) {
        this.getHotelDetailAndAmenitiesResult = value;
    }

}
