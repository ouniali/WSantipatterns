
package jp.yahooapis.ss.v5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.yahooapis.ss.v5 package. 
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

    private final static QName _ResponseHeader_QNAME = new QName("http://ss.yahooapis.jp/V5", "ResponseHeader");
    private final static QName _ApiExceptionFault_QNAME = new QName("http://ss.yahooapis.jp/V5", "ApiExceptionFault");
    private final static QName _RequestHeader_QNAME = new QName("http://ss.yahooapis.jp/V5", "RequestHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.yahooapis.ss.v5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SoapResponseHeader }
     * 
     */
    public SoapResponseHeader createSoapResponseHeader() {
        return new SoapResponseHeader();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link KeywordEstimatorPage }
     * 
     */
    public KeywordEstimatorPage createKeywordEstimatorPage() {
        return new KeywordEstimatorPage();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link KeywordEstimatorSelector }
     * 
     */
    public KeywordEstimatorSelector createKeywordEstimatorSelector() {
        return new KeywordEstimatorSelector();
    }

    /**
     * Create an instance of {@link SoapHeader }
     * 
     */
    public SoapHeader createSoapHeader() {
        return new SoapHeader();
    }

    /**
     * Create an instance of {@link CampaignEstimateRequest }
     * 
     */
    public CampaignEstimateRequest createCampaignEstimateRequest() {
        return new CampaignEstimateRequest();
    }

    /**
     * Create an instance of {@link KeywordEstimateResult }
     * 
     */
    public KeywordEstimateResult createKeywordEstimateResult() {
        return new KeywordEstimateResult();
    }

    /**
     * Create an instance of {@link KeywordEstimateValues }
     * 
     */
    public KeywordEstimateValues createKeywordEstimateValues() {
        return new KeywordEstimateValues();
    }

    /**
     * Create an instance of {@link ErrorDetail }
     * 
     */
    public ErrorDetail createErrorDetail() {
        return new ErrorDetail();
    }

    /**
     * Create an instance of {@link EstimateResult }
     * 
     */
    public EstimateResult createEstimateResult() {
        return new EstimateResult();
    }

    /**
     * Create an instance of {@link EstimateKeyword }
     * 
     */
    public EstimateKeyword createEstimateKeyword() {
        return new EstimateKeyword();
    }

    /**
     * Create an instance of {@link KeywordEstimateRequest }
     * 
     */
    public KeywordEstimateRequest createKeywordEstimateRequest() {
        return new KeywordEstimateRequest();
    }

    /**
     * Create an instance of {@link AdGroupEstimateRequest }
     * 
     */
    public AdGroupEstimateRequest createAdGroupEstimateRequest() {
        return new AdGroupEstimateRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ss.yahooapis.jp/V5", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ss.yahooapis.jp/V5", name = "ApiExceptionFault")
    public JAXBElement<String> createApiExceptionFault(String value) {
        return new JAXBElement<String>(_ApiExceptionFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ss.yahooapis.jp/V5", name = "RequestHeader")
    public JAXBElement<SoapHeader> createRequestHeader(SoapHeader value) {
        return new JAXBElement<SoapHeader>(_RequestHeader_QNAME, SoapHeader.class, null, value);
    }

}
