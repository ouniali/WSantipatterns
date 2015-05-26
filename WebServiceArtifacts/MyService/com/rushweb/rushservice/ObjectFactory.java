
package com.rushweb.rushservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rushweb.rushservice package. 
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

    private final static QName _WebTicketLoginResult_QNAME = new QName("http://RushService.RushWeb.com/", "WebTicketLoginResult");
    private final static QName _String_QNAME = new QName("http://RushService.RushWeb.com/", "string");
    private final static QName _WebTicketLogoutResult_QNAME = new QName("http://RushService.RushWeb.com/", "WebTicketLogoutResult");
    private final static QName _WebTicketSubmitResult_QNAME = new QName("http://RushService.RushWeb.com/", "WebTicketSubmitResult");
    private final static QName _ArrayOfOrder_QNAME = new QName("http://RushService.RushWeb.com/", "ArrayOfOrder");
    private final static QName _Order_QNAME = new QName("http://RushService.RushWeb.com/", "Order");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rushweb.rushservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebTicketRetrieveByReference }
     * 
     */
    public WebTicketRetrieveByReference createWebTicketRetrieveByReference() {
        return new WebTicketRetrieveByReference();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link WebTicketRetrieveByReferenceResponse }
     * 
     */
    public WebTicketRetrieveByReferenceResponse createWebTicketRetrieveByReferenceResponse() {
        return new WebTicketRetrieveByReferenceResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOrder }
     * 
     */
    public ArrayOfOrder createArrayOfOrder() {
        return new ArrayOfOrder();
    }

    /**
     * Create an instance of {@link WebTicketCalculateResponse }
     * 
     */
    public WebTicketCalculateResponse createWebTicketCalculateResponse() {
        return new WebTicketCalculateResponse();
    }

    /**
     * Create an instance of {@link WebTicketLogoutResult }
     * 
     */
    public WebTicketLogoutResult createWebTicketLogoutResult() {
        return new WebTicketLogoutResult();
    }

    /**
     * Create an instance of {@link WebTicketSubmitResult }
     * 
     */
    public WebTicketSubmitResult createWebTicketSubmitResult() {
        return new WebTicketSubmitResult();
    }

    /**
     * Create an instance of {@link WebTicketCalculate }
     * 
     */
    public WebTicketCalculate createWebTicketCalculate() {
        return new WebTicketCalculate();
    }

    /**
     * Create an instance of {@link WebTicketSubmit }
     * 
     */
    public WebTicketSubmit createWebTicketSubmit() {
        return new WebTicketSubmit();
    }

    /**
     * Create an instance of {@link WebTicketRetrieveByDate }
     * 
     */
    public WebTicketRetrieveByDate createWebTicketRetrieveByDate() {
        return new WebTicketRetrieveByDate();
    }

    /**
     * Create an instance of {@link WebTicketLoginResult }
     * 
     */
    public WebTicketLoginResult createWebTicketLoginResult() {
        return new WebTicketLoginResult();
    }

    /**
     * Create an instance of {@link WebTicketRetrieveByTicket }
     * 
     */
    public WebTicketRetrieveByTicket createWebTicketRetrieveByTicket() {
        return new WebTicketRetrieveByTicket();
    }

    /**
     * Create an instance of {@link WebTicketRetrieveByTicketResponse }
     * 
     */
    public WebTicketRetrieveByTicketResponse createWebTicketRetrieveByTicketResponse() {
        return new WebTicketRetrieveByTicketResponse();
    }

    /**
     * Create an instance of {@link StatusResponse }
     * 
     */
    public StatusResponse createStatusResponse() {
        return new StatusResponse();
    }

    /**
     * Create an instance of {@link HelloWorld }
     * 
     */
    public HelloWorld createHelloWorld() {
        return new HelloWorld();
    }

    /**
     * Create an instance of {@link WebTicketSubmitResponse }
     * 
     */
    public WebTicketSubmitResponse createWebTicketSubmitResponse() {
        return new WebTicketSubmitResponse();
    }

    /**
     * Create an instance of {@link WebTicketLogoutResponse }
     * 
     */
    public WebTicketLogoutResponse createWebTicketLogoutResponse() {
        return new WebTicketLogoutResponse();
    }

    /**
     * Create an instance of {@link WebTicketLogin }
     * 
     */
    public WebTicketLogin createWebTicketLogin() {
        return new WebTicketLogin();
    }

    /**
     * Create an instance of {@link WebTicketRetrieveByDateResponse }
     * 
     */
    public WebTicketRetrieveByDateResponse createWebTicketRetrieveByDateResponse() {
        return new WebTicketRetrieveByDateResponse();
    }

    /**
     * Create an instance of {@link WebTicketLogout }
     * 
     */
    public WebTicketLogout createWebTicketLogout() {
        return new WebTicketLogout();
    }

    /**
     * Create an instance of {@link WebTicketLoginResponse }
     * 
     */
    public WebTicketLoginResponse createWebTicketLoginResponse() {
        return new WebTicketLoginResponse();
    }

    /**
     * Create an instance of {@link HelloWorldResponse }
     * 
     */
    public HelloWorldResponse createHelloWorldResponse() {
        return new HelloWorldResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebTicketLoginResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RushService.RushWeb.com/", name = "WebTicketLoginResult")
    public JAXBElement<WebTicketLoginResult> createWebTicketLoginResult(WebTicketLoginResult value) {
        return new JAXBElement<WebTicketLoginResult>(_WebTicketLoginResult_QNAME, WebTicketLoginResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RushService.RushWeb.com/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebTicketLogoutResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RushService.RushWeb.com/", name = "WebTicketLogoutResult")
    public JAXBElement<WebTicketLogoutResult> createWebTicketLogoutResult(WebTicketLogoutResult value) {
        return new JAXBElement<WebTicketLogoutResult>(_WebTicketLogoutResult_QNAME, WebTicketLogoutResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebTicketSubmitResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RushService.RushWeb.com/", name = "WebTicketSubmitResult")
    public JAXBElement<WebTicketSubmitResult> createWebTicketSubmitResult(WebTicketSubmitResult value) {
        return new JAXBElement<WebTicketSubmitResult>(_WebTicketSubmitResult_QNAME, WebTicketSubmitResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RushService.RushWeb.com/", name = "ArrayOfOrder")
    public JAXBElement<ArrayOfOrder> createArrayOfOrder(ArrayOfOrder value) {
        return new JAXBElement<ArrayOfOrder>(_ArrayOfOrder_QNAME, ArrayOfOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://RushService.RushWeb.com/", name = "Order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

}
