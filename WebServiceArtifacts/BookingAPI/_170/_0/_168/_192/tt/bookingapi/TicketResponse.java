
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
 *         &lt;element name="TicketResult" type="{http://192.168.0.170/TT/BookingAPI}WSTicketResponse" minOccurs="0"/>
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
    "ticketResult"
})
@XmlRootElement(name = "TicketResponse")
public class TicketResponse {

    @XmlElement(name = "TicketResult")
    protected WSTicketResponse ticketResult;

    /**
     * Gets the value of the ticketResult property.
     * 
     * @return
     *     possible object is
     *     {@link WSTicketResponse }
     *     
     */
    public WSTicketResponse getTicketResult() {
        return ticketResult;
    }

    /**
     * Sets the value of the ticketResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTicketResponse }
     *     
     */
    public void setTicketResult(WSTicketResponse value) {
        this.ticketResult = value;
    }

}
