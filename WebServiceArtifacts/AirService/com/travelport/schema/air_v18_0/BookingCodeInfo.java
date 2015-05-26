
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypeCabinClass;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CabinClass" type="{http://www.travelport.com/schema/common_v15_0}typeCabinClass" />
 *       &lt;attribute name="BookingCounts" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "BookingCodeInfo")
public class BookingCodeInfo {

    @XmlAttribute(name = "CabinClass")
    protected TypeCabinClass cabinClass;
    @XmlAttribute(name = "BookingCounts", required = true)
    protected String bookingCounts;

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCabinClass }
     *     
     */
    public TypeCabinClass getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCabinClass }
     *     
     */
    public void setCabinClass(TypeCabinClass value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the bookingCounts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCounts() {
        return bookingCounts;
    }

    /**
     * Sets the value of the bookingCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCounts(String value) {
        this.bookingCounts = value;
    }

}
