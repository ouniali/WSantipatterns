
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHotelLocalizacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelLocalizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelLocalizacao" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}HotelLocalizacao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelLocalizacao", propOrder = {
    "hotelLocalizacao"
})
public class ArrayOfHotelLocalizacao {

    @XmlElement(name = "HotelLocalizacao", nillable = true)
    protected List<HotelLocalizacao> hotelLocalizacao;

    /**
     * Gets the value of the hotelLocalizacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelLocalizacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelLocalizacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelLocalizacao }
     * 
     * 
     */
    public List<HotelLocalizacao> getHotelLocalizacao() {
        if (hotelLocalizacao == null) {
            hotelLocalizacao = new ArrayList<HotelLocalizacao>();
        }
        return this.hotelLocalizacao;
    }

}
