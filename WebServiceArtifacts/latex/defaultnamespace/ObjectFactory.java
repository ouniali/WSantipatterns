
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

    private final static QName _SOAPlatexResultData_QNAME = new QName("http://DefaultNamespace", "data");
    private final static QName _SOAPlatexResultUrl_QNAME = new QName("http://DefaultNamespace", "url");
    private final static QName _SOAPlatexResultError_QNAME = new QName("http://DefaultNamespace", "error");
    private final static QName _SOAPlatexResultFileExt_QNAME = new QName("http://DefaultNamespace", "fileExt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: defaultnamespace
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Compile }
     * 
     */
    public Compile createCompile() {
        return new Compile();
    }

    /**
     * Create an instance of {@link CompileResponse }
     * 
     */
    public CompileResponse createCompileResponse() {
        return new CompileResponse();
    }

    /**
     * Create an instance of {@link SOAPlatexResult }
     * 
     */
    public SOAPlatexResult createSOAPlatexResult() {
        return new SOAPlatexResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "data", scope = SOAPlatexResult.class)
    public JAXBElement<byte[]> createSOAPlatexResultData(byte[] value) {
        return new JAXBElement<byte[]>(_SOAPlatexResultData_QNAME, byte[].class, SOAPlatexResult.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "url", scope = SOAPlatexResult.class)
    public JAXBElement<String> createSOAPlatexResultUrl(String value) {
        return new JAXBElement<String>(_SOAPlatexResultUrl_QNAME, String.class, SOAPlatexResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "error", scope = SOAPlatexResult.class)
    public JAXBElement<String> createSOAPlatexResultError(String value) {
        return new JAXBElement<String>(_SOAPlatexResultError_QNAME, String.class, SOAPlatexResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "fileExt", scope = SOAPlatexResult.class)
    public JAXBElement<String> createSOAPlatexResultFileExt(String value) {
        return new JAXBElement<String>(_SOAPlatexResultFileExt_QNAME, String.class, SOAPlatexResult.class, value);
    }

}
