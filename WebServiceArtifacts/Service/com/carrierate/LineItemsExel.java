
package com.carrierate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemsExel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemsExel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FAKClass" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ItemWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ItemHeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ItemLength" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ItemWidth" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PackageTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ItemNmfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hazardous" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Pieces" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PieceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PalletCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LineItemId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Revenue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemsExel", propOrder = {
    "fakClass",
    "itemWeight",
    "itemHeight",
    "itemLength",
    "itemWidth",
    "packageTypeName",
    "packageTypeId",
    "productId",
    "itemNmfc",
    "hazardous",
    "pieces",
    "pieceDescription",
    "palletCount",
    "lineItemId",
    "cost",
    "revenue"
})
public class LineItemsExel {

    @XmlElement(name = "FAKClass")
    protected int fakClass;
    @XmlElement(name = "ItemWeight")
    protected int itemWeight;
    @XmlElement(name = "ItemHeight")
    protected double itemHeight;
    @XmlElement(name = "ItemLength")
    protected double itemLength;
    @XmlElement(name = "ItemWidth")
    protected double itemWidth;
    @XmlElement(name = "PackageTypeName")
    protected String packageTypeName;
    @XmlElement(name = "PackageTypeId")
    protected int packageTypeId;
    @XmlElement(name = "ProductId")
    protected int productId;
    @XmlElement(name = "ItemNmfc")
    protected String itemNmfc;
    @XmlElement(name = "Hazardous")
    protected boolean hazardous;
    @XmlElement(name = "Pieces")
    protected int pieces;
    @XmlElement(name = "PieceDescription")
    protected String pieceDescription;
    @XmlElement(name = "PalletCount")
    protected int palletCount;
    @XmlElement(name = "LineItemId")
    protected int lineItemId;
    @XmlElement(name = "Cost")
    protected double cost;
    @XmlElement(name = "Revenue")
    protected double revenue;

    /**
     * Gets the value of the fakClass property.
     * 
     */
    public int getFAKClass() {
        return fakClass;
    }

    /**
     * Sets the value of the fakClass property.
     * 
     */
    public void setFAKClass(int value) {
        this.fakClass = value;
    }

    /**
     * Gets the value of the itemWeight property.
     * 
     */
    public int getItemWeight() {
        return itemWeight;
    }

    /**
     * Sets the value of the itemWeight property.
     * 
     */
    public void setItemWeight(int value) {
        this.itemWeight = value;
    }

    /**
     * Gets the value of the itemHeight property.
     * 
     */
    public double getItemHeight() {
        return itemHeight;
    }

    /**
     * Sets the value of the itemHeight property.
     * 
     */
    public void setItemHeight(double value) {
        this.itemHeight = value;
    }

    /**
     * Gets the value of the itemLength property.
     * 
     */
    public double getItemLength() {
        return itemLength;
    }

    /**
     * Sets the value of the itemLength property.
     * 
     */
    public void setItemLength(double value) {
        this.itemLength = value;
    }

    /**
     * Gets the value of the itemWidth property.
     * 
     */
    public double getItemWidth() {
        return itemWidth;
    }

    /**
     * Sets the value of the itemWidth property.
     * 
     */
    public void setItemWidth(double value) {
        this.itemWidth = value;
    }

    /**
     * Gets the value of the packageTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTypeName() {
        return packageTypeName;
    }

    /**
     * Sets the value of the packageTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTypeName(String value) {
        this.packageTypeName = value;
    }

    /**
     * Gets the value of the packageTypeId property.
     * 
     */
    public int getPackageTypeId() {
        return packageTypeId;
    }

    /**
     * Sets the value of the packageTypeId property.
     * 
     */
    public void setPackageTypeId(int value) {
        this.packageTypeId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(int value) {
        this.productId = value;
    }

    /**
     * Gets the value of the itemNmfc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNmfc() {
        return itemNmfc;
    }

    /**
     * Sets the value of the itemNmfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNmfc(String value) {
        this.itemNmfc = value;
    }

    /**
     * Gets the value of the hazardous property.
     * 
     */
    public boolean isHazardous() {
        return hazardous;
    }

    /**
     * Sets the value of the hazardous property.
     * 
     */
    public void setHazardous(boolean value) {
        this.hazardous = value;
    }

    /**
     * Gets the value of the pieces property.
     * 
     */
    public int getPieces() {
        return pieces;
    }

    /**
     * Sets the value of the pieces property.
     * 
     */
    public void setPieces(int value) {
        this.pieces = value;
    }

    /**
     * Gets the value of the pieceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieceDescription() {
        return pieceDescription;
    }

    /**
     * Sets the value of the pieceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieceDescription(String value) {
        this.pieceDescription = value;
    }

    /**
     * Gets the value of the palletCount property.
     * 
     */
    public int getPalletCount() {
        return palletCount;
    }

    /**
     * Sets the value of the palletCount property.
     * 
     */
    public void setPalletCount(int value) {
        this.palletCount = value;
    }

    /**
     * Gets the value of the lineItemId property.
     * 
     */
    public int getLineItemId() {
        return lineItemId;
    }

    /**
     * Sets the value of the lineItemId property.
     * 
     */
    public void setLineItemId(int value) {
        this.lineItemId = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     */
    public double getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     */
    public void setCost(double value) {
        this.cost = value;
    }

    /**
     * Gets the value of the revenue property.
     * 
     */
    public double getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     */
    public void setRevenue(double value) {
        this.revenue = value;
    }

}
