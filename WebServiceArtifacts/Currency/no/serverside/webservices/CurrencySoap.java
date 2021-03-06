
package no.serverside.webservices;

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
@WebService(name = "CurrencySoap", targetNamespace = "http://webservices.serverside.no")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CurrencySoap {


    /**
     * 
     * @param name
     * @return
     *     returns no.serverside.webservices.CurrencyItem
     */
    @WebMethod(operationName = "GetCurrency", action = "http://webservices.serverside.no/GetCurrency")
    @WebResult(name = "GetCurrencyResult", targetNamespace = "http://webservices.serverside.no")
    @RequestWrapper(localName = "GetCurrency", targetNamespace = "http://webservices.serverside.no", className = "no.serverside.webservices.GetCurrency")
    @ResponseWrapper(localName = "GetCurrencyResponse", targetNamespace = "http://webservices.serverside.no", className = "no.serverside.webservices.GetCurrencyResponse")
    public CurrencyItem getCurrency(
        @WebParam(name = "name", targetNamespace = "http://webservices.serverside.no")
        String name);

    /**
     * 
     * @return
     *     returns no.serverside.webservices.ArrayOfCurrencyItem
     */
    @WebMethod(operationName = "GetCurrencyList", action = "http://webservices.serverside.no/GetCurrencyList")
    @WebResult(name = "GetCurrencyListResult", targetNamespace = "http://webservices.serverside.no")
    @RequestWrapper(localName = "GetCurrencyList", targetNamespace = "http://webservices.serverside.no", className = "no.serverside.webservices.GetCurrencyList")
    @ResponseWrapper(localName = "GetCurrencyListResponse", targetNamespace = "http://webservices.serverside.no", className = "no.serverside.webservices.GetCurrencyListResponse")
    public ArrayOfCurrencyItem getCurrencyList();

}
