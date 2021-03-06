
package scooby;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IBIVU_PortType", targetNamespace = "Scooby")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IBIVUPortType {


    /**
     * 
     * @param uniProtRefSeqID
     * @param domcut
     * @return
     *     returns scooby.ResultsResponseType
     */
    @WebMethod(action = "Scooby#doScoobyById")
    @WebResult(name = "resultsResponse", targetNamespace = "")
    @RequestWrapper(localName = "doScoobyById", targetNamespace = "Scooby", className = "scooby.ProtIdType")
    @ResponseWrapper(localName = "doScoobyByIdResponse", targetNamespace = "Scooby", className = "scooby.ResultsResponseTypeWrapper")
    public ResultsResponseType doScoobyById(
        @WebParam(name = "UniProt_RefSeq_ID", targetNamespace = "")
        String uniProtRefSeqID,
        @WebParam(name = "DOMCUT", targetNamespace = "")
        DOMCUTType domcut);

    /**
     * 
     * @param domcut
     * @param fasta
     * @return
     *     returns scooby.ResultsResponseType
     */
    @WebMethod(action = "Scooby#doScoobyBySeq")
    @WebResult(name = "resultsResponse", targetNamespace = "")
    @RequestWrapper(localName = "doScoobyBySeq", targetNamespace = "Scooby", className = "scooby.FastaType")
    @ResponseWrapper(localName = "doScoobyBySeqResponse", targetNamespace = "Scooby", className = "scooby.ResultsResponseTypeWrapper")
    public ResultsResponseType doScoobyBySeq(
        @WebParam(name = "FASTA", targetNamespace = "")
        String fasta,
        @WebParam(name = "DOMCUT", targetNamespace = "")
        DOMCUTType domcut);

    /**
     * 
     * @param uniProtRefSeqID
     * @param domcut
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "Scooby#doScoobyByIdAsync")
    @WebResult(name = "ticket", targetNamespace = "")
    @RequestWrapper(localName = "doScoobyByIdAsync", targetNamespace = "Scooby", className = "scooby.ProtIdType")
    @ResponseWrapper(localName = "doScoobyByIdAsyncResponse", targetNamespace = "Scooby", className = "scooby.TicketType")
    public String doScoobyByIdAsync(
        @WebParam(name = "UniProt_RefSeq_ID", targetNamespace = "")
        String uniProtRefSeqID,
        @WebParam(name = "DOMCUT", targetNamespace = "")
        DOMCUTType domcut);

    /**
     * 
     * @param ticket
     * @return
     *     returns scooby.ResultsResponseType
     */
    @WebMethod(action = "Scooby#getResults")
    @WebResult(name = "resultsResponse", targetNamespace = "")
    @RequestWrapper(localName = "getResults", targetNamespace = "Scooby", className = "scooby.TicketType")
    @ResponseWrapper(localName = "getResultsResponse", targetNamespace = "Scooby", className = "scooby.ResultsResponseTypeWrapper")
    public ResultsResponseType getResults(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket);

    /**
     * 
     * @param ticket
     * @return
     *     returns scooby.StatusType
     */
    @WebMethod(action = "Scooby#getStatus")
    @WebResult(name = "status", targetNamespace = "")
    @RequestWrapper(localName = "getStatus", targetNamespace = "Scooby", className = "scooby.TicketType")
    @ResponseWrapper(localName = "getStatusResponse", targetNamespace = "Scooby", className = "scooby.StatusResponseType")
    public StatusType getStatus(
        @WebParam(name = "ticket", targetNamespace = "")
        String ticket);

}
