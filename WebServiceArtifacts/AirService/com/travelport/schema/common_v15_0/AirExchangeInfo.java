
package com.travelport.schema.common_v15_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="ExchangeAmount" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="BaseFare" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="EquivalentBaseFare" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="Taxes" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="ChangeFee" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="ForfeitAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="Refundable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Exchangeable" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FirstClassUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TicketByDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "AirExchangeInfo")
public class AirExchangeInfo {

    @XmlAttribute(name = "ExchangeAmount", required = true)
    protected String exchangeAmount;
    @XmlAttribute(name = "BaseFare", required = true)
    protected String baseFare;
    @XmlAttribute(name = "EquivalentBaseFare")
    protected String equivalentBaseFare;
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    @XmlAttribute(name = "ChangeFee")
    protected String changeFee;
    @XmlAttribute(name = "ForfeitAmount")
    protected String forfeitAmount;
    @XmlAttribute(name = "Refundable")
    protected Boolean refundable;
    @XmlAttribute(name = "Exchangeable")
    protected Boolean exchangeable;
    @XmlAttribute(name = "FirstClassUpgrade")
    protected Boolean firstClassUpgrade;
    @XmlAttribute(name = "TicketByDate")
    protected String ticketByDate;

    /**
     * Gets the value of the exchangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeAmount() {
        return exchangeAmount;
    }

    /**
     * Sets the value of the exchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeAmount(String value) {
        this.exchangeAmount = value;
    }

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFare(String value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the equivalentBaseFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentBaseFare() {
        return equivalentBaseFare;
    }

    /**
     * Sets the value of the equivalentBaseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentBaseFare(String value) {
        this.equivalentBaseFare = value;
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
     * Gets the value of the changeFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeFee() {
        return changeFee;
    }

    /**
     * Sets the value of the changeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeFee(String value) {
        this.changeFee = value;
    }

    /**
     * Gets the value of the forfeitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForfeitAmount() {
        return forfeitAmount;
    }

    /**
     * Sets the value of the forfeitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForfeitAmount(String value) {
        this.forfeitAmount = value;
    }

    /**
     * Gets the value of the refundable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundable() {
        return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundable(Boolean value) {
        this.refundable = value;
    }

    /**
     * Gets the value of the exchangeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExchangeable() {
        return exchangeable;
    }

    /**
     * Sets the value of the exchangeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExchangeable(Boolean value) {
        this.exchangeable = value;
    }

    /**
     * Gets the value of the firstClassUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstClassUpgrade() {
        return firstClassUpgrade;
    }

    /**
     * Sets the value of the firstClassUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstClassUpgrade(Boolean value) {
        this.firstClassUpgrade = value;
    }

    /**
     * Gets the value of the ticketByDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketByDate() {
        return ticketByDate;
    }

    /**
     * Sets the value of the ticketByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketByDate(String value) {
        this.ticketByDate = value;
    }

}
