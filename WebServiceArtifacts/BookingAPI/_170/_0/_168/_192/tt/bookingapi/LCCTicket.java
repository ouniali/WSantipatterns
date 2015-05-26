
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
 *         &lt;element name="wsTicketRequest" type="{http://192.168.0.170/TT/BookingAPI}WSTicketRequest" minOccurs="0"/>
 *         &lt;element name="bookRequestXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wsTicketRequest",
    "bookRequestXML"
})
@XmlRootElement(name = "LCCTicket")
public class LCCTicket {

    protected WSTicketRequest wsTicketRequest;
    protected String bookRequestXML;

    /**
     * Gets the value of the wsTicketRequest property.
     * 
     * @return
     *     possible object is
     *     {@link WSTicketRequest }
     *     
     */
    public WSTicketRequest getWsTicketRequest() {
        return wsTicketRequest;
    }

    /**
     * Sets the value of the wsTicketRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTicketRequest }
     *     
     */
    public void setWsTicketRequest(WSTicketRequest value) {
        this.wsTicketRequest = value;
    }

    /**
     * Gets the value of the bookRequestXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookRequestXML() {
        return bookRequestXML;
    }

    /**
     * Sets the value of the bookRequestXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookRequestXML(String value) {
        this.bookRequestXML = value;
    }

}
