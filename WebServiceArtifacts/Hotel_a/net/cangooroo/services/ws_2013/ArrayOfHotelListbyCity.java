
package net.cangooroo.services.ws_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import hotel.ws_2013.HotelListbyCity;


/**
 * <p>Java class for ArrayOfHotelListbyCity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelListbyCity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelListbyCity" type="{WS_2013.Hotel}HotelListbyCity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelListbyCity", propOrder = {
    "hotelListbyCity"
})
public class ArrayOfHotelListbyCity {

    @XmlElement(name = "HotelListbyCity", nillable = true)
    protected List<HotelListbyCity> hotelListbyCity;

    /**
     * Gets the value of the hotelListbyCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelListbyCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelListbyCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelListbyCity }
     * 
     * 
     */
    public List<HotelListbyCity> getHotelListbyCity() {
        if (hotelListbyCity == null) {
            hotelListbyCity = new ArrayList<HotelListbyCity>();
        }
        return this.hotelListbyCity;
    }

}
