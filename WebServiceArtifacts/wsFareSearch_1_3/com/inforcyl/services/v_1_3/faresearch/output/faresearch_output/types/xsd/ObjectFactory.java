
package com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.xsd package. 
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

    private final static QName _FareDataOrigin_QNAME = new QName("http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "origin");
    private final static QName _FareDataFareKms_QNAME = new QName("http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "fareKms");
    private final static QName _FareDataBoardingFee_QNAME = new QName("http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "boardingFee");
    private final static QName _FareDataDestination_QNAME = new QName("http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "destination");
    private final static QName _FareDataDirection_QNAME = new QName("http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "direction");
    private final static QName _FareDataPoints_QNAME = new QName("http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", "points");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.inforcyl.services.v_1_3.faresearch.output.faresearch_output.types.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FareData }
     * 
     */
    public FareData createFareData() {
        return new FareData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "origin", scope = FareData.class)
    public JAXBElement<String> createFareDataOrigin(String value) {
        return new JAXBElement<String>(_FareDataOrigin_QNAME, String.class, FareData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "fareKms", scope = FareData.class)
    public JAXBElement<Double> createFareDataFareKms(Double value) {
        return new JAXBElement<Double>(_FareDataFareKms_QNAME, Double.class, FareData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "boardingFee", scope = FareData.class)
    public JAXBElement<Double> createFareDataBoardingFee(Double value) {
        return new JAXBElement<Double>(_FareDataBoardingFee_QNAME, Double.class, FareData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "destination", scope = FareData.class)
    public JAXBElement<String> createFareDataDestination(String value) {
        return new JAXBElement<String>(_FareDataDestination_QNAME, String.class, FareData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "direction", scope = FareData.class)
    public JAXBElement<String> createFareDataDirection(String value) {
        return new JAXBElement<String>(_FareDataDirection_QNAME, String.class, FareData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://types.faresearch_output.output.faresearch.v_1_3.services.inforcyl.com/xsd", name = "points", scope = FareData.class)
    public JAXBElement<Long> createFareDataPoints(Long value) {
        return new JAXBElement<Long>(_FareDataPoints_QNAME, Long.class, FareData.class, value);
    }

}
