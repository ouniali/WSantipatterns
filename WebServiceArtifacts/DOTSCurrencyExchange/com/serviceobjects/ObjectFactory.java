
package com.serviceobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.serviceobjects package. 
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

    private final static QName _ExchangeRateResponse_QNAME = new QName("http://www.serviceobjects.com/", "ExchangeRateResponse");
    private final static QName _CurrencyConversionResponse_QNAME = new QName("http://www.serviceobjects.com/", "CurrencyConversionResponse");
    private final static QName _ArrayOfCountryCurrencyResponse_QNAME = new QName("http://www.serviceobjects.com/", "ArrayOfCountryCurrencyResponse");
    private final static QName _ArrayOfCurrencyNameResponse_QNAME = new QName("http://www.serviceobjects.com/", "ArrayOfCurrencyNameResponse");
    private final static QName _CountryCurrencyResponse_QNAME = new QName("http://www.serviceobjects.com/", "CountryCurrencyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.serviceobjects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCurrencies }
     * 
     */
    public GetAllCurrencies createGetAllCurrencies() {
        return new GetAllCurrencies();
    }

    /**
     * Create an instance of {@link GetExchangeRate }
     * 
     */
    public GetExchangeRate createGetExchangeRate() {
        return new GetExchangeRate();
    }

    /**
     * Create an instance of {@link GetExchangeRateResponse }
     * 
     */
    public GetExchangeRateResponse createGetExchangeRateResponse() {
        return new GetExchangeRateResponse();
    }

    /**
     * Create an instance of {@link ExchangeRateResponse }
     * 
     */
    public ExchangeRateResponse createExchangeRateResponse() {
        return new ExchangeRateResponse();
    }

    /**
     * Create an instance of {@link GetCountryCurrency }
     * 
     */
    public GetCountryCurrency createGetCountryCurrency() {
        return new GetCountryCurrency();
    }

    /**
     * Create an instance of {@link CurrencyConversionResponse }
     * 
     */
    public CurrencyConversionResponse createCurrencyConversionResponse() {
        return new CurrencyConversionResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCountryCurrencyResponse }
     * 
     */
    public ArrayOfCountryCurrencyResponse createArrayOfCountryCurrencyResponse() {
        return new ArrayOfCountryCurrencyResponse();
    }

    /**
     * Create an instance of {@link ConvertCurrencyResponse }
     * 
     */
    public ConvertCurrencyResponse createConvertCurrencyResponse() {
        return new ConvertCurrencyResponse();
    }

    /**
     * Create an instance of {@link GetAllCountryCurrencies }
     * 
     */
    public GetAllCountryCurrencies createGetAllCountryCurrencies() {
        return new GetAllCountryCurrencies();
    }

    /**
     * Create an instance of {@link CountryCurrencyResponse }
     * 
     */
    public CountryCurrencyResponse createCountryCurrencyResponse() {
        return new CountryCurrencyResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCurrencyNameResponse }
     * 
     */
    public ArrayOfCurrencyNameResponse createArrayOfCurrencyNameResponse() {
        return new ArrayOfCurrencyNameResponse();
    }

    /**
     * Create an instance of {@link GetCountryCurrencyResponse }
     * 
     */
    public GetCountryCurrencyResponse createGetCountryCurrencyResponse() {
        return new GetCountryCurrencyResponse();
    }

    /**
     * Create an instance of {@link ConvertCurrency }
     * 
     */
    public ConvertCurrency createConvertCurrency() {
        return new ConvertCurrency();
    }

    /**
     * Create an instance of {@link GetAllCurrenciesResponse }
     * 
     */
    public GetAllCurrenciesResponse createGetAllCurrenciesResponse() {
        return new GetAllCurrenciesResponse();
    }

    /**
     * Create an instance of {@link GetAllCountryCurrenciesResponse }
     * 
     */
    public GetAllCountryCurrenciesResponse createGetAllCountryCurrenciesResponse() {
        return new GetAllCountryCurrenciesResponse();
    }

    /**
     * Create an instance of {@link CurrencyNameResponse }
     * 
     */
    public CurrencyNameResponse createCurrencyNameResponse() {
        return new CurrencyNameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com/", name = "ExchangeRateResponse")
    public JAXBElement<ExchangeRateResponse> createExchangeRateResponse(ExchangeRateResponse value) {
        return new JAXBElement<ExchangeRateResponse>(_ExchangeRateResponse_QNAME, ExchangeRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyConversionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com/", name = "CurrencyConversionResponse")
    public JAXBElement<CurrencyConversionResponse> createCurrencyConversionResponse(CurrencyConversionResponse value) {
        return new JAXBElement<CurrencyConversionResponse>(_CurrencyConversionResponse_QNAME, CurrencyConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCountryCurrencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com/", name = "ArrayOfCountryCurrencyResponse")
    public JAXBElement<ArrayOfCountryCurrencyResponse> createArrayOfCountryCurrencyResponse(ArrayOfCountryCurrencyResponse value) {
        return new JAXBElement<ArrayOfCountryCurrencyResponse>(_ArrayOfCountryCurrencyResponse_QNAME, ArrayOfCountryCurrencyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrencyNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com/", name = "ArrayOfCurrencyNameResponse")
    public JAXBElement<ArrayOfCurrencyNameResponse> createArrayOfCurrencyNameResponse(ArrayOfCurrencyNameResponse value) {
        return new JAXBElement<ArrayOfCurrencyNameResponse>(_ArrayOfCurrencyNameResponse_QNAME, ArrayOfCurrencyNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryCurrencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com/", name = "CountryCurrencyResponse")
    public JAXBElement<CountryCurrencyResponse> createCountryCurrencyResponse(CountryCurrencyResponse value) {
        return new JAXBElement<CountryCurrencyResponse>(_CountryCurrencyResponse_QNAME, CountryCurrencyResponse.class, null, value);
    }

}
