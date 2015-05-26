
package com.inforcyl.services.v_1_3.faresearch.input.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd.AmendmentOutwardData;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd.FareData;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd.Passengers;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd.Payment;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd.Restriction;
import com.inforcyl.services.v_1_3.faresearch.input.faresearch_input.xsd.ReturnChangeOutboundTicketsData;
import com.inforcyl.services.xsd.Header;
import com.inforcyl.services.xsd.InputMethods;


/**
 * <p>Java class for FareSearch_input complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareSearch_input">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.inforcyl.com/xsd}InputMethods">
 *       &lt;sequence>
 *         &lt;element name="admonToChargeTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alsaPlus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amendmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalODate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivalRDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="border" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkOutwardOnlyFare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationBorder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entryFare" type="{http://faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd}FareData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="header" type="{http://services.inforcyl.com/xsd}Header" minOccurs="0"/>
 *         &lt;element name="journeyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="journeyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationDatabase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outwardArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outwardDepartureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outwardDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outwardOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outwardTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passengerTypes" type="{http://faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd}Passengers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="paymentTypesToBeApplied" type="{http://faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="promotion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="restrictions" type="{http://faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd}Restriction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnAmendingOutwardData" type="{http://faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd}AmendmentOutwardData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnChangeOutboundTickets" type="{http://faresearch_input.input.faresearch.v_1_3.services.inforcyl.com/xsd}ReturnChangeOutboundTicketsData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnDepartureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnDepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnOrigin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleFareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suplementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="task" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ticketCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trafficType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareSearch_input", propOrder = {
    "admonToChargeTo",
    "agency",
    "alsaPlus",
    "amendmentType",
    "arrivalODate",
    "arrivalRDate",
    "border",
    "brandGroup",
    "cardNo",
    "chargeChannel",
    "checkOutwardOnlyFare",
    "country",
    "currency",
    "destinationBorder",
    "destinationCountry",
    "entryFare",
    "header",
    "journeyDate",
    "journeyType",
    "operationDatabase",
    "originCountry",
    "outwardArrivalTime",
    "outwardDepartureDate",
    "outwardDestination",
    "outwardOrigin",
    "outwardTime",
    "passengerTypes",
    "paymentTypesToBeApplied",
    "promotion",
    "restrictions",
    "returnAmendingOutwardData",
    "returnArrivalTime",
    "returnChangeOutboundTickets",
    "returnDepartureDate",
    "returnDepartureTime",
    "returnDestination",
    "returnOrigin",
    "saleFareType",
    "saleQuery",
    "seats",
    "suplementCode",
    "task",
    "ticketCompany",
    "trafficType"
})
public class FareSearchInput
    extends InputMethods
{

    @XmlElementRef(name = "admonToChargeTo", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> admonToChargeTo;
    @XmlElementRef(name = "agency", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agency;
    @XmlElementRef(name = "alsaPlus", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alsaPlus;
    @XmlElementRef(name = "amendmentType", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amendmentType;
    @XmlElementRef(name = "arrivalODate", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrivalODate;
    @XmlElementRef(name = "arrivalRDate", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arrivalRDate;
    @XmlElementRef(name = "border", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> border;
    @XmlElementRef(name = "brandGroup", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> brandGroup;
    @XmlElementRef(name = "cardNo", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cardNo;
    @XmlElementRef(name = "chargeChannel", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chargeChannel;
    @XmlElementRef(name = "checkOutwardOnlyFare", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> checkOutwardOnlyFare;
    @XmlElementRef(name = "country", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "currency", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    @XmlElementRef(name = "destinationBorder", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationBorder;
    @XmlElementRef(name = "destinationCountry", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationCountry;
    @XmlElement(nillable = true)
    protected List<FareData> entryFare;
    @XmlElementRef(name = "header", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Header> header;
    @XmlElementRef(name = "journeyDate", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> journeyDate;
    @XmlElementRef(name = "journeyType", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> journeyType;
    @XmlElementRef(name = "operationDatabase", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationDatabase;
    @XmlElementRef(name = "originCountry", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originCountry;
    @XmlElementRef(name = "outwardArrivalTime", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outwardArrivalTime;
    @XmlElementRef(name = "outwardDepartureDate", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outwardDepartureDate;
    @XmlElementRef(name = "outwardDestination", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outwardDestination;
    @XmlElementRef(name = "outwardOrigin", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outwardOrigin;
    @XmlElementRef(name = "outwardTime", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outwardTime;
    @XmlElement(nillable = true)
    protected List<Passengers> passengerTypes;
    @XmlElement(nillable = true)
    protected List<Payment> paymentTypesToBeApplied;
    @XmlElementRef(name = "promotion", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promotion;
    @XmlElement(nillable = true)
    protected List<Restriction> restrictions;
    @XmlElement(nillable = true)
    protected List<AmendmentOutwardData> returnAmendingOutwardData;
    @XmlElementRef(name = "returnArrivalTime", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnArrivalTime;
    @XmlElement(nillable = true)
    protected List<ReturnChangeOutboundTicketsData> returnChangeOutboundTickets;
    @XmlElementRef(name = "returnDepartureDate", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnDepartureDate;
    @XmlElementRef(name = "returnDepartureTime", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnDepartureTime;
    @XmlElementRef(name = "returnDestination", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnDestination;
    @XmlElementRef(name = "returnOrigin", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> returnOrigin;
    @XmlElementRef(name = "saleFareType", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saleFareType;
    @XmlElementRef(name = "saleQuery", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saleQuery;
    @XmlElementRef(name = "seats", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seats;
    @XmlElementRef(name = "suplementCode", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suplementCode;
    @XmlElementRef(name = "task", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> task;
    @XmlElementRef(name = "ticketCompany", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ticketCompany;
    @XmlElementRef(name = "trafficType", namespace = "http://input.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trafficType;

    /**
     * Gets the value of the admonToChargeTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdmonToChargeTo() {
        return admonToChargeTo;
    }

    /**
     * Sets the value of the admonToChargeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdmonToChargeTo(JAXBElement<String> value) {
        this.admonToChargeTo = value;
    }

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgency() {
        return agency;
    }

    /**
     * Sets the value of the agency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgency(JAXBElement<String> value) {
        this.agency = value;
    }

    /**
     * Gets the value of the alsaPlus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlsaPlus() {
        return alsaPlus;
    }

    /**
     * Sets the value of the alsaPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlsaPlus(JAXBElement<String> value) {
        this.alsaPlus = value;
    }

    /**
     * Gets the value of the amendmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmendmentType() {
        return amendmentType;
    }

    /**
     * Sets the value of the amendmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmendmentType(JAXBElement<String> value) {
        this.amendmentType = value;
    }

    /**
     * Gets the value of the arrivalODate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrivalODate() {
        return arrivalODate;
    }

    /**
     * Sets the value of the arrivalODate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrivalODate(JAXBElement<String> value) {
        this.arrivalODate = value;
    }

    /**
     * Gets the value of the arrivalRDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArrivalRDate() {
        return arrivalRDate;
    }

    /**
     * Sets the value of the arrivalRDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArrivalRDate(JAXBElement<String> value) {
        this.arrivalRDate = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBorder(JAXBElement<String> value) {
        this.border = value;
    }

    /**
     * Gets the value of the brandGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBrandGroup() {
        return brandGroup;
    }

    /**
     * Sets the value of the brandGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBrandGroup(JAXBElement<String> value) {
        this.brandGroup = value;
    }

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCardNo(JAXBElement<String> value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the chargeChannel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChargeChannel() {
        return chargeChannel;
    }

    /**
     * Sets the value of the chargeChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChargeChannel(JAXBElement<String> value) {
        this.chargeChannel = value;
    }

    /**
     * Gets the value of the checkOutwardOnlyFare property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCheckOutwardOnlyFare() {
        return checkOutwardOnlyFare;
    }

    /**
     * Sets the value of the checkOutwardOnlyFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCheckOutwardOnlyFare(JAXBElement<String> value) {
        this.checkOutwardOnlyFare = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<String> value) {
        this.currency = value;
    }

    /**
     * Gets the value of the destinationBorder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationBorder() {
        return destinationBorder;
    }

    /**
     * Sets the value of the destinationBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationBorder(JAXBElement<String> value) {
        this.destinationBorder = value;
    }

    /**
     * Gets the value of the destinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * Sets the value of the destinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationCountry(JAXBElement<String> value) {
        this.destinationCountry = value;
    }

    /**
     * Gets the value of the entryFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entryFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntryFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareData }
     * 
     * 
     */
    public List<FareData> getEntryFare() {
        if (entryFare == null) {
            entryFare = new ArrayList<FareData>();
        }
        return this.entryFare;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Header }{@code >}
     *     
     */
    public JAXBElement<Header> getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Header }{@code >}
     *     
     */
    public void setHeader(JAXBElement<Header> value) {
        this.header = value;
    }

    /**
     * Gets the value of the journeyDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJourneyDate() {
        return journeyDate;
    }

    /**
     * Sets the value of the journeyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJourneyDate(JAXBElement<String> value) {
        this.journeyDate = value;
    }

    /**
     * Gets the value of the journeyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJourneyType() {
        return journeyType;
    }

    /**
     * Sets the value of the journeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJourneyType(JAXBElement<String> value) {
        this.journeyType = value;
    }

    /**
     * Gets the value of the operationDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationDatabase() {
        return operationDatabase;
    }

    /**
     * Sets the value of the operationDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationDatabase(JAXBElement<String> value) {
        this.operationDatabase = value;
    }

    /**
     * Gets the value of the originCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginCountry() {
        return originCountry;
    }

    /**
     * Sets the value of the originCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginCountry(JAXBElement<String> value) {
        this.originCountry = value;
    }

    /**
     * Gets the value of the outwardArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutwardArrivalTime() {
        return outwardArrivalTime;
    }

    /**
     * Sets the value of the outwardArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutwardArrivalTime(JAXBElement<String> value) {
        this.outwardArrivalTime = value;
    }

    /**
     * Gets the value of the outwardDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutwardDepartureDate() {
        return outwardDepartureDate;
    }

    /**
     * Sets the value of the outwardDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutwardDepartureDate(JAXBElement<String> value) {
        this.outwardDepartureDate = value;
    }

    /**
     * Gets the value of the outwardDestination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutwardDestination() {
        return outwardDestination;
    }

    /**
     * Sets the value of the outwardDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutwardDestination(JAXBElement<String> value) {
        this.outwardDestination = value;
    }

    /**
     * Gets the value of the outwardOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutwardOrigin() {
        return outwardOrigin;
    }

    /**
     * Sets the value of the outwardOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutwardOrigin(JAXBElement<String> value) {
        this.outwardOrigin = value;
    }

    /**
     * Gets the value of the outwardTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutwardTime() {
        return outwardTime;
    }

    /**
     * Sets the value of the outwardTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutwardTime(JAXBElement<String> value) {
        this.outwardTime = value;
    }

    /**
     * Gets the value of the passengerTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Passengers }
     * 
     * 
     */
    public List<Passengers> getPassengerTypes() {
        if (passengerTypes == null) {
            passengerTypes = new ArrayList<Passengers>();
        }
        return this.passengerTypes;
    }

    /**
     * Gets the value of the paymentTypesToBeApplied property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTypesToBeApplied property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTypesToBeApplied().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPaymentTypesToBeApplied() {
        if (paymentTypesToBeApplied == null) {
            paymentTypesToBeApplied = new ArrayList<Payment>();
        }
        return this.paymentTypesToBeApplied;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromotion(JAXBElement<String> value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Restriction }
     * 
     * 
     */
    public List<Restriction> getRestrictions() {
        if (restrictions == null) {
            restrictions = new ArrayList<Restriction>();
        }
        return this.restrictions;
    }

    /**
     * Gets the value of the returnAmendingOutwardData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnAmendingOutwardData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnAmendingOutwardData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmendmentOutwardData }
     * 
     * 
     */
    public List<AmendmentOutwardData> getReturnAmendingOutwardData() {
        if (returnAmendingOutwardData == null) {
            returnAmendingOutwardData = new ArrayList<AmendmentOutwardData>();
        }
        return this.returnAmendingOutwardData;
    }

    /**
     * Gets the value of the returnArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnArrivalTime() {
        return returnArrivalTime;
    }

    /**
     * Sets the value of the returnArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnArrivalTime(JAXBElement<String> value) {
        this.returnArrivalTime = value;
    }

    /**
     * Gets the value of the returnChangeOutboundTickets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnChangeOutboundTickets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnChangeOutboundTickets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnChangeOutboundTicketsData }
     * 
     * 
     */
    public List<ReturnChangeOutboundTicketsData> getReturnChangeOutboundTickets() {
        if (returnChangeOutboundTickets == null) {
            returnChangeOutboundTickets = new ArrayList<ReturnChangeOutboundTicketsData>();
        }
        return this.returnChangeOutboundTickets;
    }

    /**
     * Gets the value of the returnDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnDepartureDate() {
        return returnDepartureDate;
    }

    /**
     * Sets the value of the returnDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnDepartureDate(JAXBElement<String> value) {
        this.returnDepartureDate = value;
    }

    /**
     * Gets the value of the returnDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnDepartureTime() {
        return returnDepartureTime;
    }

    /**
     * Sets the value of the returnDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnDepartureTime(JAXBElement<String> value) {
        this.returnDepartureTime = value;
    }

    /**
     * Gets the value of the returnDestination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnDestination() {
        return returnDestination;
    }

    /**
     * Sets the value of the returnDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnDestination(JAXBElement<String> value) {
        this.returnDestination = value;
    }

    /**
     * Gets the value of the returnOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReturnOrigin() {
        return returnOrigin;
    }

    /**
     * Sets the value of the returnOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReturnOrigin(JAXBElement<String> value) {
        this.returnOrigin = value;
    }

    /**
     * Gets the value of the saleFareType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSaleFareType() {
        return saleFareType;
    }

    /**
     * Sets the value of the saleFareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSaleFareType(JAXBElement<String> value) {
        this.saleFareType = value;
    }

    /**
     * Gets the value of the saleQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSaleQuery() {
        return saleQuery;
    }

    /**
     * Sets the value of the saleQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSaleQuery(JAXBElement<String> value) {
        this.saleQuery = value;
    }

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeats(JAXBElement<String> value) {
        this.seats = value;
    }

    /**
     * Gets the value of the suplementCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuplementCode() {
        return suplementCode;
    }

    /**
     * Sets the value of the suplementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuplementCode(JAXBElement<String> value) {
        this.suplementCode = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTask(JAXBElement<String> value) {
        this.task = value;
    }

    /**
     * Gets the value of the ticketCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTicketCompany() {
        return ticketCompany;
    }

    /**
     * Sets the value of the ticketCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTicketCompany(JAXBElement<String> value) {
        this.ticketCompany = value;
    }

    /**
     * Gets the value of the trafficType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrafficType() {
        return trafficType;
    }

    /**
     * Sets the value of the trafficType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrafficType(JAXBElement<String> value) {
        this.trafficType = value;
    }

}
