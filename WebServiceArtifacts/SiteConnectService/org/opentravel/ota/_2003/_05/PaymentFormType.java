
package org.opentravel.ota._2003._05;

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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaymentFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentFormType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="PaymentCard" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardType"/>
 *         &lt;element name="BankAcct" type="{http://www.opentravel.org/OTA/2003/05}BankAcctType"/>
 *         &lt;element name="DirectBill" type="{http://www.opentravel.org/OTA/2003/05}DirectBillType"/>
 *         &lt;element name="Voucher">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VoucherGroup"/>
 *                 &lt;attribute name="BillingNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="SupplierIdentifier" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="Identifier" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="ValueType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="ElectronicIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LoyaltyRedemption">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LoyaltyCertificate" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LoyaltyCertificateGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LoyaltyCertificateNumberGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PromotionCodeGroup"/>
 *                 &lt;attribute name="RedemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MiscChargeOrder">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginalIssueAttributes"/>
 *                 &lt;attribute name="TicketNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="PaperMCO_ExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ticket">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ConjunctionTicketNbr" maxOccurs="16" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to32">
 *                           &lt;attribute name="Coupons" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginalIssueAttributes"/>
 *                 &lt;attribute name="TicketNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="ReroutingType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="voluntary"/>
 *                       &lt;enumeration value="involuntary"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ReasonForReroute" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cash">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CashIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *       &lt;attribute name="CostCenterID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="PaymentTransactionTypeCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="charge"/>
 *             &lt;enumeration value="reserve"/>
 *             &lt;enumeration value="refund"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="GuaranteeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GuaranteeTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="GuaranteeID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="Remark" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFormType", propOrder = {
    "paymentCard",
    "bankAcct",
    "directBill",
    "voucher",
    "loyaltyRedemption",
    "miscChargeOrder",
    "ticket",
    "cash"
})
@XmlSeeAlso({
    org.opentravel.ota._2003._05.CompanyInfoType.PaymentForm.class,
    org.opentravel.ota._2003._05.GuaranteeType.GuaranteesAccepted.GuaranteeAccepted.class,
    HotelPaymentFormType.class,
    org.opentravel.ota._2003._05.CustomerType.PaymentForm.class,
    PaymentDetailType.class,
    PaymentResponseType.class
})
public class PaymentFormType {

    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "BankAcct")
    protected BankAcctType bankAcct;
    @XmlElement(name = "DirectBill")
    protected DirectBillType directBill;
    @XmlElement(name = "Voucher")
    protected PaymentFormType.Voucher voucher;
    @XmlElement(name = "LoyaltyRedemption")
    protected PaymentFormType.LoyaltyRedemption loyaltyRedemption;
    @XmlElement(name = "MiscChargeOrder")
    protected PaymentFormType.MiscChargeOrder miscChargeOrder;
    @XmlElement(name = "Ticket")
    protected PaymentFormType.Ticket ticket;
    @XmlElement(name = "Cash")
    protected PaymentFormType.Cash cash;
    @XmlAttribute(name = "CostCenterID")
    protected String costCenterID;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "PaymentTransactionTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paymentTransactionTypeCode;
    @XmlAttribute(name = "GuaranteeIndicator")
    protected Boolean guaranteeIndicator;
    @XmlAttribute(name = "GuaranteeTypeCode")
    protected String guaranteeTypeCode;
    @XmlAttribute(name = "GuaranteeID")
    protected String guaranteeID;
    @XmlAttribute(name = "Remark")
    protected String remark;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the bankAcct property.
     * 
     * @return
     *     possible object is
     *     {@link BankAcctType }
     *     
     */
    public BankAcctType getBankAcct() {
        return bankAcct;
    }

    /**
     * Sets the value of the bankAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAcctType }
     *     
     */
    public void setBankAcct(BankAcctType value) {
        this.bankAcct = value;
    }

    /**
     * Gets the value of the directBill property.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillType }
     *     
     */
    public DirectBillType getDirectBill() {
        return directBill;
    }

    /**
     * Sets the value of the directBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillType }
     *     
     */
    public void setDirectBill(DirectBillType value) {
        this.directBill = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.Voucher }
     *     
     */
    public PaymentFormType.Voucher getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.Voucher }
     *     
     */
    public void setVoucher(PaymentFormType.Voucher value) {
        this.voucher = value;
    }

    /**
     * Gets the value of the loyaltyRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.LoyaltyRedemption }
     *     
     */
    public PaymentFormType.LoyaltyRedemption getLoyaltyRedemption() {
        return loyaltyRedemption;
    }

    /**
     * Sets the value of the loyaltyRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.LoyaltyRedemption }
     *     
     */
    public void setLoyaltyRedemption(PaymentFormType.LoyaltyRedemption value) {
        this.loyaltyRedemption = value;
    }

    /**
     * Gets the value of the miscChargeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.MiscChargeOrder }
     *     
     */
    public PaymentFormType.MiscChargeOrder getMiscChargeOrder() {
        return miscChargeOrder;
    }

    /**
     * Sets the value of the miscChargeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.MiscChargeOrder }
     *     
     */
    public void setMiscChargeOrder(PaymentFormType.MiscChargeOrder value) {
        this.miscChargeOrder = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.Ticket }
     *     
     */
    public PaymentFormType.Ticket getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.Ticket }
     *     
     */
    public void setTicket(PaymentFormType.Ticket value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentFormType.Cash }
     *     
     */
    public PaymentFormType.Cash getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentFormType.Cash }
     *     
     */
    public void setCash(PaymentFormType.Cash value) {
        this.cash = value;
    }

    /**
     * Gets the value of the costCenterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterID() {
        return costCenterID;
    }

    /**
     * Sets the value of the costCenterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterID(String value) {
        this.costCenterID = value;
    }

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
     * Gets the value of the paymentTransactionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTransactionTypeCode() {
        return paymentTransactionTypeCode;
    }

    /**
     * Sets the value of the paymentTransactionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTransactionTypeCode(String value) {
        this.paymentTransactionTypeCode = value;
    }

    /**
     * Gets the value of the guaranteeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteeIndicator() {
        return guaranteeIndicator;
    }

    /**
     * Sets the value of the guaranteeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteeIndicator(Boolean value) {
        this.guaranteeIndicator = value;
    }

    /**
     * Gets the value of the guaranteeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeTypeCode() {
        return guaranteeTypeCode;
    }

    /**
     * Sets the value of the guaranteeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeTypeCode(String value) {
        this.guaranteeTypeCode = value;
    }

    /**
     * Gets the value of the guaranteeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeID() {
        return guaranteeID;
    }

    /**
     * Sets the value of the guaranteeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeID(String value) {
        this.guaranteeID = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
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
     *       &lt;attribute name="CashIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cash {

        @XmlAttribute(name = "CashIndicator")
        protected Boolean cashIndicator;

        /**
         * Gets the value of the cashIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCashIndicator() {
            return cashIndicator;
        }

        /**
         * Sets the value of the cashIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCashIndicator(Boolean value) {
            this.cashIndicator = value;
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
     *         &lt;element name="LoyaltyCertificate" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LoyaltyCertificateGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LoyaltyCertificateNumberGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PromotionCodeGroup"/>
     *       &lt;attribute name="RedemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "loyaltyCertificate"
    })
    public static class LoyaltyRedemption {

        @XmlElement(name = "LoyaltyCertificate")
        protected List<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate> loyaltyCertificate;
        @XmlAttribute(name = "RedemptionQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger redemptionQuantity;
        @XmlAttribute(name = "CertificateNumber")
        protected String certificateNumber;
        @XmlAttribute(name = "MemberNumber")
        protected String memberNumber;
        @XmlAttribute(name = "ProgramName")
        protected String programName;
        @XmlAttribute(name = "PromotionCode")
        protected String promotionCode;
        @XmlAttribute(name = "PromotionVendorCode")
        protected List<String> promotionVendorCode;

        /**
         * Gets the value of the loyaltyCertificate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loyaltyCertificate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLoyaltyCertificate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentFormType.LoyaltyRedemption.LoyaltyCertificate }
         * 
         * 
         */
        public List<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate> getLoyaltyCertificate() {
            if (loyaltyCertificate == null) {
                loyaltyCertificate = new ArrayList<PaymentFormType.LoyaltyRedemption.LoyaltyCertificate>();
            }
            return this.loyaltyCertificate;
        }

        /**
         * Gets the value of the redemptionQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRedemptionQuantity() {
            return redemptionQuantity;
        }

        /**
         * Sets the value of the redemptionQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRedemptionQuantity(BigInteger value) {
            this.redemptionQuantity = value;
        }

        /**
         * Gets the value of the certificateNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertificateNumber() {
            return certificateNumber;
        }

        /**
         * Sets the value of the certificateNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCertificateNumber(String value) {
            this.certificateNumber = value;
        }

        /**
         * Gets the value of the memberNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMemberNumber() {
            return memberNumber;
        }

        /**
         * Sets the value of the memberNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMemberNumber(String value) {
            this.memberNumber = value;
        }

        /**
         * Gets the value of the programName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramName() {
            return programName;
        }

        /**
         * Sets the value of the programName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramName(String value) {
            this.programName = value;
        }

        /**
         * Gets the value of the promotionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotionCode() {
            return promotionCode;
        }

        /**
         * Sets the value of the promotionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotionCode(String value) {
            this.promotionCode = value;
        }

        /**
         * Gets the value of the promotionVendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotionVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPromotionVendorCode() {
            if (promotionVendorCode == null) {
                promotionVendorCode = new ArrayList<String>();
            }
            return this.promotionVendorCode;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LoyaltyCertificateGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LoyaltyCertificate {

            @XmlAttribute(name = "ID")
            protected String id;
            @XmlAttribute(name = "ID_Context")
            protected String idContext;
            @XmlAttribute(name = "CertificateNumber")
            protected String certificateNumber;
            @XmlAttribute(name = "MemberNumber")
            protected String memberNumber;
            @XmlAttribute(name = "ProgramName")
            protected String programName;
            @XmlAttribute(name = "EffectiveDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar effectiveDate;
            @XmlAttribute(name = "ExpireDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar expireDate;
            @XmlAttribute(name = "ExpireDateExclusiveIndicator")
            protected Boolean expireDateExclusiveIndicator;
            @XmlAttribute(name = "NmbrOfNights")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger nmbrOfNights;
            @XmlAttribute(name = "Format")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String format;
            @XmlAttribute(name = "Status")
            protected String status;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the idContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIDContext() {
                return idContext;
            }

            /**
             * Sets the value of the idContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIDContext(String value) {
                this.idContext = value;
            }

            /**
             * Gets the value of the certificateNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCertificateNumber() {
                return certificateNumber;
            }

            /**
             * Sets the value of the certificateNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCertificateNumber(String value) {
                this.certificateNumber = value;
            }

            /**
             * Gets the value of the memberNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberNumber() {
                return memberNumber;
            }

            /**
             * Sets the value of the memberNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberNumber(String value) {
                this.memberNumber = value;
            }

            /**
             * Gets the value of the programName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgramName() {
                return programName;
            }

            /**
             * Sets the value of the programName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgramName(String value) {
                this.programName = value;
            }

            /**
             * Gets the value of the effectiveDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEffectiveDate() {
                return effectiveDate;
            }

            /**
             * Sets the value of the effectiveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEffectiveDate(XMLGregorianCalendar value) {
                this.effectiveDate = value;
            }

            /**
             * Gets the value of the expireDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getExpireDate() {
                return expireDate;
            }

            /**
             * Sets the value of the expireDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setExpireDate(XMLGregorianCalendar value) {
                this.expireDate = value;
            }

            /**
             * Gets the value of the expireDateExclusiveIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isExpireDateExclusiveIndicator() {
                return expireDateExclusiveIndicator;
            }

            /**
             * Sets the value of the expireDateExclusiveIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setExpireDateExclusiveIndicator(Boolean value) {
                this.expireDateExclusiveIndicator = value;
            }

            /**
             * Gets the value of the nmbrOfNights property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNmbrOfNights() {
                return nmbrOfNights;
            }

            /**
             * Sets the value of the nmbrOfNights property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNmbrOfNights(BigInteger value) {
                this.nmbrOfNights = value;
            }

            /**
             * Gets the value of the format property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * Sets the value of the format property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginalIssueAttributes"/>
     *       &lt;attribute name="TicketNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="PaperMCO_ExistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MiscChargeOrder {

        @XmlAttribute(name = "TicketNumber")
        protected String ticketNumber;
        @XmlAttribute(name = "PaperMCO_ExistInd")
        protected Boolean paperMCOExistInd;
        @XmlAttribute(name = "OriginalTicketNumber")
        protected String originalTicketNumber;
        @XmlAttribute(name = "OriginalIssuePlace")
        protected String originalIssuePlace;
        @XmlAttribute(name = "OriginalIssueDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar originalIssueDate;
        @XmlAttribute(name = "OriginalIssueIATA")
        protected String originalIssueIATA;
        @XmlAttribute(name = "OriginalPaymentForm")
        protected String originalPaymentForm;
        @XmlAttribute(name = "CheckInhibitorType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String checkInhibitorType;
        @XmlAttribute(name = "CouponRPHs")
        protected List<String> couponRPHs;

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
         * Gets the value of the paperMCOExistInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPaperMCOExistInd() {
            return paperMCOExistInd;
        }

        /**
         * Sets the value of the paperMCOExistInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPaperMCOExistInd(Boolean value) {
            this.paperMCOExistInd = value;
        }

        /**
         * Gets the value of the originalTicketNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalTicketNumber() {
            return originalTicketNumber;
        }

        /**
         * Sets the value of the originalTicketNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalTicketNumber(String value) {
            this.originalTicketNumber = value;
        }

        /**
         * Gets the value of the originalIssuePlace property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalIssuePlace() {
            return originalIssuePlace;
        }

        /**
         * Sets the value of the originalIssuePlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalIssuePlace(String value) {
            this.originalIssuePlace = value;
        }

        /**
         * Gets the value of the originalIssueDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOriginalIssueDate() {
            return originalIssueDate;
        }

        /**
         * Sets the value of the originalIssueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOriginalIssueDate(XMLGregorianCalendar value) {
            this.originalIssueDate = value;
        }

        /**
         * Gets the value of the originalIssueIATA property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalIssueIATA() {
            return originalIssueIATA;
        }

        /**
         * Sets the value of the originalIssueIATA property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalIssueIATA(String value) {
            this.originalIssueIATA = value;
        }

        /**
         * Gets the value of the originalPaymentForm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalPaymentForm() {
            return originalPaymentForm;
        }

        /**
         * Sets the value of the originalPaymentForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalPaymentForm(String value) {
            this.originalPaymentForm = value;
        }

        /**
         * Gets the value of the checkInhibitorType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckInhibitorType() {
            return checkInhibitorType;
        }

        /**
         * Sets the value of the checkInhibitorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckInhibitorType(String value) {
            this.checkInhibitorType = value;
        }

        /**
         * Gets the value of the couponRPHs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponRPHs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponRPHs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCouponRPHs() {
            if (couponRPHs == null) {
                couponRPHs = new ArrayList<String>();
            }
            return this.couponRPHs;
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
     *         &lt;element name="ConjunctionTicketNbr" maxOccurs="16" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to32">
     *                 &lt;attribute name="Coupons" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OriginalIssueAttributes"/>
     *       &lt;attribute name="TicketNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="ReroutingType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="voluntary"/>
     *             &lt;enumeration value="involuntary"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ReasonForReroute" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conjunctionTicketNbr"
    })
    public static class Ticket {

        @XmlElement(name = "ConjunctionTicketNbr")
        protected List<PaymentFormType.Ticket.ConjunctionTicketNbr> conjunctionTicketNbr;
        @XmlAttribute(name = "TicketNumber")
        protected String ticketNumber;
        @XmlAttribute(name = "ReroutingType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String reroutingType;
        @XmlAttribute(name = "ReasonForReroute")
        protected String reasonForReroute;
        @XmlAttribute(name = "OriginalTicketNumber")
        protected String originalTicketNumber;
        @XmlAttribute(name = "OriginalIssuePlace")
        protected String originalIssuePlace;
        @XmlAttribute(name = "OriginalIssueDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar originalIssueDate;
        @XmlAttribute(name = "OriginalIssueIATA")
        protected String originalIssueIATA;
        @XmlAttribute(name = "OriginalPaymentForm")
        protected String originalPaymentForm;
        @XmlAttribute(name = "CheckInhibitorType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String checkInhibitorType;
        @XmlAttribute(name = "CouponRPHs")
        protected List<String> couponRPHs;

        /**
         * Gets the value of the conjunctionTicketNbr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conjunctionTicketNbr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConjunctionTicketNbr().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentFormType.Ticket.ConjunctionTicketNbr }
         * 
         * 
         */
        public List<PaymentFormType.Ticket.ConjunctionTicketNbr> getConjunctionTicketNbr() {
            if (conjunctionTicketNbr == null) {
                conjunctionTicketNbr = new ArrayList<PaymentFormType.Ticket.ConjunctionTicketNbr>();
            }
            return this.conjunctionTicketNbr;
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
         * Gets the value of the reroutingType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReroutingType() {
            return reroutingType;
        }

        /**
         * Sets the value of the reroutingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReroutingType(String value) {
            this.reroutingType = value;
        }

        /**
         * Gets the value of the reasonForReroute property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonForReroute() {
            return reasonForReroute;
        }

        /**
         * Sets the value of the reasonForReroute property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonForReroute(String value) {
            this.reasonForReroute = value;
        }

        /**
         * Gets the value of the originalTicketNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalTicketNumber() {
            return originalTicketNumber;
        }

        /**
         * Sets the value of the originalTicketNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalTicketNumber(String value) {
            this.originalTicketNumber = value;
        }

        /**
         * Gets the value of the originalIssuePlace property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalIssuePlace() {
            return originalIssuePlace;
        }

        /**
         * Sets the value of the originalIssuePlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalIssuePlace(String value) {
            this.originalIssuePlace = value;
        }

        /**
         * Gets the value of the originalIssueDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOriginalIssueDate() {
            return originalIssueDate;
        }

        /**
         * Sets the value of the originalIssueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setOriginalIssueDate(XMLGregorianCalendar value) {
            this.originalIssueDate = value;
        }

        /**
         * Gets the value of the originalIssueIATA property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalIssueIATA() {
            return originalIssueIATA;
        }

        /**
         * Sets the value of the originalIssueIATA property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalIssueIATA(String value) {
            this.originalIssueIATA = value;
        }

        /**
         * Gets the value of the originalPaymentForm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalPaymentForm() {
            return originalPaymentForm;
        }

        /**
         * Sets the value of the originalPaymentForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalPaymentForm(String value) {
            this.originalPaymentForm = value;
        }

        /**
         * Gets the value of the checkInhibitorType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckInhibitorType() {
            return checkInhibitorType;
        }

        /**
         * Sets the value of the checkInhibitorType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckInhibitorType(String value) {
            this.checkInhibitorType = value;
        }

        /**
         * Gets the value of the couponRPHs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponRPHs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponRPHs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCouponRPHs() {
            if (couponRPHs == null) {
                couponRPHs = new ArrayList<String>();
            }
            return this.couponRPHs;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to32">
         *       &lt;attribute name="Coupons" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ConjunctionTicketNbr {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Coupons")
            protected List<String> coupons;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the coupons property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the coupons property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCoupons().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getCoupons() {
                if (coupons == null) {
                    coupons = new ArrayList<String>();
                }
                return this.coupons;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}VoucherGroup"/>
     *       &lt;attribute name="BillingNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="SupplierIdentifier" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="Identifier" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="ValueType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="ElectronicIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Voucher {

        @XmlAttribute(name = "BillingNumber")
        protected String billingNumber;
        @XmlAttribute(name = "SupplierIdentifier")
        protected String supplierIdentifier;
        @XmlAttribute(name = "Identifier")
        protected String identifier;
        @XmlAttribute(name = "ValueType")
        protected String valueType;
        @XmlAttribute(name = "ElectronicIndicator")
        protected Boolean electronicIndicator;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "ExpireDateExclusiveIndicator")
        protected Boolean expireDateExclusiveIndicator;
        @XmlAttribute(name = "SeriesCode")
        protected String seriesCode;

        /**
         * Gets the value of the billingNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillingNumber() {
            return billingNumber;
        }

        /**
         * Sets the value of the billingNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillingNumber(String value) {
            this.billingNumber = value;
        }

        /**
         * Gets the value of the supplierIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierIdentifier() {
            return supplierIdentifier;
        }

        /**
         * Sets the value of the supplierIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplierIdentifier(String value) {
            this.supplierIdentifier = value;
        }

        /**
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdentifier() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdentifier(String value) {
            this.identifier = value;
        }

        /**
         * Gets the value of the valueType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValueType() {
            return valueType;
        }

        /**
         * Sets the value of the valueType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValueType(String value) {
            this.valueType = value;
        }

        /**
         * Gets the value of the electronicIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isElectronicIndicator() {
            return electronicIndicator;
        }

        /**
         * Sets the value of the electronicIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setElectronicIndicator(Boolean value) {
            this.electronicIndicator = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Gets the value of the expireDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * Sets the value of the expireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * Gets the value of the expireDateExclusiveIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExpireDateExclusiveIndicator() {
            return expireDateExclusiveIndicator;
        }

        /**
         * Sets the value of the expireDateExclusiveIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExpireDateExclusiveIndicator(Boolean value) {
            this.expireDateExclusiveIndicator = value;
        }

        /**
         * Gets the value of the seriesCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeriesCode() {
            return seriesCode;
        }

        /**
         * Sets the value of the seriesCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeriesCode(String value) {
            this.seriesCode = value;
        }

    }

}
