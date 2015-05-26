
package com.peninsulatruck.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.peninsulatruck.webservices package. 
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

    private final static QName _RateQuote_QNAME = new QName("http://peninsulatruck.com/WebServices/", "rateQuote");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.peninsulatruck.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RateQuote }
     * 
     */
    public RateQuote createRateQuote() {
        return new RateQuote();
    }

    /**
     * Create an instance of {@link CreateQuote }
     * 
     */
    public CreateQuote createCreateQuote() {
        return new CreateQuote();
    }

    /**
     * Create an instance of {@link CreateQuoteResponse }
     * 
     */
    public CreateQuoteResponse createCreateQuoteResponse() {
        return new CreateQuoteResponse();
    }

    /**
     * Create an instance of {@link QuoteDetail }
     * 
     */
    public QuoteDetail createQuoteDetail() {
        return new QuoteDetail();
    }

    /**
     * Create an instance of {@link RateItem }
     * 
     */
    public RateItem createRateItem() {
        return new RateItem();
    }

    /**
     * Create an instance of {@link ArrayOfAccessorialItem }
     * 
     */
    public ArrayOfAccessorialItem createArrayOfAccessorialItem() {
        return new ArrayOfAccessorialItem();
    }

    /**
     * Create an instance of {@link AccessorialItem }
     * 
     */
    public AccessorialItem createAccessorialItem() {
        return new AccessorialItem();
    }

    /**
     * Create an instance of {@link MovePoint }
     * 
     */
    public MovePoint createMovePoint() {
        return new MovePoint();
    }

    /**
     * Create an instance of {@link ArrayOfRateItem }
     * 
     */
    public ArrayOfRateItem createArrayOfRateItem() {
        return new ArrayOfRateItem();
    }

    /**
     * Create an instance of {@link ArrayOfTransitItem }
     * 
     */
    public ArrayOfTransitItem createArrayOfTransitItem() {
        return new ArrayOfTransitItem();
    }

    /**
     * Create an instance of {@link TransitItem }
     * 
     */
    public TransitItem createTransitItem() {
        return new TransitItem();
    }

    /**
     * Create an instance of {@link ArrayOfMovePoint }
     * 
     */
    public ArrayOfMovePoint createArrayOfMovePoint() {
        return new ArrayOfMovePoint();
    }

    /**
     * Create an instance of {@link QuoteError }
     * 
     */
    public QuoteError createQuoteError() {
        return new QuoteError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peninsulatruck.com/WebServices/", name = "rateQuote")
    public JAXBElement<RateQuote> createRateQuote(RateQuote value) {
        return new JAXBElement<RateQuote>(_RateQuote_QNAME, RateQuote.class, null, value);
    }

}
