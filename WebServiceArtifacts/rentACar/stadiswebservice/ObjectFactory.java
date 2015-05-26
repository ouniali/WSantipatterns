
package stadiswebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stadiswebservice package. 
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

    private final static QName _GetCarData_QNAME = new QName("http://stadiswebservice/", "GetCarData");
    private final static QName _RepeatMessage_QNAME = new QName("http://stadiswebservice/", "repeatMessage");
    private final static QName _RepeatMessageResponse_QNAME = new QName("http://stadiswebservice/", "repeatMessageResponse");
    private final static QName _GetCarDataResponse_QNAME = new QName("http://stadiswebservice/", "GetCarDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stadiswebservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link GetCarDataResponse }
     * 
     */
    public GetCarDataResponse createGetCarDataResponse() {
        return new GetCarDataResponse();
    }

    /**
     * Create an instance of {@link GetCarData }
     * 
     */
    public GetCarData createGetCarData() {
        return new GetCarData();
    }

    /**
     * Create an instance of {@link RepeatMessage }
     * 
     */
    public RepeatMessage createRepeatMessage() {
        return new RepeatMessage();
    }

    /**
     * Create an instance of {@link RepeatMessageResponse }
     * 
     */
    public RepeatMessageResponse createRepeatMessageResponse() {
        return new RepeatMessageResponse();
    }

    /**
     * Create an instance of {@link CarDataResponse }
     * 
     */
    public CarDataResponse createCarDataResponse() {
        return new CarDataResponse();
    }

    /**
     * Create an instance of {@link WarningMessage }
     * 
     */
    public WarningMessage createWarningMessage() {
        return new WarningMessage();
    }

    /**
     * Create an instance of {@link LocationAdress }
     * 
     */
    public LocationAdress createLocationAdress() {
        return new LocationAdress();
    }

    /**
     * Create an instance of {@link Answer }
     * 
     */
    public Answer createAnswer() {
        return new Answer();
    }

    /**
     * Create an instance of {@link CarDataQuery }
     * 
     */
    public CarDataQuery createCarDataQuery() {
        return new CarDataQuery();
    }

    /**
     * Create an instance of {@link FailureMessage }
     * 
     */
    public FailureMessage createFailureMessage() {
        return new FailureMessage();
    }

    /**
     * Create an instance of {@link CarInformation }
     * 
     */
    public CarInformation createCarInformation() {
        return new CarInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://stadiswebservice/", name = "GetCarData")
    public JAXBElement<GetCarData> createGetCarData(GetCarData value) {
        return new JAXBElement<GetCarData>(_GetCarData_QNAME, GetCarData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepeatMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://stadiswebservice/", name = "repeatMessage")
    public JAXBElement<RepeatMessage> createRepeatMessage(RepeatMessage value) {
        return new JAXBElement<RepeatMessage>(_RepeatMessage_QNAME, RepeatMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepeatMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://stadiswebservice/", name = "repeatMessageResponse")
    public JAXBElement<RepeatMessageResponse> createRepeatMessageResponse(RepeatMessageResponse value) {
        return new JAXBElement<RepeatMessageResponse>(_RepeatMessageResponse_QNAME, RepeatMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://stadiswebservice/", name = "GetCarDataResponse")
    public JAXBElement<GetCarDataResponse> createGetCarDataResponse(GetCarDataResponse value) {
        return new JAXBElement<GetCarDataResponse>(_GetCarDataResponse_QNAME, GetCarDataResponse.class, null, value);
    }

}
