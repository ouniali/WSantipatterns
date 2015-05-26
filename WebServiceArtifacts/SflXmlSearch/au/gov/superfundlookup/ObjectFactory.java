
package au.gov.superfundlookup;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.gov.superfundlookup package. 
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

    private final static QName _SuperFundPayload_QNAME = new QName("http://superfundlookup.gov.au", "SuperFundPayload");
    private final static QName _SuperFundNamesPayload_QNAME = new QName("http://superfundlookup.gov.au", "SuperFundNamesPayload");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.gov.superfundlookup
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchByABN }
     * 
     */
    public SearchByABN createSearchByABN() {
        return new SearchByABN();
    }

    /**
     * Create an instance of {@link SearchByName }
     * 
     */
    public SearchByName createSearchByName() {
        return new SearchByName();
    }

    /**
     * Create an instance of {@link SearchByABNResponse }
     * 
     */
    public SearchByABNResponse createSearchByABNResponse() {
        return new SearchByABNResponse();
    }

    /**
     * Create an instance of {@link FundPayload }
     * 
     */
    public FundPayload createFundPayload() {
        return new FundPayload();
    }

    /**
     * Create an instance of {@link SearchByNameResponse }
     * 
     */
    public SearchByNameResponse createSearchByNameResponse() {
        return new SearchByNameResponse();
    }

    /**
     * Create an instance of {@link FundNamesPayload }
     * 
     */
    public FundNamesPayload createFundNamesPayload() {
        return new FundNamesPayload();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ResponseException }
     * 
     */
    public ResponseException createResponseException() {
        return new ResponseException();
    }

    /**
     * Create an instance of {@link MatchingFundNames }
     * 
     */
    public MatchingFundNames createMatchingFundNames() {
        return new MatchingFundNames();
    }

    /**
     * Create an instance of {@link FundNamesResponse }
     * 
     */
    public FundNamesResponse createFundNamesResponse() {
        return new FundNamesResponse();
    }

    /**
     * Create an instance of {@link IdentifierSearch }
     * 
     */
    public IdentifierSearch createIdentifierSearch() {
        return new IdentifierSearch();
    }

    /**
     * Create an instance of {@link SuperannuationFund }
     * 
     */
    public SuperannuationFund createSuperannuationFund() {
        return new SuperannuationFund();
    }

    /**
     * Create an instance of {@link MatchingFundName }
     * 
     */
    public MatchingFundName createMatchingFundName() {
        return new MatchingFundName();
    }

    /**
     * Create an instance of {@link ComplyingStatus }
     * 
     */
    public ComplyingStatus createComplyingStatus() {
        return new ComplyingStatus();
    }

    /**
     * Create an instance of {@link FundNameAbn }
     * 
     */
    public FundNameAbn createFundNameAbn() {
        return new FundNameAbn();
    }

    /**
     * Create an instance of {@link IdentifierStatus }
     * 
     */
    public IdentifierStatus createIdentifierStatus() {
        return new IdentifierStatus();
    }

    /**
     * Create an instance of {@link NameSearch }
     * 
     */
    public NameSearch createNameSearch() {
        return new NameSearch();
    }

    /**
     * Create an instance of {@link FundResponse }
     * 
     */
    public FundResponse createFundResponse() {
        return new FundResponse();
    }

    /**
     * Create an instance of {@link Identifier }
     * 
     */
    public Identifier createIdentifier() {
        return new Identifier();
    }

    /**
     * Create an instance of {@link FundType }
     * 
     */
    public FundType createFundType() {
        return new FundType();
    }

    /**
     * Create an instance of {@link FundName }
     * 
     */
    public FundName createFundName() {
        return new FundName();
    }

    /**
     * Create an instance of {@link OrganisationName }
     * 
     */
    public OrganisationName createOrganisationName() {
        return new OrganisationName();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FundPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superfundlookup.gov.au", name = "SuperFundPayload")
    public JAXBElement<FundPayload> createSuperFundPayload(FundPayload value) {
        return new JAXBElement<FundPayload>(_SuperFundPayload_QNAME, FundPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FundNamesPayload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superfundlookup.gov.au", name = "SuperFundNamesPayload")
    public JAXBElement<FundNamesPayload> createSuperFundNamesPayload(FundNamesPayload value) {
        return new JAXBElement<FundNamesPayload>(_SuperFundNamesPayload_QNAME, FundNamesPayload.class, null, value);
    }

}
