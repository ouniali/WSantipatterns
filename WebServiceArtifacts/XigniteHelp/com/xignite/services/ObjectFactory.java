
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

    private final static QName _CSVFile_QNAME = new QName("http://www.xignite.com/services/", "CSVFile");
    private final static QName _BooleanResult_QNAME = new QName("http://www.xignite.com/services/", "BooleanResult");
    private final static QName _UserRegistration_QNAME = new QName("http://www.xignite.com/services/", "UserRegistration");
    private final static QName _ArrayOfServiceExtended_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfServiceExtended");
    private final static QName _UserSummary_QNAME = new QName("http://www.xignite.com/services/", "UserSummary");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _CorporateData_QNAME = new QName("http://www.xignite.com/services/", "CorporateData");
    private final static QName _ArrayOfOperation_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfOperation");
    private final static QName _Boolean_QNAME = new QName("http://www.xignite.com/services/", "boolean");
    private final static QName _ExtendedOperation_QNAME = new QName("http://www.xignite.com/services/", "ExtendedOperation");
    private final static QName _ArrayOfService_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfService");
    private final static QName _Trace_QNAME = new QName("http://www.xignite.com/services/", "Trace");
    private final static QName _Session_QNAME = new QName("http://www.xignite.com/services/", "Session");
    private final static QName _RequestInformation_QNAME = new QName("http://www.xignite.com/services/", "RequestInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteIPAddressResponse }
     * 
     */
    public DeleteIPAddressResponse createDeleteIPAddressResponse() {
        return new DeleteIPAddressResponse();
    }

    /**
     * Create an instance of {@link UserSummary }
     * 
     */
    public UserSummary createUserSummary() {
        return new UserSummary();
    }

    /**
     * Create an instance of {@link GetMyStatusResponse }
     * 
     */
    public GetMyStatusResponse createGetMyStatusResponse() {
        return new GetMyStatusResponse();
    }

    /**
     * Create an instance of {@link ListServicesAndOperationsResponse }
     * 
     */
    public ListServicesAndOperationsResponse createListServicesAndOperationsResponse() {
        return new ListServicesAndOperationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfServiceExtended }
     * 
     */
    public ArrayOfServiceExtended createArrayOfServiceExtended() {
        return new ArrayOfServiceExtended();
    }

    /**
     * Create an instance of {@link GetOperationDetails }
     * 
     */
    public GetOperationDetails createGetOperationDetails() {
        return new GetOperationDetails();
    }

    /**
     * Create an instance of {@link WhatsMyIPResponse }
     * 
     */
    public WhatsMyIPResponse createWhatsMyIPResponse() {
        return new WhatsMyIPResponse();
    }

    /**
     * Create an instance of {@link RequestInformation }
     * 
     */
    public RequestInformation createRequestInformation() {
        return new RequestInformation();
    }

    /**
     * Create an instance of {@link GetCorporateData }
     * 
     */
    public GetCorporateData createGetCorporateData() {
        return new GetCorporateData();
    }

    /**
     * Create an instance of {@link DeleteIPAddress }
     * 
     */
    public DeleteIPAddress createDeleteIPAddress() {
        return new DeleteIPAddress();
    }

    /**
     * Create an instance of {@link ViewTrace }
     * 
     */
    public ViewTrace createViewTrace() {
        return new ViewTrace();
    }

    /**
     * Create an instance of {@link CorporateData }
     * 
     */
    public CorporateData createCorporateData() {
        return new CorporateData();
    }

    /**
     * Create an instance of {@link IsHealthyNoParamsResponse }
     * 
     */
    public IsHealthyNoParamsResponse createIsHealthyNoParamsResponse() {
        return new IsHealthyNoParamsResponse();
    }

    /**
     * Create an instance of {@link ListServicesResponse }
     * 
     */
    public ListServicesResponse createListServicesResponse() {
        return new ListServicesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfService }
     * 
     */
    public ArrayOfService createArrayOfService() {
        return new ArrayOfService();
    }

    /**
     * Create an instance of {@link ListOperationsResponse }
     * 
     */
    public ListOperationsResponse createListOperationsResponse() {
        return new ListOperationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOperation }
     * 
     */
    public ArrayOfOperation createArrayOfOperation() {
        return new ArrayOfOperation();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link AddIPAddressResponse }
     * 
     */
    public AddIPAddressResponse createAddIPAddressResponse() {
        return new AddIPAddressResponse();
    }

    /**
     * Create an instance of {@link BooleanResult }
     * 
     */
    public BooleanResult createBooleanResult() {
        return new BooleanResult();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
    }

    /**
     * Create an instance of {@link ListServices }
     * 
     */
    public ListServices createListServices() {
        return new ListServices();
    }

    /**
     * Create an instance of {@link ViewTraceResponse }
     * 
     */
    public ViewTraceResponse createViewTraceResponse() {
        return new ViewTraceResponse();
    }

    /**
     * Create an instance of {@link Trace }
     * 
     */
    public Trace createTrace() {
        return new Trace();
    }

    /**
     * Create an instance of {@link IsHealthyNoParams }
     * 
     */
    public IsHealthyNoParams createIsHealthyNoParams() {
        return new IsHealthyNoParams();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link AddCookie }
     * 
     */
    public AddCookie createAddCookie() {
        return new AddCookie();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link ExtendedOperation }
     * 
     */
    public ExtendedOperation createExtendedOperation() {
        return new ExtendedOperation();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetMyStatus }
     * 
     */
    public GetMyStatus createGetMyStatus() {
        return new GetMyStatus();
    }

    /**
     * Create an instance of {@link IsHealthy }
     * 
     */
    public IsHealthy createIsHealthy() {
        return new IsHealthy();
    }

    /**
     * Create an instance of {@link AddIPAddress }
     * 
     */
    public AddIPAddress createAddIPAddress() {
        return new AddIPAddress();
    }

    /**
     * Create an instance of {@link CSVFile }
     * 
     */
    public CSVFile createCSVFile() {
        return new CSVFile();
    }

    /**
     * Create an instance of {@link GetUserStatusResponse }
     * 
     */
    public GetUserStatusResponse createGetUserStatusResponse() {
        return new GetUserStatusResponse();
    }

    /**
     * Create an instance of {@link GetUserStatus }
     * 
     */
    public GetUserStatus createGetUserStatus() {
        return new GetUserStatus();
    }

    /**
     * Create an instance of {@link GetWebServiceAsCSVFileResponse }
     * 
     */
    public GetWebServiceAsCSVFileResponse createGetWebServiceAsCSVFileResponse() {
        return new GetWebServiceAsCSVFileResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link AddCookieResponse }
     * 
     */
    public AddCookieResponse createAddCookieResponse() {
        return new AddCookieResponse();
    }

    /**
     * Create an instance of {@link ListOperations }
     * 
     */
    public ListOperations createListOperations() {
        return new ListOperations();
    }

    /**
     * Create an instance of {@link WhatsMyIP }
     * 
     */
    public WhatsMyIP createWhatsMyIP() {
        return new WhatsMyIP();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link DeleteCookie }
     * 
     */
    public DeleteCookie createDeleteCookie() {
        return new DeleteCookie();
    }

    /**
     * Create an instance of {@link DeleteCookieResponse }
     * 
     */
    public DeleteCookieResponse createDeleteCookieResponse() {
        return new DeleteCookieResponse();
    }

    /**
     * Create an instance of {@link GetWebServiceAsCSVFile }
     * 
     */
    public GetWebServiceAsCSVFile createGetWebServiceAsCSVFile() {
        return new GetWebServiceAsCSVFile();
    }

    /**
     * Create an instance of {@link UserRegistration }
     * 
     */
    public UserRegistration createUserRegistration() {
        return new UserRegistration();
    }

    /**
     * Create an instance of {@link GetMyServiceStatusResponse }
     * 
     */
    public GetMyServiceStatusResponse createGetMyServiceStatusResponse() {
        return new GetMyServiceStatusResponse();
    }

    /**
     * Create an instance of {@link IsHealthyResponse }
     * 
     */
    public IsHealthyResponse createIsHealthyResponse() {
        return new IsHealthyResponse();
    }

    /**
     * Create an instance of {@link GetMyServiceStatus }
     * 
     */
    public GetMyServiceStatus createGetMyServiceStatus() {
        return new GetMyServiceStatus();
    }

    /**
     * Create an instance of {@link GetCorporateDataResponse }
     * 
     */
    public GetCorporateDataResponse createGetCorporateDataResponse() {
        return new GetCorporateDataResponse();
    }

    /**
     * Create an instance of {@link ListServicesAndOperations }
     * 
     */
    public ListServicesAndOperations createListServicesAndOperations() {
        return new ListServicesAndOperations();
    }

    /**
     * Create an instance of {@link GetOperationDetailsResponse }
     * 
     */
    public GetOperationDetailsResponse createGetOperationDetailsResponse() {
        return new GetOperationDetailsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOutput }
     * 
     */
    public ArrayOfOutput createArrayOfOutput() {
        return new ArrayOfOutput();
    }

    /**
     * Create an instance of {@link ServiceExtended }
     * 
     */
    public ServiceExtended createServiceExtended() {
        return new ServiceExtended();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link ArrayOfUserRegistration }
     * 
     */
    public ArrayOfUserRegistration createArrayOfUserRegistration() {
        return new ArrayOfUserRegistration();
    }

    /**
     * Create an instance of {@link WhoIs }
     * 
     */
    public WhoIs createWhoIs() {
        return new WhoIs();
    }

    /**
     * Create an instance of {@link Input }
     * 
     */
    public Input createInput() {
        return new Input();
    }

    /**
     * Create an instance of {@link Output }
     * 
     */
    public Output createOutput() {
        return new Output();
    }

    /**
     * Create an instance of {@link ArrayOfEnumeration }
     * 
     */
    public ArrayOfEnumeration createArrayOfEnumeration() {
        return new ArrayOfEnumeration();
    }

    /**
     * Create an instance of {@link Enumeration }
     * 
     */
    public Enumeration createEnumeration() {
        return new Enumeration();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link ArrayOfInput }
     * 
     */
    public ArrayOfInput createArrayOfInput() {
        return new ArrayOfInput();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link Browser }
     * 
     */
    public Browser createBrowser() {
        return new Browser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CSVFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CSVFile")
    public JAXBElement<CSVFile> createCSVFile(CSVFile value) {
        return new JAXBElement<CSVFile>(_CSVFile_QNAME, CSVFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "BooleanResult")
    public JAXBElement<BooleanResult> createBooleanResult(BooleanResult value) {
        return new JAXBElement<BooleanResult>(_BooleanResult_QNAME, BooleanResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRegistration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "UserRegistration")
    public JAXBElement<UserRegistration> createUserRegistration(UserRegistration value) {
        return new JAXBElement<UserRegistration>(_UserRegistration_QNAME, UserRegistration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServiceExtended }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfServiceExtended")
    public JAXBElement<ArrayOfServiceExtended> createArrayOfServiceExtended(ArrayOfServiceExtended value) {
        return new JAXBElement<ArrayOfServiceExtended>(_ArrayOfServiceExtended_QNAME, ArrayOfServiceExtended.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "UserSummary")
    public JAXBElement<UserSummary> createUserSummary(UserSummary value) {
        return new JAXBElement<UserSummary>(_UserSummary_QNAME, UserSummary.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CorporateData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "CorporateData")
    public JAXBElement<CorporateData> createCorporateData(CorporateData value) {
        return new JAXBElement<CorporateData>(_CorporateData_QNAME, CorporateData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfOperation")
    public JAXBElement<ArrayOfOperation> createArrayOfOperation(ArrayOfOperation value) {
        return new JAXBElement<ArrayOfOperation>(_ArrayOfOperation_QNAME, ArrayOfOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ExtendedOperation")
    public JAXBElement<ExtendedOperation> createExtendedOperation(ExtendedOperation value) {
        return new JAXBElement<ExtendedOperation>(_ExtendedOperation_QNAME, ExtendedOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfService")
    public JAXBElement<ArrayOfService> createArrayOfService(ArrayOfService value) {
        return new JAXBElement<ArrayOfService>(_ArrayOfService_QNAME, ArrayOfService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Trace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Trace")
    public JAXBElement<Trace> createTrace(Trace value) {
        return new JAXBElement<Trace>(_Trace_QNAME, Trace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Session }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Session")
    public JAXBElement<Session> createSession(Session value) {
        return new JAXBElement<Session>(_Session_QNAME, Session.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "RequestInformation")
    public JAXBElement<RequestInformation> createRequestInformation(RequestInformation value) {
        return new JAXBElement<RequestInformation>(_RequestInformation_QNAME, RequestInformation.class, null, value);
    }

}
