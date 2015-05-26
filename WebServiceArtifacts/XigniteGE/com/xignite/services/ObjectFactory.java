
package com.xignite.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xignite.services package. 
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

    private final static QName _WSJRate_QNAME = new QName("http://www.xignite.com/services/", "WSJRate");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _ArrayOfInterestRate_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfInterestRate");
    private final static QName _ArrayOfWSJRate_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfWSJRate");
    private final static QName _InterestRate_QNAME = new QName("http://www.xignite.com/services/", "InterestRate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLastWSJRateByMaturity }
     * 
     */
    public GetLastWSJRateByMaturity createGetLastWSJRateByMaturity() {
        return new GetLastWSJRateByMaturity();
    }

    /**
     * Create an instance of {@link GetLastH15Rate }
     * 
     */
    public GetLastH15Rate createGetLastH15Rate() {
        return new GetLastH15Rate();
    }

    /**
     * Create an instance of {@link GetLastWSJRateByDescription }
     * 
     */
    public GetLastWSJRateByDescription createGetLastWSJRateByDescription() {
        return new GetLastWSJRateByDescription();
    }

    /**
     * Create an instance of {@link GetWSJRatesTestResponse }
     * 
     */
    public GetWSJRatesTestResponse createGetWSJRatesTestResponse() {
        return new GetWSJRatesTestResponse();
    }

    /**
     * Create an instance of {@link ArrayOfWSJRate }
     * 
     */
    public ArrayOfWSJRate createArrayOfWSJRate() {
        return new ArrayOfWSJRate();
    }

    /**
     * Create an instance of {@link GetWSJRates1 }
     * 
     */
    public GetWSJRates1 createGetWSJRates1() {
        return new GetWSJRates1();
    }

    /**
     * Create an instance of {@link GetLastWSJRateResponse }
     * 
     */
    public GetLastWSJRateResponse createGetLastWSJRateResponse() {
        return new GetLastWSJRateResponse();
    }

    /**
     * Create an instance of {@link WSJRate }
     * 
     */
    public WSJRate createWSJRate() {
        return new WSJRate();
    }

    /**
     * Create an instance of {@link GetH15Rates }
     * 
     */
    public GetH15Rates createGetH15Rates() {
        return new GetH15Rates();
    }

    /**
     * Create an instance of {@link GetLastWSJRate }
     * 
     */
    public GetLastWSJRate createGetLastWSJRate() {
        return new GetLastWSJRate();
    }

    /**
     * Create an instance of {@link GetLastWSJRateByMaturityResponse }
     * 
     */
    public GetLastWSJRateByMaturityResponse createGetLastWSJRateByMaturityResponse() {
        return new GetLastWSJRateByMaturityResponse();
    }

    /**
     * Create an instance of {@link GetWSJRates1Response }
     * 
     */
    public GetWSJRates1Response createGetWSJRates1Response() {
        return new GetWSJRates1Response();
    }

    /**
     * Create an instance of {@link ArrayOfInterestRate }
     * 
     */
    public ArrayOfInterestRate createArrayOfInterestRate() {
        return new ArrayOfInterestRate();
    }

    /**
     * Create an instance of {@link GetLastWSJRateByDescriptionResponse }
     * 
     */
    public GetLastWSJRateByDescriptionResponse createGetLastWSJRateByDescriptionResponse() {
        return new GetLastWSJRateByDescriptionResponse();
    }

    /**
     * Create an instance of {@link GetH15Rates1 }
     * 
     */
    public GetH15Rates1 createGetH15Rates1() {
        return new GetH15Rates1();
    }

    /**
     * Create an instance of {@link GetWSJRatesTest }
     * 
     */
    public GetWSJRatesTest createGetWSJRatesTest() {
        return new GetWSJRatesTest();
    }

    /**
     * Create an instance of {@link GetH15Rates1Response }
     * 
     */
    public GetH15Rates1Response createGetH15Rates1Response() {
        return new GetH15Rates1Response();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link GetH15RatesResponse }
     * 
     */
    public GetH15RatesResponse createGetH15RatesResponse() {
        return new GetH15RatesResponse();
    }

    /**
     * Create an instance of {@link GetWSJRates }
     * 
     */
    public GetWSJRates createGetWSJRates() {
        return new GetWSJRates();
    }

    /**
     * Create an instance of {@link GetWSJRatesResponse }
     * 
     */
    public GetWSJRatesResponse createGetWSJRatesResponse() {
        return new GetWSJRatesResponse();
    }

    /**
     * Create an instance of {@link GetLastH15RateResponse }
     * 
     */
    public GetLastH15RateResponse createGetLastH15RateResponse() {
        return new GetLastH15RateResponse();
    }

    /**
     * Create an instance of {@link InterestRate }
     * 
     */
    public InterestRate createInterestRate() {
        return new InterestRate();
    }

    /**
     * Create an instance of {@link RateDescription }
     * 
     */
    public RateDescription createRateDescription() {
        return new RateDescription();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSJRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "WSJRate")
    public JAXBElement<WSJRate> createWSJRate(WSJRate value) {
        return new JAXBElement<WSJRate>(_WSJRate_QNAME, WSJRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInterestRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfInterestRate")
    public JAXBElement<ArrayOfInterestRate> createArrayOfInterestRate(ArrayOfInterestRate value) {
        return new JAXBElement<ArrayOfInterestRate>(_ArrayOfInterestRate_QNAME, ArrayOfInterestRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWSJRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfWSJRate")
    public JAXBElement<ArrayOfWSJRate> createArrayOfWSJRate(ArrayOfWSJRate value) {
        return new JAXBElement<ArrayOfWSJRate>(_ArrayOfWSJRate_QNAME, ArrayOfWSJRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterestRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "InterestRate")
    public JAXBElement<InterestRate> createInterestRate(InterestRate value) {
        return new JAXBElement<InterestRate>(_InterestRate_QNAME, InterestRate.class, null, value);
    }

}
