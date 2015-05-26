
package com.tourico.webservices.tws_clxpolicies;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NmbrOfNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="BasisType" type="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}AmountPercentTypeBasisType" />
 *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountPercentType", propOrder = {
    "currencyCode"
})
public class AmountPercentType {

    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "NmbrOfNights")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nmbrOfNights;
    @XmlAttribute(name = "BasisType")
    protected AmountPercentTypeBasisType basisType;
    @XmlAttribute(name = "Percent")
    protected Double percent;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "DecimalPlaces")
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
