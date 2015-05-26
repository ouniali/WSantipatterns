
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseReservation;
import com.travelport.schema.common_v15_0.BookingTravelerRef;
import com.travelport.schema.common_v15_0.CreditCardAuth;
import com.travelport.schema.common_v15_0.FormOfPayment;
import com.travelport.schema.common_v15_0.Payment;
import com.travelport.schema.common_v15_0.ProviderReservationInfoRef;
import com.travelport.schema.common_v15_0.SupplierLocator;
import com.travelport.schema.common_v15_0.ThirdPartyInformation;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseReservation">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}OptionalService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}SupplierLocator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ThirdPartyInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}DocumentInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}BookingTravelerRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ProviderReservationInfoRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSegment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirPricingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}FormOfPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CreditCardAuth" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareNote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FeeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxInfo" type="{http://www.travelport.com/schema/air_v18_0}typeTaxInfoWithPaymentRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TicketingModifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AssociatedRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PocketItineraryRemark" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "optionalService",
    "supplierLocator",
    "thirdPartyInformation",
    "documentInfo",
    "bookingTravelerRef",
    "providerReservationInfoRef",
    "airSegment",
    "airPricingInfo",
    "formOfPayment",
    "payment",
    "creditCardAuth",
    "fareNote",
    "feeInfo",
    "taxInfo",
    "ticketingModifiers",
    "associatedRemark",
    "pocketItineraryRemark"
})
@XmlRootElement(name = "AirReservation")
public class AirReservation
    extends BaseReservation
{

    @XmlElement(name = "OptionalService")
    protected List<OptionalService> optionalService;
    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<SupplierLocator> supplierLocator;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<ThirdPartyInformation> thirdPartyInformation;
    @XmlElement(name = "DocumentInfo")
    protected DocumentInfo documentInfo;
    @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<BookingTravelerRef> bookingTravelerRef;
    @XmlElement(name = "ProviderReservationInfoRef", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<ProviderReservationInfoRef> providerReservationInfoRef;
    @XmlElement(name = "AirSegment")
    protected List<AirSegment> airSegment;
    @XmlElement(name = "AirPricingInfo")
    protected List<AirPricingInfo> airPricingInfo;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<FormOfPayment> formOfPayment;
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<Payment> payment;
    @XmlElement(name = "CreditCardAuth", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<CreditCardAuth> creditCardAuth;
    @XmlElement(name = "FareNote")
    protected List<FareNote> fareNote;
    @XmlElement(name = "FeeInfo")
    protected List<FeeInfo> feeInfo;
    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfoWithPaymentRef> taxInfo;
    @XmlElement(name = "TicketingModifiers")
    protected List<TicketingModifiers> ticketingModifiers;
    @XmlElement(name = "AssociatedRemark")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "PocketItineraryRemark")
    protected List<PocketItineraryRemark> pocketItineraryRemark;

    /**
     * Gets the value of the optionalService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionalService }
     * 
     * 
     */
    public List<OptionalService> getOptionalService() {
        if (optionalService == null) {
            optionalService = new ArrayList<OptionalService>();
        }
        return this.optionalService;
    }

    /**
     * Gets the value of the supplierLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierLocator }
     * 
     * 
     */
    public List<SupplierLocator> getSupplierLocator() {
        if (supplierLocator == null) {
            supplierLocator = new ArrayList<SupplierLocator>();
        }
        return this.supplierLocator;
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
     * Gets the value of the documentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInfo }
     *     
     */
    public DocumentInfo getDocumentInfo() {
        return documentInfo;
    }

    /**
     * Sets the value of the documentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInfo }
     *     
     */
    public void setDocumentInfo(DocumentInfo value) {
        this.documentInfo = value;
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
     * Gets the value of the providerReservationInfoRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationInfoRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderReservationInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderReservationInfoRef }
     * 
     * 
     */
    public List<ProviderReservationInfoRef> getProviderReservationInfoRef() {
        if (providerReservationInfoRef == null) {
            providerReservationInfoRef = new ArrayList<ProviderReservationInfoRef>();
        }
        return this.providerReservationInfoRef;
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
     * Gets the value of the airPricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingInfo }
     * 
     * 
     */
    public List<AirPricingInfo> getAirPricingInfo() {
        if (airPricingInfo == null) {
            airPricingInfo = new ArrayList<AirPricingInfo>();
        }
        return this.airPricingInfo;
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
     * Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<Payment>();
        }
        return this.payment;
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
     * Gets the value of the fareNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareNote }
     * 
     * 
     */
    public List<FareNote> getFareNote() {
        if (fareNote == null) {
            fareNote = new ArrayList<FareNote>();
        }
        return this.fareNote;
    }

    /**
     * Gets the value of the feeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeInfo }
     * 
     * 
     */
    public List<FeeInfo> getFeeInfo() {
        if (feeInfo == null) {
            feeInfo = new ArrayList<FeeInfo>();
        }
        return this.feeInfo;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfoWithPaymentRef }
     * 
     * 
     */
    public List<TypeTaxInfoWithPaymentRef> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TypeTaxInfoWithPaymentRef>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the ticketingModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingModifiers }
     * 
     * 
     */
    public List<TicketingModifiers> getTicketingModifiers() {
        if (ticketingModifiers == null) {
            ticketingModifiers = new ArrayList<TicketingModifiers>();
        }
        return this.ticketingModifiers;
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

}
