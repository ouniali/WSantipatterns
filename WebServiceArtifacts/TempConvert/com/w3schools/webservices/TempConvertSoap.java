
package com.w3schools.webservices;

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
@WebService(name = "TempConvertSoap", targetNamespace = "http://www.w3schools.com/webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TempConvertSoap {


    /**
     * 
     * @param fahrenheit
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "FahrenheitToCelsius", action = "http://www.w3schools.com/webservices/FahrenheitToCelsius")
    @WebResult(name = "FahrenheitToCelsiusResult", targetNamespace = "http://www.w3schools.com/webservices/")
    @RequestWrapper(localName = "FahrenheitToCelsius", targetNamespace = "http://www.w3schools.com/webservices/", className = "com.w3schools.webservices.FahrenheitToCelsius")
    @ResponseWrapper(localName = "FahrenheitToCelsiusResponse", targetNamespace = "http://www.w3schools.com/webservices/", className = "com.w3schools.webservices.FahrenheitToCelsiusResponse")
    public String fahrenheitToCelsius(
        @WebParam(name = "Fahrenheit", targetNamespace = "http://www.w3schools.com/webservices/")
        String fahrenheit);

    /**
     * 
     * @param celsius
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CelsiusToFahrenheit", action = "http://www.w3schools.com/webservices/CelsiusToFahrenheit")
    @WebResult(name = "CelsiusToFahrenheitResult", targetNamespace = "http://www.w3schools.com/webservices/")
    @RequestWrapper(localName = "CelsiusToFahrenheit", targetNamespace = "http://www.w3schools.com/webservices/", className = "com.w3schools.webservices.CelsiusToFahrenheit")
    @ResponseWrapper(localName = "CelsiusToFahrenheitResponse", targetNamespace = "http://www.w3schools.com/webservices/", className = "com.w3schools.webservices.CelsiusToFahrenheitResponse")
    public String celsiusToFahrenheit(
        @WebParam(name = "Celsius", targetNamespace = "http://www.w3schools.com/webservices/")
        String celsius);

}
