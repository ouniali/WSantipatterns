
package otswebws.websvcs;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the otswebws.websvcs package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: otswebws.websvcs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSubscriberInfo }
     * 
     */
    public GetSubscriberInfo createGetSubscriberInfo() {
        return new GetSubscriberInfo();
    }

    /**
     * Create an instance of {@link Dequeue }
     * 
     */
    public Dequeue createDequeue() {
        return new Dequeue();
    }

    /**
     * Create an instance of {@link DequeueResponse }
     * 
     */
    public DequeueResponse createDequeueResponse() {
        return new DequeueResponse();
    }

    /**
     * Create an instance of {@link Dequeue2Response }
     * 
     */
    public Dequeue2Response createDequeue2Response() {
        return new Dequeue2Response();
    }

    /**
     * Create an instance of {@link Dequeue2 }
     * 
     */
    public Dequeue2 createDequeue2() {
        return new Dequeue2();
    }

    /**
     * Create an instance of {@link GetSubscriberInfoResponse }
     * 
     */
    public GetSubscriberInfoResponse createGetSubscriberInfoResponse() {
        return new GetSubscriberInfoResponse();
    }

}
