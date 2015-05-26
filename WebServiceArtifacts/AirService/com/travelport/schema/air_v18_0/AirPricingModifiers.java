
package com.travelport.schema.air_v18_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.AccountCode;
import com.travelport.schema.common_v15_0.DiscountCard;


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
 *         &lt;element name="PermittedBookingCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v18_0}BookingCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedBookingCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v18_0}BookingCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedRuleCategories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareRuleCategory" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccountCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AccountCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PermittedCabins" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v18_0}CabinClass" maxOccurs="3"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContractCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v18_0}ContractCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}ExemptTaxes" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PenaltyFareInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}DiscountCard" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="PromoCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PromoCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ProhibitMinStayFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ProhibitMaxStayFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="CurrencyType" type="{http://www.travelport.com/schema/common_v15_0}typeCurrency" />
 *       &lt;attribute name="ProhibitAdvancePurchaseFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ProhibitNonRefundableFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ProhibitRestrictedFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FaresIndicator" type="{http://www.travelport.com/schema/air_v18_0}typeFaresIndicator" />
 *       &lt;attribute name="FiledCurrency" type="{http://www.travelport.com/schema/common_v15_0}typeCurrency" />
 *       &lt;attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v15_0}typeCarrier" />
 *       &lt;attribute name="ETicketability" type="{http://www.travelport.com/schema/air_v18_0}typeEticketability" />
 *       &lt;attribute name="AccountCodeFaresOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *       &lt;attribute name="ProhibitNonExchangeableFares" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ForceSegmentSelect" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedBookingCodes",
    "prohibitedBookingCodes",
    "prohibitedRuleCategories",
    "accountCodes",
    "permittedCabins",
    "contractCodes",
    "exemptTaxes",
    "penaltyFareInformation",
    "discountCard",
    "promoCodes"
})
@XmlRootElement(name = "AirPricingModifiers")
public class AirPricingModifiers {

