
package com.tourico.schemas.webservices.hotelv3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrigPrice" type="{http://schemas.tourico.com/webservices/hotelv3}PriceType" minOccurs="0"/>
 *         &lt;element name="NewPrice" type="{http://schemas.tourico.com/webservices/hotelv3}PriceType" minOccurs="0"/>
 *         &lt;element name="Paid" type="{http://schemas.tourico.com/webservices/hotelv3}PriceType" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://schemas.tourico.com/webservices/hotelv3}PriceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingType", propOrder = {
    "origPrice",
    "newPrice",
    "paid",
    "balance"
})
public class BillingType {

    @XmlElement(name = "OrigPrice")
    protected PriceType origPrice;
    @XmlElement(name = "NewPrice")
    protected PriceType newPrice;
    @XmlElement(name = "Paid")
    protected PriceType paid;
    @XmlElement(name = "Balance")
    protected PriceType balance;

    /**
     * Gets the value of the origPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getOrigPrice() {
        return origPrice;
    }

    /**
     * Sets the value of the origPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setOrigPrice(PriceType value) {
        this.origPrice = value;
    }

    /**
     * Gets the value of the newPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getNewPrice() {
        return newPrice;
    }

    /**
     * Sets the value of the newPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setNewPrice(PriceType value) {
        this.newPrice = value;
    }

    /**
     * Gets the value of the paid property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPaid(PriceType value) {
        this.paid = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setBalance(PriceType value) {
        this.balance = value;
    }

}
