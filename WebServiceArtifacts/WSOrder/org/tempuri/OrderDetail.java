
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductQty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ProductPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ProductLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDetail", propOrder = {
    "productSKU",
    "productQty",
    "productWeight",
    "productPrice",
    "productLink",
    "productBrand",
    "productSize",
    "productColor",
    "productCountry",
    "productDesc",
    "productStatus",
    "trackingURL",
    "comments"
})
public class OrderDetail {

    @XmlElement(name = "ProductSKU")
    protected String productSKU;
    @XmlElement(name = "ProductQty")
    protected int productQty;
    @XmlElement(name = "ProductWeight")
    protected double productWeight;
    @XmlElement(name = "ProductPrice")
    protected double productPrice;
    @XmlElement(name = "ProductLink")
    protected String productLink;
    @XmlElement(name = "ProductBrand")
    protected String productBrand;
    @XmlElement(name = "ProductSize")
    protected String productSize;
    @XmlElement(name = "ProductColor")
    protected String productColor;
    @XmlElement(name = "ProductCountry")
    protected String productCountry;
    @XmlElement(name = "ProductDesc")
    protected String productDesc;
    @XmlElement(name = "ProductStatus")
    protected String productStatus;
    @XmlElement(name = "TrackingURL")
    protected String trackingURL;
    @XmlElement(name = "Comments")
    protected String comments;

    /**
     * Gets the value of the productSKU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSKU() {
        return productSKU;
    }

    /**
     * Sets the value of the productSKU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSKU(String value) {
        this.productSKU = value;
    }

    /**
     * Gets the value of the productQty property.
     * 
     */
    public int getProductQty() {
        return productQty;
    }

    /**
     * Sets the value of the productQty property.
     * 
     */
    public void setProductQty(int value) {
        this.productQty = value;
    }

    /**
     * Gets the value of the productWeight property.
     * 
     */
    public double getProductWeight() {
        return productWeight;
    }

    /**
     * Sets the value of the productWeight property.
     * 
     */
    public void setProductWeight(double value) {
        this.productWeight = value;
    }

    /**
     * Gets the value of the productPrice property.
     * 
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the value of the productPrice property.
     * 
     */
    public void setProductPrice(double value) {
        this.productPrice = value;
    }

    /**
     * Gets the value of the productLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLink() {
        return productLink;
    }

    /**
     * Sets the value of the productLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLink(String value) {
        this.productLink = value;
    }

    /**
     * Gets the value of the productBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * Sets the value of the productBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductBrand(String value) {
        this.productBrand = value;
    }

    /**
     * Gets the value of the productSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSize() {
        return productSize;
    }

    /**
     * Sets the value of the productSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSize(String value) {
        this.productSize = value;
    }

    /**
     * Gets the value of the productColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductColor() {
        return productColor;
    }

    /**
     * Sets the value of the productColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductColor(String value) {
        this.productColor = value;
    }

    /**
     * Gets the value of the productCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCountry() {
        return productCountry;
    }

    /**
     * Sets the value of the productCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCountry(String value) {
        this.productCountry = value;
    }

    /**
     * Gets the value of the productDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * Sets the value of the productDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDesc(String value) {
        this.productDesc = value;
    }

    /**
     * Gets the value of the productStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * Sets the value of the productStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStatus(String value) {
        this.productStatus = value;
    }

    /**
     * Gets the value of the trackingURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingURL() {
        return trackingURL;
    }

    /**
     * Sets the value of the trackingURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingURL(String value) {
        this.trackingURL = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
