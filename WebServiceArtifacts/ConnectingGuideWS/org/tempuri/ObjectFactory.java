
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _ReturnMessage_QNAME = new QName("http://tempuri.org/", "ReturnMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnMessage }
     * 
     */
    public ReturnMessage createReturnMessage() {
        return new ReturnMessage();
    }

    /**
     * Create an instance of {@link GetGuideMessages }
     * 
     */
    public GetGuideMessages createGetGuideMessages() {
        return new GetGuideMessages();
    }

    /**
     * Create an instance of {@link GetGuideMessagesResponse }
     * 
     */
    public GetGuideMessagesResponse createGetGuideMessagesResponse() {
        return new GetGuideMessagesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReturnMessage")
    public JAXBElement<ReturnMessage> createReturnMessage(ReturnMessage value) {
        return new JAXBElement<ReturnMessage>(_ReturnMessage_QNAME, ReturnMessage.class, null, value);
    }

}
