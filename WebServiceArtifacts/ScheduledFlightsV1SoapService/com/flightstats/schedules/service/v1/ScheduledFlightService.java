
package com.flightstats.schedules.service.v1;

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
@WebService(name = "scheduledFlightService", targetNamespace = "http://v1.service.schedules.flightstats.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ScheduledFlightService {


    /**
     * 
     * @param arrivalAirportCode
     * @param extendedOptions
     * @param month
     * @param codeType
     * @param year
     * @param appId
     * @param appKey
     * @param day
     * @param departureAirportCode
     * @return
     *     returns com.flightstats.schedules.service.v1.ResponseByRoute
     * @throws APIException_Exception
     */
    @WebMethod(operationName = "byRoute_Arriving")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "byRoute_Arriving", targetNamespace = "http://v1.service.schedules.flightstats.com/", className = "com.flightstats.schedules.service.v1.ByRouteArriving")
    @ResponseWrapper(localName = "byRoute_ArrivingResponse", targetNamespace = "http://v1.service.schedules.flightstats.com/", className = "com.flightstats.schedules.service.v1.ByRouteArrivingResponse")
    @Action(input = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byRoute_ArrivingRequest", output = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byRoute_ArrivingResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byRoute_Arriving/Fault/APIException")
    })
    public ResponseByRoute byRouteArriving(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "departureAirportCode", targetNamespace = "")
        String departureAirportCode,
        @WebParam(name = "arrivalAirportCode", targetNamespace = "")
        String arrivalAirportCode,
        @WebParam(name = "year", targetNamespace = "")
        int year,
        @WebParam(name = "month", targetNamespace = "")
        int month,
        @WebParam(name = "day", targetNamespace = "")
        int day,
        @WebParam(name = "codeType", targetNamespace = "")
        String codeType,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

    /**
     * 
     * @param extendedOptions
     * @param month
     * @param codeType
     * @param year
     * @param appId
     * @param hourOfDay
     * @param appKey
     * @param day
     * @param departureAirportCode
     * @return
     *     returns com.flightstats.schedules.service.v1.ResponseByAirport
     * @throws APIException_Exception
     */
    @WebMethod(operationName = "byAirport_Departing")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "byAirport_Departing", targetNamespace = "http://v1.service.schedules.flightstats.com/", className = "com.flightstats.schedules.service.v1.ByAirportDeparting")
    @ResponseWrapper(localName = "byAirport_DepartingResponse", targetNamespace = "http://v1.service.schedules.flightstats.com/", className = "com.flightstats.schedules.service.v1.ByAirportDepartingResponse")
    @Action(input = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byAirport_DepartingRequest", output = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byAirport_DepartingResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byAirport_Departing/Fault/APIException")
    })
    public ResponseByAirport byAirportDeparting(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "departureAirportCode", targetNamespace = "")
        String departureAirportCode,
        @WebParam(name = "year", targetNamespace = "")
        int year,
        @WebParam(name = "month", targetNamespace = "")
        int month,
        @WebParam(name = "day", targetNamespace = "")
        int day,
        @WebParam(name = "hourOfDay", targetNamespace = "")
        int hourOfDay,
        @WebParam(name = "codeType", targetNamespace = "")
        String codeType,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

    /**
     * 
     * @param arrivalAirportCode
     * @param extendedOptions
     * @param month
     * @param codeType
     * @param year
     * @param appId
     * @param appKey
     * @param day
     * @param departureAirportCode
     * @return
     *     returns com.flightstats.schedules.service.v1.ResponseByRoute
     * @throws APIException_Exception
     */
    @WebMethod(operationName = "byRoute_Departing")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "byRoute_Departing", targetNamespace = "http://v1.service.schedules.flightstats.com/", className = "com.flightstats.schedules.service.v1.ByRouteDeparting")
    @ResponseWrapper(localName = "byRoute_DepartingResponse", targetNamespace = "http://v1.service.schedules.flightstats.com/", className = "com.flightstats.schedules.service.v1.ByRouteDepartingResponse")
    @Action(input = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byRoute_DepartingRequest", output = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byRoute_DepartingResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byRoute_Departing/Fault/APIException")
    })
    public ResponseByRoute byRouteDeparting(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "departureAirportCode", targetNamespace = "")
        String departureAirportCode,
        @WebParam(name = "arrivalAirportCode", targetNamespace = "")
        String arrivalAirportCode,
        @WebParam(name = "year", targetNamespace = "")
        int year,
        @WebParam(name = "month", targetNamespace = "")
        int month,
        @WebParam(name = "day", targetNamespace = "")
        int day,
        @WebParam(name = "codeType", targetNamespace = "")
        String codeType,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

    /**
     * 
     * @param carrier
     * @param extendedOptions
     * @param month
     * @param codeType
     * @param year
     * @param appId
     * @param flightnumber
     * @param appKey
     * @param day
     * @return
     *     returns com.flightstats.schedules.service.v1.ResponseByFlight
     * @throws APIException_Exception
     */
    @WebMethod(operationName = "byFlight_Arriving")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "byFlight_Arriving", targetNamespace = "http://v1.service.schedules.flightstats.com/", className = "com.flightstats.schedules.service.v1.ByFlightArriving")
    @ResponseWrapper(localName = "byFlight_ArrivingResponse", targetNamespace = "http://v1.service.schedules.flightstats.com/", className = "com.flightstats.schedules.service.v1.ByFlightArrivingResponse")
    @Action(input = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byFlight_ArrivingRequest", output = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byFlight_ArrivingResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byFlight_Arriving/Fault/APIException")
    })
    public ResponseByFlight byFlightArriving(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "carrier", targetNamespace = "")
        String carrier,
        @WebParam(name = "flightnumber", targetNamespace = "")
        String flightnumber,
        @WebParam(name = "year", targetNamespace = "")
        int year,
        @WebParam(name = "month", targetNamespace = "")
        int month,
        @WebParam(name = "day", targetNamespace = "")
        int day,
        @WebParam(name = "codeType", targetNamespace = "")
        String codeType,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

    /**
     * 
     * @param carrier
     * @param extendedOptions
     * @param month
     * @param codeType
     * @param year
     * @param appId
     * @param flightnumber
     * @param appKey
     * @param day
     * @return
     *     returns com.flightstats.schedules.service.v1.ResponseByFlight
     * @throws APIException_Exception
     */
    @WebMethod(operationName = "byFlight_Departing")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "byFlight_Departing", targetNamespace = "http://v1.service.schedules.flightstats.com/", className = "com.flightstats.schedules.service.v1.ByFlightDeparting")
    @ResponseWrapper(localName = "byFlight_DepartingResponse", targetNamespace = "http://v1.service.schedules.flightstats.com/", className = "com.flightstats.schedules.service.v1.ByFlightDepartingResponse")
    @Action(input = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byFlight_DepartingRequest", output = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byFlight_DepartingResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byFlight_Departing/Fault/APIException")
    })
    public ResponseByFlight byFlightDeparting(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "carrier", targetNamespace = "")
        String carrier,
        @WebParam(name = "flightnumber", targetNamespace = "")
        String flightnumber,
        @WebParam(name = "year", targetNamespace = "")
        int year,
        @WebParam(name = "month", targetNamespace = "")
        int month,
        @WebParam(name = "day", targetNamespace = "")
        int day,
        @WebParam(name = "codeType", targetNamespace = "")
        String codeType,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

    /**
     * 
     * @param arrivalAirportCode
     * @param extendedOptions
     * @param month
     * @param codeType
     * @param year
     * @param appId
     * @param hourOfDay
     * @param appKey
     * @param day
     * @return
     *     returns com.flightstats.schedules.service.v1.ResponseByAirport
     * @throws APIException_Exception
     */
    @WebMethod(operationName = "byAirport_Arriving")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "byAirport_Arriving", targetNamespace = "http://v1.service.schedules.flightstats.com/", className = "com.flightstats.schedules.service.v1.ByAirportArriving")
    @ResponseWrapper(localName = "byAirport_ArrivingResponse", targetNamespace = "http://v1.service.schedules.flightstats.com/", className = "com.flightstats.schedules.service.v1.ByAirportArrivingResponse")
    @Action(input = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byAirport_ArrivingRequest", output = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byAirport_ArrivingResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.schedules.flightstats.com/scheduledFlightService/byAirport_Arriving/Fault/APIException")
    })
    public ResponseByAirport byAirportArriving(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "arrivalAirportCode", targetNamespace = "")
        String arrivalAirportCode,
        @WebParam(name = "year", targetNamespace = "")
        int year,
        @WebParam(name = "month", targetNamespace = "")
        int month,
        @WebParam(name = "day", targetNamespace = "")
        int day,
        @WebParam(name = "hourOfDay", targetNamespace = "")
        int hourOfDay,
        @WebParam(name = "codeType", targetNamespace = "")
        String codeType,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

}
