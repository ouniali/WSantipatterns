
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTicketItemPaxWiseInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTicketItemPaxWiseInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaxFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsReissued" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PendingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTicketItemPaxWiseInformation", propOrder = {
    "paxFirstName",
    "paxLastName",
    "ticketId",
    "isReissued",
    "pendingId",
    "paxType"
})
public class WSTicketItemPaxWiseInformation {

    @XmlElement(name = "PaxFirstName")
    protected String paxFirstName;
    @XmlElement(name = "PaxLastName")
    protected String paxLastName;
    @XmlElement(name = "TicketId")
    protected String ticketId;
    @XmlElement(name = "IsReissued")
    protected boolean isReissued;
    @XmlElement(name = "PendingId")
    protected String pendingId;
    @XmlElement(name = "PaxType")
    protected String paxType;

    /**
     * Gets the value of the paxFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxFirstName() {
        return paxFirstName;
    }

    /**
     * Sets the value of the paxFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxFirstName(String value) {
        this.paxFirstName = value;
    }

    /**
     * Gets the value of the paxLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxLastName() {
        return paxLastName;
    }

    /**
     * Sets the value of the paxLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxLastName(String value) {
        this.paxLastName = value;
    }

    /**
     * Gets the value of the ticketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * Sets the value of the ticketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketId(String value) {
        this.ticketId = value;
    }

    /**
     * Gets the value of the isReissued property.
     * 
     */
    public boolean isIsReissued() {
        return isReissued;
    }

    /**
     * Sets the value of the isReissued property.
     * 
     */
    public void setIsReissued(boolean value) {
        this.isReissued = value;
    }

    /**
     * Gets the value of the pendingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingId() {
        return pendingId;
    }

    /**
     * Sets the value of the pendingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingId(String value) {
        this.pendingId = value;
    }

    /**
     * Gets the value of the paxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxType() {
        return paxType;
    }

    /**
     * Sets the value of the paxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxType(String value) {
        this.paxType = value;
    }

}
