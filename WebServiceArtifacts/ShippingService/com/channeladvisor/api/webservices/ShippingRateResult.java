
package com.channeladvisor.api.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingRateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingRateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingDetailList" type="{http://api.channeladvisor.com/webservices/}ArrayOfShippingItemBase" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingRateResult", propOrder = {
    "shippingDetailList"
})
public class ShippingRateResult {

    @XmlElement(name = "ShippingDetailList")
    protected ArrayOfShippingItemBase shippingDetailList;

    /**
     * Gets the value of the shippingDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShippingItemBase }
     *     
     */
    public ArrayOfShippingItemBase getShippingDetailList() {
        return shippingDetailList;
    }

    /**
     * Sets the value of the shippingDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShippingItemBase }
     *     
     */
    public void setShippingDetailList(ArrayOfShippingItemBase value) {
        this.shippingDetailList = value;
    }

}
