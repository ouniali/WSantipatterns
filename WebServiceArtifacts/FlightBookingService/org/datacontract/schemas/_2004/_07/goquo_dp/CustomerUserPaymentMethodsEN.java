
package org.datacontract.schemas._2004._07.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerUserPaymentMethodsEN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerUserPaymentMethodsEN">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities}PaymentMethodsEN">
 *       &lt;sequence>
 *         &lt;element name="ApplicableTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CreditCardChargeAsDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CustomerUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CustomerUserPaymentMethodID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DisplayTextinPricing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstTextInThanksPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstructionsInEnglish" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsB2BCreditPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCaptureCardDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LangCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LangText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Markup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PaymentOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellingCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportedCurrencies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalSellingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerUserPaymentMethodsEN", propOrder = {
    "applicableTo",
    "bookingStatus",
    "creditCardChargeAsDiscount",
    "customerUserID",
    "customerUserPaymentMethodID",
    "displayTextinPricing",
    "instTextInThanksPage",
    "instructionsInEnglish",
    "isB2BCreditPayment",
    "isCaptureCardDetails",
    "langCode",
    "langText",
    "markup",
    "paymentOrder",
    "sellingCurrency",
    "supportedCurrencies",
    "totalSellingPrice"
})
public class CustomerUserPaymentMethodsEN
    extends PaymentMethodsEN
{

    @XmlElementRef(name = "ApplicableTo", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicableTo;
    @XmlElement(name = "BookingStatus")
    protected Integer bookingStatus;
    @XmlElement(name = "CreditCardChargeAsDiscount")
    protected BigDecimal creditCardChargeAsDiscount;
    @XmlElement(name = "CustomerUserID")
    protected Integer customerUserID;
    @XmlElement(name = "CustomerUserPaymentMethodID")
    protected Integer customerUserPaymentMethodID;
    @XmlElementRef(name = "DisplayTextinPricing", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayTextinPricing;
    @XmlElementRef(name = "InstTextInThanksPage", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instTextInThanksPage;
    @XmlElementRef(name = "InstructionsInEnglish", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instructionsInEnglish;
    @XmlElement(name = "IsB2BCreditPayment")
    protected Boolean isB2BCreditPayment;
    @XmlElement(name = "IsCaptureCardDetails")
    protected Boolean isCaptureCardDetails;
    @XmlElementRef(name = "LangCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> langCode;
    @XmlElementRef(name = "LangText", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> langText;
    @XmlElement(name = "Markup")
    protected BigDecimal markup;
    @XmlElement(name = "PaymentOrder")
    protected Integer paymentOrder;
    @XmlElementRef(name = "SellingCurrency", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sellingCurrency;
    @XmlElementRef(name = "SupportedCurrencies", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supportedCurrencies;
    @XmlElement(name = "TotalSellingPrice")
    protected BigDecimal totalSellingPrice;

    /**
     * Gets the value of the applicableTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicableTo() {
        return applicableTo;
    }

    /**
     * Sets the value of the applicableTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicableTo(JAXBElement<String> value) {
        this.applicableTo = value;
    }

    /**
     * Gets the value of the bookingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBookingStatus() {
        return bookingStatus;
    }

    /**
     * Sets the value of the bookingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBookingStatus(Integer value) {
        this.bookingStatus = value;
    }

    /**
     * Gets the value of the creditCardChargeAsDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditCardChargeAsDiscount() {
        return creditCardChargeAsDiscount;
    }

    /**
     * Sets the value of the creditCardChargeAsDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditCardChargeAsDiscount(BigDecimal value) {
        this.creditCardChargeAsDiscount = value;
    }

    /**
     * Gets the value of the customerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserID() {
        return customerUserID;
    }

    /**
     * Sets the value of the customerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserID(Integer value) {
        this.customerUserID = value;
    }

    /**
     * Gets the value of the customerUserPaymentMethodID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerUserPaymentMethodID() {
        return customerUserPaymentMethodID;
    }

    /**
     * Sets the value of the customerUserPaymentMethodID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerUserPaymentMethodID(Integer value) {
        this.customerUserPaymentMethodID = value;
    }

    /**
     * Gets the value of the displayTextinPricing property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayTextinPricing() {
        return displayTextinPricing;
    }

    /**
     * Sets the value of the displayTextinPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayTextinPricing(JAXBElement<String> value) {
        this.displayTextinPricing = value;
    }

    /**
     * Gets the value of the instTextInThanksPage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstTextInThanksPage() {
        return instTextInThanksPage;
    }

    /**
     * Sets the value of the instTextInThanksPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstTextInThanksPage(JAXBElement<String> value) {
        this.instTextInThanksPage = value;
    }

    /**
     * Gets the value of the instructionsInEnglish property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstructionsInEnglish() {
        return instructionsInEnglish;
    }

    /**
     * Sets the value of the instructionsInEnglish property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstructionsInEnglish(JAXBElement<String> value) {
        this.instructionsInEnglish = value;
    }

    /**
     * Gets the value of the isB2BCreditPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsB2BCreditPayment() {
        return isB2BCreditPayment;
    }

    /**
     * Sets the value of the isB2BCreditPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsB2BCreditPayment(Boolean value) {
        this.isB2BCreditPayment = value;
    }

    /**
     * Gets the value of the isCaptureCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCaptureCardDetails() {
        return isCaptureCardDetails;
    }

    /**
     * Sets the value of the isCaptureCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCaptureCardDetails(Boolean value) {
        this.isCaptureCardDetails = value;
    }

    /**
     * Gets the value of the langCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLangCode() {
        return langCode;
    }

    /**
     * Sets the value of the langCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLangCode(JAXBElement<String> value) {
        this.langCode = value;
    }

    /**
     * Gets the value of the langText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLangText() {
        return langText;
    }

    /**
     * Sets the value of the langText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLangText(JAXBElement<String> value) {
        this.langText = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarkup() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarkup(BigDecimal value) {
        this.markup = value;
    }

    /**
     * Gets the value of the paymentOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentOrder() {
        return paymentOrder;
    }

    /**
     * Sets the value of the paymentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentOrder(Integer value) {
        this.paymentOrder = value;
    }

    /**
     * Gets the value of the sellingCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSellingCurrency() {
        return sellingCurrency;
    }

    /**
     * Sets the value of the sellingCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSellingCurrency(JAXBElement<String> value) {
        this.sellingCurrency = value;
    }

    /**
     * Gets the value of the supportedCurrencies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupportedCurrencies() {
        return supportedCurrencies;
    }

    /**
     * Sets the value of the supportedCurrencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupportedCurrencies(JAXBElement<String> value) {
        this.supportedCurrencies = value;
    }

    /**
     * Gets the value of the totalSellingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSellingPrice() {
        return totalSellingPrice;
    }

    /**
     * Sets the value of the totalSellingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSellingPrice(BigDecimal value) {
        this.totalSellingPrice = value;
    }

}
