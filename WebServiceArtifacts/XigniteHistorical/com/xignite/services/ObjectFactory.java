
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

    private final static QName _ExtendedDividendHistory_QNAME = new QName("http://www.xignite.com/services/", "ExtendedDividendHistory");
    private final static QName _DividendHistory_QNAME = new QName("http://www.xignite.com/services/", "DividendHistory");
    private final static QName _SplitRatio_QNAME = new QName("http://www.xignite.com/services/", "SplitRatio");
    private final static QName _ArrayOfTop_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfTop");
    private final static QName _SplitHistory_QNAME = new QName("http://www.xignite.com/services/", "SplitHistory");
    private final static QName _AdvancesAndDeclines_QNAME = new QName("http://www.xignite.com/services/", "AdvancesAndDeclines");
    private final static QName _CompleteDividendHistory_QNAME = new QName("http://www.xignite.com/services/", "CompleteDividendHistory");
    private final static QName _ArrayOfTopByCapitalization_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfTopByCapitalization");
    private final static QName _HistoricalQuotes_QNAME = new QName("http://www.xignite.com/services/", "HistoricalQuotes");
    private final static QName _HistoricalHighLow_QNAME = new QName("http://www.xignite.com/services/", "HistoricalHighLow");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _HistoricalStatistics_QNAME = new QName("http://www.xignite.com/services/", "HistoricalStatistics");
    private final static QName _ArrayOfHistoricalQuote_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfHistoricalQuote");
    private final static QName _HistoricalQuote_QNAME = new QName("http://www.xignite.com/services/", "HistoricalQuote");
    private final static QName _SymbolList_QNAME = new QName("http://www.xignite.com/services/", "SymbolList");
    private final static QName _ArrayOfSplitHistory_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfSplitHistory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExtendedDividendHistory }
     * 
     */
    public ExtendedDividendHistory createExtendedDividendHistory() {
        return new ExtendedDividendHistory();
    }

    /**
     * Create an instance of {@link GetHistoricalQuotesAdjusted }
     * 
     */
    public GetHistoricalQuotesAdjusted createGetHistoricalQuotesAdjusted() {
        return new GetHistoricalQuotesAdjusted();
    }

    /**
     * Create an instance of {@link GetHistoricalQuotesRangeResponse }
     * 
     */
    public GetHistoricalQuotesRangeResponse createGetHistoricalQuotesRangeResponse() {
        return new GetHistoricalQuotesRangeResponse();
    }

    /**
     * Create an instance of {@link HistoricalQuotes }
     * 
     */
    public HistoricalQuotes createHistoricalQuotes() {
        return new HistoricalQuotes();
    }

    /**
     * Create an instance of {@link GetExtendedDividendHistory }
     * 
     */
    public GetExtendedDividendHistory createGetExtendedDividendHistory() {
        return new GetExtendedDividendHistory();
    }

    /**
     * Create an instance of {@link SplitHistory }
     * 
     */
    public SplitHistory createSplitHistory() {
        return new SplitHistory();
    }

    /**
     * Create an instance of {@link GetHistoricalMonthlyQuotesRangeAdjustedResponse }
     * 
     */
    public GetHistoricalMonthlyQuotesRangeAdjustedResponse createGetHistoricalMonthlyQuotesRangeAdjustedResponse() {
        return new GetHistoricalMonthlyQuotesRangeAdjustedResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalQuotesRangeAdjusted }
     * 
     */
    public GetHistoricalQuotesRangeAdjusted createGetHistoricalQuotesRangeAdjusted() {
        return new GetHistoricalQuotesRangeAdjusted();
    }

    /**
     * Create an instance of {@link GetAdvancesAndDeclinesResponse }
     * 
     */
    public GetAdvancesAndDeclinesResponse createGetAdvancesAndDeclinesResponse() {
        return new GetAdvancesAndDeclinesResponse();
    }

    /**
     * Create an instance of {@link AdvancesAndDeclines }
     * 
     */
    public AdvancesAndDeclines createAdvancesAndDeclines() {
        return new AdvancesAndDeclines();
    }

    /**
     * Create an instance of {@link GetHistoricalQuarterlyQuotesRangeAdjusted }
     * 
     */
    public GetHistoricalQuarterlyQuotesRangeAdjusted createGetHistoricalQuarterlyQuotesRangeAdjusted() {
        return new GetHistoricalQuarterlyQuotesRangeAdjusted();
    }

    /**
     * Create an instance of {@link GetHistoricalQuarterlyQuotesRangeResponse }
     * 
     */
    public GetHistoricalQuarterlyQuotesRangeResponse createGetHistoricalQuarterlyQuotesRangeResponse() {
        return new GetHistoricalQuarterlyQuotesRangeResponse();
    }

    /**
     * Create an instance of {@link GetAdvancesAndDeclines }
     * 
     */
    public GetAdvancesAndDeclines createGetAdvancesAndDeclines() {
        return new GetAdvancesAndDeclines();
    }

    /**
     * Create an instance of {@link GetTopMoversByMarketCapitalization }
     * 
     */
    public GetTopMoversByMarketCapitalization createGetTopMoversByMarketCapitalization() {
        return new GetTopMoversByMarketCapitalization();
    }

    /**
     * Create an instance of {@link GetLastClosingPrices }
     * 
     */
    public GetLastClosingPrices createGetLastClosingPrices() {
        return new GetLastClosingPrices();
    }

    /**
     * Create an instance of {@link GetExtendedDividendHistoryResponse }
     * 
     */
    public GetExtendedDividendHistoryResponse createGetExtendedDividendHistoryResponse() {
        return new GetExtendedDividendHistoryResponse();
    }

    /**
     * Create an instance of {@link DividendHistory }
     * 
     */
    public DividendHistory createDividendHistory() {
        return new DividendHistory();
    }

    /**
     * Create an instance of {@link GetHistoricalWeeklyQuotesRange }
     * 
     */
    public GetHistoricalWeeklyQuotesRange createGetHistoricalWeeklyQuotesRange() {
        return new GetHistoricalWeeklyQuotesRange();
    }

    /**
     * Create an instance of {@link GetDividendHistoryResponse }
     * 
     */
    public GetDividendHistoryResponse createGetDividendHistoryResponse() {
        return new GetDividendHistoryResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalHighLow }
     * 
     */
    public GetHistoricalHighLow createGetHistoricalHighLow() {
        return new GetHistoricalHighLow();
    }

    /**
     * Create an instance of {@link GetSplitHistoryResponse }
     * 
     */
    public GetSplitHistoryResponse createGetSplitHistoryResponse() {
        return new GetSplitHistoryResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalQuotesAsOfAdjustedResponse }
     * 
     */
    public GetHistoricalQuotesAsOfAdjustedResponse createGetHistoricalQuotesAsOfAdjustedResponse() {
        return new GetHistoricalQuotesAsOfAdjustedResponse();
    }

    /**
     * Create an instance of {@link GetLastClosingPriceAdjustedResponse }
     * 
     */
    public GetLastClosingPriceAdjustedResponse createGetLastClosingPriceAdjustedResponse() {
        return new GetLastClosingPriceAdjustedResponse();
    }

    /**
     * Create an instance of {@link HistoricalQuote }
     * 
     */
    public HistoricalQuote createHistoricalQuote() {
        return new HistoricalQuote();
    }

    /**
     * Create an instance of {@link GetSplitRatioResponse }
     * 
     */
    public GetSplitRatioResponse createGetSplitRatioResponse() {
        return new GetSplitRatioResponse();
    }

    /**
     * Create an instance of {@link SplitRatio }
     * 
     */
    public SplitRatio createSplitRatio() {
        return new SplitRatio();
    }

    /**
     * Create an instance of {@link GetDividendHistoryRangeResponse }
     * 
     */
    public GetDividendHistoryRangeResponse createGetDividendHistoryRangeResponse() {
        return new GetDividendHistoryRangeResponse();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetHistoricalQuoteResponse }
     * 
     */
    public GetHistoricalQuoteResponse createGetHistoricalQuoteResponse() {
        return new GetHistoricalQuoteResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalQuotesResponse }
     * 
     */
    public GetHistoricalQuotesResponse createGetHistoricalQuotesResponse() {
        return new GetHistoricalQuotesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHistoricalQuote }
     * 
     */
    public ArrayOfHistoricalQuote createArrayOfHistoricalQuote() {
        return new ArrayOfHistoricalQuote();
    }

    /**
     * Create an instance of {@link GetTopMoversByMarketCapitalizationResponse }
     * 
     */
    public GetTopMoversByMarketCapitalizationResponse createGetTopMoversByMarketCapitalizationResponse() {
        return new GetTopMoversByMarketCapitalizationResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTopByCapitalization }
     * 
     */
    public ArrayOfTopByCapitalization createArrayOfTopByCapitalization() {
        return new ArrayOfTopByCapitalization();
    }

    /**
     * Create an instance of {@link GetSplitRatio }
     * 
     */
    public GetSplitRatio createGetSplitRatio() {
        return new GetSplitRatio();
    }

    /**
     * Create an instance of {@link GetHistoricalHighLowResponse }
     * 
     */
    public GetHistoricalHighLowResponse createGetHistoricalHighLowResponse() {
        return new GetHistoricalHighLowResponse();
    }

    /**
     * Create an instance of {@link HistoricalHighLow }
     * 
     */
    public HistoricalHighLow createHistoricalHighLow() {
        return new HistoricalHighLow();
    }

    /**
     * Create an instance of {@link GetAllSplits }
     * 
     */
    public GetAllSplits createGetAllSplits() {
        return new GetAllSplits();
    }

    /**
     * Create an instance of {@link GetHistoricalWeeklyQuotesRangeAdjustedResponse }
     * 
     */
    public GetHistoricalWeeklyQuotesRangeAdjustedResponse createGetHistoricalWeeklyQuotesRangeAdjustedResponse() {
        return new GetHistoricalWeeklyQuotesRangeAdjustedResponse();
    }

    /**
     * Create an instance of {@link GetLastClosingPricesOrderedAdjusted }
     * 
     */
    public GetLastClosingPricesOrderedAdjusted createGetLastClosingPricesOrderedAdjusted() {
        return new GetLastClosingPricesOrderedAdjusted();
    }

    /**
     * Create an instance of {@link GetDividendHistoryRange }
     * 
     */
    public GetDividendHistoryRange createGetDividendHistoryRange() {
        return new GetDividendHistoryRange();
    }

    /**
     * Create an instance of {@link GetHistoricalQuotesRangeAdjustedResponse }
     * 
     */
    public GetHistoricalQuotesRangeAdjustedResponse createGetHistoricalQuotesRangeAdjustedResponse() {
        return new GetHistoricalQuotesRangeAdjustedResponse();
    }

    /**
     * Create an instance of {@link GetTopGainersByMarketCapitalizationResponse }
     * 
     */
    public GetTopGainersByMarketCapitalizationResponse createGetTopGainersByMarketCapitalizationResponse() {
        return new GetTopGainersByMarketCapitalizationResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalMonthlyQuotesRangeAdjusted }
     * 
     */
    public GetHistoricalMonthlyQuotesRangeAdjusted createGetHistoricalMonthlyQuotesRangeAdjusted() {
        return new GetHistoricalMonthlyQuotesRangeAdjusted();
    }

    /**
     * Create an instance of {@link GetAllSplitsResponse }
     * 
     */
    public GetAllSplitsResponse createGetAllSplitsResponse() {
        return new GetAllSplitsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSplitHistory }
     * 
     */
    public ArrayOfSplitHistory createArrayOfSplitHistory() {
        return new ArrayOfSplitHistory();
    }

    /**
     * Create an instance of {@link GetHistoricalQuoteAdjustedResponse }
     * 
     */
    public GetHistoricalQuoteAdjustedResponse createGetHistoricalQuoteAdjustedResponse() {
        return new GetHistoricalQuoteAdjustedResponse();
    }

    /**
     * Create an instance of {@link GetAllExtendedDividends }
     * 
     */
    public GetAllExtendedDividends createGetAllExtendedDividends() {
        return new GetAllExtendedDividends();
    }

    /**
     * Create an instance of {@link GetHistoricalQuote }
     * 
     */
    public GetHistoricalQuote createGetHistoricalQuote() {
        return new GetHistoricalQuote();
    }

    /**
     * Create an instance of {@link GetHistoricalQuoteAdjusted }
     * 
     */
    public GetHistoricalQuoteAdjusted createGetHistoricalQuoteAdjusted() {
        return new GetHistoricalQuoteAdjusted();
    }

    /**
     * Create an instance of {@link GetHistoricalQuotesAsOfResponse }
     * 
     */
    public GetHistoricalQuotesAsOfResponse createGetHistoricalQuotesAsOfResponse() {
        return new GetHistoricalQuotesAsOfResponse();
    }

    /**
     * Create an instance of {@link GetSymbols }
     * 
     */
    public GetSymbols createGetSymbols() {
        return new GetSymbols();
    }

    /**
     * Create an instance of {@link GetHistoricalWeeklyQuotesRangeResponse }
     * 
     */
    public GetHistoricalWeeklyQuotesRangeResponse createGetHistoricalWeeklyQuotesRangeResponse() {
        return new GetHistoricalWeeklyQuotesRangeResponse();
    }

    /**
     * Create an instance of {@link GetTopLosersResponse }
     * 
     */
    public GetTopLosersResponse createGetTopLosersResponse() {
        return new GetTopLosersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTop }
     * 
     */
    public ArrayOfTop createArrayOfTop() {
        return new ArrayOfTop();
    }

    /**
     * Create an instance of {@link GetHistoricalStatisticsResponse }
     * 
     */
    public GetHistoricalStatisticsResponse createGetHistoricalStatisticsResponse() {
        return new GetHistoricalStatisticsResponse();
    }

    /**
     * Create an instance of {@link HistoricalStatistics }
     * 
     */
    public HistoricalStatistics createHistoricalStatistics() {
        return new HistoricalStatistics();
    }

    /**
     * Create an instance of {@link GetHistoricalQuarterlyQuotesRangeAdjustedResponse }
     * 
     */
    public GetHistoricalQuarterlyQuotesRangeAdjustedResponse createGetHistoricalQuarterlyQuotesRangeAdjustedResponse() {
        return new GetHistoricalQuarterlyQuotesRangeAdjustedResponse();
    }

    /**
     * Create an instance of {@link GetTopLosersByMarketCapitalization }
     * 
     */
    public GetTopLosersByMarketCapitalization createGetTopLosersByMarketCapitalization() {
        return new GetTopLosersByMarketCapitalization();
    }

    /**
     * Create an instance of {@link GetLastClosingPricesAdjusted }
     * 
     */
    public GetLastClosingPricesAdjusted createGetLastClosingPricesAdjusted() {
        return new GetLastClosingPricesAdjusted();
    }

    /**
     * Create an instance of {@link GetTopMoversResponse }
     * 
     */
    public GetTopMoversResponse createGetTopMoversResponse() {
        return new GetTopMoversResponse();
    }

    /**
     * Create an instance of {@link GetLastClosingPricesOrdered }
     * 
     */
    public GetLastClosingPricesOrdered createGetLastClosingPricesOrdered() {
        return new GetLastClosingPricesOrdered();
    }

    /**
     * Create an instance of {@link GetHistoricalMonthlyQuotesRangeResponse }
     * 
     */
    public GetHistoricalMonthlyQuotesRangeResponse createGetHistoricalMonthlyQuotesRangeResponse() {
        return new GetHistoricalMonthlyQuotesRangeResponse();
    }

    /**
     * Create an instance of {@link CompleteDividendHistory }
     * 
     */
    public CompleteDividendHistory createCompleteDividendHistory() {
        return new CompleteDividendHistory();
    }

    /**
     * Create an instance of {@link GetLastClosingPricesOrderedAdjustedResponse }
     * 
     */
    public GetLastClosingPricesOrderedAdjustedResponse createGetLastClosingPricesOrderedAdjustedResponse() {
        return new GetLastClosingPricesOrderedAdjustedResponse();
    }

    /**
     * Create an instance of {@link GetAllDividendsResponse }
     * 
     */
    public GetAllDividendsResponse createGetAllDividendsResponse() {
        return new GetAllDividendsResponse();
    }

    /**
     * Create an instance of {@link GetSplitHistory }
     * 
     */
    public GetSplitHistory createGetSplitHistory() {
        return new GetSplitHistory();
    }

    /**
     * Create an instance of {@link GetLastClosingPricesOrderedResponse }
     * 
     */
    public GetLastClosingPricesOrderedResponse createGetLastClosingPricesOrderedResponse() {
        return new GetLastClosingPricesOrderedResponse();
    }

    /**
     * Create an instance of {@link GetExtendedDividendHistoryRangeResponse }
     * 
     */
    public GetExtendedDividendHistoryRangeResponse createGetExtendedDividendHistoryRangeResponse() {
        return new GetExtendedDividendHistoryRangeResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalQuotes }
     * 
     */
    public GetHistoricalQuotes createGetHistoricalQuotes() {
        return new GetHistoricalQuotes();
    }

    /**
     * Create an instance of {@link GetTopMoversByExchangeResponse }
     * 
     */
    public GetTopMoversByExchangeResponse createGetTopMoversByExchangeResponse() {
        return new GetTopMoversByExchangeResponse();
    }

    /**
     * Create an instance of {@link GetTopMoversByExchange }
     * 
     */
    public GetTopMoversByExchange createGetTopMoversByExchange() {
        return new GetTopMoversByExchange();
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
     * Create an instance of {@link GetHistoricalQuotesAsOfAdjusted }
     * 
     */
    public GetHistoricalQuotesAsOfAdjusted createGetHistoricalQuotesAsOfAdjusted() {
        return new GetHistoricalQuotesAsOfAdjusted();
    }

    /**
     * Create an instance of {@link GetHistoricalStatistics }
     * 
     */
    public GetHistoricalStatistics createGetHistoricalStatistics() {
        return new GetHistoricalStatistics();
    }

    /**
     * Create an instance of {@link GetHistoricalWeeklyQuotesRangeAdjusted }
     * 
     */
    public GetHistoricalWeeklyQuotesRangeAdjusted createGetHistoricalWeeklyQuotesRangeAdjusted() {
        return new GetHistoricalWeeklyQuotesRangeAdjusted();
    }

    /**
     * Create an instance of {@link GetDividendHistory }
     * 
     */
    public GetDividendHistory createGetDividendHistory() {
        return new GetDividendHistory();
    }

    /**
     * Create an instance of {@link GetLastClosingPriceResponse }
     * 
     */
    public GetLastClosingPriceResponse createGetLastClosingPriceResponse() {
        return new GetLastClosingPriceResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalQuotesRange }
     * 
     */
    public GetHistoricalQuotesRange createGetHistoricalQuotesRange() {
        return new GetHistoricalQuotesRange();
    }

    /**
     * Create an instance of {@link GetCompleteDividendHistoryRange }
     * 
     */
    public GetCompleteDividendHistoryRange createGetCompleteDividendHistoryRange() {
        return new GetCompleteDividendHistoryRange();
    }

    /**
     * Create an instance of {@link GetTopMovers }
     * 
     */
    public GetTopMovers createGetTopMovers() {
        return new GetTopMovers();
    }

    /**
     * Create an instance of {@link GetHistoricalMonthlyQuotesRange }
     * 
     */
    public GetHistoricalMonthlyQuotesRange createGetHistoricalMonthlyQuotesRange() {
        return new GetHistoricalMonthlyQuotesRange();
    }

    /**
     * Create an instance of {@link GetAllDividends }
     * 
     */
    public GetAllDividends createGetAllDividends() {
        return new GetAllDividends();
    }

    /**
     * Create an instance of {@link GetHistoricalQuotesAdjustedResponse }
     * 
     */
    public GetHistoricalQuotesAdjustedResponse createGetHistoricalQuotesAdjustedResponse() {
        return new GetHistoricalQuotesAdjustedResponse();
    }

    /**
     * Create an instance of {@link GetLastClosingPrice }
     * 
     */
    public GetLastClosingPrice createGetLastClosingPrice() {
        return new GetLastClosingPrice();
    }

    /**
     * Create an instance of {@link GetAllExtendedDividendsResponse }
     * 
     */
    public GetAllExtendedDividendsResponse createGetAllExtendedDividendsResponse() {
        return new GetAllExtendedDividendsResponse();
    }

    /**
     * Create an instance of {@link GetLastClosingPricesAdjustedResponse }
     * 
     */
    public GetLastClosingPricesAdjustedResponse createGetLastClosingPricesAdjustedResponse() {
        return new GetLastClosingPricesAdjustedResponse();
    }

    /**
     * Create an instance of {@link GetTopLosersByMarketCapitalizationResponse }
     * 
     */
    public GetTopLosersByMarketCapitalizationResponse createGetTopLosersByMarketCapitalizationResponse() {
        return new GetTopLosersByMarketCapitalizationResponse();
    }

    /**
     * Create an instance of {@link SymbolList }
     * 
     */
    public SymbolList createSymbolList() {
        return new SymbolList();
    }

    /**
     * Create an instance of {@link GetLastClosingPricesResponse }
     * 
     */
    public GetLastClosingPricesResponse createGetLastClosingPricesResponse() {
        return new GetLastClosingPricesResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalQuotesAsOf }
     * 
     */
    public GetHistoricalQuotesAsOf createGetHistoricalQuotesAsOf() {
        return new GetHistoricalQuotesAsOf();
    }

    /**
     * Create an instance of {@link GetCompleteDividendHistoryRangeResponse }
     * 
     */
    public GetCompleteDividendHistoryRangeResponse createGetCompleteDividendHistoryRangeResponse() {
        return new GetCompleteDividendHistoryRangeResponse();
    }

    /**
     * Create an instance of {@link GetLastClosingPriceAdjusted }
     * 
     */
    public GetLastClosingPriceAdjusted createGetLastClosingPriceAdjusted() {
        return new GetLastClosingPriceAdjusted();
    }

    /**
     * Create an instance of {@link GetSymbolsResponse }
     * 
     */
    public GetSymbolsResponse createGetSymbolsResponse() {
        return new GetSymbolsResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalQuarterlyQuotesRange }
     * 
     */
    public GetHistoricalQuarterlyQuotesRange createGetHistoricalQuarterlyQuotesRange() {
        return new GetHistoricalQuarterlyQuotesRange();
    }

    /**
     * Create an instance of {@link GetExtendedDividendHistoryRange }
     * 
     */
    public GetExtendedDividendHistoryRange createGetExtendedDividendHistoryRange() {
        return new GetExtendedDividendHistoryRange();
    }

    /**
     * Create an instance of {@link GetTopGainersByMarketCapitalization }
     * 
     */
    public GetTopGainersByMarketCapitalization createGetTopGainersByMarketCapitalization() {
        return new GetTopGainersByMarketCapitalization();
    }

    /**
     * Create an instance of {@link GetTopGainers }
     * 
     */
    public GetTopGainers createGetTopGainers() {
        return new GetTopGainers();
    }

    /**
     * Create an instance of {@link ArrayOfExtendedDividend }
     * 
     */
    public ArrayOfExtendedDividend createArrayOfExtendedDividend() {
        return new ArrayOfExtendedDividend();
    }

    /**
     * Create an instance of {@link ArrayOfDividend }
     * 
     */
    public ArrayOfDividend createArrayOfDividend() {
        return new ArrayOfDividend();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link ArrayOfMarketChange }
     * 
     */
    public ArrayOfMarketChange createArrayOfMarketChange() {
        return new ArrayOfMarketChange();
    }

    /**
     * Create an instance of {@link Dividend }
     * 
     */
    public Dividend createDividend() {
        return new Dividend();
    }

    /**
     * Create an instance of {@link ExtendedDividend }
     * 
     */
    public ExtendedDividend createExtendedDividend() {
        return new ExtendedDividend();
    }

    /**
     * Create an instance of {@link MarketChange }
     * 
     */
    public MarketChange createMarketChange() {
        return new MarketChange();
    }

    /**
     * Create an instance of {@link TopByCapitalization }
     * 
     */
    public TopByCapitalization createTopByCapitalization() {
        return new TopByCapitalization();
    }

    /**
     * Create an instance of {@link ArrayOfSplit }
     * 
     */
    public ArrayOfSplit createArrayOfSplit() {
        return new ArrayOfSplit();
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
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link Split }
     * 
     */
    public Split createSplit() {
        return new Split();
    }

    /**
     * Create an instance of {@link ArrayOfCompleteDividend }
     * 
     */
    public ArrayOfCompleteDividend createArrayOfCompleteDividend() {
        return new ArrayOfCompleteDividend();
    }

    /**
     * Create an instance of {@link CompleteDividend }
     * 
     */
    public CompleteDividend createCompleteDividend() {
        return new CompleteDividend();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedDividendHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ExtendedDividendHistory")
    public JAXBElement<ExtendedDividendHistory> createExtendedDividendHistory(ExtendedDividendHistory value) {
        return new JAXBElement<ExtendedDividendHistory>(_ExtendedDividendHistory_QNAME, ExtendedDividendHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividendHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "DividendHistory")
    public JAXBElement<DividendHistory> createDividendHistory(DividendHistory value) {
        return new JAXBElement<DividendHistory>(_DividendHistory_QNAME, DividendHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SplitRatio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "SplitRatio")
    public JAXBElement<SplitRatio> createSplitRatio(SplitRatio value) {
        return new JAXBElement<SplitRatio>(_SplitRatio_QNAME, SplitRatio.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SplitHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "SplitHistory")
    public JAXBElement<SplitHistory> createSplitHistory(SplitHistory value) {
        return new JAXBElement<SplitHistory>(_SplitHistory_QNAME, SplitHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdvancesAndDeclines }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "AdvancesAndDeclines")
    public JAXBElement<AdvancesAndDeclines> createAdvancesAndDeclines(AdvancesAndDeclines value) {
        return new JAXBElement<AdvancesAndDeclines>(_AdvancesAndDeclines_QNAME, AdvancesAndDeclines.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteDividendHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CompleteDividendHistory")
    public JAXBElement<CompleteDividendHistory> createCompleteDividendHistory(CompleteDividendHistory value) {
        return new JAXBElement<CompleteDividendHistory>(_CompleteDividendHistory_QNAME, CompleteDividendHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTopByCapitalization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfTopByCapitalization")
    public JAXBElement<ArrayOfTopByCapitalization> createArrayOfTopByCapitalization(ArrayOfTopByCapitalization value) {
        return new JAXBElement<ArrayOfTopByCapitalization>(_ArrayOfTopByCapitalization_QNAME, ArrayOfTopByCapitalization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricalQuotes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HistoricalQuotes")
    public JAXBElement<HistoricalQuotes> createHistoricalQuotes(HistoricalQuotes value) {
        return new JAXBElement<HistoricalQuotes>(_HistoricalQuotes_QNAME, HistoricalQuotes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricalHighLow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HistoricalHighLow")
    public JAXBElement<HistoricalHighLow> createHistoricalHighLow(HistoricalHighLow value) {
        return new JAXBElement<HistoricalHighLow>(_HistoricalHighLow_QNAME, HistoricalHighLow.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricalStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HistoricalStatistics")
    public JAXBElement<HistoricalStatistics> createHistoricalStatistics(HistoricalStatistics value) {
        return new JAXBElement<HistoricalStatistics>(_HistoricalStatistics_QNAME, HistoricalStatistics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistoricalQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfHistoricalQuote")
    public JAXBElement<ArrayOfHistoricalQuote> createArrayOfHistoricalQuote(ArrayOfHistoricalQuote value) {
        return new JAXBElement<ArrayOfHistoricalQuote>(_ArrayOfHistoricalQuote_QNAME, ArrayOfHistoricalQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricalQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HistoricalQuote")
    public JAXBElement<HistoricalQuote> createHistoricalQuote(HistoricalQuote value) {
        return new JAXBElement<HistoricalQuote>(_HistoricalQuote_QNAME, HistoricalQuote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SymbolList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "SymbolList")
    public JAXBElement<SymbolList> createSymbolList(SymbolList value) {
        return new JAXBElement<SymbolList>(_SymbolList_QNAME, SymbolList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSplitHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfSplitHistory")
    public JAXBElement<ArrayOfSplitHistory> createArrayOfSplitHistory(ArrayOfSplitHistory value) {
        return new JAXBElement<ArrayOfSplitHistory>(_ArrayOfSplitHistory_QNAME, ArrayOfSplitHistory.class, null, value);
    }

}
