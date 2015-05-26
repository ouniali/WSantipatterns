
package hotel.ws_2013.cangooroo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.HotelResultBaseB;


/**
 * <p>Java class for HotelResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelResult">
 *   &lt;complexContent>
 *     &lt;extension base="{WS_2013.Hotel}HotelResultBase_b">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelResult")
@XmlSeeAlso({
    HotelResultWithAmenities.class
})
public class HotelResult
    extends HotelResultBaseB
{


}
