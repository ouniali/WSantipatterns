
package org.opentravel.ota._2003._05;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PTCFareBreakdownType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTCFareBreakdownType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PassengerTypeQuantity" type="{http://www.opentravel.org/OTA/2003/05}PassengerTypeQuantityType"/>
 *         &lt;element name="FareBasisCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}FareBasisCodeType" maxOccurs="299"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PassengerFare" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareType">
 *                 &lt;sequence>
 *                   &lt;element name="TicketFeeDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Fee" maxOccurs="9">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BaseFee" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Taxes" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Total" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="FeeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                                     &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to128" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Total" maxOccurs="3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Type" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                           &lt;enumeration value="Base"/>
 *                                           &lt;enumeration value="Tax"/>
 *                                           &lt;enumeration value="Total"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Usage">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="PassengerFare"/>
 *                       &lt;enumeration value="TicketFee"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TravelerRefNumber" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerRefNumberGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketDesignators" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TicketDesignator" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="FlightRefRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                           &lt;attribute name="TicketDesignatorExtension" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Endorsements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Endorsement" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *                           &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NonEndorsableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareInfo" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
 *                 &lt;sequence>
 *                   &lt;element name="PassengerFare" type="{http://www.opentravel.org/OTA/2003/05}FareType"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PricingUnit" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FareComponent" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightLeg" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *                                     &lt;attribute name="SurchargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                           &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="UnitNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PricingSource" type="{http://www.opentravel.org/OTA/2003/05}PricingSourceType" />
 *       &lt;attribute name="FlightRefNumberRPHList" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTCFareBreakdownType", propOrder = {
    "passengerTypeQuantity",
    "fareBasisCodes",
    "passengerFare",
    "travelerRefNumber",
    "ticketDesignators",
    "endorsements",
    "fareInfo",
    "pricingUnit"
})
public class PTCFareBreakdownType {

    @XmlElement(name = "PassengerTypeQuantity", required = true)
    protected PassengerTypeQuantityType passengerTypeQuantity;
    @XmlElement(name = "FareBasisCodes")
    protected PTCFareBreakdownType.FareBasisCodes fareBasisCodes;
    @XmlElement(name = "PassengerFare")
    protected List<PTCFareBreakdownType.PassengerFare> passengerFare;
    @XmlElement(name = "TravelerRefNumber")
    protected List<PTCFareBreakdownType.TravelerRefNumber> travelerRefNumber;
    @XmlElement(name = "TicketDesignators")
    protected PTCFareBreakdownType.TicketDesignators ticketDesignators;
    @XmlElement(name = "Endorsements")
    protected PTCFareBreakdownType.Endorsements endorsements;
    @XmlElement(name = "FareInfo")
    protected List<PTCFareBreakdownType.FareInfo> fareInfo;
    @XmlElement(name = "PricingUnit")
    protected List<PTCFareBreakdownType.PricingUnit> pricingUnit;
    @XmlAttribute(name = "PricingSource")
    protected PricingSourceType pricingSource;
    @XmlAttribute(name = "FlightRefNumberRPHList")
    protected List<String> flightRefNumberRPHList;

    /**
     * Gets the value of the passengerTypeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public PassengerTypeQuantityType getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }

    /**
     * Sets the value of the passengerTypeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerTypeQuantityType }
     *     
     */
    public void setPassengerTypeQuantity(PassengerTypeQuantityType value) {
        this.passengerTypeQuantity = value;
    }

    /**
     * Gets the value of the fareBasisCodes property.
     * 
     * @return
     *     possible object is
     *     {@link PTCFareBreakdownType.FareBasisCodes }
     *     
     */
    public PTCFareBreakdownType.FareBasisCodes getFareBasisCodes() {
        return fareBasisCodes;
    }

    /**
     * Sets the value of the fareBasisCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTCFareBreakdownType.FareBasisCodes }
     *     
     */
    public void setFareBasisCodes(PTCFareBreakdownType.FareBasisCodes value) {
        this.fareBasisCodes = value;
    }

