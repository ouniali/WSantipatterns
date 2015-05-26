
package elguille.webservices;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the elguille.webservices package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: elguille.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaC }
     * 
     */
    public FaC createFaC() {
        return new FaC();
    }

    /**
     * Create an instance of {@link CaF }
     * 
     */
    public CaF createCaF() {
        return new CaF();
    }

    /**
     * Create an instance of {@link FaCResponse }
     * 
     */
    public FaCResponse createFaCResponse() {
        return new FaCResponse();
    }

    /**
     * Create an instance of {@link CaFResponse }
     * 
     */
    public CaFResponse createCaFResponse() {
        return new CaFResponse();
    }

}
