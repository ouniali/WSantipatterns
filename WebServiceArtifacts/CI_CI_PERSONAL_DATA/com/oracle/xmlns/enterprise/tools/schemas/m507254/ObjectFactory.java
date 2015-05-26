
package com.oracle.xmlns.enterprise.tools.schemas.m507254;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.enterprise.tools.schemas.m507254 package. 
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

    private final static QName _CIFault_QNAME = new QName("http://xmlns.oracle.com/Enterprise/Tools/schemas/M507254.V1", "CIFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.enterprise.tools.schemas.m507254
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CIFaultTypeShape }
     * 
     */
    public CIFaultTypeShape createCIFaultTypeShape() {
        return new CIFaultTypeShape();
    }

    /**
     * Create an instance of {@link MessageIDTypeShape }
     * 
     */
    public MessageIDTypeShape createMessageIDTypeShape() {
        return new MessageIDTypeShape();
    }

    /**
     * Create an instance of {@link MessageSetIDTypeShape }
     * 
     */
    public MessageSetIDTypeShape createMessageSetIDTypeShape() {
        return new MessageSetIDTypeShape();
    }

    /**
     * Create an instance of {@link DefaultMessageTypeShape }
     * 
     */
    public DefaultMessageTypeShape createDefaultMessageTypeShape() {
        return new DefaultMessageTypeShape();
    }

    /**
     * Create an instance of {@link MessageParametersComplexTypeShape }
     * 
     */
    public MessageParametersComplexTypeShape createMessageParametersComplexTypeShape() {
        return new MessageParametersComplexTypeShape();
    }

    /**
     * Create an instance of {@link KEYPROPEMPLIDTypeShape }
     * 
     */
    public KEYPROPEMPLIDTypeShape createKEYPROPEMPLIDTypeShape() {
        return new KEYPROPEMPLIDTypeShape();
    }

    /**
     * Create an instance of {@link StatusCodeTypeShape }
     * 
     */
    public StatusCodeTypeShape createStatusCodeTypeShape() {
        return new StatusCodeTypeShape();
    }

    /**
     * Create an instance of {@link KeyinformationComplexTypeShape }
     * 
     */
    public KeyinformationComplexTypeShape createKeyinformationComplexTypeShape() {
        return new KeyinformationComplexTypeShape();
    }

    /**
     * Create an instance of {@link DefaultTitleTypeShape }
     * 
     */
    public DefaultTitleTypeShape createDefaultTitleTypeShape() {
        return new DefaultTitleTypeShape();
    }

    /**
     * Create an instance of {@link IBResponseComplexTypeShape }
     * 
     */
    public IBResponseComplexTypeShape createIBResponseComplexTypeShape() {
        return new IBResponseComplexTypeShape();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIFaultTypeShape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Enterprise/Tools/schemas/M507254.V1", name = "CIFault")
    public JAXBElement<CIFaultTypeShape> createCIFault(CIFaultTypeShape value) {
        return new JAXBElement<CIFaultTypeShape>(_CIFault_QNAME, CIFaultTypeShape.class, null, value);
    }

}
