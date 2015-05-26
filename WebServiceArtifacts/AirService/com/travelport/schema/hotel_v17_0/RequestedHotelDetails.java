
package com.travelport.schema.hotel_v17_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Returns Hotel rate details for requested hotel property.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelProperty"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelDetailItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelRateDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelProperty",
    "hotelDetailItem",
    "hotelRateDetail"
})
@XmlRootElement(name = "RequestedHotelDetails")
public class RequestedHotelDetails {

    @XmlElement(name = "HotelProperty", required = true)
    protected HotelProperty hotelProperty;
    @XmlElement(name = "HotelDetailItem")
    protected List<HotelDetailItem> hotelDetailItem;
    @XmlElement(name = "HotelRateDetail")
    protected List<HotelRateDetail> hotelRateDetail;

    /**
     * Gets the value of the hotelProperty property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProperty }
     *     
     */
    public HotelProperty getHotelProperty() {
        return hotelProperty;
    }

    /**
     * Sets the value of the hotelProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProperty }
     *     
     */
    public void setHotelProperty(HotelProperty value) {
        this.hotelProperty = value;
    }

    /**
     * Gets the value of the hotelDetailItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelDetailItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelDetailItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelDetailItem }
     * 
     * 
     */
    public List<HotelDetailItem> getHotelDetailItem() {
        if (hotelDetailItem == null) {
            hotelDetailItem = new ArrayList<HotelDetailItem>();
        }
        return this.hotelDetailItem;
    }

    /**
     * Returns hotel rate details during the stay if rates are available for requested property Gets the value of the hotelRateDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRateDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRateDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRateDetail }
     * 
     * 
     */
    public List<HotelRateDetail> getHotelRateDetail() {
        if (hotelRateDetail == null) {
            hotelRateDetail = new ArrayList<HotelRateDetail>();
        }
        return this.hotelRateDetail;
    }

}