    @XmlElement(name = "PermittedBookingCodes")
    protected AirPricingModifiers.PermittedBookingCodes permittedBookingCodes;
    @XmlElement(name = "ProhibitedBookingCodes")
    protected AirPricingModifiers.ProhibitedBookingCodes prohibitedBookingCodes;
    @XmlElement(name = "ProhibitedRuleCategories")
    protected AirPricingModifiers.ProhibitedRuleCategories prohibitedRuleCategories;
    @XmlElement(name = "AccountCodes")
    protected AirPricingModifiers.AccountCodes accountCodes;
    @XmlElement(name = "PermittedCabins")
    protected AirPricingModifiers.PermittedCabins permittedCabins;
    @XmlElement(name = "ContractCodes")
    protected AirPricingModifiers.ContractCodes contractCodes;
    @XmlElement(name = "ExemptTaxes")
    protected ExemptTaxes exemptTaxes;
    @XmlElement(name = "PenaltyFareInformation")
    protected PenaltyFareInformation penaltyFareInformation;
    @XmlElement(name = "DiscountCard", namespace = "http://www.travelport.com/schema/common_v15_0")
    protected List<DiscountCard> discountCard;
    @XmlElement(name = "PromoCodes")
    protected AirPricingModifiers.PromoCodes promoCodes;
    @XmlAttribute(name = "ProhibitMinStayFares")
    protected Boolean prohibitMinStayFares;
    @XmlAttribute(name = "ProhibitMaxStayFares")
    protected Boolean prohibitMaxStayFares;
    @XmlAttribute(name = "CurrencyType")
    protected String currencyType;
    @XmlAttribute(name = "ProhibitAdvancePurchaseFares")
    protected Boolean prohibitAdvancePurchaseFares;
    @XmlAttribute(name = "ProhibitNonRefundableFares")
    protected Boolean prohibitNonRefundableFares;
    @XmlAttribute(name = "ProhibitRestrictedFares")
    protected Boolean prohibitRestrictedFares;
    @XmlAttribute(name = "FaresIndicator")
    protected TypeFaresIndicator faresIndicator;
    @XmlAttribute(name = "FiledCurrency")
    protected String filedCurrency;
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    @XmlAttribute(name = "ETicketability")
    protected TypeEticketability eTicketability;
    @XmlAttribute(name = "AccountCodeFaresOnly")
    protected Boolean accountCodeFaresOnly;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "ProhibitNonExchangeableFares")
    protected Boolean prohibitNonExchangeableFares;
    @XmlAttribute(name = "ForceSegmentSelect")
    protected Boolean forceSegmentSelect;

    /**
     * Gets the value of the permittedBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers.PermittedBookingCodes }
     *     
     */
    public AirPricingModifiers.PermittedBookingCodes getPermittedBookingCodes() {
        return permittedBookingCodes;
    }

    /**
     * Sets the value of the permittedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers.PermittedBookingCodes }
     *     
     */
    public void setPermittedBookingCodes(AirPricingModifiers.PermittedBookingCodes value) {
        this.permittedBookingCodes = value;
    }

    /**
     * Gets the value of the prohibitedBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers.ProhibitedBookingCodes }
     *     
     */
    public AirPricingModifiers.ProhibitedBookingCodes getProhibitedBookingCodes() {
        return prohibitedBookingCodes;
    }

    /**
     * Sets the value of the prohibitedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers.ProhibitedBookingCodes }
     *     
     */
    public void setProhibitedBookingCodes(AirPricingModifiers.ProhibitedBookingCodes value) {
        this.prohibitedBookingCodes = value;
    }

    /**
     * Gets the value of the prohibitedRuleCategories property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers.ProhibitedRuleCategories }
     *     
     */
    public AirPricingModifiers.ProhibitedRuleCategories getProhibitedRuleCategories() {
        return prohibitedRuleCategories;
    }

    /**
     * Sets the value of the prohibitedRuleCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers.ProhibitedRuleCategories }
     *     
     */
    public void setProhibitedRuleCategories(AirPricingModifiers.ProhibitedRuleCategories value) {
        this.prohibitedRuleCategories = value;
    }

    /**
     * Gets the value of the accountCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers.AccountCodes }
     *     
     */
    public AirPricingModifiers.AccountCodes getAccountCodes() {
        return accountCodes;
    }

    /**
     * Sets the value of the accountCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers.AccountCodes }
     *     
     */
    public void setAccountCodes(AirPricingModifiers.AccountCodes value) {
        this.accountCodes = value;
    }

    /**
     * Gets the value of the permittedCabins property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers.PermittedCabins }
     *     
     */
    public AirPricingModifiers.PermittedCabins getPermittedCabins() {
        return permittedCabins;
    }

    /**
     * Sets the value of the permittedCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers.PermittedCabins }
     *     
     */
    public void setPermittedCabins(AirPricingModifiers.PermittedCabins value) {
        this.permittedCabins = value;
    }

    /**
     * Gets the value of the contractCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers.ContractCodes }
     *     
     */
    public AirPricingModifiers.ContractCodes getContractCodes() {
        return contractCodes;
    }

    /**
     * Sets the value of the contractCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers.ContractCodes }
     *     
     */
    public void setContractCodes(AirPricingModifiers.ContractCodes value) {
        this.contractCodes = value;
    }

    /**
     * Gets the value of the exemptTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link ExemptTaxes }
     *     
     */
    public ExemptTaxes getExemptTaxes() {
        return exemptTaxes;
    }

    /**
     * Sets the value of the exemptTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptTaxes }
     *     
     */
    public void setExemptTaxes(ExemptTaxes value) {
        this.exemptTaxes = value;
    }

    /**
     * Request Fares with specific Penalty
     * 							Information.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyFareInformation }
     *     
     */
    public PenaltyFareInformation getPenaltyFareInformation() {
        return penaltyFareInformation;
    }

    /**
     * Sets the value of the penaltyFareInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyFareInformation }
     *     
     */
    public void setPenaltyFareInformation(PenaltyFareInformation value) {
        this.penaltyFareInformation = value;
    }

    /**
     * Discount request for rail.
     * 						Gets the value of the discountCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountCard }
     * 
     * 
     */
    public List<DiscountCard> getDiscountCard() {
        if (discountCard == null) {
            discountCard = new ArrayList<DiscountCard>();
        }
        return this.discountCard;
    }

    /**
     * Gets the value of the promoCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers.PromoCodes }
     *     
     */
    public AirPricingModifiers.PromoCodes getPromoCodes() {
        return promoCodes;
    }

    /**
     * Sets the value of the promoCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers.PromoCodes }
     *     
     */
    public void setPromoCodes(AirPricingModifiers.PromoCodes value) {
        this.promoCodes = value;
    }

    /**
     * Gets the value of the prohibitMinStayFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitMinStayFares() {
        if (prohibitMinStayFares == null) {
            return false;
        } else {
            return prohibitMinStayFares;
        }
    }

    /**
     * Sets the value of the prohibitMinStayFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitMinStayFares(Boolean value) {
        this.prohibitMinStayFares = value;
    }

    /**
     * Gets the value of the prohibitMaxStayFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitMaxStayFares() {
        if (prohibitMaxStayFares == null) {
            return false;
        } else {
            return prohibitMaxStayFares;
        }
    }

    /**
     * Sets the value of the prohibitMaxStayFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitMaxStayFares(Boolean value) {
        this.prohibitMaxStayFares = value;
    }

    /**
     * Gets the value of the currencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * Sets the value of the currencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyType(String value) {
        this.currencyType = value;
    }

    /**
     * Gets the value of the prohibitAdvancePurchaseFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitAdvancePurchaseFares() {
        if (prohibitAdvancePurchaseFares == null) {
            return false;
        } else {
            return prohibitAdvancePurchaseFares;
        }
    }

    /**
     * Sets the value of the prohibitAdvancePurchaseFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitAdvancePurchaseFares(Boolean value) {
        this.prohibitAdvancePurchaseFares = value;
    }

    /**
     * Gets the value of the prohibitNonRefundableFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitNonRefundableFares() {
        if (prohibitNonRefundableFares == null) {
            return false;
        } else {
            return prohibitNonRefundableFares;
        }
    }

    /**
     * Sets the value of the prohibitNonRefundableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitNonRefundableFares(Boolean value) {
        this.prohibitNonRefundableFares = value;
    }

    /**
     * Gets the value of the prohibitRestrictedFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitRestrictedFares() {
        if (prohibitRestrictedFares == null) {
            return false;
        } else {
            return prohibitRestrictedFares;
        }
    }

    /**
     * Sets the value of the prohibitRestrictedFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitRestrictedFares(Boolean value) {
        this.prohibitRestrictedFares = value;
    }

    /**
     * Gets the value of the faresIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFaresIndicator }
     *     
     */
    public TypeFaresIndicator getFaresIndicator() {
        return faresIndicator;
    }

    /**
     * Sets the value of the faresIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFaresIndicator }
     *     
     */
    public void setFaresIndicator(TypeFaresIndicator value) {
        this.faresIndicator = value;
    }

    /**
     * Gets the value of the filedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledCurrency() {
        return filedCurrency;
    }

    /**
     * Sets the value of the filedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledCurrency(String value) {
        this.filedCurrency = value;
    }

    /**
     * Gets the value of the platingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * Gets the value of the eTicketability property.
     * 
     * @return
     *     possible object is
     *     {@link TypeEticketability }
     *     
     */
    public TypeEticketability getETicketability() {
        return eTicketability;
    }

    /**
     * Sets the value of the eTicketability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeEticketability }
     *     
     */
    public void setETicketability(TypeEticketability value) {
        this.eTicketability = value;
    }

    /**
     * Gets the value of the accountCodeFaresOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountCodeFaresOnly() {
        return accountCodeFaresOnly;
    }

    /**
     * Sets the value of the accountCodeFaresOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountCodeFaresOnly(Boolean value) {
        this.accountCodeFaresOnly = value;
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
     * Gets the value of the prohibitNonExchangeableFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitNonExchangeableFares() {
        if (prohibitNonExchangeableFares == null) {
            return false;
        } else {
            return prohibitNonExchangeableFares;
        }
    }

    /**
     * Sets the value of the prohibitNonExchangeableFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitNonExchangeableFares(Boolean value) {
        this.prohibitNonExchangeableFares = value;
    }

    /**
     * Gets the value of the forceSegmentSelect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isForceSegmentSelect() {
        if (forceSegmentSelect == null) {
            return false;
        } else {
            return forceSegmentSelect;
        }
    }

    /**
     * Sets the value of the forceSegmentSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceSegmentSelect(Boolean value) {
        this.forceSegmentSelect = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}AccountCode" maxOccurs="unbounded"/>
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
        "accountCode"
    })
    public static class AccountCodes {

        @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v15_0", required = true)
        protected List<AccountCode> accountCode;

        /**
         * Gets the value of the accountCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accountCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccountCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccountCode }
         * 
         * 
         */
        public List<AccountCode> getAccountCode() {
            if (accountCode == null) {
                accountCode = new ArrayList<AccountCode>();
            }
            return this.accountCode;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}ContractCode" maxOccurs="unbounded"/>
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
        "contractCode"
    })
    public static class ContractCodes {

        @XmlElement(name = "ContractCode", required = true)
        protected List<ContractCode> contractCode;

        /**
         * Gets the value of the contractCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contractCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContractCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContractCode }
         * 
         * 
         */
        public List<ContractCode> getContractCode() {
            if (contractCode == null) {
                contractCode = new ArrayList<ContractCode>();
            }
            return this.contractCode;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}BookingCode" maxOccurs="unbounded"/>
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
        "bookingCode"
    })
    public static class PermittedBookingCodes {

        @XmlElement(name = "BookingCode", required = true)
        protected List<BookingCode> bookingCode;

        /**
         * Gets the value of the bookingCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingCode }
         * 
         * 
         */
        public List<BookingCode> getBookingCode() {
            if (bookingCode == null) {
                bookingCode = new ArrayList<BookingCode>();
            }
            return this.bookingCode;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}CabinClass" maxOccurs="3"/>
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
        "cabinClass"
    })
    public static class PermittedCabins {

        @XmlElement(name = "CabinClass", required = true)
        protected List<CabinClass> cabinClass;

        /**
         * Gets the value of the cabinClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CabinClass }
         * 
         * 
         */
        public List<CabinClass> getCabinClass() {
            if (cabinClass == null) {
                cabinClass = new ArrayList<CabinClass>();
            }
            return this.cabinClass;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}BookingCode" maxOccurs="unbounded"/>
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
        "bookingCode"
    })
    public static class ProhibitedBookingCodes {

        @XmlElement(name = "BookingCode", required = true)
        protected List<BookingCode> bookingCode;

        /**
         * Gets the value of the bookingCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingCode }
         * 
         * 
         */
        public List<BookingCode> getBookingCode() {
            if (bookingCode == null) {
                bookingCode = new ArrayList<BookingCode>();
            }
            return this.bookingCode;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareRuleCategory" maxOccurs="unbounded"/>
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
        "fareRuleCategory"
    })
    public static class ProhibitedRuleCategories {

        @XmlElement(name = "FareRuleCategory", required = true)
        protected List<FareRuleCategory> fareRuleCategory;

        /**
         * Gets the value of the fareRuleCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareRuleCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareRuleCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareRuleCategory }
         * 
         * 
         */
        public List<FareRuleCategory> getFareRuleCategory() {
            if (fareRuleCategory == null) {
                fareRuleCategory = new ArrayList<FareRuleCategory>();
            }
            return this.fareRuleCategory;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}PromoCode" maxOccurs="unbounded"/>
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
        "promoCode"
    })
    public static class PromoCodes {

        @XmlElement(name = "PromoCode", required = true)
        protected List<PromoCode> promoCode;

        /**
         * Gets the value of the promoCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promoCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromoCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PromoCode }
         * 
         * 
         */
        public List<PromoCode> getPromoCode() {
            if (promoCode == null) {
                promoCode = new ArrayList<PromoCode>();
            }
            return this.promoCode;
        }

    }

}
