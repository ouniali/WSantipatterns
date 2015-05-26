
package org.datacontract.schemas._2004._07.mouzenidis_services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTourHotelVariant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTourHotelVariant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TourHotelVariant" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}TourHotelVariant" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTourHotelVariant", propOrder = {
    "tourHotelVariant"
})
public class ArrayOfTourHotelVariant {

    @XmlElement(name = "TourHotelVariant", nillable = true)
    protected List<TourHotelVariant> tourHotelVariant;

    /**
     * Gets the value of the tourHotelVariant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourHotelVariant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourHotelVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourHotelVariant }
     * 
     * 
     */
    public List<TourHotelVariant> getTourHotelVariant() {
        if (tourHotelVariant == null) {
            tourHotelVariant = new ArrayList<TourHotelVariant>();
        }
        return this.tourHotelVariant;
    }

}
