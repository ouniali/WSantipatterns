
package ro.platforma_broker.ws.travel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ro.platforma_broker.security.AuthenticationStatus;
import ro.platforma_broker.ws.travel.types.TravelCotatieRequest;
import ro.platforma_broker.ws.travel.types.TravelCotatieResponse;
import ro.platforma_broker.ws.travel.types.TravelSalvareRequest;
import ro.platforma_broker.ws.travel.types.TravelSalvareResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ro.platforma_broker.ws.travel package. 
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

    private final static QName _AuthenticationStatusFault_QNAME = new QName("http://www.platforma-broker.ro/ws/travel", "AuthenticationStatusFault");
    private final static QName _CotatieResponseCotatieResult_QNAME = new QName("http://www.platforma-broker.ro/ws/travel", "CotatieResult");
    private final static QName _CotatieRequest_QNAME = new QName("http://www.platforma-broker.ro/ws/travel", "request");
    private final static QName _SalvareCerereResponseSalvareCerereResult_QNAME = new QName("http://www.platforma-broker.ro/ws/travel", "SalvareCerereResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ro.platforma_broker.ws.travel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SalvareCerereResponse }
     * 
     */
    public SalvareCerereResponse createSalvareCerereResponse() {
        return new SalvareCerereResponse();
    }

    /**
     * Create an instance of {@link SalvareCerere }
     * 
     */
    public SalvareCerere createSalvareCerere() {
        return new SalvareCerere();
    }

    /**
     * Create an instance of {@link Cotatie }
     * 
     */
    public Cotatie createCotatie() {
        return new Cotatie();
    }

    /**
     * Create an instance of {@link CotatieResponse }
     * 
     */
    public CotatieResponse createCotatieResponse() {
        return new CotatieResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel", name = "AuthenticationStatusFault")
    public JAXBElement<AuthenticationStatus> createAuthenticationStatusFault(AuthenticationStatus value) {
        return new JAXBElement<AuthenticationStatus>(_AuthenticationStatusFault_QNAME, AuthenticationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelCotatieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel", name = "CotatieResult", scope = CotatieResponse.class)
    public JAXBElement<TravelCotatieResponse> createCotatieResponseCotatieResult(TravelCotatieResponse value) {
        return new JAXBElement<TravelCotatieResponse>(_CotatieResponseCotatieResult_QNAME, TravelCotatieResponse.class, CotatieResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelCotatieRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel", name = "request", scope = Cotatie.class)
    public JAXBElement<TravelCotatieRequest> createCotatieRequest(TravelCotatieRequest value) {
        return new JAXBElement<TravelCotatieRequest>(_CotatieRequest_QNAME, TravelCotatieRequest.class, Cotatie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelSalvareRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel", name = "request", scope = SalvareCerere.class)
    public JAXBElement<TravelSalvareRequest> createSalvareCerereRequest(TravelSalvareRequest value) {
        return new JAXBElement<TravelSalvareRequest>(_CotatieRequest_QNAME, TravelSalvareRequest.class, SalvareCerere.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelSalvareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel", name = "SalvareCerereResult", scope = SalvareCerereResponse.class)
    public JAXBElement<TravelSalvareResponse> createSalvareCerereResponseSalvareCerereResult(TravelSalvareResponse value) {
        return new JAXBElement<TravelSalvareResponse>(_SalvareCerereResponseSalvareCerereResult_QNAME, TravelSalvareResponse.class, SalvareCerereResponse.class, value);
    }

}
