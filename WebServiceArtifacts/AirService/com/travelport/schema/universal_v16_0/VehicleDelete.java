
package com.travelport.schema.universal_v16_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.TypeElement;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ReservationLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode" />
 *       &lt;attribute name="Element" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeElement" />
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VehicleDelete")
public class VehicleDelete {

    @XmlAttribute(name = "ReservationLocatorCode", required = true)
    protected String reservationLocatorCode;
    @XmlAttribute(name = "Element", required = true)
    protected TypeElement element;
    @XmlAttribute(name = "Key")
    protected String key;

    /**
     * Gets the value of the reservationLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationLocatorCode() {
        return reservationLocatorCode;
    }

    /**
     * Sets the value of the reservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationLocatorCode(String value) {
        this.reservationLocatorCode = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link TypeElement }
     *     
     */
    public TypeElement getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElement }
     *     
     */
    public void setElement(TypeElement value) {
        this.element = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
