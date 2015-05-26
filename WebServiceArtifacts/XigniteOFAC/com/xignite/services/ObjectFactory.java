
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

    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _SearchResults_QNAME = new QName("http://www.xignite.com/services/", "SearchResults");
    private final static QName _Criteria_QNAME = new QName("http://www.xignite.com/services/", "Criteria");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchByName }
     * 
     */
    public SearchByName createSearchByName() {
        return new SearchByName();
    }

    /**
     * Create an instance of {@link SearchOrganization }
     * 
     */
    public SearchOrganization createSearchOrganization() {
        return new SearchOrganization();
    }

    /**
     * Create an instance of {@link SearchIndividualResponse }
     * 
     */
    public SearchIndividualResponse createSearchIndividualResponse() {
        return new SearchIndividualResponse();
    }

    /**
     * Create an instance of {@link SearchResults }
     * 
     */
    public SearchResults createSearchResults() {
        return new SearchResults();
    }

    /**
     * Create an instance of {@link GetCriteria }
     * 
     */
    public GetCriteria createGetCriteria() {
        return new GetCriteria();
    }

    /**
     * Create an instance of {@link SearchByNameResponse }
     * 
     */
    public SearchByNameResponse createSearchByNameResponse() {
        return new SearchByNameResponse();
    }

    /**
     * Create an instance of {@link SearchIndividual }
     * 
     */
    public SearchIndividual createSearchIndividual() {
        return new SearchIndividual();
    }

    /**
     * Create an instance of {@link Criteria }
     * 
     */
    public Criteria createCriteria() {
        return new Criteria();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link SearchVesselResponse }
     * 
     */
    public SearchVesselResponse createSearchVesselResponse() {
        return new SearchVesselResponse();
    }

    /**
     * Create an instance of {@link SearchOrganizationResponse }
     * 
     */
    public SearchOrganizationResponse createSearchOrganizationResponse() {
        return new SearchOrganizationResponse();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link SearchByAddress }
     * 
     */
    public SearchByAddress createSearchByAddress() {
        return new SearchByAddress();
    }

    /**
     * Create an instance of {@link GetCriteriaResponse }
     * 
     */
    public GetCriteriaResponse createGetCriteriaResponse() {
        return new GetCriteriaResponse();
    }

    /**
     * Create an instance of {@link SearchByAddressResponse }
     * 
     */
    public SearchByAddressResponse createSearchByAddressResponse() {
        return new SearchByAddressResponse();
    }

    /**
     * Create an instance of {@link SearchVessel }
     * 
     */
    public SearchVessel createSearchVessel() {
        return new SearchVessel();
    }

    /**
     * Create an instance of {@link SearchCriteria }
     * 
     */
    public SearchCriteria createSearchCriteria() {
        return new SearchCriteria();
    }

    /**
     * Create an instance of {@link ArrayOfOFACName }
     * 
     */
    public ArrayOfOFACName createArrayOfOFACName() {
        return new ArrayOfOFACName();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link ArrayOfSanctionProgram }
     * 
     */
    public ArrayOfSanctionProgram createArrayOfSanctionProgram() {
        return new ArrayOfSanctionProgram();
    }

    /**
     * Create an instance of {@link SanctionProgram }
     * 
     */
    public SanctionProgram createSanctionProgram() {
        return new SanctionProgram();
    }

    /**
     * Create an instance of {@link Vessel }
     * 
     */
    public Vessel createVessel() {
        return new Vessel();
    }

    /**
     * Create an instance of {@link ArrayOfOFACAddress }
     * 
     */
    public ArrayOfOFACAddress createArrayOfOFACAddress() {
        return new ArrayOfOFACAddress();
    }

    /**
     * Create an instance of {@link ArrayOfOFACAlternateName }
     * 
     */
    public ArrayOfOFACAlternateName createArrayOfOFACAlternateName() {
        return new ArrayOfOFACAlternateName();
    }

    /**
     * Create an instance of {@link OFACAlternateName }
     * 
     */
    public OFACAlternateName createOFACAlternateName() {
        return new OFACAlternateName();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link OFACName }
     * 
     */
    public OFACName createOFACName() {
        return new OFACName();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link OFACAddress }
     * 
     */
    public OFACAddress createOFACAddress() {
        return new OFACAddress();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResults }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "SearchResults")
    public JAXBElement<SearchResults> createSearchResults(SearchResults value) {
        return new JAXBElement<SearchResults>(_SearchResults_QNAME, SearchResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Criteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "Criteria")
    public JAXBElement<Criteria> createCriteria(Criteria value) {
        return new JAXBElement<Criteria>(_Criteria_QNAME, Criteria.class, null, value);
    }

}
