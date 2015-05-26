
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

    private final static QName _MasterDeletions_QNAME = new QName("http://www.xignite.com/services/", "MasterDeletions");
    private final static QName _MasterChanges_QNAME = new QName("http://www.xignite.com/services/", "MasterChanges");
    private final static QName _MasterAdditions_QNAME = new QName("http://www.xignite.com/services/", "MasterAdditions");
    private final static QName _ArrayOfExchange_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfExchange");
    private final static QName _ArrayOfSector_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfSector");
    private final static QName _CUSIPList_QNAME = new QName("http://www.xignite.com/services/", "CUSIPList");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _Master_QNAME = new QName("http://www.xignite.com/services/", "Master");
    private final static QName _ExchangeStatistics_QNAME = new QName("http://www.xignite.com/services/", "ExchangeStatistics");
    private final static QName _SymbolList_QNAME = new QName("http://www.xignite.com/services/", "SymbolList");
    private final static QName _CIKList_QNAME = new QName("http://www.xignite.com/services/", "CIKList");
    private final static QName _ArrayOfSplitHistory_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfSplitHistory");
    private final static QName _ArrayOfIndustry_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfIndustry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllSplits }
     * 
     */
    public GetAllSplits createGetAllSplits() {
        return new GetAllSplits();
    }

    /**
     * Create an instance of {@link ListExchanges }
     * 
     */
    public ListExchanges createListExchanges() {
        return new ListExchanges();
    }

    /**
     * Create an instance of {@link GetMasterByIndustry }
     * 
     */
    public GetMasterByIndustry createGetMasterByIndustry() {
        return new GetMasterByIndustry();
    }

    /**
     * Create an instance of {@link MasterAdditions }
     * 
     */
    public MasterAdditions createMasterAdditions() {
        return new MasterAdditions();
    }

    /**
     * Create an instance of {@link GetMasterByExchange }
     * 
     */
    public GetMasterByExchange createGetMasterByExchange() {
        return new GetMasterByExchange();
    }

    /**
     * Create an instance of {@link GetExchangeStatisticsResponse }
     * 
     */
    public GetExchangeStatisticsResponse createGetExchangeStatisticsResponse() {
        return new GetExchangeStatisticsResponse();
    }

    /**
     * Create an instance of {@link ExchangeStatistics }
     * 
     */
    public ExchangeStatistics createExchangeStatistics() {
        return new ExchangeStatistics();
    }

    /**
     * Create an instance of {@link ListSymbolsByExchange }
     * 
     */
    public ListSymbolsByExchange createListSymbolsByExchange() {
        return new ListSymbolsByExchange();
    }

    /**
     * Create an instance of {@link ArrayOfSector }
     * 
     */
    public ArrayOfSector createArrayOfSector() {
        return new ArrayOfSector();
    }

    /**
     * Create an instance of {@link GetExchangeStatistics }
     * 
     */
    public GetExchangeStatistics createGetExchangeStatistics() {
        return new GetExchangeStatistics();
    }

    /**
     * Create an instance of {@link ListCUSIPsByExchangeResponse }
     * 
     */
    public ListCUSIPsByExchangeResponse createListCUSIPsByExchangeResponse() {
        return new ListCUSIPsByExchangeResponse();
    }

    /**
     * Create an instance of {@link CUSIPList }
     * 
     */
    public CUSIPList createCUSIPList() {
        return new CUSIPList();
    }

    /**
     * Create an instance of {@link ListCIKsByExchangeResponse }
     * 
     */
    public ListCIKsByExchangeResponse createListCIKsByExchangeResponse() {
        return new ListCIKsByExchangeResponse();
    }

    /**
     * Create an instance of {@link CIKList }
     * 
     */
    public CIKList createCIKList() {
        return new CIKList();
    }

    /**
     * Create an instance of {@link GetMasterChangesResponse }
     * 
     */
    public GetMasterChangesResponse createGetMasterChangesResponse() {
        return new GetMasterChangesResponse();
    }

    /**
     * Create an instance of {@link MasterChanges }
     * 
     */
    public MasterChanges createMasterChanges() {
        return new MasterChanges();
    }

    /**
     * Create an instance of {@link ListCUSIPsByExchange }
     * 
     */
    public ListCUSIPsByExchange createListCUSIPsByExchange() {
        return new ListCUSIPsByExchange();
    }

    /**
     * Create an instance of {@link ListIndustriesResponse }
     * 
     */
    public ListIndustriesResponse createListIndustriesResponse() {
        return new ListIndustriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIndustry }
     * 
     */
    public ArrayOfIndustry createArrayOfIndustry() {
        return new ArrayOfIndustry();
    }

    /**
     * Create an instance of {@link ArrayOfSplitHistory }
     * 
     */
    public ArrayOfSplitHistory createArrayOfSplitHistory() {
        return new ArrayOfSplitHistory();
    }

    /**
     * Create an instance of {@link GetMasterByIndustryResponse }
     * 
     */
    public GetMasterByIndustryResponse createGetMasterByIndustryResponse() {
        return new GetMasterByIndustryResponse();
    }

    /**
     * Create an instance of {@link Master }
     * 
     */
    public Master createMaster() {
        return new Master();
    }

    /**
     * Create an instance of {@link SymbolList }
     * 
     */
    public SymbolList createSymbolList() {
        return new SymbolList();
    }

    /**
     * Create an instance of {@link ListSectors }
     * 
     */
    public ListSectors createListSectors() {
        return new ListSectors();
    }

    /**
     * Create an instance of {@link ListSectorsResponse }
     * 
     */
    public ListSectorsResponse createListSectorsResponse() {
        return new ListSectorsResponse();
    }

    /**
     * Create an instance of {@link ListExchangesResponse }
     * 
     */
    public ListExchangesResponse createListExchangesResponse() {
        return new ListExchangesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfExchange }
     * 
     */
    public ArrayOfExchange createArrayOfExchange() {
        return new ArrayOfExchange();
    }

    /**
     * Create an instance of {@link GetMasterChanges }
     * 
     */
    public GetMasterChanges createGetMasterChanges() {
        return new GetMasterChanges();
    }

    /**
     * Create an instance of {@link GetMasterBySector }
     * 
     */
    public GetMasterBySector createGetMasterBySector() {
        return new GetMasterBySector();
    }

    /**
     * Create an instance of {@link GetMasterAdditionsResponse }
     * 
     */
    public GetMasterAdditionsResponse createGetMasterAdditionsResponse() {
        return new GetMasterAdditionsResponse();
    }

    /**
     * Create an instance of {@link GetAllSplitsResponse }
     * 
     */
    public GetAllSplitsResponse createGetAllSplitsResponse() {
        return new GetAllSplitsResponse();
    }

    /**
     * Create an instance of {@link MasterDeletions }
     * 
     */
    public MasterDeletions createMasterDeletions() {
        return new MasterDeletions();
    }

    /**
     * Create an instance of {@link ListSymbolsByExchangeResponse }
     * 
     */
    public ListSymbolsByExchangeResponse createListSymbolsByExchangeResponse() {
        return new ListSymbolsByExchangeResponse();
    }

    /**
     * Create an instance of {@link GetMasterByExchangeResponse }
     * 
     */
    public GetMasterByExchangeResponse createGetMasterByExchangeResponse() {
        return new GetMasterByExchangeResponse();
    }

    /**
     * Create an instance of {@link GetMasterBySectorResponse }
     * 
     */
    public GetMasterBySectorResponse createGetMasterBySectorResponse() {
        return new GetMasterBySectorResponse();
    }

    /**
     * Create an instance of {@link GetMasterByIssueResponse }
     * 
     */
    public GetMasterByIssueResponse createGetMasterByIssueResponse() {
        return new GetMasterByIssueResponse();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetMasterDeletionsResponse }
     * 
     */
    public GetMasterDeletionsResponse createGetMasterDeletionsResponse() {
        return new GetMasterDeletionsResponse();
    }

    /**
     * Create an instance of {@link GetMasterAdditions }
     * 
     */
    public GetMasterAdditions createGetMasterAdditions() {
        return new GetMasterAdditions();
    }

    /**
     * Create an instance of {@link ListIndustries }
     * 
     */
    public ListIndustries createListIndustries() {
        return new ListIndustries();
    }

    /**
     * Create an instance of {@link GetMasterDeletions }
     * 
     */
    public GetMasterDeletions createGetMasterDeletions() {
        return new GetMasterDeletions();
    }

    /**
     * Create an instance of {@link GetMasterByIssue }
     * 
     */
    public GetMasterByIssue createGetMasterByIssue() {
        return new GetMasterByIssue();
    }

    /**
     * Create an instance of {@link ListCIKsByExchange }
     * 
     */
    public ListCIKsByExchange createListCIKsByExchange() {
        return new ListCIKsByExchange();
    }

    /**
     * Create an instance of {@link ArrayOfDeletion }
     * 
     */
    public ArrayOfDeletion createArrayOfDeletion() {
        return new ArrayOfDeletion();
    }

    /**
     * Create an instance of {@link Symbol }
     * 
     */
    public Symbol createSymbol() {
        return new Symbol();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link SplitHistory }
     * 
     */
    public SplitHistory createSplitHistory() {
        return new SplitHistory();
    }

    /**
     * Create an instance of {@link Industry }
     * 
     */
    public Industry createIndustry() {
        return new Industry();
    }

    /**
     * Create an instance of {@link CUSIP }
     * 
     */
    public CUSIP createCUSIP() {
        return new CUSIP();
    }

    /**
     * Create an instance of {@link ArrayOfCIK }
     * 
     */
    public ArrayOfCIK createArrayOfCIK() {
        return new ArrayOfCIK();
    }

    /**
     * Create an instance of {@link ArrayOfStatistics }
     * 
     */
    public ArrayOfStatistics createArrayOfStatistics() {
        return new ArrayOfStatistics();
    }

    /**
     * Create an instance of {@link Deletion }
     * 
     */
    public Deletion createDeletion() {
        return new Deletion();
    }

    /**
     * Create an instance of {@link ArrayOfChange }
     * 
     */
    public ArrayOfChange createArrayOfChange() {
        return new ArrayOfChange();
    }

    /**
     * Create an instance of {@link Record }
     * 
     */
    public Record createRecord() {
        return new Record();
    }

    /**
     * Create an instance of {@link Addition }
     * 
     */
    public Addition createAddition() {
        return new Addition();
    }

    /**
     * Create an instance of {@link CIK }
     * 
     */
    public CIK createCIK() {
        return new CIK();
    }

    /**
     * Create an instance of {@link Sector }
     * 
     */
    public Sector createSector() {
        return new Sector();
    }

    /**
     * Create an instance of {@link ArrayOfRecord }
     * 
     */
    public ArrayOfRecord createArrayOfRecord() {
        return new ArrayOfRecord();
    }

    /**
     * Create an instance of {@link ArrayOfSplit }
     * 
     */
    public ArrayOfSplit createArrayOfSplit() {
        return new ArrayOfSplit();
    }

    /**
     * Create an instance of {@link ArrayOfAddition }
     * 
     */
    public ArrayOfAddition createArrayOfAddition() {
        return new ArrayOfAddition();
    }

    /**
     * Create an instance of {@link Change }
     * 
     */
    public Change createChange() {
        return new Change();
    }

    /**
     * Create an instance of {@link ArrayOfCUSIP }
     * 
     */
    public ArrayOfCUSIP createArrayOfCUSIP() {
        return new ArrayOfCUSIP();
    }

    /**
     * Create an instance of {@link Statistics }
     * 
     */
    public Statistics createStatistics() {
        return new Statistics();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link Exchange }
     * 
     */
    public Exchange createExchange() {
        return new Exchange();
    }

    /**
     * Create an instance of {@link ArrayOfSymbol }
     * 
     */
    public ArrayOfSymbol createArrayOfSymbol() {
        return new ArrayOfSymbol();
    }

    /**
     * Create an instance of {@link Split }
     * 
     */
    public Split createSplit() {
        return new Split();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MasterDeletions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "MasterDeletions")
    public JAXBElement<MasterDeletions> createMasterDeletions(MasterDeletions value) {
        return new JAXBElement<MasterDeletions>(_MasterDeletions_QNAME, MasterDeletions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MasterChanges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "MasterChanges")
    public JAXBElement<MasterChanges> createMasterChanges(MasterChanges value) {
        return new JAXBElement<MasterChanges>(_MasterChanges_QNAME, MasterChanges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MasterAdditions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "MasterAdditions")
    public JAXBElement<MasterAdditions> createMasterAdditions(MasterAdditions value) {
        return new JAXBElement<MasterAdditions>(_MasterAdditions_QNAME, MasterAdditions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExchange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfExchange")
    public JAXBElement<ArrayOfExchange> createArrayOfExchange(ArrayOfExchange value) {
        return new JAXBElement<ArrayOfExchange>(_ArrayOfExchange_QNAME, ArrayOfExchange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfSector")
    public JAXBElement<ArrayOfSector> createArrayOfSector(ArrayOfSector value) {
        return new JAXBElement<ArrayOfSector>(_ArrayOfSector_QNAME, ArrayOfSector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUSIPList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CUSIPList")
    public JAXBElement<CUSIPList> createCUSIPList(CUSIPList value) {
        return new JAXBElement<CUSIPList>(_CUSIPList_QNAME, CUSIPList.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Master }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Master")
    public JAXBElement<Master> createMaster(Master value) {
        return new JAXBElement<Master>(_Master_QNAME, Master.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ExchangeStatistics")
    public JAXBElement<ExchangeStatistics> createExchangeStatistics(ExchangeStatistics value) {
        return new JAXBElement<ExchangeStatistics>(_ExchangeStatistics_QNAME, ExchangeStatistics.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CIKList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CIKList")
    public JAXBElement<CIKList> createCIKList(CIKList value) {
        return new JAXBElement<CIKList>(_CIKList_QNAME, CIKList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSplitHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfSplitHistory")
    public JAXBElement<ArrayOfSplitHistory> createArrayOfSplitHistory(ArrayOfSplitHistory value) {
        return new JAXBElement<ArrayOfSplitHistory>(_ArrayOfSplitHistory_QNAME, ArrayOfSplitHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIndustry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfIndustry")
    public JAXBElement<ArrayOfIndustry> createArrayOfIndustry(ArrayOfIndustry value) {
        return new JAXBElement<ArrayOfIndustry>(_ArrayOfIndustry_QNAME, ArrayOfIndustry.class, null, value);
    }

}
