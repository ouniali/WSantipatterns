
package com.avalara.avatax.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TaxSvcSoap", targetNamespace = "http://avatax.avalara.com/services")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TaxSvcSoap {


    /**
     * Calculates taxes on a document
     * 
     * @param getTaxRequest
     * @return
     *     returns com.avalara.avatax.services.GetTaxResult
     */
    @WebMethod(operationName = "GetTax", action = "http://avatax.avalara.com/services/GetTax")
    @WebResult(name = "GetTaxResult", targetNamespace = "http://avatax.avalara.com/services")
    @RequestWrapper(localName = "GetTax", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.GetTax")
    @ResponseWrapper(localName = "GetTaxResponse", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.GetTaxResponse")
    public GetTaxResult getTax(
        @WebParam(name = "GetTaxRequest", targetNamespace = "http://avatax.avalara.com/services")
        GetTaxRequest getTaxRequest);

    /**
     * Retrieves a previously calculated tax document
     * 
     * @param getTaxHistoryRequest
     * @return
     *     returns com.avalara.avatax.services.GetTaxHistoryResult
     */
    @WebMethod(operationName = "GetTaxHistory", action = "http://avatax.avalara.com/services/GetTaxHistory")
    @WebResult(name = "GetTaxHistoryResult", targetNamespace = "http://avatax.avalara.com/services")
    @RequestWrapper(localName = "GetTaxHistory", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.GetTaxHistory")
    @ResponseWrapper(localName = "GetTaxHistoryResponse", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.GetTaxHistoryResponse")
    public GetTaxHistoryResult getTaxHistory(
        @WebParam(name = "GetTaxHistoryRequest", targetNamespace = "http://avatax.avalara.com/services")
        GetTaxHistoryRequest getTaxHistoryRequest);

    /**
     * Posts a previously calculated tax
     * 
     * @param postTaxRequest
     * @return
     *     returns com.avalara.avatax.services.PostTaxResult
     */
    @WebMethod(operationName = "PostTax", action = "http://avatax.avalara.com/services/PostTax")
    @WebResult(name = "PostTaxResult", targetNamespace = "http://avatax.avalara.com/services")
    @RequestWrapper(localName = "PostTax", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.PostTax")
    @ResponseWrapper(localName = "PostTaxResponse", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.PostTaxResponse")
    public PostTaxResult postTax(
        @WebParam(name = "PostTaxRequest", targetNamespace = "http://avatax.avalara.com/services")
        PostTaxRequest postTaxRequest);

    /**
     * Commits a previously posted tax
     * 
     * @param commitTaxRequest
     * @return
     *     returns com.avalara.avatax.services.CommitTaxResult
     */
    @WebMethod(operationName = "CommitTax", action = "http://avatax.avalara.com/services/CommitTax")
    @WebResult(name = "CommitTaxResult", targetNamespace = "http://avatax.avalara.com/services")
    @RequestWrapper(localName = "CommitTax", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.CommitTax")
    @ResponseWrapper(localName = "CommitTaxResponse", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.CommitTaxResponse")
    public CommitTaxResult commitTax(
        @WebParam(name = "CommitTaxRequest", targetNamespace = "http://avatax.avalara.com/services")
        CommitTaxRequest commitTaxRequest);

    /**
     * Cancels a previously calculated tax.  This is for use as a compensating action when posting on the client fails to complete.
     * 
     * @param cancelTaxRequest
     * @return
     *     returns com.avalara.avatax.services.CancelTaxResult
     */
    @WebMethod(operationName = "CancelTax", action = "http://avatax.avalara.com/services/CancelTax")
    @WebResult(name = "CancelTaxResult", targetNamespace = "http://avatax.avalara.com/services")
    @RequestWrapper(localName = "CancelTax", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.CancelTax")
    @ResponseWrapper(localName = "CancelTaxResponse", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.CancelTaxResponse")
    public CancelTaxResult cancelTax(
        @WebParam(name = "CancelTaxRequest", targetNamespace = "http://avatax.avalara.com/services")
        CancelTaxRequest cancelTaxRequest);

    /**
     * Reconciles tax history to ensure the client data matches the AvaTax history.
     * 
     * @param reconcileTaxHistoryRequest
     * @return
     *     returns com.avalara.avatax.services.ReconcileTaxHistoryResult
     */
    @WebMethod(operationName = "ReconcileTaxHistory", action = "http://avatax.avalara.com/services/ReconcileTaxHistory")
    @WebResult(name = "ReconcileTaxHistoryResult", targetNamespace = "http://avatax.avalara.com/services")
    @RequestWrapper(localName = "ReconcileTaxHistory", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.ReconcileTaxHistory")
    @ResponseWrapper(localName = "ReconcileTaxHistoryResponse", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.ReconcileTaxHistoryResponse")
    public ReconcileTaxHistoryResult reconcileTaxHistory(
        @WebParam(name = "ReconcileTaxHistoryRequest", targetNamespace = "http://avatax.avalara.com/services")
        ReconcileTaxHistoryRequest reconcileTaxHistoryRequest);

    /**
     * Adjusts taxes on an existing invoice
     * 
     * @param adjustTaxRequest
     * @return
     *     returns com.avalara.avatax.services.AdjustTaxResult
     */
    @WebMethod(operationName = "AdjustTax", action = "http://avatax.avalara.com/services/AdjustTax")
    @WebResult(name = "AdjustTaxResult", targetNamespace = "http://avatax.avalara.com/services")
    @RequestWrapper(localName = "AdjustTax", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.AdjustTax")
    @ResponseWrapper(localName = "AdjustTaxResponse", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.AdjustTaxResponse")
    public AdjustTaxResult adjustTax(
        @WebParam(name = "AdjustTaxRequest", targetNamespace = "http://avatax.avalara.com/services")
        AdjustTaxRequest adjustTaxRequest);

    /**
     * Applies a payment date to an existing invoice
     * 
     * @param applyPaymentRequest
     * @return
     *     returns com.avalara.avatax.services.ApplyPaymentResult
     */
    @WebMethod(operationName = "ApplyPayment", action = "http://avatax.avalara.com/services/ApplyPayment")
    @WebResult(name = "ApplyPaymentResult", targetNamespace = "http://avatax.avalara.com/services")
    @RequestWrapper(localName = "ApplyPayment", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.ApplyPayment")
    @ResponseWrapper(localName = "ApplyPaymentResponse", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.ApplyPaymentResponse")
    public ApplyPaymentResult applyPayment(
        @WebParam(name = "ApplyPaymentRequest", targetNamespace = "http://avatax.avalara.com/services")
        ApplyPaymentRequest applyPaymentRequest);

    /**
     * Tests connectivity and version of the service
     * 
     * @param message
     * @return
     *     returns com.avalara.avatax.services.PingResult
     */
    @WebMethod(operationName = "Ping", action = "http://avatax.avalara.com/services/Ping")
    @WebResult(name = "PingResult", targetNamespace = "http://avatax.avalara.com/services")
    @RequestWrapper(localName = "Ping", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.Ping")
    @ResponseWrapper(localName = "PingResponse", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.PingResponse")
    public PingResult ping(
        @WebParam(name = "Message", targetNamespace = "http://avatax.avalara.com/services")
        String message);

    /**
     * Checks authentication and authorization to one or more operations on the service.
     * 
     * @param operations
     * @return
     *     returns com.avalara.avatax.services.IsAuthorizedResult
     */
    @WebMethod(operationName = "IsAuthorized", action = "http://avatax.avalara.com/services/IsAuthorized")
    @WebResult(name = "IsAuthorizedResult", targetNamespace = "http://avatax.avalara.com/services")
    @RequestWrapper(localName = "IsAuthorized", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.IsAuthorized")
    @ResponseWrapper(localName = "IsAuthorizedResponse", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.IsAuthorizedResponse")
    public IsAuthorizedResult isAuthorized(
        @WebParam(name = "Operations", targetNamespace = "http://avatax.avalara.com/services")
        String operations);

    /**
     * Fetches TaxSummary Data.
     * 
     * @param taxSummaryFetchRequest
     * @return
     *     returns com.avalara.avatax.services.TaxSummaryFetchResult
     */
    @WebMethod(operationName = "TaxSummaryFetch", action = "http://avatax.avalara.com/services/TaxSummaryFetch")
    @WebResult(name = "TaxSummaryFetchResult", targetNamespace = "http://avatax.avalara.com/services")
    @RequestWrapper(localName = "TaxSummaryFetch", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.TaxSummaryFetch")
    @ResponseWrapper(localName = "TaxSummaryFetchResponse", targetNamespace = "http://avatax.avalara.com/services", className = "com.avalara.avatax.services.TaxSummaryFetchResponse")
    public TaxSummaryFetchResult taxSummaryFetch(
        @WebParam(name = "TaxSummaryFetchRequest", targetNamespace = "http://avatax.avalara.com/services")
        TaxSummaryFetchRequest taxSummaryFetchRequest);

}
