
package kr.co.rts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="HotelSearchListNet" type="{http://www.rts.co.kr/}ST_GetHotelSearchListNet"/>
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
    "hotelSearchListNet"
})
@XmlRootElement(name = "GetHotelSearchList")
public class GetHotelSearchList {

    @XmlElement(name = "HotelSearchListNet", required = true)
    protected STGetHotelSearchListNet hotelSearchListNet;

    /**
     * Gets the value of the hotelSearchListNet property.
     * 
     * @return
     *     possible object is
     *     {@link STGetHotelSearchListNet }
     *     
     */
    public STGetHotelSearchListNet getHotelSearchListNet() {
        return hotelSearchListNet;
    }

    /**
     * Sets the value of the hotelSearchListNet property.
     * 
     * @param value
     *     allowed object is
     *     {@link STGetHotelSearchListNet }
     *     
     */
    public void setHotelSearchListNet(STGetHotelSearchListNet value) {
        this.hotelSearchListNet = value;
    }

}
