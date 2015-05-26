
package com.exactor.ns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.exactor.ns package. 
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

    private final static QName _TaxResponse_QNAME = new QName("http://www.exactor.com/ns", "TaxResponse");
    private final static QName _TaxRequest_QNAME = new QName("http://www.exactor.com/ns", "TaxRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.exactor.ns
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvoiceRequestType }
     * 
     */
    public InvoiceRequestType createInvoiceRequestType() {
        return new InvoiceRequestType();
    }

    /**
     * Create an instance of {@link InvoiceResponseType }
     * 
     */
    public InvoiceResponseType createInvoiceResponseType() {
        return new InvoiceResponseType();
    }

    /**
     * Create an instance of {@link TaxResponse }
     * 
     */
    public TaxResponse createTaxResponse() {
        return new TaxResponse();
    }

    /**
     * Create an instance of {@link TaxRequest }
     * 
     */
    public TaxRequest createTaxRequest() {
        return new TaxRequest();
    }

    /**
     * Create an instance of {@link DeleteResponseType }
     * 
     */
    public DeleteResponseType createDeleteResponseType() {
        return new DeleteResponseType();
    }

    /**
     * Create an instance of {@link RefundResponseType }
     * 
     */
    public RefundResponseType createRefundResponseType() {
        return new RefundResponseType();
    }

    /**
     * Create an instance of {@link ErrorResponseType }
     * 
     */
    public ErrorResponseType createErrorResponseType() {
        return new ErrorResponseType();
    }

    /**
     * Create an instance of {@link CommitRequestType }
     * 
     */
    public CommitRequestType createCommitRequestType() {
        return new CommitRequestType();
    }

    /**
     * Create an instance of {@link RefundRequestType }
     * 
     */
    public RefundRequestType createRefundRequestType() {
        return new RefundRequestType();
    }

    /**
     * Create an instance of {@link DeleteRequestType }
     * 
     */
    public DeleteRequestType createDeleteRequestType() {
        return new DeleteRequestType();
    }

    /**
     * Create an instance of {@link CommitResponseType }
     * 
     */
    public CommitResponseType createCommitResponseType() {
        return new CommitResponseType();
    }

    /**
     * Create an instance of {@link TaxInfoType }
     * 
     */
    public TaxInfoType createTaxInfoType() {
        return new TaxInfoType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link InvoiceRequestType.LineItem }
     * 
     */
    public InvoiceRequestType.LineItem createInvoiceRequestTypeLineItem() {
        return new InvoiceRequestType.LineItem();
    }

    /**
     * Create an instance of {@link InvoiceResponseType.LineItem }
     * 
     */
    public InvoiceResponseType.LineItem createInvoiceResponseTypeLineItem() {
        return new InvoiceResponseType.LineItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.exactor.com/ns", name = "TaxResponse")
    public JAXBElement<TaxResponse> createTaxResponse(TaxResponse value) {
        return new JAXBElement<TaxResponse>(_TaxResponse_QNAME, TaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.exactor.com/ns", name = "TaxRequest")
    public JAXBElement<TaxRequest> createTaxRequest(TaxRequest value) {
        return new JAXBElement<TaxRequest>(_TaxRequest_QNAME, TaxRequest.class, null, value);
    }

}
