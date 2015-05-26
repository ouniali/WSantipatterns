
package com.channeladvisor.api.datacontracts.shippingservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderShipmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderShipmentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipmentDateGMT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DistributionCenterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ShipmentTaxCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ShipmentInsuranceCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SellerFulfillmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentLineItems" type="{http://api.channeladvisor.com/datacontracts/ShippingService}ArrayOfShipmentLineItemResponse" minOccurs="0"/>
 *         &lt;element name="FulfillmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FulfillmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderShipmentResponse", propOrder = {
    "shipmentDateGMT",
    "carrierCode",
    "classCode",
    "trackingNumber",
    "distributionCenterCode",
    "shipmentCost",
    "shipmentTaxCost",
    "shipmentInsuranceCost",
    "sellerFulfillmentID",
    "shipmentLineItems",
    "fulfillmentType",
    "fulfillmentStatus"
})
public class OrderShipmentResponse {

    @XmlElement(name = "ShipmentDateGMT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipmentDateGMT;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "ClassCode")
    protected String classCode;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "DistributionCenterCode")
    protected String distributionCenterCode;
    @XmlElement(name = "ShipmentCost", required = true)
    protected BigDecimal shipmentCost;
    @XmlElement(name = "ShipmentTaxCost", required = true)
    protected BigDecimal shipmentTaxCost;
    @XmlElement(name = "ShipmentInsuranceCost", required = true)
    protected BigDecimal shipmentInsuranceCost;
    @XmlElement(name = "SellerFulfillmentID")
    protected String sellerFulfillmentID;
    @XmlElement(name = "ShipmentLineItems")
    protected ArrayOfShipmentLineItemResponse shipmentLineItems;
    @XmlElement(name = "FulfillmentType")
    protected String fulfillmentType;
    @XmlElement(name = "FulfillmentStatus")
    protected String fulfillmentStatus;

    /**
     * Gets the value of the shipmentDateGMT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipmentDateGMT() {
        return shipmentDateGMT;
    }

    /**
     * Sets the value of the shipmentDateGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipmentDateGMT(XMLGregorianCalendar value) {
        this.shipmentDateGMT = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the trackingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Sets the value of the trackingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Gets the value of the distributionCenterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionCenterCode() {
        return distributionCenterCode;
    }

    /**
     * Sets the value of the distributionCenterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionCenterCode(String value) {
        this.distributionCenterCode = value;
    }

    /**
     * Gets the value of the shipmentCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShipmentCost() {
        return shipmentCost;
    }

    /**
     * Sets the value of the shipmentCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShipmentCost(BigDecimal value) {
        this.shipmentCost = value;
    }

    /**
     * Gets the value of the shipmentTaxCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShipmentTaxCost() {
        return shipmentTaxCost;
    }

    /**
     * Sets the value of the shipmentTaxCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShipmentTaxCost(BigDecimal value) {
        this.shipmentTaxCost = value;
    }

    /**
     * Gets the value of the shipmentInsuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShipmentInsuranceCost() {
        return shipmentInsuranceCost;
    }

    /**
     * Sets the value of the shipmentInsuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShipmentInsuranceCost(BigDecimal value) {
        this.shipmentInsuranceCost = value;
    }

    /**
     * Gets the value of the sellerFulfillmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerFulfillmentID() {
        return sellerFulfillmentID;
    }

    /**
     * Sets the value of the sellerFulfillmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerFulfillmentID(String value) {
        this.sellerFulfillmentID = value;
    }

    /**
     * Gets the value of the shipmentLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfShipmentLineItemResponse }
     *     
     */
    public ArrayOfShipmentLineItemResponse getShipmentLineItems() {
        return shipmentLineItems;
    }

    /**
     * Sets the value of the shipmentLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfShipmentLineItemResponse }
     *     
     */
    public void setShipmentLineItems(ArrayOfShipmentLineItemResponse value) {
        this.shipmentLineItems = value;
    }

    /**
     * Gets the value of the fulfillmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentType() {
        return fulfillmentType;
    }

    /**
     * Sets the value of the fulfillmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentType(String value) {
        this.fulfillmentType = value;
    }

    /**
     * Gets the value of the fulfillmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    /**
     * Sets the value of the fulfillmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentStatus(String value) {
        this.fulfillmentStatus = value;
    }

}
