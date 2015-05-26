
package com.tourico.schemas.webservices.authentication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tourico.schemas.webservices.authentication package. 
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

    private final static QName _AuthenticationHeader_QNAME = new QName("http://schemas.tourico.com/webservices/authentication", "AuthenticationHeader");
    private final static QName _Culture_QNAME = new QName("http://schemas.tourico.com/webservices/authentication", "Culture");
    private final static QName _AuthenticationHeaderVersion_QNAME = new QName("http://schemas.tourico.com/webservices/authentication", "Version");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tourico.schemas.webservices.authentication
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthenticationHeader }
     * 
     */
    public AuthenticationHeader createAuthenticationHeader() {
        return new AuthenticationHeader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.tourico.com/webservices/authentication", name = "AuthenticationHeader")
    public JAXBElement<AuthenticationHeader> createAuthenticationHeader(AuthenticationHeader value) {
        return new JAXBElement<AuthenticationHeader>(_AuthenticationHeader_QNAME, AuthenticationHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Culture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.tourico.com/webservices/authentication", name = "Culture")
    public JAXBElement<Culture> createCulture(Culture value) {
        return new JAXBElement<Culture>(_Culture_QNAME, Culture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.tourico.com/webservices/authentication", name = "Version", scope = AuthenticationHeader.class)
    public JAXBElement<String> createAuthenticationHeaderVersion(String value) {
        return new JAXBElement<String>(_AuthenticationHeaderVersion_QNAME, String.class, AuthenticationHeader.class, value);
    }

}
