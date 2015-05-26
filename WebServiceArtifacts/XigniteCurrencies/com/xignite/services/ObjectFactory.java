
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

    private final static QName _Ticks_QNAME = new QName("http://www.xignite.com/services/", "Ticks");
    private final static QName _HistoricalCrossRates_QNAME = new QName("http://www.xignite.com/services/", "HistoricalCrossRates");
    private final static QName _HighLowTick_QNAME = new QName("http://www.xignite.com/services/", "HighLowTick");
    private final static QName _ArrayOfCrossRate_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfCrossRate");
    private final static QName _AverageHistoricalCrossRate_QNAME = new QName("http://www.xignite.com/services/", "AverageHistoricalCrossRate");
    private final static QName _ChartBinary_QNAME = new QName("http://www.xignite.com/services/", "ChartBinary");
    private final static QName _ForwardRate_QNAME = new QName("http://www.xignite.com/services/", "ForwardRate");
    private final static QName _CrossRateTable_QNAME = new QName("http://www.xignite.com/services/", "CrossRateTable");
    private final static QName _UnitOfAccount_QNAME = new QName("http://www.xignite.com/services/", "UnitOfAccount");
    private final static QName _CrossRateTableWithBidAsk_QNAME = new QName("http://www.xignite.com/services/", "CrossRateTableWithBidAsk");
    private final static QName _HTMLCrossRateTable_QNAME = new QName("http://www.xignite.com/services/", "HTMLCrossRateTable");
    private final static QName _CurrencyList_QNAME = new QName("http://www.xignite.com/services/", "CurrencyList");
    private final static QName _ChartDesign_QNAME = new QName("http://www.xignite.com/services/", "ChartDesign");
    private final static QName _ExchangeConversion_QNAME = new QName("http://www.xignite.com/services/", "ExchangeConversion");
    private final static QName _ArrayOfCrossRateTable_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfCrossRateTable");
    private final static QName _CrossRate_QNAME = new QName("http://www.xignite.com/services/", "CrossRate");
    private final static QName _CurrencyChartIntraday_QNAME = new QName("http://www.xignite.com/services/", "CurrencyChartIntraday");
    private final static QName _ArrayOfFullHistoricalCrossRate_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfFullHistoricalCrossRate");
    private final static QName _Report_QNAME = new QName("http://www.xignite.com/services/", "Report");
    private final static QName _SingleTick_QNAME = new QName("http://www.xignite.com/services/", "SingleTick");
    private final static QName _HistoricalChart_QNAME = new QName("http://www.xignite.com/services/", "HistoricalChart");
    private final static QName _CrossRateTableLineWithBidAsk_QNAME = new QName("http://www.xignite.com/services/", "CrossRateTableLineWithBidAsk");
    private final static QName _HistoricalCrossRate_QNAME = new QName("http://www.xignite.com/services/", "HistoricalCrossRate");
    private final static QName _FullHistoricalCrossRates_QNAME = new QName("http://www.xignite.com/services/", "FullHistoricalCrossRates");
    private final static QName _CrossRateChange_QNAME = new QName("http://www.xignite.com/services/", "CrossRateChange");
    private final static QName _ArrayOfHistoricalCrossRate_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfHistoricalCrossRate");
    private final static QName _ArrayOfAverageHistoricalCrossRate_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfAverageHistoricalCrossRate");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _ArrayOfCrossRateTableWithBidAsk_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfCrossRateTableWithBidAsk");
    private final static QName _MultipleHistoricalCrossRates_QNAME = new QName("http://www.xignite.com/services/", "MultipleHistoricalCrossRates");
    private final static QName _FullHistoricalCrossRate_QNAME = new QName("http://www.xignite.com/services/", "FullHistoricalCrossRate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HighLowTick }
     * 
     */
    public HighLowTick createHighLowTick() {
        return new HighLowTick();
    }

    /**
     * Create an instance of {@link GetCurrencyChart }
     * 
     */
    public GetCurrencyChart createGetCurrencyChart() {
        return new GetCurrencyChart();
    }

    /**
     * Create an instance of {@link GetOfficialCrossRatesResponse }
     * 
     */
    public GetOfficialCrossRatesResponse createGetOfficialCrossRatesResponse() {
        return new GetOfficialCrossRatesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHistoricalCrossRate }
     * 
     */
    public ArrayOfHistoricalCrossRate createArrayOfHistoricalCrossRate() {
        return new ArrayOfHistoricalCrossRate();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRatesAsOf }
     * 
     */
    public GetHistoricalCrossRatesAsOf createGetHistoricalCrossRatesAsOf() {
        return new GetHistoricalCrossRatesAsOf();
    }

    /**
     * Create an instance of {@link GetOfficialCrossRates }
     * 
     */
    public GetOfficialCrossRates createGetOfficialCrossRates() {
        return new GetOfficialCrossRates();
    }

    /**
     * Create an instance of {@link ConvertRealTimeValue }
     * 
     */
    public ConvertRealTimeValue createConvertRealTimeValue() {
        return new ConvertRealTimeValue();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRateResponse }
     * 
     */
    public GetRealTimeCrossRateResponse createGetRealTimeCrossRateResponse() {
        return new GetRealTimeCrossRateResponse();
    }

    /**
     * Create an instance of {@link CrossRate }
     * 
     */
    public CrossRate createCrossRate() {
        return new CrossRate();
    }

    /**
     * Create an instance of {@link GetAllCrossRatesForACurrency }
     * 
     */
    public GetAllCrossRatesForACurrency createGetAllCrossRatesForACurrency() {
        return new GetAllCrossRatesForACurrency();
    }

    /**
     * Create an instance of {@link GetSimpleRealTimeCrossRateTableAsHTMLResponse }
     * 
     */
    public GetSimpleRealTimeCrossRateTableAsHTMLResponse createGetSimpleRealTimeCrossRateTableAsHTMLResponse() {
        return new GetSimpleRealTimeCrossRateTableAsHTMLResponse();
    }

    /**
     * Create an instance of {@link HTMLCrossRateTable }
     * 
     */
    public HTMLCrossRateTable createHTMLCrossRateTable() {
        return new HTMLCrossRateTable();
    }

    /**
     * Create an instance of {@link ConvertRealTimeValueResponse }
     * 
     */
    public ConvertRealTimeValueResponse createConvertRealTimeValueResponse() {
        return new ConvertRealTimeValueResponse();
    }

    /**
     * Create an instance of {@link ExchangeConversion }
     * 
     */
    public ExchangeConversion createExchangeConversion() {
        return new ExchangeConversion();
    }

    /**
     * Create an instance of {@link ChartDesign }
     * 
     */
    public ChartDesign createChartDesign() {
        return new ChartDesign();
    }

    /**
     * Create an instance of {@link GetCurrencyIntradayChartCustomBinary }
     * 
     */
    public GetCurrencyIntradayChartCustomBinary createGetCurrencyIntradayChartCustomBinary() {
        return new GetCurrencyIntradayChartCustomBinary();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRatesBidAskRangeResponse }
     * 
     */
    public GetHistoricalCrossRatesBidAskRangeResponse createGetHistoricalCrossRatesBidAskRangeResponse() {
        return new GetHistoricalCrossRatesBidAskRangeResponse();
    }

    /**
     * Create an instance of {@link FullHistoricalCrossRates }
     * 
     */
    public FullHistoricalCrossRates createFullHistoricalCrossRates() {
        return new FullHistoricalCrossRates();
    }

    /**
     * Create an instance of {@link CrossRateTableWithBidAsk }
     * 
     */
    public CrossRateTableWithBidAsk createCrossRateTableWithBidAsk() {
        return new CrossRateTableWithBidAsk();
    }

    /**
     * Create an instance of {@link GetOfficialCrossRateBidAsk }
     * 
     */
    public GetOfficialCrossRateBidAsk createGetOfficialCrossRateBidAsk() {
        return new GetOfficialCrossRateBidAsk();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRate }
     * 
     */
    public GetHistoricalCrossRate createGetHistoricalCrossRate() {
        return new GetHistoricalCrossRate();
    }

    /**
     * Create an instance of {@link GetHistoricalHighLow }
     * 
     */
    public GetHistoricalHighLow createGetHistoricalHighLow() {
        return new GetHistoricalHighLow();
    }

    /**
     * Create an instance of {@link ListCurrencies }
     * 
     */
    public ListCurrencies createListCurrencies() {
        return new ListCurrencies();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateBidAskResponse }
     * 
     */
    public GetHistoricalCrossRateBidAskResponse createGetHistoricalCrossRateBidAskResponse() {
        return new GetHistoricalCrossRateBidAskResponse();
    }

    /**
     * Create an instance of {@link FullHistoricalCrossRate }
     * 
     */
    public FullHistoricalCrossRate createFullHistoricalCrossRate() {
        return new FullHistoricalCrossRate();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateTableResponse }
     * 
     */
    public GetHistoricalCrossRateTableResponse createGetHistoricalCrossRateTableResponse() {
        return new GetHistoricalCrossRateTableResponse();
    }

    /**
     * Create an instance of {@link CrossRateTable }
     * 
     */
    public CrossRateTable createCrossRateTable() {
        return new CrossRateTable();
    }

    /**
     * Create an instance of {@link GetCurrencyChartResponse }
     * 
     */
    public GetCurrencyChartResponse createGetCurrencyChartResponse() {
        return new GetCurrencyChartResponse();
    }

    /**
     * Create an instance of {@link HistoricalChart }
     * 
     */
    public HistoricalChart createHistoricalChart() {
        return new HistoricalChart();
    }

    /**
     * Create an instance of {@link CrossRateTableLineWithBidAsk }
     * 
     */
    public CrossRateTableLineWithBidAsk createCrossRateTableLineWithBidAsk() {
        return new CrossRateTableLineWithBidAsk();
    }

    /**
     * Create an instance of {@link GetRawCrossRates }
     * 
     */
    public GetRawCrossRates createGetRawCrossRates() {
        return new GetRawCrossRates();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRatesBidAskAsOfResponse }
     * 
     */
    public GetHistoricalCrossRatesBidAskAsOfResponse createGetHistoricalCrossRatesBidAskAsOfResponse() {
        return new GetHistoricalCrossRatesBidAskAsOfResponse();
    }

    /**
     * Create an instance of {@link GetTickResponse }
     * 
     */
    public GetTickResponse createGetTickResponse() {
        return new GetTickResponse();
    }

    /**
     * Create an instance of {@link SingleTick }
     * 
     */
    public SingleTick createSingleTick() {
        return new SingleTick();
    }

    /**
     * Create an instance of {@link GetRealTimeForwardRate }
     * 
     */
    public GetRealTimeForwardRate createGetRealTimeForwardRate() {
        return new GetRealTimeForwardRate();
    }

    /**
     * Create an instance of {@link GetHistoricalMonthlyCrossRatesRangeResponse }
     * 
     */
    public GetHistoricalMonthlyCrossRatesRangeResponse createGetHistoricalMonthlyCrossRatesRangeResponse() {
        return new GetHistoricalMonthlyCrossRatesRangeResponse();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetCurrencyReportResponse }
     * 
     */
    public GetCurrencyReportResponse createGetCurrencyReportResponse() {
        return new GetCurrencyReportResponse();
    }

    /**
     * Create an instance of {@link Report }
     * 
     */
    public Report createReport() {
        return new Report();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRates }
     * 
     */
    public GetHistoricalCrossRates createGetHistoricalCrossRates() {
        return new GetHistoricalCrossRates();
    }

    /**
     * Create an instance of {@link GetHistoricalHighLowResponse }
     * 
     */
    public GetHistoricalHighLowResponse createGetHistoricalHighLowResponse() {
        return new GetHistoricalHighLowResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalTicks }
     * 
     */
    public GetHistoricalTicks createGetHistoricalTicks() {
        return new GetHistoricalTicks();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateTablesBidAsk }
     * 
     */
    public GetHistoricalCrossRateTablesBidAsk createGetHistoricalCrossRateTablesBidAsk() {
        return new GetHistoricalCrossRateTablesBidAsk();
    }

    /**
     * Create an instance of {@link GetAverageHistoricalCrossRateResponse }
     * 
     */
    public GetAverageHistoricalCrossRateResponse createGetAverageHistoricalCrossRateResponse() {
        return new GetAverageHistoricalCrossRateResponse();
    }

    /**
     * Create an instance of {@link AverageHistoricalCrossRate }
     * 
     */
    public AverageHistoricalCrossRate createAverageHistoricalCrossRate() {
        return new AverageHistoricalCrossRate();
    }

    /**
     * Create an instance of {@link GetCurrencyChartCustomBinary }
     * 
     */
    public GetCurrencyChartCustomBinary createGetCurrencyChartCustomBinary() {
        return new GetCurrencyChartCustomBinary();
    }

    /**
     * Create an instance of {@link ListCurrenciesResponse }
     * 
     */
    public ListCurrenciesResponse createListCurrenciesResponse() {
        return new ListCurrenciesResponse();
    }

    /**
     * Create an instance of {@link CurrencyList }
     * 
     */
    public CurrencyList createCurrencyList() {
        return new CurrencyList();
    }

    /**
     * Create an instance of {@link HistoricalCrossRates }
     * 
     */
    public HistoricalCrossRates createHistoricalCrossRates() {
        return new HistoricalCrossRates();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateTableBidAskResponse }
     * 
     */
    public GetHistoricalCrossRateTableBidAskResponse createGetHistoricalCrossRateTableBidAskResponse() {
        return new GetHistoricalCrossRateTableBidAskResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateBidAsk }
     * 
     */
    public GetHistoricalCrossRateBidAsk createGetHistoricalCrossRateBidAsk() {
        return new GetHistoricalCrossRateBidAsk();
    }

    /**
     * Create an instance of {@link GetTick }
     * 
     */
    public GetTick createGetTick() {
        return new GetTick();
    }

    /**
     * Create an instance of {@link GetCurrencyChartCustomBinaryResponse }
     * 
     */
    public GetCurrencyChartCustomBinaryResponse createGetCurrencyChartCustomBinaryResponse() {
        return new GetCurrencyChartCustomBinaryResponse();
    }

    /**
     * Create an instance of {@link ChartBinary }
     * 
     */
    public ChartBinary createChartBinary() {
        return new ChartBinary();
    }

    /**
     * Create an instance of {@link GetCrossRateChange }
     * 
     */
    public GetCrossRateChange createGetCrossRateChange() {
        return new GetCrossRateChange();
    }

    /**
     * Create an instance of {@link GetCurrencyChartBinaryResponse }
     * 
     */
    public GetCurrencyChartBinaryResponse createGetCurrencyChartBinaryResponse() {
        return new GetCurrencyChartBinaryResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyIntradayChartCustomResponse }
     * 
     */
    public GetCurrencyIntradayChartCustomResponse createGetCurrencyIntradayChartCustomResponse() {
        return new GetCurrencyIntradayChartCustomResponse();
    }

    /**
     * Create an instance of {@link CurrencyChartIntraday }
     * 
     */
    public CurrencyChartIntraday createCurrencyChartIntraday() {
        return new CurrencyChartIntraday();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRateTableResponse }
     * 
     */
    public GetRealTimeCrossRateTableResponse createGetRealTimeCrossRateTableResponse() {
        return new GetRealTimeCrossRateTableResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyChartCustom }
     * 
     */
    public GetCurrencyChartCustom createGetCurrencyChartCustom() {
        return new GetCurrencyChartCustom();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRateTable }
     * 
     */
    public GetRealTimeCrossRateTable createGetRealTimeCrossRateTable() {
        return new GetRealTimeCrossRateTable();
    }

    /**
     * Create an instance of {@link GetAverageHistoricalCrossRate }
     * 
     */
    public GetAverageHistoricalCrossRate createGetAverageHistoricalCrossRate() {
        return new GetAverageHistoricalCrossRate();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRateTableAsHTML }
     * 
     */
    public GetRealTimeCrossRateTableAsHTML createGetRealTimeCrossRateTableAsHTML() {
        return new GetRealTimeCrossRateTableAsHTML();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRateTableAsHTMLResponse }
     * 
     */
    public GetRealTimeCrossRateTableAsHTMLResponse createGetRealTimeCrossRateTableAsHTMLResponse() {
        return new GetRealTimeCrossRateTableAsHTMLResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRatesBidAsk }
     * 
     */
    public GetHistoricalCrossRatesBidAsk createGetHistoricalCrossRatesBidAsk() {
        return new GetHistoricalCrossRatesBidAsk();
    }

    /**
     * Create an instance of {@link GetCurrencyChartCustomResponse }
     * 
     */
    public GetCurrencyChartCustomResponse createGetCurrencyChartCustomResponse() {
        return new GetCurrencyChartCustomResponse();
    }

    /**
     * Create an instance of {@link GetLatestCrossRateResponse }
     * 
     */
    public GetLatestCrossRateResponse createGetLatestCrossRateResponse() {
        return new GetLatestCrossRateResponse();
    }

    /**
     * Create an instance of {@link GetRawCrossRate }
     * 
     */
    public GetRawCrossRate createGetRawCrossRate() {
        return new GetRawCrossRate();
    }

    /**
     * Create an instance of {@link GetCurrencyChartBinary }
     * 
     */
    public GetCurrencyChartBinary createGetCurrencyChartBinary() {
        return new GetCurrencyChartBinary();
    }

    /**
     * Create an instance of {@link ConvertHistoricalValueResponse }
     * 
     */
    public ConvertHistoricalValueResponse createConvertHistoricalValueResponse() {
        return new ConvertHistoricalValueResponse();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRateAsString }
     * 
     */
    public GetRealTimeCrossRateAsString createGetRealTimeCrossRateAsString() {
        return new GetRealTimeCrossRateAsString();
    }

    /**
     * Create an instance of {@link GetLatestCrossRatesResponse }
     * 
     */
    public GetLatestCrossRatesResponse createGetLatestCrossRatesResponse() {
        return new GetLatestCrossRatesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCrossRate }
     * 
     */
    public ArrayOfCrossRate createArrayOfCrossRate() {
        return new ArrayOfCrossRate();
    }

    /**
     * Create an instance of {@link MultipleHistoricalCrossRates }
     * 
     */
    public MultipleHistoricalCrossRates createMultipleHistoricalCrossRates() {
        return new MultipleHistoricalCrossRates();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRateGMTResponse }
     * 
     */
    public GetRealTimeCrossRateGMTResponse createGetRealTimeCrossRateGMTResponse() {
        return new GetRealTimeCrossRateGMTResponse();
    }

    /**
     * Create an instance of {@link GetCrossRateChangeResponse }
     * 
     */
    public GetCrossRateChangeResponse createGetCrossRateChangeResponse() {
        return new GetCrossRateChangeResponse();
    }

    /**
     * Create an instance of {@link CrossRateChange }
     * 
     */
    public CrossRateChange createCrossRateChange() {
        return new CrossRateChange();
    }

    /**
     * Create an instance of {@link GetMutipleHistoricalCrossRatesResponse }
     * 
     */
    public GetMutipleHistoricalCrossRatesResponse createGetMutipleHistoricalCrossRatesResponse() {
        return new GetMutipleHistoricalCrossRatesResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateResponse }
     * 
     */
    public GetHistoricalCrossRateResponse createGetHistoricalCrossRateResponse() {
        return new GetHistoricalCrossRateResponse();
    }

    /**
     * Create an instance of {@link HistoricalCrossRate }
     * 
     */
    public HistoricalCrossRate createHistoricalCrossRate() {
        return new HistoricalCrossRate();
    }

    /**
     * Create an instance of {@link GetHistoricalMonthlyCrossRatesRange }
     * 
     */
    public GetHistoricalMonthlyCrossRatesRange createGetHistoricalMonthlyCrossRatesRange() {
        return new GetHistoricalMonthlyCrossRatesRange();
    }

    /**
     * Create an instance of {@link Ticks }
     * 
     */
    public Ticks createTicks() {
        return new Ticks();
    }

    /**
     * Create an instance of {@link GetCurrencyIntradayChart }
     * 
     */
    public GetCurrencyIntradayChart createGetCurrencyIntradayChart() {
        return new GetCurrencyIntradayChart();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRatesResponse }
     * 
     */
    public GetHistoricalCrossRatesResponse createGetHistoricalCrossRatesResponse() {
        return new GetHistoricalCrossRatesResponse();
    }

    /**
     * Create an instance of {@link GetLatestCrossRate }
     * 
     */
    public GetLatestCrossRate createGetLatestCrossRate() {
        return new GetLatestCrossRate();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRate }
     * 
     */
    public GetRealTimeCrossRate createGetRealTimeCrossRate() {
        return new GetRealTimeCrossRate();
    }

    /**
     * Create an instance of {@link GetTicksResponse }
     * 
     */
    public GetTicksResponse createGetTicksResponse() {
        return new GetTicksResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyReport }
     * 
     */
    public GetCurrencyReport createGetCurrencyReport() {
        return new GetCurrencyReport();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRatesBidAskResponse }
     * 
     */
    public GetHistoricalCrossRatesBidAskResponse createGetHistoricalCrossRatesBidAskResponse() {
        return new GetHistoricalCrossRatesBidAskResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFullHistoricalCrossRate }
     * 
     */
    public ArrayOfFullHistoricalCrossRate createArrayOfFullHistoricalCrossRate() {
        return new ArrayOfFullHistoricalCrossRate();
    }

    /**
     * Create an instance of {@link ConvertHistoricalValue }
     * 
     */
    public ConvertHistoricalValue createConvertHistoricalValue() {
        return new ConvertHistoricalValue();
    }

    /**
     * Create an instance of {@link GetAverageHistoricalCrossRatesResponse }
     * 
     */
    public GetAverageHistoricalCrossRatesResponse createGetAverageHistoricalCrossRatesResponse() {
        return new GetAverageHistoricalCrossRatesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAverageHistoricalCrossRate }
     * 
     */
    public ArrayOfAverageHistoricalCrossRate createArrayOfAverageHistoricalCrossRate() {
        return new ArrayOfAverageHistoricalCrossRate();
    }

    /**
     * Create an instance of {@link GetChartDesignResponse }
     * 
     */
    public GetChartDesignResponse createGetChartDesignResponse() {
        return new GetChartDesignResponse();
    }

    /**
     * Create an instance of {@link GetMutipleHistoricalCrossRates }
     * 
     */
    public GetMutipleHistoricalCrossRates createGetMutipleHistoricalCrossRates() {
        return new GetMutipleHistoricalCrossRates();
    }

    /**
     * Create an instance of {@link GetChartDesign }
     * 
     */
    public GetChartDesign createGetChartDesign() {
        return new GetChartDesign();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateTable }
     * 
     */
    public GetHistoricalCrossRateTable createGetHistoricalCrossRateTable() {
        return new GetHistoricalCrossRateTable();
    }

    /**
     * Create an instance of {@link GetRealTimeForwardRateResponse }
     * 
     */
    public GetRealTimeForwardRateResponse createGetRealTimeForwardRateResponse() {
        return new GetRealTimeForwardRateResponse();
    }

    /**
     * Create an instance of {@link ForwardRate }
     * 
     */
    public ForwardRate createForwardRate() {
        return new ForwardRate();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRateAsStringResponse }
     * 
     */
    public GetRealTimeCrossRateAsStringResponse createGetRealTimeCrossRateAsStringResponse() {
        return new GetRealTimeCrossRateAsStringResponse();
    }

    /**
     * Create an instance of {@link GetOfficialCrossRateBidAskResponse }
     * 
     */
    public GetOfficialCrossRateBidAskResponse createGetOfficialCrossRateBidAskResponse() {
        return new GetOfficialCrossRateBidAskResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateTableBidAsk }
     * 
     */
    public GetHistoricalCrossRateTableBidAsk createGetHistoricalCrossRateTableBidAsk() {
        return new GetHistoricalCrossRateTableBidAsk();
    }

    /**
     * Create an instance of {@link GetCurrencyIntradayChartCustomBinaryResponse }
     * 
     */
    public GetCurrencyIntradayChartCustomBinaryResponse createGetCurrencyIntradayChartCustomBinaryResponse() {
        return new GetCurrencyIntradayChartCustomBinaryResponse();
    }

    /**
     * Create an instance of {@link GetIntradayHighLowResponse }
     * 
     */
    public GetIntradayHighLowResponse createGetIntradayHighLowResponse() {
        return new GetIntradayHighLowResponse();
    }

    /**
     * Create an instance of {@link GetIntradayHighLow }
     * 
     */
    public GetIntradayHighLow createGetIntradayHighLow() {
        return new GetIntradayHighLow();
    }

    /**
     * Create an instance of {@link GetUnitOfAccountResponse }
     * 
     */
    public GetUnitOfAccountResponse createGetUnitOfAccountResponse() {
        return new GetUnitOfAccountResponse();
    }

    /**
     * Create an instance of {@link UnitOfAccount }
     * 
     */
    public UnitOfAccount createUnitOfAccount() {
        return new UnitOfAccount();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRatesRangeResponse }
     * 
     */
    public GetHistoricalCrossRatesRangeResponse createGetHistoricalCrossRatesRangeResponse() {
        return new GetHistoricalCrossRatesRangeResponse();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRateTableWithBidAsk }
     * 
     */
    public GetRealTimeCrossRateTableWithBidAsk createGetRealTimeCrossRateTableWithBidAsk() {
        return new GetRealTimeCrossRateTableWithBidAsk();
    }

    /**
     * Create an instance of {@link GetOfficialCrossRateResponse }
     * 
     */
    public GetOfficialCrossRateResponse createGetOfficialCrossRateResponse() {
        return new GetOfficialCrossRateResponse();
    }

    /**
     * Create an instance of {@link GetAverageHistoricalCrossRates }
     * 
     */
    public GetAverageHistoricalCrossRates createGetAverageHistoricalCrossRates() {
        return new GetAverageHistoricalCrossRates();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRatesBidAskAsOf }
     * 
     */
    public GetHistoricalCrossRatesBidAskAsOf createGetHistoricalCrossRatesBidAskAsOf() {
        return new GetHistoricalCrossRatesBidAskAsOf();
    }

    /**
     * Create an instance of {@link GetUnitOfAccount }
     * 
     */
    public GetUnitOfAccount createGetUnitOfAccount() {
        return new GetUnitOfAccount();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateTableAsHTMLResponse }
     * 
     */
    public GetHistoricalCrossRateTableAsHTMLResponse createGetHistoricalCrossRateTableAsHTMLResponse() {
        return new GetHistoricalCrossRateTableAsHTMLResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateTables }
     * 
     */
    public GetHistoricalCrossRateTables createGetHistoricalCrossRateTables() {
        return new GetHistoricalCrossRateTables();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRates }
     * 
     */
    public GetRealTimeCrossRates createGetRealTimeCrossRates() {
        return new GetRealTimeCrossRates();
    }

    /**
     * Create an instance of {@link GetRawCrossRateResponse }
     * 
     */
    public GetRawCrossRateResponse createGetRawCrossRateResponse() {
        return new GetRawCrossRateResponse();
    }

    /**
     * Create an instance of {@link GetRawCrossRatesResponse }
     * 
     */
    public GetRawCrossRatesResponse createGetRawCrossRatesResponse() {
        return new GetRawCrossRatesResponse();
    }

    /**
     * Create an instance of {@link GetSimpleRealTimeCrossRateTableAsHTML }
     * 
     */
    public GetSimpleRealTimeCrossRateTableAsHTML createGetSimpleRealTimeCrossRateTableAsHTML() {
        return new GetSimpleRealTimeCrossRateTableAsHTML();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRateGMT }
     * 
     */
    public GetRealTimeCrossRateGMT createGetRealTimeCrossRateGMT() {
        return new GetRealTimeCrossRateGMT();
    }

    /**
     * Create an instance of {@link GetCurrencyIntradayChartResponse }
     * 
     */
    public GetCurrencyIntradayChartResponse createGetCurrencyIntradayChartResponse() {
        return new GetCurrencyIntradayChartResponse();
    }

    /**
     * Create an instance of {@link GetOfficialCrossRatesBidAskResponse }
     * 
     */
    public GetOfficialCrossRatesBidAskResponse createGetOfficialCrossRatesBidAskResponse() {
        return new GetOfficialCrossRatesBidAskResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalTicksResponse }
     * 
     */
    public GetHistoricalTicksResponse createGetHistoricalTicksResponse() {
        return new GetHistoricalTicksResponse();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRateTableWithBidAskResponse }
     * 
     */
    public GetRealTimeCrossRateTableWithBidAskResponse createGetRealTimeCrossRateTableWithBidAskResponse() {
        return new GetRealTimeCrossRateTableWithBidAskResponse();
    }

    /**
     * Create an instance of {@link GetAllCrossRatesForACurrencyResponse }
     * 
     */
    public GetAllCrossRatesForACurrencyResponse createGetAllCrossRatesForACurrencyResponse() {
        return new GetAllCrossRatesForACurrencyResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateTableAsHTML }
     * 
     */
    public GetHistoricalCrossRateTableAsHTML createGetHistoricalCrossRateTableAsHTML() {
        return new GetHistoricalCrossRateTableAsHTML();
    }

    /**
     * Create an instance of {@link ArrayOfCrossRateTable }
     * 
     */
    public ArrayOfCrossRateTable createArrayOfCrossRateTable() {
        return new ArrayOfCrossRateTable();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateTablesBidAskResponse }
     * 
     */
    public GetHistoricalCrossRateTablesBidAskResponse createGetHistoricalCrossRateTablesBidAskResponse() {
        return new GetHistoricalCrossRateTablesBidAskResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCrossRateTableWithBidAsk }
     * 
     */
    public ArrayOfCrossRateTableWithBidAsk createArrayOfCrossRateTableWithBidAsk() {
        return new ArrayOfCrossRateTableWithBidAsk();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRateTablesResponse }
     * 
     */
    public GetHistoricalCrossRateTablesResponse createGetHistoricalCrossRateTablesResponse() {
        return new GetHistoricalCrossRateTablesResponse();
    }

    /**
     * Create an instance of {@link GetOfficialCrossRatesBidAsk }
     * 
     */
    public GetOfficialCrossRatesBidAsk createGetOfficialCrossRatesBidAsk() {
        return new GetOfficialCrossRatesBidAsk();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRatesRange }
     * 
     */
    public GetHistoricalCrossRatesRange createGetHistoricalCrossRatesRange() {
        return new GetHistoricalCrossRatesRange();
    }

    /**
     * Create an instance of {@link GetRealTimeCrossRatesResponse }
     * 
     */
    public GetRealTimeCrossRatesResponse createGetRealTimeCrossRatesResponse() {
        return new GetRealTimeCrossRatesResponse();
    }

    /**
     * Create an instance of {@link GetTicks }
     * 
     */
    public GetTicks createGetTicks() {
        return new GetTicks();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRatesAsOfResponse }
     * 
     */
    public GetHistoricalCrossRatesAsOfResponse createGetHistoricalCrossRatesAsOfResponse() {
        return new GetHistoricalCrossRatesAsOfResponse();
    }

    /**
     * Create an instance of {@link GetOfficialCrossRate }
     * 
     */
    public GetOfficialCrossRate createGetOfficialCrossRate() {
        return new GetOfficialCrossRate();
    }

    /**
     * Create an instance of {@link GetHistoricalCrossRatesBidAskRange }
     * 
     */
    public GetHistoricalCrossRatesBidAskRange createGetHistoricalCrossRatesBidAskRange() {
        return new GetHistoricalCrossRatesBidAskRange();
    }

    /**
     * Create an instance of {@link GetLatestCrossRates }
     * 
     */
    public GetLatestCrossRates createGetLatestCrossRates() {
        return new GetLatestCrossRates();
    }

    /**
     * Create an instance of {@link GetCurrencyIntradayChartCustom }
     * 
     */
    public GetCurrencyIntradayChartCustom createGetCurrencyIntradayChartCustom() {
        return new GetCurrencyIntradayChartCustom();
    }

    /**
     * Create an instance of {@link FullCrossRateItem }
     * 
     */
    public FullCrossRateItem createFullCrossRateItem() {
        return new FullCrossRateItem();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link ArrayOfChange }
     * 
     */
    public ArrayOfChange createArrayOfChange() {
        return new ArrayOfChange();
    }

    /**
     * Create an instance of {@link Tick }
     * 
     */
    public Tick createTick() {
        return new Tick();
    }

    /**
     * Create an instance of {@link CrossRateItem }
     * 
     */
    public CrossRateItem createCrossRateItem() {
        return new CrossRateItem();
    }

    /**
     * Create an instance of {@link ArrayOfCrossRateTableLineWithBidAsk }
     * 
     */
    public ArrayOfCrossRateTableLineWithBidAsk createArrayOfCrossRateTableLineWithBidAsk() {
        return new ArrayOfCrossRateTableLineWithBidAsk();
    }

    /**
     * Create an instance of {@link CrossRateTableLine }
     * 
     */
    public CrossRateTableLine createCrossRateTableLine() {
        return new CrossRateTableLine();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link ArrayOfFullCrossRateItem }
     * 
     */
    public ArrayOfFullCrossRateItem createArrayOfFullCrossRateItem() {
        return new ArrayOfFullCrossRateItem();
    }

    /**
     * Create an instance of {@link Line }
     * 
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link ArrayOfExchangeRate }
     * 
     */
    public ArrayOfExchangeRate createArrayOfExchangeRate() {
        return new ArrayOfExchangeRate();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link ExchangeRate }
     * 
     */
    public ExchangeRate createExchangeRate() {
        return new ExchangeRate();
    }

    /**
     * Create an instance of {@link ArrayOfCountry }
     * 
     */
    public ArrayOfCountry createArrayOfCountry() {
        return new ArrayOfCountry();
    }

    /**
     * Create an instance of {@link CurrencyItem }
     * 
     */
    public CurrencyItem createCurrencyItem() {
        return new CurrencyItem();
    }

    /**
     * Create an instance of {@link ArrayOfTick }
     * 
     */
    public ArrayOfTick createArrayOfTick() {
        return new ArrayOfTick();
    }

    /**
     * Create an instance of {@link ArrayOfForward }
     * 
     */
    public ArrayOfForward createArrayOfForward() {
        return new ArrayOfForward();
    }

    /**
     * Create an instance of {@link ArrayOfCurrencyItem }
     * 
     */
    public ArrayOfCurrencyItem createArrayOfCurrencyItem() {
        return new ArrayOfCurrencyItem();
    }

    /**
     * Create an instance of {@link Change }
     * 
     */
    public Change createChange() {
        return new Change();
    }

    /**
     * Create an instance of {@link ArrayOfCrossRateTableLine }
     * 
     */
    public ArrayOfCrossRateTableLine createArrayOfCrossRateTableLine() {
        return new ArrayOfCrossRateTableLine();
    }

    /**
     * Create an instance of {@link ArrayOfLine }
     * 
     */
    public ArrayOfLine createArrayOfLine() {
        return new ArrayOfLine();
    }

    /**
     * Create an instance of {@link Forward }
     * 
     */
    public Forward createForward() {
        return new Forward();
    }

    /**
     * Create an instance of {@link StockChart }
     * 
     */
    public StockChart createStockChart() {
        return new StockChart();
    }

    /**
     * Create an instance of {@link ArrayOfCrossRateItem }
     * 
     */
    public ArrayOfCrossRateItem createArrayOfCrossRateItem() {
        return new ArrayOfCrossRateItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Ticks")
    public JAXBElement<Ticks> createTicks(Ticks value) {
        return new JAXBElement<Ticks>(_Ticks_QNAME, Ticks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricalCrossRates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HistoricalCrossRates")
    public JAXBElement<HistoricalCrossRates> createHistoricalCrossRates(HistoricalCrossRates value) {
        return new JAXBElement<HistoricalCrossRates>(_HistoricalCrossRates_QNAME, HistoricalCrossRates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HighLowTick }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HighLowTick")
    public JAXBElement<HighLowTick> createHighLowTick(HighLowTick value) {
        return new JAXBElement<HighLowTick>(_HighLowTick_QNAME, HighLowTick.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrossRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfCrossRate")
    public JAXBElement<ArrayOfCrossRate> createArrayOfCrossRate(ArrayOfCrossRate value) {
        return new JAXBElement<ArrayOfCrossRate>(_ArrayOfCrossRate_QNAME, ArrayOfCrossRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AverageHistoricalCrossRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "AverageHistoricalCrossRate")
    public JAXBElement<AverageHistoricalCrossRate> createAverageHistoricalCrossRate(AverageHistoricalCrossRate value) {
        return new JAXBElement<AverageHistoricalCrossRate>(_AverageHistoricalCrossRate_QNAME, AverageHistoricalCrossRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChartBinary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ChartBinary")
    public JAXBElement<ChartBinary> createChartBinary(ChartBinary value) {
        return new JAXBElement<ChartBinary>(_ChartBinary_QNAME, ChartBinary.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CrossRateTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CrossRateTable")
    public JAXBElement<CrossRateTable> createCrossRateTable(CrossRateTable value) {
        return new JAXBElement<CrossRateTable>(_CrossRateTable_QNAME, CrossRateTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitOfAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "UnitOfAccount")
    public JAXBElement<UnitOfAccount> createUnitOfAccount(UnitOfAccount value) {
        return new JAXBElement<UnitOfAccount>(_UnitOfAccount_QNAME, UnitOfAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrossRateTableWithBidAsk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CrossRateTableWithBidAsk")
    public JAXBElement<CrossRateTableWithBidAsk> createCrossRateTableWithBidAsk(CrossRateTableWithBidAsk value) {
        return new JAXBElement<CrossRateTableWithBidAsk>(_CrossRateTableWithBidAsk_QNAME, CrossRateTableWithBidAsk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTMLCrossRateTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HTMLCrossRateTable")
    public JAXBElement<HTMLCrossRateTable> createHTMLCrossRateTable(HTMLCrossRateTable value) {
        return new JAXBElement<HTMLCrossRateTable>(_HTMLCrossRateTable_QNAME, HTMLCrossRateTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CurrencyList")
    public JAXBElement<CurrencyList> createCurrencyList(CurrencyList value) {
        return new JAXBElement<CurrencyList>(_CurrencyList_QNAME, CurrencyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChartDesign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ChartDesign")
    public JAXBElement<ChartDesign> createChartDesign(ChartDesign value) {
        return new JAXBElement<ChartDesign>(_ChartDesign_QNAME, ChartDesign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeConversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ExchangeConversion")
    public JAXBElement<ExchangeConversion> createExchangeConversion(ExchangeConversion value) {
        return new JAXBElement<ExchangeConversion>(_ExchangeConversion_QNAME, ExchangeConversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrossRateTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfCrossRateTable")
    public JAXBElement<ArrayOfCrossRateTable> createArrayOfCrossRateTable(ArrayOfCrossRateTable value) {
        return new JAXBElement<ArrayOfCrossRateTable>(_ArrayOfCrossRateTable_QNAME, ArrayOfCrossRateTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrossRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CrossRate")
    public JAXBElement<CrossRate> createCrossRate(CrossRate value) {
        return new JAXBElement<CrossRate>(_CrossRate_QNAME, CrossRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyChartIntraday }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CurrencyChartIntraday")
    public JAXBElement<CurrencyChartIntraday> createCurrencyChartIntraday(CurrencyChartIntraday value) {
        return new JAXBElement<CurrencyChartIntraday>(_CurrencyChartIntraday_QNAME, CurrencyChartIntraday.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFullHistoricalCrossRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfFullHistoricalCrossRate")
    public JAXBElement<ArrayOfFullHistoricalCrossRate> createArrayOfFullHistoricalCrossRate(ArrayOfFullHistoricalCrossRate value) {
        return new JAXBElement<ArrayOfFullHistoricalCrossRate>(_ArrayOfFullHistoricalCrossRate_QNAME, ArrayOfFullHistoricalCrossRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Report }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Report")
    public JAXBElement<Report> createReport(Report value) {
        return new JAXBElement<Report>(_Report_QNAME, Report.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingleTick }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "SingleTick")
    public JAXBElement<SingleTick> createSingleTick(SingleTick value) {
        return new JAXBElement<SingleTick>(_SingleTick_QNAME, SingleTick.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricalChart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HistoricalChart")
    public JAXBElement<HistoricalChart> createHistoricalChart(HistoricalChart value) {
        return new JAXBElement<HistoricalChart>(_HistoricalChart_QNAME, HistoricalChart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrossRateTableLineWithBidAsk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CrossRateTableLineWithBidAsk")
    public JAXBElement<CrossRateTableLineWithBidAsk> createCrossRateTableLineWithBidAsk(CrossRateTableLineWithBidAsk value) {
        return new JAXBElement<CrossRateTableLineWithBidAsk>(_CrossRateTableLineWithBidAsk_QNAME, CrossRateTableLineWithBidAsk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricalCrossRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HistoricalCrossRate")
    public JAXBElement<HistoricalCrossRate> createHistoricalCrossRate(HistoricalCrossRate value) {
        return new JAXBElement<HistoricalCrossRate>(_HistoricalCrossRate_QNAME, HistoricalCrossRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FullHistoricalCrossRates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "FullHistoricalCrossRates")
    public JAXBElement<FullHistoricalCrossRates> createFullHistoricalCrossRates(FullHistoricalCrossRates value) {
        return new JAXBElement<FullHistoricalCrossRates>(_FullHistoricalCrossRates_QNAME, FullHistoricalCrossRates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrossRateChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CrossRateChange")
    public JAXBElement<CrossRateChange> createCrossRateChange(CrossRateChange value) {
        return new JAXBElement<CrossRateChange>(_CrossRateChange_QNAME, CrossRateChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistoricalCrossRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfHistoricalCrossRate")
    public JAXBElement<ArrayOfHistoricalCrossRate> createArrayOfHistoricalCrossRate(ArrayOfHistoricalCrossRate value) {
        return new JAXBElement<ArrayOfHistoricalCrossRate>(_ArrayOfHistoricalCrossRate_QNAME, ArrayOfHistoricalCrossRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAverageHistoricalCrossRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfAverageHistoricalCrossRate")
    public JAXBElement<ArrayOfAverageHistoricalCrossRate> createArrayOfAverageHistoricalCrossRate(ArrayOfAverageHistoricalCrossRate value) {
        return new JAXBElement<ArrayOfAverageHistoricalCrossRate>(_ArrayOfAverageHistoricalCrossRate_QNAME, ArrayOfAverageHistoricalCrossRate.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCrossRateTableWithBidAsk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfCrossRateTableWithBidAsk")
    public JAXBElement<ArrayOfCrossRateTableWithBidAsk> createArrayOfCrossRateTableWithBidAsk(ArrayOfCrossRateTableWithBidAsk value) {
        return new JAXBElement<ArrayOfCrossRateTableWithBidAsk>(_ArrayOfCrossRateTableWithBidAsk_QNAME, ArrayOfCrossRateTableWithBidAsk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleHistoricalCrossRates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "MultipleHistoricalCrossRates")
    public JAXBElement<MultipleHistoricalCrossRates> createMultipleHistoricalCrossRates(MultipleHistoricalCrossRates value) {
        return new JAXBElement<MultipleHistoricalCrossRates>(_MultipleHistoricalCrossRates_QNAME, MultipleHistoricalCrossRates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FullHistoricalCrossRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "FullHistoricalCrossRate")
    public JAXBElement<FullHistoricalCrossRate> createFullHistoricalCrossRate(FullHistoricalCrossRate value) {
        return new JAXBElement<FullHistoricalCrossRate>(_FullHistoricalCrossRate_QNAME, FullHistoricalCrossRate.class, null, value);
    }

}
