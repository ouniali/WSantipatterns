
package net.taxcloud;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TaxCloudSoap", targetNamespace = "http://taxcloud.net")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TaxCloudSoap {


    /**
     * 
     * @param address2
     * @param city
     * @param address1
     * @param uspsUserID
     * @param zip4
     * @param state
     * @param zip5
     * @return
     *     returns net.taxcloud.VerifiedAddress
     */
    @WebMethod(operationName = "VerifyAddress", action = "http://taxcloud.net/VerifyAddress")
    @WebResult(name = "VerifyAddressResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "VerifyAddress", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.VerifyAddress")
    @ResponseWrapper(localName = "VerifyAddressResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.VerifyAddressResponse")
    public VerifiedAddress verifyAddress(
        @WebParam(name = "uspsUserID", targetNamespace = "http://taxcloud.net")
        String uspsUserID,
        @WebParam(name = "address1", targetNamespace = "http://taxcloud.net")
        String address1,
        @WebParam(name = "address2", targetNamespace = "http://taxcloud.net")
        String address2,
        @WebParam(name = "city", targetNamespace = "http://taxcloud.net")
        String city,
        @WebParam(name = "state", targetNamespace = "http://taxcloud.net")
        String state,
        @WebParam(name = "zip5", targetNamespace = "http://taxcloud.net")
        String zip5,
        @WebParam(name = "zip4", targetNamespace = "http://taxcloud.net")
        String zip4);

    /**
     * 
     * @param deliveredBySeller
     * @param useDate
     * @param apiKey
     * @param cartID
     * @param origin
     * @param customerID
     * @param destination
     * @param apiLoginID
     * @param cartItems
     * @param exemptCert
     * @return
     *     returns net.taxcloud.LookupRsp
     */
    @WebMethod(operationName = "LookupForDate", action = "http://taxcloud.net/LookupForDate")
    @WebResult(name = "LookupForDateResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "LookupForDate", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.LookupForDate")
    @ResponseWrapper(localName = "LookupForDateResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.LookupForDateResponse")
    public LookupRsp lookupForDate(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey,
        @WebParam(name = "customerID", targetNamespace = "http://taxcloud.net")
        String customerID,
        @WebParam(name = "cartID", targetNamespace = "http://taxcloud.net")
        String cartID,
        @WebParam(name = "cartItems", targetNamespace = "http://taxcloud.net")
        ArrayOfCartItem cartItems,
        @WebParam(name = "origin", targetNamespace = "http://taxcloud.net")
        Address origin,
        @WebParam(name = "destination", targetNamespace = "http://taxcloud.net")
        Address destination,
        @WebParam(name = "deliveredBySeller", targetNamespace = "http://taxcloud.net")
        boolean deliveredBySeller,
        @WebParam(name = "exemptCert", targetNamespace = "http://taxcloud.net")
        ExemptionCertificate exemptCert,
        @WebParam(name = "useDate", targetNamespace = "http://taxcloud.net")
        XMLGregorianCalendar useDate);

    /**
     * 
     * @param deliveredBySeller
     * @param apiKey
     * @param cartID
     * @param origin
     * @param customerID
     * @param destination
     * @param apiLoginID
     * @param cartItems
     * @param exemptCert
     * @return
     *     returns net.taxcloud.LookupRsp
     */
    @WebMethod(operationName = "Lookup", action = "http://taxcloud.net/Lookup")
    @WebResult(name = "LookupResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "Lookup", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.Lookup")
    @ResponseWrapper(localName = "LookupResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.LookupResponse")
    public LookupRsp lookup(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey,
        @WebParam(name = "customerID", targetNamespace = "http://taxcloud.net")
        String customerID,
        @WebParam(name = "cartID", targetNamespace = "http://taxcloud.net")
        String cartID,
        @WebParam(name = "cartItems", targetNamespace = "http://taxcloud.net")
        ArrayOfCartItem cartItems,
        @WebParam(name = "origin", targetNamespace = "http://taxcloud.net")
        Address origin,
        @WebParam(name = "destination", targetNamespace = "http://taxcloud.net")
        Address destination,
        @WebParam(name = "deliveredBySeller", targetNamespace = "http://taxcloud.net")
        boolean deliveredBySeller,
        @WebParam(name = "exemptCert", targetNamespace = "http://taxcloud.net")
        ExemptionCertificate exemptCert);

    /**
     * 
     * @param apiKey
     * @param orderID
     * @param cartID
     * @param customerID
     * @param dateAuthorized
     * @param apiLoginID
     * @return
     *     returns net.taxcloud.AuthorizedRsp
     */
    @WebMethod(operationName = "Authorized", action = "http://taxcloud.net/Authorized")
    @WebResult(name = "AuthorizedResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "Authorized", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.Authorized")
    @ResponseWrapper(localName = "AuthorizedResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.AuthorizedResponse")
    public AuthorizedRsp authorized(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey,
        @WebParam(name = "customerID", targetNamespace = "http://taxcloud.net")
        String customerID,
        @WebParam(name = "cartID", targetNamespace = "http://taxcloud.net")
        String cartID,
        @WebParam(name = "orderID", targetNamespace = "http://taxcloud.net")
        String orderID,
        @WebParam(name = "dateAuthorized", targetNamespace = "http://taxcloud.net")
        XMLGregorianCalendar dateAuthorized);

    /**
     * 
     * @param apiKey
     * @param orderID
     * @param cartID
     * @param customerID
     * @param dateAuthorized
     * @param apiLoginID
     * @param dateCaptured
     * @return
     *     returns net.taxcloud.AuthorizedRsp
     */
    @WebMethod(operationName = "AuthorizedWithCapture", action = "http://taxcloud.net/AuthorizedWithCapture")
    @WebResult(name = "AuthorizedWithCaptureResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "AuthorizedWithCapture", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.AuthorizedWithCapture")
    @ResponseWrapper(localName = "AuthorizedWithCaptureResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.AuthorizedWithCaptureResponse")
    public AuthorizedRsp authorizedWithCapture(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey,
        @WebParam(name = "customerID", targetNamespace = "http://taxcloud.net")
        String customerID,
        @WebParam(name = "cartID", targetNamespace = "http://taxcloud.net")
        String cartID,
        @WebParam(name = "orderID", targetNamespace = "http://taxcloud.net")
        String orderID,
        @WebParam(name = "dateAuthorized", targetNamespace = "http://taxcloud.net")
        XMLGregorianCalendar dateAuthorized,
        @WebParam(name = "dateCaptured", targetNamespace = "http://taxcloud.net")
        XMLGregorianCalendar dateCaptured);

    /**
     * 
     * @param apiKey
     * @param orderID
     * @param apiLoginID
     * @return
     *     returns net.taxcloud.CapturedRsp
     */
    @WebMethod(operationName = "Captured", action = "http://taxcloud.net/Captured")
    @WebResult(name = "CapturedResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "Captured", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.Captured")
    @ResponseWrapper(localName = "CapturedResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.CapturedResponse")
    public CapturedRsp captured(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey,
        @WebParam(name = "orderID", targetNamespace = "http://taxcloud.net")
        String orderID);

    /**
     * 
     * @param apiKey
     * @param orderID
     * @param apiLoginID
     * @param cartItems
     * @param returnedDate
     * @return
     *     returns net.taxcloud.ReturnedRsp
     */
    @WebMethod(operationName = "Returned", action = "http://taxcloud.net/Returned")
    @WebResult(name = "ReturnedResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "Returned", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.Returned")
    @ResponseWrapper(localName = "ReturnedResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.ReturnedResponse")
    public ReturnedRsp returned(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey,
        @WebParam(name = "orderID", targetNamespace = "http://taxcloud.net")
        String orderID,
        @WebParam(name = "cartItems", targetNamespace = "http://taxcloud.net")
        ArrayOfCartItem cartItems,
        @WebParam(name = "returnedDate", targetNamespace = "http://taxcloud.net")
        XMLGregorianCalendar returnedDate);

    /**
     * 
     * @param apiKey
     * @param apiLoginID
     * @param transactions
     * @return
     *     returns net.taxcloud.AddTransactionsRsp
     */
    @WebMethod(operationName = "AddTransactions", action = "http://taxcloud.net/AddTransactions")
    @WebResult(name = "AddTransactionsResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "AddTransactions", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.AddTransactions")
    @ResponseWrapper(localName = "AddTransactionsResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.AddTransactionsResponse")
    public AddTransactionsRsp addTransactions(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey,
        @WebParam(name = "transactions", targetNamespace = "http://taxcloud.net")
        ArrayOfTransaction transactions);

    /**
     * 
     * @param apiKey
     * @param apiLoginID
     * @return
     *     returns net.taxcloud.GetTICGroupsRsp
     */
    @WebMethod(operationName = "GetTICGroups", action = "http://taxcloud.net/GetTICGroups")
    @WebResult(name = "GetTICGroupsResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "GetTICGroups", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.GetTICGroups")
    @ResponseWrapper(localName = "GetTICGroupsResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.GetTICGroupsResponse")
    public GetTICGroupsRsp getTICGroups(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey);

    /**
     * 
     * @param apiKey
     * @param apiLoginID
     * @return
     *     returns net.taxcloud.GetTICsRsp
     */
    @WebMethod(operationName = "GetTICs", action = "http://taxcloud.net/GetTICs")
    @WebResult(name = "GetTICsResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "GetTICs", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.GetTICs")
    @ResponseWrapper(localName = "GetTICsResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.GetTICsResponse")
    public GetTICsRsp getTICs(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey);

    /**
     * 
     * @param apiKey
     * @param ticGroup
     * @param apiLoginID
     * @return
     *     returns net.taxcloud.GetTICsRsp
     */
    @WebMethod(operationName = "GetTICsByGroup", action = "http://taxcloud.net/GetTICsByGroup")
    @WebResult(name = "GetTICsByGroupResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "GetTICsByGroup", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.GetTICsByGroup")
    @ResponseWrapper(localName = "GetTICsByGroupResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.GetTICsByGroupResponse")
    public GetTICsRsp getTICsByGroup(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey,
        @WebParam(name = "ticGroup", targetNamespace = "http://taxcloud.net")
        int ticGroup);

    /**
     * 
     * @param apiKey
     * @param customerID
     * @param apiLoginID
     * @param exemptCert
     * @return
     *     returns net.taxcloud.AddCertificateRsp
     */
    @WebMethod(operationName = "AddExemptCertificate", action = "http://taxcloud.net/AddExemptCertificate")
    @WebResult(name = "AddExemptCertificateResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "AddExemptCertificate", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.AddExemptCertificate")
    @ResponseWrapper(localName = "AddExemptCertificateResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.AddExemptCertificateResponse")
    public AddCertificateRsp addExemptCertificate(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey,
        @WebParam(name = "customerID", targetNamespace = "http://taxcloud.net")
        String customerID,
        @WebParam(name = "exemptCert", targetNamespace = "http://taxcloud.net")
        ExemptionCertificate exemptCert);

    /**
     * 
     * @param apiKey
     * @param certificateID
     * @param apiLoginID
     * @return
     *     returns net.taxcloud.DeleteCertificateRsp
     */
    @WebMethod(operationName = "DeleteExemptCertificate", action = "http://taxcloud.net/DeleteExemptCertificate")
    @WebResult(name = "DeleteExemptCertificateResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "DeleteExemptCertificate", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.DeleteExemptCertificate")
    @ResponseWrapper(localName = "DeleteExemptCertificateResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.DeleteExemptCertificateResponse")
    public DeleteCertificateRsp deleteExemptCertificate(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey,
        @WebParam(name = "certificateID", targetNamespace = "http://taxcloud.net")
        String certificateID);

    /**
     * 
     * @param apiKey
     * @param customerID
     * @param apiLoginID
     * @return
     *     returns net.taxcloud.GetCertificatesRsp
     */
    @WebMethod(operationName = "GetExemptCertificates", action = "http://taxcloud.net/GetExemptCertificates")
    @WebResult(name = "GetExemptCertificatesResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "GetExemptCertificates", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.GetExemptCertificates")
    @ResponseWrapper(localName = "GetExemptCertificatesResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.GetExemptCertificatesResponse")
    public GetCertificatesRsp getExemptCertificates(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey,
        @WebParam(name = "customerID", targetNamespace = "http://taxcloud.net")
        String customerID);

    /**
     * 
     * @param apiKey
     * @param apiLoginID
     * @return
     *     returns net.taxcloud.PingRsp
     */
    @WebMethod(operationName = "Ping", action = "http://taxcloud.net/Ping")
    @WebResult(name = "PingResult", targetNamespace = "http://taxcloud.net")
    @RequestWrapper(localName = "Ping", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.Ping")
    @ResponseWrapper(localName = "PingResponse", targetNamespace = "http://taxcloud.net", className = "net.taxcloud.PingResponse")
    public PingRsp ping(
        @WebParam(name = "apiLoginID", targetNamespace = "http://taxcloud.net")
        String apiLoginID,
        @WebParam(name = "apiKey", targetNamespace = "http://taxcloud.net")
        String apiKey);

}
