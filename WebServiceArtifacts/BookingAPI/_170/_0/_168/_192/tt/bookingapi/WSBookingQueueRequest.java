
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSBookingQueueRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSBookingQueueRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartRow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EndRow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaxName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AirlineCSV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsApplyingFilters" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsHoldBookings" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAgencyLive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAgencyOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TotalRecordsPerPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSBookingQueueRequest", propOrder = {
    "startRow",
    "endRow",
    "pageNo",
    "paxName",
    "pnr",
    "airlineCSV",
    "isApplyingFilters",
    "isHoldBookings",
    "isAgencyLive",
    "isAgencyOnline",
    "totalRecordsPerPage"
})
public class WSBookingQueueRequest {

    @XmlElement(name = "StartRow")
    protected int startRow;
    @XmlElement(name = "EndRow")
    protected int endRow;
    @XmlElement(name = "PageNo")
    protected int pageNo;
    @XmlElement(name = "PaxName")
    protected String paxName;
    @XmlElement(name = "PNR")
    protected String pnr;
    @XmlElement(name = "AirlineCSV")
    protected String airlineCSV;
    @XmlElement(name = "IsApplyingFilters")
    protected boolean isApplyingFilters;
    @XmlElement(name = "IsHoldBookings")
    protected boolean isHoldBookings;
    @XmlElement(name = "IsAgencyLive")
    protected boolean isAgencyLive;
    @XmlElement(name = "IsAgencyOnline")
    protected boolean isAgencyOnline;
    @XmlElement(name = "TotalRecordsPerPage")
    protected int totalRecordsPerPage;

    /**
     * Gets the value of the startRow property.
     * 
     */
    public int getStartRow() {
        return startRow;
    }

    /**
     * Sets the value of the startRow property.
     * 
     */
    public void setStartRow(int value) {
        this.startRow = value;
    }

    /**
     * Gets the value of the endRow property.
     * 
     */
    public int getEndRow() {
        return endRow;
    }

    /**
     * Sets the value of the endRow property.
     * 
     */
    public void setEndRow(int value) {
        this.endRow = value;
    }

    /**
     * Gets the value of the pageNo property.
     * 
     */
    public int getPageNo() {
        return pageNo;
    }

    /**
     * Sets the value of the pageNo property.
     * 
     */
    public void setPageNo(int value) {
        this.pageNo = value;
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
     * Gets the value of the airlineCSV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCSV() {
        return airlineCSV;
    }

    /**
     * Sets the value of the airlineCSV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCSV(String value) {
        this.airlineCSV = value;
    }

    /**
     * Gets the value of the isApplyingFilters property.
     * 
     */
    public boolean isIsApplyingFilters() {
        return isApplyingFilters;
    }

    /**
     * Sets the value of the isApplyingFilters property.
     * 
     */
    public void setIsApplyingFilters(boolean value) {
        this.isApplyingFilters = value;
    }

    /**
     * Gets the value of the isHoldBookings property.
     * 
     */
    public boolean isIsHoldBookings() {
        return isHoldBookings;
    }

    /**
     * Sets the value of the isHoldBookings property.
     * 
     */
    public void setIsHoldBookings(boolean value) {
        this.isHoldBookings = value;
    }

    /**
     * Gets the value of the isAgencyLive property.
     * 
     */
    public boolean isIsAgencyLive() {
        return isAgencyLive;
    }

    /**
     * Sets the value of the isAgencyLive property.
     * 
     */
    public void setIsAgencyLive(boolean value) {
        this.isAgencyLive = value;
    }

    /**
     * Gets the value of the isAgencyOnline property.
     * 
     */
    public boolean isIsAgencyOnline() {
        return isAgencyOnline;
    }

    /**
     * Sets the value of the isAgencyOnline property.
     * 
     */
    public void setIsAgencyOnline(boolean value) {
        this.isAgencyOnline = value;
    }

    /**
     * Gets the value of the totalRecordsPerPage property.
     * 
     */
    public int getTotalRecordsPerPage() {
        return totalRecordsPerPage;
    }

    /**
     * Sets the value of the totalRecordsPerPage property.
     * 
     */
    public void setTotalRecordsPerPage(int value) {
        this.totalRecordsPerPage = value;
    }

}
