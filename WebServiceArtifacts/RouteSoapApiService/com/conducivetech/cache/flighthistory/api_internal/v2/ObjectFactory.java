
package com.conducivetech.cache.flighthistory.api_internal.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.conducivetech.cache.flighthistory.api_internal.v2 package. 
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

    private final static QName _Response_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "response");
    private final static QName _ApiResponseError_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "apiResponseError");
    private final static QName _APIException_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "APIException");
    private final static QName _RouteStatusArrivingResponse_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "routeStatus_arrivingResponse");
    private final static QName _Airline_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "airline");
    private final static QName _Appendix_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "appendix");
    private final static QName _Request_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "request");
    private final static QName _Airport_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "airport");
    private final static QName _Equipment_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "equipment");
    private final static QName _FlightStatus_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "flightStatus");
    private final static QName _RouteStatusDeparting_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "routeStatus_departing");
    private final static QName _RouteStatusArriving_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "routeStatus_arriving");
    private final static QName _RouteStatusDepartingResponse_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "routeStatus_departingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.conducivetech.cache.flighthistory.api_internal.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScheduleDataV2 }
     * 
     */
    public ScheduleDataV2 createScheduleDataV2() {
        return new ScheduleDataV2();
    }

    /**
     * Create an instance of {@link FlightStatusUpdateV2 }
     * 
     */
    public FlightStatusUpdateV2 createFlightStatusUpdateV2() {
        return new FlightStatusUpdateV2();
    }

    /**
     * Create an instance of {@link FlightStatusV2 }
     * 
     */
    public FlightStatusV2 createFlightStatusV2() {
        return new FlightStatusV2();
    }

    /**
     * Create an instance of {@link Appendices }
     * 
     */
    public Appendices createAppendices() {
        return new Appendices();
    }

    /**
     * Create an instance of {@link EquipmentV1 }
     * 
     */
    public EquipmentV1 createEquipmentV1() {
        return new EquipmentV1();
    }

    /**
     * Create an instance of {@link RouteStatusDeparting }
     * 
     */
    public RouteStatusDeparting createRouteStatusDeparting() {
        return new RouteStatusDeparting();
    }

    /**
     * Create an instance of {@link RouteStatusArriving }
     * 
     */
    public RouteStatusArriving createRouteStatusArriving() {
        return new RouteStatusArriving();
    }

    /**
     * Create an instance of {@link RouteStatusDepartingResponse }
     * 
     */
    public RouteStatusDepartingResponse createRouteStatusDepartingResponse() {
        return new RouteStatusDepartingResponse();
    }

    /**
     * Create an instance of {@link AirportV1 }
     * 
     */
    public AirportV1 createAirportV1() {
        return new AirportV1();
    }

    /**
     * Create an instance of {@link ApiResponseError }
     * 
     */
    public ApiResponseError createApiResponseError() {
        return new ApiResponseError();
    }

    /**
     * Create an instance of {@link APIException }
     * 
     */
    public APIException createAPIException() {
        return new APIException();
    }

    /**
     * Create an instance of {@link RouteStatusArrivingResponse }
     * 
     */
    public RouteStatusArrivingResponse createRouteStatusArrivingResponse() {
        return new RouteStatusArrivingResponse();
    }

    /**
     * Create an instance of {@link AirlineV1 }
     * 
     */
    public AirlineV1 createAirlineV1() {
        return new AirlineV1();
    }

    /**
     * Create an instance of {@link FlightEquipmentV2 }
     * 
     */
    public FlightEquipmentV2 createFlightEquipmentV2() {
        return new FlightEquipmentV2();
    }

    /**
     * Create an instance of {@link UplineFlightV2 }
     * 
     */
    public UplineFlightV2 createUplineFlightV2() {
        return new UplineFlightV2();
    }

    /**
     * Create an instance of {@link FlightStatusUpdatedTextV2 }
     * 
     */
    public FlightStatusUpdatedTextV2 createFlightStatusUpdatedTextV2() {
        return new FlightStatusUpdatedTextV2();
    }

    /**
     * Create an instance of {@link ResponseRouteStatus }
     * 
     */
    public ResponseRouteStatus createResponseRouteStatus() {
        return new ResponseRouteStatus();
    }

    /**
     * Create an instance of {@link RequestedAirportV1 }
     * 
     */
    public RequestedAirportV1 createRequestedAirportV1() {
        return new RequestedAirportV1();
    }

    /**
     * Create an instance of {@link DelaysV2 }
     * 
     */
    public DelaysV2 createDelaysV2() {
        return new DelaysV2();
    }

    /**
     * Create an instance of {@link DownlineFlightV2 }
     * 
     */
    public DownlineFlightV2 createDownlineFlightV2() {
        return new DownlineFlightV2();
    }

    /**
     * Create an instance of {@link AirportResourcesV2 }
     * 
     */
    public AirportResourcesV2 createAirportResourcesV2() {
        return new AirportResourcesV2();
    }

    /**
     * Create an instance of {@link DateInfoV2 }
     * 
     */
    public DateInfoV2 createDateInfoV2() {
        return new DateInfoV2();
    }

    /**
     * Create an instance of {@link OperationalTimesV2 }
     * 
     */
    public OperationalTimesV2 createOperationalTimesV2() {
        return new OperationalTimesV2();
    }

    /**
     * Create an instance of {@link RequestedDate }
     * 
     */
    public RequestedDate createRequestedDate() {
        return new RequestedDate();
    }

    /**
     * Create an instance of {@link CodeshareV2 }
     * 
     */
    public CodeshareV2 createCodeshareV2() {
        return new CodeshareV2();
    }

    /**
     * Create an instance of {@link RequestedString }
     * 
     */
    public RequestedString createRequestedString() {
        return new RequestedString();
    }

    /**
     * Create an instance of {@link RequestedBoolean }
     * 
     */
    public RequestedBoolean createRequestedBoolean() {
        return new RequestedBoolean();
    }

    /**
     * Create an instance of {@link RequestedInteger }
     * 
     */
    public RequestedInteger createRequestedInteger() {
        return new RequestedInteger();
    }

    /**
     * Create an instance of {@link FlightDurationsV2 }
     * 
     */
    public FlightDurationsV2 createFlightDurationsV2() {
        return new FlightDurationsV2();
    }

    /**
     * Create an instance of {@link RequestRouteStatus }
     * 
     */
    public RequestRouteStatus createRequestRouteStatus() {
        return new RequestRouteStatus();
    }

    /**
     * Create an instance of {@link FlightStatusUpdatedDateV2 }
     * 
     */
    public FlightStatusUpdatedDateV2 createFlightStatusUpdatedDateV2() {
        return new FlightStatusUpdatedDateV2();
    }

    /**
     * Create an instance of {@link ScheduleDataV2 .Uplines }
     * 
     */
    public ScheduleDataV2 .Uplines createScheduleDataV2Uplines() {
        return new ScheduleDataV2 .Uplines();
    }

    /**
     * Create an instance of {@link ScheduleDataV2 .Downlines }
     * 
     */
    public ScheduleDataV2 .Downlines createScheduleDataV2Downlines() {
        return new ScheduleDataV2 .Downlines();
    }

    /**
     * Create an instance of {@link FlightStatusUpdateV2 .UpdatedTextFields }
     * 
     */
    public FlightStatusUpdateV2 .UpdatedTextFields createFlightStatusUpdateV2UpdatedTextFields() {
        return new FlightStatusUpdateV2 .UpdatedTextFields();
    }

    /**
     * Create an instance of {@link FlightStatusUpdateV2 .UpdatedDateFields }
     * 
     */
    public FlightStatusUpdateV2 .UpdatedDateFields createFlightStatusUpdateV2UpdatedDateFields() {
        return new FlightStatusUpdateV2 .UpdatedDateFields();
    }

    /**
     * Create an instance of {@link com.conducivetech.cache.flighthistory.api_internal.v2.FlightStatusesResponse.FlightStatuses }
     * 
     */
    public com.conducivetech.cache.flighthistory.api_internal.v2.FlightStatusesResponse.FlightStatuses createFlightStatusesResponseFlightStatuses() {
        return new com.conducivetech.cache.flighthistory.api_internal.v2.FlightStatusesResponse.FlightStatuses();
    }

    /**
     * Create an instance of {@link FlightStatusV2 .Codeshares }
     * 
     */
    public FlightStatusV2 .Codeshares createFlightStatusV2Codeshares() {
        return new FlightStatusV2 .Codeshares();
    }

    /**
     * Create an instance of {@link FlightStatusV2 .FlightStatusUpdates }
     * 
     */
    public FlightStatusV2 .FlightStatusUpdates createFlightStatusV2FlightStatusUpdates() {
        return new FlightStatusV2 .FlightStatusUpdates();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "response")
    public JAXBElement<Object> createResponse(Object value) {
        return new JAXBElement<Object>(_Response_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiResponseError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "apiResponseError")
    public JAXBElement<ApiResponseError> createApiResponseError(ApiResponseError value) {
        return new JAXBElement<ApiResponseError>(_ApiResponseError_QNAME, ApiResponseError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "APIException")
    public JAXBElement<APIException> createAPIException(APIException value) {
        return new JAXBElement<APIException>(_APIException_QNAME, APIException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteStatusArrivingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "routeStatus_arrivingResponse")
    public JAXBElement<RouteStatusArrivingResponse> createRouteStatusArrivingResponse(RouteStatusArrivingResponse value) {
        return new JAXBElement<RouteStatusArrivingResponse>(_RouteStatusArrivingResponse_QNAME, RouteStatusArrivingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "airline")
    public JAXBElement<AirlineV1> createAirline(AirlineV1 value) {
        return new JAXBElement<AirlineV1>(_Airline_QNAME, AirlineV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Appendices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "appendix")
    public JAXBElement<Appendices> createAppendix(Appendices value) {
        return new JAXBElement<Appendices>(_Appendix_QNAME, Appendices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "request")
    public JAXBElement<Object> createRequest(Object value) {
        return new JAXBElement<Object>(_Request_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "airport")
    public JAXBElement<AirportV1> createAirport(AirportV1 value) {
        return new JAXBElement<AirportV1>(_Airport_QNAME, AirportV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "equipment")
    public JAXBElement<EquipmentV1> createEquipment(EquipmentV1 value) {
        return new JAXBElement<EquipmentV1>(_Equipment_QNAME, EquipmentV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightStatusV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "flightStatus")
    public JAXBElement<FlightStatusV2> createFlightStatus(FlightStatusV2 value) {
        return new JAXBElement<FlightStatusV2>(_FlightStatus_QNAME, FlightStatusV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteStatusDeparting }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "routeStatus_departing")
    public JAXBElement<RouteStatusDeparting> createRouteStatusDeparting(RouteStatusDeparting value) {
        return new JAXBElement<RouteStatusDeparting>(_RouteStatusDeparting_QNAME, RouteStatusDeparting.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteStatusArriving }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "routeStatus_arriving")
    public JAXBElement<RouteStatusArriving> createRouteStatusArriving(RouteStatusArriving value) {
        return new JAXBElement<RouteStatusArriving>(_RouteStatusArriving_QNAME, RouteStatusArriving.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteStatusDepartingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "routeStatus_departingResponse")
    public JAXBElement<RouteStatusDepartingResponse> createRouteStatusDepartingResponse(RouteStatusDepartingResponse value) {
        return new JAXBElement<RouteStatusDepartingResponse>(_RouteStatusDepartingResponse_QNAME, RouteStatusDepartingResponse.class, null, value);
    }

}
