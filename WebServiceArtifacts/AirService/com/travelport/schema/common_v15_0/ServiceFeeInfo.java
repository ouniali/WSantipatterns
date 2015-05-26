
package com.travelport.schema.common_v15_0;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}FormOfPayment" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ServiceFeeTaxInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}CreditCardAuth" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Payment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeStatus" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="Confirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BookingTravelerRef" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="PassiveProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="TotalAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="BaseAmount" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="Taxes" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formOfPayment",
    "serviceFeeTaxInfo",
    "creditCardAuth",
    "payment"
})
@XmlRootElement(name = "ServiceFeeInfo")
public class ServiceFeeInfo {

    @XmlElement(name = "FormOfPayment")
    protected FormOfPayment formOfPayment;
    @XmlElement(name = "ServiceFeeTaxInfo")
    protected List<ServiceFeeTaxInfo> serviceFeeTaxInfo;
    @XmlElement(name = "CreditCardAuth")
    protected CreditCardAuth creditCardAuth;
    @XmlElement(name = "Payment")
    protected Payment payment;
    @XmlAttribute(name = "Status", required = true)
    protected TypeStatus status;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Confirmation")
    protected String confirmation;
    @XmlAttribute(name = "TicketNumber")
    protected String ticketNumber;
    @XmlAttribute(name = "BookingTravelerRef", required = true)
    protected String bookingTravelerRef;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    protected String providerReservationInfoRef;
    @XmlAttribute(name = "PassiveProviderReservationInfoRef")
    protected String passiveProviderReservationInfoRef;
    @XmlAttribute(name = "TotalAmount")
    protected String totalAmount;
    @XmlAttribute(name = "BaseAmount", required = true)
    protected String baseAmount;
    @XmlAttribute(name = "Taxes")
    protected String taxes;

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
     * Gets the value of the serviceFeeTaxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeeTaxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeeTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeeTaxInfo }
     * 
     * 
     */
    public List<ServiceFeeTaxInfo> getServiceFeeTaxInfo() {
        if (serviceFeeTaxInfo == null) {
            serviceFeeTaxInfo = new ArrayList<ServiceFeeTaxInfo>();
        }
        return this.serviceFeeTaxInfo;
    }

    /**
     * Gets the value of the creditCardAuth property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardAuth }
     *     
     */
    public CreditCardAuth getCreditCardAuth() {
        return creditCardAuth;
    }

    /**
     * Sets the value of the creditCardAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardAuth }
     *     
     */
    public void setCreditCardAuth(CreditCardAuth value) {
        this.creditCardAuth = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TypeStatus }
     *     
     */
    public TypeStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeStatus }
     *     
     */
    public void setStatus(TypeStatus value) {
        this.status = value;
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
     * Gets the value of the confirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmation() {
        return confirmation;
    }

    /**
     * Sets the value of the confirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmation(String value) {
        this.confirmation = value;
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

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
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
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseAmount(String value) {
        this.baseAmount = value;
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

}
