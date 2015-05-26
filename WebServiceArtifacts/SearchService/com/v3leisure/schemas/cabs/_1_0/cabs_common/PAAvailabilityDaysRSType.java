
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PA_AvailabilityDaysRSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PA_AvailabilityDaysRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="start_date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="finish_date" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="days" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="price" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rrp_price" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="currency_code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="price_adults" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rrp_price_adults" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="price_children" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rrp_price_children" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="price_concessions" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rrp_price_concessions" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="price_group" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rrp_price_group" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PA_AvailabilityDaysRSType")
public class PAAvailabilityDaysRSType {

    @XmlAttribute(name = "start_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "finish_date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishDate;
    @XmlAttribute(name = "days", required = true)
    protected int days;
    @XmlAttribute(name = "price", required = true)
    protected BigDecimal price;
    @XmlAttribute(name = "rrp_price")
    protected BigDecimal rrpPrice;
    @XmlAttribute(name = "currency_code")
    protected String currencyCode;
    @XmlAttribute(name = "price_adults")
    protected BigDecimal priceAdults;
    @XmlAttribute(name = "rrp_price_adults")
    protected BigDecimal rrpPriceAdults;
    @XmlAttribute(name = "price_children")
    protected BigDecimal priceChildren;
    @XmlAttribute(name = "rrp_price_children")
    protected BigDecimal rrpPriceChildren;
    @XmlAttribute(name = "price_concessions")
    protected BigDecimal priceConcessions;
    @XmlAttribute(name = "rrp_price_concessions")
    protected BigDecimal rrpPriceConcessions;
    @XmlAttribute(name = "price_group")
    protected BigDecimal priceGroup;
    @XmlAttribute(name = "rrp_price_group")
    protected BigDecimal rrpPriceGroup;

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the finishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishDate() {
        return finishDate;
    }

    /**
     * Sets the value of the finishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishDate(XMLGregorianCalendar value) {
        this.finishDate = value;
    }

    /**
     * Gets the value of the days property.
     * 
     */
    public int getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     */
    public void setDays(int value) {
        this.days = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Gets the value of the rrpPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRrpPrice() {
        return rrpPrice;
    }

    /**
     * Sets the value of the rrpPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRrpPrice(BigDecimal value) {
        this.rrpPrice = value;
    }

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
     * Gets the value of the priceAdults property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceAdults() {
        return priceAdults;
    }

    /**
     * Sets the value of the priceAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceAdults(BigDecimal value) {
        this.priceAdults = value;
    }

    /**
     * Gets the value of the rrpPriceAdults property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRrpPriceAdults() {
        return rrpPriceAdults;
    }

    /**
     * Sets the value of the rrpPriceAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRrpPriceAdults(BigDecimal value) {
        this.rrpPriceAdults = value;
    }

    /**
     * Gets the value of the priceChildren property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceChildren() {
        return priceChildren;
    }

    /**
     * Sets the value of the priceChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceChildren(BigDecimal value) {
        this.priceChildren = value;
    }

    /**
     * Gets the value of the rrpPriceChildren property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRrpPriceChildren() {
        return rrpPriceChildren;
    }

    /**
     * Sets the value of the rrpPriceChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRrpPriceChildren(BigDecimal value) {
        this.rrpPriceChildren = value;
    }

    /**
     * Gets the value of the priceConcessions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceConcessions() {
        return priceConcessions;
    }

    /**
     * Sets the value of the priceConcessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceConcessions(BigDecimal value) {
        this.priceConcessions = value;
    }

    /**
     * Gets the value of the rrpPriceConcessions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRrpPriceConcessions() {
        return rrpPriceConcessions;
    }

    /**
     * Sets the value of the rrpPriceConcessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRrpPriceConcessions(BigDecimal value) {
        this.rrpPriceConcessions = value;
    }

    /**
     * Gets the value of the priceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceGroup() {
        return priceGroup;
    }

    /**
     * Sets the value of the priceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceGroup(BigDecimal value) {
        this.priceGroup = value;
    }

    /**
     * Gets the value of the rrpPriceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRrpPriceGroup() {
        return rrpPriceGroup;
    }

    /**
     * Sets the value of the rrpPriceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRrpPriceGroup(BigDecimal value) {
        this.rrpPriceGroup = value;
    }

}
