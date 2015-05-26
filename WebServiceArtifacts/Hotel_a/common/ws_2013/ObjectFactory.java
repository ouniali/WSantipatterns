
package common.ws_2013;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the common.ws_2013 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: common.ws_2013
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentRequest }
     * 
     */
    public PaymentRequest createPaymentRequest() {
        return new PaymentRequest();
    }

    /**
     * Create an instance of {@link Pax }
     * 
     */
    public Pax createPax() {
        return new Pax();
    }

    /**
     * Create an instance of {@link CancellationPolicy }
     * 
     */
    public CancellationPolicy createCancellationPolicy() {
        return new CancellationPolicy();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link ContractingParty }
     * 
     */
    public ContractingParty createContractingParty() {
        return new ContractingParty();
    }

}
