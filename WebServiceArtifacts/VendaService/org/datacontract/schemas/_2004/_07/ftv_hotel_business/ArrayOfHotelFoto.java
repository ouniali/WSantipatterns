
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHotelFoto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelFoto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelFoto" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}HotelFoto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelFoto", propOrder = {
    "hotelFoto"
})
public class ArrayOfHotelFoto {

    @XmlElement(name = "HotelFoto", nillable = true)
    protected List<HotelFoto> hotelFoto;

    /**
     * Gets the value of the hotelFoto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelFoto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelFoto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelFoto }
     * 
     * 
     */
    public List<HotelFoto> getHotelFoto() {
        if (hotelFoto == null) {
            hotelFoto = new ArrayList<HotelFoto>();
        }
        return this.hotelFoto;
    }

}
