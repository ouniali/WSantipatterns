
package com.flightstats.weather.service.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.flightstats.weather.service.v1 package. 
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

    private final static QName _Airport_QNAME = new QName("http://v1.service.weather.flightstats.com/", "airport");
    private final static QName _ZoneForecast_QNAME = new QName("http://v1.service.weather.flightstats.com/", "zoneForecast");
    private final static QName _Appendix_QNAME = new QName("http://v1.service.weather.flightstats.com/", "appendix");
    private final static QName _ZoneForecastsResponse_QNAME = new QName("http://v1.service.weather.flightstats.com/", "zoneForecastsResponse");
    private final static QName _Request_QNAME = new QName("http://v1.service.weather.flightstats.com/", "request");
    private final static QName _All_QNAME = new QName("http://v1.service.weather.flightstats.com/", "all");
    private final static QName _MetarForAirportResponse_QNAME = new QName("http://v1.service.weather.flightstats.com/", "metar_for_airportResponse");
    private final static QName _ZoneForecasts_QNAME = new QName("http://v1.service.weather.flightstats.com/", "zoneForecasts");
    private final static QName _Metar_QNAME = new QName("http://v1.service.weather.flightstats.com/", "metar");
    private final static QName _TafForAirportResponse_QNAME = new QName("http://v1.service.weather.flightstats.com/", "taf_for_airportResponse");
    private final static QName _MetarForAirport_QNAME = new QName("http://v1.service.weather.flightstats.com/", "metar_for_airport");
    private final static QName _Taf_QNAME = new QName("http://v1.service.weather.flightstats.com/", "taf");
    private final static QName _TafForAirport_QNAME = new QName("http://v1.service.weather.flightstats.com/", "taf_for_airport");
    private final static QName _Response_QNAME = new QName("http://v1.service.weather.flightstats.com/", "response");
    private final static QName _AllResponse_QNAME = new QName("http://v1.service.weather.flightstats.com/", "allResponse");
    private final static QName _ApiResponseError_QNAME = new QName("http://v1.service.weather.flightstats.com/", "apiResponseError");
    private final static QName _APIException_QNAME = new QName("http://v1.service.weather.flightstats.com/", "APIException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.flightstats.weather.service.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DayForecastV1 }
     * 
     */
    public DayForecastV1 createDayForecastV1() {
        return new DayForecastV1();
    }

    /**
     * Create an instance of {@link ConditionsV1 }
     * 
     */
    public ConditionsV1 createConditionsV1() {
        return new ConditionsV1();
    }

    /**
     * Create an instance of {@link TafV1 }
     * 
     */
    public TafV1 createTafV1() {
        return new TafV1();
    }

    /**
     * Create an instance of {@link ZoneForecastV1 }
     * 
     */
    public ZoneForecastV1 createZoneForecastV1() {
        return new ZoneForecastV1();
    }

    /**
     * Create an instance of {@link Appendices }
     * 
     */
    public Appendices createAppendices() {
        return new Appendices();
    }

    /**
     * Create an instance of {@link MetarV1 }
     * 
     */
    public MetarV1 createMetarV1() {
        return new MetarV1();
    }

    /**
     * Create an instance of {@link All }
     * 
     */
    public All createAll() {
        return new All();
    }

    /**
     * Create an instance of {@link WeatherRequestBaseV1 }
     * 
     */
    public WeatherRequestBaseV1 createWeatherRequestBaseV1() {
        return new WeatherRequestBaseV1();
    }

    /**
     * Create an instance of {@link MetarForAirportResponse }
     * 
     */
    public MetarForAirportResponse createMetarForAirportResponse() {
        return new MetarForAirportResponse();
    }

    /**
     * Create an instance of {@link ZoneForecasts }
     * 
     */
    public ZoneForecasts createZoneForecasts() {
        return new ZoneForecasts();
    }

    /**
     * Create an instance of {@link ZoneForecastsResponse }
     * 
     */
    public ZoneForecastsResponse createZoneForecastsResponse() {
        return new ZoneForecastsResponse();
    }

    /**
     * Create an instance of {@link AirportV1 }
     * 
     */
    public AirportV1 createAirportV1() {
        return new AirportV1();
    }

    /**
     * Create an instance of {@link AllResponse }
     * 
     */
    public AllResponse createAllResponse() {
        return new AllResponse();
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
     * Create an instance of {@link TafForAirport }
     * 
     */
    public TafForAirport createTafForAirport() {
        return new TafForAirport();
    }

    /**
     * Create an instance of {@link MetarForAirport }
     * 
     */
    public MetarForAirport createMetarForAirport() {
        return new MetarForAirport();
    }

    /**
     * Create an instance of {@link TafForAirportResponse }
     * 
     */
    public TafForAirportResponse createTafForAirportResponse() {
        return new TafForAirportResponse();
    }

    /**
     * Create an instance of {@link VisibilityV1 }
     * 
     */
    public VisibilityV1 createVisibilityV1() {
        return new VisibilityV1();
    }

    /**
     * Create an instance of {@link RequestedAirportV1 }
     * 
     */
    public RequestedAirportV1 createRequestedAirportV1() {
        return new RequestedAirportV1();
    }

    /**
     * Create an instance of {@link ZoneForecastResponseV1 }
     * 
     */
    public ZoneForecastResponseV1 createZoneForecastResponseV1() {
        return new ZoneForecastResponseV1();
    }

    /**
     * Create an instance of {@link MetarResponseV1 }
     * 
     */
    public MetarResponseV1 createMetarResponseV1() {
        return new MetarResponseV1();
    }

    /**
     * Create an instance of {@link ForecastV1 }
     * 
     */
    public ForecastV1 createForecastV1() {
        return new ForecastV1();
    }

    /**
     * Create an instance of {@link SkyConditionV1 }
     * 
     */
    public SkyConditionV1 createSkyConditionV1() {
        return new SkyConditionV1();
    }

    /**
     * Create an instance of {@link TagV1 }
     * 
     */
    public TagV1 createTagV1() {
        return new TagV1();
    }

    /**
     * Create an instance of {@link RequestedString }
     * 
     */
    public RequestedString createRequestedString() {
        return new RequestedString();
    }

    /**
     * Create an instance of {@link WindV1 }
     * 
     */
    public WindV1 createWindV1() {
        return new WindV1();
    }

    /**
     * Create an instance of {@link AllWeatherResponseV1 }
     * 
     */
    public AllWeatherResponseV1 createAllWeatherResponseV1() {
        return new AllWeatherResponseV1();
    }

    /**
     * Create an instance of {@link TafResponseV1 }
     * 
     */
    public TafResponseV1 createTafResponseV1() {
        return new TafResponseV1();
    }

    /**
     * Create an instance of {@link RunwayVisualRangeV1 }
     * 
     */
    public RunwayVisualRangeV1 createRunwayVisualRangeV1() {
        return new RunwayVisualRangeV1();
    }

    /**
     * Create an instance of {@link WeatherConditionV1 }
     * 
     */
    public WeatherConditionV1 createWeatherConditionV1() {
        return new WeatherConditionV1();
    }

    /**
     * Create an instance of {@link ObscurationV1 }
     * 
     */
    public ObscurationV1 createObscurationV1() {
        return new ObscurationV1();
    }

    /**
     * Create an instance of {@link DayForecastV1 .Tags }
     * 
     */
    public DayForecastV1 .Tags createDayForecastV1Tags() {
        return new DayForecastV1 .Tags();
    }

    /**
     * Create an instance of {@link ConditionsV1 .WeatherConditions }
     * 
     */
    public ConditionsV1 .WeatherConditions createConditionsV1WeatherConditions() {
        return new ConditionsV1 .WeatherConditions();
    }

    /**
     * Create an instance of {@link ConditionsV1 .SkyConditions }
     * 
     */
    public ConditionsV1 .SkyConditions createConditionsV1SkyConditions() {
        return new ConditionsV1 .SkyConditions();
    }

    /**
     * Create an instance of {@link TafV1 .Forecasts }
     * 
     */
    public TafV1 .Forecasts createTafV1Forecasts() {
        return new TafV1 .Forecasts();
    }

    /**
     * Create an instance of {@link ZoneForecastV1 .Zones }
     * 
     */
    public ZoneForecastV1 .Zones createZoneForecastV1Zones() {
        return new ZoneForecastV1 .Zones();
    }

    /**
     * Create an instance of {@link ZoneForecastV1 .Cities }
     * 
     */
    public ZoneForecastV1 .Cities createZoneForecastV1Cities() {
        return new ZoneForecastV1 .Cities();
    }

    /**
     * Create an instance of {@link ZoneForecastV1 .ZoneNames }
     * 
     */
    public ZoneForecastV1 .ZoneNames createZoneForecastV1ZoneNames() {
        return new ZoneForecastV1 .ZoneNames();
    }

    /**
     * Create an instance of {@link ZoneForecastV1 .DayForecasts }
     * 
     */
    public ZoneForecastV1 .DayForecasts createZoneForecastV1DayForecasts() {
        return new ZoneForecastV1 .DayForecasts();
    }

    /**
     * Create an instance of {@link Appendices.Airports }
     * 
     */
    public Appendices.Airports createAppendicesAirports() {
        return new Appendices.Airports();
    }

    /**
     * Create an instance of {@link MetarV1 .Tags }
     * 
     */
    public MetarV1 .Tags createMetarV1Tags() {
        return new MetarV1 .Tags();
    }

    /**
     * Create an instance of {@link MetarV1 .RunwayVisualRanges }
     * 
     */
    public MetarV1 .RunwayVisualRanges createMetarV1RunwayVisualRanges() {
        return new MetarV1 .RunwayVisualRanges();
    }

    /**
     * Create an instance of {@link MetarV1 .Obscurations }
     * 
     */
    public MetarV1 .Obscurations createMetarV1Obscurations() {
        return new MetarV1 .Obscurations();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "airport")
    public JAXBElement<AirportV1> createAirport(AirportV1 value) {
        return new JAXBElement<AirportV1>(_Airport_QNAME, AirportV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneForecastV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "zoneForecast")
    public JAXBElement<ZoneForecastV1> createZoneForecast(ZoneForecastV1 value) {
        return new JAXBElement<ZoneForecastV1>(_ZoneForecast_QNAME, ZoneForecastV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Appendices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "appendix")
    public JAXBElement<Appendices> createAppendix(Appendices value) {
        return new JAXBElement<Appendices>(_Appendix_QNAME, Appendices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneForecastsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "zoneForecastsResponse")
    public JAXBElement<ZoneForecastsResponse> createZoneForecastsResponse(ZoneForecastsResponse value) {
        return new JAXBElement<ZoneForecastsResponse>(_ZoneForecastsResponse_QNAME, ZoneForecastsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeatherRequestBaseV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "request")
    public JAXBElement<WeatherRequestBaseV1> createRequest(WeatherRequestBaseV1 value) {
        return new JAXBElement<WeatherRequestBaseV1>(_Request_QNAME, WeatherRequestBaseV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link All }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "all")
    public JAXBElement<All> createAll(All value) {
        return new JAXBElement<All>(_All_QNAME, All.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetarForAirportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "metar_for_airportResponse")
    public JAXBElement<MetarForAirportResponse> createMetarForAirportResponse(MetarForAirportResponse value) {
        return new JAXBElement<MetarForAirportResponse>(_MetarForAirportResponse_QNAME, MetarForAirportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneForecasts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "zoneForecasts")
    public JAXBElement<ZoneForecasts> createZoneForecasts(ZoneForecasts value) {
        return new JAXBElement<ZoneForecasts>(_ZoneForecasts_QNAME, ZoneForecasts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetarV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "metar")
    public JAXBElement<MetarV1> createMetar(MetarV1 value) {
        return new JAXBElement<MetarV1>(_Metar_QNAME, MetarV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TafForAirportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "taf_for_airportResponse")
    public JAXBElement<TafForAirportResponse> createTafForAirportResponse(TafForAirportResponse value) {
        return new JAXBElement<TafForAirportResponse>(_TafForAirportResponse_QNAME, TafForAirportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetarForAirport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "metar_for_airport")
    public JAXBElement<MetarForAirport> createMetarForAirport(MetarForAirport value) {
        return new JAXBElement<MetarForAirport>(_MetarForAirport_QNAME, MetarForAirport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TafV1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "taf")
    public JAXBElement<TafV1> createTaf(TafV1 value) {
        return new JAXBElement<TafV1>(_Taf_QNAME, TafV1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TafForAirport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "taf_for_airport")
    public JAXBElement<TafForAirport> createTafForAirport(TafForAirport value) {
        return new JAXBElement<TafForAirport>(_TafForAirport_QNAME, TafForAirport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "response")
    public JAXBElement<Object> createResponse(Object value) {
        return new JAXBElement<Object>(_Response_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "allResponse")
    public JAXBElement<AllResponse> createAllResponse(AllResponse value) {
        return new JAXBElement<AllResponse>(_AllResponse_QNAME, AllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiResponseError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "apiResponseError")
    public JAXBElement<ApiResponseError> createApiResponseError(ApiResponseError value) {
        return new JAXBElement<ApiResponseError>(_ApiResponseError_QNAME, ApiResponseError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APIException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://v1.service.weather.flightstats.com/", name = "APIException")
    public JAXBElement<APIException> createAPIException(APIException value) {
        return new JAXBElement<APIException>(_APIException_QNAME, APIException.class, null, value);
    }

}
