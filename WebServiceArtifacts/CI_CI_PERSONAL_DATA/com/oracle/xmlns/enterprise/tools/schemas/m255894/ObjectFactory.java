
package com.oracle.xmlns.enterprise.tools.schemas.m255894;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.enterprise.tools.schemas.m255894 package. 
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

    private final static QName _UpdatedataCompIntfcCIPERSONALDATAResponse_QNAME = new QName("http://xmlns.oracle.com/Enterprise/Tools/schemas/M255894.V1", "Updatedata__CompIntfc__CI_PERSONAL_DATAResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.enterprise.tools.schemas.m255894
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdatedataCompIntfcCIPERSONALDATAResponseTypeShape }
     * 
     */
    public UpdatedataCompIntfcCIPERSONALDATAResponseTypeShape createUpdatedataCompIntfcCIPERSONALDATAResponseTypeShape() {
        return new UpdatedataCompIntfcCIPERSONALDATAResponseTypeShape();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatedataCompIntfcCIPERSONALDATAResponseTypeShape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Enterprise/Tools/schemas/M255894.V1", name = "Updatedata__CompIntfc__CI_PERSONAL_DATAResponse")
    public JAXBElement<UpdatedataCompIntfcCIPERSONALDATAResponseTypeShape> createUpdatedataCompIntfcCIPERSONALDATAResponse(UpdatedataCompIntfcCIPERSONALDATAResponseTypeShape value) {
        return new JAXBElement<UpdatedataCompIntfcCIPERSONALDATAResponseTypeShape>(_UpdatedataCompIntfcCIPERSONALDATAResponse_QNAME, UpdatedataCompIntfcCIPERSONALDATAResponseTypeShape.class, null, value);
    }

}
