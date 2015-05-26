
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.goquo_dp.ArrayOfAirlineFareRule;
import org.datacontract.schemas._2004._07.goquo_dp.ArrayOfCustomerUserCardTypesEN;
import org.datacontract.schemas._2004._07.goquo_dp.ArrayOfCustomerUserPaymentMethodsEN;
import org.datacontract.schemas._2004._07.goquo_dp.ArrayOfFlights;
import org.datacontract.schemas._2004._07.goquo_dp.ArrayOfPackageSummary;
import org.datacontract.schemas._2004._07.goquo_dp.ArrayOfPassengersEN;
import org.datacontract.schemas._2004._07.goquo_dp.B2BCompanyDetails;
import org.datacontract.schemas._2004._07.goquo_dp.CreditCardsEN;
import org.datacontract.schemas._2004._07.goquo_dp.CustomerUserCardTypesEN;
import org.datacontract.schemas._2004._07.goquo_dp.CustomerUserPaymentMethodsEN;
import org.datacontract.schemas._2004._07.goquo_dp.FlightSearchCriteria;
import org.datacontract.schemas._2004._07.goquo_dp.FlightSearchReponse;
import org.datacontract.schemas._2004._07.goquo_dp.Flights;
import org.datacontract.schemas._2004._07.goquo_dp.PassengerDetailsEN;
import org.datacontract.schemas._2004._07.goquo_dp.PaxLoginsEN;
import org.datacontract.schemas._2004._07.goquo_dp.ReservationDetails;
import org.datacontract.schemas._2004._07.goquo_dp.ReservationsCardTransactionsEN;
import org.datacontract.schemas._2004._07.goquo_dp.ReservationsEN;
import org.datacontract.schemas._2004._07.goquo_dp.ResultPackage;
import org.datacontract.schemas._2004._07.goquo_dp.TicketingResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _BookingSetSelectedAirlineFlightsIBClass_QNAME = new QName("http://tempuri.org/", "IBClass");
    private final static QName _BookingSetSelectedAirlineFlightsOBClass_QNAME = new QName("http://tempuri.org/", "OBClass");
    private final static QName _BookingSaveReservationDetatilsPaxLoginEn_QNAME = new QName("http://tempuri.org/", "paxLoginEn");
    private final static QName _BookingSaveReservationDetatilsArgPassengers_QNAME = new QName("http://tempuri.org/", "argPassengers");
    private final static QName _BookingSaveReservationDetatilsArgPassengerDetails_QNAME = new QName("http://tempuri.org/", "argPassengerDetails");
    private final static QName _BookingSaveReservationDetatilsArgReservation_QNAME = new QName("http://tempuri.org/", "argReservation");
    private final static QName _BookingDoPackageReservationResponseBookingDoPackageReservationResult_QNAME = new QName("http://tempuri.org/", "Booking_DoPackageReservationResult");
    private final static QName _GetCreditBalanceResponseGetCreditBalanceResult_QNAME = new QName("http://tempuri.org/", "GetCreditBalanceResult");
    private final static QName _GetBookingDetailsUserName_QNAME = new QName("http://tempuri.org/", "UserName");
    private final static QName _GetBookingDetailsPNRNo_QNAME = new QName("http://tempuri.org/", "PNRNo");
    private final static QName _GetBookingDetailsPassword_QNAME = new QName("http://tempuri.org/", "Password");
    private final static QName _BookingMakeTicketingResponseBookingMakeTicketingResult_QNAME = new QName("http://tempuri.org/", "Booking_MakeTicketingResult");
    private final static QName _SearchFlightResponseSearchFlightResult_QNAME = new QName("http://tempuri.org/", "SearchFlightResult");
    private final static QName _BookingCustomerUserCardTypesGetListArgEn_QNAME = new QName("http://tempuri.org/", "argEn");
    private final static QName _BookingCustomerUserCardTypesGetListResponseBookingCustomerUserCardTypesGetListResult_QNAME = new QName("http://tempuri.org/", "Booking_CustomerUserCardTypes_GetListResult");
    private final static QName _BookingSetSelectedAirlineFlightsResponseBookingSetSelectedAirlineFlightsResult_QNAME = new QName("http://tempuri.org/", "Booking_SetSelectedAirlineFlightsResult");
    private final static QName _BookingGetPackageSummaryResponseBookingGetPackageSummaryResult_QNAME = new QName("http://tempuri.org/", "Booking_GetPackageSummaryResult");
    private final static QName _BookingFlightSearchPaymentMethodsResponseBookingFlightSearchPaymentMethodsResult_QNAME = new QName("http://tempuri.org/", "Booking_FlightSearchPaymentMethodsResult");
    private final static QName _BookingGetPackageSummarySelectedPaymentMethod_QNAME = new QName("http://tempuri.org/", "SelectedPaymentMethod");
    private final static QName _BookingGetPackageSummaryInsuranceStatus_QNAME = new QName("http://tempuri.org/", "insuranceStatus");
    private final static QName _GetBookingDetailsResponseGetBookingDetailsResult_QNAME = new QName("http://tempuri.org/", "GetBookingDetailsResult");
    private final static QName _SearchFlightSearchCriteria_QNAME = new QName("http://tempuri.org/", "searchCriteria");
    private final static QName _SearchFlightIPAddress_QNAME = new QName("http://tempuri.org/", "IPAddress");
    private final static QName _BookingDoPackageReservationArgEnTrans_QNAME = new QName("http://tempuri.org/", "argEnTrans");
    private final static QName _BookingDoPackageReservationPaxLoginEN_QNAME = new QName("http://tempuri.org/", "paxLoginEN");
    private final static QName _BookingDoPackageReservationArgEnPM_QNAME = new QName("http://tempuri.org/", "argEnPM");
    private final static QName _BookingGetUpdatedAirlineFlightPriceResponseBookingGetUpdatedAirlineFlightPriceResult_QNAME = new QName("http://tempuri.org/", "Booking_GetUpdatedAirlineFlightPriceResult");
    private final static QName _BookingGetFareRulesResponseBookingGetFareRulesResult_QNAME = new QName("http://tempuri.org/", "Booking_GetFareRulesResult");
    private final static QName _BookingSaveReservationDetatilsResponseBookingSaveReservationDetatilsResult_QNAME = new QName("http://tempuri.org/", "Booking_SaveReservationDetatilsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookingGetFareRules }
     * 
     */
    public BookingGetFareRules createBookingGetFareRules() {
        return new BookingGetFareRules();
    }

    /**
     * Create an instance of {@link BookingMakeTicketing }
     * 
     */
    public BookingMakeTicketing createBookingMakeTicketing() {
        return new BookingMakeTicketing();
    }

    /**
     * Create an instance of {@link SearchFlightResponse }
     * 
     */
    public SearchFlightResponse createSearchFlightResponse() {
        return new SearchFlightResponse();
    }

    /**
     * Create an instance of {@link BookingMakeTicketingResponse }
     * 
     */
    public BookingMakeTicketingResponse createBookingMakeTicketingResponse() {
        return new BookingMakeTicketingResponse();
    }

    /**
     * Create an instance of {@link BookingGetUpdatedAirlineFlightPrice }
     * 
     */
    public BookingGetUpdatedAirlineFlightPrice createBookingGetUpdatedAirlineFlightPrice() {
        return new BookingGetUpdatedAirlineFlightPrice();
    }

    /**
     * Create an instance of {@link BookingDoPackageReservation }
     * 
     */
    public BookingDoPackageReservation createBookingDoPackageReservation() {
        return new BookingDoPackageReservation();
    }

    /**
     * Create an instance of {@link SearchFlight }
     * 
     */
    public SearchFlight createSearchFlight() {
        return new SearchFlight();
    }

    /**
     * Create an instance of {@link BookingSetSelectedAirlineFlights }
     * 
     */
    public BookingSetSelectedAirlineFlights createBookingSetSelectedAirlineFlights() {
        return new BookingSetSelectedAirlineFlights();
    }

    /**
     * Create an instance of {@link BookingFlightSearchPaymentMethodsResponse }
     * 
     */
    public BookingFlightSearchPaymentMethodsResponse createBookingFlightSearchPaymentMethodsResponse() {
        return new BookingFlightSearchPaymentMethodsResponse();
    }

    /**
     * Create an instance of {@link BookingGetFareRulesResponse }
     * 
     */
    public BookingGetFareRulesResponse createBookingGetFareRulesResponse() {
        return new BookingGetFareRulesResponse();
    }

    /**
     * Create an instance of {@link BookingFlightSearchPaymentMethods }
     * 
     */
    public BookingFlightSearchPaymentMethods createBookingFlightSearchPaymentMethods() {
        return new BookingFlightSearchPaymentMethods();
    }

    /**
     * Create an instance of {@link BookingSetSelectedAirlineFlightsResponse }
     * 
     */
    public BookingSetSelectedAirlineFlightsResponse createBookingSetSelectedAirlineFlightsResponse() {
        return new BookingSetSelectedAirlineFlightsResponse();
    }

    /**
     * Create an instance of {@link BookingGetPackageSummary }
     * 
     */
    public BookingGetPackageSummary createBookingGetPackageSummary() {
        return new BookingGetPackageSummary();
    }

    /**
     * Create an instance of {@link BookingGetPackageSummaryResponse }
     * 
     */
    public BookingGetPackageSummaryResponse createBookingGetPackageSummaryResponse() {
        return new BookingGetPackageSummaryResponse();
    }

    /**
     * Create an instance of {@link BookingSaveReservationDetatils }
     * 
     */
    public BookingSaveReservationDetatils createBookingSaveReservationDetatils() {
        return new BookingSaveReservationDetatils();
    }

    /**
     * Create an instance of {@link GetCreditBalanceResponse }
     * 
     */
    public GetCreditBalanceResponse createGetCreditBalanceResponse() {
        return new GetCreditBalanceResponse();
    }

    /**
     * Create an instance of {@link BookingCustomerUserCardTypesGetList }
     * 
     */
    public BookingCustomerUserCardTypesGetList createBookingCustomerUserCardTypesGetList() {
        return new BookingCustomerUserCardTypesGetList();
    }

    /**
     * Create an instance of {@link BookingDoPackageReservationResponse }
     * 
     */
    public BookingDoPackageReservationResponse createBookingDoPackageReservationResponse() {
        return new BookingDoPackageReservationResponse();
    }

    /**
     * Create an instance of {@link BookingCustomerUserCardTypesGetListResponse }
     * 
     */
    public BookingCustomerUserCardTypesGetListResponse createBookingCustomerUserCardTypesGetListResponse() {
        return new BookingCustomerUserCardTypesGetListResponse();
    }

    /**
     * Create an instance of {@link GetBookingDetails }
     * 
     */
    public GetBookingDetails createGetBookingDetails() {
        return new GetBookingDetails();
    }

    /**
     * Create an instance of {@link GetCreditBalance }
     * 
     */
    public GetCreditBalance createGetCreditBalance() {
        return new GetCreditBalance();
    }

    /**
     * Create an instance of {@link BookingGetUpdatedAirlineFlightPriceResponse }
     * 
     */
    public BookingGetUpdatedAirlineFlightPriceResponse createBookingGetUpdatedAirlineFlightPriceResponse() {
        return new BookingGetUpdatedAirlineFlightPriceResponse();
    }

    /**
     * Create an instance of {@link GetBookingDetailsResponse }
     * 
     */
    public GetBookingDetailsResponse createGetBookingDetailsResponse() {
        return new GetBookingDetailsResponse();
    }

    /**
     * Create an instance of {@link BookingSaveReservationDetatilsResponse }
     * 
     */
    public BookingSaveReservationDetatilsResponse createBookingSaveReservationDetatilsResponse() {
        return new BookingSaveReservationDetatilsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IBClass", scope = BookingSetSelectedAirlineFlights.class)
    public JAXBElement<String> createBookingSetSelectedAirlineFlightsIBClass(String value) {
        return new JAXBElement<String>(_BookingSetSelectedAirlineFlightsIBClass_QNAME, String.class, BookingSetSelectedAirlineFlights.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "OBClass", scope = BookingSetSelectedAirlineFlights.class)
    public JAXBElement<String> createBookingSetSelectedAirlineFlightsOBClass(String value) {
        return new JAXBElement<String>(_BookingSetSelectedAirlineFlightsOBClass_QNAME, String.class, BookingSetSelectedAirlineFlights.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaxLoginsEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paxLoginEn", scope = BookingSaveReservationDetatils.class)
    public JAXBElement<PaxLoginsEN> createBookingSaveReservationDetatilsPaxLoginEn(PaxLoginsEN value) {
        return new JAXBElement<PaxLoginsEN>(_BookingSaveReservationDetatilsPaxLoginEn_QNAME, PaxLoginsEN.class, BookingSaveReservationDetatils.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPassengersEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "argPassengers", scope = BookingSaveReservationDetatils.class)
    public JAXBElement<ArrayOfPassengersEN> createBookingSaveReservationDetatilsArgPassengers(ArrayOfPassengersEN value) {
        return new JAXBElement<ArrayOfPassengersEN>(_BookingSaveReservationDetatilsArgPassengers_QNAME, ArrayOfPassengersEN.class, BookingSaveReservationDetatils.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerDetailsEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "argPassengerDetails", scope = BookingSaveReservationDetatils.class)
    public JAXBElement<PassengerDetailsEN> createBookingSaveReservationDetatilsArgPassengerDetails(PassengerDetailsEN value) {
        return new JAXBElement<PassengerDetailsEN>(_BookingSaveReservationDetatilsArgPassengerDetails_QNAME, PassengerDetailsEN.class, BookingSaveReservationDetatils.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationsEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "argReservation", scope = BookingSaveReservationDetatils.class)
    public JAXBElement<ReservationsEN> createBookingSaveReservationDetatilsArgReservation(ReservationsEN value) {
        return new JAXBElement<ReservationsEN>(_BookingSaveReservationDetatilsArgReservation_QNAME, ReservationsEN.class, BookingSaveReservationDetatils.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultPackage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Booking_DoPackageReservationResult", scope = BookingDoPackageReservationResponse.class)
    public JAXBElement<ResultPackage> createBookingDoPackageReservationResponseBookingDoPackageReservationResult(ResultPackage value) {
        return new JAXBElement<ResultPackage>(_BookingDoPackageReservationResponseBookingDoPackageReservationResult_QNAME, ResultPackage.class, BookingDoPackageReservationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link B2BCompanyDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCreditBalanceResult", scope = GetCreditBalanceResponse.class)
    public JAXBElement<B2BCompanyDetails> createGetCreditBalanceResponseGetCreditBalanceResult(B2BCompanyDetails value) {
        return new JAXBElement<B2BCompanyDetails>(_GetCreditBalanceResponseGetCreditBalanceResult_QNAME, B2BCompanyDetails.class, GetCreditBalanceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = GetBookingDetails.class)
    public JAXBElement<String> createGetBookingDetailsUserName(String value) {
        return new JAXBElement<String>(_GetBookingDetailsUserName_QNAME, String.class, GetBookingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PNRNo", scope = GetBookingDetails.class)
    public JAXBElement<String> createGetBookingDetailsPNRNo(String value) {
        return new JAXBElement<String>(_GetBookingDetailsPNRNo_QNAME, String.class, GetBookingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Password", scope = GetBookingDetails.class)
    public JAXBElement<String> createGetBookingDetailsPassword(String value) {
        return new JAXBElement<String>(_GetBookingDetailsPassword_QNAME, String.class, GetBookingDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Booking_MakeTicketingResult", scope = BookingMakeTicketingResponse.class)
    public JAXBElement<TicketingResponse> createBookingMakeTicketingResponseBookingMakeTicketingResult(TicketingResponse value) {
        return new JAXBElement<TicketingResponse>(_BookingMakeTicketingResponseBookingMakeTicketingResult_QNAME, TicketingResponse.class, BookingMakeTicketingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = GetCreditBalance.class)
    public JAXBElement<String> createGetCreditBalanceUserName(String value) {
        return new JAXBElement<String>(_GetBookingDetailsUserName_QNAME, String.class, GetCreditBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Password", scope = GetCreditBalance.class)
    public JAXBElement<String> createGetCreditBalancePassword(String value) {
        return new JAXBElement<String>(_GetBookingDetailsPassword_QNAME, String.class, GetCreditBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightSearchReponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SearchFlightResult", scope = SearchFlightResponse.class)
    public JAXBElement<FlightSearchReponse> createSearchFlightResponseSearchFlightResult(FlightSearchReponse value) {
        return new JAXBElement<FlightSearchReponse>(_SearchFlightResponseSearchFlightResult_QNAME, FlightSearchReponse.class, SearchFlightResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerUserCardTypesEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "argEn", scope = BookingCustomerUserCardTypesGetList.class)
    public JAXBElement<CustomerUserCardTypesEN> createBookingCustomerUserCardTypesGetListArgEn(CustomerUserCardTypesEN value) {
        return new JAXBElement<CustomerUserCardTypesEN>(_BookingCustomerUserCardTypesGetListArgEn_QNAME, CustomerUserCardTypesEN.class, BookingCustomerUserCardTypesGetList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerUserCardTypesEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Booking_CustomerUserCardTypes_GetListResult", scope = BookingCustomerUserCardTypesGetListResponse.class)
    public JAXBElement<ArrayOfCustomerUserCardTypesEN> createBookingCustomerUserCardTypesGetListResponseBookingCustomerUserCardTypesGetListResult(ArrayOfCustomerUserCardTypesEN value) {
        return new JAXBElement<ArrayOfCustomerUserCardTypesEN>(_BookingCustomerUserCardTypesGetListResponseBookingCustomerUserCardTypesGetListResult_QNAME, ArrayOfCustomerUserCardTypesEN.class, BookingCustomerUserCardTypesGetListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = BookingMakeTicketing.class)
    public JAXBElement<String> createBookingMakeTicketingUserName(String value) {
        return new JAXBElement<String>(_GetBookingDetailsUserName_QNAME, String.class, BookingMakeTicketing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PNRNo", scope = BookingMakeTicketing.class)
    public JAXBElement<String> createBookingMakeTicketingPNRNo(String value) {
        return new JAXBElement<String>(_GetBookingDetailsPNRNo_QNAME, String.class, BookingMakeTicketing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Password", scope = BookingMakeTicketing.class)
    public JAXBElement<String> createBookingMakeTicketingPassword(String value) {
        return new JAXBElement<String>(_GetBookingDetailsPassword_QNAME, String.class, BookingMakeTicketing.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFlights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Booking_SetSelectedAirlineFlightsResult", scope = BookingSetSelectedAirlineFlightsResponse.class)
    public JAXBElement<ArrayOfFlights> createBookingSetSelectedAirlineFlightsResponseBookingSetSelectedAirlineFlightsResult(ArrayOfFlights value) {
        return new JAXBElement<ArrayOfFlights>(_BookingSetSelectedAirlineFlightsResponseBookingSetSelectedAirlineFlightsResult_QNAME, ArrayOfFlights.class, BookingSetSelectedAirlineFlightsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPackageSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Booking_GetPackageSummaryResult", scope = BookingGetPackageSummaryResponse.class)
    public JAXBElement<ArrayOfPackageSummary> createBookingGetPackageSummaryResponseBookingGetPackageSummaryResult(ArrayOfPackageSummary value) {
        return new JAXBElement<ArrayOfPackageSummary>(_BookingGetPackageSummaryResponseBookingGetPackageSummaryResult_QNAME, ArrayOfPackageSummary.class, BookingGetPackageSummaryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomerUserPaymentMethodsEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Booking_FlightSearchPaymentMethodsResult", scope = BookingFlightSearchPaymentMethodsResponse.class)
    public JAXBElement<ArrayOfCustomerUserPaymentMethodsEN> createBookingFlightSearchPaymentMethodsResponseBookingFlightSearchPaymentMethodsResult(ArrayOfCustomerUserPaymentMethodsEN value) {
        return new JAXBElement<ArrayOfCustomerUserPaymentMethodsEN>(_BookingFlightSearchPaymentMethodsResponseBookingFlightSearchPaymentMethodsResult_QNAME, ArrayOfCustomerUserPaymentMethodsEN.class, BookingFlightSearchPaymentMethodsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerUserPaymentMethodsEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SelectedPaymentMethod", scope = BookingGetPackageSummary.class)
    public JAXBElement<CustomerUserPaymentMethodsEN> createBookingGetPackageSummarySelectedPaymentMethod(CustomerUserPaymentMethodsEN value) {
        return new JAXBElement<CustomerUserPaymentMethodsEN>(_BookingGetPackageSummarySelectedPaymentMethod_QNAME, CustomerUserPaymentMethodsEN.class, BookingGetPackageSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "insuranceStatus", scope = BookingGetPackageSummary.class)
    public JAXBElement<String> createBookingGetPackageSummaryInsuranceStatus(String value) {
        return new JAXBElement<String>(_BookingGetPackageSummaryInsuranceStatus_QNAME, String.class, BookingGetPackageSummary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBookingDetailsResult", scope = GetBookingDetailsResponse.class)
    public JAXBElement<ReservationDetails> createGetBookingDetailsResponseGetBookingDetailsResult(ReservationDetails value) {
        return new JAXBElement<ReservationDetails>(_GetBookingDetailsResponseGetBookingDetailsResult_QNAME, ReservationDetails.class, GetBookingDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = SearchFlight.class)
    public JAXBElement<String> createSearchFlightUserName(String value) {
        return new JAXBElement<String>(_GetBookingDetailsUserName_QNAME, String.class, SearchFlight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightSearchCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchCriteria", scope = SearchFlight.class)
    public JAXBElement<FlightSearchCriteria> createSearchFlightSearchCriteria(FlightSearchCriteria value) {
        return new JAXBElement<FlightSearchCriteria>(_SearchFlightSearchCriteria_QNAME, FlightSearchCriteria.class, SearchFlight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Password", scope = SearchFlight.class)
    public JAXBElement<String> createSearchFlightPassword(String value) {
        return new JAXBElement<String>(_GetBookingDetailsPassword_QNAME, String.class, SearchFlight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IPAddress", scope = SearchFlight.class)
    public JAXBElement<String> createSearchFlightIPAddress(String value) {
        return new JAXBElement<String>(_SearchFlightIPAddress_QNAME, String.class, SearchFlight.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCardsEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "argEn", scope = BookingDoPackageReservation.class)
    public JAXBElement<CreditCardsEN> createBookingDoPackageReservationArgEn(CreditCardsEN value) {
        return new JAXBElement<CreditCardsEN>(_BookingCustomerUserCardTypesGetListArgEn_QNAME, CreditCardsEN.class, BookingDoPackageReservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationsCardTransactionsEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "argEnTrans", scope = BookingDoPackageReservation.class)
    public JAXBElement<ReservationsCardTransactionsEN> createBookingDoPackageReservationArgEnTrans(ReservationsCardTransactionsEN value) {
        return new JAXBElement<ReservationsCardTransactionsEN>(_BookingDoPackageReservationArgEnTrans_QNAME, ReservationsCardTransactionsEN.class, BookingDoPackageReservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaxLoginsEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paxLoginEN", scope = BookingDoPackageReservation.class)
    public JAXBElement<PaxLoginsEN> createBookingDoPackageReservationPaxLoginEN(PaxLoginsEN value) {
        return new JAXBElement<PaxLoginsEN>(_BookingDoPackageReservationPaxLoginEN_QNAME, PaxLoginsEN.class, BookingDoPackageReservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerUserPaymentMethodsEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "argEnPM", scope = BookingDoPackageReservation.class)
    public JAXBElement<CustomerUserPaymentMethodsEN> createBookingDoPackageReservationArgEnPM(CustomerUserPaymentMethodsEN value) {
        return new JAXBElement<CustomerUserPaymentMethodsEN>(_BookingDoPackageReservationArgEnPM_QNAME, CustomerUserPaymentMethodsEN.class, BookingDoPackageReservation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Flights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Booking_GetUpdatedAirlineFlightPriceResult", scope = BookingGetUpdatedAirlineFlightPriceResponse.class)
    public JAXBElement<Flights> createBookingGetUpdatedAirlineFlightPriceResponseBookingGetUpdatedAirlineFlightPriceResult(Flights value) {
        return new JAXBElement<Flights>(_BookingGetUpdatedAirlineFlightPriceResponseBookingGetUpdatedAirlineFlightPriceResult_QNAME, Flights.class, BookingGetUpdatedAirlineFlightPriceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAirlineFareRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Booking_GetFareRulesResult", scope = BookingGetFareRulesResponse.class)
    public JAXBElement<ArrayOfAirlineFareRule> createBookingGetFareRulesResponseBookingGetFareRulesResult(ArrayOfAirlineFareRule value) {
        return new JAXBElement<ArrayOfAirlineFareRule>(_BookingGetFareRulesResponseBookingGetFareRulesResult_QNAME, ArrayOfAirlineFareRule.class, BookingGetFareRulesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationsEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Booking_SaveReservationDetatilsResult", scope = BookingSaveReservationDetatilsResponse.class)
    public JAXBElement<ReservationsEN> createBookingSaveReservationDetatilsResponseBookingSaveReservationDetatilsResult(ReservationsEN value) {
        return new JAXBElement<ReservationsEN>(_BookingSaveReservationDetatilsResponseBookingSaveReservationDetatilsResult_QNAME, ReservationsEN.class, BookingSaveReservationDetatilsResponse.class, value);
    }

}
