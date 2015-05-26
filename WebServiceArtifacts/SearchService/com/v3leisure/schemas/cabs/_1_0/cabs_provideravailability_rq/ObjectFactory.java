
package com.v3leisure.schemas.cabs._1_0.cabs_provideravailability_rq;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.v3leisure.schemas.cabs._1_0.cabs_provideravailability_rq package. 
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

    private final static QName _CABSProviderAvailabilityRQ_QNAME = new QName("http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderAvailability_RQ.xsd", "CABS_ProviderAvailability_RQ");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.v3leisure.schemas.cabs._1_0.cabs_provideravailability_rq
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CABSProviderAvailabilityRQ }
     * 
     */
    public CABSProviderAvailabilityRQ createCABSProviderAvailabilityRQ() {
        return new CABSProviderAvailabilityRQ();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CABSProviderAvailabilityRQ }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderAvailability_RQ.xsd", name = "CABS_ProviderAvailability_RQ")
    public JAXBElement<CABSProviderAvailabilityRQ> createCABSProviderAvailabilityRQ(CABSProviderAvailabilityRQ value) {
        return new JAXBElement<CABSProviderAvailabilityRQ>(_CABSProviderAvailabilityRQ_QNAME, CABSProviderAvailabilityRQ.class, null, value);
    }

}
