
package cz.tsoft.premis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.tsoft.premis package. 
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

    private final static QName _String_QNAME = new QName("http://tsoft.cz/premis", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.tsoft.premis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDataXMLResponse }
     * 
     */
    public GetDataXMLResponse createGetDataXMLResponse() {
        return new GetDataXMLResponse();
    }

    /**
     * Create an instance of {@link GetTodayDataXMLResponse }
     * 
     */
    public GetTodayDataXMLResponse createGetTodayDataXMLResponse() {
        return new GetTodayDataXMLResponse();
    }

    /**
     * Create an instance of {@link GetLastDataXMLResponse }
     * 
     */
    public GetLastDataXMLResponse createGetLastDataXMLResponse() {
        return new GetLastDataXMLResponse();
    }

    /**
     * Create an instance of {@link GetTodayData }
     * 
     */
    public GetTodayData createGetTodayData() {
        return new GetTodayData();
    }

    /**
     * Create an instance of {@link GetLastData }
     * 
     */
    public GetLastData createGetLastData() {
        return new GetLastData();
    }

    /**
     * Create an instance of {@link GetTodayDataResponse }
     * 
     */
    public GetTodayDataResponse createGetTodayDataResponse() {
        return new GetTodayDataResponse();
    }

    /**
     * Create an instance of {@link GetLastDataResponse }
     * 
     */
    public GetLastDataResponse createGetLastDataResponse() {
        return new GetLastDataResponse();
    }

    /**
     * Create an instance of {@link GetDataXMLResponse.GetDataXMLResult }
     * 
     */
    public GetDataXMLResponse.GetDataXMLResult createGetDataXMLResponseGetDataXMLResult() {
        return new GetDataXMLResponse.GetDataXMLResult();
    }

    /**
     * Create an instance of {@link GetLastDataXML }
     * 
     */
    public GetLastDataXML createGetLastDataXML() {
        return new GetLastDataXML();
    }

    /**
     * Create an instance of {@link GetTodayDataXMLResponse.GetTodayDataXMLResult }
     * 
     */
    public GetTodayDataXMLResponse.GetTodayDataXMLResult createGetTodayDataXMLResponseGetTodayDataXMLResult() {
        return new GetTodayDataXMLResponse.GetTodayDataXMLResult();
    }

    /**
     * Create an instance of {@link GetDataXML }
     * 
     */
    public GetDataXML createGetDataXML() {
        return new GetDataXML();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link GetTodayDataXML }
     * 
     */
    public GetTodayDataXML createGetTodayDataXML() {
        return new GetTodayDataXML();
    }

    /**
     * Create an instance of {@link GetLastDataXMLResponse.GetLastDataXMLResult }
     * 
     */
    public GetLastDataXMLResponse.GetLastDataXMLResult createGetLastDataXMLResponseGetLastDataXMLResult() {
        return new GetLastDataXMLResponse.GetLastDataXMLResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tsoft.cz/premis", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
