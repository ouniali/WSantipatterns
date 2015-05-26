
package com.channeladvisor.api.datacontracts.shippingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderShipmentHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderShipmentHistoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClientOrderIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingStatusUpdateDateGMT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrderShipments" type="{http://api.channeladvisor.com/datacontracts/ShippingService}ArrayOfOrderShipmentResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderShipmentHistoryResponse", propOrder = {
    "orderID",
    "clientOrderIdentifier",
    "shippingStatus",
    "shippingStatusUpdateDateGMT",
    "orderShipments"
})
public class OrderShipmentHistoryResponse {

    @XmlElement(name = "OrderID")
    protected int orderID;
    @XmlElement(name = "ClientOrderIdentifier")
    protected String clientOrderIdentifier;
    @XmlElement(name = "ShippingStatus")
    protected String shippingStatus;
    @XmlElement(name = "ShippingStatusUpdateDateGMT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippingStatusUpdateDateGMT;
    @XmlElement(name = "OrderShipments")
    protected ArrayOfOrderShipmentResponse orderShipments;

    /**
     * Gets the value of the orderID property.
     * 
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     */
    public void setOrderID(int value) {
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
     * Gets the value of the shippingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingStatus() {
        return shippingStatus;
    }

    /**
     * Sets the value of the shippingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingStatus(String value) {
        this.shippingStatus = value;
    }

    /**
     * Gets the value of the shippingStatusUpdateDateGMT property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippingStatusUpdateDateGMT() {
        return shippingStatusUpdateDateGMT;
    }

    /**
     * Sets the value of the shippingStatusUpdateDateGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippingStatusUpdateDateGMT(XMLGregorianCalendar value) {
        this.shippingStatusUpdateDateGMT = value;
    }

    /**
     * Gets the value of the orderShipments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderShipmentResponse }
     *     
     */
    public ArrayOfOrderShipmentResponse getOrderShipments() {
        return orderShipments;
    }

    /**
     * Sets the value of the orderShipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderShipmentResponse }
     *     
     */
    public void setOrderShipments(ArrayOfOrderShipmentResponse value) {
        this.orderShipments = value;
    }

}
