
package otswebws.datatype;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the otswebws.datatype package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: otswebws.datatype
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransactionBlock }
     * 
     */
    public TransactionBlock createTransactionBlock() {
        return new TransactionBlock();
    }

    /**
     * Create an instance of {@link TransactionBlock2 }
     * 
     */
    public TransactionBlock2 createTransactionBlock2() {
        return new TransactionBlock2();
    }

    /**
     * Create an instance of {@link SubscriberInfo }
     * 
     */
    public SubscriberInfo createSubscriberInfo() {
        return new SubscriberInfo();
    }

}
