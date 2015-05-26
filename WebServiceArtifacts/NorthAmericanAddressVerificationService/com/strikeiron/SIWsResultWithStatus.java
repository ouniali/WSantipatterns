
package com.strikeiron;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIWsResultWithStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIWsResultWithStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemStatus" type="{http://www.strikeiron.com}SIWsStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIWsResultWithStatus", propOrder = {
    "itemStatus"
})
@XmlSeeAlso({
    NorthAmericanAddressWithStatus.class,
    AddressDistanceResultWithStatus.class
})
public abstract class SIWsResultWithStatus {

    @XmlElement(name = "ItemStatus")
    protected SIWsStatus itemStatus;

    /**
     * Gets the value of the itemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SIWsStatus }
     *     
     */
    public SIWsStatus getItemStatus() {
        return itemStatus;
    }

    /**
     * Sets the value of the itemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIWsStatus }
     *     
     */
    public void setItemStatus(SIWsStatus value) {
        this.itemStatus = value;
    }

}
