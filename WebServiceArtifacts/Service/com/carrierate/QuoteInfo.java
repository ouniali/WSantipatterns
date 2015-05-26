
package com.carrierate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QuoteInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipperUserNameWithCarrierRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipperPasswordWithCarrierRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentRequestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ShipmentOriginZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentDestinationZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentPickupService" type="{http://carrierate.com/}PickupTypes"/>
 *         &lt;element name="ShipmentDropoffService" type="{http://carrierate.com/}DropoffTypes"/>
 *         &lt;element name="ShipmentExtraService" type="{http://carrierate.com/}ExtraServices"/>
 *         &lt;element name="IsTradeShow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsSortnSegregate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsInsidePickup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsExtremeLength" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExtremeLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExtremeLengthBundleCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isInsuranceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isNewItem" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RequiredInsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NonCommercialDeliveryType" type="{http://carrierate.com/}NonCommercialDeliveryTypes"/>
 *         &lt;element name="IsProtectFromFreeze" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteInfo", propOrder = {
    "shipperUserNameWithCarrierRate",
    "shipperPasswordWithCarrierRate",
    "shipmentRequestDate",
    "shipmentOriginZip",
    "shipmentDestinationZip",
    "shipmentPickupService",
    "shipmentDropoffService",
    "shipmentExtraService",
    "isTradeShow",
    "isSortnSegregate",
    "isInsidePickup",
    "isExtremeLength",
    "extremeLength",
    "extremeLengthBundleCount",
    "isInsuranceRequired",
    "isNewItem",
    "requiredInsuranceAmount",
    "nonCommercialDeliveryType",
    "isProtectFromFreeze"
})
public class QuoteInfo {

