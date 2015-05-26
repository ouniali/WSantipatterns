
package com.flightstats.schedules.service.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.flightstats.schedules.service.v1 package. 
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

    private final static QName _Response_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "response");
    private final static QName _ApiResponseError_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "apiResponseError");
    private final static QName _ByRouteDepartingResponse_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "byRoute_DepartingResponse");
    private final static QName _ByRouteArriving_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "byRoute_Arriving");
    private final static QName _APIException_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "APIException");
    private final static QName _Airline_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "airline");
    private final static QName _ByAirportDepartingResponse_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "byAirport_DepartingResponse");
    private final static QName _ByAirportArriving_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "byAirport_Arriving");
    private final static QName _ByFlightDeparting_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "byFlight_Departing");
    private final static QName _Appendix_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "appendix");
    private final static QName _ScheduledFlight_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "ScheduledFlight");
    private final static QName _Request_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "request");
    private final static QName _Operator_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "Operator");
    private final static QName _ByAirportArrivingResponse_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "byAirport_ArrivingResponse");
    private final static QName _ByFlightArriving_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "byFlight_Arriving");
    private final static QName _ByAirportDeparting_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "byAirport_Departing");
    private final static QName _ByFlightDepartingResponse_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "byFlight_DepartingResponse");
    private final static QName _Airport_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "airport");
    private final static QName _ByFlightArrivingResponse_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "byFlight_ArrivingResponse");
    private final static QName _ByRouteArrivingResponse_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "byRoute_ArrivingResponse");
    private final static QName _ByRouteDeparting_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "byRoute_Departing");
    private final static QName _Equipment_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "equipment");
    private final static QName _Codeshare_QNAME = new QName("http://v1.service.schedules.flightstats.com/", "Codeshare");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.flightstats.schedules.service.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseBase }
     * 
     */
    public ResponseBase createResponseBase() {
        return new ResponseBase();
    }

    /**
     * Create an instance of {@link CodeshareV1 }
     * 
     */
    public CodeshareV1 createCodeshareV1() {
        return new CodeshareV1();
    }

    /**
     * Create an instance of {@link ScheduledFlightV1 }
     * 
     */
    public ScheduledFlightV1 createScheduledFlightV1() {
        return new ScheduledFlightV1();
    }

    /**
     * Create an instance of {@link Appendices }
     * 
     */
    public Appendices createAppendices() {
        return new Appendices();
    }

    /**
     * Create an instance of {@link OperatorV1 }
     * 
     */
    public OperatorV1 createOperatorV1() {
        return new OperatorV1();
    }

    /**
     * Create an instance of {@link ByAirportArrivingResponse }
     * 
     */
    public ByAirportArrivingResponse createByAirportArrivingResponse() {
        return new ByAirportArrivingResponse();
    }

    /**
     * Create an instance of {@link ByFlightArriving }
     * 
     */
    public ByFlightArriving createByFlightArriving() {
        return new ByFlightArriving();
    }

    /**
     * Create an instance of {@link ByFlightDeparting }
     * 
     */
    public ByFlightDeparting createByFlightDeparting() {
        return new ByFlightDeparting();
    }

    /**
     * Create an instance of {@link ByRouteDeparting }
     * 
     */
    public ByRouteDeparting createByRouteDeparting() {
        return new ByRouteDeparting();
    }

    /**
     * Create an instance of {@link EquipmentV1 }
     * 
     */
    public EquipmentV1 createEquipmentV1() {
        return new EquipmentV1();
    }

    /**
     * Create an instance of {@link ByFlightDepartingResponse }
     * 
     */
    public ByFlightDepartingResponse createByFlightDepartingResponse() {
        return new ByFlightDepartingResponse();
    }

    /**
     * Create an instance of {@link ByAirportDeparting }
     * 
     */
    public ByAirportDeparting createByAirportDeparting() {
        return new ByAirportDeparting();
    }

    /**
     * Create an instance of {@link AirportV1 }
     * 
     */
    public AirportV1 createAirportV1() {
        return new AirportV1();
    }

    /**
     * Create an instance of {@link ByFlightArrivingResponse }
     * 
     */
    public ByFlightArrivingResponse createByFlightArrivingResponse() {
        return new ByFlightArrivingResponse();
    }

    /**
     * Create an instance of {@link ByRouteArrivingResponse }
     * 
     */
    public ByRouteArrivingResponse createByRouteArrivingResponse() {
        return new ByRouteArrivingResponse();
    }

    /**
     * Create an instance of {@link ByRouteArriving }
     * 
     */
    public ByRouteArriving createByRouteArriving() {
        return new ByRouteArriving();
    }

    /**
     * Create an instance of {@link ApiResponseError }
     * 
     */
    public ApiResponseError createApiResponseError() {
        return new ApiResponseError();
    }

    /**
     * Create an instance of {@link ByRouteDepartingResponse }
     * 
     */
    public ByRouteDepartingResponse createByRouteDepartingResponse() {
        return new ByRouteDepartingResponse();
    }

    /**
     * Create an instance of {@link APIException }
     * 
     */
    public APIException createAPIException() {
        return new APIException();
    }

    /**
     * Create an instance of {@link ByAirportDepartingResponse }
     * 
     */
    public ByAirportDepartingResponse createByAirportDepartingResponse() {
        return new ByAirportDepartingResponse();
    }

    /**
     * Create an instance of {@link ByAirportArriving }
     * 
     */
    public ByAirportArriving createByAirportArriving() {
        return new ByAirportArriving();
    }

    /**
     * Create an instance of {@link AirlineV1 }
     * 
     */
    public AirlineV1 createAirlineV1() {
        return new AirlineV1();
    }

    /**
     * Create an instance of {@link RequestBase }
     * 
     */
    public RequestBase createRequestBase() {
        return new RequestBase();
    }

    /**
     * Create an instance of {@link RequestedAirportV1 }
     * 
     */
    public RequestedAirportV1 createRequestedAirportV1() {
        return new RequestedAirportV1();
    }

    /**
     * Create an instance of {@link RequestByRoute }
     * 
     */
    public RequestByRoute createRequestByRoute() {
        return new RequestByRoute();
    }

    /**
     * Create an instance of {@link ResponseByRoute }
     * 
     */
    public ResponseByRoute createResponseByRoute() {
        return new ResponseByRoute();
    }

    /**
     * Create an instance of {@link RequestedDate }
     * 
     */
    public RequestedDate createRequestedDate() {
        return new RequestedDate();
    }

    /**
     * Create an instance of {@link ResponseByAirport }
     * 
     */
    public ResponseByAirport createResponseByAirport() {
        return new ResponseByAirport();
    }

    /**
     * Create an instance of {@link RequestedString }
     * 
     */
    public RequestedString createRequestedString() {
        return new RequestedString();
    }

    /**
     * Create an instance of {@link ResponseByFlight }
     * 
     */
    public ResponseByFlight createResponseByFlight() {
        return new ResponseByFlight();
    }

    /**
     * Create an instance of {@link RequestByAirport }
     * 
     */
    public RequestByAirport createRequestByAirport() {
        return new RequestByAirport();
    }

    /**
     * Create an instance of {@link RequestByFlight }
     * 
     */
    public RequestByFlight createRequestByFlight() {
        return new RequestByFlight();
    }

    /**
     * Create an instance of {@link RequestedInteger }
     * 
     */
    public RequestedInteger createRequestedInteger() {
        return new RequestedInteger();
    }

    /**
     * Create an instance of {@link RequestedAirlineV1 }
     * 
     */
    public RequestedAirlineV1 createRequestedAirlineV1() {
        return new RequestedAirlineV1();
    }

    /**
     * Create an instance of {@link ResponseBase.ScheduledFlights }
     * 
     */
    public ResponseBase.ScheduledFlights createResponseBaseScheduledFlights() {
        return new ResponseBase.ScheduledFlights();
    }

    /**
     * Create an instance of {@link CodeshareV1 .ServiceClasses }
     * 
     */
    public CodeshareV1 .ServiceClasses createCodeshareV1ServiceClasses() {
        return new CodeshareV1 .ServiceClasses();
    }

    /**
     * Create an instance of {@link CodeshareV1 .TrafficRestrictions }
     * 
     */
    public CodeshareV1 .TrafficRestrictions createCodeshareV1TrafficRestrictions() {
        return new CodeshareV1 .TrafficRestrictions();
    }

    /**
     * Create an instance of {@link ScheduledFlightV1 .ServiceClasses }
     * 
     */
    public ScheduledFlightV1 .ServiceClasses createScheduledFlightV1ServiceClasses() {
        return new ScheduledFlightV1 .ServiceClasses();
    }

    /**
     * Create an instance of {@link ScheduledFlightV1 .TrafficRestrictions }
     * 
     */
    public ScheduledFlightV1 .TrafficRestrictions createScheduledFlightV1TrafficRestrictions() {
        return new ScheduledFlightV1 .TrafficRestrictions();
    }

    /**
     * Create an instance of {@link ScheduledFlightV1 .Codeshares }
     * 
     */
    public ScheduledFlightV1 .Codeshares createScheduledFlightV1Codeshares() {
        return new ScheduledFlightV1 .Codeshares();
    }

    /**
     * Create an instance of {@link Appendices.Airlines }
     * 
     */
    public Appendices.Airlines createAppendicesAirlines() {
        return new Appendices.Airlines();
    }

    /**
     * Create an instance of {@link Appendices.Airports }
     * 
     */
    public Appendices.Airports createAppendicesAirports() {
        return new Appendices.Airports();
    }

    /**
     * Create an instance of {@link Appendices.Equipments }
     * 
     */
    public Appendices.Equipments createAppendicesEquipments() {
        return new Appendices.Equipments();
    }

    /**
     * Create an instance of {@link OperatorV1 .ServiceClasses }
     * 
     */
    public OperatorV1 .ServiceClasses createOperatorV1ServiceClasses() {
        return new OperatorV1 .ServiceClasses();
    }

    /**
     * Create an instance of {@link OperatorV1 .TrafficRestrictions }
     * 
     */
    public OperatorV1 .TrafficRestrictions createOperatorV1TrafficRestrictions() {
        return new OperatorV1 .TrafficRestrictions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "response")
    public JAXBElement<Object> createResponse(Object value) {
        return new JAXBElement<Object>(_Response_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiResponseError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "apiResponseError")
    public JAXBElement<ApiResponseError> createApiResponseError(ApiResponseError value) {
        return new JAXBElement<ApiResponseError>(_ApiResponseError_QNAME, ApiResponseError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByRouteDepartingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "byRoute_DepartingResponse")
    public JAXBElement<ByRouteDepartingResponse> createByRouteDepartingResponse(ByRouteDepartingResponse value) {
        return new JAXBElement<ByRouteDepartingResponse>(_ByRouteDepartingResponse_QNAME, ByRouteDepartingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByRouteArriving }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "byRoute_Arriving")
    public JAXBElement<ByRouteArriving> createByRouteArriving(ByRouteArriving value) {
        return new JAXBElement<ByRouteArriving>(_ByRouteArriving_QNAME, ByRouteArriving.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "APIException")
    public JAXBElement<APIException> createAPIException(APIException value) {
        return new JAXBElement<APIException>(_APIException_QNAME, APIException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "airline")
    public JAXBElement<AirlineV1> createAirline(AirlineV1 value) {
        return new JAXBElement<AirlineV1>(_Airline_QNAME, AirlineV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByAirportDepartingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "byAirport_DepartingResponse")
    public JAXBElement<ByAirportDepartingResponse> createByAirportDepartingResponse(ByAirportDepartingResponse value) {
        return new JAXBElement<ByAirportDepartingResponse>(_ByAirportDepartingResponse_QNAME, ByAirportDepartingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByAirportArriving }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "byAirport_Arriving")
    public JAXBElement<ByAirportArriving> createByAirportArriving(ByAirportArriving value) {
        return new JAXBElement<ByAirportArriving>(_ByAirportArriving_QNAME, ByAirportArriving.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByFlightDeparting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "byFlight_Departing")
    public JAXBElement<ByFlightDeparting> createByFlightDeparting(ByFlightDeparting value) {
        return new JAXBElement<ByFlightDeparting>(_ByFlightDeparting_QNAME, ByFlightDeparting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Appendices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "appendix")
    public JAXBElement<Appendices> createAppendix(Appendices value) {
        return new JAXBElement<Appendices>(_Appendix_QNAME, Appendices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduledFlightV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "ScheduledFlight")
    public JAXBElement<ScheduledFlightV1> createScheduledFlight(ScheduledFlightV1 value) {
        return new JAXBElement<ScheduledFlightV1>(_ScheduledFlight_QNAME, ScheduledFlightV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "request")
    public JAXBElement<Object> createRequest(Object value) {
        return new JAXBElement<Object>(_Request_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatorV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "Operator")
    public JAXBElement<OperatorV1> createOperator(OperatorV1 value) {
        return new JAXBElement<OperatorV1>(_Operator_QNAME, OperatorV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByAirportArrivingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "byAirport_ArrivingResponse")
    public JAXBElement<ByAirportArrivingResponse> createByAirportArrivingResponse(ByAirportArrivingResponse value) {
        return new JAXBElement<ByAirportArrivingResponse>(_ByAirportArrivingResponse_QNAME, ByAirportArrivingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByFlightArriving }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "byFlight_Arriving")
    public JAXBElement<ByFlightArriving> createByFlightArriving(ByFlightArriving value) {
        return new JAXBElement<ByFlightArriving>(_ByFlightArriving_QNAME, ByFlightArriving.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByAirportDeparting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "byAirport_Departing")
    public JAXBElement<ByAirportDeparting> createByAirportDeparting(ByAirportDeparting value) {
        return new JAXBElement<ByAirportDeparting>(_ByAirportDeparting_QNAME, ByAirportDeparting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByFlightDepartingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "byFlight_DepartingResponse")
    public JAXBElement<ByFlightDepartingResponse> createByFlightDepartingResponse(ByFlightDepartingResponse value) {
        return new JAXBElement<ByFlightDepartingResponse>(_ByFlightDepartingResponse_QNAME, ByFlightDepartingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "airport")
    public JAXBElement<AirportV1> createAirport(AirportV1 value) {
        return new JAXBElement<AirportV1>(_Airport_QNAME, AirportV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByFlightArrivingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "byFlight_ArrivingResponse")
    public JAXBElement<ByFlightArrivingResponse> createByFlightArrivingResponse(ByFlightArrivingResponse value) {
        return new JAXBElement<ByFlightArrivingResponse>(_ByFlightArrivingResponse_QNAME, ByFlightArrivingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByRouteArrivingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "byRoute_ArrivingResponse")
    public JAXBElement<ByRouteArrivingResponse> createByRouteArrivingResponse(ByRouteArrivingResponse value) {
        return new JAXBElement<ByRouteArrivingResponse>(_ByRouteArrivingResponse_QNAME, ByRouteArrivingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByRouteDeparting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "byRoute_Departing")
    public JAXBElement<ByRouteDeparting> createByRouteDeparting(ByRouteDeparting value) {
        return new JAXBElement<ByRouteDeparting>(_ByRouteDeparting_QNAME, ByRouteDeparting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "equipment")
    public JAXBElement<EquipmentV1> createEquipment(EquipmentV1 value) {
        return new JAXBElement<EquipmentV1>(_Equipment_QNAME, EquipmentV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeshareV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.schedules.flightstats.com/", name = "Codeshare")
    public JAXBElement<CodeshareV1> createCodeshare(CodeshareV1 value) {
        return new JAXBElement<CodeshareV1>(_Codeshare_QNAME, CodeshareV1 .class, null, value);
    }

}
