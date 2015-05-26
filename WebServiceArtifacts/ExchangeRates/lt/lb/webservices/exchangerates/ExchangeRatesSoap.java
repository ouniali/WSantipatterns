
package lt.lb.webservices.exchangerates;

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
@WebService(name = "ExchangeRatesSoap", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExchangeRatesSoap {


    /**
     * Returns a list of currencies.
     * 
     * @return
     *     returns lt.lb.webservices.exchangerates.GetListOfCurrenciesResponse.GetListOfCurrenciesResult
     */
    @WebMethod(action = "http://webservices.lb.lt/ExchangeRates/getListOfCurrencies")
    @WebResult(name = "getListOfCurrenciesResult", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
    @RequestWrapper(localName = "getListOfCurrencies", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetListOfCurrencies")
    @ResponseWrapper(localName = "getListOfCurrenciesResponse", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetListOfCurrenciesResponse")
    public lt.lb.webservices.exchangerates.GetListOfCurrenciesResponse.GetListOfCurrenciesResult getListOfCurrencies();

    /**
     * Returns the current exchange rate (expressed in Litas per 1 currency unit) for the specified currency.
     * 
     * @param currency
     * @return
     *     returns java.math.BigDecimal
     */
    @WebMethod(action = "http://webservices.lb.lt/ExchangeRates/getCurrentExchangeRate")
    @WebResult(name = "getCurrentExchangeRateResult", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
    @RequestWrapper(localName = "getCurrentExchangeRate", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetCurrentExchangeRate")
    @ResponseWrapper(localName = "getCurrentExchangeRateResponse", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetCurrentExchangeRateResponse")
    public BigDecimal getCurrentExchangeRate(
        @WebParam(name = "Currency", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String currency);

    /**
     * Returns an exchange rate (expressed in Litas per 1 currency unit) for the specified currency and date.
     * 
     * @param date
     * @param currency
     * @return
     *     returns java.math.BigDecimal
     */
    @WebMethod(action = "http://webservices.lb.lt/ExchangeRates/getExchangeRate")
    @WebResult(name = "getExchangeRateResult", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
    @RequestWrapper(localName = "getExchangeRate", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeRate")
    @ResponseWrapper(localName = "getExchangeRateResponse", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeRateResponse")
    public BigDecimal getExchangeRate(
        @WebParam(name = "Currency", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String currency,
        @WebParam(name = "Date", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String date);

    /**
     * Returns a XML formatted string containing exchange rates for the specified date.
     * 
     * @param date
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "getExchangeRatesByDate_XmlString", action = "http://webservices.lb.lt/ExchangeRates/getExchangeRatesByDate_XmlString")
    @WebResult(name = "getExchangeRatesByDate_XmlStringResult", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
    @RequestWrapper(localName = "getExchangeRatesByDate_XmlString", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeRatesByDateXmlString")
    @ResponseWrapper(localName = "getExchangeRatesByDate_XmlStringResponse", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeRatesByDateXmlStringResponse")
    public String getExchangeRatesByDateXmlString(
        @WebParam(name = "Date", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String date);

    /**
     * Returns a XML formatted string containing exchange rates for the specified currency that are between specified dates.
     * 
     * @param dateLow
     * @param dateHigh
     * @param currency
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "getExchangeRatesByCurrency_XmlString", action = "http://webservices.lb.lt/ExchangeRates/getExchangeRatesByCurrency_XmlString")
    @WebResult(name = "getExchangeRatesByCurrency_XmlStringResult", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
    @RequestWrapper(localName = "getExchangeRatesByCurrency_XmlString", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeRatesByCurrencyXmlString")
    @ResponseWrapper(localName = "getExchangeRatesByCurrency_XmlStringResponse", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeRatesByCurrencyXmlStringResponse")
    public String getExchangeRatesByCurrencyXmlString(
        @WebParam(name = "Currency", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String currency,
        @WebParam(name = "DateLow", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String dateLow,
        @WebParam(name = "DateHigh", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String dateHigh);

    /**
     * Returns a list containing exchange rates for the specified date.
     * 
     * @param date
     * @return
     *     returns lt.lb.webservices.exchangerates.GetExchangeRatesByDateResponse.GetExchangeRatesByDateResult
     */
    @WebMethod(action = "http://webservices.lb.lt/ExchangeRates/getExchangeRatesByDate")
    @WebResult(name = "getExchangeRatesByDateResult", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
    @RequestWrapper(localName = "getExchangeRatesByDate", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeRatesByDate")
    @ResponseWrapper(localName = "getExchangeRatesByDateResponse", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeRatesByDateResponse")
    public lt.lb.webservices.exchangerates.GetExchangeRatesByDateResponse.GetExchangeRatesByDateResult getExchangeRatesByDate(
        @WebParam(name = "Date", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String date);

    /**
     * Returns a Xml Schema of provided Exchange Rates.
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://webservices.lb.lt/ExchangeRates/getExchangeRatesXmlSchema")
    @WebResult(name = "getExchangeRatesXmlSchemaResult", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
    @RequestWrapper(localName = "getExchangeRatesXmlSchema", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeRatesXmlSchema")
    @ResponseWrapper(localName = "getExchangeRatesXmlSchemaResponse", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeRatesXmlSchemaResponse")
    public String getExchangeRatesXmlSchema();

    /**
     * Returns a list containing exchange rates for the specified currency that are between specified dates.
     * 
     * @param dateLow
     * @param dateHigh
     * @param currency
     * @return
     *     returns lt.lb.webservices.exchangerates.GetExchangeRatesByCurrencyResponse.GetExchangeRatesByCurrencyResult
     */
    @WebMethod(action = "http://webservices.lb.lt/ExchangeRates/getExchangeRatesByCurrency")
    @WebResult(name = "getExchangeRatesByCurrencyResult", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
    @RequestWrapper(localName = "getExchangeRatesByCurrency", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeRatesByCurrency")
    @ResponseWrapper(localName = "getExchangeRatesByCurrencyResponse", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeRatesByCurrencyResponse")
    public lt.lb.webservices.exchangerates.GetExchangeRatesByCurrencyResponse.GetExchangeRatesByCurrencyResult getExchangeRatesByCurrency(
        @WebParam(name = "Currency", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String currency,
        @WebParam(name = "DateLow", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String dateLow,
        @WebParam(name = "DateHigh", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String dateHigh);

    /**
     * Returns a average exchange rate for the specified currency, between specified dates.
     * 
     * @param dateLow
     * @param dateHigh
     * @param currency
     * @return
     *     returns lt.lb.webservices.exchangerates.GetExchangeAvgRateResponse.GetExchangeAvgRateResult
     */
    @WebMethod(action = "http://webservices.lb.lt/ExchangeRates/getExchangeAvgRate")
    @WebResult(name = "getExchangeAvgRateResult", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
    @RequestWrapper(localName = "getExchangeAvgRate", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeAvgRate")
    @ResponseWrapper(localName = "getExchangeAvgRateResponse", targetNamespace = "http://webservices.lb.lt/ExchangeRates", className = "lt.lb.webservices.exchangerates.GetExchangeAvgRateResponse")
    public lt.lb.webservices.exchangerates.GetExchangeAvgRateResponse.GetExchangeAvgRateResult getExchangeAvgRate(
        @WebParam(name = "Currency", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String currency,
        @WebParam(name = "DateLow", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String dateLow,
        @WebParam(name = "DateHigh", targetNamespace = "http://webservices.lb.lt/ExchangeRates")
        String dateHigh);

}
