
package _170._0._168._192.tt.bookingapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSChangeRequestQueueRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSChangeRequestQueueRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PageNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RecPerPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestTypeCSV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceRequestTypeCSV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="airlineCSV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agencyIdCSV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paxName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Check" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVoid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsChangRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsRefund" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsUnAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAcknowledged" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsRejected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsClosed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsPending" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSChangeRequestQueueRequest", propOrder = {
    "pageNo",
    "recPerPage",
    "requestTypeCSV",
    "serviceRequestTypeCSV",
    "airlineCSV",
    "agencyIdCSV",
    "paxName",
    "pnr",
    "ticketNumber",
    "check",
    "isVoid",
    "isChangRequest",
    "isRefund",
    "isUnAssigned",
    "isAssigned",
    "isAcknowledged",
    "isCompleted",
    "isRejected",
    "isClosed",
    "isPending"
})
public class WSChangeRequestQueueRequest {

    @XmlElement(name = "PageNo")
    protected int pageNo;
    @XmlElement(name = "RecPerPage")
    protected int recPerPage;
    @XmlElement(name = "RequestTypeCSV")
    protected String requestTypeCSV;
    protected String serviceRequestTypeCSV;
    protected String airlineCSV;
    protected String agencyIdCSV;
    protected String paxName;
    protected String pnr;
    protected String ticketNumber;
    @XmlElement(name = "Check")
    protected int check;
    @XmlElement(name = "IsVoid")
    protected boolean isVoid;
    @XmlElement(name = "IsChangRequest")
    protected boolean isChangRequest;
    @XmlElement(name = "IsRefund")
    protected boolean isRefund;
    @XmlElement(name = "IsUnAssigned")
    protected boolean isUnAssigned;
    @XmlElement(name = "IsAssigned")
    protected boolean isAssigned;
    @XmlElement(name = "IsAcknowledged")
    protected boolean isAcknowledged;
    @XmlElement(name = "IsCompleted")
    protected boolean isCompleted;
    @XmlElement(name = "IsRejected")
    protected boolean isRejected;
    @XmlElement(name = "IsClosed")
    protected boolean isClosed;
    @XmlElement(name = "IsPending")
    protected boolean isPending;

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
     * Gets the value of the recPerPage property.
     * 
     */
    public int getRecPerPage() {
        return recPerPage;
    }

    /**
     * Sets the value of the recPerPage property.
     * 
     */
    public void setRecPerPage(int value) {
        this.recPerPage = value;
    }

    /**
     * Gets the value of the requestTypeCSV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTypeCSV() {
        return requestTypeCSV;
    }

    /**
     * Sets the value of the requestTypeCSV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTypeCSV(String value) {
        this.requestTypeCSV = value;
    }

    /**
     * Gets the value of the serviceRequestTypeCSV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRequestTypeCSV() {
        return serviceRequestTypeCSV;
    }

    /**
     * Sets the value of the serviceRequestTypeCSV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRequestTypeCSV(String value) {
        this.serviceRequestTypeCSV = value;
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
     * Gets the value of the agencyIdCSV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyIdCSV() {
        return agencyIdCSV;
    }

    /**
     * Sets the value of the agencyIdCSV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyIdCSV(String value) {
        this.agencyIdCSV = value;
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
    public String getPnr() {
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
    public void setPnr(String value) {
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
     * Gets the value of the check property.
     * 
     */
    public int getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     */
    public void setCheck(int value) {
        this.check = value;
    }

    /**
     * Gets the value of the isVoid property.
     * 
     */
    public boolean isIsVoid() {
        return isVoid;
    }

    /**
     * Sets the value of the isVoid property.
     * 
     */
    public void setIsVoid(boolean value) {
        this.isVoid = value;
    }

    /**
     * Gets the value of the isChangRequest property.
     * 
     */
    public boolean isIsChangRequest() {
        return isChangRequest;
    }

    /**
     * Sets the value of the isChangRequest property.
     * 
     */
    public void setIsChangRequest(boolean value) {
        this.isChangRequest = value;
    }

    /**
     * Gets the value of the isRefund property.
     * 
     */
    public boolean isIsRefund() {
        return isRefund;
    }

    /**
     * Sets the value of the isRefund property.
     * 
     */
    public void setIsRefund(boolean value) {
        this.isRefund = value;
    }

    /**
     * Gets the value of the isUnAssigned property.
     * 
     */
    public boolean isIsUnAssigned() {
        return isUnAssigned;
    }

    /**
     * Sets the value of the isUnAssigned property.
     * 
     */
    public void setIsUnAssigned(boolean value) {
        this.isUnAssigned = value;
    }

    /**
     * Gets the value of the isAssigned property.
     * 
     */
    public boolean isIsAssigned() {
        return isAssigned;
    }

    /**
     * Sets the value of the isAssigned property.
     * 
     */
    public void setIsAssigned(boolean value) {
        this.isAssigned = value;
    }

    /**
     * Gets the value of the isAcknowledged property.
     * 
     */
    public boolean isIsAcknowledged() {
        return isAcknowledged;
    }

    /**
     * Sets the value of the isAcknowledged property.
     * 
     */
    public void setIsAcknowledged(boolean value) {
        this.isAcknowledged = value;
    }

    /**
     * Gets the value of the isCompleted property.
     * 
     */
    public boolean isIsCompleted() {
        return isCompleted;
    }

    /**
     * Sets the value of the isCompleted property.
     * 
     */
    public void setIsCompleted(boolean value) {
        this.isCompleted = value;
    }

    /**
     * Gets the value of the isRejected property.
     * 
     */
    public boolean isIsRejected() {
        return isRejected;
    }

    /**
     * Sets the value of the isRejected property.
     * 
     */
    public void setIsRejected(boolean value) {
        this.isRejected = value;
    }

    /**
     * Gets the value of the isClosed property.
     * 
     */
    public boolean isIsClosed() {
        return isClosed;
    }

    /**
     * Sets the value of the isClosed property.
     * 
     */
    public void setIsClosed(boolean value) {
        this.isClosed = value;
    }

    /**
     * Gets the value of the isPending property.
     * 
     */
    public boolean isIsPending() {
        return isPending;
    }

    /**
     * Sets the value of the isPending property.
     * 
     */
    public void setIsPending(boolean value) {
        this.isPending = value;
    }

}
