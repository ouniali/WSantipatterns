
package travelpackage.ws_2013;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws_2013.PriceValue;


/**
 * <p>Java class for ReservationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrecoVendaCalculado" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="PrecoFornecedorCalculado" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="ComissionCalculated" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="PercentMakup" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DepartureDateSelected" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DepartureCitySelectedId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDeadine" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationInfo", propOrder = {
    "precoVendaCalculado",
    "precoFornecedorCalculado",
    "comissionCalculated",
    "percentMakup",
    "departureDateSelected",
    "departureCitySelectedId",
    "bookingDescription",
    "paymentDeadine"
})
public class ReservationInfo {

    @XmlElement(name = "PrecoVendaCalculado")
    protected PriceValue precoVendaCalculado;
    @XmlElement(name = "PrecoFornecedorCalculado")
    protected PriceValue precoFornecedorCalculado;
    @XmlElement(name = "ComissionCalculated")
    protected PriceValue comissionCalculated;
    @XmlElement(name = "PercentMakup")
    protected double percentMakup;
    @XmlElement(name = "DepartureDateSelected", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateSelected;
    @XmlElement(name = "DepartureCitySelectedId")
    protected int departureCitySelectedId;
    @XmlElement(name = "BookingDescription")
    protected String bookingDescription;
    @XmlElement(name = "PaymentDeadine", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDeadine;

    /**
     * Gets the value of the precoVendaCalculado property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPrecoVendaCalculado() {
        return precoVendaCalculado;
    }

    /**
     * Sets the value of the precoVendaCalculado property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPrecoVendaCalculado(PriceValue value) {
        this.precoVendaCalculado = value;
    }

    /**
     * Gets the value of the precoFornecedorCalculado property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPrecoFornecedorCalculado() {
        return precoFornecedorCalculado;
    }

    /**
     * Sets the value of the precoFornecedorCalculado property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPrecoFornecedorCalculado(PriceValue value) {
        this.precoFornecedorCalculado = value;
    }

    /**
     * Gets the value of the comissionCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getComissionCalculated() {
        return comissionCalculated;
    }

    /**
     * Sets the value of the comissionCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setComissionCalculated(PriceValue value) {
        this.comissionCalculated = value;
    }

    /**
     * Gets the value of the percentMakup property.
     * 
     */
    public double getPercentMakup() {
        return percentMakup;
    }

    /**
     * Sets the value of the percentMakup property.
     * 
     */
    public void setPercentMakup(double value) {
        this.percentMakup = value;
    }

    /**
     * Gets the value of the departureDateSelected property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateSelected() {
        return departureDateSelected;
    }

    /**
     * Sets the value of the departureDateSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateSelected(XMLGregorianCalendar value) {
        this.departureDateSelected = value;
    }

    /**
     * Gets the value of the departureCitySelectedId property.
     * 
     */
    public int getDepartureCitySelectedId() {
        return departureCitySelectedId;
    }

    /**
     * Sets the value of the departureCitySelectedId property.
     * 
     */
    public void setDepartureCitySelectedId(int value) {
        this.departureCitySelectedId = value;
    }

    /**
     * Gets the value of the bookingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingDescription() {
        return bookingDescription;
    }

    /**
     * Sets the value of the bookingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDescription(String value) {
        this.bookingDescription = value;
    }

    /**
     * Gets the value of the paymentDeadine property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDeadine() {
        return paymentDeadine;
    }

    /**
     * Sets the value of the paymentDeadine property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDeadine(XMLGregorianCalendar value) {
        this.paymentDeadine = value;
    }

}
