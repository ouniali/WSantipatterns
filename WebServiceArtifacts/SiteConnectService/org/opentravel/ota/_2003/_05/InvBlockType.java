
package org.opentravel.ota._2003._05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for InvBlockType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvBlockType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InvBlockDates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockDatesGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoomTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomType" type="{http://www.opentravel.org/OTA/2003/05}InvBlockRoomType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MethodInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MethodInfoGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BlockDescriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BlockDescription" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Contacts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DestinationSystemCodes" type="{http://www.opentravel.org/OTA/2003/05}DestinationSystemCodesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvBlockType", propOrder = {
    "hotelRef",
    "invBlockDates",
    "roomTypes",
    "methodInfo",
    "blockDescriptions",
    "contacts",
    "destinationSystemCodes"
})
public class InvBlockType {

    @XmlElement(name = "HotelRef")
    protected InvBlockType.HotelRef hotelRef;
    @XmlElement(name = "InvBlockDates")
    protected InvBlockType.InvBlockDates invBlockDates;
    @XmlElement(name = "RoomTypes")
    protected InvBlockType.RoomTypes roomTypes;
    @XmlElement(name = "MethodInfo")
    protected InvBlockType.MethodInfo methodInfo;
    @XmlElement(name = "BlockDescriptions")
    protected InvBlockType.BlockDescriptions blockDescriptions;
    @XmlElement(name = "Contacts")
    protected InvBlockType.Contacts contacts;
    @XmlElement(name = "DestinationSystemCodes")
    protected DestinationSystemCodesType destinationSystemCodes;
    @XmlAttribute(name = "BookingStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bookingStatus;
    @XmlAttribute(name = "InvBlockTypeCode")
    protected String invBlockTypeCode;
    @XmlAttribute(name = "InvBlockCode")
    protected String invBlockCode;
    @XmlAttribute(name = "InvBlockGroupingCode")
    protected String invBlockGroupingCode;
    @XmlAttribute(name = "InvBlockName")
    protected String invBlockName;
    @XmlAttribute(name = "InvBlockLongName")
    protected String invBlockLongName;
    @XmlAttribute(name = "InvBlockStatusCode")
    protected String invBlockStatusCode;
    @XmlAttribute(name = "PMS_InvBlockID")
    protected String pmsInvBlockID;
    @XmlAttribute(name = "OpportunityID")
    protected String opportunityID;
    @XmlAttribute(name = "InvBlockCompanyID")
    protected String invBlockCompanyID;
    @XmlAttribute(name = "RestrictedBookingCodeList")
    protected List<String> restrictedBookingCodeList;
    @XmlAttribute(name = "RestrictedViewingCodeList")
    protected List<String> restrictedViewingCodeList;
    @XmlAttribute(name = "TransactionAction")
    protected TransactionActionType transactionAction;
    @XmlAttribute(name = "TransactionDetail")
    protected String transactionDetail;
    @XmlAttribute(name = "QuoteID")
    protected String quoteID;

    /**
     * Gets the value of the hotelRef property.
     * 
     * @return
     *     possible object is
     *     {@link InvBlockType.HotelRef }
     *     
     */
    public InvBlockType.HotelRef getHotelRef() {
        return hotelRef;
    }

    /**
     * Sets the value of the hotelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvBlockType.HotelRef }
     *     
     */
    public void setHotelRef(InvBlockType.HotelRef value) {
        this.hotelRef = value;
    }

    /**
     * Gets the value of the invBlockDates property.
     * 
     * @return
     *     possible object is
     *     {@link InvBlockType.InvBlockDates }
     *     
     */
    public InvBlockType.InvBlockDates getInvBlockDates() {
        return invBlockDates;
    }

    /**
     * Sets the value of the invBlockDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvBlockType.InvBlockDates }
     *     
     */
    public void setInvBlockDates(InvBlockType.InvBlockDates value) {
        this.invBlockDates = value;
    }

    /**
     * Gets the value of the roomTypes property.
     * 
     * @return
     *     possible object is
     *     {@link InvBlockType.RoomTypes }
     *     
     */
    public InvBlockType.RoomTypes getRoomTypes() {
        return roomTypes;
    }

    /**
     * Sets the value of the roomTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvBlockType.RoomTypes }
     *     
     */
    public void setRoomTypes(InvBlockType.RoomTypes value) {
        this.roomTypes = value;
    }

    /**
     * Gets the value of the methodInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InvBlockType.MethodInfo }
     *     
     */
    public InvBlockType.MethodInfo getMethodInfo() {
        return methodInfo;
    }

    /**
     * Sets the value of the methodInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvBlockType.MethodInfo }
     *     
     */
    public void setMethodInfo(InvBlockType.MethodInfo value) {
        this.methodInfo = value;
    }

    /**
     * Gets the value of the blockDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link InvBlockType.BlockDescriptions }
     *     
     */
    public InvBlockType.BlockDescriptions getBlockDescriptions() {
        return blockDescriptions;
    }

    /**
     * Sets the value of the blockDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvBlockType.BlockDescriptions }
     *     
     */
    public void setBlockDescriptions(InvBlockType.BlockDescriptions value) {
        this.blockDescriptions = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link InvBlockType.Contacts }
     *     
     */
    public InvBlockType.Contacts getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvBlockType.Contacts }
     *     
     */
    public void setContacts(InvBlockType.Contacts value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the destinationSystemCodes property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationSystemCodesType }
     *     
     */
    public DestinationSystemCodesType getDestinationSystemCodes() {
        return destinationSystemCodes;
    }

