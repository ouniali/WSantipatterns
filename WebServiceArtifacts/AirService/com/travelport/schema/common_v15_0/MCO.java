
package com.travelport.schema.common_v15_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AgencyInfo"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Name"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}FormOfPayment" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}GeneralRemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Endorsement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Restriction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Number" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeMCOType" />
 *       &lt;attribute name="ServiceFeeType" type="{http://www.travelport.com/schema/common_v15_0}typeMCOFeeType" />
 *       &lt;attribute name="Status" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeMCOStatus" />
 *       &lt;attribute name="CreateDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ModifyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CarrierCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeCarrier" />
 *       &lt;attribute name="LocationCode" type="{http://www.travelport.com/schema/common_v15_0}typeAirport" />
 *       &lt;attribute name="LocatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Amount" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="NetAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="ProcessingFee" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="Refundable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Voidable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Exchangeable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agencyInfo",
    "name",
    "formOfPayment",
    "generalRemark",
    "endorsement",
    "restriction"
})
@XmlRootElement(name = "MCO")
public class MCO {

    @XmlElement(name = "AgencyInfo", required = true)
    protected AgencyInfo agencyInfo;
    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "FormOfPayment")
    protected FormOfPayment formOfPayment;
    @XmlElement(name = "GeneralRemark")
    protected List<GeneralRemark> generalRemark;
    @XmlElement(name = "Endorsement")
    protected List<Endorsement> endorsement;
    @XmlElement(name = "Restriction")
    protected List<Restriction> restriction;
    @XmlAttribute(name = "Number", required = true)
    protected String number;
    @XmlAttribute(name = "Type", required = true)
    protected TypeMCOType type;
    @XmlAttribute(name = "ServiceFeeType")
    protected TypeMCOFeeType serviceFeeType;
    @XmlAttribute(name = "Status", required = true)
    protected TypeMCOStatus status;
    @XmlAttribute(name = "CreateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlAttribute(name = "ModifyDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyDate;
    @XmlAttribute(name = "CarrierCode", required = true)
    protected String carrierCode;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "LocatorCode")
    protected String locatorCode;
    @XmlAttribute(name = "TicketNumber")
    protected String ticketNumber;
    @XmlAttribute(name = "Amount", required = true)
    protected String amount;
    @XmlAttribute(name = "NetAmount")
    protected String netAmount;
    @XmlAttribute(name = "ProcessingFee")
    protected String processingFee;
    @XmlAttribute(name = "Refundable", required = true)
    protected boolean refundable;
    @XmlAttribute(name = "Voidable", required = true)
    protected boolean voidable;
    @XmlAttribute(name = "Exchangeable", required = true)
    protected boolean exchangeable;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the formOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment }
     *     
     */
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
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
     * {@link Endorsement }
     * 
     * 
     */
    public List<Endorsement> getEndorsement() {
        if (endorsement == null) {
            endorsement = new ArrayList<Endorsement>();
        }
        return this.endorsement;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Restriction }
     * 
     * 
     */
    public List<Restriction> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<Restriction>();
        }
        return this.restriction;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMCOType }
     *     
     */
    public TypeMCOType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMCOType }
     *     
     */
    public void setType(TypeMCOType value) {
        this.type = value;
    }

    /**
     * Gets the value of the serviceFeeType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMCOFeeType }
     *     
     */
    public TypeMCOFeeType getServiceFeeType() {
        return serviceFeeType;
    }

    /**
     * Sets the value of the serviceFeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMCOFeeType }
     *     
     */
    public void setServiceFeeType(TypeMCOFeeType value) {
        this.serviceFeeType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMCOStatus }
     *     
     */
    public TypeMCOStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMCOStatus }
     *     
     */
    public void setStatus(TypeMCOStatus value) {
        this.status = value;
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
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyDate(XMLGregorianCalendar value) {
        this.modifyDate = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
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
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetAmount(String value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the processingFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingFee() {
        return processingFee;
    }

    /**
     * Sets the value of the processingFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingFee(String value) {
        this.processingFee = value;
    }

    /**
     * Gets the value of the refundable property.
     * 
     */
    public boolean isRefundable() {
        return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     */
    public void setRefundable(boolean value) {
        this.refundable = value;
    }

    /**
     * Gets the value of the voidable property.
     * 
     */
    public boolean isVoidable() {
        return voidable;
    }

    /**
     * Sets the value of the voidable property.
     * 
     */
    public void setVoidable(boolean value) {
        this.voidable = value;
    }

    /**
     * Gets the value of the exchangeable property.
     * 
     */
    public boolean isExchangeable() {
        return exchangeable;
    }

    /**
     * Sets the value of the exchangeable property.
     * 
     */
    public void setExchangeable(boolean value) {
        this.exchangeable = value;
    }

}
