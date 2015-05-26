
package com.corona.cis618;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.corona.cis618 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.corona.cis618
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Temperature }
     * 
     */
    public Temperature createTemperature() {
        return new Temperature();
    }

    /**
     * Create an instance of {@link GetAllInfo }
     * 
     */
    public GetAllInfo createGetAllInfo() {
        return new GetAllInfo();
    }

    /**
     * Create an instance of {@link TempForCResponse }
     * 
     */
    public TempForCResponse createTempForCResponse() {
        return new TempForCResponse();
    }

    /**
     * Create an instance of {@link GetAllInfoResponse }
     * 
     */
    public GetAllInfoResponse createGetAllInfoResponse() {
        return new GetAllInfoResponse();
    }

    /**
     * Create an instance of {@link WeatherInfo }
     * 
     */
    public WeatherInfo createWeatherInfo() {
        return new WeatherInfo();
    }

    /**
     * Create an instance of {@link Outlook }
     * 
     */
    public Outlook createOutlook() {
        return new Outlook();
    }

    /**
     * Create an instance of {@link GetWeather }
     * 
     */
    public GetWeather createGetWeather() {
        return new GetWeather();
    }

    /**
     * Create an instance of {@link GetWeatherResponse }
     * 
     */
    public GetWeatherResponse createGetWeatherResponse() {
        return new GetWeatherResponse();
    }

    /**
     * Create an instance of {@link TemperatureResponse }
     * 
     */
    public TemperatureResponse createTemperatureResponse() {
        return new TemperatureResponse();
    }

    /**
     * Create an instance of {@link TempForC }
     * 
     */
    public TempForC createTempForC() {
        return new TempForC();
    }

    /**
     * Create an instance of {@link OutlookResponse }
     * 
     */
    public OutlookResponse createOutlookResponse() {
        return new OutlookResponse();
    }

}
