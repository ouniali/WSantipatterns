
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Boardbase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Boardbase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="bbId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="bbName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bbPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="bbPublishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Boardbase")
public class Boardbase {

    @XmlAttribute(name = "bbId", required = true)
    protected int bbId;
    @XmlAttribute(name = "bbName")
    protected String bbName;
    @XmlAttribute(name = "bbPrice", required = true)
    protected BigDecimal bbPrice;
    @XmlAttribute(name = "bbPublishPrice")
    protected BigDecimal bbPublishPrice;

    /**
     * Gets the value of the bbId property.
     * 
     */
    public int getBbId() {
        return bbId;
    }

    /**
     * Sets the value of the bbId property.
     * 
     */
    public void setBbId(int value) {
        this.bbId = value;
    }

    /**
     * Gets the value of the bbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBbName() {
        return bbName;
    }

    /**
     * Sets the value of the bbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBbName(String value) {
        this.bbName = value;
    }

    /**
     * Gets the value of the bbPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBbPrice() {
        return bbPrice;
    }

    /**
     * Sets the value of the bbPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBbPrice(BigDecimal value) {
        this.bbPrice = value;
    }

    /**
     * Gets the value of the bbPublishPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBbPublishPrice() {
        return bbPublishPrice;
    }

    /**
     * Sets the value of the bbPublishPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBbPublishPrice(BigDecimal value) {
        this.bbPublishPrice = value;
    }

}
