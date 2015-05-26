
package com.tourico.schemas.webservices.hotelv3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermAndConditionsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermAndConditionsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelId" type="{http://schemas.tourico.com/webservices/hotelv3}HotelIdInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermAndConditionsRequest", propOrder = {
    "hotelId"
})
public class TermAndConditionsRequest {

    @XmlElement(name = "HotelId")
    protected List<HotelIdInfo> hotelId;

    /**
     * Gets the value of the hotelId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelIdInfo }
     * 
     * 
     */
    public List<HotelIdInfo> getHotelId() {
        if (hotelId == null) {
            hotelId = new ArrayList<HotelIdInfo>();
        }
        return this.hotelId;
    }

}
