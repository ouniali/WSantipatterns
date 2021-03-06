
package otswebws.websvcs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import otswebws.datatype.SubscriberInfo;
import otswebws.datatype.TransactionBlock;
import otswebws.datatype.TransactionBlock2;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "OTSWebSvcs", targetNamespace = "http://websvcs.otswebws")
@XmlSeeAlso({
    otswebws.datatype.ObjectFactory.class,
    otswebws.websvcs.ObjectFactory.class,
    sharedws.exception.ObjectFactory.class
})
public interface OTSWebSvcs {


    /**
     * 
     * @param blockCount
     * @param subscriberId
     * @param transactionId
     * @return
     *     returns otswebws.datatype.TransactionBlock
     * @throws WSException
     */
    @WebMethod
    @WebResult(name = "dequeueReturn", targetNamespace = "")
    @RequestWrapper(localName = "dequeue", targetNamespace = "http://websvcs.otswebws", className = "otswebws.websvcs.Dequeue")
    @ResponseWrapper(localName = "dequeueResponse", targetNamespace = "http://websvcs.otswebws", className = "otswebws.websvcs.DequeueResponse")
    public TransactionBlock dequeue(
        @WebParam(name = "subscriberId", targetNamespace = "")
        int subscriberId,
        @WebParam(name = "blockCount", targetNamespace = "")
        int blockCount,
        @WebParam(name = "transactionId", targetNamespace = "")
        int transactionId)
        throws WSException
    ;

    /**
     * 
     * @param subscriberID
     * @return
     *     returns otswebws.datatype.SubscriberInfo
     * @throws WSException
     */
    @WebMethod
    @WebResult(name = "getSubscriberInfoReturn", targetNamespace = "")
    @RequestWrapper(localName = "getSubscriberInfo", targetNamespace = "http://websvcs.otswebws", className = "otswebws.websvcs.GetSubscriberInfo")
    @ResponseWrapper(localName = "getSubscriberInfoResponse", targetNamespace = "http://websvcs.otswebws", className = "otswebws.websvcs.GetSubscriberInfoResponse")
    public SubscriberInfo getSubscriberInfo(
        @WebParam(name = "subscriberID", targetNamespace = "")
        int subscriberID)
        throws WSException
    ;

    /**
     * 
     * @param subscriberId
     * @param transactionIdIn
     * @return
     *     returns otswebws.datatype.TransactionBlock2
     * @throws WSException
     */
    @WebMethod
    @WebResult(name = "dequeue2Return", targetNamespace = "")
    @RequestWrapper(localName = "dequeue2", targetNamespace = "http://websvcs.otswebws", className = "otswebws.websvcs.Dequeue2")
    @ResponseWrapper(localName = "dequeue2Response", targetNamespace = "http://websvcs.otswebws", className = "otswebws.websvcs.Dequeue2Response")
    public TransactionBlock2 dequeue2(
        @WebParam(name = "subscriberId", targetNamespace = "")
        int subscriberId,
        @WebParam(name = "transactionIdIn", targetNamespace = "")
        long transactionIdIn)
        throws WSException
    ;

}
