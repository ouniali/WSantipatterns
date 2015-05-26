
package org.datacontract.schemas._2004._07.mouzenidis_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TourPriceEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourPriceEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CityToKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CityToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HasTickets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HotLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="QuotaState_FlightArrival" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaState" minOccurs="0"/>
 *         &lt;element name="QuotaState_FlightArrival_B" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaState" minOccurs="0"/>
 *         &lt;element name="QuotaState_FlightDeparture" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaState" minOccurs="0"/>
 *         &lt;element name="QuotaState_FlightDeparture_B" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaState" minOccurs="0"/>
 *         &lt;element name="QuotaState_Hotel" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}QuotaState" minOccurs="0"/>
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TourID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TourName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TourPriceServiceInfos" type="{http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects}ArrayOfTourPriceServiceInfo" minOccurs="0"/>
 *         &lt;element name="TourTypeID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TourTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TourUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransportTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourPriceEx", propOrder = {
    "cityToKey",
    "cityToName",
    "dateBegin",
    "duration",
    "hasTickets",
    "hotLevel",
    "id",
    "price",
    "quotaStateFlightArrival",
    "quotaStateFlightArrivalB",
    "quotaStateFlightDeparture",
    "quotaStateFlightDepartureB",
    "quotaStateHotel",
    "rate",
    "trid",
    "tourID",
    "tourName",
    "tourPriceServiceInfos",
    "tourTypeID",
    "tourTypeName",
    "tourUrl",
    "transportTypeId"
})
public class TourPriceEx {

