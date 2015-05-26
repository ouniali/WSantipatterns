
package insurance.ws_2013.cangooroo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the insurance.ws_2013.cangooroo package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: insurance.ws_2013.cangooroo
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link ArrayOfCancellationPolicy }
     * 
     */
    public ArrayOfCancellationPolicy createArrayOfCancellationPolicy() {
        return new ArrayOfCancellationPolicy();
    }

    /**
     * Create an instance of {@link InsuranceBookingResult }
     * 
     */
    public InsuranceBookingResult createInsuranceBookingResult() {
        return new InsuranceBookingResult();
    }

}
