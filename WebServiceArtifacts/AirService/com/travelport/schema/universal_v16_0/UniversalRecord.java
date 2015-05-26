
package com.travelport.schema.universal_v16_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.air_v18_0.AirReservation;
import com.travelport.schema.common_v15_0.AccountingRemark;
import com.travelport.schema.common_v15_0.ActionStatus;
import com.travelport.schema.common_v15_0.AgencyContactInfo;
import com.travelport.schema.common_v15_0.AgencyInfo;
import com.travelport.schema.common_v15_0.AppliedProfile;
import com.travelport.schema.common_v15_0.BookingTraveler;
import com.travelport.schema.common_v15_0.CommissionRemark;
import com.travelport.schema.common_v15_0.CustomerID;
import com.travelport.schema.common_v15_0.GeneralRemark;
import com.travelport.schema.common_v15_0.InvoiceRemark;
import com.travelport.schema.common_v15_0.LinkedUniversalRecord;
import com.travelport.schema.common_v15_0.OSI;
import com.travelport.schema.common_v15_0.Postscript;
import com.travelport.schema.common_v15_0.ProviderARNKSegment;
import com.travelport.schema.common_v15_0.ServiceFeeInfo;
import com.travelport.schema.common_v15_0.UnassociatedRemark;
import com.travelport.schema.common_v15_0.XMLRemark;
import com.travelport.schema.hotel_v17_0.HotelReservation;
import com.travelport.schema.passive_v14_0.PassiveReservation;
import com.travelport.schema.rail_v12_0.RailReservation;
import com.travelport.schema.vehicle_v17_0.VehicleReservation;


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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}LinkedUniversalRecord" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}BookingTraveler" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ServiceFeeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}OSI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ActionStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}ProviderReservationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirReservation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelReservation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleReservation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/passive_v14_0}PassiveReservation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/rail_v12_0}RailReservation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ProviderARNKSegment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}SegmentContinuityInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}XMLRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}GeneralRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AccountingRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}UnassociatedRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Postscript" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AgencyInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AppliedProfile" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AgencyContactInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CustomerID" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CommissionRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}InvoiceRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v16_0}ChangedKeyStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LocatorCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *       &lt;attribute name="SavedTripLocatorCode" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *       &lt;attribute name="LockReason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Version" type="{http://www.travelport.com/schema/common_v15_0}typeURVersion" />
 *       &lt;attribute name="Status" use="required" type="{http://www.travelport.com/schema/universal_v16_0}typeURStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "linkedUniversalRecord",
    "bookingTraveler",
    "serviceFeeInfo",
    "osi",
    "actionStatus",
    "providerReservationInfo",
    "airReservation",
    "hotelReservation",
    "vehicleReservation",
    "passiveReservation",
    "railReservation",
    "providerARNKSegment",
    "segmentContinuityInfo",
    "xmlRemark",
    "generalRemark",
    "accountingRemark",
    "unassociatedRemark",
    "postscript",
    "agencyInfo",
    "appliedProfile",
    "agencyContactInfo",
    "customerID",
    "commissionRemark",
    "invoiceRemark",
    "changedKeyStatus"
})
@XmlRootElement(name = "UniversalRecord")
public class UniversalRecord {

