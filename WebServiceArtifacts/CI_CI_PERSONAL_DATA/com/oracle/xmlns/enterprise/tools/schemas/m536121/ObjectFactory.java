
package com.oracle.xmlns.enterprise.tools.schemas.m536121;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.enterprise.tools.schemas.m536121 package. 
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

    private final static QName _CreateCompIntfcCIPERSONALDATAResponse_QNAME = new QName("http://xmlns.oracle.com/Enterprise/Tools/schemas/M536121.V1", "Create__CompIntfc__CI_PERSONAL_DATAResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.enterprise.tools.schemas.m536121
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateCompIntfcCIPERSONALDATAResponseTypeShape }
     * 
     */
    public CreateCompIntfcCIPERSONALDATAResponseTypeShape createCreateCompIntfcCIPERSONALDATAResponseTypeShape() {
        return new CreateCompIntfcCIPERSONALDATAResponseTypeShape();
    }

    /**
     * Create an instance of {@link CIPERSONALDATAComplexTypeShape }
     * 
     */
    public CIPERSONALDATAComplexTypeShape createCIPERSONALDATAComplexTypeShape() {
        return new CIPERSONALDATAComplexTypeShape();
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
     * Create an instance of {@link KEYPROPEMPLIDTypeShape }
     * 
     */
    public KEYPROPEMPLIDTypeShape createKEYPROPEMPLIDTypeShape() {
        return new KEYPROPEMPLIDTypeShape();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCompIntfcCIPERSONALDATAResponseTypeShape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Enterprise/Tools/schemas/M536121.V1", name = "Create__CompIntfc__CI_PERSONAL_DATAResponse")
    public JAXBElement<CreateCompIntfcCIPERSONALDATAResponseTypeShape> createCreateCompIntfcCIPERSONALDATAResponse(CreateCompIntfcCIPERSONALDATAResponseTypeShape value) {
        return new JAXBElement<CreateCompIntfcCIPERSONALDATAResponseTypeShape>(_CreateCompIntfcCIPERSONALDATAResponse_QNAME, CreateCompIntfcCIPERSONALDATAResponseTypeShape.class, null, value);
    }

}
