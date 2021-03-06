
package com.corona.cis618;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ShowTheWeatherSoap", targetNamespace = "http://corona.com/cis618/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ShowTheWeatherSoap {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Temperature", action = "http://corona.com/cis618/Temperature")
    @WebResult(name = "TemperatureResult", targetNamespace = "http://corona.com/cis618/")
    @RequestWrapper(localName = "Temperature", targetNamespace = "http://corona.com/cis618/", className = "com.corona.cis618.Temperature")
    @ResponseWrapper(localName = "TemperatureResponse", targetNamespace = "http://corona.com/cis618/", className = "com.corona.cis618.TemperatureResponse")
    public int temperature();

    /**
     * 
     * @param mult
     * @param fahrenheit
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "TempForC", action = "http://corona.com/cis618/TempForC")
    @WebResult(name = "TempForCResult", targetNamespace = "http://corona.com/cis618/")
    @RequestWrapper(localName = "TempForC", targetNamespace = "http://corona.com/cis618/", className = "com.corona.cis618.TempForC")
    @ResponseWrapper(localName = "TempForCResponse", targetNamespace = "http://corona.com/cis618/", className = "com.corona.cis618.TempForCResponse")
    public String tempForC(
        @WebParam(name = "Fahrenheit", targetNamespace = "http://corona.com/cis618/")
        boolean fahrenheit,
        @WebParam(name = "Mult", targetNamespace = "http://corona.com/cis618/")
        int mult);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Outlook", action = "http://corona.com/cis618/Outlook")
    @WebResult(name = "OutlookResult", targetNamespace = "http://corona.com/cis618/")
    @RequestWrapper(localName = "Outlook", targetNamespace = "http://corona.com/cis618/", className = "com.corona.cis618.Outlook")
    @ResponseWrapper(localName = "OutlookResponse", targetNamespace = "http://corona.com/cis618/", className = "com.corona.cis618.OutlookResponse")
    public String outlook();

    /**
     * 
     * @param inMsg
     * @return
     *     returns com.corona.cis618.WeatherInfo
     */
    @WebMethod(operationName = "GetAllInfo", action = "http://corona.com/cis618/GetAllInfo")
    @WebResult(name = "GetAllInfoResult", targetNamespace = "http://corona.com/cis618/")
    @RequestWrapper(localName = "GetAllInfo", targetNamespace = "http://corona.com/cis618/", className = "com.corona.cis618.GetAllInfo")
    @ResponseWrapper(localName = "GetAllInfoResponse", targetNamespace = "http://corona.com/cis618/", className = "com.corona.cis618.GetAllInfoResponse")
    public WeatherInfo getAllInfo(
        @WebParam(name = "inMsg", targetNamespace = "http://corona.com/cis618/")
        String inMsg);

    /**
     * 
     * @param temperature
     * @param windDirection
     * @param windSpeed
     * @param outlook
     */
    @WebMethod(operationName = "GetWeather", action = "http://corona.com/cis618/GetWeather")
    @RequestWrapper(localName = "GetWeather", targetNamespace = "http://corona.com/cis618/", className = "com.corona.cis618.GetWeather")
    @ResponseWrapper(localName = "GetWeatherResponse", targetNamespace = "http://corona.com/cis618/", className = "com.corona.cis618.GetWeatherResponse")
    public void getWeather(
        @WebParam(name = "Temperature", targetNamespace = "http://corona.com/cis618/", mode = WebParam.Mode.INOUT)
        Holder<Integer> temperature,
        @WebParam(name = "Outlook", targetNamespace = "http://corona.com/cis618/", mode = WebParam.Mode.INOUT)
        Holder<String> outlook,
        @WebParam(name = "WindSpeed", targetNamespace = "http://corona.com/cis618/", mode = WebParam.Mode.INOUT)
        Holder<Double> windSpeed,
        @WebParam(name = "WindDirection", targetNamespace = "http://corona.com/cis618/", mode = WebParam.Mode.INOUT)
        Holder<String> windDirection);

}
