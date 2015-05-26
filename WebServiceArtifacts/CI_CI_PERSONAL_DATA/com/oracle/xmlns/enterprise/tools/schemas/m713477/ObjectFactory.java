
package com.oracle.xmlns.enterprise.tools.schemas.m713477;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.enterprise.tools.schemas.m713477 package. 
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

    private final static QName _UpdateCompIntfcCIPERSONALDATAResponse_QNAME = new QName("http://xmlns.oracle.com/Enterprise/Tools/schemas/M713477.V1", "Update__CompIntfc__CI_PERSONAL_DATAResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.enterprise.tools.schemas.m713477
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateCompIntfcCIPERSONALDATAResponseTypeShape }
     * 
     */
    public UpdateCompIntfcCIPERSONALDATAResponseTypeShape createUpdateCompIntfcCIPERSONALDATAResponseTypeShape() {
        return new UpdateCompIntfcCIPERSONALDATAResponseTypeShape();
    }

    /**
     * Create an instance of {@link MessagesComplexTypeShape }
     * 
     */
    public MessagesComplexTypeShape createMessagesComplexTypeShape() {
        return new MessagesComplexTypeShape();
    }

    /**
     * Create an instance of {@link ExplaintextTypeShape }
     * 
     */
    public ExplaintextTypeShape createExplaintextTypeShape() {
        return new ExplaintextTypeShape();
    }

    /**
     * Create an instance of {@link MessagesetnumberTypeShape }
     * 
     */
    public MessagesetnumberTypeShape createMessagesetnumberTypeShape() {
        return new MessagesetnumberTypeShape();
    }

    /**
     * Create an instance of {@link DetailComplexTypeShape }
     * 
     */
    public DetailComplexTypeShape createDetailComplexTypeShape() {
        return new DetailComplexTypeShape();
    }

    /**
     * Create an instance of {@link TypeTypeShape }
     * 
     */
    public TypeTypeShape createTypeTypeShape() {
        return new TypeTypeShape();
    }

    /**
     * Create an instance of {@link NotificationTypeShape }
     * 
     */
    public NotificationTypeShape createNotificationTypeShape() {
        return new NotificationTypeShape();
    }

    /**
     * Create an instance of {@link MessagetextTypeShape }
     * 
     */
    public MessagetextTypeShape createMessagetextTypeShape() {
        return new MessagetextTypeShape();
    }

    /**
     * Create an instance of {@link MessagenumberTypeShape }
     * 
     */
    public MessagenumberTypeShape createMessagenumberTypeShape() {
        return new MessagenumberTypeShape();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCompIntfcCIPERSONALDATAResponseTypeShape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Enterprise/Tools/schemas/M713477.V1", name = "Update__CompIntfc__CI_PERSONAL_DATAResponse")
    public JAXBElement<UpdateCompIntfcCIPERSONALDATAResponseTypeShape> createUpdateCompIntfcCIPERSONALDATAResponse(UpdateCompIntfcCIPERSONALDATAResponseTypeShape value) {
        return new JAXBElement<UpdateCompIntfcCIPERSONALDATAResponseTypeShape>(_UpdateCompIntfcCIPERSONALDATAResponse_QNAME, UpdateCompIntfcCIPERSONALDATAResponseTypeShape.class, null, value);
    }

}