    /**
     * Gets the value of the passengerFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCFareBreakdownType.PassengerFare }
     * 
     * 
     */
    public List<PTCFareBreakdownType.PassengerFare> getPassengerFare() {
        if (passengerFare == null) {
            passengerFare = new ArrayList<PTCFareBreakdownType.PassengerFare>();
        }
        return this.passengerFare;
    }

    /**
     * Gets the value of the travelerRefNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerRefNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCFareBreakdownType.TravelerRefNumber }
     * 
     * 
     */
    public List<PTCFareBreakdownType.TravelerRefNumber> getTravelerRefNumber() {
        if (travelerRefNumber == null) {
            travelerRefNumber = new ArrayList<PTCFareBreakdownType.TravelerRefNumber>();
        }
        return this.travelerRefNumber;
    }

    /**
     * Gets the value of the ticketDesignators property.
     * 
     * @return
     *     possible object is
     *     {@link PTCFareBreakdownType.TicketDesignators }
     *     
     */
    public PTCFareBreakdownType.TicketDesignators getTicketDesignators() {
        return ticketDesignators;
    }

    /**
     * Sets the value of the ticketDesignators property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTCFareBreakdownType.TicketDesignators }
     *     
     */
    public void setTicketDesignators(PTCFareBreakdownType.TicketDesignators value) {
        this.ticketDesignators = value;
    }

    /**
     * Gets the value of the endorsements property.
     * 
     * @return
     *     possible object is
     *     {@link PTCFareBreakdownType.Endorsements }
     *     
     */
    public PTCFareBreakdownType.Endorsements getEndorsements() {
        return endorsements;
    }

    /**
     * Sets the value of the endorsements property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTCFareBreakdownType.Endorsements }
     *     
     */
    public void setEndorsements(PTCFareBreakdownType.Endorsements value) {
        this.endorsements = value;
    }

    /**
     * Gets the value of the fareInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCFareBreakdownType.FareInfo }
     * 
     * 
     */
    public List<PTCFareBreakdownType.FareInfo> getFareInfo() {
        if (fareInfo == null) {
            fareInfo = new ArrayList<PTCFareBreakdownType.FareInfo>();
        }
        return this.fareInfo;
    }

    /**
     * Gets the value of the pricingUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCFareBreakdownType.PricingUnit }
     * 
     * 
     */
    public List<PTCFareBreakdownType.PricingUnit> getPricingUnit() {
        if (pricingUnit == null) {
            pricingUnit = new ArrayList<PTCFareBreakdownType.PricingUnit>();
        }
        return this.pricingUnit;
    }

    /**
     * Gets the value of the pricingSource property.
     * 
     * @return
     *     possible object is
     *     {@link PricingSourceType }
     *     
     */
    public PricingSourceType getPricingSource() {
        return pricingSource;
    }

    /**
     * Sets the value of the pricingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingSourceType }
     *     
     */
    public void setPricingSource(PricingSourceType value) {
        this.pricingSource = value;
    }

    /**
     * Gets the value of the flightRefNumberRPHList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightRefNumberRPHList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightRefNumberRPHList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlightRefNumberRPHList() {
        if (flightRefNumberRPHList == null) {
            flightRefNumberRPHList = new ArrayList<String>();
        }
        return this.flightRefNumberRPHList;
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
     *       &lt;sequence>
     *         &lt;element name="Endorsement" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
     *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="NonRefundableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NonEndorsableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "endorsement"
    })
    public static class Endorsements {

        @XmlElement(name = "Endorsement", required = true)
        protected List<PTCFareBreakdownType.Endorsements.Endorsement> endorsement;
        @XmlAttribute(name = "NonRefundableIndicator")
        protected Boolean nonRefundableIndicator;
        @XmlAttribute(name = "NonEndorsableIndicator")
        protected Boolean nonEndorsableIndicator;

        /**
         * Gets the value of the endorsement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endorsement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEndorsement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType.Endorsements.Endorsement }
         * 
         * 
         */
        public List<PTCFareBreakdownType.Endorsements.Endorsement> getEndorsement() {
            if (endorsement == null) {
                endorsement = new ArrayList<PTCFareBreakdownType.Endorsements.Endorsement>();
            }
            return this.endorsement;
        }

