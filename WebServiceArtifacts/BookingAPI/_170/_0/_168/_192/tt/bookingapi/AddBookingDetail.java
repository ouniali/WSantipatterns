
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="saveRequest" type="{http://192.168.0.170/TT/BookingAPI}WSAddBookingRequest" minOccurs="0"/>
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
    "saveRequest"
})
@XmlRootElement(name = "AddBookingDetail")
public class AddBookingDetail {

    protected WSAddBookingRequest saveRequest;

    /**
     * Gets the value of the saveRequest property.
     * 
     * @return
     *     possible object is
     *     {@link WSAddBookingRequest }
     *     
     */
    public WSAddBookingRequest getSaveRequest() {
        return saveRequest;
    }

    /**
     * Sets the value of the saveRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSAddBookingRequest }
     *     
     */
    public void setSaveRequest(WSAddBookingRequest value) {
        this.saveRequest = value;
    }

}
