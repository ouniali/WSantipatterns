
package domaination;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the domaination package. 
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

    private final static QName _GetStatus_QNAME = new QName("Domaination", "getStatus");
    private final static QName _GetResults_QNAME = new QName("Domaination", "getResults");
    private final static QName _GetTicketBySeq_QNAME = new QName("Domaination", "getTicketBySeq");
    private final static QName _GetTicketByIdResponse_QNAME = new QName("Domaination", "getTicketByIdResponse");
    private final static QName _Response_QNAME = new QName("Domaination", "response");
    private final static QName _GetResultsResponse_QNAME = new QName("Domaination", "getResultsResponse");
    private final static QName _GetTicketById_QNAME = new QName("Domaination", "getTicketById");
    private final static QName _GetTicketBySeqResponse_QNAME = new QName("Domaination", "getTicketBySeqResponse");
    private final static QName _GetStatusResponse_QNAME = new QName("Domaination", "getStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: domaination
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProtIdType }
     * 
     */
    public ProtIdType createProtIdType() {
        return new ProtIdType();
    }

    /**
     * Create an instance of {@link TicketType }
     * 
     */
    public TicketType createTicketType() {
        return new TicketType();
    }

    /**
     * Create an instance of {@link StatusResponseType }
     * 
     */
    public StatusResponseType createStatusResponseType() {
        return new StatusResponseType();
    }

    /**
     * Create an instance of {@link ResultsResponseTypeWrapper }
     * 
     */
    public ResultsResponseTypeWrapper createResultsResponseTypeWrapper() {
        return new ResultsResponseTypeWrapper();
    }

    /**
     * Create an instance of {@link FastaType }
     * 
     */
    public FastaType createFastaType() {
        return new FastaType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link ResultsResponseType }
     * 
     */
    public ResultsResponseType createResultsResponseType() {
        return new ResultsResponseType();
    }

    /**
     * Create an instance of {@link IterationType }
     * 
     */
    public IterationType createIterationType() {
        return new IterationType();
    }

    /**
     * Create an instance of {@link VersionsType }
     * 
     */
    public VersionsType createVersionsType() {
        return new VersionsType();
    }

    /**
     * Create an instance of {@link IterationsType }
     * 
     */
    public IterationsType createIterationsType() {
        return new IterationsType();
    }

    /**
     * Create an instance of {@link Db }
     * 
     */
    public Db createDb() {
        return new Db();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Domaination", name = "getStatus")
    public JAXBElement<TicketType> createGetStatus(TicketType value) {
        return new JAXBElement<TicketType>(_GetStatus_QNAME, TicketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Domaination", name = "getResults")
    public JAXBElement<TicketType> createGetResults(TicketType value) {
        return new JAXBElement<TicketType>(_GetResults_QNAME, TicketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FastaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Domaination", name = "getTicketBySeq")
    public JAXBElement<FastaType> createGetTicketBySeq(FastaType value) {
        return new JAXBElement<FastaType>(_GetTicketBySeq_QNAME, FastaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Domaination", name = "getTicketByIdResponse")
    public JAXBElement<TicketType> createGetTicketByIdResponse(TicketType value) {
        return new JAXBElement<TicketType>(_GetTicketByIdResponse_QNAME, TicketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Domaination", name = "response")
    public JAXBElement<String> createResponse(String value) {
        return new JAXBElement<String>(_Response_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultsResponseTypeWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Domaination", name = "getResultsResponse")
    public JAXBElement<ResultsResponseTypeWrapper> createGetResultsResponse(ResultsResponseTypeWrapper value) {
        return new JAXBElement<ResultsResponseTypeWrapper>(_GetResultsResponse_QNAME, ResultsResponseTypeWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Domaination", name = "getTicketById")
    public JAXBElement<ProtIdType> createGetTicketById(ProtIdType value) {
        return new JAXBElement<ProtIdType>(_GetTicketById_QNAME, ProtIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Domaination", name = "getTicketBySeqResponse")
    public JAXBElement<TicketType> createGetTicketBySeqResponse(TicketType value) {
        return new JAXBElement<TicketType>(_GetTicketBySeqResponse_QNAME, TicketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Domaination", name = "getStatusResponse")
    public JAXBElement<StatusResponseType> createGetStatusResponse(StatusResponseType value) {
        return new JAXBElement<StatusResponseType>(_GetStatusResponse_QNAME, StatusResponseType.class, null, value);
    }

}
