
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseProductInfoAllPricingCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseProductInfoAllPricingCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductList" type="{http://services.digikey.com/SearchWS}ArrayOfBaseProductInfoAllPricing" minOccurs="0"/>
 *         &lt;element name="RecordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseProductInfoAllPricingCollection", propOrder = {
    "productList",
    "recordCount"
})
@XmlSeeAlso({
    BaseProductInfoAllPricingCollectionInt.class
})
public class BaseProductInfoAllPricingCollection {

    @XmlElement(name = "ProductList")
    protected ArrayOfBaseProductInfoAllPricing productList;
    @XmlElement(name = "RecordCount")
    protected int recordCount;

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseProductInfoAllPricing }
     *     
     */
    public ArrayOfBaseProductInfoAllPricing getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseProductInfoAllPricing }
     *     
     */
    public void setProductList(ArrayOfBaseProductInfoAllPricing value) {
        this.productList = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     */
    public int getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     */
    public void setRecordCount(int value) {
        this.recordCount = value;
    }

}
