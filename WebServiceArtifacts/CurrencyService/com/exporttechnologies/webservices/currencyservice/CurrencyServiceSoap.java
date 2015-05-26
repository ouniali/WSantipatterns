
package com.exporttechnologies.webservices.currencyservice;

import java.math.BigDecimal;
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
@WebService(name = "CurrencyServiceSoap", targetNamespace = "http://www.exporttechnologies.com/webservices/currencyservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CurrencyServiceSoap {


    /**
     * Get the exchange rate of 1 GBP to the specified CurrencyISO. All currencies are returned to 5 decimal places. The following CurrencyISOs are valid: AUD, CAD, CHF, DKK, EUR, HKD, JPY, NOK, NZD, RUB, SEK, SGD, USD, TWD, ZAR
     * 
     * @param currencyISO
     * @return
     *     returns java.math.BigDecimal
     */
    @WebMethod(operationName = "GetExchangeRate", action = "http://www.exporttechnologies.com/webservices/currencyservice/GetExchangeRate")
    @WebResult(name = "GetExchangeRateResult", targetNamespace = "http://www.exporttechnologies.com/webservices/currencyservice/")
    @RequestWrapper(localName = "GetExchangeRate", targetNamespace = "http://www.exporttechnologies.com/webservices/currencyservice/", className = "com.exporttechnologies.webservices.currencyservice.GetExchangeRate")
    @ResponseWrapper(localName = "GetExchangeRateResponse", targetNamespace = "http://www.exporttechnologies.com/webservices/currencyservice/", className = "com.exporttechnologies.webservices.currencyservice.GetExchangeRateResponse")
    public BigDecimal getExchangeRate(
        @WebParam(name = "currencyISO", targetNamespace = "http://www.exporttechnologies.com/webservices/currencyservice/")
        String currencyISO);

    /**
     * Update the exchange rate of 1 GBP to the specified CurrencyISO. The following CurrencyISOs are valid: AUD, CAD, CHF, DKK, EUR, HKD, JPY, NOK, NZD, RUB, SEK, SGD, USD, TWD, ZAR
     * 
     * @param currencyISO
     * @param password
     * @param exchangeRate
     * @return
     *     returns int
     */
    @WebMethod(operationName = "UpdateExchangeRate", action = "http://www.exporttechnologies.com/webservices/currencyservice/UpdateExchangeRate")
    @WebResult(name = "UpdateExchangeRateResult", targetNamespace = "http://www.exporttechnologies.com/webservices/currencyservice/")
    @RequestWrapper(localName = "UpdateExchangeRate", targetNamespace = "http://www.exporttechnologies.com/webservices/currencyservice/", className = "com.exporttechnologies.webservices.currencyservice.UpdateExchangeRate")
    @ResponseWrapper(localName = "UpdateExchangeRateResponse", targetNamespace = "http://www.exporttechnologies.com/webservices/currencyservice/", className = "com.exporttechnologies.webservices.currencyservice.UpdateExchangeRateResponse")
    public int updateExchangeRate(
        @WebParam(name = "currencyISO", targetNamespace = "http://www.exporttechnologies.com/webservices/currencyservice/")
        String currencyISO,
        @WebParam(name = "exchangeRate", targetNamespace = "http://www.exporttechnologies.com/webservices/currencyservice/")
        BigDecimal exchangeRate,
        @WebParam(name = "password", targetNamespace = "http://www.exporttechnologies.com/webservices/currencyservice/")
        String password);

}
