
package ro.platforma_broker.security;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ro.platforma_broker.security package. 
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

    private final static QName _AuthenticationStatus_QNAME = new QName("http://www.platforma-broker.ro/security", "AuthenticationStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ro.platforma_broker.security
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/security", name = "AuthenticationStatus")
    public JAXBElement<AuthenticationStatus> createAuthenticationStatus(AuthenticationStatus value) {
        return new JAXBElement<AuthenticationStatus>(_AuthenticationStatus_QNAME, AuthenticationStatus.class, null, value);
    }

}
