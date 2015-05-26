
package com.v3leisure.schemas.cabs._1_0.cabs_provideroptin_rs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.v3leisure.schemas.cabs._1_0.cabs_provideroptin_rs package. 
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

    private final static QName _CABSProviderOptInRS_QNAME = new QName("http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderOptIn_RS.xsd", "CABS_ProviderOptIn_RS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.v3leisure.schemas.cabs._1_0.cabs_provideroptin_rs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CABSProviderOptInRS }
     * 
     */
    public CABSProviderOptInRS createCABSProviderOptInRS() {
        return new CABSProviderOptInRS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CABSProviderOptInRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.v3leisure.com/Schemas/CABS/1.0/CABS_ProviderOptIn_RS.xsd", name = "CABS_ProviderOptIn_RS")
    public JAXBElement<CABSProviderOptInRS> createCABSProviderOptInRS(CABSProviderOptInRS value) {
        return new JAXBElement<CABSProviderOptInRS>(_CABSProviderOptInRS_QNAME, CABSProviderOptInRS.class, null, value);
    }

}
