
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MessageNewGesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageNewGesResponse">
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
 *         &lt;element name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageDecription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallBackRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CallRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MessageReceived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="User" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageNewGesResponse", propOrder = {
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
    "messageCode",
    "messageDecription",
    "room",
    "callBackRequest",
    "callRequest",
    "messageReceived",
    "user",
    "deviceType",
    "messageType"
})
public class MessageNewGesResponse {

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
    @XmlElement(name = "MessageCode")
    protected String messageCode;
    @XmlElement(name = "MessageDecription")
    protected String messageDecription;
    @XmlElement(name = "Room")
    protected String room;
    @XmlElement(name = "CallBackRequest")
    protected boolean callBackRequest;
    @XmlElement(name = "CallRequest")
    protected boolean callRequest;
    @XmlElement(name = "MessageReceived")
    protected boolean messageReceived;
    @XmlElement(name = "User")
    protected String user;
    @XmlElement(name = "DeviceType")
    protected long deviceType;
    @XmlElement(name = "MessageType")
    protected long messageType;

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
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the messageDecription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDecription() {
        return messageDecription;
    }

    /**
     * Sets the value of the messageDecription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDecription(String value) {
        this.messageDecription = value;
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
     * Gets the value of the callBackRequest property.
     * 
     */
    public boolean isCallBackRequest() {
        return callBackRequest;
    }

    /**
     * Sets the value of the callBackRequest property.
     * 
     */
    public void setCallBackRequest(boolean value) {
        this.callBackRequest = value;
    }

    /**
     * Gets the value of the callRequest property.
     * 
     */
    public boolean isCallRequest() {
        return callRequest;
    }

    /**
     * Sets the value of the callRequest property.
     * 
     */
    public void setCallRequest(boolean value) {
        this.callRequest = value;
    }

    /**
     * Gets the value of the messageReceived property.
     * 
     */
    public boolean isMessageReceived() {
        return messageReceived;
    }

    /**
     * Sets the value of the messageReceived property.
     * 
     */
    public void setMessageReceived(boolean value) {
        this.messageReceived = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     */
    public long getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     */
    public void setDeviceType(long value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     */
    public long getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     */
    public void setMessageType(long value) {
        this.messageType = value;
    }

}
