
package hotel.ws_2013.cangooroo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelResultWithAmenities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelResultWithAmenities">
 *   &lt;complexContent>
 *     &lt;extension base="{Cangooroo.WS_2013.Hotel}HotelResult">
 *       &lt;sequence>
 *         &lt;element name="Amenities" type="{Cangooroo.WS_2013.Hotel}ArrayOfAmenity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelResultWithAmenities", propOrder = {
    "amenities"
})
public class HotelResultWithAmenities
    extends HotelResult
{

    @XmlElement(name = "Amenities")
    protected ArrayOfAmenity amenities;

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAmenity }
     *     
     */
    public ArrayOfAmenity getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAmenity }
     *     
     */
    public void setAmenities(ArrayOfAmenity value) {
        this.amenities = value;
    }

}
