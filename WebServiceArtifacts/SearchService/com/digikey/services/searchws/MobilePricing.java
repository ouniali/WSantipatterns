
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilePricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilePricing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceBreakItemList" type="{http://services.digikey.com/SearchWS}ArrayOfPriceBreakItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilePricing", propOrder = {
    "priceBreakItemList"
})
public class MobilePricing {

    @XmlElement(name = "PriceBreakItemList")
    protected ArrayOfPriceBreakItem priceBreakItemList;

    /**
     * Gets the value of the priceBreakItemList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceBreakItem }
     *     
     */
    public ArrayOfPriceBreakItem getPriceBreakItemList() {
        return priceBreakItemList;
    }

    /**
     * Sets the value of the priceBreakItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceBreakItem }
     *     
     */
    public void setPriceBreakItemList(ArrayOfPriceBreakItem value) {
        this.priceBreakItemList = value;
    }

}
