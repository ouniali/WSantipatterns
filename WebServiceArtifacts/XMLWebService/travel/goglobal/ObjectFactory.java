
package travel.goglobal;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the travel.goglobal package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: travel.goglobal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MakeRequestCompressed }
     * 
     */
    public MakeRequestCompressed createMakeRequestCompressed() {
        return new MakeRequestCompressed();
    }

    /**
     * Create an instance of {@link MakeRequest }
     * 
     */
    public MakeRequest createMakeRequest() {
        return new MakeRequest();
    }

    /**
     * Create an instance of {@link MakeRequestCompressedResponse }
     * 
     */
    public MakeRequestCompressedResponse createMakeRequestCompressedResponse() {
        return new MakeRequestCompressedResponse();
    }

    /**
     * Create an instance of {@link MakeRequestResponse }
     * 
     */
    public MakeRequestResponse createMakeRequestResponse() {
        return new MakeRequestResponse();
    }

}