    /**
     * Sets the value of the destinationSystemCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationSystemCodesType }
     *     
     */
    public void setDestinationSystemCodes(DestinationSystemCodesType value) {
        this.destinationSystemCodes = value;
    }

    /**
     * Gets the value of the bookingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingStatus() {
        return bookingStatus;
    }

    /**
     * Sets the value of the bookingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingStatus(String value) {
        this.bookingStatus = value;
    }

    /**
     * Gets the value of the invBlockTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvBlockTypeCode() {
        return invBlockTypeCode;
    }

    /**
     * Sets the value of the invBlockTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvBlockTypeCode(String value) {
        this.invBlockTypeCode = value;
    }

    /**
     * Gets the value of the invBlockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvBlockCode() {
        return invBlockCode;
    }

    /**
     * Sets the value of the invBlockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvBlockCode(String value) {
        this.invBlockCode = value;
    }

    /**
     * Gets the value of the invBlockGroupingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvBlockGroupingCode() {
        return invBlockGroupingCode;
    }

    /**
     * Sets the value of the invBlockGroupingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvBlockGroupingCode(String value) {
        this.invBlockGroupingCode = value;
    }

    /**
     * Gets the value of the invBlockName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvBlockName() {
        return invBlockName;
    }

    /**
     * Sets the value of the invBlockName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvBlockName(String value) {
        this.invBlockName = value;
    }

    /**
     * Gets the value of the invBlockLongName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvBlockLongName() {
        return invBlockLongName;
    }

    /**
     * Sets the value of the invBlockLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvBlockLongName(String value) {
        this.invBlockLongName = value;
    }

    /**
     * Gets the value of the invBlockStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvBlockStatusCode() {
        return invBlockStatusCode;
    }

    /**
     * Sets the value of the invBlockStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvBlockStatusCode(String value) {
        this.invBlockStatusCode = value;
    }

    /**
     * Gets the value of the pmsInvBlockID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMSInvBlockID() {
        return pmsInvBlockID;
    }

    /**
     * Sets the value of the pmsInvBlockID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMSInvBlockID(String value) {
        this.pmsInvBlockID = value;
    }

    /**
     * Gets the value of the opportunityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityID() {
        return opportunityID;
    }

    /**
     * Sets the value of the opportunityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityID(String value) {
        this.opportunityID = value;
    }

    /**
     * Gets the value of the invBlockCompanyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvBlockCompanyID() {
        return invBlockCompanyID;
    }

    /**
     * Sets the value of the invBlockCompanyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvBlockCompanyID(String value) {
        this.invBlockCompanyID = value;
    }

    /**
     * Gets the value of the restrictedBookingCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedBookingCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedBookingCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRestrictedBookingCodeList() {
        if (restrictedBookingCodeList == null) {
            restrictedBookingCodeList = new ArrayList<String>();
        }
        return this.restrictedBookingCodeList;
    }

    /**
     * Gets the value of the restrictedViewingCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedViewingCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedViewingCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRestrictedViewingCodeList() {
        if (restrictedViewingCodeList == null) {
            restrictedViewingCodeList = new ArrayList<String>();
        }
        return this.restrictedViewingCodeList;
    }

    /**
     * Gets the value of the transactionAction property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionActionType }
     *     
     */
    public TransactionActionType getTransactionAction() {
        return transactionAction;
    }