        /**
         * Gets the value of the nonRefundableIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonRefundableIndicator() {
            return nonRefundableIndicator;
        }

        /**
         * Sets the value of the nonRefundableIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonRefundableIndicator(Boolean value) {
            this.nonRefundableIndicator = value;
        }

        /**
         * Gets the value of the nonEndorsableIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNonEndorsableIndicator() {
            return nonEndorsableIndicator;
        }

        /**
         * Sets the value of the nonEndorsableIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNonEndorsableIndicator(Boolean value) {
            this.nonEndorsableIndicator = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
         *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Endorsement
            extends FreeTextType
        {

            @XmlAttribute(name = "Operation")
            protected ActionType operation;

            /**
             * Gets the value of the operation property.
             * 
             * @return
             *     possible object is
             *     {@link ActionType }
             *     
             */
            public ActionType getOperation() {
                return operation;
            }

            /**
             * Sets the value of the operation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionType }
             *     
             */
            public void setOperation(ActionType value) {
                this.operation = value;
            }

        }

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
     *       &lt;sequence>
     *         &lt;element name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}FareBasisCodeType" maxOccurs="299"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fareBasisCode"
    })
    public static class FareBasisCodes {

        @XmlElement(name = "FareBasisCode", required = true)
        protected List<FareBasisCodeType> fareBasisCode;

        /**
         * Gets the value of the fareBasisCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareBasisCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareBasisCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareBasisCodeType }
         * 
         * 
         */
        public List<FareBasisCodeType> getFareBasisCode() {
            if (fareBasisCode == null) {
                fareBasisCode = new ArrayList<FareBasisCodeType>();
            }
            return this.fareBasisCode;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareInfoType">
     *       &lt;sequence>
     *         &lt;element name="PassengerFare" type="{http://www.opentravel.org/OTA/2003/05}FareType"/>
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
        "passengerFare"
    })
    public static class FareInfo
        extends FareInfoType
    {

        @XmlElement(name = "PassengerFare", required = true)
        protected FareType passengerFare;

        /**
         * Gets the value of the passengerFare property.
         * 
         * @return
         *     possible object is
         *     {@link FareType }
         *     
         */
        public FareType getPassengerFare() {
            return passengerFare;
        }

        /**
         * Sets the value of the passengerFare property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareType }
         *     
         */
        public void setPassengerFare(FareType value) {
            this.passengerFare = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FareType">
     *       &lt;sequence>
     *         &lt;element name="TicketFeeDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Fee" maxOccurs="9">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BaseFee" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Taxes" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Total" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="FeeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                           &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to128" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Total" maxOccurs="3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Type" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                                 &lt;enumeration value="Base"/>
     *                                 &lt;enumeration value="Tax"/>
     *                                 &lt;enumeration value="Total"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Usage">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="PassengerFare"/>
     *             &lt;enumeration value="TicketFee"/>
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
        "ticketFeeDetail"
    })
    public static class PassengerFare
        extends FareType
    {

        @XmlElement(name = "TicketFeeDetail")
        protected PTCFareBreakdownType.PassengerFare.TicketFeeDetail ticketFeeDetail;
        @XmlAttribute(name = "Usage")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String usage;

        /**
         * Gets the value of the ticketFeeDetail property.
         * 
         * @return
         *     possible object is
         *     {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail }
         *     
         */
        public PTCFareBreakdownType.PassengerFare.TicketFeeDetail getTicketFeeDetail() {
            return ticketFeeDetail;
        }

        /**
         * Sets the value of the ticketFeeDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail }
         *     
         */
        public void setTicketFeeDetail(PTCFareBreakdownType.PassengerFare.TicketFeeDetail value) {
            this.ticketFeeDetail = value;
        }

        /**
         * Gets the value of the usage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsage() {
            return usage;
        }

        /**
         * Sets the value of the usage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsage(String value) {
            this.usage = value;
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
         *       &lt;sequence>
         *         &lt;element name="Fee" maxOccurs="9">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BaseFee" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Taxes" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Total" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="FeeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *                 &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to128" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Total" maxOccurs="3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Type" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *                       &lt;enumeration value="Base"/>
         *                       &lt;enumeration value="Tax"/>
         *                       &lt;enumeration value="Total"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fee",
            "total"
        })
        public static class TicketFeeDetail {

            @XmlElement(name = "Fee", required = true)
            protected List<PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee> fee;
            @XmlElement(name = "Total")
            protected List<PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Total> total;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the fee property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fee property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFee().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee }
             * 
             * 
             */
            public List<PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee> getFee() {
                if (fee == null) {
                    fee = new ArrayList<PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee>();
                }
                return this.fee;
            }

            /**
             * Gets the value of the total property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the total property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTotal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Total }
             * 
             * 
             */
            public List<PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Total> getTotal() {
                if (total == null) {
                    total = new ArrayList<PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Total>();
                }
                return this.total;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
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
             *       &lt;sequence>
             *         &lt;element name="BaseFee" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Taxes" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Total" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="FeeCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
             *       &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength0to128" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "baseFee",
                "taxes",
                "total"
            })
            public static class Fee {

                @XmlElement(name = "BaseFee")
                protected PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.BaseFee baseFee;
                @XmlElement(name = "Taxes")
                protected PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Taxes taxes;
                @XmlElement(name = "Total")
                protected PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Total total;
                @XmlAttribute(name = "FeeCode", required = true)
                protected String feeCode;
                @XmlAttribute(name = "Description")
                protected String description;

                /**
                 * Gets the value of the baseFee property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.BaseFee }
                 *     
                 */
                public PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.BaseFee getBaseFee() {
                    return baseFee;
                }

                /**
                 * Sets the value of the baseFee property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.BaseFee }
                 *     
                 */
                public void setBaseFee(PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.BaseFee value) {
                    this.baseFee = value;
                }

                /**
                 * Gets the value of the taxes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Taxes }
                 *     
                 */
                public PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Taxes getTaxes() {
                    return taxes;
                }

                /**
                 * Sets the value of the taxes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Taxes }
                 *     
                 */
                public void setTaxes(PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Taxes value) {
                    this.taxes = value;
                }

                /**
                 * Gets the value of the total property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Total }
                 *     
                 */
                public PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Total getTotal() {
                    return total;
                }

                /**
                 * Sets the value of the total property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Total }
                 *     
                 */
                public void setTotal(PTCFareBreakdownType.PassengerFare.TicketFeeDetail.Fee.Total value) {
                    this.total = value;
                }

                /**
                 * Gets the value of the feeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFeeCode() {
                    return feeCode;
                }

                /**
                 * Sets the value of the feeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFeeCode(String value) {
                    this.feeCode = value;
                }

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
                 *       &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class BaseFee {

                    @XmlAttribute(name = "Amount", required = true)
                    protected BigDecimal amount;

                    /**
                     * Gets the value of the amount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getAmount() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setAmount(BigDecimal value) {
                        this.amount = value;
                    }

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
                 *       &lt;sequence>
                 *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "tax"
                })
                public static class Taxes {

                    @XmlElement(name = "Tax", required = true)
                    protected List<AirTaxType> tax;
                    @XmlAttribute(name = "Amount")
                    protected BigDecimal amount;

                    /**
                     * Gets the value of the tax property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the tax property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTax().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link AirTaxType }
                     * 
                     * 
                     */
                    public List<AirTaxType> getTax() {
                        if (tax == null) {
                            tax = new ArrayList<AirTaxType>();
                        }
                        return this.tax;
                    }

                    /**
                     * Gets the value of the amount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getAmount() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setAmount(BigDecimal value) {
                        this.amount = value;
                    }

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
                 *       &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Total {

                    @XmlAttribute(name = "Amount", required = true)
                    protected BigDecimal amount;

                    /**
                     * Gets the value of the amount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getAmount() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setAmount(BigDecimal value) {
                        this.amount = value;
                    }

                }

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
             *       &lt;attribute name="Type" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
             *             &lt;enumeration value="Base"/>
             *             &lt;enumeration value="Tax"/>
             *             &lt;enumeration value="Total"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="Amount" use="required" type="{http://www.opentravel.org/OTA/2003/05}Money" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Total {

                @XmlAttribute(name = "Type", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String type;
                @XmlAttribute(name = "Amount", required = true)
                protected BigDecimal amount;

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
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmount(BigDecimal value) {
                    this.amount = value;
                }

            }

        }

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
     *       &lt;sequence>
     *         &lt;element name="FareComponent" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightLeg" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *                           &lt;attribute name="SurchargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="UnitNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fareComponent"
    })
    public static class PricingUnit {

        @XmlElement(name = "FareComponent", required = true)
        protected List<PTCFareBreakdownType.PricingUnit.FareComponent> fareComponent;
        @XmlAttribute(name = "UnitNumber", required = true)
        protected int unitNumber;

        /**
         * Gets the value of the fareComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType.PricingUnit.FareComponent }
         * 
         * 
         */
        public List<PTCFareBreakdownType.PricingUnit.FareComponent> getFareComponent() {
            if (fareComponent == null) {
                fareComponent = new ArrayList<PTCFareBreakdownType.PricingUnit.FareComponent>();
            }
            return this.fareComponent;
        }

        /**
         * Gets the value of the unitNumber property.
         * 
         */
        public int getUnitNumber() {
            return unitNumber;
        }

        /**
         * Sets the value of the unitNumber property.
         * 
         */
        public void setUnitNumber(int value) {
            this.unitNumber = value;
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
         *       &lt;sequence>
         *         &lt;element name="FlightLeg" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
         *                 &lt;attribute name="SurchargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flightLeg"
        })
        public static class FareComponent {

            @XmlElement(name = "FlightLeg", required = true)
            protected List<PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg> flightLeg;
            @XmlAttribute(name = "Number", required = true)
            protected int number;
            @XmlAttribute(name = "Amount")
            protected BigDecimal amount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the flightLeg property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightLeg property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightLeg().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg }
             * 
             * 
             */
            public List<PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg> getFlightLeg() {
                if (flightLeg == null) {
                    flightLeg = new ArrayList<PTCFareBreakdownType.PricingUnit.FareComponent.FlightLeg>();
                }
                return this.flightLeg;
            }

            /**
             * Gets the value of the number property.
             * 
             */
            public int getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             */
            public void setNumber(int value) {
                this.number = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAmount(BigDecimal value) {
                this.amount = value;
            }

            /**
             * Gets the value of the currencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Sets the value of the currencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Gets the value of the decimalPlaces property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * Sets the value of the decimalPlaces property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType">
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
             *       &lt;attribute name="SurchargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="FareBasisCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FlightLeg
                extends BookFlightSegmentType
            {

                @XmlAttribute(name = "SurchargeInd")
                protected Boolean surchargeInd;
                @XmlAttribute(name = "FareBasisCode")
                protected String fareBasisCode;
                @XmlAttribute(name = "UnitOfMeasureQuantity")
                protected BigDecimal unitOfMeasureQuantity;
                @XmlAttribute(name = "UnitOfMeasure")
                protected String unitOfMeasure;
                @XmlAttribute(name = "UnitOfMeasureCode")
                protected String unitOfMeasureCode;

                /**
                 * Gets the value of the surchargeInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isSurchargeInd() {
                    return surchargeInd;
                }

                /**
                 * Sets the value of the surchargeInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setSurchargeInd(Boolean value) {
                    this.surchargeInd = value;
                }

                /**
                 * Gets the value of the fareBasisCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFareBasisCode() {
                    return fareBasisCode;
                }

                /**
                 * Sets the value of the fareBasisCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFareBasisCode(String value) {
                    this.fareBasisCode = value;
                }

                /**
                 * Gets the value of the unitOfMeasureQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getUnitOfMeasureQuantity() {
                    return unitOfMeasureQuantity;
                }

                /**
                 * Sets the value of the unitOfMeasureQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setUnitOfMeasureQuantity(BigDecimal value) {
                    this.unitOfMeasureQuantity = value;
                }

                /**
                 * Gets the value of the unitOfMeasure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitOfMeasure() {
                    return unitOfMeasure;
                }

                /**
                 * Sets the value of the unitOfMeasure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitOfMeasure(String value) {
                    this.unitOfMeasure = value;
                }

                /**
                 * Gets the value of the unitOfMeasureCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitOfMeasureCode() {
                    return unitOfMeasureCode;
                }

                /**
                 * Sets the value of the unitOfMeasureCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitOfMeasureCode(String value) {
                    this.unitOfMeasureCode = value;
                }

            }

        }

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
     *       &lt;sequence>
     *         &lt;element name="TicketDesignator" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="FlightRefRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                 &lt;attribute name="TicketDesignatorExtension" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ticketDesignator"
    })
    public static class TicketDesignators {

        @XmlElement(name = "TicketDesignator", required = true)
        protected List<PTCFareBreakdownType.TicketDesignators.TicketDesignator> ticketDesignator;

        /**
         * Gets the value of the ticketDesignator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketDesignator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketDesignator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PTCFareBreakdownType.TicketDesignators.TicketDesignator }
         * 
         * 
         */
        public List<PTCFareBreakdownType.TicketDesignators.TicketDesignator> getTicketDesignator() {
            if (ticketDesignator == null) {
                ticketDesignator = new ArrayList<PTCFareBreakdownType.TicketDesignators.TicketDesignator>();
            }
            return this.ticketDesignator;
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
         *       &lt;attribute name="FlightRefRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="TicketDesignatorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *       &lt;attribute name="TicketDesignatorExtension" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TicketDesignator {

            @XmlAttribute(name = "FlightRefRPH")
            protected String flightRefRPH;
            @XmlAttribute(name = "TicketDesignatorCode")
            protected String ticketDesignatorCode;
            @XmlAttribute(name = "TicketDesignatorExtension")
            protected String ticketDesignatorExtension;

            /**
             * Gets the value of the flightRefRPH property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightRefRPH() {
                return flightRefRPH;
            }

            /**
             * Sets the value of the flightRefRPH property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightRefRPH(String value) {
                this.flightRefRPH = value;
            }

            /**
             * Gets the value of the ticketDesignatorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketDesignatorCode() {
                return ticketDesignatorCode;
            }

            /**
             * Sets the value of the ticketDesignatorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketDesignatorCode(String value) {
                this.ticketDesignatorCode = value;
            }

            /**
             * Gets the value of the ticketDesignatorExtension property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTicketDesignatorExtension() {
                return ticketDesignatorExtension;
            }

            /**
             * Sets the value of the ticketDesignatorExtension property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTicketDesignatorExtension(String value) {
                this.ticketDesignatorExtension = value;
            }

        }

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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerRefNumberGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelerRefNumber {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "SurnameRefNumber")
        protected String surnameRefNumber;

        /**
         * Gets the value of the rph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * Sets the value of the rph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * Gets the value of the surnameRefNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurnameRefNumber() {
            return surnameRefNumber;
        }

        /**
         * Sets the value of the surnameRefNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurnameRefNumber(String value) {
            this.surnameRefNumber = value;
        }

    }

}