    @XmlElement(name = "CityToKey")
    protected Integer cityToKey;
    @XmlElementRef(name = "CityToName", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cityToName;
    @XmlElement(name = "DateBegin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBegin;
    @XmlElement(name = "Duration")
    protected Integer duration;
    @XmlElement(name = "HasTickets")
    protected Boolean hasTickets;
    @XmlElement(name = "HotLevel")
    protected Integer hotLevel;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "Price")
    protected Double price;
    @XmlElement(name = "QuotaState_FlightArrival")
    @XmlSchemaType(name = "string")
    protected QuotaState quotaStateFlightArrival;
    @XmlElement(name = "QuotaState_FlightArrival_B")
    @XmlSchemaType(name = "string")
    protected QuotaState quotaStateFlightArrivalB;
    @XmlElement(name = "QuotaState_FlightDeparture")
    @XmlSchemaType(name = "string")
    protected QuotaState quotaStateFlightDeparture;
    @XmlElement(name = "QuotaState_FlightDeparture_B")
    @XmlSchemaType(name = "string")
    protected QuotaState quotaStateFlightDepartureB;
    @XmlElement(name = "QuotaState_Hotel")
    @XmlSchemaType(name = "string")
    protected QuotaState quotaStateHotel;
    @XmlElementRef(name = "Rate", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rate;
    @XmlElement(name = "TRID")
    protected Integer trid;
    @XmlElement(name = "TourID")
    protected Integer tourID;
    @XmlElementRef(name = "TourName", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tourName;
    @XmlElementRef(name = "TourPriceServiceInfos", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTourPriceServiceInfo> tourPriceServiceInfos;
    @XmlElement(name = "TourTypeID")
    protected Integer tourTypeID;
    @XmlElementRef(name = "TourTypeName", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tourTypeName;
    @XmlElementRef(name = "TourUrl", namespace = "http://schemas.datacontract.org/2004/07/Mouzenidis.Services.Objects", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tourUrl;
    @XmlElement(name = "TransportTypeId")
    protected Integer transportTypeId;

    /**
     * Gets the value of the cityToKey property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCityToKey() {
        return cityToKey;
    }

    /**
     * Sets the value of the cityToKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCityToKey(Integer value) {
        this.cityToKey = value;
    }

    /**
     * Gets the value of the cityToName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCityToName() {
        return cityToName;
    }

    /**
     * Sets the value of the cityToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCityToName(JAXBElement<String> value) {
        this.cityToName = value;
    }

    /**
     * Gets the value of the dateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBegin() {
        return dateBegin;
    }

    /**
     * Sets the value of the dateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBegin(XMLGregorianCalendar value) {
        this.dateBegin = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the hasTickets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasTickets() {
        return hasTickets;
    }

    /**
     * Sets the value of the hasTickets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTickets(Boolean value) {
        this.hasTickets = value;
    }

    /**
     * Gets the value of the hotLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHotLevel() {
        return hotLevel;
    }

    /**
     * Sets the value of the hotLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHotLevel(Integer value) {
        this.hotLevel = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrice(Double value) {
        this.price = value;
    }

    /**
     * Gets the value of the quotaStateFlightArrival property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaState }
     *     
     */
    public QuotaState getQuotaStateFlightArrival() {
        return quotaStateFlightArrival;
    }

    /**
     * Sets the value of the quotaStateFlightArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaState }
     *     
     */
    public void setQuotaStateFlightArrival(QuotaState value) {
        this.quotaStateFlightArrival = value;
    }

    /**
     * Gets the value of the quotaStateFlightArrivalB property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaState }
     *     
     */
    public QuotaState getQuotaStateFlightArrivalB() {
        return quotaStateFlightArrivalB;
    }

    /**
     * Sets the value of the quotaStateFlightArrivalB property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaState }
     *     
     */
    public void setQuotaStateFlightArrivalB(QuotaState value) {
        this.quotaStateFlightArrivalB = value;
    }

    /**
     * Gets the value of the quotaStateFlightDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaState }
     *     
     */
    public QuotaState getQuotaStateFlightDeparture() {
        return quotaStateFlightDeparture;
    }

    /**
     * Sets the value of the quotaStateFlightDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaState }
     *     
     */
    public void setQuotaStateFlightDeparture(QuotaState value) {
        this.quotaStateFlightDeparture = value;
    }

    /**
     * Gets the value of the quotaStateFlightDepartureB property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaState }
     *     
     */
    public QuotaState getQuotaStateFlightDepartureB() {
        return quotaStateFlightDepartureB;
    }

    /**
     * Sets the value of the quotaStateFlightDepartureB property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaState }
     *     
     */
    public void setQuotaStateFlightDepartureB(QuotaState value) {
        this.quotaStateFlightDepartureB = value;
    }

    /**
     * Gets the value of the quotaStateHotel property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaState }
     *     
     */
    public QuotaState getQuotaStateHotel() {
        return quotaStateHotel;
    }

    /**
     * Sets the value of the quotaStateHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaState }
     *     
     */
    public void setQuotaStateHotel(QuotaState value) {
        this.quotaStateHotel = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRate(JAXBElement<String> value) {
        this.rate = value;
    }

    /**
     * Gets the value of the trid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTRID() {
        return trid;
    }

    /**
     * Sets the value of the trid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTRID(Integer value) {
        this.trid = value;
    }

    /**
     * Gets the value of the tourID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTourID() {
        return tourID;
    }

    /**
     * Sets the value of the tourID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTourID(Integer value) {
        this.tourID = value;
    }

    /**
     * Gets the value of the tourName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTourName() {
        return tourName;
    }

    /**
     * Sets the value of the tourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTourName(JAXBElement<String> value) {
        this.tourName = value;
    }

    /**
     * Gets the value of the tourPriceServiceInfos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTourPriceServiceInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTourPriceServiceInfo> getTourPriceServiceInfos() {
        return tourPriceServiceInfos;
    }

    /**
     * Sets the value of the tourPriceServiceInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTourPriceServiceInfo }{@code >}
     *     
     */
    public void setTourPriceServiceInfos(JAXBElement<ArrayOfTourPriceServiceInfo> value) {
        this.tourPriceServiceInfos = value;
    }

    /**
     * Gets the value of the tourTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTourTypeID() {
        return tourTypeID;
    }

    /**
     * Sets the value of the tourTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTourTypeID(Integer value) {
        this.tourTypeID = value;
    }

    /**
     * Gets the value of the tourTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTourTypeName() {
        return tourTypeName;
    }

    /**
     * Sets the value of the tourTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTourTypeName(JAXBElement<String> value) {
        this.tourTypeName = value;
    }

    /**
     * Gets the value of the tourUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTourUrl() {
        return tourUrl;
    }

    /**
     * Sets the value of the tourUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTourUrl(JAXBElement<String> value) {
        this.tourUrl = value;
    }

    /**
     * Gets the value of the transportTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransportTypeId() {
        return transportTypeId;
    }

    /**
     * Sets the value of the transportTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransportTypeId(Integer value) {
        this.transportTypeId = value;
    }

}
