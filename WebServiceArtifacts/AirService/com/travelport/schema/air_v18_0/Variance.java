
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Type" use="required" type="{http://www.travelport.com/schema/air_v18_0}typeVarianceType" />
 *       &lt;attribute name="Time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Indicator" type="{http://www.travelport.com/schema/air_v18_0}typeVarianceIndicator" />
 *       &lt;attribute name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Variance")
public class Variance {

    @XmlAttribute(name = "Type", required = true)
    protected TypeVarianceType type;
    @XmlAttribute(name = "Time")
    protected String time;
    @XmlAttribute(name = "Indicator")
    protected TypeVarianceIndicator indicator;
    @XmlAttribute(name = "Reason")
    protected String reason;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVarianceType }
     *     
     */
    public TypeVarianceType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVarianceType }
     *     
     */
    public void setType(TypeVarianceType value) {
        this.type = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVarianceIndicator }
     *     
     */
    public TypeVarianceIndicator getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVarianceIndicator }
     *     
     */
    public void setIndicator(TypeVarianceIndicator value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
