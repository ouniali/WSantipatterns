
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTicketQueueResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTicketQueueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketList" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfWSTicketItem" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://192.168.0.170/TT/BookingAPI}WSStatus" minOccurs="0"/>
 *         &lt;element name="NoOfTickets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTicketQueueResponse", propOrder = {
    "ticketList",
    "status",
    "noOfTickets"
})
public class WSTicketQueueResponse {

    @XmlElement(name = "TicketList")
    protected ArrayOfWSTicketItem ticketList;
    @XmlElement(name = "Status")
    protected WSStatus status;
    @XmlElement(name = "NoOfTickets")
    protected int noOfTickets;

    /**
     * Gets the value of the ticketList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSTicketItem }
     *     
     */
    public ArrayOfWSTicketItem getTicketList() {
        return ticketList;
    }

    /**
     * Sets the value of the ticketList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSTicketItem }
     *     
     */
    public void setTicketList(ArrayOfWSTicketItem value) {
        this.ticketList = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WSStatus }
     *     
     */
    public WSStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSStatus }
     *     
     */
    public void setStatus(WSStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the noOfTickets property.
     * 
     */
    public int getNoOfTickets() {
        return noOfTickets;
    }

    /**
     * Sets the value of the noOfTickets property.
     * 
     */
    public void setNoOfTickets(int value) {
        this.noOfTickets = value;
    }

}
