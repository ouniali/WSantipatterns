
package ca.ubc.cstudies.netpub.dotnet.webservices.financialfunctions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ca.ubc.cstudies.netpub.dotnet.webservices.financialfunctions package. 
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

    private final static QName _Double_QNAME = new QName("http://netpub.cstudies.ubc.ca/dotnet/WebServices/FinancialFunctions", "double");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ca.ubc.cstudies.netpub.dotnet.webservices.financialfunctions
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EffectiveInterestResponse }
     * 
     */
    public EffectiveInterestResponse createEffectiveInterestResponse() {
        return new EffectiveInterestResponse();
    }

    /**
     * Create an instance of {@link FutureValue }
     * 
     */
    public FutureValue createFutureValue() {
        return new FutureValue();
    }

    /**
     * Create an instance of {@link FutureValueResponse }
     * 
     */
    public FutureValueResponse createFutureValueResponse() {
        return new FutureValueResponse();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link EffectiveInterest }
     * 
     */
    public EffectiveInterest createEffectiveInterest() {
        return new EffectiveInterest();
    }

    /**
     * Create an instance of {@link PaymentResponse }
     * 
     */
    public PaymentResponse createPaymentResponse() {
        return new PaymentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://netpub.cstudies.ubc.ca/dotnet/WebServices/FinancialFunctions", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

}
