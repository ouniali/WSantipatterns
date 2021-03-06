
package com.flightstats.weather.service.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "weatherService", targetNamespace = "http://v1.service.weather.flightstats.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherService {


    /**
     * 
     * @param extendedOptions
     * @param codeType
     * @param appId
     * @param appKey
     * @param airport
     * @return
     *     returns com.flightstats.weather.service.v1.AllWeatherResponseV1
     * @throws APIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "all", targetNamespace = "http://v1.service.weather.flightstats.com/", className = "com.flightstats.weather.service.v1.All")
    @ResponseWrapper(localName = "allResponse", targetNamespace = "http://v1.service.weather.flightstats.com/", className = "com.flightstats.weather.service.v1.AllResponse")
    @Action(input = "http://v1.service.weather.flightstats.com/weatherService/allRequest", output = "http://v1.service.weather.flightstats.com/weatherService/allResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.weather.flightstats.com/weatherService/all/Fault/APIException")
    })
    public AllWeatherResponseV1 all(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "airport", targetNamespace = "")
        String airport,
        @WebParam(name = "codeType", targetNamespace = "")
        String codeType,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

    /**
     * 
     * @param extendedOptions
     * @param codeType
     * @param appId
     * @param appKey
     * @param airport
     * @return
     *     returns com.flightstats.weather.service.v1.ZoneForecastResponseV1
     * @throws APIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "zoneForecasts", targetNamespace = "http://v1.service.weather.flightstats.com/", className = "com.flightstats.weather.service.v1.ZoneForecasts")
    @ResponseWrapper(localName = "zoneForecastsResponse", targetNamespace = "http://v1.service.weather.flightstats.com/", className = "com.flightstats.weather.service.v1.ZoneForecastsResponse")
    @Action(input = "http://v1.service.weather.flightstats.com/weatherService/zoneForecastsRequest", output = "http://v1.service.weather.flightstats.com/weatherService/zoneForecastsResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.weather.flightstats.com/weatherService/zoneForecasts/Fault/APIException")
    })
    public ZoneForecastResponseV1 zoneForecasts(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "airport", targetNamespace = "")
        String airport,
        @WebParam(name = "codeType", targetNamespace = "")
        String codeType,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

    /**
     * 
     * @param extendedOptions
     * @param codeType
     * @param appId
     * @param appKey
     * @param airport
     * @return
     *     returns com.flightstats.weather.service.v1.MetarResponseV1
     * @throws APIException_Exception
     */
    @WebMethod(operationName = "metar_for_airport")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "metar_for_airport", targetNamespace = "http://v1.service.weather.flightstats.com/", className = "com.flightstats.weather.service.v1.MetarForAirport")
    @ResponseWrapper(localName = "metar_for_airportResponse", targetNamespace = "http://v1.service.weather.flightstats.com/", className = "com.flightstats.weather.service.v1.MetarForAirportResponse")
    @Action(input = "http://v1.service.weather.flightstats.com/weatherService/metar_for_airportRequest", output = "http://v1.service.weather.flightstats.com/weatherService/metar_for_airportResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.weather.flightstats.com/weatherService/metar_for_airport/Fault/APIException")
    })
    public MetarResponseV1 metarForAirport(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "airport", targetNamespace = "")
        String airport,
        @WebParam(name = "codeType", targetNamespace = "")
        String codeType,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

    /**
     * 
     * @param extendedOptions
     * @param codeType
     * @param appId
     * @param appKey
     * @param airport
     * @return
     *     returns com.flightstats.weather.service.v1.TafResponseV1
     * @throws APIException_Exception
     */
    @WebMethod(operationName = "taf_for_airport")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "taf_for_airport", targetNamespace = "http://v1.service.weather.flightstats.com/", className = "com.flightstats.weather.service.v1.TafForAirport")
    @ResponseWrapper(localName = "taf_for_airportResponse", targetNamespace = "http://v1.service.weather.flightstats.com/", className = "com.flightstats.weather.service.v1.TafForAirportResponse")
    @Action(input = "http://v1.service.weather.flightstats.com/weatherService/taf_for_airportRequest", output = "http://v1.service.weather.flightstats.com/weatherService/taf_for_airportResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.weather.flightstats.com/weatherService/taf_for_airport/Fault/APIException")
    })
    public TafResponseV1 tafForAirport(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "airport", targetNamespace = "")
        String airport,
        @WebParam(name = "codeType", targetNamespace = "")
        String codeType,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

}
