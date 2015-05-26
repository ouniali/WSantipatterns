
package com.travelport.schema.universal_v16_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v18_0.AirPricingAdjustment;
import com.travelport.schema.air_v18_0.AirPricingPayment;
import com.travelport.schema.air_v18_0.AirSegment;
import com.travelport.schema.air_v18_0.AssociatedRemark;
import com.travelport.schema.air_v18_0.AutoSeatAssignment;
import com.travelport.schema.air_v18_0.OptionalServicesInfo;
import com.travelport.schema.air_v18_0.PocketItineraryRemark;
import com.travelport.schema.air_v18_0.SpecificSeatAssignment;
import com.travelport.schema.common_v15_0.AccountingRemark;
import com.travelport.schema.common_v15_0.CreditCardAuth;
import com.travelport.schema.common_v15_0.DeliveryInfo;
import com.travelport.schema.common_v15_0.FormOfPayment;
import com.travelport.schema.common_v15_0.GeneralRemark;
import com.travelport.schema.common_v15_0.LoyaltyCard;
import com.travelport.schema.common_v15_0.SSR;
import com.travelport.schema.common_v15_0.ThirdPartyInformation;
import com.travelport.schema.common_v15_0.TravelComplianceData;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AccountingRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSegment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CreditCardAuth" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirPricingAdjustment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}DeliveryInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}AirSegmentSpecialUpdate" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}LoyaltyCard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}SSR" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}GeneralRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AutoSeatAssignment" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}SpecificSeatAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}FormOfPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirPricingPayment" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AssociatedRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PocketItineraryRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}OptionalServicesInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ThirdPartyInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}TravelComplianceData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="ReservationLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *       &lt;attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountingRemark",
    "airSegment",
    "creditCardAuth",
    "airPricingAdjustment",
    "deliveryInfo",
    "airSegmentSpecialUpdate",
    "loyaltyCard",
    "ssr",
    "generalRemark",
    "autoSeatAssignment",
    "specificSeatAssignment",
    "formOfPayment",
    "airPricingPayment",
    "associatedRemark",
    "pocketItineraryRemark",
    "optionalServicesInfo",
    "thirdPartyInformation",
    "travelComplianceData"
})
@XmlRootElement(name = "AirUpdate")
public class AirUpdate {

