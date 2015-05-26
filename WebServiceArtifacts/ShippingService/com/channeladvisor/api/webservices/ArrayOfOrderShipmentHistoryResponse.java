
package com.channeladvisor.api.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.channeladvisor.api.datacontracts.shippingservice.OrderShipmentHistoryResponse;


/**
 * <p>Java class for ArrayOfOrderShipmentHistoryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderShipmentHistoryResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderShipmentHistoryResponse" type="{http://api.channeladvisor.com/datacontracts/ShippingService}OrderShipmentHistoryResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderShipmentHistoryResponse", propOrder = {
    "orderShipmentHistoryResponse"
})
public class ArrayOfOrderShipmentHistoryResponse {

    @XmlElement(name = "OrderShipmentHistoryResponse", nillable = true)
    protected List<OrderShipmentHistoryResponse> orderShipmentHistoryResponse;

    /**
     * Gets the value of the orderShipmentHistoryResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderShipmentHistoryResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderShipmentHistoryResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderShipmentHistoryResponse }
     * 
     * 
     */
    public List<OrderShipmentHistoryResponse> getOrderShipmentHistoryResponse() {
        if (orderShipmentHistoryResponse == null) {
            orderShipmentHistoryResponse = new ArrayList<OrderShipmentHistoryResponse>();
        }
        return this.orderShipmentHistoryResponse;
    }

}
