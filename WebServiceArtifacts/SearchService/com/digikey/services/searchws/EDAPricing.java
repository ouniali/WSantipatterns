
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EDAPricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDAPricing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceBreakList" type="{http://services.digikey.com/SearchWS}ArrayOfPriceBreak" minOccurs="0"/>
 *         &lt;element name="DiscountedPriceBreakList" type="{http://services.digikey.com/SearchWS}ArrayOfPriceBreak" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDAPricing", propOrder = {
    "priceBreakList",
    "discountedPriceBreakList"
})
@XmlSeeAlso({
    PriceBreakItem.class
})
public class EDAPricing {

    @XmlElement(name = "PriceBreakList")
    protected ArrayOfPriceBreak priceBreakList;
    @XmlElement(name = "DiscountedPriceBreakList")
    protected ArrayOfPriceBreak discountedPriceBreakList;

    /**
     * Gets the value of the priceBreakList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceBreak }
     *     
     */
    public ArrayOfPriceBreak getPriceBreakList() {
        return priceBreakList;
    }

    /**
     * Sets the value of the priceBreakList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceBreak }
     *     
     */
    public void setPriceBreakList(ArrayOfPriceBreak value) {
        this.priceBreakList = value;
    }

    /**
     * Gets the value of the discountedPriceBreakList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceBreak }
     *     
     */
    public ArrayOfPriceBreak getDiscountedPriceBreakList() {
        return discountedPriceBreakList;
    }

    /**
     * Sets the value of the discountedPriceBreakList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceBreak }
     *     
     */
    public void setDiscountedPriceBreakList(ArrayOfPriceBreak value) {
        this.discountedPriceBreakList = value;
    }

}
