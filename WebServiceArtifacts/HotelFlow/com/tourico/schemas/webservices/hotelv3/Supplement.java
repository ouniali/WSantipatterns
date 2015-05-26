
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Supplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Supplement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="suppId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="suppName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="supptType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="suppIsMandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="suppChargeType" use="required" type="{http://schemas.tourico.com/webservices/hotelv3}ChargeType" />
 *       &lt;attribute name="price" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="publishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supplement")
@XmlSeeAlso({
    PerRoomSupplement.class,
    PerPersonSupplement.class
})
public class Supplement {

    @XmlAttribute(name = "suppId", required = true)
    protected int suppId;
    @XmlAttribute(name = "suppName")
    protected String suppName;
    @XmlAttribute(name = "supptType", required = true)
    protected int supptType;
    @XmlAttribute(name = "suppIsMandatory", required = true)
    protected boolean suppIsMandatory;
    @XmlAttribute(name = "suppChargeType", required = true)
    protected ChargeType suppChargeType;
    @XmlAttribute(name = "price", required = true)
    protected BigDecimal price;
    @XmlAttribute(name = "publishPrice")
    protected BigDecimal publishPrice;

    /**
     * Gets the value of the suppId property.
     * 
     */
    public int getSuppId() {
        return suppId;
    }

    /**
     * Sets the value of the suppId property.
     * 
     */
    public void setSuppId(int value) {
        this.suppId = value;
    }

    /**
     * Gets the value of the suppName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppName() {
        return suppName;
    }

    /**
     * Sets the value of the suppName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppName(String value) {
        this.suppName = value;
    }

    /**
     * Gets the value of the supptType property.
     * 
     */
    public int getSupptType() {
        return supptType;
    }

    /**
     * Sets the value of the supptType property.
     * 
     */
    public void setSupptType(int value) {
        this.supptType = value;
    }

    /**
     * Gets the value of the suppIsMandatory property.
     * 
     */
    public boolean isSuppIsMandatory() {
        return suppIsMandatory;
    }

    /**
     * Sets the value of the suppIsMandatory property.
     * 
     */
    public void setSuppIsMandatory(boolean value) {
        this.suppIsMandatory = value;
    }

    /**
     * Gets the value of the suppChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType }
     *     
     */
    public ChargeType getSuppChargeType() {
        return suppChargeType;
    }

    /**
     * Sets the value of the suppChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType }
     *     
     */
    public void setSuppChargeType(ChargeType value) {
        this.suppChargeType = value;
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

}
