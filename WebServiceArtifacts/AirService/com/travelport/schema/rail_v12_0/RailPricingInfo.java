
package com.travelport.schema.rail_v12_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BookingTravelerRef;
import com.travelport.schema.common_v15_0.TypePassengerType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/rail_v12_0}RailFare" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/rail_v12_0}RailFareRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/rail_v12_0}RailBookingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PassengerType" type="{http://www.travelport.com/schema/common_v15_0}typePassengerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}BookingTravelerRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrPrices"/>
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="ExchangeAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="ApproximateExchangeAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "railFare",
    "railFareRef",
    "railBookingInfo",
    "passengerType",
    "bookingTravelerRef"
})
@XmlRootElement(name = "RailPricingInfo")
public class RailPricingInfo {

    @XmlElement(name = "RailFare")
    protected List<RailFare> railFare;
    @XmlElement(name = "RailFareRef")
    protected List<RailFareRef> railFareRef;
    @XmlElement(name = "RailBookingInfo")
    protected List<RailBookingInfo> railBookingInfo;
    @XmlElement(name = "PassengerType")
    protected List<TypePassengerType> passengerType;
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<BookingTravelerRef> bookingTravelerRef;
    @XmlAttribute(name = "Key", required = true)
    protected String key;
    @XmlAttribute(name = "ExchangeAmount")
    protected String exchangeAmount;
    @XmlAttribute(name = "ApproximateExchangeAmount")
    protected String approximateExchangeAmount;
    @XmlAttribute(name = "TotalPrice")
    protected String totalPrice;
    @XmlAttribute(name = "BasePrice")
    protected String basePrice;
    @XmlAttribute(name = "ApproximateTotalPrice")
    protected String approximateTotalPrice;
    @XmlAttribute(name = "ApproximateBasePrice")
    protected String approximateBasePrice;
    @XmlAttribute(name = "EquivalentBasePrice")
    protected String equivalentBasePrice;
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    @XmlAttribute(name = "Fees")
    protected String fees;
    @XmlAttribute(name = "Services")
    protected String services;

    /**
     * Gets the value of the railFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailFare }
     * 
     * 
     */
    public List<RailFare> getRailFare() {
        if (railFare == null) {
            railFare = new ArrayList<RailFare>();
        }
        return this.railFare;
    }

    /**
     * Gets the value of the railFareRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railFareRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailFareRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailFareRef }
     * 
     * 
     */
    public List<RailFareRef> getRailFareRef() {
        if (railFareRef == null) {
            railFareRef = new ArrayList<RailFareRef>();
        }
        return this.railFareRef;
    }

    /**
     * Gets the value of the railBookingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railBookingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailBookingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailBookingInfo }
     * 
     * 
     */
    public List<RailBookingInfo> getRailBookingInfo() {
        if (railBookingInfo == null) {
            railBookingInfo = new ArrayList<RailBookingInfo>();
        }
        return this.railBookingInfo;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePassengerType }
     * 
     * 
     */
    public List<TypePassengerType> getPassengerType() {
        if (passengerType == null) {
            passengerType = new ArrayList<TypePassengerType>();
        }
        return this.passengerType;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTravelerRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTravelerRef }
     * 
     * 
     */
    public List<BookingTravelerRef> getBookingTravelerRef() {
        if (bookingTravelerRef == null) {
            bookingTravelerRef = new ArrayList<BookingTravelerRef>();
        }
        return this.bookingTravelerRef;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the exchangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeAmount() {
        return exchangeAmount;
    }

    /**
     * Sets the value of the exchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeAmount(String value) {
        this.exchangeAmount = value;
    }

    /**
     * Gets the value of the approximateExchangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateExchangeAmount() {
        return approximateExchangeAmount;
    }

    /**
     * Sets the value of the approximateExchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateExchangeAmount(String value) {
        this.approximateExchangeAmount = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePrice(String value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the approximateTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTotalPrice() {
        return approximateTotalPrice;
    }

    /**
     * Sets the value of the approximateTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTotalPrice(String value) {
        this.approximateTotalPrice = value;
    }

    /**
     * Gets the value of the approximateBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateBasePrice() {
        return approximateBasePrice;
    }

    /**
     * Sets the value of the approximateBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateBasePrice(String value) {
        this.approximateBasePrice = value;
    }

    /**
     * Gets the value of the equivalentBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentBasePrice() {
        return equivalentBasePrice;
    }

    /**
     * Sets the value of the equivalentBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentBasePrice(String value) {
        this.equivalentBasePrice = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxes(String value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFees(String value) {
        this.fees = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

}
