
package https.ws_esortcode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.ws_esortcode package. 
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

    private final static QName _ValidationCC_QNAME = new QName("https://ws.esortcode.com", "ValidationCC");
    private final static QName _Standardise_QNAME = new QName("https://ws.esortcode.com", "Standardise");
    private final static QName _BranchDetail_QNAME = new QName("https://ws.esortcode.com", "BranchDetail");
    private final static QName _String_QNAME = new QName("https://ws.esortcode.com", "string");
    private final static QName _Validation_QNAME = new QName("https://ws.esortcode.com", "Validation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.ws_esortcode
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BranchDetailsResponse }
     * 
     */
    public BranchDetailsResponse createBranchDetailsResponse() {
        return new BranchDetailsResponse();
    }

    /**
     * Create an instance of {@link BranchDetail }
     * 
     */
    public BranchDetail createBranchDetail() {
        return new BranchDetail();
    }

    /**
     * Create an instance of {@link Validation }
     * 
     */
    public Validation createValidation() {
        return new Validation();
    }

    /**
     * Create an instance of {@link ValidateCreditCardResponse }
     * 
     */
    public ValidateCreditCardResponse createValidateCreditCardResponse() {
        return new ValidateCreditCardResponse();
    }

    /**
     * Create an instance of {@link ValidationCC }
     * 
     */
    public ValidationCC createValidationCC() {
        return new ValidationCC();
    }

    /**
     * Create an instance of {@link StandardiseAccount }
     * 
     */
    public StandardiseAccount createStandardiseAccount() {
        return new StandardiseAccount();
    }

    /**
     * Create an instance of {@link ValidateAccount }
     * 
     */
    public ValidateAccount createValidateAccount() {
        return new ValidateAccount();
    }

    /**
     * Create an instance of {@link StandardiseAccountResponse }
     * 
     */
    public StandardiseAccountResponse createStandardiseAccountResponse() {
        return new StandardiseAccountResponse();
    }

    /**
     * Create an instance of {@link Standardise }
     * 
     */
    public Standardise createStandardise() {
        return new Standardise();
    }

    /**
     * Create an instance of {@link ValidateAccountGetBranchDetailsResponse }
     * 
     */
    public ValidateAccountGetBranchDetailsResponse createValidateAccountGetBranchDetailsResponse() {
        return new ValidateAccountGetBranchDetailsResponse();
    }

    /**
     * Create an instance of {@link ValidateCreditCard }
     * 
     */
    public ValidateCreditCard createValidateCreditCard() {
        return new ValidateCreditCard();
    }

    /**
     * Create an instance of {@link ServiceTestResponse }
     * 
     */
    public ServiceTestResponse createServiceTestResponse() {
        return new ServiceTestResponse();
    }

    /**
     * Create an instance of {@link ValidateAccountResponse }
     * 
     */
    public ValidateAccountResponse createValidateAccountResponse() {
        return new ValidateAccountResponse();
    }

    /**
     * Create an instance of {@link ValidateAccountGetBranchDetails }
     * 
     */
    public ValidateAccountGetBranchDetails createValidateAccountGetBranchDetails() {
        return new ValidateAccountGetBranchDetails();
    }

    /**
     * Create an instance of {@link BranchDetails }
     * 
     */
    public BranchDetails createBranchDetails() {
        return new BranchDetails();
    }

    /**
     * Create an instance of {@link ServiceTest }
     * 
     */
    public ServiceTest createServiceTest() {
        return new ServiceTest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationCC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://ws.esortcode.com", name = "ValidationCC")
    public JAXBElement<ValidationCC> createValidationCC(ValidationCC value) {
        return new JAXBElement<ValidationCC>(_ValidationCC_QNAME, ValidationCC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Standardise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://ws.esortcode.com", name = "Standardise")
    public JAXBElement<Standardise> createStandardise(Standardise value) {
        return new JAXBElement<Standardise>(_Standardise_QNAME, Standardise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BranchDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://ws.esortcode.com", name = "BranchDetail")
    public JAXBElement<BranchDetail> createBranchDetail(BranchDetail value) {
        return new JAXBElement<BranchDetail>(_BranchDetail_QNAME, BranchDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://ws.esortcode.com", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Validation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://ws.esortcode.com", name = "Validation")
    public JAXBElement<Validation> createValidation(Validation value) {
        return new JAXBElement<Validation>(_Validation_QNAME, Validation.class, null, value);
    }

}
