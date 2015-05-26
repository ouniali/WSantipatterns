
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.ActionStatus;
import com.travelport.schema.common_v15_0.BaseCreateReservationReq;
import com.travelport.schema.common_v15_0.DeliveryInfo;
import com.travelport.schema.common_v15_0.FormOfPayment;
import com.travelport.schema.common_v15_0.Payment;
import com.travelport.schema.common_v15_0.PointOfSale;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseCreateReservationReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}SupplierLocator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ThirdPartyInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}PointOfSale" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirPricingSolution"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ActionStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}FormOfPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}DeliveryInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AutoSeatAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}SpecificSeatAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AssociatedRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PocketItineraryRemark" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RetainReservation" type="{http://www.travelport.com/schema/air_v18_0}typeRetainReservation" default="None" />
 *       &lt;attribute name="Source">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supplierLocator",
    "thirdPartyInformation",
    "pointOfSale",
    "airPricingSolution",
    "actionStatus",
    "formOfPayment",
    "payment",
    "deliveryInfo",
    "autoSeatAssignment",
    "specificSeatAssignment",
    "associatedRemark",
    "pocketItineraryRemark"
})
@XmlRootElement(name = "AirCreateReservationReq")
public class AirCreateReservationReq
    extends BaseCreateReservationReq
{

    @XmlElement(name = "SupplierLocator", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<SupplierLocator> supplierLocator;
    @XmlElement(name = "ThirdPartyInformation", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<ThirdPartyInformation> thirdPartyInformation;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected PointOfSale pointOfSale;
    @XmlElement(name = "AirPricingSolution", required = true)
    protected AirPricingSolution airPricingSolution;
    @XmlElement(name = "ActionStatus", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<ActionStatus> actionStatus;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<FormOfPayment> formOfPayment;
    @XmlElement(name = "Payment", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<Payment> payment;
    @XmlElement(name = "DeliveryInfo", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected DeliveryInfo deliveryInfo;
    @XmlElement(name = "AutoSeatAssignment")
    protected List<AutoSeatAssignment> autoSeatAssignment;
    @XmlElement(name = "SpecificSeatAssignment")
    protected List<SpecificSeatAssignment> specificSeatAssignment;
    @XmlElement(name = "AssociatedRemark")
    protected List<AssociatedRemark> associatedRemark;
    @XmlElement(name = "PocketItineraryRemark")
    protected List<PocketItineraryRemark> pocketItineraryRemark;
    @XmlAttribute(name = "RetainReservation")
    protected TypeRetainReservation retainReservation;
    @XmlAttribute(name = "Source")
    protected String source;

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
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSale }
     *     
     */
    public PointOfSale getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSale }
     *     
     */
    public void setPointOfSale(PointOfSale value) {
        this.pointOfSale = value;
    }

    /**
     * Gets the value of the airPricingSolution property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingSolution }
     *     
     */
    public AirPricingSolution getAirPricingSolution() {
        return airPricingSolution;
    }

    /**
     * Sets the value of the airPricingSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingSolution }
     *     
     */
    public void setAirPricingSolution(AirPricingSolution value) {
        this.airPricingSolution = value;
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
     * Gets the value of the autoSeatAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoSeatAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AutoSeatAssignment }
     * 
     * 
     */
    public List<AutoSeatAssignment> getAutoSeatAssignment() {
        if (autoSeatAssignment == null) {
            autoSeatAssignment = new ArrayList<AutoSeatAssignment>();
        }
        return this.autoSeatAssignment;
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
     * Gets the value of the retainReservation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRetainReservation }
     *     
     */
    public TypeRetainReservation getRetainReservation() {
        if (retainReservation == null) {
            return TypeRetainReservation.NONE;
        } else {
            return retainReservation;
        }
    }

    /**
     * Sets the value of the retainReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRetainReservation }
     *     
     */
    public void setRetainReservation(TypeRetainReservation value) {
        this.retainReservation = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
