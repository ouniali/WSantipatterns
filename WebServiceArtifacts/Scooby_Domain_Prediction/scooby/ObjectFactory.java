
package scooby;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the scooby package. 
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

    private final static QName _DoScoobyByIdAsync_QNAME = new QName("Scooby", "doScoobyByIdAsync");
    private final static QName _GetStatus_QNAME = new QName("Scooby", "getStatus");
    private final static QName _DoScoobyByIdAsyncResponse_QNAME = new QName("Scooby", "doScoobyByIdAsyncResponse");
    private final static QName _DoScoobyById_QNAME = new QName("Scooby", "doScoobyById");
    private final static QName _GetResults_QNAME = new QName("Scooby", "getResults");
    private final static QName _GetResultsResponse_QNAME = new QName("Scooby", "getResultsResponse");
    private final static QName _DoScoobyByIdResponse_QNAME = new QName("Scooby", "doScoobyByIdResponse");
    private final static QName _DoScoobyBySeqResponse_QNAME = new QName("Scooby", "doScoobyBySeqResponse");
    private final static QName _GetStatusResponse_QNAME = new QName("Scooby", "getStatusResponse");
    private final static QName _DoScoobyBySeq_QNAME = new QName("Scooby", "doScoobyBySeq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: scooby
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatusResponseType }
     * 
     */
    public StatusResponseType createStatusResponseType() {
        return new StatusResponseType();
    }

    /**
     * Create an instance of {@link FastaType }
     * 
     */
    public FastaType createFastaType() {
        return new FastaType();
    }

    /**
     * Create an instance of {@link ResultsResponseTypeWrapper }
     * 
     */
    public ResultsResponseTypeWrapper createResultsResponseTypeWrapper() {
        return new ResultsResponseTypeWrapper();
    }

    /**
     * Create an instance of {@link TicketType }
     * 
     */
    public TicketType createTicketType() {
        return new TicketType();
    }

    /**
     * Create an instance of {@link ProtIdType }
     * 
     */
    public ProtIdType createProtIdType() {
        return new ProtIdType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link IterationType }
     * 
     */
    public IterationType createIterationType() {
        return new IterationType();
    }

    /**
     * Create an instance of {@link RanksType }
     * 
     */
    public RanksType createRanksType() {
        return new RanksType();
    }

    /**
     * Create an instance of {@link DOMCUTType }
     * 
     */
    public DOMCUTType createDOMCUTType() {
        return new DOMCUTType();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link ResultsResponseType }
     * 
     */
    public ResultsResponseType createResultsResponseType() {
        return new ResultsResponseType();
    }

    /**
     * Create an instance of {@link SequencesType }
     * 
     */
    public SequencesType createSequencesType() {
        return new SequencesType();
    }

    /**
     * Create an instance of {@link SeqId }
     * 
     */
    public SeqId createSeqId() {
        return new SeqId();
    }

    /**
     * Create an instance of {@link SequenceType }
     * 
     */
    public SequenceType createSequenceType() {
        return new SequenceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Scooby", name = "doScoobyByIdAsync")
    public JAXBElement<ProtIdType> createDoScoobyByIdAsync(ProtIdType value) {
        return new JAXBElement<ProtIdType>(_DoScoobyByIdAsync_QNAME, ProtIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Scooby", name = "getStatus")
    public JAXBElement<TicketType> createGetStatus(TicketType value) {
        return new JAXBElement<TicketType>(_GetStatus_QNAME, TicketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Scooby", name = "doScoobyByIdAsyncResponse")
    public JAXBElement<TicketType> createDoScoobyByIdAsyncResponse(TicketType value) {
        return new JAXBElement<TicketType>(_DoScoobyByIdAsyncResponse_QNAME, TicketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Scooby", name = "doScoobyById")
    public JAXBElement<ProtIdType> createDoScoobyById(ProtIdType value) {
        return new JAXBElement<ProtIdType>(_DoScoobyById_QNAME, ProtIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Scooby", name = "getResults")
    public JAXBElement<TicketType> createGetResults(TicketType value) {
        return new JAXBElement<TicketType>(_GetResults_QNAME, TicketType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultsResponseTypeWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Scooby", name = "getResultsResponse")
    public JAXBElement<ResultsResponseTypeWrapper> createGetResultsResponse(ResultsResponseTypeWrapper value) {
        return new JAXBElement<ResultsResponseTypeWrapper>(_GetResultsResponse_QNAME, ResultsResponseTypeWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultsResponseTypeWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Scooby", name = "doScoobyByIdResponse")
    public JAXBElement<ResultsResponseTypeWrapper> createDoScoobyByIdResponse(ResultsResponseTypeWrapper value) {
        return new JAXBElement<ResultsResponseTypeWrapper>(_DoScoobyByIdResponse_QNAME, ResultsResponseTypeWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultsResponseTypeWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Scooby", name = "doScoobyBySeqResponse")
    public JAXBElement<ResultsResponseTypeWrapper> createDoScoobyBySeqResponse(ResultsResponseTypeWrapper value) {
        return new JAXBElement<ResultsResponseTypeWrapper>(_DoScoobyBySeqResponse_QNAME, ResultsResponseTypeWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Scooby", name = "getStatusResponse")
    public JAXBElement<StatusResponseType> createGetStatusResponse(StatusResponseType value) {
        return new JAXBElement<StatusResponseType>(_GetStatusResponse_QNAME, StatusResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FastaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Scooby", name = "doScoobyBySeq")
    public JAXBElement<FastaType> createDoScoobyBySeq(FastaType value) {
        return new JAXBElement<FastaType>(_DoScoobyBySeq_QNAME, FastaType.class, null, value);
    }

}
