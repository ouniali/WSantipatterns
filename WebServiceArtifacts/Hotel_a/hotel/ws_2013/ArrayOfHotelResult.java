
package hotel.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.cangooroo.HotelResult;


/**
 * <p>Java class for ArrayOfHotelResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelResult" type="{Cangooroo.WS_2013.Hotel}HotelResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelResult", propOrder = {
    "hotelResult"
})
public class ArrayOfHotelResult {

    @XmlElement(name = "HotelResult", nillable = true)
    protected List<HotelResult> hotelResult;

    /**
     * Gets the value of the hotelResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelResult }
     * 
     * 
     */
    public List<HotelResult> getHotelResult() {
        if (hotelResult == null) {
            hotelResult = new ArrayList<HotelResult>();
        }
        return this.hotelResult;
    }

}
