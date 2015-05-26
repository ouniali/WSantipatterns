
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseProductInfoAllPricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseProductInfoAllPricing">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.digikey.com/SearchWS}BaseProductInfoPricing">
 *       &lt;sequence>
 *         &lt;element name="CatalogPricing" type="{http://services.digikey.com/SearchWS}ArrayOfPriceBreak" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseProductInfoAllPricing", propOrder = {
    "catalogPricing"
})
public class BaseProductInfoAllPricing
    extends BaseProductInfoPricing
{

    @XmlElement(name = "CatalogPricing")
    protected ArrayOfPriceBreak catalogPricing;

    /**
     * Gets the value of the catalogPricing property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPriceBreak }
     *     
     */
    public ArrayOfPriceBreak getCatalogPricing() {
        return catalogPricing;
    }

    /**
     * Sets the value of the catalogPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPriceBreak }
     *     
     */
    public void setCatalogPricing(ArrayOfPriceBreak value) {
        this.catalogPricing = value;
    }

}
