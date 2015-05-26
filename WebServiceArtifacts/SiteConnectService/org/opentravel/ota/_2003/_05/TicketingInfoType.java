
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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TicketingInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketAdvisory" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *                 &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketingVendor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PricingSystem" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalFare" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="TicketTimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CancelOnExpiryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TicketType" type="{http://www.opentravel.org/OTA/2003/05}TicketType" />
 *       &lt;attribute name="TicketingStatus" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="FlightSegmentRefNumber" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *       &lt;attribute name="TravelerRefNumber" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *       &lt;attribute name="ReverseTktgSegmentsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PseudoCityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="RequestedTicketingDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *       &lt;attribute name="TimeLimitMinutes" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *       &lt;attribute name="BookingChangeType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="FlightSegment"/>
 *             &lt;enumeration value="TravelerName"/>
 *             &lt;enumeration value="Both"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TicketDocumentNbr" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="Operation" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *       &lt;attribute name="MiscTicketingCode" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingInfoType", propOrder = {
    "ticketAdvisory",
    "ticketingVendor",
    "pricingSystem",
    "totalFare"
})
@XmlSeeAlso({
    TicketingInfoRSType.class
})
public class TicketingInfoType {

    @XmlElement(name = "TicketAdvisory")
    protected List<TicketingInfoType.TicketAdvisory> ticketAdvisory;
    @XmlElement(name = "TicketingVendor")
    protected TicketingInfoType.TicketingVendor ticketingVendor;
    @XmlElement(name = "PricingSystem")
    protected TicketingInfoType.PricingSystem pricingSystem;
    @XmlElement(name = "TotalFare")
    protected TicketingInfoType.TotalFare totalFare;
    @XmlAttribute(name = "TicketTimeLimit")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ticketTimeLimit;
    @XmlAttribute(name = "CancelOnExpiryInd")
    protected Boolean cancelOnExpiryInd;
    @XmlAttribute(name = "TicketType")
    protected TicketType ticketType;
    @XmlAttribute(name = "TicketingStatus")
    protected String ticketingStatus;
    @XmlAttribute(name = "FlightSegmentRefNumber")
    protected List<String> flightSegmentRefNumber;
    @XmlAttribute(name = "TravelerRefNumber")
    protected List<String> travelerRefNumber;
    @XmlAttribute(name = "ReverseTktgSegmentsInd")
    protected Boolean reverseTktgSegmentsInd;
    @XmlAttribute(name = "PseudoCityCode")
    protected String pseudoCityCode;
    @XmlAttribute(name = "RequestedTicketingDate")
    protected String requestedTicketingDate;
    @XmlAttribute(name = "TimeLimitMinutes")
    protected Integer timeLimitMinutes;
    @XmlAttribute(name = "BookingChangeType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bookingChangeType;
    @XmlAttribute(name = "TicketDocumentNbr")
    protected String ticketDocumentNbr;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlAttribute(name = "Operation")
    protected ActionType operation;
    @XmlAttribute(name = "MiscTicketingCode")
    protected List<String> miscTicketingCode;

    /**
     * Gets the value of the ticketAdvisory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketAdvisory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketAdvisory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingInfoType.TicketAdvisory }
     * 
     * 
     */
    public List<TicketingInfoType.TicketAdvisory> getTicketAdvisory() {
        if (ticketAdvisory == null) {
            ticketAdvisory = new ArrayList<TicketingInfoType.TicketAdvisory>();
        }
        return this.ticketAdvisory;
    }

    /**
     * Gets the value of the ticketingVendor property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingInfoType.TicketingVendor }
     *     
     */
    public TicketingInfoType.TicketingVendor getTicketingVendor() {
        return ticketingVendor;
    }

    /**
     * Sets the value of the ticketingVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingInfoType.TicketingVendor }
     *     
     */
    public void setTicketingVendor(TicketingInfoType.TicketingVendor value) {
        this.ticketingVendor = value;
    }

    /**
     * Gets the value of the pricingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingInfoType.PricingSystem }
     *     
     */
    public TicketingInfoType.PricingSystem getPricingSystem() {
        return pricingSystem;
    }

    /**
     * Sets the value of the pricingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingInfoType.PricingSystem }
     *     
     */
    public void setPricingSystem(TicketingInfoType.PricingSystem value) {
        this.pricingSystem = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingInfoType.TotalFare }
     *     
     */
    public TicketingInfoType.TotalFare getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingInfoType.TotalFare }
     *     
     */
    public void setTotalFare(TicketingInfoType.TotalFare value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the ticketTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTicketTimeLimit() {
        return ticketTimeLimit;
    }

    /**
     * Sets the value of the ticketTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTicketTimeLimit(XMLGregorianCalendar value) {
        this.ticketTimeLimit = value;
    }

    /**
     * Gets the value of the cancelOnExpiryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelOnExpiryInd() {
        return cancelOnExpiryInd;
    }

    /**
     * Sets the value of the cancelOnExpiryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelOnExpiryInd(Boolean value) {
        this.cancelOnExpiryInd = value;
    }

    /**
     * Gets the value of the ticketType property.
     * 
     * @return
     *     possible object is
     *     {@link TicketType }
     *     
     */
    public TicketType getTicketType() {
        return ticketType;
    }

    /**
     * Sets the value of the ticketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketType }
     *     
     */
    public void setTicketType(TicketType value) {
        this.ticketType = value;
    }

    /**
     * Gets the value of the ticketingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingStatus() {
        return ticketingStatus;
    }

    /**
     * Sets the value of the ticketingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingStatus(String value) {
        this.ticketingStatus = value;
    }

    /**
     * Gets the value of the flightSegmentRefNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentRefNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentRefNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlightSegmentRefNumber() {
        if (flightSegmentRefNumber == null) {
            flightSegmentRefNumber = new ArrayList<String>();
        }
        return this.flightSegmentRefNumber;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getTravelerRefNumber() {
        if (travelerRefNumber == null) {
            travelerRefNumber = new ArrayList<String>();
        }
        return this.travelerRefNumber;
    }

    /**
     * Gets the value of the reverseTktgSegmentsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseTktgSegmentsInd() {
        return reverseTktgSegmentsInd;
    }

    /**
     * Sets the value of the reverseTktgSegmentsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseTktgSegmentsInd(Boolean value) {
        this.reverseTktgSegmentsInd = value;
    }

    /**
     * Gets the value of the pseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudoCityCode(String value) {
        this.pseudoCityCode = value;
    }

    /**
     * Gets the value of the requestedTicketingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedTicketingDate() {
        return requestedTicketingDate;
    }

    /**
     * Sets the value of the requestedTicketingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedTicketingDate(String value) {
        this.requestedTicketingDate = value;
    }

    /**
     * Gets the value of the timeLimitMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeLimitMinutes() {
        return timeLimitMinutes;
    }

    /**
     * Sets the value of the timeLimitMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeLimitMinutes(Integer value) {
        this.timeLimitMinutes = value;
    }

    /**
     * Gets the value of the bookingChangeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingChangeType() {
        return bookingChangeType;
    }

    /**
     * Sets the value of the bookingChangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingChangeType(String value) {
        this.bookingChangeType = value;
    }

    /**
     * Gets the value of the ticketDocumentNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDocumentNbr() {
        return ticketDocumentNbr;
    }

    /**
     * Sets the value of the ticketDocumentNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDocumentNbr(String value) {
        this.ticketDocumentNbr = value;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

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

    /**
     * Gets the value of the miscTicketingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the miscTicketingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiscTicketingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMiscTicketingCode() {
        if (miscTicketingCode == null) {
            miscTicketingCode = new ArrayList<String>();
        }
        return this.miscTicketingCode;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PricingSystem {

        @XmlAttribute(name = "CompanyShortName")
        protected String companyShortName;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * Gets the value of the companyShortName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyShortName() {
            return companyShortName;
        }

        /**
         * Sets the value of the companyShortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyShortName(String value) {
            this.companyShortName = value;
        }

        /**
         * Gets the value of the travelSector property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * Sets the value of the travelSector property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

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
    public static class TicketAdvisory
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CompanyID_AttributesGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TicketingVendor {

        @XmlAttribute(name = "CompanyShortName")
        protected String companyShortName;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * Gets the value of the companyShortName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyShortName() {
            return companyShortName;
        }

        /**
         * Sets the value of the companyShortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyShortName(String value) {
            this.companyShortName = value;
        }

        /**
         * Gets the value of the travelSector property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * Sets the value of the travelSector property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the codeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * Sets the value of the codeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TotalFare {

        @XmlAttribute(name = "Amount")
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

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

    }

}
