
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _Header_QNAME = new QName("http://tempuri.org/", "Header");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderInfoResponse }
     * 
     */
    public OrderInfoResponse createOrderInfoResponse() {
        return new OrderInfoResponse();
    }

    /**
     * Create an instance of {@link CalculateRatesResponse }
     * 
     */
    public CalculateRatesResponse createCalculateRatesResponse() {
        return new CalculateRatesResponse();
    }

    /**
     * Create an instance of {@link ProcessOrderResponse }
     * 
     */
    public ProcessOrderResponse createProcessOrderResponse() {
        return new ProcessOrderResponse();
    }

    /**
     * Create an instance of {@link CalculateRatesR2Response }
     * 
     */
    public CalculateRatesR2Response createCalculateRatesR2Response() {
        return new CalculateRatesR2Response();
    }

    /**
     * Create an instance of {@link CalculateRatesR2 }
     * 
     */
    public CalculateRatesR2 createCalculateRatesR2() {
        return new CalculateRatesR2();
    }

    /**
     * Create an instance of {@link ArrayOfProduct }
     * 
     */
    public ArrayOfProduct createArrayOfProduct() {
        return new ArrayOfProduct();
    }

    /**
     * Create an instance of {@link OrderInfoResponse.OrderInfoResult }
     * 
     */
    public OrderInfoResponse.OrderInfoResult createOrderInfoResponseOrderInfoResult() {
        return new OrderInfoResponse.OrderInfoResult();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link CalculateRatesResponse.CalculateRatesResult }
     * 
     */
    public CalculateRatesResponse.CalculateRatesResult createCalculateRatesResponseCalculateRatesResult() {
        return new CalculateRatesResponse.CalculateRatesResult();
    }

    /**
     * Create an instance of {@link ProcessOrder }
     * 
     */
    public ProcessOrder createProcessOrder() {
        return new ProcessOrder();
    }

    /**
     * Create an instance of {@link OrderAddresses }
     * 
     */
    public OrderAddresses createOrderAddresses() {
        return new OrderAddresses();
    }

    /**
     * Create an instance of {@link ArrayOfOrderDetail }
     * 
     */
    public ArrayOfOrderDetail createArrayOfOrderDetail() {
        return new ArrayOfOrderDetail();
    }

    /**
     * Create an instance of {@link ProcessOrderResponse.ProcessOrderResult }
     * 
     */
    public ProcessOrderResponse.ProcessOrderResult createProcessOrderResponseProcessOrderResult() {
        return new ProcessOrderResponse.ProcessOrderResult();
    }

    /**
     * Create an instance of {@link OrderInfo }
     * 
     */
    public OrderInfo createOrderInfo() {
        return new OrderInfo();
    }

    /**
     * Create an instance of {@link CalculateRates }
     * 
     */
    public CalculateRates createCalculateRates() {
        return new CalculateRates();
    }

    /**
     * Create an instance of {@link CalculateRatesR2Response.CalculateRatesR2Result }
     * 
     */
    public CalculateRatesR2Response.CalculateRatesR2Result createCalculateRatesR2ResponseCalculateRatesR2Result() {
        return new CalculateRatesR2Response.CalculateRatesR2Result();
    }

    /**
     * Create an instance of {@link OrderDetail }
     * 
     */
    public OrderDetail createOrderDetail() {
        return new OrderDetail();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

}
