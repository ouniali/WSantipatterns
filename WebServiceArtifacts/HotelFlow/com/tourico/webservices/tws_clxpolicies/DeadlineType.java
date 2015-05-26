
package com.tourico.webservices.tws_clxpolicies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DeadlineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeadlineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AbsoluteDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="OffsetTimeUnit" type="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}TimeUnitType" />
 *       &lt;attribute name="OffsetUnitMultiplier" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="OffsetDropTime" type="{http://tourico.com/webservices/TWS_ClxPolicies.xsd}DeadlineTypeOffsetDropTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeadlineType")
public class DeadlineType {

    @XmlAttribute(name = "AbsoluteDeadline")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar absoluteDeadline;
    @XmlAttribute(name = "OffsetTimeUnit")
    protected TimeUnitType offsetTimeUnit;
    @XmlAttribute(name = "OffsetUnitMultiplier")
    protected Integer offsetUnitMultiplier;
    @XmlAttribute(name = "OffsetDropTime")
    protected DeadlineTypeOffsetDropTime offsetDropTime;

    /**
     * Gets the value of the absoluteDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAbsoluteDeadline() {
        return absoluteDeadline;
    }

    /**
     * Sets the value of the absoluteDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAbsoluteDeadline(XMLGregorianCalendar value) {
        this.absoluteDeadline = value;
    }

    /**
     * Gets the value of the offsetTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnitType }
     *     
     */
    public TimeUnitType getOffsetTimeUnit() {
        return offsetTimeUnit;
    }

    /**
     * Sets the value of the offsetTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnitType }
     *     
     */
    public void setOffsetTimeUnit(TimeUnitType value) {
        this.offsetTimeUnit = value;
    }

    /**
     * Gets the value of the offsetUnitMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffsetUnitMultiplier() {
        return offsetUnitMultiplier;
    }

    /**
     * Sets the value of the offsetUnitMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffsetUnitMultiplier(Integer value) {
        this.offsetUnitMultiplier = value;
    }

    /**
     * Gets the value of the offsetDropTime property.
     * 
     * @return
     *     possible object is
     *     {@link DeadlineTypeOffsetDropTime }
     *     
     */
    public DeadlineTypeOffsetDropTime getOffsetDropTime() {
        return offsetDropTime;
    }

    /**
     * Sets the value of the offsetDropTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadlineTypeOffsetDropTime }
     *     
     */
    public void setOffsetDropTime(DeadlineTypeOffsetDropTime value) {
        this.offsetDropTime = value;
    }

}
