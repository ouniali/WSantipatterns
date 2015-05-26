
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Reservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductInfo" type="{http://schemas.tourico.com/webservices/hotelv3}ProductInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="reservationId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="fromDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="toDate" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="totalTax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="price" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="totalPublishTax" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="publishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="isPublish" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numOfAdults" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="numOfChildren" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="note" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tranNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reservation", propOrder = {
    "productInfo"
})
public class Reservation {

    @XmlElement(name = "ProductInfo")
    protected ProductInfo productInfo;
    @XmlAttribute(name = "reservationId", required = true)
    protected int reservationId;
    @XmlAttribute(name = "fromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlAttribute(name = "toDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlAttribute(name = "totalTax", required = true)
    protected BigDecimal totalTax;
    @XmlAttribute(name = "price", required = true)
    protected BigDecimal price;
    @XmlAttribute(name = "totalPublishTax")
    protected BigDecimal totalPublishTax;
    @XmlAttribute(name = "publishPrice")
    protected BigDecimal publishPrice;
    @XmlAttribute(name = "isPublish", required = true)
    protected boolean isPublish;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "status")
    protected String status;
    @XmlAttribute(name = "numOfAdults", required = true)
    protected int numOfAdults;
    @XmlAttribute(name = "numOfChildren", required = true)
    protected int numOfChildren;
    @XmlAttribute(name = "note")
    protected String note;
    @XmlAttribute(name = "tranNum", required = true)
    protected int tranNum;

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInfo }
     *     
     */
    public ProductInfo getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInfo }
     *     
     */
    public void setProductInfo(ProductInfo value) {
        this.productInfo = value;
    }

    /**
     * Gets the value of the reservationId property.
     * 
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     */
    public void setReservationId(int value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
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
     * Gets the value of the totalPublishTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPublishTax() {
        return totalPublishTax;
    }

    /**
     * Sets the value of the totalPublishTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPublishTax(BigDecimal value) {
        this.totalPublishTax = value;
    }

    /**
     * Gets the value of the publishPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPublishPrice() {
        return publishPrice;
    }

    /**
     * Sets the value of the publishPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPublishPrice(BigDecimal value) {
        this.publishPrice = value;
    }

    /**
     * Gets the value of the isPublish property.
     * 
     */
    public boolean isIsPublish() {
        return isPublish;
    }

    /**
     * Sets the value of the isPublish property.
     * 
     */
    public void setIsPublish(boolean value) {
        this.isPublish = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the numOfAdults property.
     * 
     */
    public int getNumOfAdults() {
        return numOfAdults;
    }

    /**
     * Sets the value of the numOfAdults property.
     * 
     */
    public void setNumOfAdults(int value) {
        this.numOfAdults = value;
    }

    /**
     * Gets the value of the numOfChildren property.
     * 
     */
    public int getNumOfChildren() {
        return numOfChildren;
    }

    /**
     * Sets the value of the numOfChildren property.
     * 
     */
    public void setNumOfChildren(int value) {
        this.numOfChildren = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the tranNum property.
     * 
     */
    public int getTranNum() {
        return tranNum;
    }

    /**
     * Sets the value of the tranNum property.
     * 
     */
    public void setTranNum(int value) {
        this.tranNum = value;
    }

}
