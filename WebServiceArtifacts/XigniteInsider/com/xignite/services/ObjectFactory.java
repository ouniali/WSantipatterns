
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

    private final static QName _IssuerTransactionSummary_QNAME = new QName("http://www.xignite.com/services/", "IssuerTransactionSummary");
    private final static QName _IssuerOwnerships_QNAME = new QName("http://www.xignite.com/services/", "IssuerOwnerships");
    private final static QName _InsiderHoldings_QNAME = new QName("http://www.xignite.com/services/", "InsiderHoldings");
    private final static QName _FilingAsText_QNAME = new QName("http://www.xignite.com/services/", "FilingAsText");
    private final static QName _Roster_QNAME = new QName("http://www.xignite.com/services/", "Roster");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _ArrayOfRole_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfRole");
    private final static QName _InsiderTransactions_QNAME = new QName("http://www.xignite.com/services/", "InsiderTransactions");
    private final static QName _InsiderSECTransactions_QNAME = new QName("http://www.xignite.com/services/", "InsiderSECTransactions");
    private final static QName _InsiderTransactionSummary_QNAME = new QName("http://www.xignite.com/services/", "InsiderTransactionSummary");
    private final static QName _ArrayOfInsider_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfInsider");
    private final static QName _IssuerTransactions_QNAME = new QName("http://www.xignite.com/services/", "IssuerTransactions");
    private final static QName _InsiderOwnerships_QNAME = new QName("http://www.xignite.com/services/", "InsiderOwnerships");
    private final static QName _ArrayOfIssuerChange_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfIssuerChange");
    private final static QName _OwnershipDocument_QNAME = new QName("http://www.xignite.com/services/", "ownershipDocument");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FilingAsText }
     * 
     */
    public FilingAsText createFilingAsText() {
        return new FilingAsText();
    }

    /**
     * Create an instance of {@link GetAllIssuerTransactionsResponse }
     * 
     */
    public GetAllIssuerTransactionsResponse createGetAllIssuerTransactionsResponse() {
        return new GetAllIssuerTransactionsResponse();
    }

    /**
     * Create an instance of {@link IssuerTransactions }
     * 
     */
    public IssuerTransactions createIssuerTransactions() {
        return new IssuerTransactions();
    }

    /**
     * Create an instance of {@link GetRoster }
     * 
     */
    public GetRoster createGetRoster() {
        return new GetRoster();
    }

    /**
     * Create an instance of {@link InsiderHoldings }
     * 
     */
    public InsiderHoldings createInsiderHoldings() {
        return new InsiderHoldings();
    }

    /**
     * Create an instance of {@link IssuerTransactionSummary }
     * 
     */
    public IssuerTransactionSummary createIssuerTransactionSummary() {
        return new IssuerTransactionSummary();
    }

    /**
     * Create an instance of {@link GetDirectorsResponse }
     * 
     */
    public GetDirectorsResponse createGetDirectorsResponse() {
        return new GetDirectorsResponse();
    }

    /**
     * Create an instance of {@link Roster }
     * 
     */
    public Roster createRoster() {
        return new Roster();
    }

    /**
     * Create an instance of {@link GetInsiderOwnership }
     * 
     */
    public GetInsiderOwnership createGetInsiderOwnership() {
        return new GetInsiderOwnership();
    }

    /**
     * Create an instance of {@link GetInsiderHoldings }
     * 
     */
    public GetInsiderHoldings createGetInsiderHoldings() {
        return new GetInsiderHoldings();
    }

    /**
     * Create an instance of {@link GetDirectors }
     * 
     */
    public GetDirectors createGetDirectors() {
        return new GetDirectors();
    }

    /**
     * Create an instance of {@link GetInsiderTransactionSummaryResponse }
     * 
     */
    public GetInsiderTransactionSummaryResponse createGetInsiderTransactionSummaryResponse() {
        return new GetInsiderTransactionSummaryResponse();
    }

    /**
     * Create an instance of {@link InsiderTransactionSummary }
     * 
     */
    public InsiderTransactionSummary createInsiderTransactionSummary() {
        return new InsiderTransactionSummary();
    }

    /**
     * Create an instance of {@link GetAllIssuerTransactionsRangeResponse }
     * 
     */
    public GetAllIssuerTransactionsRangeResponse createGetAllIssuerTransactionsRangeResponse() {
        return new GetAllIssuerTransactionsRangeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIssuerChange }
     * 
     */
    public ArrayOfIssuerChange createArrayOfIssuerChange() {
        return new ArrayOfIssuerChange();
    }

    /**
     * Create an instance of {@link GetCEOResponse }
     * 
     */
    public GetCEOResponse createGetCEOResponse() {
        return new GetCEOResponse();
    }

    /**
     * Create an instance of {@link GetInsiderHoldingsResponse }
     * 
     */
    public GetInsiderHoldingsResponse createGetInsiderHoldingsResponse() {
        return new GetInsiderHoldingsResponse();
    }

    /**
     * Create an instance of {@link GetInsiderTransactionsResponse }
     * 
     */
    public GetInsiderTransactionsResponse createGetInsiderTransactionsResponse() {
        return new GetInsiderTransactionsResponse();
    }

    /**
     * Create an instance of {@link InsiderTransactions }
     * 
     */
    public InsiderTransactions createInsiderTransactions() {
        return new InsiderTransactions();
    }

    /**
     * Create an instance of {@link GetOwnershipFormResponse }
     * 
     */
    public GetOwnershipFormResponse createGetOwnershipFormResponse() {
        return new GetOwnershipFormResponse();
    }

    /**
     * Create an instance of {@link OwnershipDocument }
     * 
     */
    public OwnershipDocument createOwnershipDocument() {
        return new OwnershipDocument();
    }

    /**
     * Create an instance of {@link GetInsiderOwnershipResponse }
     * 
     */
    public GetInsiderOwnershipResponse createGetInsiderOwnershipResponse() {
        return new GetInsiderOwnershipResponse();
    }

    /**
     * Create an instance of {@link IssuerOwnerships }
     * 
     */
    public IssuerOwnerships createIssuerOwnerships() {
        return new IssuerOwnerships();
    }

    /**
     * Create an instance of {@link GetIssuerTransactionSummary }
     * 
     */
    public GetIssuerTransactionSummary createGetIssuerTransactionSummary() {
        return new GetIssuerTransactionSummary();
    }

    /**
     * Create an instance of {@link GetAllIssuerTransactionsRange }
     * 
     */
    public GetAllIssuerTransactionsRange createGetAllIssuerTransactionsRange() {
        return new GetAllIssuerTransactionsRange();
    }

    /**
     * Create an instance of {@link GetAllInsiderTransactions }
     * 
     */
    public GetAllInsiderTransactions createGetAllInsiderTransactions() {
        return new GetAllInsiderTransactions();
    }

    /**
     * Create an instance of {@link GetInsiderSECTransactions }
     * 
     */
    public GetInsiderSECTransactions createGetInsiderSECTransactions() {
        return new GetInsiderSECTransactions();
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
     * Create an instance of {@link GetRosterResponse }
     * 
     */
    public GetRosterResponse createGetRosterResponse() {
        return new GetRosterResponse();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link InsiderOwnerships }
     * 
     */
    public InsiderOwnerships createInsiderOwnerships() {
        return new InsiderOwnerships();
    }

    /**
     * Create an instance of {@link ArrayOfInsider }
     * 
     */
    public ArrayOfInsider createArrayOfInsider() {
        return new ArrayOfInsider();
    }

    /**
     * Create an instance of {@link GetIssuerTransactions }
     * 
     */
    public GetIssuerTransactions createGetIssuerTransactions() {
        return new GetIssuerTransactions();
    }

    /**
     * Create an instance of {@link GetRolesResponse }
     * 
     */
    public GetRolesResponse createGetRolesResponse() {
        return new GetRolesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRole }
     * 
     */
    public ArrayOfRole createArrayOfRole() {
        return new ArrayOfRole();
    }

    /**
     * Create an instance of {@link GetIssuerTransactionsResponse }
     * 
     */
    public GetIssuerTransactionsResponse createGetIssuerTransactionsResponse() {
        return new GetIssuerTransactionsResponse();
    }

    /**
     * Create an instance of {@link GetInsiders }
     * 
     */
    public GetInsiders createGetInsiders() {
        return new GetInsiders();
    }

    /**
     * Create an instance of {@link GetIssuerOwnerships }
     * 
     */
    public GetIssuerOwnerships createGetIssuerOwnerships() {
        return new GetIssuerOwnerships();
    }

    /**
     * Create an instance of {@link GetRoles }
     * 
     */
    public GetRoles createGetRoles() {
        return new GetRoles();
    }

    /**
     * Create an instance of {@link GetInsiderTransactions }
     * 
     */
    public GetInsiderTransactions createGetInsiderTransactions() {
        return new GetInsiderTransactions();
    }

    /**
     * Create an instance of {@link GetAllInsiderTransactionsResponse }
     * 
     */
    public GetAllInsiderTransactionsResponse createGetAllInsiderTransactionsResponse() {
        return new GetAllInsiderTransactionsResponse();
    }

    /**
     * Create an instance of {@link GetInsiderTransactionSummary }
     * 
     */
    public GetInsiderTransactionSummary createGetInsiderTransactionSummary() {
        return new GetInsiderTransactionSummary();
    }

    /**
     * Create an instance of {@link GetOwnershipForm }
     * 
     */
    public GetOwnershipForm createGetOwnershipForm() {
        return new GetOwnershipForm();
    }

    /**
     * Create an instance of {@link GetCEO }
     * 
     */
    public GetCEO createGetCEO() {
        return new GetCEO();
    }

    /**
     * Create an instance of {@link GetInsidersResponse }
     * 
     */
    public GetInsidersResponse createGetInsidersResponse() {
        return new GetInsidersResponse();
    }

    /**
     * Create an instance of {@link GetInsiderSECTransactionsResponse }
     * 
     */
    public GetInsiderSECTransactionsResponse createGetInsiderSECTransactionsResponse() {
        return new GetInsiderSECTransactionsResponse();
    }

    /**
     * Create an instance of {@link InsiderSECTransactions }
     * 
     */
    public InsiderSECTransactions createInsiderSECTransactions() {
        return new InsiderSECTransactions();
    }

    /**
     * Create an instance of {@link GetOfficersResponse }
     * 
     */
    public GetOfficersResponse createGetOfficersResponse() {
        return new GetOfficersResponse();
    }

    /**
     * Create an instance of {@link GetRole }
     * 
     */
    public GetRole createGetRole() {
        return new GetRole();
    }

    /**
     * Create an instance of {@link GetInsiderOwnerships }
     * 
     */
    public GetInsiderOwnerships createGetInsiderOwnerships() {
        return new GetInsiderOwnerships();
    }

    /**
     * Create an instance of {@link GetIssuerTransactionSummaryResponse }
     * 
     */
    public GetIssuerTransactionSummaryResponse createGetIssuerTransactionSummaryResponse() {
        return new GetIssuerTransactionSummaryResponse();
    }

    /**
     * Create an instance of {@link GetAllIssuerTransactions }
     * 
     */
    public GetAllIssuerTransactions createGetAllIssuerTransactions() {
        return new GetAllIssuerTransactions();
    }

    /**
     * Create an instance of {@link GetOfficers }
     * 
     */
    public GetOfficers createGetOfficers() {
        return new GetOfficers();
    }

    /**
     * Create an instance of {@link GetIssuerOwnershipsResponse }
     * 
     */
    public GetIssuerOwnershipsResponse createGetIssuerOwnershipsResponse() {
        return new GetIssuerOwnershipsResponse();
    }

    /**
     * Create an instance of {@link GetInsiderOwnershipsResponse }
     * 
     */
    public GetInsiderOwnershipsResponse createGetInsiderOwnershipsResponse() {
        return new GetInsiderOwnershipsResponse();
    }

    /**
     * Create an instance of {@link GetRoleResponse }
     * 
     */
    public GetRoleResponse createGetRoleResponse() {
        return new GetRoleResponse();
    }

    /**
     * Create an instance of {@link OwnerSignature }
     * 
     */
    public OwnerSignature createOwnerSignature() {
        return new OwnerSignature();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ArrayOfDerivativeHolding }
     * 
     */
    public ArrayOfDerivativeHolding createArrayOfDerivativeHolding() {
        return new ArrayOfDerivativeHolding();
    }

    /**
     * Create an instance of {@link OwnershipNature }
     * 
     */
    public OwnershipNature createOwnershipNature() {
        return new OwnershipNature();
    }

    /**
     * Create an instance of {@link ArrayOfNonDerivativeHolding }
     * 
     */
    public ArrayOfNonDerivativeHolding createArrayOfNonDerivativeHolding() {
        return new ArrayOfNonDerivativeHolding();
    }

    /**
     * Create an instance of {@link SECFormerCompanyName }
     * 
     */
    public SECFormerCompanyName createSECFormerCompanyName() {
        return new SECFormerCompanyName();
    }

    /**
     * Create an instance of {@link DerivativeHolding }
     * 
     */
    public DerivativeHolding createDerivativeHolding() {
        return new DerivativeHolding();
    }

    /**
     * Create an instance of {@link ArrayOfReportingOwner }
     * 
     */
    public ArrayOfReportingOwner createArrayOfReportingOwner() {
        return new ArrayOfReportingOwner();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link Issuer }
     * 
     */
    public Issuer createIssuer() {
        return new Issuer();
    }

    /**
     * Create an instance of {@link ReportingOwner }
     * 
     */
    public ReportingOwner createReportingOwner() {
        return new ReportingOwner();
    }

    /**
     * Create an instance of {@link ArrayOfTransaction }
     * 
     */
    public ArrayOfTransaction createArrayOfTransaction() {
        return new ArrayOfTransaction();
    }

    /**
     * Create an instance of {@link ArrayOfNonDerivativeTransaction }
     * 
     */
    public ArrayOfNonDerivativeTransaction createArrayOfNonDerivativeTransaction() {
        return new ArrayOfNonDerivativeTransaction();
    }

    /**
     * Create an instance of {@link InsiderOwnership }
     * 
     */
    public InsiderOwnership createInsiderOwnership() {
        return new InsiderOwnership();
    }

    /**
     * Create an instance of {@link SECCompanyData }
     * 
     */
    public SECCompanyData createSECCompanyData() {
        return new SECCompanyData();
    }

    /**
     * Create an instance of {@link DerivativeTransaction }
     * 
     */
    public DerivativeTransaction createDerivativeTransaction() {
        return new DerivativeTransaction();
    }

    /**
     * Create an instance of {@link NonDerivativeTable }
     * 
     */
    public NonDerivativeTable createNonDerivativeTable() {
        return new NonDerivativeTable();
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
     * Create an instance of {@link PostTransactionAmounts }
     * 
     */
    public PostTransactionAmounts createPostTransactionAmounts() {
        return new PostTransactionAmounts();
    }

    /**
     * Create an instance of {@link IssuerChange }
     * 
     */
    public IssuerChange createIssuerChange() {
        return new IssuerChange();
    }

    /**
     * Create an instance of {@link SECTransaction }
     * 
     */
    public SECTransaction createSECTransaction() {
        return new SECTransaction();
    }

    /**
     * Create an instance of {@link IssuerOwnership }
     * 
     */
    public IssuerOwnership createIssuerOwnership() {
        return new IssuerOwnership();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link RptOwnerAddress }
     * 
     */
    public RptOwnerAddress createRptOwnerAddress() {
        return new RptOwnerAddress();
    }

    /**
     * Create an instance of {@link UnderlyingSecurity }
     * 
     */
    public UnderlyingSecurity createUnderlyingSecurity() {
        return new UnderlyingSecurity();
    }

    /**
     * Create an instance of {@link SECFiler }
     * 
     */
    public SECFiler createSECFiler() {
        return new SECFiler();
    }

    /**
     * Create an instance of {@link Insider }
     * 
     */
    public Insider createInsider() {
        return new Insider();
    }

    /**
     * Create an instance of {@link SICCode }
     * 
     */
    public SICCode createSICCode() {
        return new SICCode();
    }

    /**
     * Create an instance of {@link TransactionSummary }
     * 
     */
    public TransactionSummary createTransactionSummary() {
        return new TransactionSummary();
    }

    /**
     * Create an instance of {@link NonDerivativeTransaction }
     * 
     */
    public NonDerivativeTransaction createNonDerivativeTransaction() {
        return new NonDerivativeTransaction();
    }

    /**
     * Create an instance of {@link DerivativeTable }
     * 
     */
    public DerivativeTable createDerivativeTable() {
        return new DerivativeTable();
    }

    /**
     * Create an instance of {@link ArrayOfIssuerOwnership }
     * 
     */
    public ArrayOfIssuerOwnership createArrayOfIssuerOwnership() {
        return new ArrayOfIssuerOwnership();
    }

    /**
     * Create an instance of {@link ArrayOfSECTransaction }
     * 
     */
    public ArrayOfSECTransaction createArrayOfSECTransaction() {
        return new ArrayOfSECTransaction();
    }

    /**
     * Create an instance of {@link ArrayOfInsiderOwnership }
     * 
     */
    public ArrayOfInsiderOwnership createArrayOfInsiderOwnership() {
        return new ArrayOfInsiderOwnership();
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
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link RptOwnerId }
     * 
     */
    public RptOwnerId createRptOwnerId() {
        return new RptOwnerId();
    }

    /**
     * Create an instance of {@link TransactionAmounts }
     * 
     */
    public TransactionAmounts createTransactionAmounts() {
        return new TransactionAmounts();
    }

    /**
     * Create an instance of {@link Footnote }
     * 
     */
    public Footnote createFootnote() {
        return new Footnote();
    }

    /**
     * Create an instance of {@link ArrayOfDerivativeTable }
     * 
     */
    public ArrayOfDerivativeTable createArrayOfDerivativeTable() {
        return new ArrayOfDerivativeTable();
    }

    /**
     * Create an instance of {@link Holding }
     * 
     */
    public Holding createHolding() {
        return new Holding();
    }

    /**
     * Create an instance of {@link TransactionCoding }
     * 
     */
    public TransactionCoding createTransactionCoding() {
        return new TransactionCoding();
    }

    /**
     * Create an instance of {@link RptOwnerRelationship }
     * 
     */
    public RptOwnerRelationship createRptOwnerRelationship() {
        return new RptOwnerRelationship();
    }

    /**
     * Create an instance of {@link ArrayOfNonDerivativeTable }
     * 
     */
    public ArrayOfNonDerivativeTable createArrayOfNonDerivativeTable() {
        return new ArrayOfNonDerivativeTable();
    }

    /**
     * Create an instance of {@link ArrayOfTransactionSummary }
     * 
     */
    public ArrayOfTransactionSummary createArrayOfTransactionSummary() {
        return new ArrayOfTransactionSummary();
    }

    /**
     * Create an instance of {@link FootnoteId }
     * 
     */
    public FootnoteId createFootnoteId() {
        return new FootnoteId();
    }

    /**
     * Create an instance of {@link Relationship }
     * 
     */
    public Relationship createRelationship() {
        return new Relationship();
    }

    /**
     * Create an instance of {@link ArrayOfHolding }
     * 
     */
    public ArrayOfHolding createArrayOfHolding() {
        return new ArrayOfHolding();
    }

    /**
     * Create an instance of {@link ArrayOfDerivativeTransaction }
     * 
     */
    public ArrayOfDerivativeTransaction createArrayOfDerivativeTransaction() {
        return new ArrayOfDerivativeTransaction();
    }

    /**
     * Create an instance of {@link NonDerivativeHolding }
     * 
     */
    public NonDerivativeHolding createNonDerivativeHolding() {
        return new NonDerivativeHolding();
    }

    /**
     * Create an instance of {@link SECBusinessAddress }
     * 
     */
    public SECBusinessAddress createSECBusinessAddress() {
        return new SECBusinessAddress();
    }

    /**
     * Create an instance of {@link ArrayOfFootnote }
     * 
     */
    public ArrayOfFootnote createArrayOfFootnote() {
        return new ArrayOfFootnote();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuerTransactionSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "IssuerTransactionSummary")
    public JAXBElement<IssuerTransactionSummary> createIssuerTransactionSummary(IssuerTransactionSummary value) {
        return new JAXBElement<IssuerTransactionSummary>(_IssuerTransactionSummary_QNAME, IssuerTransactionSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuerOwnerships }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "IssuerOwnerships")
    public JAXBElement<IssuerOwnerships> createIssuerOwnerships(IssuerOwnerships value) {
        return new JAXBElement<IssuerOwnerships>(_IssuerOwnerships_QNAME, IssuerOwnerships.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsiderHoldings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "InsiderHoldings")
    public JAXBElement<InsiderHoldings> createInsiderHoldings(InsiderHoldings value) {
        return new JAXBElement<InsiderHoldings>(_InsiderHoldings_QNAME, InsiderHoldings.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Roster }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Roster")
    public JAXBElement<Roster> createRoster(Roster value) {
        return new JAXBElement<Roster>(_Roster_QNAME, Roster.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfRole")
    public JAXBElement<ArrayOfRole> createArrayOfRole(ArrayOfRole value) {
        return new JAXBElement<ArrayOfRole>(_ArrayOfRole_QNAME, ArrayOfRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsiderTransactions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "InsiderTransactions")
    public JAXBElement<InsiderTransactions> createInsiderTransactions(InsiderTransactions value) {
        return new JAXBElement<InsiderTransactions>(_InsiderTransactions_QNAME, InsiderTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsiderSECTransactions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "InsiderSECTransactions")
    public JAXBElement<InsiderSECTransactions> createInsiderSECTransactions(InsiderSECTransactions value) {
        return new JAXBElement<InsiderSECTransactions>(_InsiderSECTransactions_QNAME, InsiderSECTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsiderTransactionSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "InsiderTransactionSummary")
    public JAXBElement<InsiderTransactionSummary> createInsiderTransactionSummary(InsiderTransactionSummary value) {
        return new JAXBElement<InsiderTransactionSummary>(_InsiderTransactionSummary_QNAME, InsiderTransactionSummary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInsider }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfInsider")
    public JAXBElement<ArrayOfInsider> createArrayOfInsider(ArrayOfInsider value) {
        return new JAXBElement<ArrayOfInsider>(_ArrayOfInsider_QNAME, ArrayOfInsider.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuerTransactions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "IssuerTransactions")
    public JAXBElement<IssuerTransactions> createIssuerTransactions(IssuerTransactions value) {
        return new JAXBElement<IssuerTransactions>(_IssuerTransactions_QNAME, IssuerTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsiderOwnerships }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "InsiderOwnerships")
    public JAXBElement<InsiderOwnerships> createInsiderOwnerships(InsiderOwnerships value) {
        return new JAXBElement<InsiderOwnerships>(_InsiderOwnerships_QNAME, InsiderOwnerships.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIssuerChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfIssuerChange")
    public JAXBElement<ArrayOfIssuerChange> createArrayOfIssuerChange(ArrayOfIssuerChange value) {
        return new JAXBElement<ArrayOfIssuerChange>(_ArrayOfIssuerChange_QNAME, ArrayOfIssuerChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnershipDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ownershipDocument")
    public JAXBElement<OwnershipDocument> createOwnershipDocument(OwnershipDocument value) {
        return new JAXBElement<OwnershipDocument>(_OwnershipDocument_QNAME, OwnershipDocument.class, null, value);
    }

}
