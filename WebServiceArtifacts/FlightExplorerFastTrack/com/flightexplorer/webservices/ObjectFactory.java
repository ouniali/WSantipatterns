
package com.flightexplorer.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.flightexplorer.webservices package. 
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

    private final static QName _FlightData_QNAME = new QName("http://webservices.flightexplorer.com/", "FlightData");
    private final static QName _FlightDataEx_QNAME = new QName("http://webservices.flightexplorer.com/", "FlightDataEx");
    private final static QName _FlightDataAndImageEx_QNAME = new QName("http://webservices.flightexplorer.com/", "FlightDataAndImageEx");
    private final static QName _FlightImage_QNAME = new QName("http://webservices.flightexplorer.com/", "FlightImage");
    private final static QName _FlightDataAndImage_QNAME = new QName("http://webservices.flightexplorer.com/", "FlightDataAndImage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.flightexplorer.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFlightImage }
     * 
     */
    public GetFlightImage createGetFlightImage() {
        return new GetFlightImage();
    }

    /**
     * Create an instance of {@link GetCodeShareFlightDataResponse }
     * 
     */
    public GetCodeShareFlightDataResponse createGetCodeShareFlightDataResponse() {
        return new GetCodeShareFlightDataResponse();
    }

    /**
     * Create an instance of {@link FlightData }
     * 
     */
    public FlightData createFlightData() {
        return new FlightData();
    }

    /**
     * Create an instance of {@link GetFlightData }
     * 
     */
    public GetFlightData createGetFlightData() {
        return new GetFlightData();
    }

    /**
     * Create an instance of {@link FlightImage }
     * 
     */
    public FlightImage createFlightImage() {
        return new FlightImage();
    }

    /**
     * Create an instance of {@link GetFlightDataResponse }
     * 
     */
    public GetFlightDataResponse createGetFlightDataResponse() {
        return new GetFlightDataResponse();
    }

    /**
     * Create an instance of {@link GetFlightDataAndImage }
     * 
     */
    public GetFlightDataAndImage createGetFlightDataAndImage() {
        return new GetFlightDataAndImage();
    }

    /**
     * Create an instance of {@link GetFlightDataAndImageResponse }
     * 
     */
    public GetFlightDataAndImageResponse createGetFlightDataAndImageResponse() {
        return new GetFlightDataAndImageResponse();
    }

    /**
     * Create an instance of {@link FlightDataAndImage }
     * 
     */
    public FlightDataAndImage createFlightDataAndImage() {
        return new FlightDataAndImage();
    }

    /**
     * Create an instance of {@link FlightDataAndImageEx }
     * 
     */
    public FlightDataAndImageEx createFlightDataAndImageEx() {
        return new FlightDataAndImageEx();
    }

    /**
     * Create an instance of {@link GetFlightDataEx }
     * 
     */
    public GetFlightDataEx createGetFlightDataEx() {
        return new GetFlightDataEx();
    }

    /**
     * Create an instance of {@link FlightDataEx }
     * 
     */
    public FlightDataEx createFlightDataEx() {
        return new FlightDataEx();
    }

    /**
     * Create an instance of {@link GetFlightDataExResponse }
     * 
     */
    public GetFlightDataExResponse createGetFlightDataExResponse() {
        return new GetFlightDataExResponse();
    }

    /**
     * Create an instance of {@link GetFlightImageResponse }
     * 
     */
    public GetFlightImageResponse createGetFlightImageResponse() {
        return new GetFlightImageResponse();
    }

    /**
     * Create an instance of {@link GetFlightDataAndImageEx }
     * 
     */
    public GetFlightDataAndImageEx createGetFlightDataAndImageEx() {
        return new GetFlightDataAndImageEx();
    }

    /**
     * Create an instance of {@link GetFlightDataAndImageExResponse }
     * 
     */
    public GetFlightDataAndImageExResponse createGetFlightDataAndImageExResponse() {
        return new GetFlightDataAndImageExResponse();
    }

    /**
     * Create an instance of {@link GetCodeShareFlightData }
     * 
     */
    public GetCodeShareFlightData createGetCodeShareFlightData() {
        return new GetCodeShareFlightData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.flightexplorer.com/", name = "FlightData")
    public JAXBElement<FlightData> createFlightData(FlightData value) {
        return new JAXBElement<FlightData>(_FlightData_QNAME, FlightData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDataEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.flightexplorer.com/", name = "FlightDataEx")
    public JAXBElement<FlightDataEx> createFlightDataEx(FlightDataEx value) {
        return new JAXBElement<FlightDataEx>(_FlightDataEx_QNAME, FlightDataEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDataAndImageEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.flightexplorer.com/", name = "FlightDataAndImageEx")
    public JAXBElement<FlightDataAndImageEx> createFlightDataAndImageEx(FlightDataAndImageEx value) {
        return new JAXBElement<FlightDataAndImageEx>(_FlightDataAndImageEx_QNAME, FlightDataAndImageEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.flightexplorer.com/", name = "FlightImage")
    public JAXBElement<FlightImage> createFlightImage(FlightImage value) {
        return new JAXBElement<FlightImage>(_FlightImage_QNAME, FlightImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDataAndImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.flightexplorer.com/", name = "FlightDataAndImage")
    public JAXBElement<FlightDataAndImage> createFlightDataAndImage(FlightDataAndImage value) {
        return new JAXBElement<FlightDataAndImage>(_FlightDataAndImage_QNAME, FlightDataAndImage.class, null, value);
    }

}