    /**
     * Sets the value of the transactionAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionActionType }
     *     
     */
    public void setTransactionAction(TransactionActionType value) {
        this.transactionAction = value;
    }

    /**
     * Gets the value of the transactionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDetail() {
        return transactionDetail;
    }

    /**
     * Sets the value of the transactionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDetail(String value) {
        this.transactionDetail = value;
    }

    /**
     * Gets the value of the quoteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteID() {
        return quoteID;
    }

    /**
     * Sets the value of the quoteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteID(String value) {
        this.quoteID = value;
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
     *         &lt;element name="BlockDescription" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *               &lt;/extension>
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
        "blockDescription"
    })
    public static class BlockDescriptions {

        @XmlElement(name = "BlockDescription", required = true)
        protected List<InvBlockType.BlockDescriptions.BlockDescription> blockDescription;

        /**
         * Gets the value of the blockDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blockDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlockDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvBlockType.BlockDescriptions.BlockDescription }
         * 
         * 
         */
        public List<InvBlockType.BlockDescriptions.BlockDescription> getBlockDescription() {
            if (blockDescription == null) {
                blockDescription = new ArrayList<InvBlockType.BlockDescriptions.BlockDescription>();
            }
            return this.blockDescription;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BlockDescription
            extends ParagraphType
        {

            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "End")
            protected String end;

            /**
             * Gets the value of the start property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * Sets the value of the start property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * Gets the value of the duration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDuration() {
                return duration;
            }

            /**
             * Sets the value of the duration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuration(String value) {
                this.duration = value;
            }

            /**
             * Gets the value of the end property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * Sets the value of the end property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
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
     *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" maxOccurs="99"/>
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
        "contact"
    })
    public static class Contacts {

        @XmlElement(name = "Contact", required = true)
        protected List<ContactPersonType> contact;

        /**
         * Gets the value of the contact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactPersonType }
         * 
         * 
         */
        public List<ContactPersonType> getContact() {
            if (contact == null) {
                contact = new ArrayList<ContactPersonType>();
            }
            return this.contact;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelRef {

        @XmlAttribute(name = "ChainCode")
        protected String chainCode;
        @XmlAttribute(name = "BrandCode")
        protected String brandCode;
        @XmlAttribute(name = "HotelCode")
        protected String hotelCode;
        @XmlAttribute(name = "HotelCityCode")
        protected String hotelCityCode;
        @XmlAttribute(name = "HotelName")
        protected String hotelName;
        @XmlAttribute(name = "HotelCodeContext")
        protected String hotelCodeContext;
        @XmlAttribute(name = "ChainName")
        protected String chainName;
        @XmlAttribute(name = "BrandName")
        protected String brandName;
        @XmlAttribute(name = "AreaID")
        protected String areaID;

        /**
         * Gets the value of the chainCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainCode() {
            return chainCode;
        }

        /**
         * Sets the value of the chainCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainCode(String value) {
            this.chainCode = value;
        }

        /**
         * Gets the value of the brandCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandCode() {
            return brandCode;
        }

        /**
         * Sets the value of the brandCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandCode(String value) {
            this.brandCode = value;
        }

        /**
         * Gets the value of the hotelCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCode() {
            return hotelCode;
        }

        /**
         * Sets the value of the hotelCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCode(String value) {
            this.hotelCode = value;
        }

        /**
         * Gets the value of the hotelCityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCityCode() {
            return hotelCityCode;
        }

        /**
         * Sets the value of the hotelCityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCityCode(String value) {
            this.hotelCityCode = value;
        }

        /**
         * Gets the value of the hotelName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelName() {
            return hotelName;
        }

        /**
         * Sets the value of the hotelName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelName(String value) {
            this.hotelName = value;
        }

        /**
         * Gets the value of the hotelCodeContext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelCodeContext() {
            return hotelCodeContext;
        }

        /**
         * Sets the value of the hotelCodeContext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelCodeContext(String value) {
            this.hotelCodeContext = value;
        }

        /**
         * Gets the value of the chainName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChainName() {
            return chainName;
        }

        /**
         * Sets the value of the chainName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChainName(String value) {
            this.chainName = value;
        }

        /**
         * Gets the value of the brandName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrandName() {
            return brandName;
        }

        /**
         * Sets the value of the brandName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrandName(String value) {
            this.brandName = value;
        }

        /**
         * Gets the value of the areaID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaID() {
            return areaID;
        }

        /**
         * Sets the value of the areaID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaID(String value) {
            this.areaID = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockDatesGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InvBlockDates {

        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "EndDateExtensionIndicator")
        protected Boolean endDateExtensionIndicator;
        @XmlAttribute(name = "AbsoluteCutoff")
        protected String absoluteCutoff;
        @XmlAttribute(name = "OffsetDuration")
        protected Duration offsetDuration;
        @XmlAttribute(name = "OffsetCalculationMode")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String offsetCalculationMode;

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * Gets the value of the endDateExtensionIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEndDateExtensionIndicator() {
            return endDateExtensionIndicator;
        }

        /**
         * Sets the value of the endDateExtensionIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEndDateExtensionIndicator(Boolean value) {
            this.endDateExtensionIndicator = value;
        }

        /**
         * Gets the value of the absoluteCutoff property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteCutoff() {
            return absoluteCutoff;
        }

        /**
         * Sets the value of the absoluteCutoff property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteCutoff(String value) {
            this.absoluteCutoff = value;
        }

        /**
         * Gets the value of the offsetDuration property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getOffsetDuration() {
            return offsetDuration;
        }

        /**
         * Sets the value of the offsetDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setOffsetDuration(Duration value) {
            this.offsetDuration = value;
        }

        /**
         * Gets the value of the offsetCalculationMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetCalculationMode() {
            return offsetCalculationMode;
        }

        /**
         * Sets the value of the offsetCalculationMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetCalculationMode(String value) {
            this.offsetCalculationMode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MethodInfoGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MethodInfo {

        @XmlAttribute(name = "BillingType")
        protected String billingType;
        @XmlAttribute(name = "SignFoodAndBev")
        protected Boolean signFoodAndBev;
        @XmlAttribute(name = "ReservationMethodCode")
        protected String reservationMethodCode;

        /**
         * Gets the value of the billingType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingType() {
            return billingType;
        }

        /**
         * Sets the value of the billingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingType(String value) {
            this.billingType = value;
        }

        /**
         * Gets the value of the signFoodAndBev property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSignFoodAndBev() {
            return signFoodAndBev;
        }

        /**
         * Sets the value of the signFoodAndBev property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSignFoodAndBev(Boolean value) {
            this.signFoodAndBev = value;
        }

        /**
         * Gets the value of the reservationMethodCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReservationMethodCode() {
            return reservationMethodCode;
        }

        /**
         * Sets the value of the reservationMethodCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReservationMethodCode(String value) {
            this.reservationMethodCode = value;
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
     *         &lt;element name="RoomType" type="{http://www.opentravel.org/OTA/2003/05}InvBlockRoomType" maxOccurs="99"/>
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
        "roomType"
    })
    public static class RoomTypes {

        @XmlElement(name = "RoomType", required = true)
        protected List<InvBlockRoomType> roomType;

        /**
         * Gets the value of the roomType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvBlockRoomType }
         * 
         * 
         */
        public List<InvBlockRoomType> getRoomType() {
            if (roomType == null) {
                roomType = new ArrayList<InvBlockRoomType>();
            }
            return this.roomType;
        }

    }

}