    @XmlElement(name = "AccountingRemark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<AccountingRemark> accountingRemark;
    @XmlElement(name = "AirSegment", namespace = "http://www.travelport.com/schema/air_v18_0")
    protected List<AirSegment> airSegment;
    @XmlElement(name = "CreditCardAuth", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<CreditCardAuth> creditCardAuth;
    @XmlElement(name = "AirPricingAdjustment", namespace = "http://www.travelport.com/schema/air_v18_0")
    protected List<AirPricingAdjustment> airPricingAdjustment;
    @XmlElement(name = "DeliveryInfo", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected DeliveryInfo deliveryInfo;
    @XmlElement(name = "AirSegmentSpecialUpdate")
    protected AirSegmentSpecialUpdate airSegmentSpecialUpdate;
    @XmlElement(name = "LoyaltyCard", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<LoyaltyCard> loyaltyCard;
    @XmlElement(name = "SSR", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<SSR> ssr;
    @XmlElement(name = "GeneralRemark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<GeneralRemark> generalRemark;
    @XmlElement(name = "AutoSeatAssignment", namespace = "http://www.travelport.com/schema/air_v18_0")
    protected AutoSeatAssignment autoSeatAssignment;
    @XmlElement(name = "SpecificSeatAssignment", namespace = "http://www.travelport.com/schema/air_v18_0")
    protected List<SpecificSeatAssignment> specificSeatAssignment;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<FormOfPayment> formOfPayment;
    @XmlElement(name = "AirPricingPayment", namespace = "http://www.travelport.com/schema/air_v18_0")
    protected AirPricingPayment airPricingPayment;
    @XmlElement(name = "AssociatedRemark", namespace = "http://www.travelport.com/schema/air_v18_0")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "PocketItineraryRemark", namespace = "http://www.travelport.com/schema/air_v18_0")
    protected List<PocketItineraryRemark> pocketItineraryRemark;
    @XmlElement(name = "OptionalServicesInfo", namespace = "http://www.travelport.com/schema/air_v18_0")
    protected OptionalServicesInfo optionalServicesInfo;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<ThirdPartyInformation> thirdPartyInformation;
    @XmlElement(name = "TravelComplianceData", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<TravelComplianceData> travelComplianceData;
    @XmlAttribute(name = "ReservationLocatorCode", required = true)
    protected String reservationLocatorCode;
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;

    /**
     * Gets the value of the accountingRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingRemark }
     * 
     * 
     */
    public List<AccountingRemark> getAccountingRemark() {
        if (accountingRemark == null) {
            accountingRemark = new ArrayList<AccountingRemark>();
        }
        return this.accountingRemark;
    }

    /**
     * Gets the value of the airSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegment }
     * 
     * 
     */
    public List<AirSegment> getAirSegment() {
        if (airSegment == null) {
            airSegment = new ArrayList<AirSegment>();
        }
        return this.airSegment;
    }

    /**
     * Gets the value of the creditCardAuth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardAuth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCardAuth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardAuth }
     * 
     * 
     */
    public List<CreditCardAuth> getCreditCardAuth() {
        if (creditCardAuth == null) {
            creditCardAuth = new ArrayList<CreditCardAuth>();
        }
        return this.creditCardAuth;
    }

    /**
     * Gets the value of the airPricingAdjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingAdjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingAdjustment }
     * 
     * 
     */
    public List<AirPricingAdjustment> getAirPricingAdjustment() {
        if (airPricingAdjustment == null) {
            airPricingAdjustment = new ArrayList<AirPricingAdjustment>();
        }
        return this.airPricingAdjustment;
    }

    /**
     * Gets the value of the deliveryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInfo }
     *     
     */
    public DeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    /**
     * Sets the value of the deliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInfo }
     *     
     */
    public void setDeliveryInfo(DeliveryInfo value) {
        this.deliveryInfo = value;
    }

    /**
     * Gets the value of the airSegmentSpecialUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AirSegmentSpecialUpdate }
     *     
     */
    public AirSegmentSpecialUpdate getAirSegmentSpecialUpdate() {
        return airSegmentSpecialUpdate;
    }

    /**
     * Sets the value of the airSegmentSpecialUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSegmentSpecialUpdate }
     *     
     */
    public void setAirSegmentSpecialUpdate(AirSegmentSpecialUpdate value) {
        this.airSegmentSpecialUpdate = value;
    }

    /**
     * Gets the value of the loyaltyCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * 
     * 
     */
    public List<LoyaltyCard> getLoyaltyCard() {
        if (loyaltyCard == null) {
            loyaltyCard = new ArrayList<LoyaltyCard>();
        }
        return this.loyaltyCard;
    }

    /**
     * Gets the value of the ssr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSR }
     * 
     * 
     */
    public List<SSR> getSSR() {
        if (ssr == null) {
            ssr = new ArrayList<SSR>();
        }
        return this.ssr;
    }

    /**
     * Gets the value of the generalRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralRemark }
     * 
     * 
     */
    public List<GeneralRemark> getGeneralRemark() {
        if (generalRemark == null) {
            generalRemark = new ArrayList<GeneralRemark>();
        }
        return this.generalRemark;
    }

    /**
     * Gets the value of the autoSeatAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link AutoSeatAssignment }
     *     
     */
    public AutoSeatAssignment getAutoSeatAssignment() {
        return autoSeatAssignment;
    }

    /**
     * Sets the value of the autoSeatAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoSeatAssignment }
     *     
     */
    public void setAutoSeatAssignment(AutoSeatAssignment value) {
        this.autoSeatAssignment = value;
    }

    /**
     * Gets the value of the specificSeatAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificSeatAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificSeatAssignment }
     * 
     * 
     */
    public List<SpecificSeatAssignment> getSpecificSeatAssignment() {
        if (specificSeatAssignment == null) {
            specificSeatAssignment = new ArrayList<SpecificSeatAssignment>();
        }
        return this.specificSeatAssignment;
    }

    /**
     * Gets the value of the formOfPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPayment }
     * 
     * 
     */
    public List<FormOfPayment> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<FormOfPayment>();
        }
        return this.formOfPayment;
    }

    /**
     * Gets the value of the airPricingPayment property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingPayment }
     *     
     */
    public AirPricingPayment getAirPricingPayment() {
        return airPricingPayment;
    }

    /**
     * Sets the value of the airPricingPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingPayment }
     *     
     */
    public void setAirPricingPayment(AirPricingPayment value) {
        this.airPricingPayment = value;
    }

    /**
     * Gets the value of the associatedRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedRemark }
     * 
     * 
     */
    public List<AssociatedRemark> getAssociatedRemark() {
        if (associatedRemark == null) {
            associatedRemark = new ArrayList<AssociatedRemark>();
        }
        return this.associatedRemark;
    }

    /**
     * Gets the value of the pocketItineraryRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pocketItineraryRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPocketItineraryRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PocketItineraryRemark }
     * 
     * 
     */
    public List<PocketItineraryRemark> getPocketItineraryRemark() {
        if (pocketItineraryRemark == null) {
            pocketItineraryRemark = new ArrayList<PocketItineraryRemark>();
        }
        return this.pocketItineraryRemark;
    }

    /**
     * Gets the value of the optionalServicesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServicesInfo }
     *     
     */
    public OptionalServicesInfo getOptionalServicesInfo() {
        return optionalServicesInfo;
    }

    /**
     * Sets the value of the optionalServicesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServicesInfo }
     *     
     */
    public void setOptionalServicesInfo(OptionalServicesInfo value) {
        this.optionalServicesInfo = value;
    }

    /**
     * Gets the value of the thirdPartyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdPartyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyInformation }
     * 
     * 
     */
    public List<ThirdPartyInformation> getThirdPartyInformation() {
        if (thirdPartyInformation == null) {
            thirdPartyInformation = new ArrayList<ThirdPartyInformation>();
        }
        return this.thirdPartyInformation;
    }

    /**
     * Gets the value of the travelComplianceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelComplianceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelComplianceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelComplianceData }
     * 
     * 
     */
    public List<TravelComplianceData> getTravelComplianceData() {
        if (travelComplianceData == null) {
            travelComplianceData = new ArrayList<TravelComplianceData>();
        }
        return this.travelComplianceData;
    }

    /**
     * Gets the value of the reservationLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationLocatorCode() {
        return reservationLocatorCode;
    }

    /**
     * Sets the value of the reservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationLocatorCode(String value) {
        this.reservationLocatorCode = value;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

}
