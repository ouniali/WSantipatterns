
package ca.ubc.cstudies.netpub.dotnet.webservices.weatherservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ca.ubc.cstudies.netpub.dotnet.webservices.weatherservice package. 
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

    private final static QName _WeatherObject_QNAME = new QName("http://netpub.cstudies.ubc.ca/dotnet/webservices/WeatherService", "WeatherObject");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ca.ubc.cstudies.netpub.dotnet.webservices.weatherservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Weather }
     * 
     */
    public Weather createWeather() {
        return new Weather();
    }

    /**
     * Create an instance of {@link WeatherResponse }
     * 
     */
    public WeatherResponse createWeatherResponse() {
        return new WeatherResponse();
    }

    /**
     * Create an instance of {@link WeatherObject }
     * 
     */
    public WeatherObject createWeatherObject() {
        return new WeatherObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeatherObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netpub.cstudies.ubc.ca/dotnet/webservices/WeatherService", name = "WeatherObject")
    public JAXBElement<WeatherObject> createWeatherObject(WeatherObject value) {
        return new JAXBElement<WeatherObject>(_WeatherObject_QNAME, WeatherObject.class, null, value);
    }

}
