
package com.conducivetech.cache.delayindex.service.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.conducivetech.cache.delayindex.service.v1 package. 
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

    private final static QName _ForCountryResponse_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "forCountryResponse");
    private final static QName _ForRegion_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "forRegion");
    private final static QName _Request_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "request");
    private final static QName _Airport_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "airport");
    private final static QName _ForAirportResponse_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "forAirportResponse");
    private final static QName _ForRegionResponse_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "forRegionResponse");
    private final static QName _ForCountry_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "forCountry");
    private final static QName _ForStateResponse_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "forStateResponse");
    private final static QName _Response_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "response");
    private final static QName _APIException_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "APIException");
    private final static QName _ForState_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "forState");
    private final static QName _DelayIndex_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "delayIndex");
    private final static QName _ApiResponseError_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "apiResponseError");
    private final static QName _ForAirport_QNAME = new QName("http://v1.service.delayindex.cache.conducivetech.com/", "forAirport");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.conducivetech.cache.delayindex.service.v1
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
     * Create an instance of {@link RequestAirports }
     * 
     */
    public RequestAirports createRequestAirports() {
        return new RequestAirports();
    }

    /**
     * Create an instance of {@link ForCountryResponse }
     * 
     */
    public ForCountryResponse createForCountryResponse() {
        return new ForCountryResponse();
    }

    /**
     * Create an instance of {@link ForRegion }
     * 
     */
    public ForRegion createForRegion() {
        return new ForRegion();
    }

    /**
     * Create an instance of {@link ForCountry }
     * 
     */
    public ForCountry createForCountry() {
        return new ForCountry();
    }

    /**
     * Create an instance of {@link ForRegionResponse }
     * 
     */
    public ForRegionResponse createForRegionResponse() {
        return new ForRegionResponse();
    }

    /**
     * Create an instance of {@link AirportV1 }
     * 
     */
    public AirportV1 createAirportV1() {
        return new AirportV1();
    }

    /**
     * Create an instance of {@link ForAirportResponse }
     * 
     */
    public ForAirportResponse createForAirportResponse() {
        return new ForAirportResponse();
    }

    /**
     * Create an instance of {@link ForAirport }
     * 
     */
    public ForAirport createForAirport() {
        return new ForAirport();
    }

    /**
     * Create an instance of {@link ApiResponseError }
     * 
     */
    public ApiResponseError createApiResponseError() {
        return new ApiResponseError();
    }

    /**
     * Create an instance of {@link DelayIndexV1 }
     * 
     */
    public DelayIndexV1 createDelayIndexV1() {
        return new DelayIndexV1();
    }

    /**
     * Create an instance of {@link APIException }
     * 
     */
    public APIException createAPIException() {
        return new APIException();
    }

    /**
     * Create an instance of {@link ForState }
     * 
     */
    public ForState createForState() {
        return new ForState();
    }

    /**
     * Create an instance of {@link ForStateResponse }
     * 
     */
    public ForStateResponse createForStateResponse() {
        return new ForStateResponse();
    }

    /**
     * Create an instance of {@link RequestBase }
     * 
     */
    public RequestBase createRequestBase() {
        return new RequestBase();
    }

    /**
     * Create an instance of {@link RequestedDouble }
     * 
     */
    public RequestedDouble createRequestedDouble() {
        return new RequestedDouble();
    }

    /**
     * Create an instance of {@link RequestedAirportV1 }
     * 
     */
    public RequestedAirportV1 createRequestedAirportV1() {
        return new RequestedAirportV1();
    }

    /**
     * Create an instance of {@link RequestState }
     * 
     */
    public RequestState createRequestState() {
        return new RequestState();
    }

    /**
     * Create an instance of {@link ResponseState }
     * 
     */
    public ResponseState createResponseState() {
        return new ResponseState();
    }

    /**
     * Create an instance of {@link RequestedEnum }
     * 
     */
    public RequestedEnum createRequestedEnum() {
        return new RequestedEnum();
    }

    /**
     * Create an instance of {@link RequestedString }
     * 
     */
    public RequestedString createRequestedString() {
        return new RequestedString();
    }

    /**
     * Create an instance of {@link ResponseAirports }
     * 
     */
    public ResponseAirports createResponseAirports() {
        return new ResponseAirports();
    }

    /**
     * Create an instance of {@link ResponseRegion }
     * 
     */
    public ResponseRegion createResponseRegion() {
        return new ResponseRegion();
    }

    /**
     * Create an instance of {@link ResponseCountry }
     * 
     */
    public ResponseCountry createResponseCountry() {
        return new ResponseCountry();
    }

    /**
     * Create an instance of {@link RequestCountry }
     * 
     */
    public RequestCountry createRequestCountry() {
        return new RequestCountry();
    }

    /**
     * Create an instance of {@link RequestRegion }
     * 
     */
    public RequestRegion createRequestRegion() {
        return new RequestRegion();
    }

    /**
     * Create an instance of {@link RequestedInteger }
     * 
     */
    public RequestedInteger createRequestedInteger() {
        return new RequestedInteger();
    }

    /**
     * Create an instance of {@link ResponseBase.DelayIndexes }
     * 
     */
    public ResponseBase.DelayIndexes createResponseBaseDelayIndexes() {
        return new ResponseBase.DelayIndexes();
    }

    /**
     * Create an instance of {@link RequestAirports.AirportCodes }
     * 
     */
    public RequestAirports.AirportCodes createRequestAirportsAirportCodes() {
        return new RequestAirports.AirportCodes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "forCountryResponse")
    public JAXBElement<ForCountryResponse> createForCountryResponse(ForCountryResponse value) {
        return new JAXBElement<ForCountryResponse>(_ForCountryResponse_QNAME, ForCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "forRegion")
    public JAXBElement<ForRegion> createForRegion(ForRegion value) {
        return new JAXBElement<ForRegion>(_ForRegion_QNAME, ForRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "request")
    public JAXBElement<Object> createRequest(Object value) {
        return new JAXBElement<Object>(_Request_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "airport")
    public JAXBElement<AirportV1> createAirport(AirportV1 value) {
        return new JAXBElement<AirportV1>(_Airport_QNAME, AirportV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForAirportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "forAirportResponse")
    public JAXBElement<ForAirportResponse> createForAirportResponse(ForAirportResponse value) {
        return new JAXBElement<ForAirportResponse>(_ForAirportResponse_QNAME, ForAirportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForRegionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "forRegionResponse")
    public JAXBElement<ForRegionResponse> createForRegionResponse(ForRegionResponse value) {
        return new JAXBElement<ForRegionResponse>(_ForRegionResponse_QNAME, ForRegionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "forCountry")
    public JAXBElement<ForCountry> createForCountry(ForCountry value) {
        return new JAXBElement<ForCountry>(_ForCountry_QNAME, ForCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "forStateResponse")
    public JAXBElement<ForStateResponse> createForStateResponse(ForStateResponse value) {
        return new JAXBElement<ForStateResponse>(_ForStateResponse_QNAME, ForStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "response")
    public JAXBElement<Object> createResponse(Object value) {
        return new JAXBElement<Object>(_Response_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "APIException")
    public JAXBElement<APIException> createAPIException(APIException value) {
        return new JAXBElement<APIException>(_APIException_QNAME, APIException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "forState")
    public JAXBElement<ForState> createForState(ForState value) {
        return new JAXBElement<ForState>(_ForState_QNAME, ForState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelayIndexV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "delayIndex")
    public JAXBElement<DelayIndexV1> createDelayIndex(DelayIndexV1 value) {
        return new JAXBElement<DelayIndexV1>(_DelayIndex_QNAME, DelayIndexV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiResponseError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "apiResponseError")
    public JAXBElement<ApiResponseError> createApiResponseError(ApiResponseError value) {
        return new JAXBElement<ApiResponseError>(_ApiResponseError_QNAME, ApiResponseError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForAirport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.delayindex.cache.conducivetech.com/", name = "forAirport")
    public JAXBElement<ForAirport> createForAirport(ForAirport value) {
        return new JAXBElement<ForAirport>(_ForAirport_QNAME, ForAirport.class, null, value);
    }

}
