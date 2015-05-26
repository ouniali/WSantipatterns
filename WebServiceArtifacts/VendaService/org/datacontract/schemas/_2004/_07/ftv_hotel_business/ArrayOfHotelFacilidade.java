
package org.datacontract.schemas._2004._07.ftv_hotel_business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHotelFacilidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelFacilidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelFacilidade" type="{http://schemas.datacontract.org/2004/07/FTV.Hotel.Business.Data}HotelFacilidade" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelFacilidade", propOrder = {
    "hotelFacilidade"
})
public class ArrayOfHotelFacilidade {

    @XmlElement(name = "HotelFacilidade", nillable = true)
    protected List<HotelFacilidade> hotelFacilidade;

    /**
     * Gets the value of the hotelFacilidade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelFacilidade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelFacilidade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelFacilidade }
     * 
     * 
     */
    public List<HotelFacilidade> getHotelFacilidade() {
        if (hotelFacilidade == null) {
            hotelFacilidade = new ArrayList<HotelFacilidade>();
        }
        return this.hotelFacilidade;
    }

}
