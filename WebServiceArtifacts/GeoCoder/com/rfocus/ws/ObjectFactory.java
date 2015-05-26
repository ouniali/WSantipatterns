
package com.rfocus.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rfocus.ws package. 
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

    private final static QName _GeocodeResult_QNAME = new QName("http://www.rfocus.com/ws", "GeocodeResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rfocus.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IPAddressLookup }
     * 
     */
    public IPAddressLookup createIPAddressLookup() {
        return new IPAddressLookup();
    }

    /**
     * Create an instance of {@link PhysicalAddressLookupJsonResponse }
     * 
     */
    public PhysicalAddressLookupJsonResponse createPhysicalAddressLookupJsonResponse() {
        return new PhysicalAddressLookupJsonResponse();
    }

    /**
     * Create an instance of {@link PhysicalAddressLookupResponse }
     * 
     */
    public PhysicalAddressLookupResponse createPhysicalAddressLookupResponse() {
        return new PhysicalAddressLookupResponse();
    }

    /**
     * Create an instance of {@link GeocodeResult }
     * 
     */
    public GeocodeResult createGeocodeResult() {
        return new GeocodeResult();
    }

    /**
     * Create an instance of {@link IPAddressLookupJson }
     * 
     */
    public IPAddressLookupJson createIPAddressLookupJson() {
        return new IPAddressLookupJson();
    }

    /**
     * Create an instance of {@link ReverseGeocodeResponse }
     * 
     */
    public ReverseGeocodeResponse createReverseGeocodeResponse() {
        return new ReverseGeocodeResponse();
    }

    /**
     * Create an instance of {@link ReverseGeocodeJsonResponse }
     * 
     */
    public ReverseGeocodeJsonResponse createReverseGeocodeJsonResponse() {
        return new ReverseGeocodeJsonResponse();
    }

    /**
     * Create an instance of {@link ReverseGeocodeJson }
     * 
     */
    public ReverseGeocodeJson createReverseGeocodeJson() {
        return new ReverseGeocodeJson();
    }

    /**
     * Create an instance of {@link PhysicalAddressLookupJson }
     * 
     */
    public PhysicalAddressLookupJson createPhysicalAddressLookupJson() {
        return new PhysicalAddressLookupJson();
    }

    /**
     * Create an instance of {@link PhysicalAddressLookup }
     * 
     */
    public PhysicalAddressLookup createPhysicalAddressLookup() {
        return new PhysicalAddressLookup();
    }

    /**
     * Create an instance of {@link IPAddressLookupJsonResponse }
     * 
     */
    public IPAddressLookupJsonResponse createIPAddressLookupJsonResponse() {
        return new IPAddressLookupJsonResponse();
    }

    /**
     * Create an instance of {@link ReverseGeocode }
     * 
     */
    public ReverseGeocode createReverseGeocode() {
        return new ReverseGeocode();
    }

    /**
     * Create an instance of {@link IPAddressLookupResponse }
     * 
     */
    public IPAddressLookupResponse createIPAddressLookupResponse() {
        return new IPAddressLookupResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Point }
     * 
     */
    public Point createPoint() {
        return new Point();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocodeResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.rfocus.com/ws", name = "GeocodeResult")
    public JAXBElement<GeocodeResult> createGeocodeResult(GeocodeResult value) {
        return new JAXBElement<GeocodeResult>(_GeocodeResult_QNAME, GeocodeResult.class, null, value);
    }

}
