
package com.strikeiron;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.strikeiron package. 
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

    private final static QName _ResponseInfo_QNAME = new QName("http://www.strikeiron.com", "ResponseInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.strikeiron
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseInfo }
     * 
     */
    public ResponseInfo createResponseInfo() {
        return new ResponseInfo();
    }

    /**
     * Create an instance of {@link AddressToAddressDistanceResponse }
     * 
     */
    public AddressToAddressDistanceResponse createAddressToAddressDistanceResponse() {
        return new AddressToAddressDistanceResponse();
    }

    /**
     * Create an instance of {@link AddressToAddressDistance }
     * 
     */
    public AddressToAddressDistance createAddressToAddressDistance() {
        return new AddressToAddressDistance();
    }

    /**
     * Create an instance of {@link AddressInput }
     * 
     */
    public AddressInput createAddressInput() {
        return new AddressInput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.strikeiron.com", name = "ResponseInfo")
    public JAXBElement<ResponseInfo> createResponseInfo(ResponseInfo value) {
        return new JAXBElement<ResponseInfo>(_ResponseInfo_QNAME, ResponseInfo.class, null, value);
    }

}
