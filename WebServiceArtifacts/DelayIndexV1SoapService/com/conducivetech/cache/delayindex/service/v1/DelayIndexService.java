
package com.conducivetech.cache.delayindex.service.v1;

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
@WebService(name = "delayIndexService", targetNamespace = "http://v1.service.delayindex.cache.conducivetech.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DelayIndexService {


    /**
     * 
     * @param score
     * @param extendedOptions
     * @param appId
     * @param appKey
     * @param region
     * @param classification
     * @return
     *     returns com.conducivetech.cache.delayindex.service.v1.ResponseRegion
     * @throws APIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "forRegion", targetNamespace = "http://v1.service.delayindex.cache.conducivetech.com/", className = "com.conducivetech.cache.delayindex.service.v1.ForRegion")
    @ResponseWrapper(localName = "forRegionResponse", targetNamespace = "http://v1.service.delayindex.cache.conducivetech.com/", className = "com.conducivetech.cache.delayindex.service.v1.ForRegionResponse")
    @Action(input = "http://v1.service.delayindex.cache.conducivetech.com/delayIndexService/forRegionRequest", output = "http://v1.service.delayindex.cache.conducivetech.com/delayIndexService/forRegionResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.delayindex.cache.conducivetech.com/delayIndexService/forRegion/Fault/APIException")
    })
    public ResponseRegion forRegion(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "region", targetNamespace = "")
        String region,
        @WebParam(name = "classification", targetNamespace = "")
        String classification,
        @WebParam(name = "score", targetNamespace = "")
        String score,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

    /**
     * 
     * @param score
     * @param extendedOptions
     * @param appId
     * @param appKey
     * @param stateCode
     * @param classification
     * @return
     *     returns com.conducivetech.cache.delayindex.service.v1.ResponseState
     * @throws APIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "forState", targetNamespace = "http://v1.service.delayindex.cache.conducivetech.com/", className = "com.conducivetech.cache.delayindex.service.v1.ForState")
    @ResponseWrapper(localName = "forStateResponse", targetNamespace = "http://v1.service.delayindex.cache.conducivetech.com/", className = "com.conducivetech.cache.delayindex.service.v1.ForStateResponse")
    @Action(input = "http://v1.service.delayindex.cache.conducivetech.com/delayIndexService/forStateRequest", output = "http://v1.service.delayindex.cache.conducivetech.com/delayIndexService/forStateResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.delayindex.cache.conducivetech.com/delayIndexService/forState/Fault/APIException")
    })
    public ResponseState forState(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "stateCode", targetNamespace = "")
        String stateCode,
        @WebParam(name = "classification", targetNamespace = "")
        String classification,
        @WebParam(name = "score", targetNamespace = "")
        String score,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

    /**
     * 
     * @param score
     * @param extendedOptions
     * @param codeType
     * @param appId
     * @param appKey
     * @param airportCodes
     * @param classification
     * @return
     *     returns com.conducivetech.cache.delayindex.service.v1.ResponseAirports
     * @throws APIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "forAirport", targetNamespace = "http://v1.service.delayindex.cache.conducivetech.com/", className = "com.conducivetech.cache.delayindex.service.v1.ForAirport")
    @ResponseWrapper(localName = "forAirportResponse", targetNamespace = "http://v1.service.delayindex.cache.conducivetech.com/", className = "com.conducivetech.cache.delayindex.service.v1.ForAirportResponse")
    @Action(input = "http://v1.service.delayindex.cache.conducivetech.com/delayIndexService/forAirportRequest", output = "http://v1.service.delayindex.cache.conducivetech.com/delayIndexService/forAirportResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.delayindex.cache.conducivetech.com/delayIndexService/forAirport/Fault/APIException")
    })
    public ResponseAirports forAirport(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "airportCodes", targetNamespace = "")
        String airportCodes,
        @WebParam(name = "codeType", targetNamespace = "")
        String codeType,
        @WebParam(name = "classification", targetNamespace = "")
        String classification,
        @WebParam(name = "score", targetNamespace = "")
        String score,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

    /**
     * 
     * @param score
     * @param extendedOptions
     * @param countryCode
     * @param appId
     * @param appKey
     * @param classification
     * @return
     *     returns com.conducivetech.cache.delayindex.service.v1.ResponseCountry
     * @throws APIException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "forCountry", targetNamespace = "http://v1.service.delayindex.cache.conducivetech.com/", className = "com.conducivetech.cache.delayindex.service.v1.ForCountry")
    @ResponseWrapper(localName = "forCountryResponse", targetNamespace = "http://v1.service.delayindex.cache.conducivetech.com/", className = "com.conducivetech.cache.delayindex.service.v1.ForCountryResponse")
    @Action(input = "http://v1.service.delayindex.cache.conducivetech.com/delayIndexService/forCountryRequest", output = "http://v1.service.delayindex.cache.conducivetech.com/delayIndexService/forCountryResponse", fault = {
        @FaultAction(className = APIException_Exception.class, value = "http://v1.service.delayindex.cache.conducivetech.com/delayIndexService/forCountry/Fault/APIException")
    })
    public ResponseCountry forCountry(
        @WebParam(name = "appId", targetNamespace = "")
        String appId,
        @WebParam(name = "appKey", targetNamespace = "")
        String appKey,
        @WebParam(name = "countryCode", targetNamespace = "")
        String countryCode,
        @WebParam(name = "classification", targetNamespace = "")
        String classification,
        @WebParam(name = "score", targetNamespace = "")
        String score,
        @WebParam(name = "extendedOptions", targetNamespace = "")
        String extendedOptions)
        throws APIException_Exception
    ;

}