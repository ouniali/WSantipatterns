
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
 *         &lt;element name="HotelInfoSummary" type="{http://www.rts.co.kr/}ST_GetHotelInfoSummaryNet"/>
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
    "hotelInfoSummary"
})
@XmlRootElement(name = "GetHotelInfoSummary")
public class GetHotelInfoSummary {

    @XmlElement(name = "HotelInfoSummary", required = true)
    protected STGetHotelInfoSummaryNet hotelInfoSummary;

    /**
     * Gets the value of the hotelInfoSummary property.
     * 
     * @return
     *     possible object is
     *     {@link STGetHotelInfoSummaryNet }
     *     
     */
    public STGetHotelInfoSummaryNet getHotelInfoSummary() {
        return hotelInfoSummary;
    }

    /**
     * Sets the value of the hotelInfoSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link STGetHotelInfoSummaryNet }
     *     
     */
    public void setHotelInfoSummary(STGetHotelInfoSummaryNet value) {
        this.hotelInfoSummary = value;
    }

}
