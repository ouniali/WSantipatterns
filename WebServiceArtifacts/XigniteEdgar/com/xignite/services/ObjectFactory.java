
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

    private final static QName _ManagementOwnership_QNAME = new QName("http://www.xignite.com/services/", "ManagementOwnership");
    private final static QName _ArrayOfCIKLookup_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfCIKLookup");
    private final static QName _ArrayOfFiling_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfFiling");
    private final static QName _FilingAsText_QNAME = new QName("http://www.xignite.com/services/", "FilingAsText");
    private final static QName _ArrayOfSubmission_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfSubmission");
    private final static QName _Security_QNAME = new QName("http://www.xignite.com/services/", "Security");
    private final static QName _CIKLookup_QNAME = new QName("http://www.xignite.com/services/", "CIKLookup");
    private final static QName _TotalAssets_QNAME = new QName("http://www.xignite.com/services/", "TotalAssets");
    private final static QName _ArrayOfSICCode_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfSICCode");
    private final static QName _SearchResult_QNAME = new QName("http://www.xignite.com/services/", "SearchResult");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _Filing_QNAME = new QName("http://www.xignite.com/services/", "Filing");
    private final static QName _FilingDetails_QNAME = new QName("http://www.xignite.com/services/", "FilingDetails");
    private final static QName _QueryResult_QNAME = new QName("http://www.xignite.com/services/", "QueryResult");
    private final static QName _ArrayOfFilingOccurrence_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfFilingOccurrence");
    private final static QName _File_QNAME = new QName("http://www.xignite.com/services/", "File");
    private final static QName _MasterDocumentsResult_QNAME = new QName("http://www.xignite.com/services/", "MasterDocumentsResult");
    private final static QName _SharesOutstanding_QNAME = new QName("http://www.xignite.com/services/", "SharesOutstanding");
    private final static QName _PDFFile_QNAME = new QName("http://www.xignite.com/services/", "PDFFile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryFilingsResponse }
     * 
     */
    public QueryFilingsResponse createQueryFilingsResponse() {
        return new QueryFilingsResponse();
    }

    /**
     * Create an instance of {@link QueryResult }
     * 
     */
    public QueryResult createQueryResult() {
        return new QueryResult();
    }

    /**
     * Create an instance of {@link FilingAsText }
     * 
     */
    public FilingAsText createFilingAsText() {
        return new FilingAsText();
    }

    /**
     * Create an instance of {@link ArrayOfCIKLookup }
     * 
     */
    public ArrayOfCIKLookup createArrayOfCIKLookup() {
        return new ArrayOfCIKLookup();
    }

    /**
     * Create an instance of {@link PredefinedQueryFilingsResponse }
     * 
     */
    public PredefinedQueryFilingsResponse createPredefinedQueryFilingsResponse() {
        return new PredefinedQueryFilingsResponse();
    }

    /**
     * Create an instance of {@link TotalAssets }
     * 
     */
    public TotalAssets createTotalAssets() {
        return new TotalAssets();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link GetCIKResponse }
     * 
     */
    public GetCIKResponse createGetCIKResponse() {
        return new GetCIKResponse();
    }

    /**
     * Create an instance of {@link GetPDFDocument }
     * 
     */
    public GetPDFDocument createGetPDFDocument() {
        return new GetPDFDocument();
    }

    /**
     * Create an instance of {@link PredefinedQueryFilings }
     * 
     */
    public PredefinedQueryFilings createPredefinedQueryFilings() {
        return new PredefinedQueryFilings();
    }

    /**
     * Create an instance of {@link QueryMasterDocuments }
     * 
     */
    public QueryMasterDocuments createQueryMasterDocuments() {
        return new QueryMasterDocuments();
    }

    /**
     * Create an instance of {@link ReadDocument }
     * 
     */
    public ReadDocument createReadDocument() {
        return new ReadDocument();
    }

    /**
     * Create an instance of {@link GetManagementOwnership }
     * 
     */
    public GetManagementOwnership createGetManagementOwnership() {
        return new GetManagementOwnership();
    }

    /**
     * Create an instance of {@link PDFFile }
     * 
     */
    public PDFFile createPDFFile() {
        return new PDFFile();
    }

    /**
     * Create an instance of {@link GetFilingAsTextResponse }
     * 
     */
    public GetFilingAsTextResponse createGetFilingAsTextResponse() {
        return new GetFilingAsTextResponse();
    }

    /**
     * Create an instance of {@link GetFilingAsText }
     * 
     */
    public GetFilingAsText createGetFilingAsText() {
        return new GetFilingAsText();
    }

    /**
     * Create an instance of {@link ListSECFilingTypes }
     * 
     */
    public ListSECFilingTypes createListSECFilingTypes() {
        return new ListSECFilingTypes();
    }

    /**
     * Create an instance of {@link GetSharesOutstanding }
     * 
     */
    public GetSharesOutstanding createGetSharesOutstanding() {
        return new GetSharesOutstanding();
    }

    /**
     * Create an instance of {@link QueryFilingsByReportingPeriodResponse }
     * 
     */
    public QueryFilingsByReportingPeriodResponse createQueryFilingsByReportingPeriodResponse() {
        return new QueryFilingsByReportingPeriodResponse();
    }

    /**
     * Create an instance of {@link LookupCIKResponse }
     * 
     */
    public LookupCIKResponse createLookupCIKResponse() {
        return new LookupCIKResponse();
    }

    /**
     * Create an instance of {@link GetSharesOutstandingResponse }
     * 
     */
    public GetSharesOutstandingResponse createGetSharesOutstandingResponse() {
        return new GetSharesOutstandingResponse();
    }

    /**
     * Create an instance of {@link SharesOutstanding }
     * 
     */
    public SharesOutstanding createSharesOutstanding() {
        return new SharesOutstanding();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetTotalAssetsResponse }
     * 
     */
    public GetTotalAssetsResponse createGetTotalAssetsResponse() {
        return new GetTotalAssetsResponse();
    }

    /**
     * Create an instance of {@link Filing }
     * 
     */
    public Filing createFiling() {
        return new Filing();
    }

    /**
     * Create an instance of {@link MasterDocumentsResult }
     * 
     */
    public MasterDocumentsResult createMasterDocumentsResult() {
        return new MasterDocumentsResult();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link ArrayOfFilingOccurrence }
     * 
     */
    public ArrayOfFilingOccurrence createArrayOfFilingOccurrence() {
        return new ArrayOfFilingOccurrence();
    }

    /**
     * Create an instance of {@link QueryMasterDocumentsResponse }
     * 
     */
    public QueryMasterDocumentsResponse createQueryMasterDocumentsResponse() {
        return new QueryMasterDocumentsResponse();
    }

    /**
     * Create an instance of {@link ListSECFilingTypesResponse }
     * 
     */
    public ListSECFilingTypesResponse createListSECFilingTypesResponse() {
        return new ListSECFilingTypesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSubmission }
     * 
     */
    public ArrayOfSubmission createArrayOfSubmission() {
        return new ArrayOfSubmission();
    }

    /**
     * Create an instance of {@link LookupNameByCIK }
     * 
     */
    public LookupNameByCIK createLookupNameByCIK() {
        return new LookupNameByCIK();
    }

    /**
     * Create an instance of {@link GetCIK }
     * 
     */
    public GetCIK createGetCIK() {
        return new GetCIK();
    }

    /**
     * Create an instance of {@link ArrayOfFiling }
     * 
     */
    public ArrayOfFiling createArrayOfFiling() {
        return new ArrayOfFiling();
    }

    /**
     * Create an instance of {@link GetFilingOccurrences }
     * 
     */
    public GetFilingOccurrences createGetFilingOccurrences() {
        return new GetFilingOccurrences();
    }

    /**
     * Create an instance of {@link GetLastFilingResponse }
     * 
     */
    public GetLastFilingResponse createGetLastFilingResponse() {
        return new GetLastFilingResponse();
    }

    /**
     * Create an instance of {@link ManagementOwnership }
     * 
     */
    public ManagementOwnership createManagementOwnership() {
        return new ManagementOwnership();
    }

    /**
     * Create an instance of {@link GetPDFDocumentResponse }
     * 
     */
    public GetPDFDocumentResponse createGetPDFDocumentResponse() {
        return new GetPDFDocumentResponse();
    }

    /**
     * Create an instance of {@link LookupCIK }
     * 
     */
    public LookupCIK createLookupCIK() {
        return new LookupCIK();
    }

    /**
     * Create an instance of {@link ArrayOfSICCode }
     * 
     */
    public ArrayOfSICCode createArrayOfSICCode() {
        return new ArrayOfSICCode();
    }

    /**
     * Create an instance of {@link SearchFilings }
     * 
     */
    public SearchFilings createSearchFilings() {
        return new SearchFilings();
    }

    /**
     * Create an instance of {@link GetFilingDetails }
     * 
     */
    public GetFilingDetails createGetFilingDetails() {
        return new GetFilingDetails();
    }

    /**
     * Create an instance of {@link GetManagementOwnershipResponse }
     * 
     */
    public GetManagementOwnershipResponse createGetManagementOwnershipResponse() {
        return new GetManagementOwnershipResponse();
    }

    /**
     * Create an instance of {@link GetTotalAssets }
     * 
     */
    public GetTotalAssets createGetTotalAssets() {
        return new GetTotalAssets();
    }

    /**
     * Create an instance of {@link GetFilingDetailsResponse }
     * 
     */
    public GetFilingDetailsResponse createGetFilingDetailsResponse() {
        return new GetFilingDetailsResponse();
    }

    /**
     * Create an instance of {@link FilingDetails }
     * 
     */
    public FilingDetails createFilingDetails() {
        return new FilingDetails();
    }

    /**
     * Create an instance of {@link GetRecentFilings }
     * 
     */
    public GetRecentFilings createGetRecentFilings() {
        return new GetRecentFilings();
    }

    /**
     * Create an instance of {@link ListSICCodes }
     * 
     */
    public ListSICCodes createListSICCodes() {
        return new ListSICCodes();
    }

    /**
     * Create an instance of {@link ListSICCodesResponse }
     * 
     */
    public ListSICCodesResponse createListSICCodesResponse() {
        return new ListSICCodesResponse();
    }

    /**
     * Create an instance of {@link GetFilingOccurrencesResponse }
     * 
     */
    public GetFilingOccurrencesResponse createGetFilingOccurrencesResponse() {
        return new GetFilingOccurrencesResponse();
    }

    /**
     * Create an instance of {@link QueryFilingsByReportingPeriod }
     * 
     */
    public QueryFilingsByReportingPeriod createQueryFilingsByReportingPeriod() {
        return new QueryFilingsByReportingPeriod();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link ReadDocumentResponse }
     * 
     */
    public ReadDocumentResponse createReadDocumentResponse() {
        return new ReadDocumentResponse();
    }

    /**
     * Create an instance of {@link CIKLookup }
     * 
     */
    public CIKLookup createCIKLookup() {
        return new CIKLookup();
    }

    /**
     * Create an instance of {@link LookupNameByCIKResponse }
     * 
     */
    public LookupNameByCIKResponse createLookupNameByCIKResponse() {
        return new LookupNameByCIKResponse();
    }

    /**
     * Create an instance of {@link QueryFilings }
     * 
     */
    public QueryFilings createQueryFilings() {
        return new QueryFilings();
    }

    /**
     * Create an instance of {@link GetLastFiling }
     * 
     */
    public GetLastFiling createGetLastFiling() {
        return new GetLastFiling();
    }

    /**
     * Create an instance of {@link SearchFilingsResponse }
     * 
     */
    public SearchFilingsResponse createSearchFilingsResponse() {
        return new SearchFilingsResponse();
    }

    /**
     * Create an instance of {@link GetRecentFilingsResponse }
     * 
     */
    public GetRecentFilingsResponse createGetRecentFilingsResponse() {
        return new GetRecentFilingsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfShortFiling }
     * 
     */
    public ArrayOfShortFiling createArrayOfShortFiling() {
        return new ArrayOfShortFiling();
    }

    /**
     * Create an instance of {@link SECFormerCompanyName }
     * 
     */
    public SECFormerCompanyName createSECFormerCompanyName() {
        return new SECFormerCompanyName();
    }

    /**
     * Create an instance of {@link ArrayOfDocument }
     * 
     */
    public ArrayOfDocument createArrayOfDocument() {
        return new ArrayOfDocument();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link MasterDocument }
     * 
     */
    public MasterDocument createMasterDocument() {
        return new MasterDocument();
    }

    /**
     * Create an instance of {@link ArrayOfMasterDocument }
     * 
     */
    public ArrayOfMasterDocument createArrayOfMasterDocument() {
        return new ArrayOfMasterDocument();
    }

    /**
     * Create an instance of {@link SECCompanyData }
     * 
     */
    public SECCompanyData createSECCompanyData() {
        return new SECCompanyData();
    }

    /**
     * Create an instance of {@link ShortFiling }
     * 
     */
    public ShortFiling createShortFiling() {
        return new ShortFiling();
    }

    /**
     * Create an instance of {@link ArrayOfSECFormerCompanyName }
     * 
     */
    public ArrayOfSECFormerCompanyName createArrayOfSECFormerCompanyName() {
        return new ArrayOfSECFormerCompanyName();
    }

    /**
     * Create an instance of {@link SECFilingValues }
     * 
     */
    public SECFilingValues createSECFilingValues() {
        return new SECFilingValues();
    }

    /**
     * Create an instance of {@link SharesAsOf }
     * 
     */
    public SharesAsOf createSharesAsOf() {
        return new SharesAsOf();
    }

    /**
     * Create an instance of {@link SECHeader }
     * 
     */
    public SECHeader createSECHeader() {
        return new SECHeader();
    }

    /**
     * Create an instance of {@link Submission }
     * 
     */
    public Submission createSubmission() {
        return new Submission();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link SECFiler }
     * 
     */
    public SECFiler createSECFiler() {
        return new SECFiler();
    }

    /**
     * Create an instance of {@link ArrayOfSharesAsOf }
     * 
     */
    public ArrayOfSharesAsOf createArrayOfSharesAsOf() {
        return new ArrayOfSharesAsOf();
    }

    /**
     * Create an instance of {@link SICCode }
     * 
     */
    public SICCode createSICCode() {
        return new SICCode();
    }

    /**
     * Create an instance of {@link SECBusinessAddress }
     * 
     */
    public SECBusinessAddress createSECBusinessAddress() {
        return new SECBusinessAddress();
    }

    /**
     * Create an instance of {@link FilingOccurrence }
     * 
     */
    public FilingOccurrence createFilingOccurrence() {
        return new FilingOccurrence();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagementOwnership }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ManagementOwnership")
    public JAXBElement<ManagementOwnership> createManagementOwnership(ManagementOwnership value) {
        return new JAXBElement<ManagementOwnership>(_ManagementOwnership_QNAME, ManagementOwnership.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCIKLookup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfCIKLookup")
    public JAXBElement<ArrayOfCIKLookup> createArrayOfCIKLookup(ArrayOfCIKLookup value) {
        return new JAXBElement<ArrayOfCIKLookup>(_ArrayOfCIKLookup_QNAME, ArrayOfCIKLookup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFiling }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfFiling")
    public JAXBElement<ArrayOfFiling> createArrayOfFiling(ArrayOfFiling value) {
        return new JAXBElement<ArrayOfFiling>(_ArrayOfFiling_QNAME, ArrayOfFiling.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilingAsText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "FilingAsText")
    public JAXBElement<FilingAsText> createFilingAsText(FilingAsText value) {
        return new JAXBElement<FilingAsText>(_FilingAsText_QNAME, FilingAsText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSubmission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfSubmission")
    public JAXBElement<ArrayOfSubmission> createArrayOfSubmission(ArrayOfSubmission value) {
        return new JAXBElement<ArrayOfSubmission>(_ArrayOfSubmission_QNAME, ArrayOfSubmission.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CIKLookup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CIKLookup")
    public JAXBElement<CIKLookup> createCIKLookup(CIKLookup value) {
        return new JAXBElement<CIKLookup>(_CIKLookup_QNAME, CIKLookup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalAssets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "TotalAssets")
    public JAXBElement<TotalAssets> createTotalAssets(TotalAssets value) {
        return new JAXBElement<TotalAssets>(_TotalAssets_QNAME, TotalAssets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSICCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfSICCode")
    public JAXBElement<ArrayOfSICCode> createArrayOfSICCode(ArrayOfSICCode value) {
        return new JAXBElement<ArrayOfSICCode>(_ArrayOfSICCode_QNAME, ArrayOfSICCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "SearchResult")
    public JAXBElement<SearchResult> createSearchResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_SearchResult_QNAME, SearchResult.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Filing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Filing")
    public JAXBElement<Filing> createFiling(Filing value) {
        return new JAXBElement<Filing>(_Filing_QNAME, Filing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilingDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "FilingDetails")
    public JAXBElement<FilingDetails> createFilingDetails(FilingDetails value) {
        return new JAXBElement<FilingDetails>(_FilingDetails_QNAME, FilingDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "QueryResult")
    public JAXBElement<QueryResult> createQueryResult(QueryResult value) {
        return new JAXBElement<QueryResult>(_QueryResult_QNAME, QueryResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFilingOccurrence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfFilingOccurrence")
    public JAXBElement<ArrayOfFilingOccurrence> createArrayOfFilingOccurrence(ArrayOfFilingOccurrence value) {
        return new JAXBElement<ArrayOfFilingOccurrence>(_ArrayOfFilingOccurrence_QNAME, ArrayOfFilingOccurrence.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "File")
    public JAXBElement<File> createFile(File value) {
        return new JAXBElement<File>(_File_QNAME, File.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MasterDocumentsResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "MasterDocumentsResult")
    public JAXBElement<MasterDocumentsResult> createMasterDocumentsResult(MasterDocumentsResult value) {
        return new JAXBElement<MasterDocumentsResult>(_MasterDocumentsResult_QNAME, MasterDocumentsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SharesOutstanding }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "SharesOutstanding")
    public JAXBElement<SharesOutstanding> createSharesOutstanding(SharesOutstanding value) {
        return new JAXBElement<SharesOutstanding>(_SharesOutstanding_QNAME, SharesOutstanding.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDFFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "PDFFile")
    public JAXBElement<PDFFile> createPDFFile(PDFFile value) {
        return new JAXBElement<PDFFile>(_PDFFile_QNAME, PDFFile.class, null, value);
    }

}
