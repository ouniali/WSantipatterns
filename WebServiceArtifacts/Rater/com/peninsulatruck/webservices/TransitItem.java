
package com.peninsulatruck.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransitItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransitItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pickupDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitItem", propOrder = {
    "pickupDay",
    "deliveryDay"
})
public class TransitItem {

    protected String pickupDay;
    protected String deliveryDay;

    /**
     * Gets the value of the pickupDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupDay() {
        return pickupDay;
    }

    /**
     * Sets the value of the pickupDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupDay(String value) {
        this.pickupDay = value;
    }

    /**
     * Gets the value of the deliveryDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDay() {
        return deliveryDay;
    }

    /**
     * Sets the value of the deliveryDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDay(String value) {
        this.deliveryDay = value;
    }

}
