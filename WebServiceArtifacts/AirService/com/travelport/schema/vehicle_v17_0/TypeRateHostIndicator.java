
package com.travelport.schema.vehicle_v17_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Host-specific info for vendors
 * 
 * <p>Java class for typeRateHostIndicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeRateHostIndicator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="InventoryToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RateToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeRateHostIndicator")
public class TypeRateHostIndicator {

    @XmlAttribute(name = "InventoryToken")
    protected String inventoryToken;
    @XmlAttribute(name = "RateToken")
    protected String rateToken;

    /**
     * Gets the value of the inventoryToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryToken() {
        return inventoryToken;
    }

    /**
     * Sets the value of the inventoryToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryToken(String value) {
        this.inventoryToken = value;
    }

    /**
     * Gets the value of the rateToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateToken() {
        return rateToken;
    }

    /**
     * Sets the value of the rateToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateToken(String value) {
        this.rateToken = value;
    }

}
