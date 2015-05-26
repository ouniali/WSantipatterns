
package com.channeladvisor.api.webservices;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartialShipmentContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartialShipmentContents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineItemList" type="{http://api.channeladvisor.com/webservices/}LineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DateShippedGMT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerFulfillmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ShipmentTaxCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InsuranceCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "PartialShipmentContents", propOrder = {
    "lineItemList",
    "dateShippedGMT",
    "carrierCode",
    "classCode",
    "trackingNumber",
    "sellerFulfillmentID",
    "shipmentCost",
    "shipmentTaxCost",
    "insuranceCost",
    "fulfillmentType",
    "fulfillmentStatus"
})
public class PartialShipmentContents {

    @XmlElement(name = "LineItemList", nillable = true)
    protected List<LineItem> lineItemList;
    @XmlElement(name = "DateShippedGMT", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateShippedGMT;
    @XmlElement(name = "CarrierCode")
    protected String carrierCode;
    @XmlElement(name = "ClassCode")
    protected String classCode;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "SellerFulfillmentID")
    protected String sellerFulfillmentID;
    @XmlElement(name = "ShipmentCost", required = true, nillable = true)
    protected BigDecimal shipmentCost;
    @XmlElement(name = "ShipmentTaxCost", required = true, nillable = true)
    protected BigDecimal shipmentTaxCost;
    @XmlElement(name = "InsuranceCost", required = true, nillable = true)
    protected BigDecimal insuranceCost;
    @XmlElement(name = "FulfillmentType")
    protected String fulfillmentType;
    @XmlElement(name = "FulfillmentStatus")
    protected String fulfillmentStatus;

    /**
     * Gets the value of the lineItemList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItem }
     * 
     * 
     */
    public List<LineItem> getLineItemList() {
        if (lineItemList == null) {
            lineItemList = new ArrayList<LineItem>();
        }
        return this.lineItemList;
    }

    /**
     * Gets the value of the dateShippedGMT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateShippedGMT() {
        return dateShippedGMT;
    }

    /**
     * Sets the value of the dateShippedGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateShippedGMT(XMLGregorianCalendar value) {
        this.dateShippedGMT = value;
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
     * Gets the value of the insuranceCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Sets the value of the insuranceCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuranceCost(BigDecimal value) {
        this.insuranceCost = value;
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
