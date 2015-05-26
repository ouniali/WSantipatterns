
package transfer.ws_2013;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the transfer.ws_2013 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: transfer.ws_2013
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfCancellationPolicy }
     * 
     */
    public ArrayOfCancellationPolicy createArrayOfCancellationPolicy() {
        return new ArrayOfCancellationPolicy();
    }

    /**
     * Create an instance of {@link UserDetail }
     * 
     */
    public UserDetail createUserDetail() {
        return new UserDetail();
    }

    /**
     * Create an instance of {@link ArrayOfPax }
     * 
     */
    public ArrayOfPax createArrayOfPax() {
        return new ArrayOfPax();
    }

    /**
     * Create an instance of {@link TransferTransport }
     * 
     */
    public TransferTransport createTransferTransport() {
        return new TransferTransport();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link TransferBookingResult }
     * 
     */
    public TransferBookingResult createTransferBookingResult() {
        return new TransferBookingResult();
    }

    /**
     * Create an instance of {@link TransferProvider }
     * 
     */
    public TransferProvider createTransferProvider() {
        return new TransferProvider();
    }

}
