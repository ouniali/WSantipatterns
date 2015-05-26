
package com.flightexplorer.webservices;

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
@WebService(name = "FlightExplorerFastTrackSoap", targetNamespace = "http://webservices.flightexplorer.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FlightExplorerFastTrackSoap {


    /**
     * Returns basic flight information.
     * 
     * @param acid
     * @param password
     * @param userid
     * @return
     *     returns com.flightexplorer.webservices.FlightData
     */
    @WebMethod(operationName = "GetFlightData", action = "http://webservices.flightexplorer.com/GetFlightData")
    @WebResult(name = "GetFlightDataResult", targetNamespace = "http://webservices.flightexplorer.com/")
    @RequestWrapper(localName = "GetFlightData", targetNamespace = "http://webservices.flightexplorer.com/", className = "com.flightexplorer.webservices.GetFlightData")
    @ResponseWrapper(localName = "GetFlightDataResponse", targetNamespace = "http://webservices.flightexplorer.com/", className = "com.flightexplorer.webservices.GetFlightDataResponse")
    public FlightData getFlightData(
        @WebParam(name = "Userid", targetNamespace = "http://webservices.flightexplorer.com/")
        String userid,
        @WebParam(name = "Password", targetNamespace = "http://webservices.flightexplorer.com/")
        String password,
        @WebParam(name = "ACID", targetNamespace = "http://webservices.flightexplorer.com/")
        String acid);

    /**
     * Returns extended flight information including additional details about the origin and destination airports and their current weather conditions.
     * 
     * @param acid
     * @param password
     * @param userid
     * @return
     *     returns com.flightexplorer.webservices.FlightDataEx
     */
    @WebMethod(operationName = "GetFlightDataEx", action = "http://webservices.flightexplorer.com/GetFlightDataEx")
    @WebResult(name = "GetFlightDataExResult", targetNamespace = "http://webservices.flightexplorer.com/")
    @RequestWrapper(localName = "GetFlightDataEx", targetNamespace = "http://webservices.flightexplorer.com/", className = "com.flightexplorer.webservices.GetFlightDataEx")
    @ResponseWrapper(localName = "GetFlightDataExResponse", targetNamespace = "http://webservices.flightexplorer.com/", className = "com.flightexplorer.webservices.GetFlightDataExResponse")
    public FlightDataEx getFlightDataEx(
        @WebParam(name = "Userid", targetNamespace = "http://webservices.flightexplorer.com/")
        String userid,
        @WebParam(name = "Password", targetNamespace = "http://webservices.flightexplorer.com/")
        String password,
        @WebParam(name = "ACID", targetNamespace = "http://webservices.flightexplorer.com/")
        String acid);

    /**
     * Returns basic flight information and a URL for an image showing current flight location.
     * 
     * @param acid
     * @param imageFlags
     * @param imageWidth
     * @param password
     * @param scratchPad
     * @param alias
     * @param userid
     * @param imageHeight
     * @return
     *     returns com.flightexplorer.webservices.FlightDataAndImage
     */
    @WebMethod(operationName = "GetFlightDataAndImage", action = "http://webservices.flightexplorer.com/GetFlightDataAndImage")
    @WebResult(name = "GetFlightDataAndImageResult", targetNamespace = "http://webservices.flightexplorer.com/")
    @RequestWrapper(localName = "GetFlightDataAndImage", targetNamespace = "http://webservices.flightexplorer.com/", className = "com.flightexplorer.webservices.GetFlightDataAndImage")
    @ResponseWrapper(localName = "GetFlightDataAndImageResponse", targetNamespace = "http://webservices.flightexplorer.com/", className = "com.flightexplorer.webservices.GetFlightDataAndImageResponse")
    public FlightDataAndImage getFlightDataAndImage(
        @WebParam(name = "Userid", targetNamespace = "http://webservices.flightexplorer.com/")
        String userid,
        @WebParam(name = "Password", targetNamespace = "http://webservices.flightexplorer.com/")
        String password,
        @WebParam(name = "ACID", targetNamespace = "http://webservices.flightexplorer.com/")
        String acid,
        @WebParam(name = "Alias", targetNamespace = "http://webservices.flightexplorer.com/")
        String alias,
        @WebParam(name = "ScratchPad", targetNamespace = "http://webservices.flightexplorer.com/")
        String scratchPad,
        @WebParam(name = "ImageFlags", targetNamespace = "http://webservices.flightexplorer.com/")
        String imageFlags,
        @WebParam(name = "ImageWidth", targetNamespace = "http://webservices.flightexplorer.com/")
        int imageWidth,
        @WebParam(name = "ImageHeight", targetNamespace = "http://webservices.flightexplorer.com/")
        int imageHeight);

    /**
     * Returns extended flight information including additional details about the origin and destination airports and their current weather conditions and a URL for an image showing current flight location.
     * 
     * @param acid
     * @param imageFlags
     * @param imageWidth
     * @param password
     * @param scratchPad
     * @param alias
     * @param userid
     * @param imageHeight
     * @return
     *     returns com.flightexplorer.webservices.FlightDataAndImageEx
     */
    @WebMethod(operationName = "GetFlightDataAndImageEx", action = "http://webservices.flightexplorer.com/GetFlightDataAndImageEx")
    @WebResult(name = "GetFlightDataAndImageExResult", targetNamespace = "http://webservices.flightexplorer.com/")
    @RequestWrapper(localName = "GetFlightDataAndImageEx", targetNamespace = "http://webservices.flightexplorer.com/", className = "com.flightexplorer.webservices.GetFlightDataAndImageEx")
    @ResponseWrapper(localName = "GetFlightDataAndImageExResponse", targetNamespace = "http://webservices.flightexplorer.com/", className = "com.flightexplorer.webservices.GetFlightDataAndImageExResponse")
    public FlightDataAndImageEx getFlightDataAndImageEx(
        @WebParam(name = "Userid", targetNamespace = "http://webservices.flightexplorer.com/")
        String userid,
        @WebParam(name = "Password", targetNamespace = "http://webservices.flightexplorer.com/")
        String password,
        @WebParam(name = "ACID", targetNamespace = "http://webservices.flightexplorer.com/")
        String acid,
        @WebParam(name = "Alias", targetNamespace = "http://webservices.flightexplorer.com/")
        String alias,
        @WebParam(name = "ScratchPad", targetNamespace = "http://webservices.flightexplorer.com/")
        String scratchPad,
        @WebParam(name = "ImageFlags", targetNamespace = "http://webservices.flightexplorer.com/")
        String imageFlags,
        @WebParam(name = "ImageWidth", targetNamespace = "http://webservices.flightexplorer.com/")
        int imageWidth,
        @WebParam(name = "ImageHeight", targetNamespace = "http://webservices.flightexplorer.com/")
        int imageHeight);

    /**
     * Returns a URL for an image showing current flight location.
     * 
     * @param acid
     * @param imageFlags
     * @param imageWidth
     * @param password
     * @param scratchPad
     * @param alias
     * @param userid
     * @param imageHeight
     * @return
     *     returns com.flightexplorer.webservices.FlightImage
     */
    @WebMethod(operationName = "GetFlightImage", action = "http://webservices.flightexplorer.com/GetFlightImage")
    @WebResult(name = "GetFlightImageResult", targetNamespace = "http://webservices.flightexplorer.com/")
    @RequestWrapper(localName = "GetFlightImage", targetNamespace = "http://webservices.flightexplorer.com/", className = "com.flightexplorer.webservices.GetFlightImage")
    @ResponseWrapper(localName = "GetFlightImageResponse", targetNamespace = "http://webservices.flightexplorer.com/", className = "com.flightexplorer.webservices.GetFlightImageResponse")
    public FlightImage getFlightImage(
        @WebParam(name = "Userid", targetNamespace = "http://webservices.flightexplorer.com/")
        String userid,
        @WebParam(name = "Password", targetNamespace = "http://webservices.flightexplorer.com/")
        String password,
        @WebParam(name = "ACID", targetNamespace = "http://webservices.flightexplorer.com/")
        String acid,
        @WebParam(name = "Alias", targetNamespace = "http://webservices.flightexplorer.com/")
        String alias,
        @WebParam(name = "ScratchPad", targetNamespace = "http://webservices.flightexplorer.com/")
        String scratchPad,
        @WebParam(name = "ImageFlags", targetNamespace = "http://webservices.flightexplorer.com/")
        String imageFlags,
        @WebParam(name = "ImageWidth", targetNamespace = "http://webservices.flightexplorer.com/")
        int imageWidth,
        @WebParam(name = "ImageHeight", targetNamespace = "http://webservices.flightexplorer.com/")
        int imageHeight);

    /**
     * Returns discovered code share flight information.
     * 
     * @param acid
     * @param password
     * @param userid
     * @return
     *     returns com.flightexplorer.webservices.FlightData
     */
    @WebMethod(operationName = "GetCodeShareFlightData", action = "http://webservices.flightexplorer.com/GetCodeShareFlightData")
    @WebResult(name = "GetCodeShareFlightDataResult", targetNamespace = "http://webservices.flightexplorer.com/")
    @RequestWrapper(localName = "GetCodeShareFlightData", targetNamespace = "http://webservices.flightexplorer.com/", className = "com.flightexplorer.webservices.GetCodeShareFlightData")
    @ResponseWrapper(localName = "GetCodeShareFlightDataResponse", targetNamespace = "http://webservices.flightexplorer.com/", className = "com.flightexplorer.webservices.GetCodeShareFlightDataResponse")
    public FlightData getCodeShareFlightData(
        @WebParam(name = "Userid", targetNamespace = "http://webservices.flightexplorer.com/")
        String userid,
        @WebParam(name = "Password", targetNamespace = "http://webservices.flightexplorer.com/")
        String password,
        @WebParam(name = "ACID", targetNamespace = "http://webservices.flightexplorer.com/")
        String acid);

}
