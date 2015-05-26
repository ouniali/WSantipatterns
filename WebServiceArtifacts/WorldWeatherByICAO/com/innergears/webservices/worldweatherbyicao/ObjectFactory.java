
package com.innergears.webservices.worldweatherbyicao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.innergears.webservices.worldweatherbyicao package. 
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

    private final static QName _ArrayOfString_QNAME = new QName("http://innergears.com/WebServices/WorldWeatherByICAO", "ArrayOfString");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.innergears.webservices.worldweatherbyicao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWorldWeatherByICAOResponse }
     * 
     */
    public GetWorldWeatherByICAOResponse createGetWorldWeatherByICAOResponse() {
        return new GetWorldWeatherByICAOResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetWorldWeatherByICAO }
     * 
     */
    public GetWorldWeatherByICAO createGetWorldWeatherByICAO() {
        return new GetWorldWeatherByICAO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://innergears.com/WebServices/WorldWeatherByICAO", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

}
