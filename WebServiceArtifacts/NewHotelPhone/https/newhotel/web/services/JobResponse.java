
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JobResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JobID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="JobType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Done" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReservationDepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReservationLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HolderFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HolderLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldRoom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewRoom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KeyPermissions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Workstation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransferCCInfoDetails" type="{https://NewHotel/Web/Services/}TransferCCResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobResponse", propOrder = {
    "jobID",
    "dateTime",
    "jobType",
    "done",
    "extension",
    "reservation",
    "reservationArrivalDate",
    "reservationDepartureDate",
    "reservationLanguage",
    "holderFirstName",
    "holderLastName",
    "oldRoom",
    "newRoom",
    "room",
    "keyAmount",
    "keyPermissions",
    "workstation",
    "transferCCInfoDetails"
})
public class JobResponse {

    @XmlElement(name = "JobID")
    protected String jobID;
    @XmlElement(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "JobType")
    protected int jobType;
    @XmlElement(name = "Done")
    protected boolean done;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "Reservation")
    protected String reservation;
    @XmlElement(name = "ReservationArrivalDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationArrivalDate;
    @XmlElement(name = "ReservationDepartureDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reservationDepartureDate;
    @XmlElement(name = "ReservationLanguage")
    protected String reservationLanguage;
    @XmlElement(name = "HolderFirstName")
    protected String holderFirstName;
    @XmlElement(name = "HolderLastName")
    protected String holderLastName;
    @XmlElement(name = "OldRoom")
    protected String oldRoom;
    @XmlElement(name = "NewRoom")
    protected String newRoom;
    @XmlElement(name = "Room")
    protected String room;
    @XmlElement(name = "KeyAmount")
    protected int keyAmount;
    @XmlElement(name = "KeyPermissions")
    protected String keyPermissions;
    @XmlElement(name = "Workstation")
    protected String workstation;
    @XmlElement(name = "TransferCCInfoDetails")
    protected TransferCCResponse transferCCInfoDetails;

    /**
     * Gets the value of the jobID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobID() {
        return jobID;
    }

    /**
     * Sets the value of the jobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobID(String value) {
        this.jobID = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     */
    public int getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     */
    public void setJobType(int value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the done property.
     * 
     */
    public boolean isDone() {
        return done;
    }

    /**
     * Sets the value of the done property.
     * 
     */
    public void setDone(boolean value) {
        this.done = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservation(String value) {
        this.reservation = value;
    }

    /**
     * Gets the value of the reservationArrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReservationArrivalDate() {
        return reservationArrivalDate;
    }

    /**
     * Sets the value of the reservationArrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReservationArrivalDate(XMLGregorianCalendar value) {
        this.reservationArrivalDate = value;
    }

    /**
     * Gets the value of the reservationDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReservationDepartureDate() {
        return reservationDepartureDate;
    }

    /**
     * Sets the value of the reservationDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReservationDepartureDate(XMLGregorianCalendar value) {
        this.reservationDepartureDate = value;
    }

    /**
     * Gets the value of the reservationLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationLanguage() {
        return reservationLanguage;
    }

    /**
     * Sets the value of the reservationLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationLanguage(String value) {
        this.reservationLanguage = value;
    }

    /**
     * Gets the value of the holderFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderFirstName() {
        return holderFirstName;
    }

    /**
     * Sets the value of the holderFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderFirstName(String value) {
        this.holderFirstName = value;
    }

    /**
     * Gets the value of the holderLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolderLastName() {
        return holderLastName;
    }

    /**
     * Sets the value of the holderLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolderLastName(String value) {
        this.holderLastName = value;
    }

    /**
     * Gets the value of the oldRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldRoom() {
        return oldRoom;
    }

    /**
     * Sets the value of the oldRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldRoom(String value) {
        this.oldRoom = value;
    }

    /**
     * Gets the value of the newRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewRoom() {
        return newRoom;
    }

    /**
     * Sets the value of the newRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewRoom(String value) {
        this.newRoom = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

    /**
     * Gets the value of the keyAmount property.
     * 
     */
    public int getKeyAmount() {
        return keyAmount;
    }

    /**
     * Sets the value of the keyAmount property.
     * 
     */
    public void setKeyAmount(int value) {
        this.keyAmount = value;
    }

    /**
     * Gets the value of the keyPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyPermissions() {
        return keyPermissions;
    }

    /**
     * Sets the value of the keyPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyPermissions(String value) {
        this.keyPermissions = value;
    }

    /**
     * Gets the value of the workstation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstation() {
        return workstation;
    }

    /**
     * Sets the value of the workstation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstation(String value) {
        this.workstation = value;
    }

    /**
     * Gets the value of the transferCCInfoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCCResponse }
     *     
     */
    public TransferCCResponse getTransferCCInfoDetails() {
        return transferCCInfoDetails;
    }

    /**
     * Sets the value of the transferCCInfoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCCResponse }
     *     
     */
    public void setTransferCCInfoDetails(TransferCCResponse value) {
        this.transferCCInfoDetails = value;
    }

}
