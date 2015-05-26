
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KioskUpdateReservationDetailsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskUpdateReservationDetailsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ReservationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Nights" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Paxs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RoomId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="PensionMode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="PriceRateId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="RoomTypeInfo" type="{https://NewHotel/Web/Services/}KioskRoomTypeInfo" minOccurs="0"/>
 *         &lt;element name="KeyIds" type="{https://NewHotel/Web/Services/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="SendInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="EmailAddresses" type="{https://NewHotel/Web/Services/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskUpdateReservationDetailsRequest", propOrder = {
    "reservationName",
    "reservationId",
    "arrivalDate",
    "nights",
    "paxs",
    "roomId",
    "pensionMode",
    "priceRateId",
    "roomTypeInfo",
    "keyIds",
    "sendInvoice",
    "emailAddresses"
})
public class KioskUpdateReservationDetailsRequest
    extends KioskBaseRequest
{

    @XmlElement(name = "ReservationName")
    protected String reservationName;
    @XmlElement(name = "ReservationId", required = true, nillable = true)
    protected String reservationId;
    @XmlElement(name = "ArrivalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDate;
    @XmlElement(name = "Nights")
    protected int nights;
    @XmlElement(name = "Paxs")
    protected int paxs;
    @XmlElement(name = "RoomId", required = true, nillable = true)
    protected String roomId;
    @XmlElement(name = "PensionMode", required = true, type = Short.class, nillable = true)
    protected Short pensionMode;
    @XmlElement(name = "PriceRateId", required = true, nillable = true)
    protected String priceRateId;
    @XmlElement(name = "RoomTypeInfo")
    protected KioskRoomTypeInfo roomTypeInfo;
    @XmlElement(name = "KeyIds")
    protected ArrayOfString keyIds;
    @XmlElement(name = "SendInvoice")
    protected boolean sendInvoice;
    @XmlElement(name = "EmailAddresses")
    protected ArrayOfString emailAddresses;

    /**
     * Gets the value of the reservationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationName() {
        return reservationName;
    }

    /**
     * Sets the value of the reservationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationName(String value) {
        this.reservationName = value;
    }

    /**
     * Gets the value of the reservationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationId(String value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDate(XMLGregorianCalendar value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the nights property.
     * 
     */
    public int getNights() {
        return nights;
    }

    /**
     * Sets the value of the nights property.
     * 
     */
    public void setNights(int value) {
        this.nights = value;
    }

    /**
     * Gets the value of the paxs property.
     * 
     */
    public int getPaxs() {
        return paxs;
    }

    /**
     * Sets the value of the paxs property.
     * 
     */
    public void setPaxs(int value) {
        this.paxs = value;
    }

    /**
     * Gets the value of the roomId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of the roomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomId(String value) {
        this.roomId = value;
    }

    /**
     * Gets the value of the pensionMode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPensionMode() {
        return pensionMode;
    }

    /**
     * Sets the value of the pensionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPensionMode(Short value) {
        this.pensionMode = value;
    }

    /**
     * Gets the value of the priceRateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRateId() {
        return priceRateId;
    }

    /**
     * Sets the value of the priceRateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRateId(String value) {
        this.priceRateId = value;
    }

    /**
     * Gets the value of the roomTypeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link KioskRoomTypeInfo }
     *     
     */
    public KioskRoomTypeInfo getRoomTypeInfo() {
        return roomTypeInfo;
    }

    /**
     * Sets the value of the roomTypeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link KioskRoomTypeInfo }
     *     
     */
    public void setRoomTypeInfo(KioskRoomTypeInfo value) {
        this.roomTypeInfo = value;
    }

    /**
     * Gets the value of the keyIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getKeyIds() {
        return keyIds;
    }

    /**
     * Sets the value of the keyIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setKeyIds(ArrayOfString value) {
        this.keyIds = value;
    }

    /**
     * Gets the value of the sendInvoice property.
     * 
     */
    public boolean isSendInvoice() {
        return sendInvoice;
    }

    /**
     * Sets the value of the sendInvoice property.
     * 
     */
    public void setSendInvoice(boolean value) {
        this.sendInvoice = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Sets the value of the emailAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setEmailAddresses(ArrayOfString value) {
        this.emailAddresses = value;
    }

}
