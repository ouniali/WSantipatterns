
package com.exactor.server.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.exactor.server.ws package. 
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

    private final static QName _Invoice_QNAME = new QName("http://ws.server.exactor.com/", "invoice");
    private final static QName _Commit_QNAME = new QName("http://ws.server.exactor.com/", "commit");
    private final static QName _ProcessResponse_QNAME = new QName("http://ws.server.exactor.com/", "processResponse");
    private final static QName _InvoiceResponse_QNAME = new QName("http://ws.server.exactor.com/", "invoiceResponse");
    private final static QName _Process_QNAME = new QName("http://ws.server.exactor.com/", "process");
    private final static QName _CommitResponse_QNAME = new QName("http://ws.server.exactor.com/", "commitResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.exactor.server.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvoiceResponse }
     * 
     */
    public InvoiceResponse createInvoiceResponse() {
        return new InvoiceResponse();
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link CommitResponse }
     * 
     */
    public CommitResponse createCommitResponse() {
        return new CommitResponse();
    }

    /**
     * Create an instance of {@link Commit }
     * 
     */
    public Commit createCommit() {
        return new Commit();
    }

    /**
     * Create an instance of {@link Invoice }
     * 
     */
    public Invoice createInvoice() {
        return new Invoice();
    }

    /**
     * Create an instance of {@link ProcessResponse }
     * 
     */
    public ProcessResponse createProcessResponse() {
        return new ProcessResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Invoice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.exactor.com/", name = "invoice")
    public JAXBElement<Invoice> createInvoice(Invoice value) {
        return new JAXBElement<Invoice>(_Invoice_QNAME, Invoice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Commit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.exactor.com/", name = "commit")
    public JAXBElement<Commit> createCommit(Commit value) {
        return new JAXBElement<Commit>(_Commit_QNAME, Commit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.exactor.com/", name = "processResponse")
    public JAXBElement<ProcessResponse> createProcessResponse(ProcessResponse value) {
        return new JAXBElement<ProcessResponse>(_ProcessResponse_QNAME, ProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.exactor.com/", name = "invoiceResponse")
    public JAXBElement<InvoiceResponse> createInvoiceResponse(InvoiceResponse value) {
        return new JAXBElement<InvoiceResponse>(_InvoiceResponse_QNAME, InvoiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Process }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.exactor.com/", name = "process")
    public JAXBElement<Process> createProcess(Process value) {
        return new JAXBElement<Process>(_Process_QNAME, Process.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.server.exactor.com/", name = "commitResponse")
    public JAXBElement<CommitResponse> createCommitResponse(CommitResponse value) {
        return new JAXBElement<CommitResponse>(_CommitResponse_QNAME, CommitResponse.class, null, value);
    }

}
