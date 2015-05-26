
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
 *         &lt;element name="calanderFareRequest" type="{http://192.168.0.170/TT/BookingAPI}WSGetCalendarFareRequest" minOccurs="0"/>
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
    "calanderFareRequest"
})
@XmlRootElement(name = "GetCalendarFare")
public class GetCalendarFare {

    protected WSGetCalendarFareRequest calanderFareRequest;

    /**
     * Gets the value of the calanderFareRequest property.
     * 
     * @return
     *     possible object is
     *     {@link WSGetCalendarFareRequest }
     *     
     */
    public WSGetCalendarFareRequest getCalanderFareRequest() {
        return calanderFareRequest;
    }

    /**
     * Sets the value of the calanderFareRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSGetCalendarFareRequest }
     *     
     */
    public void setCalanderFareRequest(WSGetCalendarFareRequest value) {
        this.calanderFareRequest = value;
    }

}
