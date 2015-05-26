
package com.unisys.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unisys.webservices package. 
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

    private final static QName _String_QNAME = new QName("http://www.unisys.com/WebServices/", "string");
    private final static QName _WeatherForecast_QNAME = new QName("http://www.unisys.com/WebServices/", "WeatherForecast");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unisys.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWeatherText }
     * 
     */
    public GetWeatherText createGetWeatherText() {
        return new GetWeatherText();
    }

    /**
     * Create an instance of {@link WeatherForecast }
     * 
     */
    public WeatherForecast createWeatherForecast() {
        return new WeatherForecast();
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
     * Create an instance of {@link GetWeatherTextResponse }
     * 
     */
    public GetWeatherTextResponse createGetWeatherTextResponse() {
        return new GetWeatherTextResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDailyForecast }
     * 
     */
    public ArrayOfDailyForecast createArrayOfDailyForecast() {
        return new ArrayOfDailyForecast();
    }

    /**
     * Create an instance of {@link DailyForecast }
     * 
     */
    public DailyForecast createDailyForecast() {
        return new DailyForecast();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unisys.com/WebServices/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeatherForecast }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.unisys.com/WebServices/", name = "WeatherForecast")
    public JAXBElement<WeatherForecast> createWeatherForecast(WeatherForecast value) {
        return new JAXBElement<WeatherForecast>(_WeatherForecast_QNAME, WeatherForecast.class, null, value);
    }

}
