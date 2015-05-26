
package _170._0._168._192.tt.bookingapi;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSFare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSFare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Tax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ServiceTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AdditionalTxnFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AgentCommission" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TdsOnCommission" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IncentiveEarned" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TdsOnIncentive" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PLBEarned" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TdsOnPLB" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PublishedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AirTransFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ChargeBU" type="{http://192.168.0.170/TT/BookingAPI}ArrayOfChargeBreakUp" minOccurs="0"/>
 *         &lt;element name="OtherCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FuelSurcharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TransactionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ReverseHandlingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OfferedFare" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AgentServiceCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AgentConvienceCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSFare", propOrder = {
    "baseFare",
    "tax",
    "serviceTax",
    "additionalTxnFee",
    "agentCommission",
    "tdsOnCommission",
    "incentiveEarned",
    "tdsOnIncentive",
    "plbEarned",
    "tdsOnPLB",
    "publishedPrice",
    "airTransFee",
    "currency",
    "discount",
    "chargeBU",
    "otherCharges",
    "fuelSurcharge",
    "transactionFee",
    "reverseHandlingCharge",
    "offeredFare",
    "agentServiceCharge",
    "agentConvienceCharges"
})
public class WSFare {

    @XmlElement(name = "BaseFare", required = true)
    protected BigDecimal baseFare;
    @XmlElement(name = "Tax", required = true)
    protected BigDecimal tax;
    @XmlElement(name = "ServiceTax", required = true)
    protected BigDecimal serviceTax;
    @XmlElement(name = "AdditionalTxnFee", required = true)
    protected BigDecimal additionalTxnFee;
    @XmlElement(name = "AgentCommission", required = true)
    protected BigDecimal agentCommission;
    @XmlElement(name = "TdsOnCommission", required = true)
    protected BigDecimal tdsOnCommission;
    @XmlElement(name = "IncentiveEarned", required = true)
    protected BigDecimal incentiveEarned;
    @XmlElement(name = "TdsOnIncentive", required = true)
    protected BigDecimal tdsOnIncentive;
    @XmlElement(name = "PLBEarned", required = true)
    protected BigDecimal plbEarned;
    @XmlElement(name = "TdsOnPLB", required = true)
    protected BigDecimal tdsOnPLB;
    @XmlElement(name = "PublishedPrice", required = true)
    protected BigDecimal publishedPrice;
    @XmlElement(name = "AirTransFee", required = true)
    protected BigDecimal airTransFee;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Discount", required = true)
    protected BigDecimal discount;
    @XmlElement(name = "ChargeBU")
    protected ArrayOfChargeBreakUp chargeBU;
    @XmlElement(name = "OtherCharges", required = true)
    protected BigDecimal otherCharges;
    @XmlElement(name = "FuelSurcharge", required = true)
    protected BigDecimal fuelSurcharge;
    @XmlElement(name = "TransactionFee", required = true)
    protected BigDecimal transactionFee;
    @XmlElement(name = "ReverseHandlingCharge", required = true)
    protected BigDecimal reverseHandlingCharge;
    @XmlElement(name = "OfferedFare", required = true)
    protected BigDecimal offeredFare;
    @XmlElement(name = "AgentServiceCharge", required = true)
    protected BigDecimal agentServiceCharge;
    @XmlElement(name = "AgentConvienceCharges", required = true)
    protected BigDecimal agentConvienceCharges;

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseFare(BigDecimal value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the serviceTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceTax() {
        return serviceTax;
    }

    /**
     * Sets the value of the serviceTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceTax(BigDecimal value) {
        this.serviceTax = value;
    }

    /**
     * Gets the value of the additionalTxnFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdditionalTxnFee() {
        return additionalTxnFee;
    }

    /**
     * Sets the value of the additionalTxnFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdditionalTxnFee(BigDecimal value) {
        this.additionalTxnFee = value;
    }

    /**
     * Gets the value of the agentCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgentCommission() {
        return agentCommission;
    }

    /**
     * Sets the value of the agentCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgentCommission(BigDecimal value) {
        this.agentCommission = value;
    }

    /**
     * Gets the value of the tdsOnCommission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTdsOnCommission() {
        return tdsOnCommission;
    }

    /**
     * Sets the value of the tdsOnCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTdsOnCommission(BigDecimal value) {
        this.tdsOnCommission = value;
    }

    /**
     * Gets the value of the incentiveEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncentiveEarned() {
        return incentiveEarned;
    }

    /**
     * Sets the value of the incentiveEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncentiveEarned(BigDecimal value) {
        this.incentiveEarned = value;
    }

    /**
     * Gets the value of the tdsOnIncentive property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTdsOnIncentive() {
        return tdsOnIncentive;
    }

    /**
     * Sets the value of the tdsOnIncentive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTdsOnIncentive(BigDecimal value) {
        this.tdsOnIncentive = value;
    }

    /**
     * Gets the value of the plbEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPLBEarned() {
        return plbEarned;
    }

    /**
     * Sets the value of the plbEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPLBEarned(BigDecimal value) {
        this.plbEarned = value;
    }

    /**
     * Gets the value of the tdsOnPLB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTdsOnPLB() {
        return tdsOnPLB;
    }

    /**
     * Sets the value of the tdsOnPLB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTdsOnPLB(BigDecimal value) {
        this.tdsOnPLB = value;
    }

    /**
     * Gets the value of the publishedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPublishedPrice() {
        return publishedPrice;
    }

    /**
     * Sets the value of the publishedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPublishedPrice(BigDecimal value) {
        this.publishedPrice = value;
    }

    /**
     * Gets the value of the airTransFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAirTransFee() {
        return airTransFee;
    }

    /**
     * Sets the value of the airTransFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAirTransFee(BigDecimal value) {
        this.airTransFee = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscount(BigDecimal value) {
        this.discount = value;
    }

    /**
     * Gets the value of the chargeBU property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChargeBreakUp }
     *     
     */
    public ArrayOfChargeBreakUp getChargeBU() {
        return chargeBU;
    }

    /**
     * Sets the value of the chargeBU property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChargeBreakUp }
     *     
     */
    public void setChargeBU(ArrayOfChargeBreakUp value) {
        this.chargeBU = value;
    }

    /**
     * Gets the value of the otherCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherCharges() {
        return otherCharges;
    }

    /**
     * Sets the value of the otherCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherCharges(BigDecimal value) {
        this.otherCharges = value;
    }

    /**
     * Gets the value of the fuelSurcharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFuelSurcharge() {
        return fuelSurcharge;
    }

    /**
     * Sets the value of the fuelSurcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFuelSurcharge(BigDecimal value) {
        this.fuelSurcharge = value;
    }

    /**
     * Gets the value of the transactionFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionFee() {
        return transactionFee;
    }

    /**
     * Sets the value of the transactionFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionFee(BigDecimal value) {
        this.transactionFee = value;
    }

    /**
     * Gets the value of the reverseHandlingCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReverseHandlingCharge() {
        return reverseHandlingCharge;
    }

    /**
     * Sets the value of the reverseHandlingCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReverseHandlingCharge(BigDecimal value) {
        this.reverseHandlingCharge = value;
    }

    /**
     * Gets the value of the offeredFare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOfferedFare() {
        return offeredFare;
    }

    /**
     * Sets the value of the offeredFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOfferedFare(BigDecimal value) {
        this.offeredFare = value;
    }

    /**
     * Gets the value of the agentServiceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgentServiceCharge() {
        return agentServiceCharge;
    }

    /**
     * Sets the value of the agentServiceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgentServiceCharge(BigDecimal value) {
        this.agentServiceCharge = value;
    }

    /**
     * Gets the value of the agentConvienceCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgentConvienceCharges() {
        return agentConvienceCharges;
    }

    /**
     * Sets the value of the agentConvienceCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgentConvienceCharges(BigDecimal value) {
        this.agentConvienceCharges = value;
    }

}
