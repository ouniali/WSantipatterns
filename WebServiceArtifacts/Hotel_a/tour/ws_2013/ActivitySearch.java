
package tour.ws_2013;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ws_2013.PriceValue;


/**
 * <p>Java class for ActivitySearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivitySearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceLanguages" type="{WS_2013.Tour}ArrayOfEServiceLanguage" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Departure" type="{WS_2013.Tour}DepartureSearch" minOccurs="0"/>
 *         &lt;element name="Price" type="{WS_2013}PriceValue" minOccurs="0"/>
 *         &lt;element name="Comission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PaymentDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ComissionCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CancellationPolicies" type="{WS_2013.Tour}ArrayOfCancellationPolicy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivitySearch", propOrder = {
    "id",
    "serviceDate",
    "duration",
    "serviceLanguages",
    "name",
    "departure",
    "price",
    "comission",
    "paymentDeadline",
    "comissionCurrency",
    "conversionRate",
    "cancellationPolicies"
})
public class ActivitySearch {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "ServiceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceDate;
    @XmlElement(name = "Duration")
    protected String duration;
    @XmlElement(name = "ServiceLanguages")
    protected ArrayOfEServiceLanguage serviceLanguages;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Departure")
    protected DepartureSearch departure;
    @XmlElement(name = "Price")
    protected PriceValue price;
    @XmlElement(name = "Comission")
    protected double comission;
    @XmlElement(name = "PaymentDeadline", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDeadline;
    @XmlElement(name = "ComissionCurrency")
    protected String comissionCurrency;
    @XmlElement(name = "ConversionRate", required = true)
    protected BigDecimal conversionRate;
    @XmlElement(name = "CancellationPolicies")
    protected ArrayOfCancellationPolicy cancellationPolicies;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceDate(XMLGregorianCalendar value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the serviceLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEServiceLanguage }
     *     
     */
    public ArrayOfEServiceLanguage getServiceLanguages() {
        return serviceLanguages;
    }

    /**
     * Sets the value of the serviceLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEServiceLanguage }
     *     
     */
    public void setServiceLanguages(ArrayOfEServiceLanguage value) {
        this.serviceLanguages = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureSearch }
     *     
     */
    public DepartureSearch getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureSearch }
     *     
     */
    public void setDeparture(DepartureSearch value) {
        this.departure = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValue }
     *     
     */
    public PriceValue getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValue }
     *     
     */
    public void setPrice(PriceValue value) {
        this.price = value;
    }

    /**
     * Gets the value of the comission property.
     * 
     */
    public double getComission() {
        return comission;
    }

    /**
     * Sets the value of the comission property.
     * 
     */
    public void setComission(double value) {
        this.comission = value;
    }

    /**
     * Gets the value of the paymentDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDeadline() {
        return paymentDeadline;
    }

    /**
     * Sets the value of the paymentDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDeadline(XMLGregorianCalendar value) {
        this.paymentDeadline = value;
    }

    /**
     * Gets the value of the comissionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComissionCurrency() {
        return comissionCurrency;
    }

    /**
     * Sets the value of the comissionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComissionCurrency(String value) {
        this.comissionCurrency = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConversionRate(BigDecimal value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the cancellationPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public ArrayOfCancellationPolicy getCancellationPolicies() {
        return cancellationPolicies;
    }

    /**
     * Sets the value of the cancellationPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancellationPolicy }
     *     
     */
    public void setCancellationPolicies(ArrayOfCancellationPolicy value) {
        this.cancellationPolicies = value;
    }

}
