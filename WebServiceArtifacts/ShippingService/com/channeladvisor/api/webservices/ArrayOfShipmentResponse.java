
package com.channeladvisor.api.webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.channeladvisor.api.datacontracts.shippingservice.ShipmentResponse;


/**
 * <p>Java class for ArrayOfShipmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfShipmentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipmentResponse" type="{http://api.channeladvisor.com/datacontracts/ShippingService}ShipmentResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShipmentResponse", propOrder = {
    "shipmentResponse"
})
public class ArrayOfShipmentResponse {

    @XmlElement(name = "ShipmentResponse", nillable = true)
    protected List<ShipmentResponse> shipmentResponse;

    /**
     * Gets the value of the shipmentResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentResponse }
     * 
     * 
     */
    public List<ShipmentResponse> getShipmentResponse() {
        if (shipmentResponse == null) {
            shipmentResponse = new ArrayList<ShipmentResponse>();
        }
        return this.shipmentResponse;
    }

}
