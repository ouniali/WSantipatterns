
package com.tourico.schemas.webservices.faults;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tourico.schemas.webservices.faults package. 
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

    private final static QName _WSFault_QNAME = new QName("http://schemas.tourico.com/webservices/faults", "WSFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tourico.schemas.webservices.faults
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WSFault }
     * 
     */
    public WSFault createWSFault() {
        return new WSFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.tourico.com/webservices/faults", name = "WSFault")
    public JAXBElement<WSFault> createWSFault(WSFault value) {
        return new JAXBElement<WSFault>(_WSFault_QNAME, WSFault.class, null, value);
    }

}
