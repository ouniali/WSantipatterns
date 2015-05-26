
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Reservations" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfReservation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="tranNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="rgRemark" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rgId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="isPackage" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="totalPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="totalPublishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResGroup", propOrder = {
    "reservations"
})
public class ResGroup {

    @XmlElement(name = "Reservations")
    protected ArrayOfReservation reservations;
    @XmlAttribute(name = "tranNum", required = true)
    protected int tranNum;
    @XmlAttribute(name = "rgRemark")
    protected String rgRemark;
    @XmlAttribute(name = "rgId", required = true)
    protected int rgId;
    @XmlAttribute(name = "isPackage", required = true)
    protected boolean isPackage;
    @XmlAttribute(name = "currency")
    protected String currency;
    @XmlAttribute(name = "totalPrice", required = true)
    protected BigDecimal totalPrice;
    @XmlAttribute(name = "totalPublishPrice")
    protected BigDecimal totalPublishPrice;

    /**
     * Gets the value of the reservations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReservation }
     *     
     */
    public ArrayOfReservation getReservations() {
        return reservations;
    }

    /**
     * Sets the value of the reservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReservation }
     *     
     */
    public void setReservations(ArrayOfReservation value) {
        this.reservations = value;
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

    /**
     * Gets the value of the rgRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgRemark() {
        return rgRemark;
    }

    /**
     * Sets the value of the rgRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgRemark(String value) {
        this.rgRemark = value;
    }

    /**
     * Gets the value of the rgId property.
     * 
     */
    public int getRgId() {
        return rgId;
    }

    /**
     * Sets the value of the rgId property.
     * 
     */
    public void setRgId(int value) {
        this.rgId = value;
    }

    /**
     * Gets the value of the isPackage property.
     * 
     */
    public boolean isIsPackage() {
        return isPackage;
    }

    /**
     * Sets the value of the isPackage property.
     * 
     */
    public void setIsPackage(boolean value) {
        this.isPackage = value;
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
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the totalPublishPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPublishPrice() {
        return totalPublishPrice;
    }

    /**
     * Sets the value of the totalPublishPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPublishPrice(BigDecimal value) {
        this.totalPublishPrice = value;
    }

}
