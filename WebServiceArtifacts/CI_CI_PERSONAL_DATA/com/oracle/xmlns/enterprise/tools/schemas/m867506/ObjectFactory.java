
package com.oracle.xmlns.enterprise.tools.schemas.m867506;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.enterprise.tools.schemas.m867506 package. 
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

    private final static QName _FindCompIntfcCIPERSONALDATA_QNAME = new QName("http://xmlns.oracle.com/Enterprise/Tools/schemas/M867506.V1", "Find__CompIntfc__CI_PERSONAL_DATA");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.enterprise.tools.schemas.m867506
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindCompIntfcCIPERSONALDATATypeShape }
     * 
     */
    public FindCompIntfcCIPERSONALDATATypeShape createFindCompIntfcCIPERSONALDATATypeShape() {
        return new FindCompIntfcCIPERSONALDATATypeShape();
    }

    /**
     * Create an instance of {@link PROPNAMETypeShape }
     * 
     */
    public PROPNAMETypeShape createPROPNAMETypeShape() {
        return new PROPNAMETypeShape();
    }

    /**
     * Create an instance of {@link KEYPROPEMPLIDTypeShape }
     * 
     */
    public KEYPROPEMPLIDTypeShape createKEYPROPEMPLIDTypeShape() {
        return new KEYPROPEMPLIDTypeShape();
    }

    /**
     * Create an instance of {@link PROPNAMEACTypeShape }
     * 
     */
    public PROPNAMEACTypeShape createPROPNAMEACTypeShape() {
        return new PROPNAMEACTypeShape();
    }

    /**
     * Create an instance of {@link PROPLASTNAMESRCHTypeShape }
     * 
     */
    public PROPLASTNAMESRCHTypeShape createPROPLASTNAMESRCHTypeShape() {
        return new PROPLASTNAMESRCHTypeShape();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCompIntfcCIPERSONALDATATypeShape }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/Enterprise/Tools/schemas/M867506.V1", name = "Find__CompIntfc__CI_PERSONAL_DATA")
    public JAXBElement<FindCompIntfcCIPERSONALDATATypeShape> createFindCompIntfcCIPERSONALDATA(FindCompIntfcCIPERSONALDATATypeShape value) {
        return new JAXBElement<FindCompIntfcCIPERSONALDATATypeShape>(_FindCompIntfcCIPERSONALDATA_QNAME, FindCompIntfcCIPERSONALDATATypeShape.class, null, value);
    }

}
