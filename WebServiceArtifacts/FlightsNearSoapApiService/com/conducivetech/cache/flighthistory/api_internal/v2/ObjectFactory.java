
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
    private final static QName _FlightsNearRadiusResponse_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "flightsNear_radiusResponse");
    private final static QName _ApiResponseError_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "apiResponseError");
    private final static QName _FlightPosition_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "flightPosition");
    private final static QName _APIException_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "APIException");
    private final static QName _Requestbase_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "requestbase");
    private final static QName _Responseimpl_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "responseimpl");
    private final static QName _Airline_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "airline");
    private final static QName _FlightsNearBox_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "flightsNear_box");
    private final static QName _FlightsNearBoxResponse_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "flightsNear_boxResponse");
    private final static QName _Appendix_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "appendix");
    private final static QName _Flightpositionsresponse_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "flightpositionsresponse");
    private final static QName _FlightsNearRadius_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "flightsNear_radius");
    private final static QName _Request_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "request");
    private final static QName _Airport_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "airport");
    private final static QName _Equipment_QNAME = new QName("http://v2.api_internal.flighthistory.cache.conducivetech.com/", "equipment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.conducivetech.cache.flighthistory.api_internal.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlightPositionV2 }
     * 
     */
    public FlightPositionV2 createFlightPositionV2() {
        return new FlightPositionV2();
    }

    /**
     * Create an instance of {@link Appendices }
     * 
     */
    public Appendices createAppendices() {
        return new Appendices();
    }

    /**
     * Create an instance of {@link FlightsNearRadius }
     * 
     */
    public FlightsNearRadius createFlightsNearRadius() {
        return new FlightsNearRadius();
    }

    /**
     * Create an instance of {@link EquipmentV1 }
     * 
     */
    public EquipmentV1 createEquipmentV1() {
        return new EquipmentV1();
    }

    /**
     * Create an instance of {@link AirportV1 }
     * 
     */
    public AirportV1 createAirportV1() {
        return new AirportV1();
    }

    /**
     * Create an instance of {@link FlightsNearRadiusResponse }
     * 
     */
    public FlightsNearRadiusResponse createFlightsNearRadiusResponse() {
        return new FlightsNearRadiusResponse();
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
     * Create an instance of {@link FlightsNearBox }
     * 
     */
    public FlightsNearBox createFlightsNearBox() {
        return new FlightsNearBox();
    }

    /**
     * Create an instance of {@link FlightsNearBoxResponse }
     * 
     */
    public FlightsNearBoxResponse createFlightsNearBoxResponse() {
        return new FlightsNearBoxResponse();
    }

    /**
     * Create an instance of {@link AirlineV1 }
     * 
     */
    public AirlineV1 createAirlineV1() {
        return new AirlineV1();
    }

    /**
     * Create an instance of {@link RequestedDouble }
     * 
     */
    public RequestedDouble createRequestedDouble() {
        return new RequestedDouble();
    }

    /**
     * Create an instance of {@link RequestFlightsNearRadius }
     * 
     */
    public RequestFlightsNearRadius createRequestFlightsNearRadius() {
        return new RequestFlightsNearRadius();
    }

    /**
     * Create an instance of {@link RequestedString }
     * 
     */
    public RequestedString createRequestedString() {
        return new RequestedString();
    }

    /**
     * Create an instance of {@link RequestFlightsNearBox }
     * 
     */
    public RequestFlightsNearBox createRequestFlightsNearBox() {
        return new RequestFlightsNearBox();
    }

    /**
     * Create an instance of {@link ResponseFlightsNearRadius }
     * 
     */
    public ResponseFlightsNearRadius createResponseFlightsNearRadius() {
        return new ResponseFlightsNearRadius();
    }

    /**
     * Create an instance of {@link ResponseFlightsNearBox }
     * 
     */
    public ResponseFlightsNearBox createResponseFlightsNearBox() {
        return new ResponseFlightsNearBox();
    }

    /**
     * Create an instance of {@link PositionV2 }
     * 
     */
    public PositionV2 createPositionV2() {
        return new PositionV2();
    }

    /**
     * Create an instance of {@link RequestedInteger }
     * 
     */
    public RequestedInteger createRequestedInteger() {
        return new RequestedInteger();
    }

    /**
     * Create an instance of {@link FlightPositionResponse.FlightPositions }
     * 
     */
    public FlightPositionResponse.FlightPositions createFlightPositionResponseFlightPositions() {
        return new FlightPositionResponse.FlightPositions();
    }

    /**
     * Create an instance of {@link FlightPositionV2 .Positions }
     * 
     */
    public FlightPositionV2 .Positions createFlightPositionV2Positions() {
        return new FlightPositionV2 .Positions();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightsNearRadiusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "flightsNear_radiusResponse")
    public JAXBElement<FlightsNearRadiusResponse> createFlightsNearRadiusResponse(FlightsNearRadiusResponse value) {
        return new JAXBElement<FlightsNearRadiusResponse>(_FlightsNearRadiusResponse_QNAME, FlightsNearRadiusResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightPositionV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "flightPosition")
    public JAXBElement<FlightPositionV2> createFlightPosition(FlightPositionV2 value) {
        return new JAXBElement<FlightPositionV2>(_FlightPosition_QNAME, FlightPositionV2 .class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "requestbase")
    public JAXBElement<RequestBase> createRequestbase(RequestBase value) {
        return new JAXBElement<RequestBase>(_Requestbase_QNAME, RequestBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "responseimpl")
    public JAXBElement<ResponseImpl> createResponseimpl(ResponseImpl value) {
        return new JAXBElement<ResponseImpl>(_Responseimpl_QNAME, ResponseImpl.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightsNearBox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "flightsNear_box")
    public JAXBElement<FlightsNearBox> createFlightsNearBox(FlightsNearBox value) {
        return new JAXBElement<FlightsNearBox>(_FlightsNearBox_QNAME, FlightsNearBox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightsNearBoxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "flightsNear_boxResponse")
    public JAXBElement<FlightsNearBoxResponse> createFlightsNearBoxResponse(FlightsNearBoxResponse value) {
        return new JAXBElement<FlightsNearBoxResponse>(_FlightsNearBoxResponse_QNAME, FlightsNearBoxResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightPositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "flightpositionsresponse")
    public JAXBElement<FlightPositionResponse> createFlightpositionsresponse(FlightPositionResponse value) {
        return new JAXBElement<FlightPositionResponse>(_Flightpositionsresponse_QNAME, FlightPositionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightsNearRadius }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v2.api_internal.flighthistory.cache.conducivetech.com/", name = "flightsNear_radius")
    public JAXBElement<FlightsNearRadius> createFlightsNearRadius(FlightsNearRadius value) {
        return new JAXBElement<FlightsNearRadius>(_FlightsNearRadius_QNAME, FlightsNearRadius.class, null, value);
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

}
