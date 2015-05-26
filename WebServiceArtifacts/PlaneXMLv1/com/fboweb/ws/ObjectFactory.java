
package com.fboweb.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fboweb.ws package. 
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

    private final static QName _Registry_QNAME = new QName("http://fboweb.com/ws", "Registry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fboweb.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Registry }
     * 
     */
    public Registry createRegistry() {
        return new Registry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fboweb.com/ws", name = "Registry")
    public JAXBElement<Registry> createRegistry(Registry value) {
        return new JAXBElement<Registry>(_Registry_QNAME, Registry.class, null, value);
    }

}
