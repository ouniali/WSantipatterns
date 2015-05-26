
package net.sensebot.svc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.sensebot.svc package. 
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

    private final static QName _String_QNAME = new QName("http://sensebot.net/svc/", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.sensebot.svc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExtractConcepts }
     * 
     */
    public ExtractConcepts createExtractConcepts() {
        return new ExtractConcepts();
    }

    /**
     * Create an instance of {@link ExtractCategories }
     * 
     */
    public ExtractCategories createExtractCategories() {
        return new ExtractCategories();
    }

    /**
     * Create an instance of {@link ExtractCategoriesResponse }
     * 
     */
    public ExtractCategoriesResponse createExtractCategoriesResponse() {
        return new ExtractCategoriesResponse();
    }

    /**
     * Create an instance of {@link ExtractConceptsResponse }
     * 
     */
    public ExtractConceptsResponse createExtractConceptsResponse() {
        return new ExtractConceptsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sensebot.net/svc/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
