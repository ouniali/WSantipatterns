
package lt.lb.webservices.vilibidvilibor;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.lb.webservices.vilibidvilibor package. 
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

    private final static QName _Decimal_QNAME = new QName("http://webservices.lb.lt/VilibidVilibor", "decimal");
    private final static QName _String_QNAME = new QName("http://webservices.lb.lt/VilibidVilibor", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.lb.webservices.vilibidvilibor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVilibRateTypesResponse }
     * 
     */
    public GetVilibRateTypesResponse createGetVilibRateTypesResponse() {
        return new GetVilibRateTypesResponse();
    }

    /**
     * Create an instance of {@link GetVilibRatesByDateResponse }
     * 
     */
    public GetVilibRatesByDateResponse createGetVilibRatesByDateResponse() {
        return new GetVilibRatesByDateResponse();
    }

    /**
     * Create an instance of {@link GetVilibRatesByRateTypeResponse }
     * 
     */
    public GetVilibRatesByRateTypeResponse createGetVilibRatesByRateTypeResponse() {
        return new GetVilibRatesByRateTypeResponse();
    }

    /**
     * Create an instance of {@link GetVilibRateTypesResponse.GetVilibRateTypesResult }
     * 
     */
    public GetVilibRateTypesResponse.GetVilibRateTypesResult createGetVilibRateTypesResponseGetVilibRateTypesResult() {
        return new GetVilibRateTypesResponse.GetVilibRateTypesResult();
    }

    /**
     * Create an instance of {@link GetVilibRatesByRateType }
     * 
     */
    public GetVilibRatesByRateType createGetVilibRatesByRateType() {
        return new GetVilibRatesByRateType();
    }

    /**
     * Create an instance of {@link GetVilibRatesByDateResponse.GetVilibRatesByDateResult }
     * 
     */
    public GetVilibRatesByDateResponse.GetVilibRatesByDateResult createGetVilibRatesByDateResponseGetVilibRatesByDateResult() {
        return new GetVilibRatesByDateResponse.GetVilibRatesByDateResult();
    }

    /**
     * Create an instance of {@link GetVilibRatesByDateXmlStringResponse }
     * 
     */
    public GetVilibRatesByDateXmlStringResponse createGetVilibRatesByDateXmlStringResponse() {
        return new GetVilibRatesByDateXmlStringResponse();
    }

    /**
     * Create an instance of {@link GetVilibRateResponse }
     * 
     */
    public GetVilibRateResponse createGetVilibRateResponse() {
        return new GetVilibRateResponse();
    }

    /**
     * Create an instance of {@link GetVilibRate }
     * 
     */
    public GetVilibRate createGetVilibRate() {
        return new GetVilibRate();
    }

    /**
     * Create an instance of {@link GetVilibRateTypes }
     * 
     */
    public GetVilibRateTypes createGetVilibRateTypes() {
        return new GetVilibRateTypes();
    }

    /**
     * Create an instance of {@link GetLatestVilibRate }
     * 
     */
    public GetLatestVilibRate createGetLatestVilibRate() {
        return new GetLatestVilibRate();
    }

    /**
     * Create an instance of {@link GetLatestVilibRateResponse }
     * 
     */
    public GetLatestVilibRateResponse createGetLatestVilibRateResponse() {
        return new GetLatestVilibRateResponse();
    }

    /**
     * Create an instance of {@link GetVilibRatesByRateTypeXmlString }
     * 
     */
    public GetVilibRatesByRateTypeXmlString createGetVilibRatesByRateTypeXmlString() {
        return new GetVilibRatesByRateTypeXmlString();
    }

    /**
     * Create an instance of {@link GetVilibRatesByRateTypeXmlStringResponse }
     * 
     */
    public GetVilibRatesByRateTypeXmlStringResponse createGetVilibRatesByRateTypeXmlStringResponse() {
        return new GetVilibRatesByRateTypeXmlStringResponse();
    }

    /**
     * Create an instance of {@link GetVilibRatesByDate }
     * 
     */
    public GetVilibRatesByDate createGetVilibRatesByDate() {
        return new GetVilibRatesByDate();
    }

    /**
     * Create an instance of {@link GetVilibRatesByDateXmlString }
     * 
     */
    public GetVilibRatesByDateXmlString createGetVilibRatesByDateXmlString() {
        return new GetVilibRatesByDateXmlString();
    }

    /**
     * Create an instance of {@link GetVilibRatesByRateTypeResponse.GetVilibRatesByRateTypeResult }
     * 
     */
    public GetVilibRatesByRateTypeResponse.GetVilibRatesByRateTypeResult createGetVilibRatesByRateTypeResponseGetVilibRatesByRateTypeResult() {
        return new GetVilibRatesByRateTypeResponse.GetVilibRatesByRateTypeResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lb.lt/VilibidVilibor", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lb.lt/VilibidVilibor", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