    @XmlElement(name = "ShipperUserNameWithCarrierRate")
    protected String shipperUserNameWithCarrierRate;
    @XmlElement(name = "ShipperPasswordWithCarrierRate")
    protected String shipperPasswordWithCarrierRate;
    @XmlElement(name = "ShipmentRequestDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipmentRequestDate;
    @XmlElement(name = "ShipmentOriginZip")
    protected String shipmentOriginZip;
    @XmlElement(name = "ShipmentDestinationZip")
    protected String shipmentDestinationZip;
    @XmlElement(name = "ShipmentPickupService", required = true)
    @XmlSchemaType(name = "string")
    protected PickupTypes shipmentPickupService;
    @XmlElement(name = "ShipmentDropoffService", required = true)
    @XmlSchemaType(name = "string")
    protected DropoffTypes shipmentDropoffService;
    @XmlElement(name = "ShipmentExtraService", required = true)
    @XmlSchemaType(name = "string")
    protected ExtraServices shipmentExtraService;
    @XmlElement(name = "IsTradeShow")
    protected boolean isTradeShow;
    @XmlElement(name = "IsSortnSegregate")
    protected boolean isSortnSegregate;
    @XmlElement(name = "IsInsidePickup")
    protected boolean isInsidePickup;
    @XmlElement(name = "IsExtremeLength")
    protected boolean isExtremeLength;
    @XmlElement(name = "ExtremeLength")
    protected int extremeLength;
    @XmlElement(name = "ExtremeLengthBundleCount")
    protected int extremeLengthBundleCount;
    protected boolean isInsuranceRequired;
    protected boolean isNewItem;
    @XmlElement(name = "RequiredInsuranceAmount")
    protected double requiredInsuranceAmount;
    @XmlElement(name = "NonCommercialDeliveryType", required = true)
    @XmlSchemaType(name = "string")
    protected NonCommercialDeliveryTypes nonCommercialDeliveryType;
    @XmlElement(name = "IsProtectFromFreeze")
    protected boolean isProtectFromFreeze;

    /**
     * Gets the value of the shipperUserNameWithCarrierRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperUserNameWithCarrierRate() {
        return shipperUserNameWithCarrierRate;
    }

    /**
     * Sets the value of the shipperUserNameWithCarrierRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperUserNameWithCarrierRate(String value) {
        this.shipperUserNameWithCarrierRate = value;
    }

    /**
     * Gets the value of the shipperPasswordWithCarrierRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipperPasswordWithCarrierRate() {
        return shipperPasswordWithCarrierRate;
    }

    /**
     * Sets the value of the shipperPasswordWithCarrierRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipperPasswordWithCarrierRate(String value) {
        this.shipperPasswordWithCarrierRate = value;
    }

    /**
     * Gets the value of the shipmentRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipmentRequestDate() {
        return shipmentRequestDate;
    }

    /**
     * Sets the value of the shipmentRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipmentRequestDate(XMLGregorianCalendar value) {
        this.shipmentRequestDate = value;
    }

    /**
     * Gets the value of the shipmentOriginZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentOriginZip() {
        return shipmentOriginZip;
    }

    /**
     * Sets the value of the shipmentOriginZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentOriginZip(String value) {
        this.shipmentOriginZip = value;
    }

    /**
     * Gets the value of the shipmentDestinationZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentDestinationZip() {
        return shipmentDestinationZip;
    }

    /**
     * Sets the value of the shipmentDestinationZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentDestinationZip(String value) {
        this.shipmentDestinationZip = value;
    }

    /**
     * Gets the value of the shipmentPickupService property.
     * 
     * @return
     *     possible object is
     *     {@link PickupTypes }
     *     
     */
    public PickupTypes getShipmentPickupService() {
        return shipmentPickupService;
    }

    /**
     * Sets the value of the shipmentPickupService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupTypes }
     *     
     */
    public void setShipmentPickupService(PickupTypes value) {
        this.shipmentPickupService = value;
    }

    /**
     * Gets the value of the shipmentDropoffService property.
     * 
     * @return
     *     possible object is
     *     {@link DropoffTypes }
     *     
     */
    public DropoffTypes getShipmentDropoffService() {
        return shipmentDropoffService;
    }

    /**
     * Sets the value of the shipmentDropoffService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropoffTypes }
     *     
     */
    public void setShipmentDropoffService(DropoffTypes value) {
        this.shipmentDropoffService = value;
    }

    /**
     * Gets the value of the shipmentExtraService property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraServices }
     *     
     */
    public ExtraServices getShipmentExtraService() {
        return shipmentExtraService;
    }

    /**
     * Sets the value of the shipmentExtraService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraServices }
     *     
     */
    public void setShipmentExtraService(ExtraServices value) {
        this.shipmentExtraService = value;
    }

    /**
     * Gets the value of the isTradeShow property.
     * 
     */
    public boolean isIsTradeShow() {
        return isTradeShow;
    }

    /**
     * Sets the value of the isTradeShow property.
     * 
     */
    public void setIsTradeShow(boolean value) {
        this.isTradeShow = value;
    }

    /**
     * Gets the value of the isSortnSegregate property.
     * 
     */
    public boolean isIsSortnSegregate() {
        return isSortnSegregate;
    }

    /**
     * Sets the value of the isSortnSegregate property.
     * 
     */
    public void setIsSortnSegregate(boolean value) {
        this.isSortnSegregate = value;
    }

    /**
     * Gets the value of the isInsidePickup property.
     * 
     */
    public boolean isIsInsidePickup() {
        return isInsidePickup;
    }

    /**
     * Sets the value of the isInsidePickup property.
     * 
     */
    public void setIsInsidePickup(boolean value) {
        this.isInsidePickup = value;
    }

    /**
     * Gets the value of the isExtremeLength property.
     * 
     */
    public boolean isIsExtremeLength() {
        return isExtremeLength;
    }

    /**
     * Sets the value of the isExtremeLength property.
     * 
     */
    public void setIsExtremeLength(boolean value) {
        this.isExtremeLength = value;
    }

    /**
     * Gets the value of the extremeLength property.
     * 
     */
    public int getExtremeLength() {
        return extremeLength;
    }

    /**
     * Sets the value of the extremeLength property.
     * 
     */
    public void setExtremeLength(int value) {
        this.extremeLength = value;
    }

    /**
     * Gets the value of the extremeLengthBundleCount property.
     * 
     */
    public int getExtremeLengthBundleCount() {
        return extremeLengthBundleCount;
    }

    /**
     * Sets the value of the extremeLengthBundleCount property.
     * 
     */
    public void setExtremeLengthBundleCount(int value) {
        this.extremeLengthBundleCount = value;
    }

    /**
     * Gets the value of the isInsuranceRequired property.
     * 
     */
    public boolean isIsInsuranceRequired() {
        return isInsuranceRequired;
    }

    /**
     * Sets the value of the isInsuranceRequired property.
     * 
     */
    public void setIsInsuranceRequired(boolean value) {
        this.isInsuranceRequired = value;
    }

    /**
     * Gets the value of the isNewItem property.
     * 
     */
    public boolean isIsNewItem() {
        return isNewItem;
    }

    /**
     * Sets the value of the isNewItem property.
     * 
     */
    public void setIsNewItem(boolean value) {
        this.isNewItem = value;
    }

    /**
     * Gets the value of the requiredInsuranceAmount property.
     * 
     */
    public double getRequiredInsuranceAmount() {
        return requiredInsuranceAmount;
    }

    /**
     * Sets the value of the requiredInsuranceAmount property.
     * 
     */
    public void setRequiredInsuranceAmount(double value) {
        this.requiredInsuranceAmount = value;
    }

    /**
     * Gets the value of the nonCommercialDeliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link NonCommercialDeliveryTypes }
     *     
     */
    public NonCommercialDeliveryTypes getNonCommercialDeliveryType() {
        return nonCommercialDeliveryType;
    }

    /**
     * Sets the value of the nonCommercialDeliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonCommercialDeliveryTypes }
     *     
     */
    public void setNonCommercialDeliveryType(NonCommercialDeliveryTypes value) {
        this.nonCommercialDeliveryType = value;
    }

    /**
     * Gets the value of the isProtectFromFreeze property.
     * 
     */
    public boolean isIsProtectFromFreeze() {
        return isProtectFromFreeze;
    }

    /**
     * Sets the value of the isProtectFromFreeze property.
     * 
     */
    public void setIsProtectFromFreeze(boolean value) {
        this.isProtectFromFreeze = value;
    }

}
