
package com.digikey.services.searchws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoryCollection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryList" type="{http://services.digikey.com/SearchWS}ArrayOfCategory" minOccurs="0"/>
 *         &lt;element name="RecordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductList" type="{http://services.digikey.com/SearchWS}ArrayOfBaseProductInfoPricing" minOccurs="0"/>
 *         &lt;element name="ParameterList" type="{http://services.digikey.com/SearchWS}ArrayOfParameter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryCollection", propOrder = {
    "currency",
    "categoryList",
    "recordCount",
    "productList",
    "parameterList"
})
public class CategoryCollection {

    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "CategoryList")
    protected ArrayOfCategory categoryList;
    @XmlElement(name = "RecordCount")
    protected int recordCount;
    @XmlElement(name = "ProductList")
    protected ArrayOfBaseProductInfoPricing productList;
    @XmlElement(name = "ParameterList")
    protected ArrayOfParameter parameterList;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the categoryList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategory }
     *     
     */
    public ArrayOfCategory getCategoryList() {
        return categoryList;
    }

    /**
     * Sets the value of the categoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategory }
     *     
     */
    public void setCategoryList(ArrayOfCategory value) {
        this.categoryList = value;
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

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseProductInfoPricing }
     *     
     */
    public ArrayOfBaseProductInfoPricing getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseProductInfoPricing }
     *     
     */
    public void setProductList(ArrayOfBaseProductInfoPricing value) {
        this.productList = value;
    }

    /**
     * Gets the value of the parameterList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParameter }
     *     
     */
    public ArrayOfParameter getParameterList() {
        return parameterList;
    }

    /**
     * Sets the value of the parameterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParameter }
     *     
     */
    public void setParameterList(ArrayOfParameter value) {
        this.parameterList = value;
    }

}
