
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

    private final static QName _Symbol_QNAME = new QName("http://www.xignite.com/services/", "Symbol");
    private final static QName _ArrayOfSecurity_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfSecurity");
    private final static QName _ArrayOfLookupItem_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfLookupItem");
    private final static QName _ExtendedDividendHistory_QNAME = new QName("http://www.xignite.com/services/", "ExtendedDividendHistory");
    private final static QName _DividendHistory_QNAME = new QName("http://www.xignite.com/services/", "DividendHistory");
    private final static QName _ArrayOfDividendHistory_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfDividendHistory");
    private final static QName _SplitHistory_QNAME = new QName("http://www.xignite.com/services/", "SplitHistory");
    private final static QName _Cusip_QNAME = new QName("http://www.xignite.com/services/", "Cusip");
    private final static QName _Security_QNAME = new QName("http://www.xignite.com/services/", "Security");
    private final static QName _ArrayOfRecord_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfRecord");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _BondLookup_QNAME = new QName("http://www.xignite.com/services/", "BondLookup");
    private final static QName _StockSplit_QNAME = new QName("http://www.xignite.com/services/", "StockSplit");
    private final static QName _StockGrowthVariations_QNAME = new QName("http://www.xignite.com/services/", "StockGrowthVariations");
    private final static QName _Record_QNAME = new QName("http://www.xignite.com/services/", "Record");
    private final static QName _HistoricalMarketCapitalization_QNAME = new QName("http://www.xignite.com/services/", "HistoricalMarketCapitalization");

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
     * Create an instance of {@link LookupStockResponse }
     * 
     */
    public LookupStockResponse createLookupStockResponse() {
        return new LookupStockResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLookupItem }
     * 
     */
    public ArrayOfLookupItem createArrayOfLookupItem() {
        return new ArrayOfLookupItem();
    }

    /**
     * Create an instance of {@link MapSecurityResponse }
     * 
     */
    public MapSecurityResponse createMapSecurityResponse() {
        return new MapSecurityResponse();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link GetHistoricalMarketCapitalizationCustom }
     * 
     */
    public GetHistoricalMarketCapitalizationCustom createGetHistoricalMarketCapitalizationCustom() {
        return new GetHistoricalMarketCapitalizationCustom();
    }

    /**
     * Create an instance of {@link LookupByExchange }
     * 
     */
    public LookupByExchange createLookupByExchange() {
        return new LookupByExchange();
    }

    /**
     * Create an instance of {@link MapSecurityDetails }
     * 
     */
    public MapSecurityDetails createMapSecurityDetails() {
        return new MapSecurityDetails();
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
     * Create an instance of {@link MapSecurityDetail }
     * 
     */
    public MapSecurityDetail createMapSecurityDetail() {
        return new MapSecurityDetail();
    }

    /**
     * Create an instance of {@link LookupByExchangeResponse }
     * 
     */
    public LookupByExchangeResponse createLookupByExchangeResponse() {
        return new LookupByExchangeResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalMarketCapitalizationCustomResponse }
     * 
     */
    public GetHistoricalMarketCapitalizationCustomResponse createGetHistoricalMarketCapitalizationCustomResponse() {
        return new GetHistoricalMarketCapitalizationCustomResponse();
    }

    /**
     * Create an instance of {@link HistoricalMarketCapitalization }
     * 
     */
    public HistoricalMarketCapitalization createHistoricalMarketCapitalization() {
        return new HistoricalMarketCapitalization();
    }

    /**
     * Create an instance of {@link GetHistoricalMarketCapitalizationResponse }
     * 
     */
    public GetHistoricalMarketCapitalizationResponse createGetHistoricalMarketCapitalizationResponse() {
        return new GetHistoricalMarketCapitalizationResponse();
    }

    /**
     * Create an instance of {@link MapSecurityDetailsResponse }
     * 
     */
    public MapSecurityDetailsResponse createMapSecurityDetailsResponse() {
        return new MapSecurityDetailsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRecord }
     * 
     */
    public ArrayOfRecord createArrayOfRecord() {
        return new ArrayOfRecord();
    }

    /**
     * Create an instance of {@link Lookup }
     * 
     */
    public Lookup createLookup() {
        return new Lookup();
    }

    /**
     * Create an instance of {@link ListSecurities }
     * 
     */
    public ListSecurities createListSecurities() {
        return new ListSecurities();
    }

    /**
     * Create an instance of {@link GetLargestCapDeclines }
     * 
     */
    public GetLargestCapDeclines createGetLargestCapDeclines() {
        return new GetLargestCapDeclines();
    }

    /**
     * Create an instance of {@link GetSplitHistory }
     * 
     */
    public GetSplitHistory createGetSplitHistory() {
        return new GetSplitHistory();
    }

    /**
     * Create an instance of {@link StockSplit }
     * 
     */
    public StockSplit createStockSplit() {
        return new StockSplit();
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
     * Create an instance of {@link GetDividendHistoryResponse }
     * 
     */
    public GetDividendHistoryResponse createGetDividendHistoryResponse() {
        return new GetDividendHistoryResponse();
    }

    /**
     * Create an instance of {@link GetLargestDeclines }
     * 
     */
    public GetLargestDeclines createGetLargestDeclines() {
        return new GetLargestDeclines();
    }

    /**
     * Create an instance of {@link GetSplitHistoryResponse }
     * 
     */
    public GetSplitHistoryResponse createGetSplitHistoryResponse() {
        return new GetSplitHistoryResponse();
    }

    /**
     * Create an instance of {@link GetDividendHistories }
     * 
     */
    public GetDividendHistories createGetDividendHistories() {
        return new GetDividendHistories();
    }

    /**
     * Create an instance of {@link GetSplitRatioResponse }
     * 
     */
    public GetSplitRatioResponse createGetSplitRatioResponse() {
        return new GetSplitRatioResponse();
    }

    /**
     * Create an instance of {@link LookupResponse }
     * 
     */
    public LookupResponse createLookupResponse() {
        return new LookupResponse();
    }

    /**
     * Create an instance of {@link GetLargestDeclinesResponse }
     * 
     */
    public GetLargestDeclinesResponse createGetLargestDeclinesResponse() {
        return new GetLargestDeclinesResponse();
    }

    /**
     * Create an instance of {@link StockGrowthVariations }
     * 
     */
    public StockGrowthVariations createStockGrowthVariations() {
        return new StockGrowthVariations();
    }

    /**
     * Create an instance of {@link GetMarketCapitalizationResponse }
     * 
     */
    public GetMarketCapitalizationResponse createGetMarketCapitalizationResponse() {
        return new GetMarketCapitalizationResponse();
    }

    /**
     * Create an instance of {@link LookupBondResponse }
     * 
     */
    public LookupBondResponse createLookupBondResponse() {
        return new LookupBondResponse();
    }

    /**
     * Create an instance of {@link BondLookup }
     * 
     */
    public BondLookup createBondLookup() {
        return new BondLookup();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetHistoricalMonthlyMarketCapitalization }
     * 
     */
    public GetHistoricalMonthlyMarketCapitalization createGetHistoricalMonthlyMarketCapitalization() {
        return new GetHistoricalMonthlyMarketCapitalization();
    }

    /**
     * Create an instance of {@link GetDividendHistory }
     * 
     */
    public GetDividendHistory createGetDividendHistory() {
        return new GetDividendHistory();
    }

    /**
     * Create an instance of {@link LookupFund }
     * 
     */
    public LookupFund createLookupFund() {
        return new LookupFund();
    }

    /**
     * Create an instance of {@link GetSplitRatio }
     * 
     */
    public GetSplitRatio createGetSplitRatio() {
        return new GetSplitRatio();
    }

    /**
     * Create an instance of {@link GetCUSIPFundResponse }
     * 
     */
    public GetCUSIPFundResponse createGetCUSIPFundResponse() {
        return new GetCUSIPFundResponse();
    }

    /**
     * Create an instance of {@link Cusip }
     * 
     */
    public Cusip createCusip() {
        return new Cusip();
    }

    /**
     * Create an instance of {@link LookupBond }
     * 
     */
    public LookupBond createLookupBond() {
        return new LookupBond();
    }

    /**
     * Create an instance of {@link LookupStock }
     * 
     */
    public LookupStock createLookupStock() {
        return new LookupStock();
    }

    /**
     * Create an instance of {@link GetMarketCapitalization }
     * 
     */
    public GetMarketCapitalization createGetMarketCapitalization() {
        return new GetMarketCapitalization();
    }

    /**
     * Create an instance of {@link ArrayOfDividendHistory }
     * 
     */
    public ArrayOfDividendHistory createArrayOfDividendHistory() {
        return new ArrayOfDividendHistory();
    }

    /**
     * Create an instance of {@link GetCUSIPFund }
     * 
     */
    public GetCUSIPFund createGetCUSIPFund() {
        return new GetCUSIPFund();
    }

    /**
     * Create an instance of {@link ArrayOfSecurity }
     * 
     */
    public ArrayOfSecurity createArrayOfSecurity() {
        return new ArrayOfSecurity();
    }

    /**
     * Create an instance of {@link Symbol }
     * 
     */
    public Symbol createSymbol() {
        return new Symbol();
    }

    /**
     * Create an instance of {@link LookupByExchanges }
     * 
     */
    public LookupByExchanges createLookupByExchanges() {
        return new LookupByExchanges();
    }

    /**
     * Create an instance of {@link GetHistoricalMarketCapitalization }
     * 
     */
    public GetHistoricalMarketCapitalization createGetHistoricalMarketCapitalization() {
        return new GetHistoricalMarketCapitalization();
    }

    /**
     * Create an instance of {@link MapSecurities }
     * 
     */
    public MapSecurities createMapSecurities() {
        return new MapSecurities();
    }

    /**
     * Create an instance of {@link MapSecurityDetailResponse }
     * 
     */
    public MapSecurityDetailResponse createMapSecurityDetailResponse() {
        return new MapSecurityDetailResponse();
    }

    /**
     * Create an instance of {@link Record }
     * 
     */
    public Record createRecord() {
        return new Record();
    }

    /**
     * Create an instance of {@link GetCUSIPStock }
     * 
     */
    public GetCUSIPStock createGetCUSIPStock() {
        return new GetCUSIPStock();
    }

    /**
     * Create an instance of {@link GetDividendHistoriesResponse }
     * 
     */
    public GetDividendHistoriesResponse createGetDividendHistoriesResponse() {
        return new GetDividendHistoriesResponse();
    }

    /**
     * Create an instance of {@link LookupByExchangesResponse }
     * 
     */
    public LookupByExchangesResponse createLookupByExchangesResponse() {
        return new LookupByExchangesResponse();
    }

    /**
     * Create an instance of {@link MapSecurity }
     * 
     */
    public MapSecurity createMapSecurity() {
        return new MapSecurity();
    }

    /**
     * Create an instance of {@link MapSymbol }
     * 
     */
    public MapSymbol createMapSymbol() {
        return new MapSymbol();
    }

    /**
     * Create an instance of {@link MapSecuritiesResponse }
     * 
     */
    public MapSecuritiesResponse createMapSecuritiesResponse() {
        return new MapSecuritiesResponse();
    }

    /**
     * Create an instance of {@link LookupFundResponse }
     * 
     */
    public LookupFundResponse createLookupFundResponse() {
        return new LookupFundResponse();
    }

    /**
     * Create an instance of {@link ListSecuritiesResponse }
     * 
     */
    public ListSecuritiesResponse createListSecuritiesResponse() {
        return new ListSecuritiesResponse();
    }

    /**
     * Create an instance of {@link GetHistoricalMonthlyMarketCapitalizationResponse }
     * 
     */
    public GetHistoricalMonthlyMarketCapitalizationResponse createGetHistoricalMonthlyMarketCapitalizationResponse() {
        return new GetHistoricalMonthlyMarketCapitalizationResponse();
    }

    /**
     * Create an instance of {@link GetCUSIPStockResponse }
     * 
     */
    public GetCUSIPStockResponse createGetCUSIPStockResponse() {
        return new GetCUSIPStockResponse();
    }

    /**
     * Create an instance of {@link MapSymbolResponse }
     * 
     */
    public MapSymbolResponse createMapSymbolResponse() {
        return new MapSymbolResponse();
    }

    /**
     * Create an instance of {@link GetLargestCapDeclinesResponse }
     * 
     */
    public GetLargestCapDeclinesResponse createGetLargestCapDeclinesResponse() {
        return new GetLargestCapDeclinesResponse();
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
     * Create an instance of {@link LookupItem }
     * 
     */
    public LookupItem createLookupItem() {
        return new LookupItem();
    }

    /**
     * Create an instance of {@link ArrayOfVariation }
     * 
     */
    public ArrayOfVariation createArrayOfVariation() {
        return new ArrayOfVariation();
    }

    /**
     * Create an instance of {@link Capitalization }
     * 
     */
    public Capitalization createCapitalization() {
        return new Capitalization();
    }

    /**
     * Create an instance of {@link ArrayOfCapitalization }
     * 
     */
    public ArrayOfCapitalization createArrayOfCapitalization() {
        return new ArrayOfCapitalization();
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
     * Create an instance of {@link Split }
     * 
     */
    public Split createSplit() {
        return new Split();
    }

    /**
     * Create an instance of {@link Variation }
     * 
     */
    public Variation createVariation() {
        return new Variation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Symbol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Symbol")
    public JAXBElement<Symbol> createSymbol(Symbol value) {
        return new JAXBElement<Symbol>(_Symbol_QNAME, Symbol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSecurity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfSecurity")
    public JAXBElement<ArrayOfSecurity> createArrayOfSecurity(ArrayOfSecurity value) {
        return new JAXBElement<ArrayOfSecurity>(_ArrayOfSecurity_QNAME, ArrayOfSecurity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLookupItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfLookupItem")
    public JAXBElement<ArrayOfLookupItem> createArrayOfLookupItem(ArrayOfLookupItem value) {
        return new JAXBElement<ArrayOfLookupItem>(_ArrayOfLookupItem_QNAME, ArrayOfLookupItem.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDividendHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfDividendHistory")
    public JAXBElement<ArrayOfDividendHistory> createArrayOfDividendHistory(ArrayOfDividendHistory value) {
        return new JAXBElement<ArrayOfDividendHistory>(_ArrayOfDividendHistory_QNAME, ArrayOfDividendHistory.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Cusip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Cusip")
    public JAXBElement<Cusip> createCusip(Cusip value) {
        return new JAXBElement<Cusip>(_Cusip_QNAME, Cusip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Security }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Security")
    public JAXBElement<Security> createSecurity(Security value) {
        return new JAXBElement<Security>(_Security_QNAME, Security.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfRecord")
    public JAXBElement<ArrayOfRecord> createArrayOfRecord(ArrayOfRecord value) {
        return new JAXBElement<ArrayOfRecord>(_ArrayOfRecord_QNAME, ArrayOfRecord.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BondLookup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "BondLookup")
    public JAXBElement<BondLookup> createBondLookup(BondLookup value) {
        return new JAXBElement<BondLookup>(_BondLookup_QNAME, BondLookup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockSplit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "StockSplit")
    public JAXBElement<StockSplit> createStockSplit(StockSplit value) {
        return new JAXBElement<StockSplit>(_StockSplit_QNAME, StockSplit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockGrowthVariations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "StockGrowthVariations")
    public JAXBElement<StockGrowthVariations> createStockGrowthVariations(StockGrowthVariations value) {
        return new JAXBElement<StockGrowthVariations>(_StockGrowthVariations_QNAME, StockGrowthVariations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Record }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Record")
    public JAXBElement<Record> createRecord(Record value) {
        return new JAXBElement<Record>(_Record_QNAME, Record.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoricalMarketCapitalization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "HistoricalMarketCapitalization")
    public JAXBElement<HistoricalMarketCapitalization> createHistoricalMarketCapitalization(HistoricalMarketCapitalization value) {
        return new JAXBElement<HistoricalMarketCapitalization>(_HistoricalMarketCapitalization_QNAME, HistoricalMarketCapitalization.class, null, value);
    }

}
