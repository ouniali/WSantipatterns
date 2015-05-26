
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgressivePromotion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressivePromotion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.tourico.com/webservices/hotelv3}Promotion">
 *       &lt;attribute name="type" use="required" type="{http://schemas.tourico.com/webservices/hotelv3}ProgressiveTypes" />
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressivePromotion")
public class ProgressivePromotion
    extends Promotion
{

    @XmlAttribute(name = "type", required = true)
    protected ProgressiveTypes type;
    @XmlAttribute(name = "value", required = true)
    protected BigDecimal value;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProgressiveTypes }
     *     
     */
    public ProgressiveTypes getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressiveTypes }
     *     
     */
    public void setType(ProgressiveTypes value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
