
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplementInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplementInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupAgeGroup" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSuppAges" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="suppId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="supTotalPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="suppType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementInfo", propOrder = {
    "supAgeGroup"
})
public class SupplementInfo {

    @XmlElement(name = "SupAgeGroup")
    protected ArrayOfSuppAges supAgeGroup;
    @XmlAttribute(name = "suppId", required = true)
    protected int suppId;
    @XmlAttribute(name = "supTotalPrice", required = true)
    protected BigDecimal supTotalPrice;
    @XmlAttribute(name = "suppType", required = true)
    protected int suppType;

    /**
     * Gets the value of the supAgeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSuppAges }
     *     
     */
    public ArrayOfSuppAges getSupAgeGroup() {
        return supAgeGroup;
    }

    /**
     * Sets the value of the supAgeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSuppAges }
     *     
     */
    public void setSupAgeGroup(ArrayOfSuppAges value) {
        this.supAgeGroup = value;
    }

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
     * Gets the value of the supTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSupTotalPrice() {
        return supTotalPrice;
    }

    /**
     * Sets the value of the supTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSupTotalPrice(BigDecimal value) {
        this.supTotalPrice = value;
    }

    /**
     * Gets the value of the suppType property.
     * 
     */
    public int getSuppType() {
        return suppType;
    }

    /**
     * Sets the value of the suppType property.
     * 
     */
    public void setSuppType(int value) {
        this.suppType = value;
    }

}
