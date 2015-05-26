
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
    private final static QName _ArrayOfFuture_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfFuture");
    private final static QName _FutureQuotes_QNAME = new QName("http://www.xignite.com/services/", "FutureQuotes");
    private final static QName _IntradayChart_QNAME = new QName("http://www.xignite.com/services/", "IntradayChart");
    private final static QName _SingleTick_QNAME = new QName("http://www.xignite.com/services/", "SingleTick");
    private final static QName _HistoricalChart_QNAME = new QName("http://www.xignite.com/services/", "HistoricalChart");
    private final static QName _ArrayOfFutureQuote_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfFutureQuote");
    private final static QName _ChartBinary_QNAME = new QName("http://www.xignite.com/services/", "ChartBinary");
    private final static QName _FutureQuote_QNAME = new QName("http://www.xignite.com/services/", "FutureQuote");
    private final static QName _FutureOption_QNAME = new QName("http://www.xignite.com/services/", "FutureOption");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _Strip_QNAME = new QName("http://www.xignite.com/services/", "Strip");
    private final static QName _MarketHeadlines_QNAME = new QName("http://www.xignite.com/services/", "MarketHeadlines");
    private final static QName _ChartDesign_QNAME = new QName("http://www.xignite.com/services/", "ChartDesign");
    private final static QName _ArrayOfFutureOption_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfFutureOption");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDelayedEnergyFrontFuture }
     * 
     */
    public GetDelayedEnergyFrontFuture createGetDelayedEnergyFrontFuture() {
        return new GetDelayedEnergyFrontFuture();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyCommodityChartResponse }
     * 
     */
    public GetHistoricalEnergyCommodityChartResponse createGetHistoricalEnergyCommodityChartResponse() {
        return new GetHistoricalEnergyCommodityChartResponse();
    }

    /**
     * Create an instance of {@link HistoricalChart }
     * 
     */
    public HistoricalChart createHistoricalChart() {
        return new HistoricalChart();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyCommodityChartBinaryResponse }
     * 
     */
    public GetHistoricalEnergyCommodityChartBinaryResponse createGetHistoricalEnergyCommodityChartBinaryResponse() {
        return new GetHistoricalEnergyCommodityChartBinaryResponse();
    }

    /**
     * Create an instance of {@link ChartBinary }
     * 
     */
    public ChartBinary createChartBinary() {
        return new ChartBinary();
    }

    /**
     * Create an instance of {@link GetHistoricalChartDesignResponse }
     * 
     */
    public GetHistoricalChartDesignResponse createGetHistoricalChartDesignResponse() {
        return new GetHistoricalChartDesignResponse();
    }

    /**
     * Create an instance of {@link ChartDesign }
     * 
     */
    public ChartDesign createChartDesign() {
        return new ChartDesign();
    }

    /**
     * Create an instance of {@link ArrayOfFutureQuote }
     * 
     */
    public ArrayOfFutureQuote createArrayOfFutureQuote() {
        return new ArrayOfFutureQuote();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyTicksResponse }
     * 
     */
    public GetHistoricalEnergyTicksResponse createGetHistoricalEnergyTicksResponse() {
        return new GetHistoricalEnergyTicksResponse();
    }

    /**
     * Create an instance of {@link Ticks }
     * 
     */
    public Ticks createTicks() {
        return new Ticks();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyCommodityRangeResponse }
     * 
     */
    public GetHistoricalEnergyCommodityRangeResponse createGetHistoricalEnergyCommodityRangeResponse() {
        return new GetHistoricalEnergyCommodityRangeResponse();
    }

    /**
     * Create an instance of {@link FutureQuotes }
     * 
     */
    public FutureQuotes createFutureQuotes() {
        return new FutureQuotes();
    }

    /**
     * Create an instance of {@link MarketHeadlines }
     * 
     */
    public MarketHeadlines createMarketHeadlines() {
        return new MarketHeadlines();
    }

    /**
     * Create an instance of {@link GetEnergyTick }
     * 
     */
    public GetEnergyTick createGetEnergyTick() {
        return new GetEnergyTick();
    }

    /**
     * Create an instance of {@link ListEnergySwapsResponse }
     * 
     */
    public ListEnergySwapsResponse createListEnergySwapsResponse() {
        return new ListEnergySwapsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFuture }
     * 
     */
    public ArrayOfFuture createArrayOfFuture() {
        return new ArrayOfFuture();
    }

    /**
     * Create an instance of {@link GetDelayedEnergySwapResponse }
     * 
     */
    public GetDelayedEnergySwapResponse createGetDelayedEnergySwapResponse() {
        return new GetDelayedEnergySwapResponse();
    }

    /**
     * Create an instance of {@link FutureQuote }
     * 
     */
    public FutureQuote createFutureQuote() {
        return new FutureQuote();
    }

    /**
     * Create an instance of {@link GetDelayedEnergySpots }
     * 
     */
    public GetDelayedEnergySpots createGetDelayedEnergySpots() {
        return new GetDelayedEnergySpots();
    }

    /**
     * Create an instance of {@link GetIntradayChartDesignResponse }
     * 
     */
    public GetIntradayChartDesignResponse createGetIntradayChartDesignResponse() {
        return new GetIntradayChartDesignResponse();
    }

    /**
     * Create an instance of {@link ListEnergySwaps }
     * 
     */
    public ListEnergySwaps createListEnergySwaps() {
        return new ListEnergySwaps();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergySwaps }
     * 
     */
    public GetHistoricalEnergySwaps createGetHistoricalEnergySwaps() {
        return new GetHistoricalEnergySwaps();
    }

    /**
     * Create an instance of {@link Strip }
     * 
     */
    public Strip createStrip() {
        return new Strip();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetTopDelayedEnergyFuturesResponse }
     * 
     */
    public GetTopDelayedEnergyFuturesResponse createGetTopDelayedEnergyFuturesResponse() {
        return new GetTopDelayedEnergyFuturesResponse();
    }

    /**
     * Create an instance of {@link GetLastEnergyHeadlinesResponse }
     * 
     */
    public GetLastEnergyHeadlinesResponse createGetLastEnergyHeadlinesResponse() {
        return new GetLastEnergyHeadlinesResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergySwapResponse }
     * 
     */
    public GetHistoricalEnergySwapResponse createGetHistoricalEnergySwapResponse() {
        return new GetHistoricalEnergySwapResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureChartCustomBinaryResponse }
     * 
     */
    public GetHistoricalEnergyFutureChartCustomBinaryResponse createGetHistoricalEnergyFutureChartCustomBinaryResponse() {
        return new GetHistoricalEnergyFutureChartCustomBinaryResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureChartCustom }
     * 
     */
    public GetHistoricalEnergyFutureChartCustom createGetHistoricalEnergyFutureChartCustom() {
        return new GetHistoricalEnergyFutureChartCustom();
    }

    /**
     * Create an instance of {@link GetTopDelayedEnergyFutures }
     * 
     */
    public GetTopDelayedEnergyFutures createGetTopDelayedEnergyFutures() {
        return new GetTopDelayedEnergyFutures();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureChart }
     * 
     */
    public GetHistoricalEnergyFutureChart createGetHistoricalEnergyFutureChart() {
        return new GetHistoricalEnergyFutureChart();
    }

    /**
     * Create an instance of {@link GetAvailableEnergyFutures }
     * 
     */
    public GetAvailableEnergyFutures createGetAvailableEnergyFutures() {
        return new GetAvailableEnergyFutures();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergySwapRangeResponse }
     * 
     */
    public GetHistoricalEnergySwapRangeResponse createGetHistoricalEnergySwapRangeResponse() {
        return new GetHistoricalEnergySwapRangeResponse();
    }

    /**
     * Create an instance of {@link GetTopEnergyHeadlinesResponse }
     * 
     */
    public GetTopEnergyHeadlinesResponse createGetTopEnergyHeadlinesResponse() {
        return new GetTopEnergyHeadlinesResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyCommodityChartBinary }
     * 
     */
    public GetHistoricalEnergyCommodityChartBinary createGetHistoricalEnergyCommodityChartBinary() {
        return new GetHistoricalEnergyCommodityChartBinary();
    }

    /**
     * Create an instance of {@link GetDelayedEnergyFutureBySessionResponse }
     * 
     */
    public GetDelayedEnergyFutureBySessionResponse createGetDelayedEnergyFutureBySessionResponse() {
        return new GetDelayedEnergyFutureBySessionResponse();
    }

    /**
     * Create an instance of {@link GetDelayedEnergyFuturesBySessionResponse }
     * 
     */
    public GetDelayedEnergyFuturesBySessionResponse createGetDelayedEnergyFuturesBySessionResponse() {
        return new GetDelayedEnergyFuturesBySessionResponse();
    }

    /**
     * Create an instance of {@link GetAvailableEnergyFuturesResponse }
     * 
     */
    public GetAvailableEnergyFuturesResponse createGetAvailableEnergyFuturesResponse() {
        return new GetAvailableEnergyFuturesResponse();
    }

    /**
     * Create an instance of {@link ListEnergyFutures }
     * 
     */
    public ListEnergyFutures createListEnergyFutures() {
        return new ListEnergyFutures();
    }

    /**
     * Create an instance of {@link GetAllDelayedEnergyFuturesBySession }
     * 
     */
    public GetAllDelayedEnergyFuturesBySession createGetAllDelayedEnergyFuturesBySession() {
        return new GetAllDelayedEnergyFuturesBySession();
    }

    /**
     * Create an instance of {@link ArrayOfFutureOption }
     * 
     */
    public ArrayOfFutureOption createArrayOfFutureOption() {
        return new ArrayOfFutureOption();
    }

    /**
     * Create an instance of {@link GetDelayedEnergyFuturesBySession }
     * 
     */
    public GetDelayedEnergyFuturesBySession createGetDelayedEnergyFuturesBySession() {
        return new GetDelayedEnergyFuturesBySession();
    }

    /**
     * Create an instance of {@link GetIntradayEnergyFutureChartBinaryResponse }
     * 
     */
    public GetIntradayEnergyFutureChartBinaryResponse createGetIntradayEnergyFutureChartBinaryResponse() {
        return new GetIntradayEnergyFutureChartBinaryResponse();
    }

    /**
     * Create an instance of {@link GetDelayedEnergySwap }
     * 
     */
    public GetDelayedEnergySwap createGetDelayedEnergySwap() {
        return new GetDelayedEnergySwap();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureChartResponse }
     * 
     */
    public GetHistoricalEnergyFutureChartResponse createGetHistoricalEnergyFutureChartResponse() {
        return new GetHistoricalEnergyFutureChartResponse();
    }

    /**
     * Create an instance of {@link IntradayChart }
     * 
     */
    public IntradayChart createIntradayChart() {
        return new IntradayChart();
    }

    /**
     * Create an instance of {@link SingleTick }
     * 
     */
    public SingleTick createSingleTick() {
        return new SingleTick();
    }

    /**
     * Create an instance of {@link GetIntradayEnergyFutureChart }
     * 
     */
    public GetIntradayEnergyFutureChart createGetIntradayEnergyFutureChart() {
        return new GetIntradayEnergyFutureChart();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergySwapsResponse }
     * 
     */
    public GetHistoricalEnergySwapsResponse createGetHistoricalEnergySwapsResponse() {
        return new GetHistoricalEnergySwapsResponse();
    }

    /**
     * Create an instance of {@link GetAllDelayedEnergyFuturesResponse }
     * 
     */
    public GetAllDelayedEnergyFuturesResponse createGetAllDelayedEnergyFuturesResponse() {
        return new GetAllDelayedEnergyFuturesResponse();
    }

    /**
     * Create an instance of {@link GetAllDelayedEnergyFuturesBySessionResponse }
     * 
     */
    public GetAllDelayedEnergyFuturesBySessionResponse createGetAllDelayedEnergyFuturesBySessionResponse() {
        return new GetAllDelayedEnergyFuturesBySessionResponse();
    }

    /**
     * Create an instance of {@link GetAllHistoricalEnergyFutures }
     * 
     */
    public GetAllHistoricalEnergyFutures createGetAllHistoricalEnergyFutures() {
        return new GetAllHistoricalEnergyFutures();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyCommodityChartCustom }
     * 
     */
    public GetHistoricalEnergyCommodityChartCustom createGetHistoricalEnergyCommodityChartCustom() {
        return new GetHistoricalEnergyCommodityChartCustom();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyCommodityChartCustomResponse }
     * 
     */
    public GetHistoricalEnergyCommodityChartCustomResponse createGetHistoricalEnergyCommodityChartCustomResponse() {
        return new GetHistoricalEnergyCommodityChartCustomResponse();
    }

    /**
     * Create an instance of {@link GetDelayedEnergySpotsResponse }
     * 
     */
    public GetDelayedEnergySpotsResponse createGetDelayedEnergySpotsResponse() {
        return new GetDelayedEnergySpotsResponse();
    }

    /**
     * Create an instance of {@link GetIntradayEnergyFutureChartCustom }
     * 
     */
    public GetIntradayEnergyFutureChartCustom createGetIntradayEnergyFutureChartCustom() {
        return new GetIntradayEnergyFutureChartCustom();
    }

    /**
     * Create an instance of {@link GetTodaysEnergyHeadlines }
     * 
     */
    public GetTodaysEnergyHeadlines createGetTodaysEnergyHeadlines() {
        return new GetTodaysEnergyHeadlines();
    }

    /**
     * Create an instance of {@link GetDelayedEnergySpotResponse }
     * 
     */
    public GetDelayedEnergySpotResponse createGetDelayedEnergySpotResponse() {
        return new GetDelayedEnergySpotResponse();
    }

    /**
     * Create an instance of {@link ListEnergyFuturesResponse }
     * 
     */
    public ListEnergyFuturesResponse createListEnergyFuturesResponse() {
        return new ListEnergyFuturesResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFuturesResponse }
     * 
     */
    public GetHistoricalEnergyFuturesResponse createGetHistoricalEnergyFuturesResponse() {
        return new GetHistoricalEnergyFuturesResponse();
    }

    /**
     * Create an instance of {@link GetIntradayEnergyFutureChartBinary }
     * 
     */
    public GetIntradayEnergyFutureChartBinary createGetIntradayEnergyFutureChartBinary() {
        return new GetIntradayEnergyFutureChartBinary();
    }

    /**
     * Create an instance of {@link GetFutureOptionChainResponse }
     * 
     */
    public GetFutureOptionChainResponse createGetFutureOptionChainResponse() {
        return new GetFutureOptionChainResponse();
    }

    /**
     * Create an instance of {@link GetAllHistoricalEnergySwapsResponse }
     * 
     */
    public GetAllHistoricalEnergySwapsResponse createGetAllHistoricalEnergySwapsResponse() {
        return new GetAllHistoricalEnergySwapsResponse();
    }

    /**
     * Create an instance of {@link GetAllHistoricalEnergySwaps }
     * 
     */
    public GetAllHistoricalEnergySwaps createGetAllHistoricalEnergySwaps() {
        return new GetAllHistoricalEnergySwaps();
    }

    /**
     * Create an instance of {@link GetAvailableEnergySwapsResponse }
     * 
     */
    public GetAvailableEnergySwapsResponse createGetAvailableEnergySwapsResponse() {
        return new GetAvailableEnergySwapsResponse();
    }

    /**
     * Create an instance of {@link GetEnergyTicks }
     * 
     */
    public GetEnergyTicks createGetEnergyTicks() {
        return new GetEnergyTicks();
    }

    /**
     * Create an instance of {@link GetDelayedEnergyFutureStripResponse }
     * 
     */
    public GetDelayedEnergyFutureStripResponse createGetDelayedEnergyFutureStripResponse() {
        return new GetDelayedEnergyFutureStripResponse();
    }

    /**
     * Create an instance of {@link GetEnergyTickResponse }
     * 
     */
    public GetEnergyTickResponse createGetEnergyTickResponse() {
        return new GetEnergyTickResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureChartCustomBinary }
     * 
     */
    public GetHistoricalEnergyFutureChartCustomBinary createGetHistoricalEnergyFutureChartCustomBinary() {
        return new GetHistoricalEnergyFutureChartCustomBinary();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureChartCustomResponse }
     * 
     */
    public GetHistoricalEnergyFutureChartCustomResponse createGetHistoricalEnergyFutureChartCustomResponse() {
        return new GetHistoricalEnergyFutureChartCustomResponse();
    }

    /**
     * Create an instance of {@link GetFutureOptionsByStrikePrice }
     * 
     */
    public GetFutureOptionsByStrikePrice createGetFutureOptionsByStrikePrice() {
        return new GetFutureOptionsByStrikePrice();
    }

    /**
     * Create an instance of {@link GetDelayedEnergyFutureResponse }
     * 
     */
    public GetDelayedEnergyFutureResponse createGetDelayedEnergyFutureResponse() {
        return new GetDelayedEnergyFutureResponse();
    }

    /**
     * Create an instance of {@link GetIntradayChartDesign }
     * 
     */
    public GetIntradayChartDesign createGetIntradayChartDesign() {
        return new GetIntradayChartDesign();
    }

    /**
     * Create an instance of {@link GetDelayedEnergyFutureBySession }
     * 
     */
    public GetDelayedEnergyFutureBySession createGetDelayedEnergyFutureBySession() {
        return new GetDelayedEnergyFutureBySession();
    }

    /**
     * Create an instance of {@link GetDelayedEnergyFutures }
     * 
     */
    public GetDelayedEnergyFutures createGetDelayedEnergyFutures() {
        return new GetDelayedEnergyFutures();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureChartBinaryResponse }
     * 
     */
    public GetHistoricalEnergyFutureChartBinaryResponse createGetHistoricalEnergyFutureChartBinaryResponse() {
        return new GetHistoricalEnergyFutureChartBinaryResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergySpotRange }
     * 
     */
    public GetHistoricalEnergySpotRange createGetHistoricalEnergySpotRange() {
        return new GetHistoricalEnergySpotRange();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureStrip }
     * 
     */
    public GetHistoricalEnergyFutureStrip createGetHistoricalEnergyFutureStrip() {
        return new GetHistoricalEnergyFutureStrip();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyCommodityRange }
     * 
     */
    public GetHistoricalEnergyCommodityRange createGetHistoricalEnergyCommodityRange() {
        return new GetHistoricalEnergyCommodityRange();
    }

    /**
     * Create an instance of {@link GetIntradayEnergyFutureChartCustomBinaryResponse }
     * 
     */
    public GetIntradayEnergyFutureChartCustomBinaryResponse createGetIntradayEnergyFutureChartCustomBinaryResponse() {
        return new GetIntradayEnergyFutureChartCustomBinaryResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyCommodityChartCustomBinary }
     * 
     */
    public GetHistoricalEnergyCommodityChartCustomBinary createGetHistoricalEnergyCommodityChartCustomBinary() {
        return new GetHistoricalEnergyCommodityChartCustomBinary();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergySwap }
     * 
     */
    public GetHistoricalEnergySwap createGetHistoricalEnergySwap() {
        return new GetHistoricalEnergySwap();
    }

    /**
     * Create an instance of {@link GetFutureOptionsByStrikePriceResponse }
     * 
     */
    public GetFutureOptionsByStrikePriceResponse createGetFutureOptionsByStrikePriceResponse() {
        return new GetFutureOptionsByStrikePriceResponse();
    }

    /**
     * Create an instance of {@link GetFutureOption }
     * 
     */
    public GetFutureOption createGetFutureOption() {
        return new GetFutureOption();
    }

    /**
     * Create an instance of {@link GetAllDelayedEnergyFutures }
     * 
     */
    public GetAllDelayedEnergyFutures createGetAllDelayedEnergyFutures() {
        return new GetAllDelayedEnergyFutures();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureRangeResponse }
     * 
     */
    public GetHistoricalEnergyFutureRangeResponse createGetHistoricalEnergyFutureRangeResponse() {
        return new GetHistoricalEnergyFutureRangeResponse();
    }

    /**
     * Create an instance of {@link GetDelayedEnergyFrontFutureResponse }
     * 
     */
    public GetDelayedEnergyFrontFutureResponse createGetDelayedEnergyFrontFutureResponse() {
        return new GetDelayedEnergyFrontFutureResponse();
    }

    /**
     * Create an instance of {@link FutureOption }
     * 
     */
    public FutureOption createFutureOption() {
        return new FutureOption();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureStripResponse }
     * 
     */
    public GetHistoricalEnergyFutureStripResponse createGetHistoricalEnergyFutureStripResponse() {
        return new GetHistoricalEnergyFutureStripResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergySwapStrip }
     * 
     */
    public GetHistoricalEnergySwapStrip createGetHistoricalEnergySwapStrip() {
        return new GetHistoricalEnergySwapStrip();
    }

    /**
     * Create an instance of {@link GetAllHistoricalEnergyFuturesResponse }
     * 
     */
    public GetAllHistoricalEnergyFuturesResponse createGetAllHistoricalEnergyFuturesResponse() {
        return new GetAllHistoricalEnergyFuturesResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureChartBinary }
     * 
     */
    public GetHistoricalEnergyFutureChartBinary createGetHistoricalEnergyFutureChartBinary() {
        return new GetHistoricalEnergyFutureChartBinary();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergySwapStripResponse }
     * 
     */
    public GetHistoricalEnergySwapStripResponse createGetHistoricalEnergySwapStripResponse() {
        return new GetHistoricalEnergySwapStripResponse();
    }

    /**
     * Create an instance of {@link GetIntradayEnergyFutureChartCustomResponse }
     * 
     */
    public GetIntradayEnergyFutureChartCustomResponse createGetIntradayEnergyFutureChartCustomResponse() {
        return new GetIntradayEnergyFutureChartCustomResponse();
    }

    /**
     * Create an instance of {@link GetAvailableEnergySwaps }
     * 
     */
    public GetAvailableEnergySwaps createGetAvailableEnergySwaps() {
        return new GetAvailableEnergySwaps();
    }

    /**
     * Create an instance of {@link GetDelayedEnergyFutureStrip }
     * 
     */
    public GetDelayedEnergyFutureStrip createGetDelayedEnergyFutureStrip() {
        return new GetDelayedEnergyFutureStrip();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureRange }
     * 
     */
    public GetHistoricalEnergyFutureRange createGetHistoricalEnergyFutureRange() {
        return new GetHistoricalEnergyFutureRange();
    }

    /**
     * Create an instance of {@link GetDelayedEnergyFuture }
     * 
     */
    public GetDelayedEnergyFuture createGetDelayedEnergyFuture() {
        return new GetDelayedEnergyFuture();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyCommodityChartCustomBinaryResponse }
     * 
     */
    public GetHistoricalEnergyCommodityChartCustomBinaryResponse createGetHistoricalEnergyCommodityChartCustomBinaryResponse() {
        return new GetHistoricalEnergyCommodityChartCustomBinaryResponse();
    }

    /**
     * Create an instance of {@link GetFutureOptionResponse }
     * 
     */
    public GetFutureOptionResponse createGetFutureOptionResponse() {
        return new GetFutureOptionResponse();
    }

    /**
     * Create an instance of {@link GetEnergyTicksResponse }
     * 
     */
    public GetEnergyTicksResponse createGetEnergyTicksResponse() {
        return new GetEnergyTicksResponse();
    }

    /**
     * Create an instance of {@link GetTopEnergyHeadlines }
     * 
     */
    public GetTopEnergyHeadlines createGetTopEnergyHeadlines() {
        return new GetTopEnergyHeadlines();
    }

    /**
     * Create an instance of {@link GetHistoricalChartDesign }
     * 
     */
    public GetHistoricalChartDesign createGetHistoricalChartDesign() {
        return new GetHistoricalChartDesign();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutureResponse }
     * 
     */
    public GetHistoricalEnergyFutureResponse createGetHistoricalEnergyFutureResponse() {
        return new GetHistoricalEnergyFutureResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyCommodityChart }
     * 
     */
    public GetHistoricalEnergyCommodityChart createGetHistoricalEnergyCommodityChart() {
        return new GetHistoricalEnergyCommodityChart();
    }

    /**
     * Create an instance of {@link GetIntradayEnergyFutureChartResponse }
     * 
     */
    public GetIntradayEnergyFutureChartResponse createGetIntradayEnergyFutureChartResponse() {
        return new GetIntradayEnergyFutureChartResponse();
    }

    /**
     * Create an instance of {@link GetDelayedEnergyFuturesResponse }
     * 
     */
    public GetDelayedEnergyFuturesResponse createGetDelayedEnergyFuturesResponse() {
        return new GetDelayedEnergyFuturesResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFutures }
     * 
     */
    public GetHistoricalEnergyFutures createGetHistoricalEnergyFutures() {
        return new GetHistoricalEnergyFutures();
    }

    /**
     * Create an instance of {@link GetIntradayEnergyFutureChartCustomBinary }
     * 
     */
    public GetIntradayEnergyFutureChartCustomBinary createGetIntradayEnergyFutureChartCustomBinary() {
        return new GetIntradayEnergyFutureChartCustomBinary();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyFuture }
     * 
     */
    public GetHistoricalEnergyFuture createGetHistoricalEnergyFuture() {
        return new GetHistoricalEnergyFuture();
    }

    /**
     * Create an instance of {@link GetDelayedEnergySpot }
     * 
     */
    public GetDelayedEnergySpot createGetDelayedEnergySpot() {
        return new GetDelayedEnergySpot();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergyTicks }
     * 
     */
    public GetHistoricalEnergyTicks createGetHistoricalEnergyTicks() {
        return new GetHistoricalEnergyTicks();
    }

    /**
     * Create an instance of {@link GetLastEnergyHeadlines }
     * 
     */
    public GetLastEnergyHeadlines createGetLastEnergyHeadlines() {
        return new GetLastEnergyHeadlines();
    }

    /**
     * Create an instance of {@link GetTodaysEnergyHeadlinesResponse }
     * 
     */
    public GetTodaysEnergyHeadlinesResponse createGetTodaysEnergyHeadlinesResponse() {
        return new GetTodaysEnergyHeadlinesResponse();
    }

    /**
     * Create an instance of {@link GetFutureOptionChain }
     * 
     */
    public GetFutureOptionChain createGetFutureOptionChain() {
        return new GetFutureOptionChain();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergySpotRangeResponse }
     * 
     */
    public GetHistoricalEnergySpotRangeResponse createGetHistoricalEnergySpotRangeResponse() {
        return new GetHistoricalEnergySpotRangeResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalEnergySwapRange }
     * 
     */
    public GetHistoricalEnergySwapRange createGetHistoricalEnergySwapRange() {
        return new GetHistoricalEnergySwapRange();
    }

    /**
     * Create an instance of {@link ReleaseSource }
     * 
     */
    public ReleaseSource createReleaseSource() {
        return new ReleaseSource();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link ArrayOfTick }
     * 
     */
    public ArrayOfTick createArrayOfTick() {
        return new ArrayOfTick();
    }

    /**
     * Create an instance of {@link Tick }
     * 
     */
    public Tick createTick() {
        return new Tick();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link ArrayOfMarketHeadline }
     * 
     */
    public ArrayOfMarketHeadline createArrayOfMarketHeadline() {
        return new ArrayOfMarketHeadline();
    }

    /**
     * Create an instance of {@link Future }
     * 
     */
    public Future createFuture() {
        return new Future();
    }

    /**
     * Create an instance of {@link StockChart }
     * 
     */
    public StockChart createStockChart() {
        return new StockChart();
    }

    /**
     * Create an instance of {@link MarketHeadline }
     * 
     */
    public MarketHeadline createMarketHeadline() {
        return new MarketHeadline();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFuture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfFuture")
    public JAXBElement<ArrayOfFuture> createArrayOfFuture(ArrayOfFuture value) {
        return new JAXBElement<ArrayOfFuture>(_ArrayOfFuture_QNAME, ArrayOfFuture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutureQuotes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "FutureQuotes")
    public JAXBElement<FutureQuotes> createFutureQuotes(FutureQuotes value) {
        return new JAXBElement<FutureQuotes>(_FutureQuotes_QNAME, FutureQuotes.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFutureQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfFutureQuote")
    public JAXBElement<ArrayOfFutureQuote> createArrayOfFutureQuote(ArrayOfFutureQuote value) {
        return new JAXBElement<ArrayOfFutureQuote>(_ArrayOfFutureQuote_QNAME, ArrayOfFutureQuote.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FutureQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "FutureQuote")
    public JAXBElement<FutureQuote> createFutureQuote(FutureQuote value) {
        return new JAXBElement<FutureQuote>(_FutureQuote_QNAME, FutureQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FutureOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "FutureOption")
    public JAXBElement<FutureOption> createFutureOption(FutureOption value) {
        return new JAXBElement<FutureOption>(_FutureOption_QNAME, FutureOption.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Strip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Strip")
    public JAXBElement<Strip> createStrip(Strip value) {
        return new JAXBElement<Strip>(_Strip_QNAME, Strip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketHeadlines }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "MarketHeadlines")
    public JAXBElement<MarketHeadlines> createMarketHeadlines(MarketHeadlines value) {
        return new JAXBElement<MarketHeadlines>(_MarketHeadlines_QNAME, MarketHeadlines.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFutureOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfFutureOption")
    public JAXBElement<ArrayOfFutureOption> createArrayOfFutureOption(ArrayOfFutureOption value) {
        return new JAXBElement<ArrayOfFutureOption>(_ArrayOfFutureOption_QNAME, ArrayOfFutureOption.class, null, value);
    }

}
