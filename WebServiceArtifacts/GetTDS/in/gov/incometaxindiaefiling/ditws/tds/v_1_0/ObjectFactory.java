
package in.gov.incometaxindiaefiling.ditws.tds.v_1_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.gov.incometaxindiaefiling.ditws.tds.v_1_0 package. 
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

    private final static QName _GetTDSResponse_QNAME = new QName("http://incometaxindiaefiling.gov.in/ditws/tds/v_1_0", "GetTDSResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.gov.incometaxindiaefiling.ditws.tds.v_1_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTDSDetails }
     * 
     */
    public GetTDSDetails createGetTDSDetails() {
        return new GetTDSDetails();
    }

    /**
     * Create an instance of {@link LoginInfoType }
     * 
     */
    public LoginInfoType createLoginInfoType() {
        return new LoginInfoType();
    }

    /**
     * Create an instance of {@link ClientInfoType }
     * 
     */
    public ClientInfoType createClientInfoType() {
        return new ClientInfoType();
    }

    /**
     * Create an instance of {@link GetTDSResponseType }
     * 
     */
    public GetTDSResponseType createGetTDSResponseType() {
        return new GetTDSResponseType();
    }

    /**
     * Create an instance of {@link TDSonOthThanSalsType }
     * 
     */
    public TDSonOthThanSalsType createTDSonOthThanSalsType() {
        return new TDSonOthThanSalsType();
    }

    /**
     * Create an instance of {@link ScheduleTCSType }
     * 
     */
    public ScheduleTCSType createScheduleTCSType() {
        return new ScheduleTCSType();
    }

    /**
     * Create an instance of {@link TaxPaymentsType }
     * 
     */
    public TaxPaymentsType createTaxPaymentsType() {
        return new TaxPaymentsType();
    }

    /**
     * Create an instance of {@link TDSonSalariesType }
     * 
     */
    public TDSonSalariesType createTDSonSalariesType() {
        return new TDSonSalariesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTDSResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://incometaxindiaefiling.gov.in/ditws/tds/v_1_0", name = "GetTDSResponse")
    public JAXBElement<GetTDSResponseType> createGetTDSResponse(GetTDSResponseType value) {
        return new JAXBElement<GetTDSResponseType>(_GetTDSResponse_QNAME, GetTDSResponseType.class, null, value);
    }

}
