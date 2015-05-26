
package com.xignite.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xignite.services package. 
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

    private final static QName _ArrayOfRate_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfRate");
    private final static QName _Rate_QNAME = new QName("http://www.xignite.com/services/", "Rate");
    private final static QName _ArrayOfBar_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfBar");
    private final static QName _Currencies_QNAME = new QName("http://www.xignite.com/services/", "Currencies");
    private final static QName _HistoricalRate_QNAME = new QName("http://www.xignite.com/services/", "HistoricalRate");
    private final static QName _ForwardRate_QNAME = new QName("http://www.xignite.com/services/", "ForwardRate");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _HistoricalRateBidAsk_QNAME = new QName("http://www.xignite.com/services/", "HistoricalRateBidAsk");
    private final static QName _RateConversion_QNAME = new QName("http://www.xignite.com/services/", "RateConversion");
    private final static QName _ArrayOfHistoricalRate_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfHistoricalRate");
    private final static QName _Bar_QNAME = new QName("http://www.xignite.com/services/", "Bar");
    private final static QName _CurrencyChartBars_QNAME = new QName("http://www.xignite.com/services/", "CurrencyChartBars");
    private final static QName _Tick_QNAME = new QName("http://www.xignite.com/services/", "Tick");
    private final static QName _ArrayOfTick_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfTick");
    private final static QName _RateTable_QNAME = new QName("http://www.xignite.com/services/", "RateTable");
    private final static QName _ArrayOfHistoricalRateBidAsk_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfHistoricalRateBidAsk");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfRate }
     * 
     */
    public ArrayOfRate createArrayOfRate() {
        return new ArrayOfRate();
    }

    /**
     * Create an instance of {@link GetBestCrossRate }
     * 
     */
    public GetBestCrossRate createGetBestCrossRate() {
        return new GetBestCrossRate();
    }

    /**
     * Create an instance of {@link GetHistoricalRatesResponse }
     * 
     */
    public GetHistoricalRatesResponse createGetHistoricalRatesResponse() {
        return new GetHistoricalRatesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHistoricalRate }
     * 
     */
    public ArrayOfHistoricalRate createArrayOfHistoricalRate() {
        return new ArrayOfHistoricalRate();
    }

    /**
     * Create an instance of {@link GetHistoricalRateResponse }
     * 
     */
    public GetHistoricalRateResponse createGetHistoricalRateResponse() {
        return new GetHistoricalRateResponse();
    }

    /**
     * Create an instance of {@link HistoricalRate }
     * 
     */
    public HistoricalRate createHistoricalRate() {
        return new HistoricalRate();
    }

    /**
     * Create an instance of {@link GetForwardRate }
     * 
     */
    public GetForwardRate createGetForwardRate() {
        return new GetForwardRate();
    }

    /**
     * Create an instance of {@link GetHistoricalRates }
     * 
     */
    public GetHistoricalRates createGetHistoricalRates() {
        return new GetHistoricalRates();
    }

    /**
     * Create an instance of {@link GetLatestCrossRate }
     * 
     */
    public GetLatestCrossRate createGetLatestCrossRate() {
        return new GetLatestCrossRate();
    }

    /**
     * Create an instance of {@link GetBar }
     * 
     */
    public GetBar createGetBar() {
        return new GetBar();
    }

    /**
     * Create an instance of {@link GetTicksResponse }
     * 
     */
    public GetTicksResponse createGetTicksResponse() {
        return new GetTicksResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTick }
     * 
     */
    public ArrayOfTick createArrayOfTick() {
        return new ArrayOfTick();
    }

    /**
     * Create an instance of {@link ConvertRealTimeValue }
     * 
     */
    public ConvertRealTimeValue createConvertRealTimeValue() {
        return new ConvertRealTimeValue();
    }

    /**
     * Create an instance of {@link RateTable }
     * 
     */
    public RateTable createRateTable() {
        return new RateTable();
    }

    /**
     * Create an instance of {@link ConvertRealTimeValueResponse }
     * 
     */
    public ConvertRealTimeValueResponse createConvertRealTimeValueResponse() {
        return new ConvertRealTimeValueResponse();
    }

    /**
     * Create an instance of {@link RateConversion }
     * 
     */
    public RateConversion createRateConversion() {
        return new RateConversion();
    }

    /**
     * Create an instance of {@link ConvertHistoricalValue }
     * 
     */
    public ConvertHistoricalValue createConvertHistoricalValue() {
        return new ConvertHistoricalValue();
    }

    /**
     * Create an instance of {@link Tick }
     * 
     */
    public Tick createTick() {
        return new Tick();
    }

    /**
     * Create an instance of {@link GetForwardRateResponse }
     * 
     */
    public GetForwardRateResponse createGetForwardRateResponse() {
        return new GetForwardRateResponse();
    }

    /**
     * Create an instance of {@link ForwardRate }
     * 
     */
    public ForwardRate createForwardRate() {
        return new ForwardRate();
    }

    /**
     * Create an instance of {@link GetBestCrossRates }
     * 
     */
    public GetBestCrossRates createGetBestCrossRates() {
        return new GetBestCrossRates();
    }

    /**
     * Create an instance of {@link GetBars }
     * 
     */
    public GetBars createGetBars() {
        return new GetBars();
    }

    /**
     * Create an instance of {@link GetChartBarsResponse }
     * 
     */
    public GetChartBarsResponse createGetChartBarsResponse() {
        return new GetChartBarsResponse();
    }

    /**
     * Create an instance of {@link CurrencyChartBars }
     * 
     */
    public CurrencyChartBars createCurrencyChartBars() {
        return new CurrencyChartBars();
    }

    /**
     * Create an instance of {@link GetAllRealTimeRatesResponse }
     * 
     */
    public GetAllRealTimeRatesResponse createGetAllRealTimeRatesResponse() {
        return new GetAllRealTimeRatesResponse();
    }

    /**
     * Create an instance of {@link GetRealTimeRateTable }
     * 
     */
    public GetRealTimeRateTable createGetRealTimeRateTable() {
        return new GetRealTimeRateTable();
    }

    /**
     * Create an instance of {@link GetOfficialHistoricalRateResponse }
     * 
     */
    public GetOfficialHistoricalRateResponse createGetOfficialHistoricalRateResponse() {
        return new GetOfficialHistoricalRateResponse();
    }

    /**
     * Create an instance of {@link Rate }
     * 
     */
    public Rate createRate() {
        return new Rate();
    }

    /**
     * Create an instance of {@link ArrayOfBar }
     * 
     */
    public ArrayOfBar createArrayOfBar() {
        return new ArrayOfBar();
    }

    /**
     * Create an instance of {@link ListCurrencies }
     * 
     */
    public ListCurrencies createListCurrencies() {
        return new ListCurrencies();
    }

    /**
     * Create an instance of {@link GetRealTimeRatesResponse }
     * 
     */
    public GetRealTimeRatesResponse createGetRealTimeRatesResponse() {
        return new GetRealTimeRatesResponse();
    }

    /**
     * Create an instance of {@link GetRealTimeRateTableResponse }
     * 
     */
    public GetRealTimeRateTableResponse createGetRealTimeRateTableResponse() {
        return new GetRealTimeRateTableResponse();
    }

    /**
     * Create an instance of {@link GetRealTimeRates }
     * 
     */
    public GetRealTimeRates createGetRealTimeRates() {
        return new GetRealTimeRates();
    }

    /**
     * Create an instance of {@link GetOfficialRateResponse }
     * 
     */
    public GetOfficialRateResponse createGetOfficialRateResponse() {
        return new GetOfficialRateResponse();
    }

    /**
     * Create an instance of {@link HistoricalRateBidAsk }
     * 
     */
    public HistoricalRateBidAsk createHistoricalRateBidAsk() {
        return new HistoricalRateBidAsk();
    }

    /**
     * Create an instance of {@link GetOfficialHistoricalRates }
     * 
     */
    public GetOfficialHistoricalRates createGetOfficialHistoricalRates() {
        return new GetOfficialHistoricalRates();
    }

    /**
     * Create an instance of {@link GetTickResponse }
     * 
     */
    public GetTickResponse createGetTickResponse() {
        return new GetTickResponse();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetOfficialHistoricalRate }
     * 
     */
    public GetOfficialHistoricalRate createGetOfficialHistoricalRate() {
        return new GetOfficialHistoricalRate();
    }

    /**
     * Create an instance of {@link GetBestCrossRatesResponse }
     * 
     */
    public GetBestCrossRatesResponse createGetBestCrossRatesResponse() {
        return new GetBestCrossRatesResponse();
    }

    /**
     * Create an instance of {@link GetBarsResponse }
     * 
     */
    public GetBarsResponse createGetBarsResponse() {
        return new GetBarsResponse();
    }

    /**
     * Create an instance of {@link ListCurrenciesResponse }
     * 
     */
    public ListCurrenciesResponse createListCurrenciesResponse() {
        return new ListCurrenciesResponse();
    }

    /**
     * Create an instance of {@link Currencies }
     * 
     */
    public Currencies createCurrencies() {
        return new Currencies();
    }

    /**
     * Create an instance of {@link ListActiveCurrenciesResponse }
     * 
     */
    public ListActiveCurrenciesResponse createListActiveCurrenciesResponse() {
        return new ListActiveCurrenciesResponse();
    }

    /**
     * Create an instance of {@link GetTick }
     * 
     */
    public GetTick createGetTick() {
        return new GetTick();
    }

    /**
     * Create an instance of {@link GetOfficialHistoricalRatesResponse }
     * 
     */
    public GetOfficialHistoricalRatesResponse createGetOfficialHistoricalRatesResponse() {
        return new GetOfficialHistoricalRatesResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalRatesRangesResponse }
     * 
     */
    public GetHistoricalRatesRangesResponse createGetHistoricalRatesRangesResponse() {
        return new GetHistoricalRatesRangesResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalRate }
     * 
     */
    public GetHistoricalRate createGetHistoricalRate() {
        return new GetHistoricalRate();
    }

    /**
     * Create an instance of {@link GetBarResponse }
     * 
     */
    public GetBarResponse createGetBarResponse() {
        return new GetBarResponse();
    }

    /**
     * Create an instance of {@link Bar }
     * 
     */
    public Bar createBar() {
        return new Bar();
    }

    /**
     * Create an instance of {@link GetOfficialRates }
     * 
     */
    public GetOfficialRates createGetOfficialRates() {
        return new GetOfficialRates();
    }

    /**
     * Create an instance of {@link GetOfficialRatesResponse }
     * 
     */
    public GetOfficialRatesResponse createGetOfficialRatesResponse() {
        return new GetOfficialRatesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHistoricalRateBidAsk }
     * 
     */
    public ArrayOfHistoricalRateBidAsk createArrayOfHistoricalRateBidAsk() {
        return new ArrayOfHistoricalRateBidAsk();
    }

    /**
     * Create an instance of {@link GetChartBars }
     * 
     */
    public GetChartBars createGetChartBars() {
        return new GetChartBars();
    }

    /**
     * Create an instance of {@link GetLondonHistoricalRatesRangeResponse }
     * 
     */
    public GetLondonHistoricalRatesRangeResponse createGetLondonHistoricalRatesRangeResponse() {
        return new GetLondonHistoricalRatesRangeResponse();
    }

    /**
     * Create an instance of {@link GetOfficialRate }
     * 
     */
    public GetOfficialRate createGetOfficialRate() {
        return new GetOfficialRate();
    }

    /**
     * Create an instance of {@link GetHistoricalRatesRanges }
     * 
     */
    public GetHistoricalRatesRanges createGetHistoricalRatesRanges() {
        return new GetHistoricalRatesRanges();
    }

    /**
     * Create an instance of {@link GetLatestCrossRateResponse }
     * 
     */
    public GetLatestCrossRateResponse createGetLatestCrossRateResponse() {
        return new GetLatestCrossRateResponse();
    }

    /**
     * Create an instance of {@link GetTicks }
     * 
     */
    public GetTicks createGetTicks() {
        return new GetTicks();
    }

    /**
     * Create an instance of {@link GetBestCrossRateResponse }
     * 
     */
    public GetBestCrossRateResponse createGetBestCrossRateResponse() {
        return new GetBestCrossRateResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalRatesRange }
     * 
     */
    public GetHistoricalRatesRange createGetHistoricalRatesRange() {
        return new GetHistoricalRatesRange();
    }

    /**
     * Create an instance of {@link GetRealTimeRate }
     * 
     */
    public GetRealTimeRate createGetRealTimeRate() {
        return new GetRealTimeRate();
    }

    /**
     * Create an instance of {@link GetRealTimeRateResponse }
     * 
     */
    public GetRealTimeRateResponse createGetRealTimeRateResponse() {
        return new GetRealTimeRateResponse();
    }

    /**
     * Create an instance of {@link ConvertHistoricalValueResponse }
     * 
     */
    public ConvertHistoricalValueResponse createConvertHistoricalValueResponse() {
        return new ConvertHistoricalValueResponse();
    }

    /**
     * Create an instance of {@link GetLatestCrossRates }
     * 
     */
    public GetLatestCrossRates createGetLatestCrossRates() {
        return new GetLatestCrossRates();
    }

    /**
     * Create an instance of {@link GetAllRealTimeRates }
     * 
     */
    public GetAllRealTimeRates createGetAllRealTimeRates() {
        return new GetAllRealTimeRates();
    }

    /**
     * Create an instance of {@link GetLatestCrossRatesResponse }
     * 
     */
    public GetLatestCrossRatesResponse createGetLatestCrossRatesResponse() {
        return new GetLatestCrossRatesResponse();
    }

    /**
     * Create an instance of {@link ListActiveCurrencies }
     * 
     */
    public ListActiveCurrencies createListActiveCurrencies() {
        return new ListActiveCurrencies();
    }

    /**
     * Create an instance of {@link GetHistoricalRatesRangeResponse }
     * 
     */
    public GetHistoricalRatesRangeResponse createGetHistoricalRatesRangeResponse() {
        return new GetHistoricalRatesRangeResponse();
    }

    /**
     * Create an instance of {@link GetLondonHistoricalRatesRange }
     * 
     */
    public GetLondonHistoricalRatesRange createGetLondonHistoricalRatesRange() {
        return new GetLondonHistoricalRatesRange();
    }

    /**
     * Create an instance of {@link ArrayOfChartBar }
     * 
     */
    public ArrayOfChartBar createArrayOfChartBar() {
        return new ArrayOfChartBar();
    }

    /**
     * Create an instance of {@link RateTableLine }
     * 
     */
    public RateTableLine createRateTableLine() {
        return new RateTableLine();
    }

    /**
     * Create an instance of {@link ArrayOfRateTableLine }
     * 
     */
    public ArrayOfRateTableLine createArrayOfRateTableLine() {
        return new ArrayOfRateTableLine();
    }

    /**
     * Create an instance of {@link ArrayOfForwardContract }
     * 
     */
    public ArrayOfForwardContract createArrayOfForwardContract() {
        return new ArrayOfForwardContract();
    }

    /**
     * Create an instance of {@link ChartBar }
     * 
     */
    public ChartBar createChartBar() {
        return new ChartBar();
    }

    /**
     * Create an instance of {@link ArrayOfCountry }
     * 
     */
    public ArrayOfCountry createArrayOfCountry() {
        return new ArrayOfCountry();
    }

    /**
     * Create an instance of {@link ArrayOfQuoteCurrencyItem }
     * 
     */
    public ArrayOfQuoteCurrencyItem createArrayOfQuoteCurrencyItem() {
        return new ArrayOfQuoteCurrencyItem();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link ForwardContract }
     * 
     */
    public ForwardContract createForwardContract() {
        return new ForwardContract();
    }

    /**
     * Create an instance of {@link ArrayOfCurrency }
     * 
     */
    public ArrayOfCurrency createArrayOfCurrency() {
        return new ArrayOfCurrency();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link QuoteCurrencyItem }
     * 
     */
    public QuoteCurrencyItem createQuoteCurrencyItem() {
        return new QuoteCurrencyItem();
    }

    /**
     * Create an instance of {@link CurrencyDescription }
     * 
     */
    public CurrencyDescription createCurrencyDescription() {
        return new CurrencyDescription();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfRate")
    public JAXBElement<ArrayOfRate> createArrayOfRate(ArrayOfRate value) {
        return new JAXBElement<ArrayOfRate>(_ArrayOfRate_QNAME, ArrayOfRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Rate")
    public JAXBElement<Rate> createRate(Rate value) {
        return new JAXBElement<Rate>(_Rate_QNAME, Rate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfBar")
    public JAXBElement<ArrayOfBar> createArrayOfBar(ArrayOfBar value) {
        return new JAXBElement<ArrayOfBar>(_ArrayOfBar_QNAME, ArrayOfBar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currencies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Currencies")
    public JAXBElement<Currencies> createCurrencies(Currencies value) {
        return new JAXBElement<Currencies>(_Currencies_QNAME, Currencies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricalRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HistoricalRate")
    public JAXBElement<HistoricalRate> createHistoricalRate(HistoricalRate value) {
        return new JAXBElement<HistoricalRate>(_HistoricalRate_QNAME, HistoricalRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ForwardRate")
    public JAXBElement<ForwardRate> createForwardRate(ForwardRate value) {
        return new JAXBElement<ForwardRate>(_ForwardRate_QNAME, ForwardRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricalRateBidAsk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HistoricalRateBidAsk")
    public JAXBElement<HistoricalRateBidAsk> createHistoricalRateBidAsk(HistoricalRateBidAsk value) {
        return new JAXBElement<HistoricalRateBidAsk>(_HistoricalRateBidAsk_QNAME, HistoricalRateBidAsk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateConversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "RateConversion")
    public JAXBElement<RateConversion> createRateConversion(RateConversion value) {
        return new JAXBElement<RateConversion>(_RateConversion_QNAME, RateConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistoricalRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfHistoricalRate")
    public JAXBElement<ArrayOfHistoricalRate> createArrayOfHistoricalRate(ArrayOfHistoricalRate value) {
        return new JAXBElement<ArrayOfHistoricalRate>(_ArrayOfHistoricalRate_QNAME, ArrayOfHistoricalRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Bar")
    public JAXBElement<Bar> createBar(Bar value) {
        return new JAXBElement<Bar>(_Bar_QNAME, Bar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyChartBars }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CurrencyChartBars")
    public JAXBElement<CurrencyChartBars> createCurrencyChartBars(CurrencyChartBars value) {
        return new JAXBElement<CurrencyChartBars>(_CurrencyChartBars_QNAME, CurrencyChartBars.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tick }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Tick")
    public JAXBElement<Tick> createTick(Tick value) {
        return new JAXBElement<Tick>(_Tick_QNAME, Tick.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTick }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfTick")
    public JAXBElement<ArrayOfTick> createArrayOfTick(ArrayOfTick value) {
        return new JAXBElement<ArrayOfTick>(_ArrayOfTick_QNAME, ArrayOfTick.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "RateTable")
    public JAXBElement<RateTable> createRateTable(RateTable value) {
        return new JAXBElement<RateTable>(_RateTable_QNAME, RateTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistoricalRateBidAsk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfHistoricalRateBidAsk")
    public JAXBElement<ArrayOfHistoricalRateBidAsk> createArrayOfHistoricalRateBidAsk(ArrayOfHistoricalRateBidAsk value) {
        return new JAXBElement<ArrayOfHistoricalRateBidAsk>(_ArrayOfHistoricalRateBidAsk_QNAME, ArrayOfHistoricalRateBidAsk.class, null, value);
    }

}
