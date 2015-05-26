
package com.xignite.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xignite.services package. 
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

    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _Components_QNAME = new QName("http://www.xignite.com/services/", "Components");
    private final static QName _PricedComponents_QNAME = new QName("http://www.xignite.com/services/", "PricedComponents");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIndexComponentsResponse }
     * 
     */
    public GetIndexComponentsResponse createGetIndexComponentsResponse() {
        return new GetIndexComponentsResponse();
    }

    /**
     * Create an instance of {@link Components }
     * 
     */
    public Components createComponents() {
        return new Components();
    }

    /**
     * Create an instance of {@link PricedComponents }
     * 
     */
    public PricedComponents createPricedComponents() {
        return new PricedComponents();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetPricedIndexComponentsSubset }
     * 
     */
    public GetPricedIndexComponentsSubset createGetPricedIndexComponentsSubset() {
        return new GetPricedIndexComponentsSubset();
    }

    /**
     * Create an instance of {@link GetPricedIndexComponentsSubsetResponse }
     * 
     */
    public GetPricedIndexComponentsSubsetResponse createGetPricedIndexComponentsSubsetResponse() {
        return new GetPricedIndexComponentsSubsetResponse();
    }

    /**
     * Create an instance of {@link GetPricedIndexComponents }
     * 
     */
    public GetPricedIndexComponents createGetPricedIndexComponents() {
        return new GetPricedIndexComponents();
    }

    /**
     * Create an instance of {@link GetPricedIndexComponentsResponse }
     * 
     */
    public GetPricedIndexComponentsResponse createGetPricedIndexComponentsResponse() {
        return new GetPricedIndexComponentsResponse();
    }

    /**
     * Create an instance of {@link GetIndexComponents }
     * 
     */
    public GetIndexComponents createGetIndexComponents() {
        return new GetIndexComponents();
    }

    /**
     * Create an instance of {@link ArrayOfPricedComponent }
     * 
     */
    public ArrayOfPricedComponent createArrayOfPricedComponent() {
        return new ArrayOfPricedComponent();
    }

    /**
     * Create an instance of {@link PricedComponent }
     * 
     */
    public PricedComponent createPricedComponent() {
        return new PricedComponent();
    }

    /**
     * Create an instance of {@link ArrayOfComponent }
     * 
     */
    public ArrayOfComponent createArrayOfComponent() {
        return new ArrayOfComponent();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link Component }
     * 
     */
    public Component createComponent() {
        return new Component();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Components }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Components")
    public JAXBElement<Components> createComponents(Components value) {
        return new JAXBElement<Components>(_Components_QNAME, Components.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricedComponents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "PricedComponents")
    public JAXBElement<PricedComponents> createPricedComponents(PricedComponents value) {
        return new JAXBElement<PricedComponents>(_PricedComponents_QNAME, PricedComponents.class, null, value);
    }

}