    @XmlElement(name = "LinkedUniversalRecord", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<LinkedUniversalRecord> linkedUniversalRecord;
    @XmlElement(name = "BookingTraveler", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<BookingTraveler> bookingTraveler;
    @XmlElement(name = "ServiceFeeInfo", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<ServiceFeeInfo> serviceFeeInfo;
    @XmlElement(name = "OSI", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<OSI> osi;
    @XmlElement(name = "ActionStatus", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<ActionStatus> actionStatus;
    @XmlElement(name = "ProviderReservationInfo")
    protected List<ProviderReservationInfo> providerReservationInfo;
    @XmlElement(name = "AirReservation", namespace = "http://www.travelport.com/schema/air_v18_0")
    protected List<AirReservation> airReservation;
    @XmlElement(name = "HotelReservation", namespace = "http://www.travelport.com/schema/hotel_v17_0")
    protected List<HotelReservation> hotelReservation;
    @XmlElement(name = "VehicleReservation", namespace = "http://www.travelport.com/schema/vehicle_v17_0")
    protected List<VehicleReservation> vehicleReservation;
    @XmlElement(name = "PassiveReservation", namespace = "http://www.travelport.com/schema/passive_v14_0")
    protected List<PassiveReservation> passiveReservation;
    @XmlElement(name = "RailReservation", namespace = "http://www.travelport.com/schema/rail_v12_0")
    protected List<RailReservation> railReservation;
    @XmlElement(name = "ProviderARNKSegment", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<ProviderARNKSegment> providerARNKSegment;
    @XmlElement(name = "SegmentContinuityInfo")
    protected SegmentContinuityInfo segmentContinuityInfo;
    @XmlElement(name = "XMLRemark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<XMLRemark> xmlRemark;
    @XmlElement(name = "GeneralRemark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<GeneralRemark> generalRemark;
    @XmlElement(name = "AccountingRemark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<AccountingRemark> accountingRemark;
    @XmlElement(name = "UnassociatedRemark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<UnassociatedRemark> unassociatedRemark;
    @XmlElement(name = "Postscript", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<Postscript> postscript;
    @XmlElement(name = "AgencyInfo", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected AgencyInfo agencyInfo;
    @XmlElement(name = "AppliedProfile", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected AppliedProfile appliedProfile;
    @XmlElement(name = "AgencyContactInfo", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected AgencyContactInfo agencyContactInfo;
    @XmlElement(name = "CustomerID", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<CustomerID> customerID;
    @XmlElement(name = "CommissionRemark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<CommissionRemark> commissionRemark;
    @XmlElement(name = "InvoiceRemark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<InvoiceRemark> invoiceRemark;
    @XmlElement(name = "ChangedKeyStatus")
    protected ChangedKeyStatus changedKeyStatus;
    @XmlAttribute(name = "LocatorCode", required = true)
    protected String locatorCode;
    @XmlAttribute(name = "SavedTripLocatorCode")
    protected String savedTripLocatorCode;
    @XmlAttribute(name = "LockReason")
    protected String lockReason;
    @XmlAttribute(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlAttribute(name = "Version")
    protected BigInteger version;
    @XmlAttribute(name = "Status", required = true)
    protected TypeURStatus status;

    /**
     * Gets the value of the linkedUniversalRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedUniversalRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedUniversalRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedUniversalRecord }
     * 
     * 
     */
    public List<LinkedUniversalRecord> getLinkedUniversalRecord() {
        if (linkedUniversalRecord == null) {
            linkedUniversalRecord = new ArrayList<LinkedUniversalRecord>();
        }
        return this.linkedUniversalRecord;
    }

    /**
     * Gets the value of the bookingTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTraveler }
     * 
     * 
     */
    public List<BookingTraveler> getBookingTraveler() {
        if (bookingTraveler == null) {
            bookingTraveler = new ArrayList<BookingTraveler>();
        }
        return this.bookingTraveler;
    }

    /**
     * Gets the value of the serviceFeeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeeInfo }
     * 
     * 
     */
    public List<ServiceFeeInfo> getServiceFeeInfo() {
        if (serviceFeeInfo == null) {
            serviceFeeInfo = new ArrayList<ServiceFeeInfo>();
        }
        return this.serviceFeeInfo;
    }

    /**
     * Gets the value of the osi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOSI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OSI }
     * 
     * 
     */
    public List<OSI> getOSI() {
        if (osi == null) {
            osi = new ArrayList<OSI>();
        }
        return this.osi;
    }

    /**
     * Gets the value of the actionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionStatus }
     * 
     * 
     */
    public List<ActionStatus> getActionStatus() {
        if (actionStatus == null) {
            actionStatus = new ArrayList<ActionStatus>();
        }
        return this.actionStatus;
    }

    /**
     * Gets the value of the providerReservationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderReservationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderReservationInfo }
     * 
     * 
     */
    public List<ProviderReservationInfo> getProviderReservationInfo() {
        if (providerReservationInfo == null) {
            providerReservationInfo = new ArrayList<ProviderReservationInfo>();
        }
        return this.providerReservationInfo;
    }

    /**
     * Gets the value of the airReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirReservation }
     * 
     * 
     */
    public List<AirReservation> getAirReservation() {
        if (airReservation == null) {
            airReservation = new ArrayList<AirReservation>();
        }
        return this.airReservation;
    }

    /**
     * Gets the value of the hotelReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelReservation }
     * 
     * 
     */
    public List<HotelReservation> getHotelReservation() {
        if (hotelReservation == null) {
            hotelReservation = new ArrayList<HotelReservation>();
        }
        return this.hotelReservation;
    }

    /**
     * Gets the value of the vehicleReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleReservation }
     * 
     * 
     */
    public List<VehicleReservation> getVehicleReservation() {
        if (vehicleReservation == null) {
            vehicleReservation = new ArrayList<VehicleReservation>();
        }
        return this.vehicleReservation;
    }

    /**
     * Gets the value of the passiveReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passiveReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassiveReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassiveReservation }
     * 
     * 
     */
    public List<PassiveReservation> getPassiveReservation() {
        if (passiveReservation == null) {
            passiveReservation = new ArrayList<PassiveReservation>();
        }
        return this.passiveReservation;
    }

    /**
     * Gets the value of the railReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailReservation }
     * 
     * 
     */
    public List<RailReservation> getRailReservation() {
        if (railReservation == null) {
            railReservation = new ArrayList<RailReservation>();
        }
        return this.railReservation;
    }

    /**
     * Gets the value of the providerARNKSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerARNKSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderARNKSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderARNKSegment }
     * 
     * 
     */
    public List<ProviderARNKSegment> getProviderARNKSegment() {
        if (providerARNKSegment == null) {
            providerARNKSegment = new ArrayList<ProviderARNKSegment>();
        }
        return this.providerARNKSegment;
    }

    /**
     * Gets the value of the segmentContinuityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentContinuityInfo }
     *     
     */
    public SegmentContinuityInfo getSegmentContinuityInfo() {
        return segmentContinuityInfo;
    }

    /**
     * Sets the value of the segmentContinuityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentContinuityInfo }
     *     
     */
    public void setSegmentContinuityInfo(SegmentContinuityInfo value) {
        this.segmentContinuityInfo = value;
    }

    /**
     * Gets the value of the xmlRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmlRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXMLRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLRemark }
     * 
     * 
     */
    public List<XMLRemark> getXMLRemark() {
        if (xmlRemark == null) {
            xmlRemark = new ArrayList<XMLRemark>();
        }
        return this.xmlRemark;
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
     * Gets the value of the unassociatedRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unassociatedRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnassociatedRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnassociatedRemark }
     * 
     * 
     */
    public List<UnassociatedRemark> getUnassociatedRemark() {
        if (unassociatedRemark == null) {
            unassociatedRemark = new ArrayList<UnassociatedRemark>();
        }
        return this.unassociatedRemark;
    }

    /**
     * Gets the value of the postscript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postscript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostscript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Postscript }
     * 
     * 
     */
    public List<Postscript> getPostscript() {
        if (postscript == null) {
            postscript = new ArrayList<Postscript>();
        }
        return this.postscript;
    }

    /**
     * Gets the value of the agencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyInfo }
     *     
     */
    public AgencyInfo getAgencyInfo() {
        return agencyInfo;
    }

    /**
     * Sets the value of the agencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyInfo }
     *     
     */
    public void setAgencyInfo(AgencyInfo value) {
        this.agencyInfo = value;
    }

    /**
     * Gets the value of the appliedProfile property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedProfile }
     *     
     */
    public AppliedProfile getAppliedProfile() {
        return appliedProfile;
    }

    /**
     * Sets the value of the appliedProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedProfile }
     *     
     */
    public void setAppliedProfile(AppliedProfile value) {
        this.appliedProfile = value;
    }

    /**
     * Gets the value of the agencyContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyContactInfo }
     *     
     */
    public AgencyContactInfo getAgencyContactInfo() {
        return agencyContactInfo;
    }

    /**
     * Sets the value of the agencyContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyContactInfo }
     *     
     */
    public void setAgencyContactInfo(AgencyContactInfo value) {
        this.agencyContactInfo = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerID }
     * 
     * 
     */
    public List<CustomerID> getCustomerID() {
        if (customerID == null) {
            customerID = new ArrayList<CustomerID>();
        }
        return this.customerID;
    }

    /**
     * Gets the value of the commissionRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionRemark }
     * 
     * 
     */
    public List<CommissionRemark> getCommissionRemark() {
        if (commissionRemark == null) {
            commissionRemark = new ArrayList<CommissionRemark>();
        }
        return this.commissionRemark;
    }

    /**
     * Gets the value of the invoiceRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceRemark }
     * 
     * 
     */
    public List<InvoiceRemark> getInvoiceRemark() {
        if (invoiceRemark == null) {
            invoiceRemark = new ArrayList<InvoiceRemark>();
        }
        return this.invoiceRemark;
    }

    /**
     * Gets the value of the changedKeyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChangedKeyStatus }
     *     
     */
    public ChangedKeyStatus getChangedKeyStatus() {
        return changedKeyStatus;
    }

    /**
     * Sets the value of the changedKeyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedKeyStatus }
     *     
     */
    public void setChangedKeyStatus(ChangedKeyStatus value) {
        this.changedKeyStatus = value;
    }

    /**
     * Gets the value of the locatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocatorCode() {
        return locatorCode;
    }

    /**
     * Sets the value of the locatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocatorCode(String value) {
        this.locatorCode = value;
    }

    /**
     * Gets the value of the savedTripLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedTripLocatorCode() {
        return savedTripLocatorCode;
    }

    /**
     * Sets the value of the savedTripLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedTripLocatorCode(String value) {
        this.savedTripLocatorCode = value;
    }

    /**
     * Gets the value of the lockReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockReason() {
        return lockReason;
    }

    /**
     * Sets the value of the lockReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockReason(String value) {
        this.lockReason = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TypeURStatus }
     *     
     */
    public TypeURStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeURStatus }
     *     
     */
    public void setStatus(TypeURStatus value) {
        this.status = value;
    }

}
