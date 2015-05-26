
package com.serviceobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.serviceobjects package. 
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

    private final static QName _Weather_QNAME = new QName("http://www.serviceobjects.com/", "Weather");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.serviceobjects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWeatherByZip }
     * 
     */
    public GetWeatherByZip createGetWeatherByZip() {
        return new GetWeatherByZip();
    }

    /**
     * Create an instance of {@link Weather }
     * 
     */
    public Weather createWeather() {
        return new Weather();
    }

    /**
     * Create an instance of {@link GetWeatherByCityState }
     * 
     */
    public GetWeatherByCityState createGetWeatherByCityState() {
        return new GetWeatherByCityState();
    }

    /**
     * Create an instance of {@link GetWeatherByZipResponse }
     * 
     */
    public GetWeatherByZipResponse createGetWeatherByZipResponse() {
        return new GetWeatherByZipResponse();
    }

    /**
     * Create an instance of {@link GetWeatherByIP }
     * 
     */
    public GetWeatherByIP createGetWeatherByIP() {
        return new GetWeatherByIP();
    }

    /**
     * Create an instance of {@link GetWeatherByCityStateResponse }
     * 
     */
    public GetWeatherByCityStateResponse createGetWeatherByCityStateResponse() {
        return new GetWeatherByCityStateResponse();
    }

    /**
     * Create an instance of {@link GetWeatherByIPResponse }
     * 
     */
    public GetWeatherByIPResponse createGetWeatherByIPResponse() {
        return new GetWeatherByIPResponse();
    }

    /**
     * Create an instance of {@link Err }
     * 
     */
    public Err createErr() {
        return new Err();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Weather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com/", name = "Weather")
    public JAXBElement<Weather> createWeather(Weather value) {
        return new JAXBElement<Weather>(_Weather_QNAME, Weather.class, null, value);
    }

}
