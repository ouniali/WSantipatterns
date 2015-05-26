
package com.rfocus.ws;

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
@WebService(name = "GeoCoderSoap", targetNamespace = "http://www.rfocus.com/ws")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GeoCoderSoap {


    /**
     * 
     * @param ipAddress
     */
    @WebMethod(operationName = "IPAddressLookupJson", action = "http://www.rfocus.com/ws/IPAddressLookupJson")
    @RequestWrapper(localName = "IPAddressLookupJson", targetNamespace = "http://www.rfocus.com/ws", className = "com.rfocus.ws.IPAddressLookupJson")
    @ResponseWrapper(localName = "IPAddressLookupJsonResponse", targetNamespace = "http://www.rfocus.com/ws", className = "com.rfocus.ws.IPAddressLookupJsonResponse")
    public void ipAddressLookupJson(
        @WebParam(name = "ipAddress", targetNamespace = "http://www.rfocus.com/ws")
        String ipAddress);

    /**
     * 
     * @param ipAddress
     * @return
     *     returns com.rfocus.ws.GeocodeResult
     */
    @WebMethod(operationName = "IPAddressLookup", action = "http://www.rfocus.com/ws/IPAddressLookup")
    @WebResult(name = "IPAddressLookupResult", targetNamespace = "http://www.rfocus.com/ws")
    @RequestWrapper(localName = "IPAddressLookup", targetNamespace = "http://www.rfocus.com/ws", className = "com.rfocus.ws.IPAddressLookup")
    @ResponseWrapper(localName = "IPAddressLookupResponse", targetNamespace = "http://www.rfocus.com/ws", className = "com.rfocus.ws.IPAddressLookupResponse")
    public GeocodeResult ipAddressLookup(
        @WebParam(name = "ipAddress", targetNamespace = "http://www.rfocus.com/ws")
        String ipAddress);

    /**
     * 
     * @param address
     */
    @WebMethod(operationName = "PhysicalAddressLookupJson", action = "http://www.rfocus.com/ws/PhysicalAddressLookupJson")
    @RequestWrapper(localName = "PhysicalAddressLookupJson", targetNamespace = "http://www.rfocus.com/ws", className = "com.rfocus.ws.PhysicalAddressLookupJson")
    @ResponseWrapper(localName = "PhysicalAddressLookupJsonResponse", targetNamespace = "http://www.rfocus.com/ws", className = "com.rfocus.ws.PhysicalAddressLookupJsonResponse")
    public void physicalAddressLookupJson(
        @WebParam(name = "address", targetNamespace = "http://www.rfocus.com/ws")
        String address);

    /**
     * 
     * @param address
     * @return
     *     returns com.rfocus.ws.GeocodeResult
     */
    @WebMethod(operationName = "PhysicalAddressLookup", action = "http://www.rfocus.com/ws/PhysicalAddressLookup")
    @WebResult(name = "PhysicalAddressLookupResult", targetNamespace = "http://www.rfocus.com/ws")
    @RequestWrapper(localName = "PhysicalAddressLookup", targetNamespace = "http://www.rfocus.com/ws", className = "com.rfocus.ws.PhysicalAddressLookup")
    @ResponseWrapper(localName = "PhysicalAddressLookupResponse", targetNamespace = "http://www.rfocus.com/ws", className = "com.rfocus.ws.PhysicalAddressLookupResponse")
    public GeocodeResult physicalAddressLookup(
        @WebParam(name = "address", targetNamespace = "http://www.rfocus.com/ws")
        String address);

    /**
     * 
     * @param latitude
     * @param longitude
     */
    @WebMethod(operationName = "ReverseGeocodeJson", action = "http://www.rfocus.com/ws/ReverseGeocodeJson")
    @RequestWrapper(localName = "ReverseGeocodeJson", targetNamespace = "http://www.rfocus.com/ws", className = "com.rfocus.ws.ReverseGeocodeJson")
    @ResponseWrapper(localName = "ReverseGeocodeJsonResponse", targetNamespace = "http://www.rfocus.com/ws", className = "com.rfocus.ws.ReverseGeocodeJsonResponse")
    public void reverseGeocodeJson(
        @WebParam(name = "latitude", targetNamespace = "http://www.rfocus.com/ws")
        double latitude,
        @WebParam(name = "longitude", targetNamespace = "http://www.rfocus.com/ws")
        double longitude);

    /**
     * 
     * @param latitude
     * @param longitude
     * @return
     *     returns com.rfocus.ws.GeocodeResult
     */
    @WebMethod(operationName = "ReverseGeocode", action = "http://www.rfocus.com/ws/ReverseGeocode")
    @WebResult(name = "ReverseGeocodeResult", targetNamespace = "http://www.rfocus.com/ws")
    @RequestWrapper(localName = "ReverseGeocode", targetNamespace = "http://www.rfocus.com/ws", className = "com.rfocus.ws.ReverseGeocode")
    @ResponseWrapper(localName = "ReverseGeocodeResponse", targetNamespace = "http://www.rfocus.com/ws", className = "com.rfocus.ws.ReverseGeocodeResponse")
    public GeocodeResult reverseGeocode(
        @WebParam(name = "latitude", targetNamespace = "http://www.rfocus.com/ws")
        double latitude,
        @WebParam(name = "longitude", targetNamespace = "http://www.rfocus.com/ws")
        double longitude);

}
