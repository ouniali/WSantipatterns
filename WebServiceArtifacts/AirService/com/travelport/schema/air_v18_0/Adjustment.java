
package com.travelport.schema.air_v18_0;

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
 *       &lt;choice>
 *         &lt;element name="Amount" type="{http://www.travelport.com/schema/common_v15_0}typeMoney"/>
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/choice>
 *       &lt;attribute name="AdjustedTotalPrice" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="ApproximateAdjustedTotalPrice" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *       &lt;attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "amount",
    "percent"
})
@XmlRootElement(name = "Adjustment")
public class Adjustment {

    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "Percent")
    protected Float percent;
    @XmlAttribute(name = "AdjustedTotalPrice", required = true)
    protected String adjustedTotalPrice;
    @XmlAttribute(name = "ApproximateAdjustedTotalPrice")
    protected String approximateAdjustedTotalPrice;
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPercent(Float value) {
        this.percent = value;
    }

    /**
     * Gets the value of the adjustedTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustedTotalPrice() {
        return adjustedTotalPrice;
    }

    /**
     * Sets the value of the adjustedTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustedTotalPrice(String value) {
        this.adjustedTotalPrice = value;
    }

    /**
     * Gets the value of the approximateAdjustedTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateAdjustedTotalPrice() {
        return approximateAdjustedTotalPrice;
    }

    /**
     * Sets the value of the approximateAdjustedTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateAdjustedTotalPrice(String value) {
        this.approximateAdjustedTotalPrice = value;
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

}
