
package com.travelport.schema.rail_v12_0;

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
 *       &lt;attribute name="RefundAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="CancellationFee" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="ExchangeAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="ApproximateRefundAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="ApproximateCancellationFee" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="ApproximateExchangeAmount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RailExchangeInfo")
public class RailExchangeInfo {

    @XmlAttribute(name = "RefundAmount")
    protected String refundAmount;
    @XmlAttribute(name = "CancellationFee")
    protected String cancellationFee;
    @XmlAttribute(name = "ExchangeAmount")
    protected String exchangeAmount;
    @XmlAttribute(name = "ApproximateRefundAmount")
    protected String approximateRefundAmount;
    @XmlAttribute(name = "ApproximateCancellationFee")
    protected String approximateCancellationFee;
    @XmlAttribute(name = "ApproximateExchangeAmount")
    protected String approximateExchangeAmount;

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundAmount(String value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the cancellationFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationFee() {
        return cancellationFee;
    }

    /**
     * Sets the value of the cancellationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationFee(String value) {
        this.cancellationFee = value;
    }

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
     * Gets the value of the approximateRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateRefundAmount() {
        return approximateRefundAmount;
    }

    /**
     * Sets the value of the approximateRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateRefundAmount(String value) {
        this.approximateRefundAmount = value;
    }

    /**
     * Gets the value of the approximateCancellationFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateCancellationFee() {
        return approximateCancellationFee;
    }

    /**
     * Sets the value of the approximateCancellationFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateCancellationFee(String value) {
        this.approximateCancellationFee = value;
    }

    /**
     * Gets the value of the approximateExchangeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateExchangeAmount() {
        return approximateExchangeAmount;
    }

    /**
     * Sets the value of the approximateExchangeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateExchangeAmount(String value) {
        this.approximateExchangeAmount = value;
    }

}
