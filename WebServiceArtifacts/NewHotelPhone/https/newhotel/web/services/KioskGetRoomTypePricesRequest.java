
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for KioskGetRoomTypePricesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KioskGetRoomTypePricesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}KioskBaseRequest">
 *       &lt;sequence>
 *         &lt;element name="ReservationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriceRateId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="PensionMode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="RoomTypeId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Nights" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Paxs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IncludeRoomsWithoutPrices" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeDowngrades" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KioskGetRoomTypePricesRequest", propOrder = {
    "reservationName",
    "priceRateId",
    "pensionMode",
    "roomTypeId",
    "arrivalDate",
    "nights",
    "paxs",
    "includeRoomsWithoutPrices",
    "includeDowngrades"
})
public class KioskGetRoomTypePricesRequest
    extends KioskBaseRequest
{

    @XmlElement(name = "ReservationName")
    protected String reservationName;
    @XmlElement(name = "PriceRateId", required = true, nillable = true)
    protected String priceRateId;
    @XmlElement(name = "PensionMode", required = true, type = Short.class, nillable = true)
    protected Short pensionMode;
    @XmlElement(name = "RoomTypeId", required = true, nillable = true)
    protected String roomTypeId;
    @XmlElement(name = "ArrivalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDate;
    @XmlElement(name = "Nights")
    protected int nights;
    @XmlElement(name = "Paxs")
    protected int paxs;
    @XmlElement(name = "IncludeRoomsWithoutPrices")
    protected boolean includeRoomsWithoutPrices;
    @XmlElement(name = "IncludeDowngrades")
    protected boolean includeDowngrades;

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
     * Gets the value of the roomTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeId() {
        return roomTypeId;
    }

    /**
     * Sets the value of the roomTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeId(String value) {
        this.roomTypeId = value;
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
     * Gets the value of the includeRoomsWithoutPrices property.
     * 
     */
    public boolean isIncludeRoomsWithoutPrices() {
        return includeRoomsWithoutPrices;
    }

    /**
     * Sets the value of the includeRoomsWithoutPrices property.
     * 
     */
    public void setIncludeRoomsWithoutPrices(boolean value) {
        this.includeRoomsWithoutPrices = value;
    }

    /**
     * Gets the value of the includeDowngrades property.
     * 
     */
    public boolean isIncludeDowngrades() {
        return includeDowngrades;
    }

    /**
     * Sets the value of the includeDowngrades property.
     * 
     */
    public void setIncludeDowngrades(boolean value) {
        this.includeDowngrades = value;
    }

}
