
package com.inforcyl.services.v_1_3.faresearch.output.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.BookingCharge;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.CardTypeCharge;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.Distribution;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.InsuranceData;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.Insurances;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.Payment;
import com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.xsd.Types;
import com.inforcyl.services.xsd.Header;
import com.inforcyl.services.xsd.OutputMethods;


/**
 * <p>Java class for FareSearch_output complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareSearch_output">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.inforcyl.com/xsd}OutputMethods">
 *       &lt;sequence>
 *         &lt;element name="bookingCharge" type="{http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd}BookingCharge" minOccurs="0"/>
 *         &lt;element name="cardTypeCharge" type="{http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd}CardTypeCharge" minOccurs="0"/>
 *         &lt;element name="codStadmImpu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTadmImpu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colaboratorFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="correlationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distributionTypeCharge" type="{http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd}Distribution" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeTypes" type="{http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd}Types" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="header" type="{http://services.inforcyl.com/xsd}Header" minOccurs="0"/>
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuranceData" type="{http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd}InsuranceData" minOccurs="0"/>
 *         &lt;element name="insuranceDataList" type="{http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd}Insurances" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="managementFees" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="mandatoryData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="miniMod" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="operatingBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentTypesToBeApplied" type="{http://faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalChargesAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="travelShopFeeAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="validDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vatPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareSearch_output", propOrder = {
    "bookingCharge",
    "cardTypeCharge",
    "codStadmImpu",
    "codTadmImpu",
    "colaboratorFeeAmount",
    "correlationId",
    "descInfo",
    "distributionTypeCharge",
    "errorMessage",
    "feeTypes",
    "header",
    "info",
    "insuranceData",
    "insuranceDataList",
    "managementFees",
    "mandatoryData",
    "miniMod",
    "operatingBrand",
    "paymentTypesToBeApplied",
    "product",
    "totalChargesAmount",
    "travelShopFeeAmount",
    "validDiscount",
    "vatPercentage"
})
public class FareSearchOutput
    extends OutputMethods
{

    @XmlElementRef(name = "bookingCharge", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<BookingCharge> bookingCharge;
    @XmlElementRef(name = "cardTypeCharge", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<CardTypeCharge> cardTypeCharge;
    @XmlElementRef(name = "codStadmImpu", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codStadmImpu;
    @XmlElementRef(name = "codTadmImpu", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codTadmImpu;
    @XmlElementRef(name = "colaboratorFeeAmount", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> colaboratorFeeAmount;
    @XmlElementRef(name = "correlationId", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correlationId;
    @XmlElementRef(name = "descInfo", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descInfo;
    @XmlElement(nillable = true)
    protected List<Distribution> distributionTypeCharge;
    @XmlElementRef(name = "errorMessage", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMessage;
    @XmlElement(nillable = true)
    protected List<Types> feeTypes;
    @XmlElementRef(name = "header", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Header> header;
    @XmlElementRef(name = "info", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> info;
    @XmlElementRef(name = "insuranceData", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<InsuranceData> insuranceData;
    @XmlElement(nillable = true)
    protected List<Insurances> insuranceDataList;
    @XmlElementRef(name = "managementFees", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> managementFees;
    @XmlElementRef(name = "mandatoryData", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mandatoryData;
    @XmlElementRef(name = "miniMod", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> miniMod;
    @XmlElementRef(name = "operatingBrand", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatingBrand;
    @XmlElement(nillable = true)
    protected List<Payment> paymentTypesToBeApplied;
    @XmlElementRef(name = "product", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> product;
    @XmlElementRef(name = "totalChargesAmount", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> totalChargesAmount;
    @XmlElementRef(name = "travelShopFeeAmount", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> travelShopFeeAmount;
    @XmlElementRef(name = "validDiscount", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validDiscount;
    @XmlElementRef(name = "vatPercentage", namespace = "http://output.faresearch.v_1_3.services.inforcyl.com/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> vatPercentage;

    /**
     * Gets the value of the bookingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BookingCharge }{@code >}
     *     
     */
    public JAXBElement<BookingCharge> getBookingCharge() {
        return bookingCharge;
    }

    /**
     * Sets the value of the bookingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BookingCharge }{@code >}
     *     
     */
    public void setBookingCharge(JAXBElement<BookingCharge> value) {
        this.bookingCharge = value;
    }

    /**
     * Gets the value of the cardTypeCharge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CardTypeCharge }{@code >}
     *     
     */
    public JAXBElement<CardTypeCharge> getCardTypeCharge() {
        return cardTypeCharge;
    }

    /**
     * Sets the value of the cardTypeCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CardTypeCharge }{@code >}
     *     
     */
    public void setCardTypeCharge(JAXBElement<CardTypeCharge> value) {
        this.cardTypeCharge = value;
    }

    /**
     * Gets the value of the codStadmImpu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodStadmImpu() {
        return codStadmImpu;
    }

    /**
     * Sets the value of the codStadmImpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodStadmImpu(JAXBElement<String> value) {
        this.codStadmImpu = value;
    }

    /**
     * Gets the value of the codTadmImpu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodTadmImpu() {
        return codTadmImpu;
    }

    /**
     * Sets the value of the codTadmImpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodTadmImpu(JAXBElement<String> value) {
        this.codTadmImpu = value;
    }

    /**
     * Gets the value of the colaboratorFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getColaboratorFeeAmount() {
        return colaboratorFeeAmount;
    }

    /**
     * Sets the value of the colaboratorFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setColaboratorFeeAmount(JAXBElement<Double> value) {
        this.colaboratorFeeAmount = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrelationId(JAXBElement<String> value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the descInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescInfo() {
        return descInfo;
    }

    /**
     * Sets the value of the descInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescInfo(JAXBElement<String> value) {
        this.descInfo = value;
    }

    /**
     * Gets the value of the distributionTypeCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionTypeCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionTypeCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Distribution }
     * 
     * 
     */
    public List<Distribution> getDistributionTypeCharge() {
        if (distributionTypeCharge == null) {
            distributionTypeCharge = new ArrayList<Distribution>();
        }
        return this.distributionTypeCharge;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the feeTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Types }
     * 
     * 
     */
    public List<Types> getFeeTypes() {
        if (feeTypes == null) {
            feeTypes = new ArrayList<Types>();
        }
        return this.feeTypes;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Header }{@code >}
     *     
     */
    public JAXBElement<Header> getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Header }{@code >}
     *     
     */
    public void setHeader(JAXBElement<Header> value) {
        this.header = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfo(JAXBElement<String> value) {
        this.info = value;
    }

    /**
     * Gets the value of the insuranceData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InsuranceData }{@code >}
     *     
     */
    public JAXBElement<InsuranceData> getInsuranceData() {
        return insuranceData;
    }

    /**
     * Sets the value of the insuranceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InsuranceData }{@code >}
     *     
     */
    public void setInsuranceData(JAXBElement<InsuranceData> value) {
        this.insuranceData = value;
    }

    /**
     * Gets the value of the insuranceDataList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceDataList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceDataList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Insurances }
     * 
     * 
     */
    public List<Insurances> getInsuranceDataList() {
        if (insuranceDataList == null) {
            insuranceDataList = new ArrayList<Insurances>();
        }
        return this.insuranceDataList;
    }

    /**
     * Gets the value of the managementFees property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getManagementFees() {
        return managementFees;
    }

    /**
     * Sets the value of the managementFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setManagementFees(JAXBElement<Double> value) {
        this.managementFees = value;
    }

    /**
     * Gets the value of the mandatoryData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMandatoryData() {
        return mandatoryData;
    }

    /**
     * Sets the value of the mandatoryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMandatoryData(JAXBElement<String> value) {
        this.mandatoryData = value;
    }

    /**
     * Gets the value of the miniMod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getMiniMod() {
        return miniMod;
    }

    /**
     * Sets the value of the miniMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setMiniMod(JAXBElement<Double> value) {
        this.miniMod = value;
    }

    /**
     * Gets the value of the operatingBrand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatingBrand() {
        return operatingBrand;
    }

    /**
     * Sets the value of the operatingBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatingBrand(JAXBElement<String> value) {
        this.operatingBrand = value;
    }

    /**
     * Gets the value of the paymentTypesToBeApplied property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTypesToBeApplied property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTypesToBeApplied().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPaymentTypesToBeApplied() {
        if (paymentTypesToBeApplied == null) {
            paymentTypesToBeApplied = new ArrayList<Payment>();
        }
        return this.paymentTypesToBeApplied;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProduct(JAXBElement<String> value) {
        this.product = value;
    }

    /**
     * Gets the value of the totalChargesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTotalChargesAmount() {
        return totalChargesAmount;
    }

    /**
     * Sets the value of the totalChargesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTotalChargesAmount(JAXBElement<Double> value) {
        this.totalChargesAmount = value;
    }

    /**
     * Gets the value of the travelShopFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getTravelShopFeeAmount() {
        return travelShopFeeAmount;
    }

    /**
     * Sets the value of the travelShopFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setTravelShopFeeAmount(JAXBElement<Double> value) {
        this.travelShopFeeAmount = value;
    }

    /**
     * Gets the value of the validDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidDiscount() {
        return validDiscount;
    }

    /**
     * Sets the value of the validDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidDiscount(JAXBElement<String> value) {
        this.validDiscount = value;
    }

    /**
     * Gets the value of the vatPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVatPercentage() {
        return vatPercentage;
    }

    /**
     * Sets the value of the vatPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVatPercentage(JAXBElement<Double> value) {
        this.vatPercentage = value;
    }

}
