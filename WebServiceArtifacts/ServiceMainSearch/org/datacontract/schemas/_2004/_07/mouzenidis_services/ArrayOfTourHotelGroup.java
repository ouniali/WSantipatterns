
package org.datacontract.schemas._2004._07.mouzenidis_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTourHotelGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTourHotelGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TourHotelGroup" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}TourHotelGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTourHotelGroup", propOrder = {
    "tourHotelGroup"
})
public class ArrayOfTourHotelGroup {

    @XmlElement(name = "TourHotelGroup", nillable = true)
    protected List<TourHotelGroup> tourHotelGroup;

    /**
     * Gets the value of the tourHotelGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourHotelGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourHotelGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourHotelGroup }
     * 
     * 
     */
    public List<TourHotelGroup> getTourHotelGroup() {
        if (tourHotelGroup == null) {
            tourHotelGroup = new ArrayList<TourHotelGroup>();
        }
        return this.tourHotelGroup;
    }

}
