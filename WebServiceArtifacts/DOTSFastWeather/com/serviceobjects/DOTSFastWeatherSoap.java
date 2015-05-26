
package com.serviceobjects;

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
@WebService(name = "DOTSFastWeatherSoap", targetNamespace = "http://www.serviceobjects.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DOTSFastWeatherSoap {


    /**
     * Returns the weather for a given US postal code.
     * 
     * @param licenseKey
     * @param postalCode
     * @return
     *     returns com.serviceobjects.Weather
     */
    @WebMethod(operationName = "GetWeatherByZip", action = "http://www.serviceobjects.com/GetWeatherByZip")
    @WebResult(name = "GetWeatherByZipResult", targetNamespace = "http://www.serviceobjects.com/")
    @RequestWrapper(localName = "GetWeatherByZip", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetWeatherByZip")
    @ResponseWrapper(localName = "GetWeatherByZipResponse", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetWeatherByZipResponse")
    public Weather getWeatherByZip(
        @WebParam(name = "PostalCode", targetNamespace = "http://www.serviceobjects.com/")
        String postalCode,
        @WebParam(name = "LicenseKey", targetNamespace = "http://www.serviceobjects.com/")
        String licenseKey);

    /**
     * Returns the weather for a given US city and state.
     * 
     * @param licenseKey
     * @param city
     * @param state
     * @return
     *     returns com.serviceobjects.Weather
     */
    @WebMethod(operationName = "GetWeatherByCityState", action = "http://www.serviceobjects.com/GetWeatherByCityState")
    @WebResult(name = "GetWeatherByCityStateResult", targetNamespace = "http://www.serviceobjects.com/")
    @RequestWrapper(localName = "GetWeatherByCityState", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetWeatherByCityState")
    @ResponseWrapper(localName = "GetWeatherByCityStateResponse", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetWeatherByCityStateResponse")
    public Weather getWeatherByCityState(
        @WebParam(name = "City", targetNamespace = "http://www.serviceobjects.com/")
        String city,
        @WebParam(name = "State", targetNamespace = "http://www.serviceobjects.com/")
        String state,
        @WebParam(name = "LicenseKey", targetNamespace = "http://www.serviceobjects.com/")
        String licenseKey);

    /**
     * Returns the weather for a given IP Address.
     * 
     * @param licenseKey
     * @param ipAddress
     * @return
     *     returns com.serviceobjects.Weather
     */
    @WebMethod(operationName = "GetWeatherByIP", action = "http://www.serviceobjects.com/GetWeatherByIP")
    @WebResult(name = "GetWeatherByIPResult", targetNamespace = "http://www.serviceobjects.com/")
    @RequestWrapper(localName = "GetWeatherByIP", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetWeatherByIP")
    @ResponseWrapper(localName = "GetWeatherByIPResponse", targetNamespace = "http://www.serviceobjects.com/", className = "com.serviceobjects.GetWeatherByIPResponse")
    public Weather getWeatherByIP(
        @WebParam(name = "IPAddress", targetNamespace = "http://www.serviceobjects.com/")
        String ipAddress,
        @WebParam(name = "LicenseKey", targetNamespace = "http://www.serviceobjects.com/")
        String licenseKey);

}