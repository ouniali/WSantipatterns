
package com.conducivetech.cache.ratings.service.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.conducivetech.cache.ratings.service.v1 package. 
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

    private final static QName _Rating_QNAME = new QName("http://v1.service.ratings.cache.conducivetech.com/", "rating");
    private final static QName _ByFlightResponse_QNAME = new QName("http://v1.service.ratings.cache.conducivetech.com/", "byFlightResponse");
    private final static QName _Airline_QNAME = new QName("http://v1.service.ratings.cache.conducivetech.com/", "airline");
    private final static QName _ByFlight_QNAME = new QName("http://v1.service.ratings.cache.conducivetech.com/", "byFlight");
    private final static QName _ByRouteResponse_QNAME = new QName("http://v1.service.ratings.cache.conducivetech.com/", "byRouteResponse");
    private final static QName _Airport_QNAME = new QName("http://v1.service.ratings.cache.conducivetech.com/", "airport");
    private final static QName _ApiResponseError_QNAME = new QName("http://v1.service.ratings.cache.conducivetech.com/", "apiResponseError");
    private final static QName _Request_QNAME = new QName("http://v1.service.ratings.cache.conducivetech.com/", "request");
    private final static QName _APIException_QNAME = new QName("http://v1.service.ratings.cache.conducivetech.com/", "APIException");
    private final static QName _Appendix_QNAME = new QName("http://v1.service.ratings.cache.conducivetech.com/", "appendix");
    private final static QName _ByRoute_QNAME = new QName("http://v1.service.ratings.cache.conducivetech.com/", "byRoute");
    private final static QName _Response_QNAME = new QName("http://v1.service.ratings.cache.conducivetech.com/", "response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.conducivetech.cache.ratings.service.v1
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
     * Create an instance of {@link Appendices }
     * 
     */
    public Appendices createAppendices() {
        return new Appendices();
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
     * Create an instance of {@link ByRoute }
     * 
     */
    public ByRoute createByRoute() {
        return new ByRoute();
    }

    /**
     * Create an instance of {@link RatingV1 }
     * 
     */
    public RatingV1 createRatingV1() {
        return new RatingV1();
    }

    /**
     * Create an instance of {@link ByFlightResponse }
     * 
     */
    public ByFlightResponse createByFlightResponse() {
        return new ByFlightResponse();
    }

    /**
     * Create an instance of {@link AirlineV1 }
     * 
     */
    public AirlineV1 createAirlineV1() {
        return new AirlineV1();
    }

    /**
     * Create an instance of {@link ByFlight }
     * 
     */
    public ByFlight createByFlight() {
        return new ByFlight();
    }

    /**
     * Create an instance of {@link ByRouteResponse }
     * 
     */
    public ByRouteResponse createByRouteResponse() {
        return new ByRouteResponse();
    }

    /**
     * Create an instance of {@link AirportV1 }
     * 
     */
    public AirportV1 createAirportV1() {
        return new AirportV1();
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
     * Create an instance of {@link RequestedFlightNumber }
     * 
     */
    public RequestedFlightNumber createRequestedFlightNumber() {
        return new RequestedFlightNumber();
    }

    /**
     * Create an instance of {@link RequestedString }
     * 
     */
    public RequestedString createRequestedString() {
        return new RequestedString();
    }

    /**
     * Create an instance of {@link RequestRoute }
     * 
     */
    public RequestRoute createRequestRoute() {
        return new RequestRoute();
    }

    /**
     * Create an instance of {@link ResponseRoute }
     * 
     */
    public ResponseRoute createResponseRoute() {
        return new ResponseRoute();
    }

    /**
     * Create an instance of {@link ResponseFlight }
     * 
     */
    public ResponseFlight createResponseFlight() {
        return new ResponseFlight();
    }

    /**
     * Create an instance of {@link RequestFlight }
     * 
     */
    public RequestFlight createRequestFlight() {
        return new RequestFlight();
    }

    /**
     * Create an instance of {@link RequestedAirlineV1 }
     * 
     */
    public RequestedAirlineV1 createRequestedAirlineV1() {
        return new RequestedAirlineV1();
    }

    /**
     * Create an instance of {@link ResponseBase.Ratings }
     * 
     */
    public ResponseBase.Ratings createResponseBaseRatings() {
        return new ResponseBase.Ratings();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RatingV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.ratings.cache.conducivetech.com/", name = "rating")
    public JAXBElement<RatingV1> createRating(RatingV1 value) {
        return new JAXBElement<RatingV1>(_Rating_QNAME, RatingV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.ratings.cache.conducivetech.com/", name = "byFlightResponse")
    public JAXBElement<ByFlightResponse> createByFlightResponse(ByFlightResponse value) {
        return new JAXBElement<ByFlightResponse>(_ByFlightResponse_QNAME, ByFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.ratings.cache.conducivetech.com/", name = "airline")
    public JAXBElement<AirlineV1> createAirline(AirlineV1 value) {
        return new JAXBElement<AirlineV1>(_Airline_QNAME, AirlineV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.ratings.cache.conducivetech.com/", name = "byFlight")
    public JAXBElement<ByFlight> createByFlight(ByFlight value) {
        return new JAXBElement<ByFlight>(_ByFlight_QNAME, ByFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByRouteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.ratings.cache.conducivetech.com/", name = "byRouteResponse")
    public JAXBElement<ByRouteResponse> createByRouteResponse(ByRouteResponse value) {
        return new JAXBElement<ByRouteResponse>(_ByRouteResponse_QNAME, ByRouteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.ratings.cache.conducivetech.com/", name = "airport")
    public JAXBElement<AirportV1> createAirport(AirportV1 value) {
        return new JAXBElement<AirportV1>(_Airport_QNAME, AirportV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiResponseError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.ratings.cache.conducivetech.com/", name = "apiResponseError")
    public JAXBElement<ApiResponseError> createApiResponseError(ApiResponseError value) {
        return new JAXBElement<ApiResponseError>(_ApiResponseError_QNAME, ApiResponseError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.ratings.cache.conducivetech.com/", name = "request")
    public JAXBElement<Object> createRequest(Object value) {
        return new JAXBElement<Object>(_Request_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.ratings.cache.conducivetech.com/", name = "APIException")
    public JAXBElement<APIException> createAPIException(APIException value) {
        return new JAXBElement<APIException>(_APIException_QNAME, APIException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Appendices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.ratings.cache.conducivetech.com/", name = "appendix")
    public JAXBElement<Appendices> createAppendix(Appendices value) {
        return new JAXBElement<Appendices>(_Appendix_QNAME, Appendices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.ratings.cache.conducivetech.com/", name = "byRoute")
    public JAXBElement<ByRoute> createByRoute(ByRoute value) {
        return new JAXBElement<ByRoute>(_ByRoute_QNAME, ByRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.ratings.cache.conducivetech.com/", name = "response")
    public JAXBElement<Object> createResponse(Object value) {
        return new JAXBElement<Object>(_Response_QNAME, Object.class, null, value);
    }

}
