
package com.channeladvisor.api.datacontracts.shippingservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.channeladvisor.api.datacontracts.shippingservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.channeladvisor.api.datacontracts.shippingservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipmentResponse }
     * 
     */
    public ShipmentResponse createShipmentResponse() {
        return new ShipmentResponse();
    }

    /**
     * Create an instance of {@link ShipmentLineItemResponse }
     * 
     */
    public ShipmentLineItemResponse createShipmentLineItemResponse() {
        return new ShipmentLineItemResponse();
    }

    /**
     * Create an instance of {@link OrderShipmentResponse }
     * 
     */
    public OrderShipmentResponse createOrderShipmentResponse() {
        return new OrderShipmentResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOrderShipmentResponse }
     * 
     */
    public ArrayOfOrderShipmentResponse createArrayOfOrderShipmentResponse() {
        return new ArrayOfOrderShipmentResponse();
    }

    /**
     * Create an instance of {@link ArrayOfShipmentLineItemResponse }
     * 
     */
    public ArrayOfShipmentLineItemResponse createArrayOfShipmentLineItemResponse() {
        return new ArrayOfShipmentLineItemResponse();
    }

    /**
     * Create an instance of {@link OrderShipmentHistoryResponse }
     * 
     */
    public OrderShipmentHistoryResponse createOrderShipmentHistoryResponse() {
        return new OrderShipmentHistoryResponse();
    }

}
