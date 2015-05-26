
package com.xignite.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ownershipNature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ownershipNature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="directOrIndirectOwnership" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *         &lt;element name="natureOfOwnership" type="{http://www.xignite.com/services/}value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ownershipNature", propOrder = {
    "directOrIndirectOwnership",
    "natureOfOwnership"
})
public class OwnershipNature {

    protected Value directOrIndirectOwnership;
    protected Value natureOfOwnership;

    /**
     * Gets the value of the directOrIndirectOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getDirectOrIndirectOwnership() {
        return directOrIndirectOwnership;
    }

    /**
     * Sets the value of the directOrIndirectOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setDirectOrIndirectOwnership(Value value) {
        this.directOrIndirectOwnership = value;
    }

    /**
     * Gets the value of the natureOfOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getNatureOfOwnership() {
        return natureOfOwnership;
    }

    /**
     * Sets the value of the natureOfOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setNatureOfOwnership(Value value) {
        this.natureOfOwnership = value;
    }

}
