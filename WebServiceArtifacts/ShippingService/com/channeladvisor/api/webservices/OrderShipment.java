
package com.channeladvisor.api.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderShipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderShipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClientOrderIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartialShipment" type="{http://api.channeladvisor.com/webservices/}PartialShipmentContents" minOccurs="0"/>
 *         &lt;element name="FullShipment" type="{http://api.channeladvisor.com/webservices/}FullShipmentContents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderShipment", propOrder = {
    "orderID",
    "clientOrderIdentifier",
    "shipmentType",
    "partialShipment",
    "fullShipment"
})
public class OrderShipment {

    @XmlElement(name = "OrderID", required = true, type = Integer.class, nillable = true)
    protected Integer orderID;
    @XmlElement(name = "ClientOrderIdentifier")
    protected String clientOrderIdentifier;
    @XmlElement(name = "ShipmentType")
    protected String shipmentType;
    @XmlElement(name = "PartialShipment")
    protected PartialShipmentContents partialShipment;
    @XmlElement(name = "FullShipment")
    protected FullShipmentContents fullShipment;

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderID(Integer value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the clientOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientOrderIdentifier() {
        return clientOrderIdentifier;
    }

    /**
     * Sets the value of the clientOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientOrderIdentifier(String value) {
        this.clientOrderIdentifier = value;
    }

    /**
     * Gets the value of the shipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentType() {
        return shipmentType;
    }

    /**
     * Sets the value of the shipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentType(String value) {
        this.shipmentType = value;
    }

    /**
     * Gets the value of the partialShipment property.
     * 
     * @return
     *     possible object is
     *     {@link PartialShipmentContents }
     *     
     */
    public PartialShipmentContents getPartialShipment() {
        return partialShipment;
    }

    /**
     * Sets the value of the partialShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialShipmentContents }
     *     
     */
    public void setPartialShipment(PartialShipmentContents value) {
        this.partialShipment = value;
    }

    /**
     * Gets the value of the fullShipment property.
     * 
     * @return
     *     possible object is
     *     {@link FullShipmentContents }
     *     
     */
    public FullShipmentContents getFullShipment() {
        return fullShipment;
    }

    /**
     * Sets the value of the fullShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullShipmentContents }
     *     
     */
    public void setFullShipment(FullShipmentContents value) {
        this.fullShipment = value;
    }

}
