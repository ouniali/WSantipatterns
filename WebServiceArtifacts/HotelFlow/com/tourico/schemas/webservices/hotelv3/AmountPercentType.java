
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountPercentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountPercentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="basisType" type="{http://schemas.tourico.com/webservices/hotelv3}AmountPercentTypeBasisType" />
 *       &lt;attribute name="percent" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="decimalPlaces" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPercentType")
public class AmountPercentType {

    @XmlAttribute(name = "currencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "nmbrOfNights")
    protected String nmbrOfNights;
    @XmlAttribute(name = "basisType")
    protected AmountPercentTypeBasisType basisType;
    @XmlAttribute(name = "percent")
    protected Double percent;
    @XmlAttribute(name = "amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "decimalPlaces")
    protected Integer decimalPlaces;

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the nmbrOfNights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmbrOfNights() {
        return nmbrOfNights;
    }

    /**
     * Sets the value of the nmbrOfNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmbrOfNights(String value) {
        this.nmbrOfNights = value;
    }

    /**
     * Gets the value of the basisType property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPercentTypeBasisType }
     *     
     */
    public AmountPercentTypeBasisType getBasisType() {
        return basisType;
    }

    /**
     * Sets the value of the basisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPercentTypeBasisType }
     *     
     */
    public void setBasisType(AmountPercentTypeBasisType value) {
        this.basisType = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercent(Double value) {
        this.percent = value;
    }

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
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecimalPlaces(Integer value) {
        this.decimalPlaces = value;
    }

}
