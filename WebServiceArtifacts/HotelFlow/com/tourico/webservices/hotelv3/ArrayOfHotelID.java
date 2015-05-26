
package com.tourico.webservices.hotelv3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHotelID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelID" type="{http://tourico.com/webservices/hotelv3}HotelID" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelID", propOrder = {
    "hotelID"
})
public class ArrayOfHotelID {

    @XmlElement(name = "HotelID", nillable = true)
    protected List<HotelID> hotelID;

    /**
     * Gets the value of the hotelID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelID }
     * 
     * 
     */
    public List<HotelID> getHotelID() {
        if (hotelID == null) {
            hotelID = new ArrayList<HotelID>();
        }
        return this.hotelID;
    }

}
