
package _170._0._168._192.tt.bookingapi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BookingAPISoap", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BookingAPISoap {


    /**
     * 
     * @param request
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSSearchResponse
     */
    @WebMethod(operationName = "Search", action = "http://192.168.0.170/TT/BookingAPI/Search")
    @WebResult(name = "SearchResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "Search", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.Search")
    @ResponseWrapper(localName = "SearchResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.SearchResponse")
    public WSSearchResponse search(
        @WebParam(name = "request", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSSearchRequest request);

    /**
     * 
     * @param bookRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSBookResponse
     */
    @WebMethod(operationName = "Book", action = "http://192.168.0.170/TT/BookingAPI/Book")
    @WebResult(name = "BookResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "Book", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.Book")
    @ResponseWrapper(localName = "BookResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.BookResponse")
    public WSBookResponse book(
        @WebParam(name = "bookRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSBookRequest bookRequest);

    /**
     * 
     * @param cancelRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSCancelItineraryResponse
     */
    @WebMethod(operationName = "CancelItinerary", action = "http://192.168.0.170/TT/BookingAPI/CancelItinerary")
    @WebResult(name = "CancelItineraryResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "CancelItinerary", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.CancelItinerary")
    @ResponseWrapper(localName = "CancelItineraryResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.CancelItineraryResponse")
    public WSCancelItineraryResponse cancelItinerary(
        @WebParam(name = "cancelRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSCancelItineraryRequest cancelRequest);

    /**
     * 
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSUserPreference
     */
    @WebMethod(operationName = "GetPreferences", action = "http://192.168.0.170/TT/BookingAPI/GetPreferences")
    @WebResult(name = "GetPreferencesResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetPreferences", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetPreferences")
    @ResponseWrapper(localName = "GetPreferencesResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetPreferencesResponse")
    public WSUserPreference getPreferences();

    /**
     * 
     * @param fareQuoteRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSGetFareQuoteResponse
     */
    @WebMethod(operationName = "GetFareQuote", action = "http://192.168.0.170/TT/BookingAPI/GetFareQuote")
    @WebResult(name = "GetFareQuoteResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetFareQuote", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetFareQuote")
    @ResponseWrapper(localName = "GetFareQuoteResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetFareQuoteResponse")
    public WSGetFareQuoteResponse getFareQuote(
        @WebParam(name = "fareQuoteRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSGetFareQuoteRequest fareQuoteRequest);

    /**
     * 
     * @param ssrRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSGetSSRResponse
     */
    @WebMethod(operationName = "GetSSR", action = "http://192.168.0.170/TT/BookingAPI/GetSSR")
    @WebResult(name = "GetSSRResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetSSR", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetSSR")
    @ResponseWrapper(localName = "GetSSRResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetSSRResponse")
    public WSGetSSRResponse getSSR(
        @WebParam(name = "ssrRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSGetSSRRequest ssrRequest);

    /**
     * 
     * @param fareRuleRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSFareRuleResponse
     */
    @WebMethod(operationName = "GetFareRule", action = "http://192.168.0.170/TT/BookingAPI/GetFareRule")
    @WebResult(name = "GetFareRuleResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetFareRule", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetFareRule")
    @ResponseWrapper(localName = "GetFareRuleResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetFareRuleResponse")
    public WSFareRuleResponse getFareRule(
        @WebParam(name = "fareRuleRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSFareRuleRequest fareRuleRequest);

    /**
     * 
     * @param saveRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSAddBookingResponse
     */
    @WebMethod(operationName = "AddBookingDetail", action = "http://192.168.0.170/TT/BookingAPI/AddBookingDetail")
    @WebResult(name = "AddBookingDetailResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "AddBookingDetail", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.AddBookingDetail")
    @ResponseWrapper(localName = "AddBookingDetailResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.AddBookingDetailResponse")
    public WSAddBookingResponse addBookingDetail(
        @WebParam(name = "saveRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSAddBookingRequest saveRequest);

    /**
     * 
     * @param bookingRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSGetBookingResponse
     */
    @WebMethod(operationName = "GetBooking", action = "http://192.168.0.170/TT/BookingAPI/GetBooking")
    @WebResult(name = "GetBookingResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetBooking", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetBooking")
    @ResponseWrapper(localName = "GetBookingResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetBookingResponse")
    public WSGetBookingResponse getBooking(
        @WebParam(name = "bookingRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSGetBookingRequest bookingRequest);

    /**
     * 
     * @param saveRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSUpdateFeeResponse
     */
    @WebMethod(operationName = "UpdateFee", action = "http://192.168.0.170/TT/BookingAPI/UpdateFee")
    @WebResult(name = "UpdateFeeResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "UpdateFee", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.UpdateFee")
    @ResponseWrapper(localName = "UpdateFeeResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.UpdateFeeResponse")
    public WSUpdateFeeResponse updateFee(
        @WebParam(name = "saveRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSUpdateFeeRequest saveRequest);

    /**
     * 
     * @param calanderFareRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSGetCalendarFareResponse
     */
    @WebMethod(operationName = "GetCalendarFare", action = "http://192.168.0.170/TT/BookingAPI/GetCalendarFare")
    @WebResult(name = "GetCalendarFareResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetCalendarFare", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetCalendarFare")
    @ResponseWrapper(localName = "GetCalendarFareResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetCalendarFareResponse")
    public WSGetCalendarFareResponse getCalendarFare(
        @WebParam(name = "calanderFareRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSGetCalendarFareRequest calanderFareRequest);

    /**
     * 
     * @param updateRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSUpdatedCalendarFareOfDayResponse
     */
    @WebMethod(operationName = "UpdateCalendarFareOfDay", action = "http://192.168.0.170/TT/BookingAPI/UpdateCalendarFareOfDay")
    @WebResult(name = "UpdateCalendarFareOfDayResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "UpdateCalendarFareOfDay", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.UpdateCalendarFareOfDay")
    @ResponseWrapper(localName = "UpdateCalendarFareOfDayResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.UpdateCalendarFareOfDayResponse")
    public WSUpdatedCalendarFareOfDayResponse updateCalendarFareOfDay(
        @WebParam(name = "updateRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSUpdatedCalendarFareOfDayRequest updateRequest);

    /**
     * 
     * @param tripRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSGetTripDetailResponse
     */
    @WebMethod(operationName = "GetTripDetail", action = "http://192.168.0.170/TT/BookingAPI/GetTripDetail")
    @WebResult(name = "GetTripDetailResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetTripDetail", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetTripDetail")
    @ResponseWrapper(localName = "GetTripDetailResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetTripDetailResponse")
    public WSGetTripDetailResponse getTripDetail(
        @WebParam(name = "tripRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSGetTripDetailRequest tripRequest);

    /**
     * 
     * @param wsTicketRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSTicketResponse
     */
    @WebMethod(operationName = "Ticket", action = "http://192.168.0.170/TT/BookingAPI/Ticket")
    @WebResult(name = "TicketResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "Ticket", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.Ticket")
    @ResponseWrapper(localName = "TicketResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.TicketResponse")
    public WSTicketResponse ticket(
        @WebParam(name = "wsTicketRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSTicketRequest wsTicketRequest);

    /**
     * 
     * @param sessionId
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSTicketResponse
     */
    @WebMethod(operationName = "GetTicketResponse", action = "http://192.168.0.170/TT/BookingAPI/GetTicketResponse")
    @WebResult(name = "GetTicketResponseResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetTicketResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetTicketResponse")
    @ResponseWrapper(localName = "GetTicketResponseResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetTicketResponseResponse")
    public WSTicketResponse getTicketResponse(
        @WebParam(name = "SessionId", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        String sessionId);

    /**
     * 
     * @param wsTicketRequest
     * @param bookRequestXML
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSTicketResponse
     */
    @WebMethod(operationName = "LCCTicket", action = "http://192.168.0.170/TT/BookingAPI/LCCTicket")
    @WebResult(name = "LCCTicketResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "LCCTicket", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.LCCTicket")
    @ResponseWrapper(localName = "LCCTicketResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.LCCTicketResponse")
    public WSTicketResponse lccTicket(
        @WebParam(name = "wsTicketRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSTicketRequest wsTicketRequest,
        @WebParam(name = "bookRequestXML", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        String bookRequestXML);

    /**
     * 
     * @param pnr
     * @param gdsName
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSTicketResponse
     */
    @WebMethod(operationName = "NonLCCTicket", action = "http://192.168.0.170/TT/BookingAPI/NonLCCTicket")
    @WebResult(name = "NonLCCTicketResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "NonLCCTicket", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.NonLCCTicket")
    @ResponseWrapper(localName = "NonLCCTicketResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.NonLCCTicketResponse")
    public WSTicketResponse nonLCCTicket(
        @WebParam(name = "pnr", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        String pnr,
        @WebParam(name = "gdsName", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        BookingSource gdsName);

    /**
     * 
     * @param to
     * @param ticketId
     */
    @WebMethod(operationName = "EmailTicket", action = "http://192.168.0.170/TT/BookingAPI/EmailTicket")
    @RequestWrapper(localName = "EmailTicket", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.EmailTicket")
    @ResponseWrapper(localName = "EmailTicketResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.EmailTicketResponse")
    public void emailTicket(
        @WebParam(name = "ticketId", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        int ticketId,
        @WebParam(name = "to", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        String to);

    /**
     * 
     * @param request
     * @return
     *     returns _170._0._168._192.tt.bookingapi.ArrayOfWSSendChangeRequestResponse
     */
    @WebMethod(operationName = "SendChangeRequest", action = "http://192.168.0.170/TT/BookingAPI/SendChangeRequest")
    @WebResult(name = "SendChangeRequestResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "SendChangeRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.SendChangeRequest")
    @ResponseWrapper(localName = "SendChangeRequestResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.SendChangeRequestResponse")
    public ArrayOfWSSendChangeRequestResponse sendChangeRequest(
        @WebParam(name = "request", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSSendChangeRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSChangeRequestStatusResponse
     */
    @WebMethod(operationName = "GetChangeRequestStatus", action = "http://192.168.0.170/TT/BookingAPI/GetChangeRequestStatus")
    @WebResult(name = "GetChangeRequestStatusResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetChangeRequestStatus", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetChangeRequestStatus")
    @ResponseWrapper(localName = "GetChangeRequestStatusResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetChangeRequestStatusResponse")
    public WSChangeRequestStatusResponse getChangeRequestStatus(
        @WebParam(name = "request", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSChangeRequestStatusRequest request);

    /**
     * 
     * @param siteId
     * @param bookingId
     * @param productType
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSStatus
     */
    @WebMethod(operationName = "AddWLAgentBooking", action = "http://192.168.0.170/TT/BookingAPI/AddWLAgentBooking")
    @WebResult(name = "AddWLAgentBookingResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "AddWLAgentBooking", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.AddWLAgentBooking")
    @ResponseWrapper(localName = "AddWLAgentBookingResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.AddWLAgentBookingResponse")
    public WSStatus addWLAgentBooking(
        @WebParam(name = "bookingId", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        int bookingId,
        @WebParam(name = "siteId", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        String siteId,
        @WebParam(name = "productType", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        ProductType productType);

    /**
     * 
     * @param isAirlineLcc
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSGetAgencyBalanceResponse
     */
    @WebMethod(operationName = "GetAgencyBalance", action = "http://192.168.0.170/TT/BookingAPI/GetAgencyBalance")
    @WebResult(name = "GetAgencyBalanceResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetAgencyBalance", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetAgencyBalance")
    @ResponseWrapper(localName = "GetAgencyBalanceResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetAgencyBalanceResponse")
    public WSGetAgencyBalanceResponse getAgencyBalance(
        @WebParam(name = "isAirlineLcc", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        boolean isAirlineLcc);

    /**
     * 
     * @param wsAgencyCustomerListRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSAgencyCustomerListResponse
     */
    @WebMethod(operationName = "GetAgencyCustomerList", action = "http://192.168.0.170/TT/BookingAPI/GetAgencyCustomerList")
    @WebResult(name = "GetAgencyCustomerListResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetAgencyCustomerList", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetAgencyCustomerList")
    @ResponseWrapper(localName = "GetAgencyCustomerListResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetAgencyCustomerListResponse")
    public WSAgencyCustomerListResponse getAgencyCustomerList(
        @WebParam(name = "wsAgencyCustomerListRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSAgencyCustomerListRequest wsAgencyCustomerListRequest);

    /**
     * 
     * @param wsSaveUpadteCustomerRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSSaveUpdateCustomerResponse
     */
    @WebMethod(operationName = "SaveUpateDeatilsOfCustomer", action = "http://192.168.0.170/TT/BookingAPI/SaveUpateDeatilsOfCustomer")
    @WebResult(name = "SaveUpateDeatilsOfCustomerResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "SaveUpateDeatilsOfCustomer", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.SaveUpateDeatilsOfCustomer")
    @ResponseWrapper(localName = "SaveUpateDeatilsOfCustomerResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.SaveUpateDeatilsOfCustomerResponse")
    public WSSaveUpdateCustomerResponse saveUpateDeatilsOfCustomer(
        @WebParam(name = "wsSaveUpadteCustomerRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSSaveUpdateCustomerRequest wsSaveUpadteCustomerRequest);

    /**
     * 
     * @param wsAgencyCustomerListRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSAgencyCustomerListResponse
     */
    @WebMethod(operationName = "GetAgencyCustomerDetail", action = "http://192.168.0.170/TT/BookingAPI/GetAgencyCustomerDetail")
    @WebResult(name = "GetAgencyCustomerDetailResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetAgencyCustomerDetail", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetAgencyCustomerDetail")
    @ResponseWrapper(localName = "GetAgencyCustomerDetailResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetAgencyCustomerDetailResponse")
    public WSAgencyCustomerListResponse getAgencyCustomerDetail(
        @WebParam(name = "wsAgencyCustomerListRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSAgencyCustomerListRequest wsAgencyCustomerListRequest);

    /**
     * 
     * @param wsTicketQueueRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSTicketQueueResponse
     */
    @WebMethod(operationName = "GetTicketQueue", action = "http://192.168.0.170/TT/BookingAPI/GetTicketQueue")
    @WebResult(name = "GetTicketQueueResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetTicketQueue", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetTicketQueue")
    @ResponseWrapper(localName = "GetTicketQueueResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetTicketQueueResponse")
    public WSTicketQueueResponse getTicketQueue(
        @WebParam(name = "wsTicketQueueRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSTicketQueueRequest wsTicketQueueRequest);

    /**
     * 
     * @param wsBookingQueueRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSBookingQueueResponse
     */
    @WebMethod(operationName = "GetBookingQueue", action = "http://192.168.0.170/TT/BookingAPI/GetBookingQueue")
    @WebResult(name = "GetBookingQueueResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetBookingQueue", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetBookingQueue")
    @ResponseWrapper(localName = "GetBookingQueueResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetBookingQueueResponse")
    public WSBookingQueueResponse getBookingQueue(
        @WebParam(name = "wsBookingQueueRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSBookingQueueRequest wsBookingQueueRequest);

    /**
     * 
     * @param wsChangeRequestQueueRequest
     * @return
     *     returns _170._0._168._192.tt.bookingapi.WSChangeRequestQueueResponse
     */
    @WebMethod(operationName = "GetChangeRequestQueue", action = "http://192.168.0.170/TT/BookingAPI/GetChangeRequestQueue")
    @WebResult(name = "GetChangeRequestQueueResult", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
    @RequestWrapper(localName = "GetChangeRequestQueue", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetChangeRequestQueue")
    @ResponseWrapper(localName = "GetChangeRequestQueueResponse", targetNamespace = "http://192.168.0.170/TT/BookingAPI", className = "_170._0._168._192.tt.bookingapi.GetChangeRequestQueueResponse")
    public WSChangeRequestQueueResponse getChangeRequestQueue(
        @WebParam(name = "wsChangeRequestQueueRequest", targetNamespace = "http://192.168.0.170/TT/BookingAPI")
        WSChangeRequestQueueRequest wsChangeRequestQueueRequest);

}