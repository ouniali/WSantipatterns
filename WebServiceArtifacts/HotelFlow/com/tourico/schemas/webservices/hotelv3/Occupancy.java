
package com.tourico.schemas.webservices.hotelv3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Occupancy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Occupancy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceBreakdown" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfPrice" minOccurs="0"/>
 *         &lt;element name="Rooms" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfRoom" minOccurs="0"/>
 *         &lt;element name="SelctedSupplements" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfSupplement" minOccurs="0"/>
 *         &lt;element name="BoardBases" type="{http://schemas.tourico.com/webservices/hotelv3}ArrayOfBoardbase" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="taxPublish" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="occupPublishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="occupId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="avrNightPublishPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="occupPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="maxChild" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="maxGuests" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="tax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="avrNightPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="bedding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isPublish" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Occupancy", propOrder = {
    "priceBreakdown",
    "rooms",
    "selctedSupplements",
    "boardBases"
})
public class Occupancy {

    @XmlElement(name = "PriceBreakdown")
    protected ArrayOfPrice priceBreakdown;
    @XmlElement(name = "Rooms")
    protected ArrayOfRoom rooms;
    @XmlElement(name = "SelctedSupplements")
    protected ArrayOfSupplement selctedSupplements;
    @XmlElement(name = "BoardBases")
    protected ArrayOfBoardbase boardBases;
    @XmlAttribute(name = "taxPublish")
    protected BigDecimal taxPublish;
    @XmlAttribute(name = "occupPublishPrice")
    protected BigDecimal occupPublishPrice;
    @XmlAttribute(name = "occupId")
    protected String occupId;
    @XmlAttribute(name = "avrNightPublishPrice")
    protected BigDecimal avrNightPublishPrice;
    @XmlAttribute(name = "occupPrice", required = true)
    protected BigDecimal occupPrice;
    @XmlAttribute(name = "maxChild", required = true)
    protected int maxChild;
    @XmlAttribute(name = "maxGuests", required = true)
    protected int maxGuests;
    @XmlAttribute(name = "tax", required = true)
    protected BigDecimal tax;
    @XmlAttribute(name = "avrNightPrice", required = true)
    protected BigDecimal avrNightPrice;
    @XmlAttribute(name = "bedding")
    protected String bedding;
    @XmlAttribute(name = "isPublish", required = true)
    protected boolean isPublish;

    /**
     * Gets the value of the priceBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrice }
     *     
     */
    public ArrayOfPrice getPriceBreakdown() {
        return priceBreakdown;
    }

    /**
     * Sets the value of the priceBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrice }
     *     
     */
    public void setPriceBreakdown(ArrayOfPrice value) {
        this.priceBreakdown = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoom }
     *     
     */
    public ArrayOfRoom getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoom }
     *     
     */
    public void setRooms(ArrayOfRoom value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the selctedSupplements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplement }
     *     
     */
    public ArrayOfSupplement getSelctedSupplements() {
        return selctedSupplements;
    }

    /**
     * Sets the value of the selctedSupplements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplement }
     *     
     */
    public void setSelctedSupplements(ArrayOfSupplement value) {
        this.selctedSupplements = value;
    }

    /**
     * Gets the value of the boardBases property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBoardbase }
     *     
     */
    public ArrayOfBoardbase getBoardBases() {
        return boardBases;
    }

    /**
     * Sets the value of the boardBases property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBoardbase }
     *     
     */
    public void setBoardBases(ArrayOfBoardbase value) {
        this.boardBases = value;
    }

    /**
     * Gets the value of the taxPublish property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxPublish() {
        return taxPublish;
    }

    /**
     * Sets the value of the taxPublish property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxPublish(BigDecimal value) {
        this.taxPublish = value;
    }

    /**
     * Gets the value of the occupPublishPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOccupPublishPrice() {
        return occupPublishPrice;
    }

    /**
     * Sets the value of the occupPublishPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOccupPublishPrice(BigDecimal value) {
        this.occupPublishPrice = value;
    }

    /**
     * Gets the value of the occupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupId() {
        return occupId;
    }

    /**
     * Sets the value of the occupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupId(String value) {
        this.occupId = value;
    }

    /**
     * Gets the value of the avrNightPublishPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvrNightPublishPrice() {
        return avrNightPublishPrice;
    }

    /**
     * Sets the value of the avrNightPublishPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvrNightPublishPrice(BigDecimal value) {
        this.avrNightPublishPrice = value;
    }

    /**
     * Gets the value of the occupPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOccupPrice() {
        return occupPrice;
    }

    /**
     * Sets the value of the occupPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOccupPrice(BigDecimal value) {
        this.occupPrice = value;
    }

    /**
     * Gets the value of the maxChild property.
     * 
     */
    public int getMaxChild() {
        return maxChild;
    }

    /**
     * Sets the value of the maxChild property.
     * 
     */
    public void setMaxChild(int value) {
        this.maxChild = value;
    }

    /**
     * Gets the value of the maxGuests property.
     * 
     */
    public int getMaxGuests() {
        return maxGuests;
    }

    /**
     * Sets the value of the maxGuests property.
     * 
     */
    public void setMaxGuests(int value) {
        this.maxGuests = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTax(BigDecimal value) {
        this.tax = value;
    }

    /**
     * Gets the value of the avrNightPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvrNightPrice() {
        return avrNightPrice;
    }

    /**
     * Sets the value of the avrNightPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvrNightPrice(BigDecimal value) {
        this.avrNightPrice = value;
    }

    /**
     * Gets the value of the bedding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedding() {
        return bedding;
    }

    /**
     * Sets the value of the bedding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedding(String value) {
        this.bedding = value;
    }

    /**
     * Gets the value of the isPublish property.
     * 
     */
    public boolean isIsPublish() {
        return isPublish;
    }

    /**
     * Sets the value of the isPublish property.
     * 
     */
    public void setIsPublish(boolean value) {
        this.isPublish = value;
    }

}
