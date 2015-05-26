
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
 *         &lt;element name="updateRequest" type="{http://192.168.0.170/TT/BookingAPI}WSUpdatedCalendarFareOfDayRequest" minOccurs="0"/>
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
    "updateRequest"
})
@XmlRootElement(name = "UpdateCalendarFareOfDay")
public class UpdateCalendarFareOfDay {

    protected WSUpdatedCalendarFareOfDayRequest updateRequest;

    /**
     * Gets the value of the updateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link WSUpdatedCalendarFareOfDayRequest }
     *     
     */
    public WSUpdatedCalendarFareOfDayRequest getUpdateRequest() {
        return updateRequest;
    }

    /**
     * Sets the value of the updateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSUpdatedCalendarFareOfDayRequest }
     *     
     */
    public void setUpdateRequest(WSUpdatedCalendarFareOfDayRequest value) {
        this.updateRequest = value;
    }

}
