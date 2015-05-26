
package com.feedoo.database;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.feedoo.database package. 
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

    private final static QName _String_QNAME = new QName("http://www.feedoo.com/database/", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.feedoo.database
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMsgs }
     * 
     */
    public GetMsgs createGetMsgs() {
        return new GetMsgs();
    }

    /**
     * Create an instance of {@link XchangeMsgsResponse }
     * 
     */
    public XchangeMsgsResponse createXchangeMsgsResponse() {
        return new XchangeMsgsResponse();
    }

    /**
     * Create an instance of {@link GetMsgsResponse }
     * 
     */
    public GetMsgsResponse createGetMsgsResponse() {
        return new GetMsgsResponse();
    }

    /**
     * Create an instance of {@link XchangeMsgs }
     * 
     */
    public XchangeMsgs createXchangeMsgs() {
        return new XchangeMsgs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.feedoo.com/database/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
