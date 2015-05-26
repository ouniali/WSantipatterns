
package ro.bvb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ro.bvb package. 
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

    private final static QName _ArrayOfDividendIdentification_QNAME = new QName("http://www.bvb.ro", "ArrayOfDividendIdentification");
    private final static QName _ArrayOfCalendarEvent_QNAME = new QName("http://www.bvb.ro", "ArrayOfCalendarEvent");
    private final static QName _CompanyBalance_QNAME = new QName("http://www.bvb.ro", "CompanyBalance");
    private final static QName _DividendsInfo_QNAME = new QName("http://www.bvb.ro", "DividendsInfo");
    private final static QName _ArrayOfBalanceIdentification_QNAME = new QName("http://www.bvb.ro", "ArrayOfBalanceIdentification");
    private final static QName _InvestmentFundBalance_QNAME = new QName("http://www.bvb.ro", "InvestmentFundBalance");
    private final static QName _BankBalance_QNAME = new QName("http://www.bvb.ro", "BankBalance");
    private final static QName _ArrayOfSymbolBalanceTypeIdentification_QNAME = new QName("http://www.bvb.ro", "ArrayOfSymbolBalanceTypeIdentification");
    private final static QName _FinancialCalendar_QNAME = new QName("http://www.bvb.ro", "FinancialCalendar");
    private final static QName _InsuranceBalance_QNAME = new QName("http://www.bvb.ro", "InsuranceBalance");
    private final static QName _ArrayOfBalanceField_QNAME = new QName("http://www.bvb.ro", "ArrayOfBalanceField");
    private final static QName _CompanyBalanceTypeIdentification_QNAME = new QName("http://www.bvb.ro", "CompanyBalanceTypeIdentification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ro.bvb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDividends }
     * 
     */
    public GetDividends createGetDividends() {
        return new GetDividends();
    }

    /**
     * Create an instance of {@link ArrayOfBalanceField }
     * 
     */
    public ArrayOfBalanceField createArrayOfBalanceField() {
        return new ArrayOfBalanceField();
    }

    /**
     * Create an instance of {@link GetAvailableBalances }
     * 
     */
    public GetAvailableBalances createGetAvailableBalances() {
        return new GetAvailableBalances();
    }

    /**
     * Create an instance of {@link InsuranceBalance }
     * 
     */
    public InsuranceBalance createInsuranceBalance() {
        return new InsuranceBalance();
    }

    /**
     * Create an instance of {@link ArrayOfSymbolBalanceTypeIdentification }
     * 
     */
    public ArrayOfSymbolBalanceTypeIdentification createArrayOfSymbolBalanceTypeIdentification() {
        return new ArrayOfSymbolBalanceTypeIdentification();
    }

    /**
     * Create an instance of {@link CompanyBalance }
     * 
     */
    public CompanyBalance createCompanyBalance() {
        return new CompanyBalance();
    }

    /**
     * Create an instance of {@link ArrayOfDividendIdentification }
     * 
     */
    public ArrayOfDividendIdentification createArrayOfDividendIdentification() {
        return new ArrayOfDividendIdentification();
    }

    /**
     * Create an instance of {@link GetCalendarEvents }
     * 
     */
    public GetCalendarEvents createGetCalendarEvents() {
        return new GetCalendarEvents();
    }

    /**
     * Create an instance of {@link GetInsuranceBalanceResponse }
     * 
     */
    public GetInsuranceBalanceResponse createGetInsuranceBalanceResponse() {
        return new GetInsuranceBalanceResponse();
    }

    /**
     * Create an instance of {@link GetBankBalanceResponse }
     * 
     */
    public GetBankBalanceResponse createGetBankBalanceResponse() {
        return new GetBankBalanceResponse();
    }

    /**
     * Create an instance of {@link BankBalance }
     * 
     */
    public BankBalance createBankBalance() {
        return new BankBalance();
    }

    /**
     * Create an instance of {@link GetFinancialCalendar }
     * 
     */
    public GetFinancialCalendar createGetFinancialCalendar() {
        return new GetFinancialCalendar();
    }

    /**
     * Create an instance of {@link FinancialCalendar }
     * 
     */
    public FinancialCalendar createFinancialCalendar() {
        return new FinancialCalendar();
    }

    /**
     * Create an instance of {@link GetLastDividends }
     * 
     */
    public GetLastDividends createGetLastDividends() {
        return new GetLastDividends();
    }

    /**
     * Create an instance of {@link GetLastBalances }
     * 
     */
    public GetLastBalances createGetLastBalances() {
        return new GetLastBalances();
    }

    /**
     * Create an instance of {@link DividendsInfo }
     * 
     */
    public DividendsInfo createDividendsInfo() {
        return new DividendsInfo();
    }

    /**
     * Create an instance of {@link BalanceFieldsDescriptionResponse }
     * 
     */
    public BalanceFieldsDescriptionResponse createBalanceFieldsDescriptionResponse() {
        return new BalanceFieldsDescriptionResponse();
    }

    /**
     * Create an instance of {@link GetBalanceType }
     * 
     */
    public GetBalanceType createGetBalanceType() {
        return new GetBalanceType();
    }

    /**
     * Create an instance of {@link GetIssuerAvailableBalances }
     * 
     */
    public GetIssuerAvailableBalances createGetIssuerAvailableBalances() {
        return new GetIssuerAvailableBalances();
    }

    /**
     * Create an instance of {@link ArrayOfBalanceIdentification }
     * 
     */
    public ArrayOfBalanceIdentification createArrayOfBalanceIdentification() {
        return new ArrayOfBalanceIdentification();
    }

    /**
     * Create an instance of {@link GetDividendsResponse }
     * 
     */
    public GetDividendsResponse createGetDividendsResponse() {
        return new GetDividendsResponse();
    }

    /**
     * Create an instance of {@link GetIssuerAvailableBalancesResponse }
     * 
     */
    public GetIssuerAvailableBalancesResponse createGetIssuerAvailableBalancesResponse() {
        return new GetIssuerAvailableBalancesResponse();
    }

    /**
     * Create an instance of {@link CompanyBalanceTypeIdentification }
     * 
     */
    public CompanyBalanceTypeIdentification createCompanyBalanceTypeIdentification() {
        return new CompanyBalanceTypeIdentification();
    }

    /**
     * Create an instance of {@link GetBankBalance }
     * 
     */
    public GetBankBalance createGetBankBalance() {
        return new GetBankBalance();
    }

    /**
     * Create an instance of {@link ArrayOfCalendarEvent }
     * 
     */
    public ArrayOfCalendarEvent createArrayOfCalendarEvent() {
        return new ArrayOfCalendarEvent();
    }

    /**
     * Create an instance of {@link GetFinancialCalendarResponse }
     * 
     */
    public GetFinancialCalendarResponse createGetFinancialCalendarResponse() {
        return new GetFinancialCalendarResponse();
    }

    /**
     * Create an instance of {@link InvestmentFundBalance }
     * 
     */
    public InvestmentFundBalance createInvestmentFundBalance() {
        return new InvestmentFundBalance();
    }

    /**
     * Create an instance of {@link GetCompanyBalanceResponse }
     * 
     */
    public GetCompanyBalanceResponse createGetCompanyBalanceResponse() {
        return new GetCompanyBalanceResponse();
    }

    /**
     * Create an instance of {@link GetInsuranceBalance }
     * 
     */
    public GetInsuranceBalance createGetInsuranceBalance() {
        return new GetInsuranceBalance();
    }

    /**
     * Create an instance of {@link BalanceFieldsDescription }
     * 
     */
    public BalanceFieldsDescription createBalanceFieldsDescription() {
        return new BalanceFieldsDescription();
    }

    /**
     * Create an instance of {@link GetLastBalancesResponse }
     * 
     */
    public GetLastBalancesResponse createGetLastBalancesResponse() {
        return new GetLastBalancesResponse();
    }

    /**
     * Create an instance of {@link GetLastDividendsResponse }
     * 
     */
    public GetLastDividendsResponse createGetLastDividendsResponse() {
        return new GetLastDividendsResponse();
    }

    /**
     * Create an instance of {@link GetCompanyBalance }
     * 
     */
    public GetCompanyBalance createGetCompanyBalance() {
        return new GetCompanyBalance();
    }

    /**
     * Create an instance of {@link GetInvestmentFundsBalanceResponse }
     * 
     */
    public GetInvestmentFundsBalanceResponse createGetInvestmentFundsBalanceResponse() {
        return new GetInvestmentFundsBalanceResponse();
    }

    /**
     * Create an instance of {@link GetBalanceTypeResponse }
     * 
     */
    public GetBalanceTypeResponse createGetBalanceTypeResponse() {
        return new GetBalanceTypeResponse();
    }

    /**
     * Create an instance of {@link GetInvestmentFundsBalance }
     * 
     */
    public GetInvestmentFundsBalance createGetInvestmentFundsBalance() {
        return new GetInvestmentFundsBalance();
    }

    /**
     * Create an instance of {@link GetCalendarEventsResponse }
     * 
     */
    public GetCalendarEventsResponse createGetCalendarEventsResponse() {
        return new GetCalendarEventsResponse();
    }

    /**
     * Create an instance of {@link GetAvailableBalancesResponse }
     * 
     */
    public GetAvailableBalancesResponse createGetAvailableBalancesResponse() {
        return new GetAvailableBalancesResponse();
    }

    /**
     * Create an instance of {@link SymbolBalanceTypeIdentification }
     * 
     */
    public SymbolBalanceTypeIdentification createSymbolBalanceTypeIdentification() {
        return new SymbolBalanceTypeIdentification();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ArrayOfDividendInfo }
     * 
     */
    public ArrayOfDividendInfo createArrayOfDividendInfo() {
        return new ArrayOfDividendInfo();
    }

    /**
     * Create an instance of {@link DividendInfo }
     * 
     */
    public DividendInfo createDividendInfo() {
        return new DividendInfo();
    }

    /**
     * Create an instance of {@link BalanceField }
     * 
     */
    public BalanceField createBalanceField() {
        return new BalanceField();
    }

    /**
     * Create an instance of {@link CalendarEvent }
     * 
     */
    public CalendarEvent createCalendarEvent() {
        return new CalendarEvent();
    }

    /**
     * Create an instance of {@link BalanceIdentification }
     * 
     */
    public BalanceIdentification createBalanceIdentification() {
        return new BalanceIdentification();
    }

    /**
     * Create an instance of {@link ArrayOfFinancialEvent }
     * 
     */
    public ArrayOfFinancialEvent createArrayOfFinancialEvent() {
        return new ArrayOfFinancialEvent();
    }

    /**
     * Create an instance of {@link DividendIdentification }
     * 
     */
    public DividendIdentification createDividendIdentification() {
        return new DividendIdentification();
    }

    /**
     * Create an instance of {@link FinancialEvent }
     * 
     */
    public FinancialEvent createFinancialEvent() {
        return new FinancialEvent();
    }

    /**
     * Create an instance of {@link CompanyInfo }
     * 
     */
    public CompanyInfo createCompanyInfo() {
        return new CompanyInfo();
    }

    /**
     * Create an instance of {@link CompanyIdentification }
     * 
     */
    public CompanyIdentification createCompanyIdentification() {
        return new CompanyIdentification();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDividendIdentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bvb.ro", name = "ArrayOfDividendIdentification")
    public JAXBElement<ArrayOfDividendIdentification> createArrayOfDividendIdentification(ArrayOfDividendIdentification value) {
        return new JAXBElement<ArrayOfDividendIdentification>(_ArrayOfDividendIdentification_QNAME, ArrayOfDividendIdentification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCalendarEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bvb.ro", name = "ArrayOfCalendarEvent")
    public JAXBElement<ArrayOfCalendarEvent> createArrayOfCalendarEvent(ArrayOfCalendarEvent value) {
        return new JAXBElement<ArrayOfCalendarEvent>(_ArrayOfCalendarEvent_QNAME, ArrayOfCalendarEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bvb.ro", name = "CompanyBalance")
    public JAXBElement<CompanyBalance> createCompanyBalance(CompanyBalance value) {
        return new JAXBElement<CompanyBalance>(_CompanyBalance_QNAME, CompanyBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividendsInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bvb.ro", name = "DividendsInfo")
    public JAXBElement<DividendsInfo> createDividendsInfo(DividendsInfo value) {
        return new JAXBElement<DividendsInfo>(_DividendsInfo_QNAME, DividendsInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBalanceIdentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bvb.ro", name = "ArrayOfBalanceIdentification")
    public JAXBElement<ArrayOfBalanceIdentification> createArrayOfBalanceIdentification(ArrayOfBalanceIdentification value) {
        return new JAXBElement<ArrayOfBalanceIdentification>(_ArrayOfBalanceIdentification_QNAME, ArrayOfBalanceIdentification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvestmentFundBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bvb.ro", name = "InvestmentFundBalance")
    public JAXBElement<InvestmentFundBalance> createInvestmentFundBalance(InvestmentFundBalance value) {
        return new JAXBElement<InvestmentFundBalance>(_InvestmentFundBalance_QNAME, InvestmentFundBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bvb.ro", name = "BankBalance")
    public JAXBElement<BankBalance> createBankBalance(BankBalance value) {
        return new JAXBElement<BankBalance>(_BankBalance_QNAME, BankBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSymbolBalanceTypeIdentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bvb.ro", name = "ArrayOfSymbolBalanceTypeIdentification")
    public JAXBElement<ArrayOfSymbolBalanceTypeIdentification> createArrayOfSymbolBalanceTypeIdentification(ArrayOfSymbolBalanceTypeIdentification value) {
        return new JAXBElement<ArrayOfSymbolBalanceTypeIdentification>(_ArrayOfSymbolBalanceTypeIdentification_QNAME, ArrayOfSymbolBalanceTypeIdentification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bvb.ro", name = "FinancialCalendar")
    public JAXBElement<FinancialCalendar> createFinancialCalendar(FinancialCalendar value) {
        return new JAXBElement<FinancialCalendar>(_FinancialCalendar_QNAME, FinancialCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bvb.ro", name = "InsuranceBalance")
    public JAXBElement<InsuranceBalance> createInsuranceBalance(InsuranceBalance value) {
        return new JAXBElement<InsuranceBalance>(_InsuranceBalance_QNAME, InsuranceBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBalanceField }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bvb.ro", name = "ArrayOfBalanceField")
    public JAXBElement<ArrayOfBalanceField> createArrayOfBalanceField(ArrayOfBalanceField value) {
        return new JAXBElement<ArrayOfBalanceField>(_ArrayOfBalanceField_QNAME, ArrayOfBalanceField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyBalanceTypeIdentification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bvb.ro", name = "CompanyBalanceTypeIdentification")
    public JAXBElement<CompanyBalanceTypeIdentification> createCompanyBalanceTypeIdentification(CompanyBalanceTypeIdentification value) {
        return new JAXBElement<CompanyBalanceTypeIdentification>(_CompanyBalanceTypeIdentification_QNAME, CompanyBalanceTypeIdentification.class, null, value);
    }

}
