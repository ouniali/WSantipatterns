
package com.serviceobjects;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.serviceobjects package. 
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

    private final static QName _TaxInfo_QNAME = new QName("http://www.serviceobjects.com/", "TaxInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.serviceobjects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTaxInfo }
     * 
     */
    public GetTaxInfo createGetTaxInfo() {
        return new GetTaxInfo();
    }

    /**
     * Create an instance of {@link TaxInfo }
     * 
     */
    public TaxInfo createTaxInfo() {
        return new TaxInfo();
    }

    /**
     * Create an instance of {@link GetTaxInfoResponse }
     * 
     */
    public GetTaxInfoResponse createGetTaxInfoResponse() {
        return new GetTaxInfoResponse();
    }

    /**
     * Create an instance of {@link Err }
     * 
     */
    public Err createErr() {
        return new Err();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.serviceobjects.com/", name = "TaxInfo")
    public JAXBElement<TaxInfo> createTaxInfo(TaxInfo value) {
        return new JAXBElement<TaxInfo>(_TaxInfo_QNAME, TaxInfo.class, null, value);
    }

}
