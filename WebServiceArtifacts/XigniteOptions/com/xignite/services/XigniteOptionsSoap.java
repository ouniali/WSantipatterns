
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
@WebService(name = "XigniteOptionsSoap", targetNamespace = "http://www.xignite.com/services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface XigniteOptionsSoap {


    /**
     * Calculates the value of an option using the Black-Scholes formula.
     * 
     * @param riskFreeRate
     * @param yearsToMaturity
     * @param volatility
     * @param type
     * @param stockPrice
     * @param strikePrice
     * @return
     *     returns com.xignite.services.NumericResult
     */
    @WebMethod(operationName = "GetBlackScholesOptionValue", action = "http://www.xignite.com/services/GetBlackScholesOptionValue")
    @WebResult(name = "GetBlackScholesOptionValueResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetBlackScholesOptionValue", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetBlackScholesOptionValue")
    @ResponseWrapper(localName = "GetBlackScholesOptionValueResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetBlackScholesOptionValueResponse")
    public NumericResult getBlackScholesOptionValue(
        @WebParam(name = "Type", targetNamespace = "http://www.xignite.com/services/")
        OptionType type,
        @WebParam(name = "StockPrice", targetNamespace = "http://www.xignite.com/services/")
        double stockPrice,
        @WebParam(name = "StrikePrice", targetNamespace = "http://www.xignite.com/services/")
        double strikePrice,
        @WebParam(name = "YearsToMaturity", targetNamespace = "http://www.xignite.com/services/")
        double yearsToMaturity,
        @WebParam(name = "RiskFreeRate", targetNamespace = "http://www.xignite.com/services/")
        double riskFreeRate,
        @WebParam(name = "Volatility", targetNamespace = "http://www.xignite.com/services/")
        double volatility);

    /**
     * Returns options chains for an equity.
     * 
     * @param identifier
     * @param identifierType
     * @return
     *     returns com.xignite.services.Options
     */
    @WebMethod(operationName = "GetAllEquityOptionChain", action = "http://www.xignite.com/services/GetAllEquityOptionChain")
    @WebResult(name = "GetAllEquityOptionChainResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetAllEquityOptionChain", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetAllEquityOptionChain")
    @ResponseWrapper(localName = "GetAllEquityOptionChainResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetAllEquityOptionChainResponse")
    public Options getAllEquityOptionChain(
        @WebParam(name = "Identifier", targetNamespace = "http://www.xignite.com/services/")
        String identifier,
        @WebParam(name = "IdentifierType", targetNamespace = "http://www.xignite.com/services/")
        IdentifierTypes identifierType);

    /**
     * Returns extended options chains for an equity.
     * 
     * @param identifier
     * @param identifierType
     * @return
     *     returns com.xignite.services.ExtendedOptions
     */
    @WebMethod(operationName = "GetAllExtendedEquityOptionChain", action = "http://www.xignite.com/services/GetAllExtendedEquityOptionChain")
    @WebResult(name = "GetAllExtendedEquityOptionChainResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetAllExtendedEquityOptionChain", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetAllExtendedEquityOptionChain")
    @ResponseWrapper(localName = "GetAllExtendedEquityOptionChainResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetAllExtendedEquityOptionChainResponse")
    public ExtendedOptions getAllExtendedEquityOptionChain(
        @WebParam(name = "Identifier", targetNamespace = "http://www.xignite.com/services/")
        String identifier,
        @WebParam(name = "IdentifierType", targetNamespace = "http://www.xignite.com/services/")
        IdentifierTypes identifierType);

    /**
     * Returns options chain for an equity.
     * 
     * @param identifier
     * @param month
     * @param year
     * @param identifierType
     * @return
     *     returns com.xignite.services.Options
     */
    @WebMethod(operationName = "GetEquityOptionChain", action = "http://www.xignite.com/services/GetEquityOptionChain")
    @WebResult(name = "GetEquityOptionChainResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetEquityOptionChain", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEquityOptionChain")
    @ResponseWrapper(localName = "GetEquityOptionChainResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEquityOptionChainResponse")
    public Options getEquityOptionChain(
        @WebParam(name = "Identifier", targetNamespace = "http://www.xignite.com/services/")
        String identifier,
        @WebParam(name = "IdentifierType", targetNamespace = "http://www.xignite.com/services/")
        IdentifierTypes identifierType,
        @WebParam(name = "Month", targetNamespace = "http://www.xignite.com/services/")
        int month,
        @WebParam(name = "Year", targetNamespace = "http://www.xignite.com/services/")
        int year);

    /**
     * Returns extended options chain for an equity.
     * 
     * @param identifier
     * @param month
     * @param year
     * @param identifierType
     * @return
     *     returns com.xignite.services.ExtendedOptions
     */
    @WebMethod(operationName = "GetExtendedEquityOptionChain", action = "http://www.xignite.com/services/GetExtendedEquityOptionChain")
    @WebResult(name = "GetExtendedEquityOptionChainResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetExtendedEquityOptionChain", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetExtendedEquityOptionChain")
    @ResponseWrapper(localName = "GetExtendedEquityOptionChainResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetExtendedEquityOptionChainResponse")
    public ExtendedOptions getExtendedEquityOptionChain(
        @WebParam(name = "Identifier", targetNamespace = "http://www.xignite.com/services/")
        String identifier,
        @WebParam(name = "IdentifierType", targetNamespace = "http://www.xignite.com/services/")
        IdentifierTypes identifierType,
        @WebParam(name = "Month", targetNamespace = "http://www.xignite.com/services/")
        int month,
        @WebParam(name = "Year", targetNamespace = "http://www.xignite.com/services/")
        int year);

    /**
     * Returns a specific equity option.
     * 
     * @param identifier
     * @param month
     * @param year
     * @param identifierType
     * @param type
     * @param strikePrice
     * @return
     *     returns com.xignite.services.Option
     */
    @WebMethod(operationName = "GetEquityOption", action = "http://www.xignite.com/services/GetEquityOption")
    @WebResult(name = "GetEquityOptionResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetEquityOption", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEquityOption")
    @ResponseWrapper(localName = "GetEquityOptionResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEquityOptionResponse")
    public Option getEquityOption(
        @WebParam(name = "Identifier", targetNamespace = "http://www.xignite.com/services/")
        String identifier,
        @WebParam(name = "IdentifierType", targetNamespace = "http://www.xignite.com/services/")
        IdentifierTypes identifierType,
        @WebParam(name = "Type", targetNamespace = "http://www.xignite.com/services/")
        OptionTypes type,
        @WebParam(name = "Month", targetNamespace = "http://www.xignite.com/services/")
        int month,
        @WebParam(name = "Year", targetNamespace = "http://www.xignite.com/services/")
        int year,
        @WebParam(name = "StrikePrice", targetNamespace = "http://www.xignite.com/services/")
        double strikePrice);

    /**
     * Returns a specific equity extended option.
     * 
     * @param identifier
     * @param month
     * @param year
     * @param identifierType
     * @param type
     * @param strikePrice
     * @return
     *     returns com.xignite.services.ExtendedOption
     */
    @WebMethod(operationName = "GetExtendedEquityOption", action = "http://www.xignite.com/services/GetExtendedEquityOption")
    @WebResult(name = "GetExtendedEquityOptionResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetExtendedEquityOption", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetExtendedEquityOption")
    @ResponseWrapper(localName = "GetExtendedEquityOptionResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetExtendedEquityOptionResponse")
    public ExtendedOption getExtendedEquityOption(
        @WebParam(name = "Identifier", targetNamespace = "http://www.xignite.com/services/")
        String identifier,
        @WebParam(name = "IdentifierType", targetNamespace = "http://www.xignite.com/services/")
        IdentifierTypes identifierType,
        @WebParam(name = "Type", targetNamespace = "http://www.xignite.com/services/")
        OptionTypes type,
        @WebParam(name = "Month", targetNamespace = "http://www.xignite.com/services/")
        int month,
        @WebParam(name = "Year", targetNamespace = "http://www.xignite.com/services/")
        int year,
        @WebParam(name = "StrikePrice", targetNamespace = "http://www.xignite.com/services/")
        double strikePrice);

    /**
     * Returns the symbol for an equity option based on month, year and strike price.
     * 
     * @param identifier
     * @param month
     * @param year
     * @param identifierType
     * @param type
     * @param strikePrice
     * @return
     *     returns com.xignite.services.OptionSymbol
     */
    @WebMethod(operationName = "GetEquityOptionSymbol", action = "http://www.xignite.com/services/GetEquityOptionSymbol")
    @WebResult(name = "GetEquityOptionSymbolResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetEquityOptionSymbol", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEquityOptionSymbol")
    @ResponseWrapper(localName = "GetEquityOptionSymbolResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEquityOptionSymbolResponse")
    public OptionSymbol getEquityOptionSymbol(
        @WebParam(name = "Identifier", targetNamespace = "http://www.xignite.com/services/")
        String identifier,
        @WebParam(name = "IdentifierType", targetNamespace = "http://www.xignite.com/services/")
        IdentifierTypes identifierType,
        @WebParam(name = "Type", targetNamespace = "http://www.xignite.com/services/")
        OptionTypes type,
        @WebParam(name = "Month", targetNamespace = "http://www.xignite.com/services/")
        int month,
        @WebParam(name = "Year", targetNamespace = "http://www.xignite.com/services/")
        int year,
        @WebParam(name = "StrikePrice", targetNamespace = "http://www.xignite.com/services/")
        double strikePrice);

    /**
     * Returns a specific equity option.
     * 
     * @param symbol
     * @return
     *     returns com.xignite.services.Option
     */
    @WebMethod(operationName = "GetEquityOptionBySymbol", action = "http://www.xignite.com/services/GetEquityOptionBySymbol")
    @WebResult(name = "GetEquityOptionBySymbolResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetEquityOptionBySymbol", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEquityOptionBySymbol")
    @ResponseWrapper(localName = "GetEquityOptionBySymbolResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEquityOptionBySymbolResponse")
    public Option getEquityOptionBySymbol(
        @WebParam(name = "Symbol", targetNamespace = "http://www.xignite.com/services/")
        String symbol);

    /**
     * Returns a specific equity extended option.
     * 
     * @param symbol
     * @return
     *     returns com.xignite.services.ExtendedOption
     */
    @WebMethod(operationName = "GetExtendedEquityOptionBySymbol", action = "http://www.xignite.com/services/GetExtendedEquityOptionBySymbol")
    @WebResult(name = "GetExtendedEquityOptionBySymbolResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetExtendedEquityOptionBySymbol", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetExtendedEquityOptionBySymbol")
    @ResponseWrapper(localName = "GetExtendedEquityOptionBySymbolResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetExtendedEquityOptionBySymbolResponse")
    public ExtendedOption getExtendedEquityOptionBySymbol(
        @WebParam(name = "Symbol", targetNamespace = "http://www.xignite.com/services/")
        String symbol);

    /**
     * Returns an array of specific equity options.
     * 
     * @param symbols
     * @return
     *     returns com.xignite.services.ArrayOfOption
     */
    @WebMethod(operationName = "GetEquityOptionBySymbols", action = "http://www.xignite.com/services/GetEquityOptionBySymbols")
    @WebResult(name = "GetEquityOptionBySymbolsResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetEquityOptionBySymbols", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEquityOptionBySymbols")
    @ResponseWrapper(localName = "GetEquityOptionBySymbolsResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetEquityOptionBySymbolsResponse")
    public ArrayOfOption getEquityOptionBySymbols(
        @WebParam(name = "Symbols", targetNamespace = "http://www.xignite.com/services/")
        String symbols);

    /**
     * Returns an array of specific equity extended options.
     * 
     * @param symbols
     * @return
     *     returns com.xignite.services.ArrayOfExtendedOption
     */
    @WebMethod(operationName = "GetExtendedEquityOptionBySymbols", action = "http://www.xignite.com/services/GetExtendedEquityOptionBySymbols")
    @WebResult(name = "GetExtendedEquityOptionBySymbolsResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetExtendedEquityOptionBySymbols", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetExtendedEquityOptionBySymbols")
    @ResponseWrapper(localName = "GetExtendedEquityOptionBySymbolsResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetExtendedEquityOptionBySymbolsResponse")
    public ArrayOfExtendedOption getExtendedEquityOptionBySymbols(
        @WebParam(name = "Symbols", targetNamespace = "http://www.xignite.com/services/")
        String symbols);

    /**
     * Returns a specific future option.
     * 
     * @param symbol
     * @param month
     * @param year
     * @param type
     * @param strikePrice
     * @return
     *     returns com.xignite.services.FutureOption
     */
    @WebMethod(operationName = "GetFutureOption", action = "http://www.xignite.com/services/GetFutureOption")
    @WebResult(name = "GetFutureOptionResult", targetNamespace = "http://www.xignite.com/services/")
    @RequestWrapper(localName = "GetFutureOption", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetFutureOption")
    @ResponseWrapper(localName = "GetFutureOptionResponse", targetNamespace = "http://www.xignite.com/services/", className = "com.xignite.services.GetFutureOptionResponse")
    public FutureOption getFutureOption(
        @WebParam(name = "Symbol", targetNamespace = "http://www.xignite.com/services/")
        String symbol,
        @WebParam(name = "Type", targetNamespace = "http://www.xignite.com/services/")
        OptionTypes type,
        @WebParam(name = "Month", targetNamespace = "http://www.xignite.com/services/")
        int month,
        @WebParam(name = "Year", targetNamespace = "http://www.xignite.com/services/")
        int year,
        @WebParam(name = "StrikePrice", targetNamespace = "http://www.xignite.com/services/")
        double strikePrice);

}
