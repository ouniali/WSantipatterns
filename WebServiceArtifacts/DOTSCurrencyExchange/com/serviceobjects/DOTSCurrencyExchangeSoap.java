
package com.serviceobjects;

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
@WebService(name = "DOTSCurrencyExchangeSoap", targetNamespace = "http://www.serviceobjects.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DOTSCurrencyExchangeSoap {


    /**
     * Gives a list of the supported currency symbols.
     * 
     * @param licenseKey
     * @return
     *     returns com.serviceobjects.ArrayOfCurrencyNameResponse
     */
    @WebMethod(operationName = "GetAllCurrencies", action = "http://www.serviceobjects.com/GetAllCurrencies")
    @WebResult(name = "GetAllCurrenciesResult", targetNamespace = "http://www.serviceobjects.com/")
    @RequestWrapper(localName = "GetAllCurrencies", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetAllCurrencies")
    @ResponseWrapper(localName = "GetAllCurrenciesResponse", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetAllCurrenciesResponse")
    public ArrayOfCurrencyNameResponse getAllCurrencies(
        @WebParam(name = "LicenseKey", targetNamespace = "http://www.serviceobjects.com/")
        String licenseKey);

    /**
     * Gives a list of the supported currency symbols with their associated country information.
     * 
     * @param licenseKey
     * @return
     *     returns com.serviceobjects.ArrayOfCountryCurrencyResponse
     */
    @WebMethod(operationName = "GetAllCountryCurrencies", action = "http://www.serviceobjects.com/GetAllCountryCurrencies")
    @WebResult(name = "GetAllCountryCurrenciesResult", targetNamespace = "http://www.serviceobjects.com/")
    @RequestWrapper(localName = "GetAllCountryCurrencies", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetAllCountryCurrencies")
    @ResponseWrapper(localName = "GetAllCountryCurrenciesResponse", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetAllCountryCurrenciesResponse")
    public ArrayOfCountryCurrencyResponse getAllCountryCurrencies(
        @WebParam(name = "LicenseKey", targetNamespace = "http://www.serviceobjects.com/")
        String licenseKey);

    /**
     * Gives the currency exchange rate between the two currencies.
     * 
     * @param convertFromCurrency
     * @param licenseKey
     * @param convertToCurrency
     * @return
     *     returns com.serviceobjects.ExchangeRateResponse
     */
    @WebMethod(operationName = "GetExchangeRate", action = "http://www.serviceobjects.com/GetExchangeRate")
    @WebResult(name = "GetExchangeRateResult", targetNamespace = "http://www.serviceobjects.com/")
    @RequestWrapper(localName = "GetExchangeRate", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetExchangeRate")
    @ResponseWrapper(localName = "GetExchangeRateResponse", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetExchangeRateResponse")
    public ExchangeRateResponse getExchangeRate(
        @WebParam(name = "ConvertFromCurrency", targetNamespace = "http://www.serviceobjects.com/")
        String convertFromCurrency,
        @WebParam(name = "ConvertToCurrency", targetNamespace = "http://www.serviceobjects.com/")
        String convertToCurrency,
        @WebParam(name = "LicenseKey", targetNamespace = "http://www.serviceobjects.com/")
        String licenseKey);

    /**
     * Gives the converted amount of currency.
     * 
     * @param convertFromCurrency
     * @param licenseKey
     * @param amount
     * @param convertToCurrency
     * @return
     *     returns com.serviceobjects.CurrencyConversionResponse
     */
    @WebMethod(operationName = "ConvertCurrency", action = "http://www.serviceobjects.com/ConvertCurrency")
    @WebResult(name = "ConvertCurrencyResult", targetNamespace = "http://www.serviceobjects.com/")
    @RequestWrapper(localName = "ConvertCurrency", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.ConvertCurrency")
    @ResponseWrapper(localName = "ConvertCurrencyResponse", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.ConvertCurrencyResponse")
    public CurrencyConversionResponse convertCurrency(
        @WebParam(name = "Amount", targetNamespace = "http://www.serviceobjects.com/")
        String amount,
        @WebParam(name = "ConvertFromCurrency", targetNamespace = "http://www.serviceobjects.com/")
        String convertFromCurrency,
        @WebParam(name = "ConvertToCurrency", targetNamespace = "http://www.serviceobjects.com/")
        String convertToCurrency,
        @WebParam(name = "LicenseKey", targetNamespace = "http://www.serviceobjects.com/")
        String licenseKey);

    /**
     * Input any country name, iso2 or iso3 to see that country's currency.
     * 
     * @param country
     * @param licenseKey
     * @return
     *     returns com.serviceobjects.CountryCurrencyResponse
     */
    @WebMethod(operationName = "GetCountryCurrency", action = "http://www.serviceobjects.com/GetCountryCurrency")
    @WebResult(name = "GetCountryCurrencyResult", targetNamespace = "http://www.serviceobjects.com/")
    @RequestWrapper(localName = "GetCountryCurrency", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetCountryCurrency")
    @ResponseWrapper(localName = "GetCountryCurrencyResponse", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetCountryCurrencyResponse")
    public CountryCurrencyResponse getCountryCurrency(
        @WebParam(name = "Country", targetNamespace = "http://www.serviceobjects.com/")
        String country,
        @WebParam(name = "LicenseKey", targetNamespace = "http://www.serviceobjects.com/")
        String licenseKey);

}
