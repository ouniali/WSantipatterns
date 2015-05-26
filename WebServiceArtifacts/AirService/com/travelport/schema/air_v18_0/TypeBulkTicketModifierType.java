
package com.travelport.schema.air_v18_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Bulk ticketing modifier type.
 * 			
 * 
 * <p>Java class for typeBulkTicketModifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeBulkTicketModifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SuppressOnFareCalc" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeBulkTicketModifierType")
@XmlSeeAlso({
    com.travelport.schema.air_v18_0.TicketingModifiers.BulkTicket.class
})
public class TypeBulkTicketModifierType {

    @XmlAttribute(name = "SuppressOnFareCalc")
    protected Boolean suppressOnFareCalc;

    /**
     * Gets the value of the suppressOnFareCalc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressOnFareCalc() {
        return suppressOnFareCalc;
    }

    /**
     * Sets the value of the suppressOnFareCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressOnFareCalc(Boolean value) {
        this.suppressOnFareCalc = value;
    }

}
