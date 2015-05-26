
package org.datacontract.schemas._2004._07.goquo_dp;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispCurrencySymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispNetAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispTaxnFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DispTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDiscountRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDiscountTotalRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsLoyalty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPaymentDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsTotalRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsValidLoyalty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerAdultPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerChildPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PerInfantPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PromoStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoudedAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxnFees" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageSummary", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", propOrder = {
    "amount",
    "currencyCode",
    "description",
    "dispAmount",
    "dispCurrencySymbol",
    "dispNetAmount",
    "dispTaxnFees",
    "dispTotal",
    "isDiscountRecord",
    "isDiscountTotalRecord",
    "isLoyalty",
    "isPaymentDiscount",
    "isTotalRecord",
    "isValidLoyalty",
    "netAmount",
    "perAdultPrice",
    "perChildPrice",
    "perInfantPrice",
    "promoStatus",
    "roudedAdjustmentAmount",
    "taxnFees",
    "total"
})
public class PackageSummary {

    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "DispAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispAmount;
    @XmlElementRef(name = "DispCurrencySymbol", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispCurrencySymbol;
    @XmlElementRef(name = "DispNetAmount", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispNetAmount;
    @XmlElementRef(name = "DispTaxnFees", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTaxnFees;
    @XmlElementRef(name = "DispTotal", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dispTotal;
    @XmlElement(name = "IsDiscountRecord")
    protected Boolean isDiscountRecord;
    @XmlElement(name = "IsDiscountTotalRecord")
    protected Boolean isDiscountTotalRecord;
    @XmlElement(name = "IsLoyalty")
    protected Boolean isLoyalty;
    @XmlElement(name = "IsPaymentDiscount")
    protected Boolean isPaymentDiscount;
    @XmlElement(name = "IsTotalRecord")
    protected Boolean isTotalRecord;
    @XmlElement(name = "IsValidLoyalty")
    protected Boolean isValidLoyalty;
    @XmlElement(name = "NetAmount")
    protected BigDecimal netAmount;
    @XmlElement(name = "PerAdultPrice")
    protected BigDecimal perAdultPrice;
    @XmlElement(name = "PerChildPrice")
    protected BigDecimal perChildPrice;
    @XmlElement(name = "PerInfantPrice")
    protected BigDecimal perInfantPrice;
    @XmlElementRef(name = "PromoStatus", namespace = "http://schemas.datacontract.org/2004/07/GoQuo.DP.BAL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promoStatus;
    @XmlElement(name = "RoudedAdjustmentAmount")
    protected BigDecimal roudedAdjustmentAmount;
    @XmlElement(name = "TaxnFees")
    protected BigDecimal taxnFees;
    @XmlElement(name = "Total")
    protected BigDecimal total;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the dispAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispAmount() {
        return dispAmount;
    }

    /**
     * Sets the value of the dispAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispAmount(JAXBElement<String> value) {
        this.dispAmount = value;
    }

    /**
     * Gets the value of the dispCurrencySymbol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispCurrencySymbol() {
        return dispCurrencySymbol;
    }

    /**
     * Sets the value of the dispCurrencySymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispCurrencySymbol(JAXBElement<String> value) {
        this.dispCurrencySymbol = value;
    }

    /**
     * Gets the value of the dispNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispNetAmount() {
        return dispNetAmount;
    }

    /**
     * Sets the value of the dispNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispNetAmount(JAXBElement<String> value) {
        this.dispNetAmount = value;
    }

    /**
     * Gets the value of the dispTaxnFees property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTaxnFees() {
        return dispTaxnFees;
    }

    /**
     * Sets the value of the dispTaxnFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTaxnFees(JAXBElement<String> value) {
        this.dispTaxnFees = value;
    }

    /**
     * Gets the value of the dispTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDispTotal() {
        return dispTotal;
    }

    /**
     * Sets the value of the dispTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDispTotal(JAXBElement<String> value) {
        this.dispTotal = value;
    }

    /**
     * Gets the value of the isDiscountRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDiscountRecord() {
        return isDiscountRecord;
    }

    /**
     * Sets the value of the isDiscountRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDiscountRecord(Boolean value) {
        this.isDiscountRecord = value;
    }

    /**
     * Gets the value of the isDiscountTotalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDiscountTotalRecord() {
        return isDiscountTotalRecord;
    }

    /**
     * Sets the value of the isDiscountTotalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDiscountTotalRecord(Boolean value) {
        this.isDiscountTotalRecord = value;
    }

    /**
     * Gets the value of the isLoyalty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoyalty() {
        return isLoyalty;
    }

    /**
     * Sets the value of the isLoyalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoyalty(Boolean value) {
        this.isLoyalty = value;
    }

    /**
     * Gets the value of the isPaymentDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPaymentDiscount() {
        return isPaymentDiscount;
    }

    /**
     * Sets the value of the isPaymentDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPaymentDiscount(Boolean value) {
        this.isPaymentDiscount = value;
    }

    /**
     * Gets the value of the isTotalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTotalRecord() {
        return isTotalRecord;
    }

    /**
     * Sets the value of the isTotalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTotalRecord(Boolean value) {
        this.isTotalRecord = value;
    }

    /**
     * Gets the value of the isValidLoyalty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValidLoyalty() {
        return isValidLoyalty;
    }

    /**
     * Sets the value of the isValidLoyalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidLoyalty(Boolean value) {
        this.isValidLoyalty = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the perAdultPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerAdultPrice() {
        return perAdultPrice;
    }

    /**
     * Sets the value of the perAdultPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerAdultPrice(BigDecimal value) {
        this.perAdultPrice = value;
    }

    /**
     * Gets the value of the perChildPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerChildPrice() {
        return perChildPrice;
    }

    /**
     * Sets the value of the perChildPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerChildPrice(BigDecimal value) {
        this.perChildPrice = value;
    }

    /**
     * Gets the value of the perInfantPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerInfantPrice() {
        return perInfantPrice;
    }

    /**
     * Sets the value of the perInfantPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerInfantPrice(BigDecimal value) {
        this.perInfantPrice = value;
    }

    /**
     * Gets the value of the promoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromoStatus() {
        return promoStatus;
    }

    /**
     * Sets the value of the promoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromoStatus(JAXBElement<String> value) {
        this.promoStatus = value;
    }

    /**
     * Gets the value of the roudedAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoudedAdjustmentAmount() {
        return roudedAdjustmentAmount;
    }

    /**
     * Sets the value of the roudedAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoudedAdjustmentAmount(BigDecimal value) {
        this.roudedAdjustmentAmount = value;
    }

    /**
     * Gets the value of the taxnFees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxnFees() {
        return taxnFees;
    }

    /**
     * Sets the value of the taxnFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxnFees(BigDecimal value) {
        this.taxnFees = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

}
