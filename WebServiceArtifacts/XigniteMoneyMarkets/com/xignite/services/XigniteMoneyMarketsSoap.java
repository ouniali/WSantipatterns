
package com.xignite.services;

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
@WebService(name = "XigniteMoneyMarketsSoap", targetNamespace = "http://www.xignite.com/services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface XigniteMoneyMarketsSoap {


    /**
     * Returns a Swap rate
     * 
     * @param currency
     * @param type
     * @return
     *     returns com.xignite.services.SwapRate
     */
    @WebMethod(operationName = "GetSwapRate", action = "http://www.xignite.com/services/GetSwapRate")
    @WebResult(name = "GetSwapRateResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetSwapRate", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetSwapRate")
    @ResponseWrapper(localName = "GetSwapRateResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetSwapRateResponse")
    public SwapRate getSwapRate(
        @WebParam(name = "Type", targetNamespace = "http://www.xignite.com/services/")
        SwapRateTypes type,
        @WebParam(name = "Currency", targetNamespace = "http://www.xignite.com/services/")
        SwapCurrencyTypes currency);

    /**
     * Returns a real-time Treasury rate
     * 
     * @param currency
     * @param type
     * @return
     *     returns com.xignite.services.InterestRate
     */
    @WebMethod(operationName = "GetTreasuryRate", action = "http://www.xignite.com/services/GetTreasuryRate")
    @WebResult(name = "GetTreasuryRateResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetTreasuryRate", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetTreasuryRate")
    @ResponseWrapper(localName = "GetTreasuryRateResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetTreasuryRateResponse")
    public InterestRate getTreasuryRate(
        @WebParam(name = "Type", targetNamespace = "http://www.xignite.com/services/")
        TreasuryRateTypes type,
        @WebParam(name = "Currency", targetNamespace = "http://www.xignite.com/services/")
        TreasuryCurrencyTypes currency);

    /**
     * List supported interest rates.
     * 
     * @return
     *     returns com.xignite.services.ArrayOfRateDescription
     */
    @WebMethod(operationName = "ListRates", action = "http://www.xignite.com/services/ListRates")
    @WebResult(name = "ListRatesResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "ListRates", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.ListRates")
    @ResponseWrapper(localName = "ListRatesResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.ListRatesResponse")
    public ArrayOfRateDescription listRates();

    /**
     * Search rate names and description
     * 
     * @param pattern
     * @return
     *     returns com.xignite.services.ArrayOfRateDescription
     */
    @WebMethod(operationName = "SearchRates", action = "http://www.xignite.com/services/SearchRates")
    @WebResult(name = "SearchRatesResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "SearchRates", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchRates")
    @ResponseWrapper(localName = "SearchRatesResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.SearchRatesResponse")
    public ArrayOfRateDescription searchRates(
        @WebParam(name = "Pattern", targetNamespace = "http://www.xignite.com/services/")
        String pattern);

    /**
     * Returns a calculated Forward Rate Agreement as of a date
     * 
     * @param firstType
     * @param currency
     * @param asOfDate
     * @param secondType
     * @return
     *     returns com.xignite.services.ForwardRateAgreement
     */
    @WebMethod(operationName = "GetForwardRateAgreement", action = "http://www.xignite.com/services/GetForwardRateAgreement")
    @WebResult(name = "GetForwardRateAgreementResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetForwardRateAgreement", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetForwardRateAgreement")
    @ResponseWrapper(localName = "GetForwardRateAgreementResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetForwardRateAgreementResponse")
    public ForwardRateAgreement getForwardRateAgreement(
        @WebParam(name = "FirstType", targetNamespace = "http://www.xignite.com/services/")
        LIBORTypes firstType,
        @WebParam(name = "SecondType", targetNamespace = "http://www.xignite.com/services/")
        LIBORTypes secondType,
        @WebParam(name = "Currency", targetNamespace = "http://www.xignite.com/services/")
        LIBORCurrencyTypes currency,
        @WebParam(name = "AsOfDate", targetNamespace = "http://www.xignite.com/services/")
        String asOfDate);

    /**
     * Returns an IMM EuroDollar Synthetic Forward Rate strip
     * 
     * @return
     *     returns com.xignite.services.ArrayOfEuroDollarFRA
     */
    @WebMethod(operationName = "GetEuroDollarFRAStrip", action = "http://www.xignite.com/services/GetEuroDollarFRAStrip")
    @WebResult(name = "GetEuroDollarFRAStripResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetEuroDollarFRAStrip", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEuroDollarFRAStrip")
    @ResponseWrapper(localName = "GetEuroDollarFRAStripResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEuroDollarFRAStripResponse")
    public ArrayOfEuroDollarFRA getEuroDollarFRAStrip();

    /**
     * Returns a Swaption rate
     * 
     * @param firstType
     * @param currency
     * @param secondType
     * @return
     *     returns com.xignite.services.Swaption
     */
    @WebMethod(operationName = "GetSwaption", action = "http://www.xignite.com/services/GetSwaption")
    @WebResult(name = "GetSwaptionResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetSwaption", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetSwaption")
    @ResponseWrapper(localName = "GetSwaptionResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetSwaptionResponse")
    public Swaption getSwaption(
        @WebParam(name = "FirstType", targetNamespace = "http://www.xignite.com/services/")
        SwaptionTypes firstType,
        @WebParam(name = "SecondType", targetNamespace = "http://www.xignite.com/services/")
        SwaptionTypes secondType,
        @WebParam(name = "Currency", targetNamespace = "http://www.xignite.com/services/")
        SwapCurrencyTypes currency);

    /**
     * Returns a Swaption rate Family
     * 
     * @param currency
     * @return
     *     returns com.xignite.services.ArrayOfSwaption
     */
    @WebMethod(operationName = "GetSwaptionFamily", action = "http://www.xignite.com/services/GetSwaptionFamily")
    @WebResult(name = "GetSwaptionFamilyResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetSwaptionFamily", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetSwaptionFamily")
    @ResponseWrapper(localName = "GetSwaptionFamilyResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetSwaptionFamilyResponse")
    public ArrayOfSwaption getSwaptionFamily(
        @WebParam(name = "Currency", targetNamespace = "http://www.xignite.com/services/")
        SwapCurrencyTypes currency);

    /**
     * Returns a Swaption as of a historical date
     * 
     * @param firstType
     * @param currency
     * @param asOfDate
     * @param secondType
     * @return
     *     returns com.xignite.services.Swaption
     */
    @WebMethod(operationName = "GetHistoricalSwaption", action = "http://www.xignite.com/services/GetHistoricalSwaption")
    @WebResult(name = "GetHistoricalSwaptionResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetHistoricalSwaption", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetHistoricalSwaption")
    @ResponseWrapper(localName = "GetHistoricalSwaptionResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetHistoricalSwaptionResponse")
    public Swaption getHistoricalSwaption(
        @WebParam(name = "FirstType", targetNamespace = "http://www.xignite.com/services/")
        SwaptionTypes firstType,
        @WebParam(name = "SecondType", targetNamespace = "http://www.xignite.com/services/")
        SwaptionTypes secondType,
        @WebParam(name = "Currency", targetNamespace = "http://www.xignite.com/services/")
        SwapCurrencyTypes currency,
        @WebParam(name = "AsOfDate", targetNamespace = "http://www.xignite.com/services/")
        String asOfDate);

    /**
     * Returns a Swaption rate Family
     * 
     * @param currency
     * @param asOfDate
     * @return
     *     returns com.xignite.services.ArrayOfSwaption
     */
    @WebMethod(operationName = "GetHistoricalSwaptionFamily", action = "http://www.xignite.com/services/GetHistoricalSwaptionFamily")
    @WebResult(name = "GetHistoricalSwaptionFamilyResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetHistoricalSwaptionFamily", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetHistoricalSwaptionFamily")
    @ResponseWrapper(localName = "GetHistoricalSwaptionFamilyResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetHistoricalSwaptionFamilyResponse")
    public ArrayOfSwaption getHistoricalSwaptionFamily(
        @WebParam(name = "Currency", targetNamespace = "http://www.xignite.com/services/")
        SwapCurrencyTypes currency,
        @WebParam(name = "AsOfDate", targetNamespace = "http://www.xignite.com/services/")
        String asOfDate);

    /**
     * Returns a Swap rate Family
     * 
     * @param currency
     * @return
     *     returns com.xignite.services.ArrayOfSwapRate
     */
    @WebMethod(operationName = "GetSwapRateFamily", action = "http://www.xignite.com/services/GetSwapRateFamily")
    @WebResult(name = "GetSwapRateFamilyResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetSwapRateFamily", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetSwapRateFamily")
    @ResponseWrapper(localName = "GetSwapRateFamilyResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetSwapRateFamilyResponse")
    public ArrayOfSwapRate getSwapRateFamily(
        @WebParam(name = "Currency", targetNamespace = "http://www.xignite.com/services/")
        SwapCurrencyTypes currency);

    /**
     * Returns a Swap rate as of a historical date
     * 
     * @param currency
     * @param type
     * @param asOfDate
     * @return
     *     returns com.xignite.services.SwapRate
     */
    @WebMethod(operationName = "GetHistoricalSwapRate", action = "http://www.xignite.com/services/GetHistoricalSwapRate")
    @WebResult(name = "GetHistoricalSwapRateResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetHistoricalSwapRate", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetHistoricalSwapRate")
    @ResponseWrapper(localName = "GetHistoricalSwapRateResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetHistoricalSwapRateResponse")
    public SwapRate getHistoricalSwapRate(
        @WebParam(name = "Type", targetNamespace = "http://www.xignite.com/services/")
        SwapRateTypes type,
        @WebParam(name = "Currency", targetNamespace = "http://www.xignite.com/services/")
        SwapCurrencyTypes currency,
        @WebParam(name = "AsOfDate", targetNamespace = "http://www.xignite.com/services/")
        String asOfDate);

    /**
     * Returns a Swap rate as of a historical date
     * 
     * @param endDate
     * @param currency
     * @param type
     * @param startDate
     * @return
     *     returns com.xignite.services.ArrayOfSwapRate
     */
    @WebMethod(operationName = "GetHistoricalSwapRateRange", action = "http://www.xignite.com/services/GetHistoricalSwapRateRange")
    @WebResult(name = "GetHistoricalSwapRateRangeResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetHistoricalSwapRateRange", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetHistoricalSwapRateRange")
    @ResponseWrapper(localName = "GetHistoricalSwapRateRangeResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetHistoricalSwapRateRangeResponse")
    public ArrayOfSwapRate getHistoricalSwapRateRange(
        @WebParam(name = "Type", targetNamespace = "http://www.xignite.com/services/")
        SwapRateTypes type,
        @WebParam(name = "Currency", targetNamespace = "http://www.xignite.com/services/")
        SwapCurrencyTypes currency,
        @WebParam(name = "StartDate", targetNamespace = "http://www.xignite.com/services/")
        String startDate,
        @WebParam(name = "EndDate", targetNamespace = "http://www.xignite.com/services/")
        String endDate);

    /**
     * Returns a real-time Treasury rate family.
     * 
     * @param currency
     * @return
     *     returns com.xignite.services.ArrayOfInterestRate
     */
    @WebMethod(operationName = "GetTreasuryRateFamily", action = "http://www.xignite.com/services/GetTreasuryRateFamily")
    @WebResult(name = "GetTreasuryRateFamilyResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetTreasuryRateFamily", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetTreasuryRateFamily")
    @ResponseWrapper(localName = "GetTreasuryRateFamilyResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetTreasuryRateFamilyResponse")
    public ArrayOfInterestRate getTreasuryRateFamily(
        @WebParam(name = "Currency", targetNamespace = "http://www.xignite.com/services/")
        TreasuryCurrencyTypes currency);

}
