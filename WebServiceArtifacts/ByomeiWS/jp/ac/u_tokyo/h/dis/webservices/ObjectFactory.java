
package jp.ac.u_tokyo.h.dis.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jp.ac.u_tokyo.h.dis.webservices package. 
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

    private final static QName _ArrayOfString_QNAME = new QName("http://www.dis.h.u-tokyo.ac.jp/webservices/", "ArrayOfString");
    private final static QName _String_QNAME = new QName("http://www.dis.h.u-tokyo.ac.jp/webservices/", "string");
    private final static QName _ResultElement_QNAME = new QName("http://www.dis.h.u-tokyo.ac.jp/webservices/", "resultElement");
    private final static QName _ByomeiSearchResult_QNAME = new QName("http://www.dis.h.u-tokyo.ac.jp/webservices/", "ByomeiSearchResult");
    private final static QName _ArrayOfResultElement_QNAME = new QName("http://www.dis.h.u-tokyo.ac.jp/webservices/", "ArrayOfResultElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jp.ac.u_tokyo.h.dis.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ByomeiSearchResult }
     * 
     */
    public ByomeiSearchResult createByomeiSearchResult() {
        return new ByomeiSearchResult();
    }

    /**
     * Create an instance of {@link ConvertStringResponse }
     * 
     */
    public ConvertStringResponse createConvertStringResponse() {
        return new ConvertStringResponse();
    }

    /**
     * Create an instance of {@link GetICD10TitleResponse }
     * 
     */
    public GetICD10TitleResponse createGetICD10TitleResponse() {
        return new GetICD10TitleResponse();
    }

    /**
     * Create an instance of {@link ByomeiSearch }
     * 
     */
    public ByomeiSearch createByomeiSearch() {
        return new ByomeiSearch();
    }

    /**
     * Create an instance of {@link ByomeiSearchResponse }
     * 
     */
    public ByomeiSearchResponse createByomeiSearchResponse() {
        return new ByomeiSearchResponse();
    }

    /**
     * Create an instance of {@link GetICD10Title }
     * 
     */
    public GetICD10Title createGetICD10Title() {
        return new GetICD10Title();
    }

    /**
     * Create an instance of {@link ConvertString }
     * 
     */
    public ConvertString createConvertString() {
        return new ConvertString();
    }

    /**
     * Create an instance of {@link GetICD10 }
     * 
     */
    public GetICD10 createGetICD10() {
        return new GetICD10();
    }

    /**
     * Create an instance of {@link GetByomei }
     * 
     */
    public GetByomei createGetByomei() {
        return new GetByomei();
    }

    /**
     * Create an instance of {@link ResembleDnameResponse }
     * 
     */
    public ResembleDnameResponse createResembleDnameResponse() {
        return new ResembleDnameResponse();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link GetSakuinResponse }
     * 
     */
    public GetSakuinResponse createGetSakuinResponse() {
        return new GetSakuinResponse();
    }

    /**
     * Create an instance of {@link GetVersion }
     * 
     */
    public GetVersion createGetVersion() {
        return new GetVersion();
    }

    /**
     * Create an instance of {@link RegDnameResponse }
     * 
     */
    public RegDnameResponse createRegDnameResponse() {
        return new RegDnameResponse();
    }

    /**
     * Create an instance of {@link FormatICD }
     * 
     */
    public FormatICD createFormatICD() {
        return new FormatICD();
    }

    /**
     * Create an instance of {@link GetICD10Response }
     * 
     */
    public GetICD10Response createGetICD10Response() {
        return new GetICD10Response();
    }

    /**
     * Create an instance of {@link ResultElement }
     * 
     */
    public ResultElement createResultElement() {
        return new ResultElement();
    }

    /**
     * Create an instance of {@link ArrayOfResultElement }
     * 
     */
    public ArrayOfResultElement createArrayOfResultElement() {
        return new ArrayOfResultElement();
    }

    /**
     * Create an instance of {@link GetByomeiResponse }
     * 
     */
    public GetByomeiResponse createGetByomeiResponse() {
        return new GetByomeiResponse();
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link RegDname }
     * 
     */
    public RegDname createRegDname() {
        return new RegDname();
    }

    /**
     * Create an instance of {@link EnumByomei }
     * 
     */
    public EnumByomei createEnumByomei() {
        return new EnumByomei();
    }

    /**
     * Create an instance of {@link ResembleDname }
     * 
     */
    public ResembleDname createResembleDname() {
        return new ResembleDname();
    }

    /**
     * Create an instance of {@link GetSakuin }
     * 
     */
    public GetSakuin createGetSakuin() {
        return new GetSakuin();
    }

    /**
     * Create an instance of {@link FormatICDResponse }
     * 
     */
    public FormatICDResponse createFormatICDResponse() {
        return new FormatICDResponse();
    }

    /**
     * Create an instance of {@link EnumByomeiResponse }
     * 
     */
    public EnumByomeiResponse createEnumByomeiResponse() {
        return new EnumByomeiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dis.h.u-tokyo.ac.jp/webservices/", name = "ArrayOfString")
    public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_ArrayOfString_QNAME, ArrayOfString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dis.h.u-tokyo.ac.jp/webservices/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dis.h.u-tokyo.ac.jp/webservices/", name = "resultElement")
    public JAXBElement<ResultElement> createResultElement(ResultElement value) {
        return new JAXBElement<ResultElement>(_ResultElement_QNAME, ResultElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByomeiSearchResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dis.h.u-tokyo.ac.jp/webservices/", name = "ByomeiSearchResult")
    public JAXBElement<ByomeiSearchResult> createByomeiSearchResult(ByomeiSearchResult value) {
        return new JAXBElement<ByomeiSearchResult>(_ByomeiSearchResult_QNAME, ByomeiSearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResultElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dis.h.u-tokyo.ac.jp/webservices/", name = "ArrayOfResultElement")
    public JAXBElement<ArrayOfResultElement> createArrayOfResultElement(ArrayOfResultElement value) {
        return new JAXBElement<ArrayOfResultElement>(_ArrayOfResultElement_QNAME, ArrayOfResultElement.class, null, value);
    }

}
