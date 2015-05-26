
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

    private final static QName _SOAPjmolResultData_QNAME = new QName("http://DefaultNamespace", "data");
    private final static QName _SOAPjmolResultUrl_QNAME = new QName("http://DefaultNamespace", "url");
    private final static QName _SOAPjmolResultError_QNAME = new QName("http://DefaultNamespace", "error");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: defaultnamespace
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RenderResponse }
     * 
     */
    public RenderResponse createRenderResponse() {
        return new RenderResponse();
    }

    /**
     * Create an instance of {@link SOAPjmolResult }
     * 
     */
    public SOAPjmolResult createSOAPjmolResult() {
        return new SOAPjmolResult();
    }

    /**
     * Create an instance of {@link Render }
     * 
     */
    public Render createRender() {
        return new Render();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "data", scope = SOAPjmolResult.class)
    public JAXBElement<byte[]> createSOAPjmolResultData(byte[] value) {
        return new JAXBElement<byte[]>(_SOAPjmolResultData_QNAME, byte[].class, SOAPjmolResult.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "url", scope = SOAPjmolResult.class)
    public JAXBElement<String> createSOAPjmolResultUrl(String value) {
        return new JAXBElement<String>(_SOAPjmolResultUrl_QNAME, String.class, SOAPjmolResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DefaultNamespace", name = "error", scope = SOAPjmolResult.class)
    public JAXBElement<String> createSOAPjmolResultError(String value) {
        return new JAXBElement<String>(_SOAPjmolResultError_QNAME, String.class, SOAPjmolResult.class, value);
    }

}
