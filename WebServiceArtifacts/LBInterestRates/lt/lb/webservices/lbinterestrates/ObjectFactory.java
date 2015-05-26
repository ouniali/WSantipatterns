
package lt.lb.webservices.lbinterestrates;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.lb.webservices.lbinterestrates package. 
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

    private final static QName _String_QNAME = new QName("http://webservices.lb.lt/LBInterestRates", "string");
    private final static QName _Decimal_QNAME = new QName("http://webservices.lb.lt/LBInterestRates", "decimal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.lb.webservices.lbinterestrates
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLBInterestRatesByRateTypeResponse }
     * 
     */
    public GetLBInterestRatesByRateTypeResponse createGetLBInterestRatesByRateTypeResponse() {
        return new GetLBInterestRatesByRateTypeResponse();
    }

    /**
     * Create an instance of {@link GetLBInterestRateTypesResponse }
     * 
     */
    public GetLBInterestRateTypesResponse createGetLBInterestRateTypesResponse() {
        return new GetLBInterestRateTypesResponse();
    }

    /**
     * Create an instance of {@link GetLBInterestRatesByDateResponse }
     * 
     */
    public GetLBInterestRatesByDateResponse createGetLBInterestRatesByDateResponse() {
        return new GetLBInterestRatesByDateResponse();
    }

    /**
     * Create an instance of {@link GetLBInterestRateResponse }
     * 
     */
    public GetLBInterestRateResponse createGetLBInterestRateResponse() {
        return new GetLBInterestRateResponse();
    }

    /**
     * Create an instance of {@link GetLBInterestRatesByDate }
     * 
     */
    public GetLBInterestRatesByDate createGetLBInterestRatesByDate() {
        return new GetLBInterestRatesByDate();
    }

    /**
     * Create an instance of {@link GetLBInterestRatesByRateTypeXmlStringResponse }
     * 
     */
    public GetLBInterestRatesByRateTypeXmlStringResponse createGetLBInterestRatesByRateTypeXmlStringResponse() {
        return new GetLBInterestRatesByRateTypeXmlStringResponse();
    }

    /**
     * Create an instance of {@link GetLBInterestRatesByRateTypeXmlString }
     * 
     */
    public GetLBInterestRatesByRateTypeXmlString createGetLBInterestRatesByRateTypeXmlString() {
        return new GetLBInterestRatesByRateTypeXmlString();
    }

    /**
     * Create an instance of {@link GetLBInterestRateTypes }
     * 
     */
    public GetLBInterestRateTypes createGetLBInterestRateTypes() {
        return new GetLBInterestRateTypes();
    }

    /**
     * Create an instance of {@link GetLBInterestRatesByDateXmlStringResponse }
     * 
     */
    public GetLBInterestRatesByDateXmlStringResponse createGetLBInterestRatesByDateXmlStringResponse() {
        return new GetLBInterestRatesByDateXmlStringResponse();
    }

    /**
     * Create an instance of {@link GetLBInterestRate }
     * 
     */
    public GetLBInterestRate createGetLBInterestRate() {
        return new GetLBInterestRate();
    }

    /**
     * Create an instance of {@link GetLBInterestRatesByRateTypeResponse.GetLBInterestRatesByRateTypeResult }
     * 
     */
    public GetLBInterestRatesByRateTypeResponse.GetLBInterestRatesByRateTypeResult createGetLBInterestRatesByRateTypeResponseGetLBInterestRatesByRateTypeResult() {
        return new GetLBInterestRatesByRateTypeResponse.GetLBInterestRatesByRateTypeResult();
    }

    /**
     * Create an instance of {@link GetLatestLBInterestRate }
     * 
     */
    public GetLatestLBInterestRate createGetLatestLBInterestRate() {
        return new GetLatestLBInterestRate();
    }

    /**
     * Create an instance of {@link GetLBInterestRatesByRateType }
     * 
     */
    public GetLBInterestRatesByRateType createGetLBInterestRatesByRateType() {
        return new GetLBInterestRatesByRateType();
    }

    /**
     * Create an instance of {@link GetLBInterestRateTypesResponse.GetLBInterestRateTypesResult }
     * 
     */
    public GetLBInterestRateTypesResponse.GetLBInterestRateTypesResult createGetLBInterestRateTypesResponseGetLBInterestRateTypesResult() {
        return new GetLBInterestRateTypesResponse.GetLBInterestRateTypesResult();
    }

    /**
     * Create an instance of {@link GetLBInterestRatesByDateXmlString }
     * 
     */
    public GetLBInterestRatesByDateXmlString createGetLBInterestRatesByDateXmlString() {
        return new GetLBInterestRatesByDateXmlString();
    }

    /**
     * Create an instance of {@link GetLBInterestRatesByDateResponse.GetLBInterestRatesByDateResult }
     * 
     */
    public GetLBInterestRatesByDateResponse.GetLBInterestRatesByDateResult createGetLBInterestRatesByDateResponseGetLBInterestRatesByDateResult() {
        return new GetLBInterestRatesByDateResponse.GetLBInterestRatesByDateResult();
    }

    /**
     * Create an instance of {@link GetLatestLBInterestRateResponse }
     * 
     */
    public GetLatestLBInterestRateResponse createGetLatestLBInterestRateResponse() {
        return new GetLatestLBInterestRateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lb.lt/LBInterestRates", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.lb.lt/LBInterestRates", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

}
