
package com.travelport.schema.passive_v14_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Amount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Due"/>
 *                       &lt;enumeration value="Paid"/>
 *                       &lt;enumeration value="Text"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="AmountDuePaid" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="SupplierCode" type="{http://www.travelport.com/schema/passive_v14_0}typePassiveSupplierCode" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Origin" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
 *       &lt;attribute name="Destination" type="{http://www.travelport.com/schema/common_v15_0}typeIATACode" />
 *       &lt;attribute name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ClassOfService" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SegmentType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Car"/>
 *             &lt;enumeration value="Hotel"/>
 *             &lt;enumeration value="Tour"/>
 *             &lt;enumeration value="Air"/>
 *             &lt;enumeration value="Surface"/>
 *             &lt;enumeration value="Bus"/>
 *             &lt;enumeration value="Rail"/>
 *             &lt;enumeration value="Cruise"/>
 *             &lt;enumeration value="Helicopter"/>
 *             &lt;enumeration value="Limousine"/>
 *             &lt;enumeration value="Transfers"/>
 *             &lt;enumeration value="Miscellaneous"/>
 *             &lt;enumeration value="ProcessingFee"/>
 *             &lt;enumeration value="Insurance"/>
 *             &lt;enumeration value="AirTaxi"/>
 *             &lt;enumeration value="Currency"/>
 *             &lt;enumeration value="Fees"/>
 *             &lt;enumeration value="Forms"/>
 *             &lt;enumeration value="Group"/>
 *             &lt;enumeration value="Include"/>
 *             &lt;enumeration value="Leisure"/>
 *             &lt;enumeration value="Land"/>
 *             &lt;enumeration value="Other"/>
 *             &lt;enumeration value="Package"/>
 *             &lt;enumeration value="RailRoad"/>
 *             &lt;enumeration value="SeaPlane"/>
 *             &lt;enumeration value="Software"/>
 *             &lt;enumeration value="Supply"/>
 *             &lt;enumeration value="Service"/>
 *             &lt;enumeration value="Theater"/>
 *             &lt;enumeration value="Ticket"/>
 *             &lt;enumeration value="Transfer"/>
 *             &lt;enumeration value="Taxi"/>
 *             &lt;enumeration value="Charter"/>
 *             &lt;enumeration value="CorporatePlane"/>
 *             &lt;enumeration value="UnitedPassive"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PassiveProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="TravelOrder" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "amount"
})
@XmlRootElement(name = "PassiveSegment")
public class PassiveSegment {

    @XmlElement(name = "Amount")
    protected PassiveSegment.Amount amount;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "StartDate")
    protected String startDate;
    @XmlAttribute(name = "EndDate")
    protected String endDate;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "ClassOfService")
    protected String classOfService;
    @XmlAttribute(name = "NumberOfItems")
    protected BigInteger numberOfItems;
    @XmlAttribute(name = "SegmentType", required = true)
    protected String segmentType;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "VehicleType")
    protected String vehicleType;
    @XmlAttribute(name = "PassiveProviderReservationInfoRef")
    protected String passiveProviderReservationInfoRef;
    @XmlAttribute(name = "Group")
    protected BigInteger group;
    @XmlAttribute(name = "TravelOrder")
    protected BigInteger travelOrder;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link PassiveSegment.Amount }
     *     
     */
    public PassiveSegment.Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassiveSegment.Amount }
     *     
     */
    public void setAmount(PassiveSegment.Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the numberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Sets the value of the numberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItems(BigInteger value) {
        this.numberOfItems = value;
    }

    /**
     * Gets the value of the segmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentType() {
        return segmentType;
    }

    /**
     * Sets the value of the segmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentType(String value) {
        this.segmentType = value;
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
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the passiveProviderReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassiveProviderReservationInfoRef() {
        return passiveProviderReservationInfoRef;
    }

    /**
     * Sets the value of the passiveProviderReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassiveProviderReservationInfoRef(String value) {
        this.passiveProviderReservationInfoRef = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGroup(BigInteger value) {
        this.group = value;
    }

    /**
     * Gets the value of the travelOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTravelOrder() {
        return travelOrder;
    }

    /**
     * Sets the value of the travelOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTravelOrder(BigInteger value) {
        this.travelOrder = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Due"/>
     *             &lt;enumeration value="Paid"/>
     *             &lt;enumeration value="Text"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="AmountDuePaid" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Amount {

        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "AmountDuePaid")
        protected String amountDuePaid;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the amountDuePaid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmountDuePaid() {
            return amountDuePaid;
        }

        /**
         * Sets the value of the amountDuePaid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmountDuePaid(String value) {
            this.amountDuePaid = value;
        }

    }

}
