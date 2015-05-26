
package inforcyl.services.faresearch._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.inforcyl.services.v_1_3.faresearch.input.xsd.FareSearchInput;
import com.inforcyl.services.v_1_3.faresearch.output.xsd.FareSearchOutput;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the inforcyl.services.faresearch._1 package. 
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

    private final static QName _ExecuteResponseReturn_QNAME = new QName("http://inforcyl/services/FareSearch/1.3", "return");
    private final static QName _ExecuteFaresearchInput_QNAME = new QName("http://inforcyl/services/FareSearch/1.3", "faresearch_input");
    private final static QName _ExceptionException_QNAME = new QName("http://inforcyl/services/FareSearch/1.3", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: inforcyl.services.faresearch._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExecuteResponse }
     * 
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link Execute }
     * 
     */
    public Execute createExecute() {
        return new Execute();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareSearchOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inforcyl/services/FareSearch/1.3", name = "return", scope = ExecuteResponse.class)
    public JAXBElement<FareSearchOutput> createExecuteResponseReturn(FareSearchOutput value) {
        return new JAXBElement<FareSearchOutput>(_ExecuteResponseReturn_QNAME, FareSearchOutput.class, ExecuteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareSearchInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inforcyl/services/FareSearch/1.3", name = "faresearch_input", scope = Execute.class)
    public JAXBElement<FareSearchInput> createExecuteFaresearchInput(FareSearchInput value) {
        return new JAXBElement<FareSearchInput>(_ExecuteFaresearchInput_QNAME, FareSearchInput.class, Execute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inforcyl/services/FareSearch/1.3", name = "Exception", scope = Exception.class)
    public JAXBElement<Object> createExceptionException(Object value) {
        return new JAXBElement<Object>(_ExceptionException_QNAME, Object.class, Exception.class, value);
    }

}
