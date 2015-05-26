
package defaultnamespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the defaultnamespace package. 
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

    private final static QName _SOAPchemEquationResultResult_QNAME = new QName("http://DefaultNamespace", "result");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: defaultnamespace
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Solve }
     * 
     */
    public Solve createSolve() {
        return new Solve();
    }

    /**
     * Create an instance of {@link SolveResponse }
     * 
     */
    public SolveResponse createSolveResponse() {
        return new SolveResponse();
    }

    /**
     * Create an instance of {@link SOAPchemEquationResult }
     * 
     */
    public SOAPchemEquationResult createSOAPchemEquationResult() {
        return new SOAPchemEquationResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "result", scope = SOAPchemEquationResult.class)
    public JAXBElement<String> createSOAPchemEquationResultResult(String value) {
        return new JAXBElement<String>(_SOAPchemEquationResultResult_QNAME, String.class, SOAPchemEquationResult.class, value);
    }

}
