
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.tourico.schemas.webservices.BookInfo;


/**
 * <p>Java class for SearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Info" type="{http://schemas.tourico.com/webservices}BookInfo" minOccurs="0"/>
 *         &lt;element name="HotelList" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfHotel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResult", propOrder = {
    "info",
    "hotelList"
})
public class SearchResult {

    @XmlElement(name = "Info")
    protected BookInfo info;
    @XmlElement(name = "HotelList")
    protected ArrayOfHotel hotelList;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link BookInfo }
     *     
     */
    public BookInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookInfo }
     *     
     */
    public void setInfo(BookInfo value) {
        this.info = value;
    }

    /**
     * Gets the value of the hotelList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotel }
     *     
     */
    public ArrayOfHotel getHotelList() {
        return hotelList;
    }

    /**
     * Sets the value of the hotelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotel }
     *     
     */
    public void setHotelList(ArrayOfHotel value) {
        this.hotelList = value;
    }

}
