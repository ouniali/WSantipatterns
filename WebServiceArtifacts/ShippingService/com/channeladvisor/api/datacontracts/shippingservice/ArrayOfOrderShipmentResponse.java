
package com.channeladvisor.api.datacontracts.shippingservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderShipmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderShipmentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderShipmentResponse" type="{http://api.channeladvisor.com/datacontracts/ShippingService}OrderShipmentResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderShipmentResponse", propOrder = {
    "orderShipmentResponse"
})
public class ArrayOfOrderShipmentResponse {

    @XmlElement(name = "OrderShipmentResponse", nillable = true)
    protected List<OrderShipmentResponse> orderShipmentResponse;

    /**
     * Gets the value of the orderShipmentResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderShipmentResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderShipmentResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderShipmentResponse }
     * 
     * 
     */
    public List<OrderShipmentResponse> getOrderShipmentResponse() {
        if (orderShipmentResponse == null) {
            orderShipmentResponse = new ArrayList<OrderShipmentResponse>();
        }
        return this.orderShipmentResponse;
    }

}
