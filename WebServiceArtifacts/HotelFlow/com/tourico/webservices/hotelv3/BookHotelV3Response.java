
package com.tourico.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.tourico.schemas.webservices.hotelv3.RGInfoResults;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookHotelV3Result" type="{http://schemas.tourico.com/webservices/hotelv3}RGInfoResults" minOccurs="0"/>
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
    "bookHotelV3Result"
})
@XmlRootElement(name = "BookHotelV3Response")
public class BookHotelV3Response {

    @XmlElement(name = "BookHotelV3Result")
    protected RGInfoResults bookHotelV3Result;

    /**
     * Gets the value of the bookHotelV3Result property.
     * 
     * @return
     *     possible object is
     *     {@link RGInfoResults }
     *     
     */
    public RGInfoResults getBookHotelV3Result() {
        return bookHotelV3Result;
    }

    /**
     * Sets the value of the bookHotelV3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link RGInfoResults }
     *     
     */
    public void setBookHotelV3Result(RGInfoResults value) {
        this.bookHotelV3Result = value;
    }

}
