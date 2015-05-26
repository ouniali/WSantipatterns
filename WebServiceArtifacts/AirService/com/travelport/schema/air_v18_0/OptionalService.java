
package com.travelport.schema.air_v18_0;

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
import com.travelport.schema.common_v15_0.Remark;
import com.travelport.schema.common_v15_0.ServiceData;
import com.travelport.schema.common_v15_0.ServiceInfo;
import com.travelport.schema.common_v15_0.TypeMerchandisingService;
import com.travelport.schema.common_v15_0.TypePurchaseWindow;


/**
 * Describes a merchandising service of a
 * 					given type (e.g. Seat) that can be purchased for the indicated
 * 					amount. If this service is for only a given passenger or segment
 * 					the references will indicate the restrictions. If this service
 * 					applies to all passenger or the entire itinerary, the references
 * 					will not be present.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ServiceData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ServiceInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}Remark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TaxInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FeeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}EMD" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrProviderSupplier"/>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrPrices"/>
 *       &lt;attribute name="OptionalServicesRuleRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeMerchandisingService" />
 *       &lt;attribute name="Confirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SecondaryType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PurchaseWindow" type="{http://www.travelport.com/schema/common_v15_0}typePurchaseWindow" />
 *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Entitled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PerTraveler" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="PaymentRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="ServiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ServiceSubCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SSRCode" type="{http://www.travelport.com/schema/common_v15_0}typeSSRCode" />
 *       &lt;attribute name="IssuanceReason">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ProviderDefinedType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="16"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceData",
    "serviceInfo",
    "remark",
    "taxInfo",
    "feeInfo",
    "emd"
})
@XmlRootElement(name = "OptionalService")
public class OptionalService {

    @XmlElement(name = "ServiceData", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<ServiceData> serviceData;
    @XmlElement(name = "ServiceInfo", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected ServiceInfo serviceInfo;
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<Remark> remark;
    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "FeeInfo")
    protected List<FeeInfo> feeInfo;
    @XmlElement(name = "EMD")
    protected EMD emd;
    @XmlAttribute(name = "OptionalServicesRuleRef")
    protected String optionalServicesRuleRef;
    @XmlAttribute(name = "Type", required = true)
    protected TypeMerchandisingService type;
    @XmlAttribute(name = "Confirmation")
    protected String confirmation;
    @XmlAttribute(name = "SecondaryType")
    protected String secondaryType;
    @XmlAttribute(name = "PurchaseWindow")
    protected TypePurchaseWindow purchaseWindow;
    @XmlAttribute(name = "Priority")
    protected BigInteger priority;
    @XmlAttribute(name = "Available")
    protected Boolean available;
    @XmlAttribute(name = "Entitled")
    protected Boolean entitled;
    @XmlAttribute(name = "PerTraveler")
    protected Boolean perTraveler;
    @XmlAttribute(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlAttribute(name = "PaymentRef")
    protected String paymentRef;
    @XmlAttribute(name = "ServiceStatus")
    protected String serviceStatus;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "SequenceNumber")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "ServiceSubCode")
    protected String serviceSubCode;
    @XmlAttribute(name = "SSRCode")
    protected String ssrCode;
    @XmlAttribute(name = "IssuanceReason")
    protected String issuanceReason;
    @XmlAttribute(name = "ProviderDefinedType")
    protected String providerDefinedType;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "TotalPrice")
    protected String totalPrice;
    @XmlAttribute(name = "BasePrice")
    protected String basePrice;
    @XmlAttribute(name = "ApproximateTotalPrice")
    protected String approximateTotalPrice;
    @XmlAttribute(name = "ApproximateBasePrice")
    protected String approximateBasePrice;
    @XmlAttribute(name = "EquivalentBasePrice")
    protected String equivalentBasePrice;
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    @XmlAttribute(name = "Fees")
    protected String fees;
    @XmlAttribute(name = "Services")
    protected String services;

    /**
     * Gets the value of the serviceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceData }
     * 
     * 
     */
    public List<ServiceData> getServiceData() {
        if (serviceData == null) {
            serviceData = new ArrayList<ServiceData>();
        }
        return this.serviceData;
    }

    /**
     * Gets the value of the serviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfo }
     *     
     */
    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Sets the value of the serviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfo }
     *     
     */
    public void setServiceInfo(ServiceInfo value) {
        this.serviceInfo = value;
    }

    /**
     * Information regarding any specific
     * 							for this service.Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remark }
     * 
     * 
     */
    public List<Remark> getRemark() {
        if (remark == null) {
            remark = new ArrayList<Remark>();
        }
        return this.remark;
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
     * {@link TypeTaxInfo }
     * 
     * 
     */
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TypeTaxInfo>();
        }
        return this.taxInfo;
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
     * Gets the value of the emd property.
     * 
     * @return
     *     possible object is
     *     {@link EMD }
     *     
     */
    public EMD getEMD() {
        return emd;
    }

    /**
     * Sets the value of the emd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMD }
     *     
     */
    public void setEMD(EMD value) {
        this.emd = value;
    }

    /**
     * Gets the value of the optionalServicesRuleRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalServicesRuleRef() {
        return optionalServicesRuleRef;
    }

    /**
     * Sets the value of the optionalServicesRuleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalServicesRuleRef(String value) {
        this.optionalServicesRuleRef = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMerchandisingService }
     *     
     */
    public TypeMerchandisingService getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMerchandisingService }
     *     
     */
    public void setType(TypeMerchandisingService value) {
        this.type = value;
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
     * Gets the value of the secondaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryType() {
        return secondaryType;
    }

    /**
     * Sets the value of the secondaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryType(String value) {
        this.secondaryType = value;
    }

    /**
     * Gets the value of the purchaseWindow property.
     * 
     * @return
     *     possible object is
     *     {@link TypePurchaseWindow }
     *     
     */
    public TypePurchaseWindow getPurchaseWindow() {
        return purchaseWindow;
    }

    /**
     * Sets the value of the purchaseWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePurchaseWindow }
     *     
     */
    public void setPurchaseWindow(TypePurchaseWindow value) {
        this.purchaseWindow = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailable(Boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the entitled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntitled() {
        return entitled;
    }

    /**
     * Sets the value of the entitled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntitled(Boolean value) {
        this.entitled = value;
    }

    /**
     * Gets the value of the perTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPerTraveler() {
        return perTraveler;
    }

    /**
     * Sets the value of the perTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerTraveler(Boolean value) {
        this.perTraveler = value;
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
     * Gets the value of the paymentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRef() {
        return paymentRef;
    }

    /**
     * Sets the value of the paymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRef(String value) {
        this.paymentRef = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the serviceSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubCode() {
        return serviceSubCode;
    }

    /**
     * Sets the value of the serviceSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSubCode(String value) {
        this.serviceSubCode = value;
    }

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

    /**
     * Gets the value of the issuanceReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuanceReason() {
        return issuanceReason;
    }

    /**
     * Sets the value of the issuanceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuanceReason(String value) {
        this.issuanceReason = value;
    }

    /**
     * Gets the value of the providerDefinedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderDefinedType() {
        return providerDefinedType;
    }

    /**
     * Sets the value of the providerDefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderDefinedType(String value) {
        this.providerDefinedType = value;
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
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
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
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePrice(String value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the approximateTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTotalPrice() {
        return approximateTotalPrice;
    }

    /**
     * Sets the value of the approximateTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTotalPrice(String value) {
        this.approximateTotalPrice = value;
    }

    /**
     * Gets the value of the approximateBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateBasePrice() {
        return approximateBasePrice;
    }

    /**
     * Sets the value of the approximateBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateBasePrice(String value) {
        this.approximateBasePrice = value;
    }

    /**
     * Gets the value of the equivalentBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentBasePrice() {
        return equivalentBasePrice;
    }

    /**
     * Sets the value of the equivalentBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentBasePrice(String value) {
        this.equivalentBasePrice = value;
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

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFees(String value) {
        this.fees = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

}
