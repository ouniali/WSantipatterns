
package _170._0._168._192.tt.bookingapi;

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
 *         &lt;element name="AddBookingDetailResult" type="{http://192.168.0.170/TT/BookingAPI}WSAddBookingResponse" minOccurs="0"/>
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
    "addBookingDetailResult"
})
@XmlRootElement(name = "AddBookingDetailResponse")
public class AddBookingDetailResponse {

    @XmlElement(name = "AddBookingDetailResult")
    protected WSAddBookingResponse addBookingDetailResult;

    /**
     * Gets the value of the addBookingDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSAddBookingResponse }
     *     
     */
    public WSAddBookingResponse getAddBookingDetailResult() {
        return addBookingDetailResult;
    }

    /**
     * Sets the value of the addBookingDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSAddBookingResponse }
     *     
     */
    public void setAddBookingDetailResult(WSAddBookingResponse value) {
        this.addBookingDetailResult = value;
    }

}
