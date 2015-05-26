
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuppAges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuppAges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="suppFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="suppTo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="suppQuantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="suppPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuppAges")
public class SuppAges {

    @XmlAttribute(name = "suppFrom", required = true)
    protected int suppFrom;
    @XmlAttribute(name = "suppTo", required = true)
    protected int suppTo;
    @XmlAttribute(name = "suppQuantity", required = true)
    protected int suppQuantity;
    @XmlAttribute(name = "suppPrice", required = true)
    protected BigDecimal suppPrice;

    /**
     * Gets the value of the suppFrom property.
     * 
     */
    public int getSuppFrom() {
        return suppFrom;
    }

    /**
     * Sets the value of the suppFrom property.
     * 
     */
    public void setSuppFrom(int value) {
        this.suppFrom = value;
    }

    /**
     * Gets the value of the suppTo property.
     * 
     */
    public int getSuppTo() {
        return suppTo;
    }

    /**
     * Sets the value of the suppTo property.
     * 
     */
    public void setSuppTo(int value) {
        this.suppTo = value;
    }

    /**
     * Gets the value of the suppQuantity property.
     * 
     */
    public int getSuppQuantity() {
        return suppQuantity;
    }

    /**
     * Sets the value of the suppQuantity property.
     * 
     */
    public void setSuppQuantity(int value) {
        this.suppQuantity = value;
    }

    /**
     * Gets the value of the suppPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuppPrice() {
        return suppPrice;
    }

    /**
     * Sets the value of the suppPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuppPrice(BigDecimal value) {
        this.suppPrice = value;
    }

}
