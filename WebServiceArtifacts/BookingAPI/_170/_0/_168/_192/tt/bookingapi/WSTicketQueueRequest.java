
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTicketQueueRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTicketQueueRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AgencyRole" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AirlineCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaxName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfDataOnEachPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTicketQueueRequest", propOrder = {
    "agencyId",
    "agencyRole",
    "airlineCodes",
    "paxName",
    "pnr",
    "ticketNumber",
    "numberOfDataOnEachPage",
    "pageNumber"
})
public class WSTicketQueueRequest {

    @XmlElement(name = "AgencyId")
    protected int agencyId;
    @XmlElement(name = "AgencyRole")
    protected int agencyRole;
    @XmlElement(name = "AirlineCodes")
    protected String airlineCodes;
    @XmlElement(name = "PaxName")
    protected String paxName;
    @XmlElement(name = "PNR")
    protected String pnr;
    @XmlElement(name = "TicketNumber")
    protected String ticketNumber;
    @XmlElement(name = "NumberOfDataOnEachPage")
    protected int numberOfDataOnEachPage;
    @XmlElement(name = "PageNumber")
    protected int pageNumber;

    /**
     * Gets the value of the agencyId property.
     * 
     */
    public int getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     */
    public void setAgencyId(int value) {
        this.agencyId = value;
    }

    /**
     * Gets the value of the agencyRole property.
     * 
     */
    public int getAgencyRole() {
        return agencyRole;
    }

    /**
     * Sets the value of the agencyRole property.
     * 
     */
    public void setAgencyRole(int value) {
        this.agencyRole = value;
    }

    /**
     * Gets the value of the airlineCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCodes() {
        return airlineCodes;
    }

    /**
     * Sets the value of the airlineCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCodes(String value) {
        this.airlineCodes = value;
    }

    /**
     * Gets the value of the paxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxName() {
        return paxName;
    }

    /**
     * Sets the value of the paxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxName(String value) {
        this.paxName = value;
    }

    /**
     * Gets the value of the pnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNR() {
        return pnr;
    }

    /**
     * Sets the value of the pnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNR(String value) {
        this.pnr = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the numberOfDataOnEachPage property.
     * 
     */
    public int getNumberOfDataOnEachPage() {
        return numberOfDataOnEachPage;
    }

    /**
     * Sets the value of the numberOfDataOnEachPage property.
     * 
     */
    public void setNumberOfDataOnEachPage(int value) {
        this.numberOfDataOnEachPage = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

}
