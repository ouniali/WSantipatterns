
package com.channeladvisor.api.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfShippingItemBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfShippingItemBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingItemBase" type="{http://api.channeladvisor.com/webservices/}ShippingItemBase" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShippingItemBase", propOrder = {
    "shippingItemBase"
})
public class ArrayOfShippingItemBase {

    @XmlElement(name = "ShippingItemBase", nillable = true)
    protected List<ShippingItemBase> shippingItemBase;

    /**
     * Gets the value of the shippingItemBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingItemBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingItemBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingItemBase }
     * 
     * 
     */
    public List<ShippingItemBase> getShippingItemBase() {
        if (shippingItemBase == null) {
            shippingItemBase = new ArrayList<ShippingItemBase>();
        }
        return this.shippingItemBase;
    }

}
