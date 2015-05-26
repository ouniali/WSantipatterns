
package ofac_us;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ofac_us package. 
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

    private final static QName _OfacResultsS_QNAME = new QName("http://ofac_us/", "ofac_resultsS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ofac_us
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OfacResultsS }
     * 
     */
    public OfacResultsS createOfacResultsS() {
        return new OfacResultsS();
    }

    /**
     * Create an instance of {@link OFACSearchResponse }
     * 
     */
    public OFACSearchResponse createOFACSearchResponse() {
        return new OFACSearchResponse();
    }

    /**
     * Create an instance of {@link OFACSearch }
     * 
     */
    public OFACSearch createOFACSearch() {
        return new OFACSearch();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfacResultsS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ofac_us/", name = "ofac_resultsS")
    public JAXBElement<OfacResultsS> createOfacResultsS(OfacResultsS value) {
        return new JAXBElement<OfacResultsS>(_OfacResultsS_QNAME, OfacResultsS.class, null, value);
    }

}
