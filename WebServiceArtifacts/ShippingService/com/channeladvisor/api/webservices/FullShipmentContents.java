
package com.channeladvisor.api.webservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FullShipmentContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FullShipmentContents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateShippedGMT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CarrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerFulfillmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ShipmentTaxCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InsuranceCost" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullShipmentContents", propOrder = {
    "dateShippedGMT",
    "carrierCode",
    "classCode",
    "trackingNumber",
    "sellerFulfillmentID",
    "shipmentCost",
    "shipmentTaxCost",
    "insuranceCost"
})
public class FullShipmentContents {

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

}
