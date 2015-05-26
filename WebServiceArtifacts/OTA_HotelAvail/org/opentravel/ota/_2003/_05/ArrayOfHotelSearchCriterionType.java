
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHotelSearchCriterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelSearchCriterionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelSearchCriterionType" type="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriterionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelSearchCriterionType", propOrder = {
    "hotelSearchCriterionType"
})
public class ArrayOfHotelSearchCriterionType {

    @XmlElement(name = "HotelSearchCriterionType", nillable = true)
    protected List<HotelSearchCriterionType> hotelSearchCriterionType;

    /**
     * Gets the value of the hotelSearchCriterionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelSearchCriterionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelSearchCriterionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelSearchCriterionType }
     * 
     * 
     */
    public List<HotelSearchCriterionType> getHotelSearchCriterionType() {
        if (hotelSearchCriterionType == null) {
            hotelSearchCriterionType = new ArrayList<HotelSearchCriterionType>();
        }
        return this.hotelSearchCriterionType;
    }

}
