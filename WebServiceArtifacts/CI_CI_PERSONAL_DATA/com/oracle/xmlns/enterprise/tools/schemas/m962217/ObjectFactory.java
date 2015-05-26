
package com.oracle.xmlns.enterprise.tools.schemas.m962217;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.enterprise.tools.schemas.m962217 package. 
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

    private final static QName _GetCompIntfcCIPERSONALDATA_QNAME = new QName("http://xmlns.oracle.com/Enterprise/Tools/schemas/M962217.V1", "Get__CompIntfc__CI_PERSONAL_DATA");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.enterprise.tools.schemas.m962217
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompIntfcCIPERSONALDATATypeShape }
     * 
     */
    public GetCompIntfcCIPERSONALDATATypeShape createGetCompIntfcCIPERSONALDATATypeShape() {
        return new GetCompIntfcCIPERSONALDATATypeShape();
    }

    /**
     * Create an instance of {@link KEYPROPEMPLIDTypeShape }
     * 
     */
    public KEYPROPEMPLIDTypeShape createKEYPROPEMPLIDTypeShape() {
        return new KEYPROPEMPLIDTypeShape();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompIntfcCIPERSONALDATATypeShape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Enterprise/Tools/schemas/M962217.V1", name = "Get__CompIntfc__CI_PERSONAL_DATA")
    public JAXBElement<GetCompIntfcCIPERSONALDATATypeShape> createGetCompIntfcCIPERSONALDATA(GetCompIntfcCIPERSONALDATATypeShape value) {
        return new JAXBElement<GetCompIntfcCIPERSONALDATATypeShape>(_GetCompIntfcCIPERSONALDATA_QNAME, GetCompIntfcCIPERSONALDATATypeShape.class, null, value);
    }

}
