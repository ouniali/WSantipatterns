
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
    private final static QName _ArrayOfQuote_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfQuote");
    private final static QName _Histogram_QNAME = new QName("http://www.xignite.com/services/", "Histogram");
    private final static QName _IntradayChart_QNAME = new QName("http://www.xignite.com/services/", "IntradayChart");
    private final static QName _MarketSummary_QNAME = new QName("http://www.xignite.com/services/", "MarketSummary");
    private final static QName _SingleTick_QNAME = new QName("http://www.xignite.com/services/", "SingleTick");
    private final static QName _ArrayOfQuickQuote_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfQuickQuote");
    private final static QName _ArrayOfTop_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfTop");
    private final static QName _ArrayOfMarketIndex_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfMarketIndex");
    private final static QName _HTMLResult_QNAME = new QName("http://www.xignite.com/services/", "HTMLResult");
    private final static QName _ArrayOfTicks_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfTicks");
    private final static QName _ExtendedQuote_QNAME = new QName("http://www.xignite.com/services/", "ExtendedQuote");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _ArrayOfMissingTickRange_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfMissingTickRange");
    private final static QName _Quote_QNAME = new QName("http://www.xignite.com/services/", "Quote");
    private final static QName _ArrayOfTopExchange_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfTopExchange");
    private final static QName _ExtendedFundQuote_QNAME = new QName("http://www.xignite.com/services/", "ExtendedFundQuote");
    private final static QName _ChartDesign_QNAME = new QName("http://www.xignite.com/services/", "ChartDesign");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDelayedBinaryChartResponse }
     * 
     */
    public GetDelayedBinaryChartResponse createGetDelayedBinaryChartResponse() {
        return new GetDelayedBinaryChartResponse();
    }

    /**
     * Create an instance of {@link IntradayChart }
     * 
     */
    public IntradayChart createIntradayChart() {
        return new IntradayChart();
    }

    /**
     * Create an instance of {@link GetQuote }
     * 
     */
    public GetQuote createGetQuote() {
        return new GetQuote();
    }

    /**
     * Create an instance of {@link Histogram }
     * 
     */
    public Histogram createHistogram() {
        return new Histogram();
    }

    /**
     * Create an instance of {@link GetMarketSummaryResponse }
     * 
     */
    public GetMarketSummaryResponse createGetMarketSummaryResponse() {
        return new GetMarketSummaryResponse();
    }

    /**
     * Create an instance of {@link MarketSummary }
     * 
     */
    public MarketSummary createMarketSummary() {
        return new MarketSummary();
    }

    /**
     * Create an instance of {@link GetFundQuote }
     * 
     */
    public GetFundQuote createGetFundQuote() {
        return new GetFundQuote();
    }

    /**
     * Create an instance of {@link Ticks }
     * 
     */
    public Ticks createTicks() {
        return new Ticks();
    }

    /**
     * Create an instance of {@link GetTopMoversResponse }
     * 
     */
    public GetTopMoversResponse createGetTopMoversResponse() {
        return new GetTopMoversResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTop }
     * 
     */
    public ArrayOfTop createArrayOfTop() {
        return new ArrayOfTop();
    }

    /**
     * Create an instance of {@link GetDelayedChartAsOfDateCustom }
     * 
     */
    public GetDelayedChartAsOfDateCustom createGetDelayedChartAsOfDateCustom() {
        return new GetDelayedChartAsOfDateCustom();
    }

    /**
     * Create an instance of {@link ChartDesign }
     * 
     */
    public ChartDesign createChartDesign() {
        return new ChartDesign();
    }

    /**
     * Create an instance of {@link ArrayOfTicks }
     * 
     */
    public ArrayOfTicks createArrayOfTicks() {
        return new ArrayOfTicks();
    }

    /**
     * Create an instance of {@link GetDelayedChartCustom }
     * 
     */
    public GetDelayedChartCustom createGetDelayedChartCustom() {
        return new GetDelayedChartCustom();
    }

    /**
     * Create an instance of {@link GetMarketChartResponse }
     * 
     */
    public GetMarketChartResponse createGetMarketChartResponse() {
        return new GetMarketChartResponse();
    }

    /**
     * Create an instance of {@link HTMLResult }
     * 
     */
    public HTMLResult createHTMLResult() {
        return new HTMLResult();
    }

    /**
     * Create an instance of {@link ArrayOfMissingTickRange }
     * 
     */
    public ArrayOfMissingTickRange createArrayOfMissingTickRange() {
        return new ArrayOfMissingTickRange();
    }

    /**
     * Create an instance of {@link ArrayOfTopExchange }
     * 
     */
    public ArrayOfTopExchange createArrayOfTopExchange() {
        return new ArrayOfTopExchange();
    }

    /**
     * Create an instance of {@link GetDelayedBinaryChartAsOfDateResponse }
     * 
     */
    public GetDelayedBinaryChartAsOfDateResponse createGetDelayedBinaryChartAsOfDateResponse() {
        return new GetDelayedBinaryChartAsOfDateResponse();
    }

    /**
     * Create an instance of {@link GetTicksResponse }
     * 
     */
    public GetTicksResponse createGetTicksResponse() {
        return new GetTicksResponse();
    }

    /**
     * Create an instance of {@link GetDelayedChartAsOfDatePreset }
     * 
     */
    public GetDelayedChartAsOfDatePreset createGetDelayedChartAsOfDatePreset() {
        return new GetDelayedChartAsOfDatePreset();
    }

    /**
     * Create an instance of {@link GetTopsByExchange }
     * 
     */
    public GetTopsByExchange createGetTopsByExchange() {
        return new GetTopsByExchange();
    }

    /**
     * Create an instance of {@link GetHistoricalTickHistogramResponse }
     * 
     */
    public GetHistoricalTickHistogramResponse createGetHistoricalTickHistogramResponse() {
        return new GetHistoricalTickHistogramResponse();
    }

    /**
     * Create an instance of {@link ExtendedQuote }
     * 
     */
    public ExtendedQuote createExtendedQuote() {
        return new ExtendedQuote();
    }

    /**
     * Create an instance of {@link GetMissingTickRanges }
     * 
     */
    public GetMissingTickRanges createGetMissingTickRanges() {
        return new GetMissingTickRanges();
    }

    /**
     * Create an instance of {@link GetDelayedChartAsOfDate }
     * 
     */
    public GetDelayedChartAsOfDate createGetDelayedChartAsOfDate() {
        return new GetDelayedChartAsOfDate();
    }

    /**
     * Create an instance of {@link GetTickCollectionsResponse }
     * 
     */
    public GetTickCollectionsResponse createGetTickCollectionsResponse() {
        return new GetTickCollectionsResponse();
    }

    /**
     * Create an instance of {@link GetChartDesignResponse }
     * 
     */
    public GetChartDesignResponse createGetChartDesignResponse() {
        return new GetChartDesignResponse();
    }

    /**
     * Create an instance of {@link GetChartDesign }
     * 
     */
    public GetChartDesign createGetChartDesign() {
        return new GetChartDesign();
    }

    /**
     * Create an instance of {@link GetDelayedChart }
     * 
     */
    public GetDelayedChart createGetDelayedChart() {
        return new GetDelayedChart();
    }

    /**
     * Create an instance of {@link ArrayOfQuote }
     * 
     */
    public ArrayOfQuote createArrayOfQuote() {
        return new ArrayOfQuote();
    }

    /**
     * Create an instance of {@link GetClosingTicksAsOfDateResponse }
     * 
     */
    public GetClosingTicksAsOfDateResponse createGetClosingTicksAsOfDateResponse() {
        return new GetClosingTicksAsOfDateResponse();
    }

    /**
     * Create an instance of {@link GetQuickQuotesResponse }
     * 
     */
    public GetQuickQuotesResponse createGetQuickQuotesResponse() {
        return new GetQuickQuotesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfQuickQuote }
     * 
     */
    public ArrayOfQuickQuote createArrayOfQuickQuote() {
        return new ArrayOfQuickQuote();
    }

    /**
     * Create an instance of {@link GetTopGainersResponse }
     * 
     */
    public GetTopGainersResponse createGetTopGainersResponse() {
        return new GetTopGainersResponse();
    }

    /**
     * Create an instance of {@link GetTopLosers }
     * 
     */
    public GetTopLosers createGetTopLosers() {
        return new GetTopLosers();
    }

    /**
     * Create an instance of {@link GetDelayedChartPresetResponse }
     * 
     */
    public GetDelayedChartPresetResponse createGetDelayedChartPresetResponse() {
        return new GetDelayedChartPresetResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalTicksAsOfDate }
     * 
     */
    public GetHistoricalTicksAsOfDate createGetHistoricalTicksAsOfDate() {
        return new GetHistoricalTicksAsOfDate();
    }

    /**
     * Create an instance of {@link GetDelayedChartResponse }
     * 
     */
    public GetDelayedChartResponse createGetDelayedChartResponse() {
        return new GetDelayedChartResponse();
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
     * Create an instance of {@link GetClosingTicks }
     * 
     */
    public GetClosingTicks createGetClosingTicks() {
        return new GetClosingTicks();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetTopResponse }
     * 
     */
    public GetTopResponse createGetTopResponse() {
        return new GetTopResponse();
    }

    /**
     * Create an instance of {@link GetQuotesResponse }
     * 
     */
    public GetQuotesResponse createGetQuotesResponse() {
        return new GetQuotesResponse();
    }

    /**
     * Create an instance of {@link GetDelayedChartCustomResponse }
     * 
     */
    public GetDelayedChartCustomResponse createGetDelayedChartCustomResponse() {
        return new GetDelayedChartCustomResponse();
    }

    /**
     * Create an instance of {@link GetClosingTicksResponse }
     * 
     */
    public GetClosingTicksResponse createGetClosingTicksResponse() {
        return new GetClosingTicksResponse();
    }

    /**
     * Create an instance of {@link GetTopMovers }
     * 
     */
    public GetTopMovers createGetTopMovers() {
        return new GetTopMovers();
    }

    /**
     * Create an instance of {@link GetHistoricalTicks }
     * 
     */
    public GetHistoricalTicks createGetHistoricalTicks() {
        return new GetHistoricalTicks();
    }

    /**
     * Create an instance of {@link GetHistoricalTickHistogram }
     * 
     */
    public GetHistoricalTickHistogram createGetHistoricalTickHistogram() {
        return new GetHistoricalTickHistogram();
    }

    /**
     * Create an instance of {@link GetIndicesResponse }
     * 
     */
    public GetIndicesResponse createGetIndicesResponse() {
        return new GetIndicesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMarketIndex }
     * 
     */
    public ArrayOfMarketIndex createArrayOfMarketIndex() {
        return new ArrayOfMarketIndex();
    }

    /**
     * Create an instance of {@link GetQuotesByIdentifiers }
     * 
     */
    public GetQuotesByIdentifiers createGetQuotesByIdentifiers() {
        return new GetQuotesByIdentifiers();
    }

    /**
     * Create an instance of {@link GetHistoricalTicksAsOfDateResponse }
     * 
     */
    public GetHistoricalTicksAsOfDateResponse createGetHistoricalTicksAsOfDateResponse() {
        return new GetHistoricalTicksAsOfDateResponse();
    }

    /**
     * Create an instance of {@link GetTickHistogramResponse }
     * 
     */
    public GetTickHistogramResponse createGetTickHistogramResponse() {
        return new GetTickHistogramResponse();
    }

    /**
     * Create an instance of {@link GetDelayedChartAsOfDateResponse }
     * 
     */
    public GetDelayedChartAsOfDateResponse createGetDelayedChartAsOfDateResponse() {
        return new GetDelayedChartAsOfDateResponse();
    }

    /**
     * Create an instance of {@link GetQuotes }
     * 
     */
    public GetQuotes createGetQuotes() {
        return new GetQuotes();
    }

    /**
     * Create an instance of {@link GetTick }
     * 
     */
    public GetTick createGetTick() {
        return new GetTick();
    }

    /**
     * Create an instance of {@link ExtendedFundQuote }
     * 
     */
    public ExtendedFundQuote createExtendedFundQuote() {
        return new ExtendedFundQuote();
    }

    /**
     * Create an instance of {@link GetTop }
     * 
     */
    public GetTop createGetTop() {
        return new GetTop();
    }

    /**
     * Create an instance of {@link ListTopExchanges }
     * 
     */
    public ListTopExchanges createListTopExchanges() {
        return new ListTopExchanges();
    }

    /**
     * Create an instance of {@link GetHistoricalTicksResponse }
     * 
     */
    public GetHistoricalTicksResponse createGetHistoricalTicksResponse() {
        return new GetHistoricalTicksResponse();
    }

    /**
     * Create an instance of {@link GetSingleQuote }
     * 
     */
    public GetSingleQuote createGetSingleQuote() {
        return new GetSingleQuote();
    }

    /**
     * Create an instance of {@link GetSingleQuoteResponse }
     * 
     */
    public GetSingleQuoteResponse createGetSingleQuoteResponse() {
        return new GetSingleQuoteResponse();
    }

    /**
     * Create an instance of {@link Quote }
     * 
     */
    public Quote createQuote() {
        return new Quote();
    }

    /**
     * Create an instance of {@link GetTopsByExchangeResponse }
     * 
     */
    public GetTopsByExchangeResponse createGetTopsByExchangeResponse() {
        return new GetTopsByExchangeResponse();
    }

    /**
     * Create an instance of {@link GetIndices }
     * 
     */
    public GetIndices createGetIndices() {
        return new GetIndices();
    }

    /**
     * Create an instance of {@link GetFundQuoteResponse }
     * 
     */
    public GetFundQuoteResponse createGetFundQuoteResponse() {
        return new GetFundQuoteResponse();
    }

    /**
     * Create an instance of {@link GetMissingTickRangesResponse }
     * 
     */
    public GetMissingTickRangesResponse createGetMissingTickRangesResponse() {
        return new GetMissingTickRangesResponse();
    }

    /**
     * Create an instance of {@link GetQuoteResponse }
     * 
     */
    public GetQuoteResponse createGetQuoteResponse() {
        return new GetQuoteResponse();
    }

    /**
     * Create an instance of {@link GetTicks }
     * 
     */
    public GetTicks createGetTicks() {
        return new GetTicks();
    }

    /**
     * Create an instance of {@link GetQuotesByIdentifiersResponse }
     * 
     */
    public GetQuotesByIdentifiersResponse createGetQuotesByIdentifiersResponse() {
        return new GetQuotesByIdentifiersResponse();
    }

    /**
     * Create an instance of {@link GetDelayedBinaryChartAsOfDate }
     * 
     */
    public GetDelayedBinaryChartAsOfDate createGetDelayedBinaryChartAsOfDate() {
        return new GetDelayedBinaryChartAsOfDate();
    }

    /**
     * Create an instance of {@link GetQuickQuotes }
     * 
     */
    public GetQuickQuotes createGetQuickQuotes() {
        return new GetQuickQuotes();
    }

    /**
     * Create an instance of {@link GetTopLosersResponse }
     * 
     */
    public GetTopLosersResponse createGetTopLosersResponse() {
        return new GetTopLosersResponse();
    }

    /**
     * Create an instance of {@link GetDelayedChartPreset }
     * 
     */
    public GetDelayedChartPreset createGetDelayedChartPreset() {
        return new GetDelayedChartPreset();
    }

    /**
     * Create an instance of {@link GetDelayedChartAsOfDatePresetResponse }
     * 
     */
    public GetDelayedChartAsOfDatePresetResponse createGetDelayedChartAsOfDatePresetResponse() {
        return new GetDelayedChartAsOfDatePresetResponse();
    }

    /**
     * Create an instance of {@link GetClosingTicksAsOfDate }
     * 
     */
    public GetClosingTicksAsOfDate createGetClosingTicksAsOfDate() {
        return new GetClosingTicksAsOfDate();
    }

    /**
     * Create an instance of {@link GetDelayedBinaryChart }
     * 
     */
    public GetDelayedBinaryChart createGetDelayedBinaryChart() {
        return new GetDelayedBinaryChart();
    }

    /**
     * Create an instance of {@link ListTopExchangesResponse }
     * 
     */
    public ListTopExchangesResponse createListTopExchangesResponse() {
        return new ListTopExchangesResponse();
    }

    /**
     * Create an instance of {@link GetTickHistogram }
     * 
     */
    public GetTickHistogram createGetTickHistogram() {
        return new GetTickHistogram();
    }

    /**
     * Create an instance of {@link GetTopGainers }
     * 
     */
    public GetTopGainers createGetTopGainers() {
        return new GetTopGainers();
    }

    /**
     * Create an instance of {@link GetMarketSummary }
     * 
     */
    public GetMarketSummary createGetMarketSummary() {
        return new GetMarketSummary();
    }

    /**
     * Create an instance of {@link GetDelayedChartAsOfDateCustomResponse }
     * 
     */
    public GetDelayedChartAsOfDateCustomResponse createGetDelayedChartAsOfDateCustomResponse() {
        return new GetDelayedChartAsOfDateCustomResponse();
    }

    /**
     * Create an instance of {@link GetTickCollections }
     * 
     */
    public GetTickCollections createGetTickCollections() {
        return new GetTickCollections();
    }

    /**
     * Create an instance of {@link GetMarketChart }
     * 
     */
    public GetMarketChart createGetMarketChart() {
        return new GetMarketChart();
    }

    /**
     * Create an instance of {@link ArrayOfStockNews }
     * 
     */
    public ArrayOfStockNews createArrayOfStockNews() {
        return new ArrayOfStockNews();
    }

    /**
     * Create an instance of {@link QuickQuote }
     * 
     */
    public QuickQuote createQuickQuote() {
        return new QuickQuote();
    }

    /**
     * Create an instance of {@link ArrayOfIndicator }
     * 
     */
    public ArrayOfIndicator createArrayOfIndicator() {
        return new ArrayOfIndicator();
    }

    /**
     * Create an instance of {@link Index }
     * 
     */
    public Index createIndex() {
        return new Index();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link ArrayOfIndex }
     * 
     */
    public ArrayOfIndex createArrayOfIndex() {
        return new ArrayOfIndex();
    }

    /**
     * Create an instance of {@link Tick }
     * 
     */
    public Tick createTick() {
        return new Tick();
    }

    /**
     * Create an instance of {@link ArrayOfBar }
     * 
     */
    public ArrayOfBar createArrayOfBar() {
        return new ArrayOfBar();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link Top }
     * 
     */
    public Top createTop() {
        return new Top();
    }

    /**
     * Create an instance of {@link TopExchange }
     * 
     */
    public TopExchange createTopExchange() {
        return new TopExchange();
    }

    /**
     * Create an instance of {@link FundQuote }
     * 
     */
    public FundQuote createFundQuote() {
        return new FundQuote();
    }

    /**
     * Create an instance of {@link MissingTickRange }
     * 
     */
    public MissingTickRange createMissingTickRange() {
        return new MissingTickRange();
    }

    /**
     * Create an instance of {@link StockStatistics }
     * 
     */
    public StockStatistics createStockStatistics() {
        return new StockStatistics();
    }

    /**
     * Create an instance of {@link ArrayOfTick }
     * 
     */
    public ArrayOfTick createArrayOfTick() {
        return new ArrayOfTick();
    }

    /**
     * Create an instance of {@link MarketIndex }
     * 
     */
    public MarketIndex createMarketIndex() {
        return new MarketIndex();
    }

    /**
     * Create an instance of {@link StockQuote }
     * 
     */
    public StockQuote createStockQuote() {
        return new StockQuote();
    }

    /**
     * Create an instance of {@link StockNews }
     * 
     */
    public StockNews createStockNews() {
        return new StockNews();
    }

    /**
     * Create an instance of {@link Indicator }
     * 
     */
    public Indicator createIndicator() {
        return new Indicator();
    }

    /**
     * Create an instance of {@link Bar }
     * 
     */
    public Bar createBar() {
        return new Bar();
    }

    /**
     * Create an instance of {@link StockChart }
     * 
     */
    public StockChart createStockChart() {
        return new StockChart();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfQuote")
    public JAXBElement<ArrayOfQuote> createArrayOfQuote(ArrayOfQuote value) {
        return new JAXBElement<ArrayOfQuote>(_ArrayOfQuote_QNAME, ArrayOfQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Histogram }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Histogram")
    public JAXBElement<Histogram> createHistogram(Histogram value) {
        return new JAXBElement<Histogram>(_Histogram_QNAME, Histogram.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntradayChart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "IntradayChart")
    public JAXBElement<IntradayChart> createIntradayChart(IntradayChart value) {
        return new JAXBElement<IntradayChart>(_IntradayChart_QNAME, IntradayChart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "MarketSummary")
    public JAXBElement<MarketSummary> createMarketSummary(MarketSummary value) {
        return new JAXBElement<MarketSummary>(_MarketSummary_QNAME, MarketSummary.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQuickQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfQuickQuote")
    public JAXBElement<ArrayOfQuickQuote> createArrayOfQuickQuote(ArrayOfQuickQuote value) {
        return new JAXBElement<ArrayOfQuickQuote>(_ArrayOfQuickQuote_QNAME, ArrayOfQuickQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfTop")
    public JAXBElement<ArrayOfTop> createArrayOfTop(ArrayOfTop value) {
        return new JAXBElement<ArrayOfTop>(_ArrayOfTop_QNAME, ArrayOfTop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMarketIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfMarketIndex")
    public JAXBElement<ArrayOfMarketIndex> createArrayOfMarketIndex(ArrayOfMarketIndex value) {
        return new JAXBElement<ArrayOfMarketIndex>(_ArrayOfMarketIndex_QNAME, ArrayOfMarketIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HTMLResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HTMLResult")
    public JAXBElement<HTMLResult> createHTMLResult(HTMLResult value) {
        return new JAXBElement<HTMLResult>(_HTMLResult_QNAME, HTMLResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTicks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfTicks")
    public JAXBElement<ArrayOfTicks> createArrayOfTicks(ArrayOfTicks value) {
        return new JAXBElement<ArrayOfTicks>(_ArrayOfTicks_QNAME, ArrayOfTicks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ExtendedQuote")
    public JAXBElement<ExtendedQuote> createExtendedQuote(ExtendedQuote value) {
        return new JAXBElement<ExtendedQuote>(_ExtendedQuote_QNAME, ExtendedQuote.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMissingTickRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfMissingTickRange")
    public JAXBElement<ArrayOfMissingTickRange> createArrayOfMissingTickRange(ArrayOfMissingTickRange value) {
        return new JAXBElement<ArrayOfMissingTickRange>(_ArrayOfMissingTickRange_QNAME, ArrayOfMissingTickRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Quote")
    public JAXBElement<Quote> createQuote(Quote value) {
        return new JAXBElement<Quote>(_Quote_QNAME, Quote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTopExchange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfTopExchange")
    public JAXBElement<ArrayOfTopExchange> createArrayOfTopExchange(ArrayOfTopExchange value) {
        return new JAXBElement<ArrayOfTopExchange>(_ArrayOfTopExchange_QNAME, ArrayOfTopExchange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedFundQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ExtendedFundQuote")
    public JAXBElement<ExtendedFundQuote> createExtendedFundQuote(ExtendedFundQuote value) {
        return new JAXBElement<ExtendedFundQuote>(_ExtendedFundQuote_QNAME, ExtendedFundQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChartDesign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ChartDesign")
    public JAXBElement<ChartDesign> createChartDesign(ChartDesign value) {
        return new JAXBElement<ChartDesign>(_ChartDesign_QNAME, ChartDesign.class, null, value);
    }

}
