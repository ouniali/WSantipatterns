
package com.exactor.server.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.exactor.ns.TaxRequest;
import com.exactor.ns.TaxResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ExactorTax", targetNamespace = "http://ws.server.exactor.com/")
@XmlSeeAlso({
    com.exactor.ns.ObjectFactory.class,
    com.exactor.ns_impl.ObjectFactory.class,
    com.exactor.server.ws.ObjectFactory.class
})
public interface ExactorTax {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.exactor.ns.TaxResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "process", targetNamespace = "http://ws.server.exactor.com/", className = "com.exactor.server.ws.Process")
    @ResponseWrapper(localName = "processResponse", targetNamespace = "http://ws.server.exactor.com/", className = "com.exactor.server.ws.ProcessResponse")
    @Action(input = "http://ws.server.exactor.com/ExactorTax/processRequest", output = "http://ws.server.exactor.com/ExactorTax/processResponse")
    public TaxResponse process(
        @WebParam(name = "arg0", targetNamespace = "")
        TaxRequest arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.exactor.ns.TaxResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "commit", targetNamespace = "http://ws.server.exactor.com/", className = "com.exactor.server.ws.Commit")
    @ResponseWrapper(localName = "commitResponse", targetNamespace = "http://ws.server.exactor.com/", className = "com.exactor.server.ws.CommitResponse")
    @Action(input = "http://ws.server.exactor.com/ExactorTax/commitRequest", output = "http://ws.server.exactor.com/ExactorTax/commitResponse")
    public TaxResponse commit(
        @WebParam(name = "arg0", targetNamespace = "")
        TaxRequest arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.exactor.ns.TaxResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "invoice", targetNamespace = "http://ws.server.exactor.com/", className = "com.exactor.server.ws.Invoice")
    @ResponseWrapper(localName = "invoiceResponse", targetNamespace = "http://ws.server.exactor.com/", className = "com.exactor.server.ws.InvoiceResponse")
    @Action(input = "http://ws.server.exactor.com/ExactorTax/invoiceRequest", output = "http://ws.server.exactor.com/ExactorTax/invoiceResponse")
    public TaxResponse invoice(
        @WebParam(name = "arg0", targetNamespace = "")
        TaxRequest arg0);

}