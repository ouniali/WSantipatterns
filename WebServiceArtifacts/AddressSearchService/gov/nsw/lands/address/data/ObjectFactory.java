
package gov.nsw.lands.address.data;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.nsw.lands.address.data package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.nsw.lands.address.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LotAddressResult }
     * 
     */
    public LotAddressResult createLotAddressResult() {
        return new LotAddressResult();
    }

    /**
     * Create an instance of {@link AddressResult }
     * 
     */
    public AddressResult createAddressResult() {
        return new AddressResult();
    }

    /**
     * Create an instance of {@link LotAddressRecord }
     * 
     */
    public LotAddressRecord createLotAddressRecord() {
        return new LotAddressRecord();
    }

    /**
     * Create an instance of {@link AddressRecord }
     * 
     */
    public AddressRecord createAddressRecord() {
        return new AddressRecord();
    }

    /**
     * Create an instance of {@link AddressPoint }
     * 
     */
    public AddressPoint createAddressPoint() {
        return new AddressPoint();
    }

}
