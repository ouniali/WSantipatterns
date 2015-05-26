
package https.newhotel.web.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillPayTVResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillPayTVResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{https://NewHotel/Web/Services/}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SerieReservation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReservationHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Movements" type="{https://NewHotel/Web/Services/}ArrayOfMovementsDetailsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillPayTVResponse", propOrder = {
    "arrivalDate",
    "departureDate",
    "serieReservation",
    "reservationHolder",
    "movements"
})
public class BillPayTVResponse
    extends BaseResponse
{

    @XmlElement(name = "ArrivalDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDate;
    @XmlElement(name = "DepartureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "SerieReservation")
    protected String serieReservation;
    @XmlElement(name = "ReservationHolder")
    protected String reservationHolder;
    @XmlElement(name = "Movements")
    protected ArrayOfMovementsDetailsResponse movements;

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
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the serieReservation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieReservation() {
        return serieReservation;
    }

    /**
     * Sets the value of the serieReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieReservation(String value) {
        this.serieReservation = value;
    }

    /**
     * Gets the value of the reservationHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationHolder() {
        return reservationHolder;
    }

    /**
     * Sets the value of the reservationHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationHolder(String value) {
        this.reservationHolder = value;
    }

    /**
     * Gets the value of the movements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMovementsDetailsResponse }
     *     
     */
    public ArrayOfMovementsDetailsResponse getMovements() {
        return movements;
    }

    /**
     * Sets the value of the movements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMovementsDetailsResponse }
     *     
     */
    public void setMovements(ArrayOfMovementsDetailsResponse value) {
        this.movements = value;
    }

}
