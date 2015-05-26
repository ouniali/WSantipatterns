
package com.v3leisure.schemas.cabs._1_0.cabs_common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CA_ResponseInclusionsRQType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CA_ResponseInclusionsRQType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="product_calendar" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CA_ResponseInclusionsRQType")
public class CAResponseInclusionsRQType {

    @XmlAttribute(name = "product_calendar", required = true)
    protected boolean productCalendar;

    /**
     * Gets the value of the productCalendar property.
     * 
     */
    public boolean isProductCalendar() {
        return productCalendar;
    }

    /**
     * Sets the value of the productCalendar property.
     * 
     */
    public void setProductCalendar(boolean value) {
        this.productCalendar = value;
    }

}
