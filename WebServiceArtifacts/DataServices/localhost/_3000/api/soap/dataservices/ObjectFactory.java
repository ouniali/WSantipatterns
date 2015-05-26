
package localhost._3000.api.soap.dataservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost._3000.api.soap.dataservices package. 
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

    private final static QName _ChainId2DomainIds_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "ChainId2DomainIds");
    private final static QName _EC2PdbSuperfamilies_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "EC2PdbSuperfamilies");
    private final static QName _PdbId2DomainIdsResponse_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "PdbId2DomainIdsResponse");
    private final static QName _Ssg2DomainsResponse_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "Ssg2DomainsResponse");
    private final static QName _Superfamily2SsgsResponse_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "Superfamily2SsgsResponse");
    private final static QName _UniProtId2DomainIds_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "UniProtId2DomainIds");
    private final static QName _PdbSuperfamily2ECsResponse_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "PdbSuperfamily2ECsResponse");
    private final static QName _DomainId2UniprotIds_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "DomainId2UniprotIds");
    private final static QName _UniProtId2DomainIdsResponse_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "UniProtId2DomainIdsResponse");
    private final static QName _EC2PdbSuperfamiliesResponse_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "EC2PdbSuperfamiliesResponse");
    private final static QName _Ssg2Domains_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "Ssg2Domains");
    private final static QName _Superfamily2Ssgs_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "Superfamily2Ssgs");
    private final static QName _Domain2SsgResponse_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "Domain2SsgResponse");
    private final static QName _PdbSuperfamily2ECs_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "PdbSuperfamily2ECs");
    private final static QName _PdbId2DomainIds_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "PdbId2DomainIds");
    private final static QName _PdbSuperfamily2UniProtIds_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "PdbSuperfamily2UniProtIds");
    private final static QName _Domain2Ssg_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "Domain2Ssg");
    private final static QName _DomainId2UniprotIdsResponse_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "DomainId2UniprotIdsResponse");
    private final static QName _PdbSuperfamily2UniProtIdsResponse_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "PdbSuperfamily2UniProtIdsResponse");
    private final static QName _ChainId2DomainIdsResponse_QNAME = new QName("http://localhost:3000/api/soap/dataservices", "ChainId2DomainIdsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost._3000.api.soap.dataservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Domain2SsgResponseType }
     * 
     */
    public Domain2SsgResponseType createDomain2SsgResponseType() {
        return new Domain2SsgResponseType();
    }

    /**
     * Create an instance of {@link PdbSuperfamily2ECsType }
     * 
     */
    public PdbSuperfamily2ECsType createPdbSuperfamily2ECsType() {
        return new PdbSuperfamily2ECsType();
    }

    /**
     * Create an instance of {@link PdbId2DomainIdsType }
     * 
     */
    public PdbId2DomainIdsType createPdbId2DomainIdsType() {
        return new PdbId2DomainIdsType();
    }

    /**
     * Create an instance of {@link Ssg2DomainsType }
     * 
     */
    public Ssg2DomainsType createSsg2DomainsType() {
        return new Ssg2DomainsType();
    }

    /**
     * Create an instance of {@link Superfamily2SsgsType }
     * 
     */
    public Superfamily2SsgsType createSuperfamily2SsgsType() {
        return new Superfamily2SsgsType();
    }

    /**
     * Create an instance of {@link Domain2SsgType }
     * 
     */
    public Domain2SsgType createDomain2SsgType() {
        return new Domain2SsgType();
    }

    /**
     * Create an instance of {@link PdbSuperfamily2UniProtIdsType }
     * 
     */
    public PdbSuperfamily2UniProtIdsType createPdbSuperfamily2UniProtIdsType() {
        return new PdbSuperfamily2UniProtIdsType();
    }

    /**
     * Create an instance of {@link PdbSuperfamily2UniProtIdsResponseType }
     * 
     */
    public PdbSuperfamily2UniProtIdsResponseType createPdbSuperfamily2UniProtIdsResponseType() {
        return new PdbSuperfamily2UniProtIdsResponseType();
    }

    /**
     * Create an instance of {@link DomainId2UniprotIdsResponseType }
     * 
     */
    public DomainId2UniprotIdsResponseType createDomainId2UniprotIdsResponseType() {
        return new DomainId2UniprotIdsResponseType();
    }

    /**
     * Create an instance of {@link ChainId2DomainIdsResponseType }
     * 
     */
    public ChainId2DomainIdsResponseType createChainId2DomainIdsResponseType() {
        return new ChainId2DomainIdsResponseType();
    }

    /**
     * Create an instance of {@link ChainId2DomainIdsType }
     * 
     */
    public ChainId2DomainIdsType createChainId2DomainIdsType() {
        return new ChainId2DomainIdsType();
    }

    /**
     * Create an instance of {@link EC2PdbSuperfamiliesType }
     * 
     */
    public EC2PdbSuperfamiliesType createEC2PdbSuperfamiliesType() {
        return new EC2PdbSuperfamiliesType();
    }

    /**
     * Create an instance of {@link PdbId2DomainIdsResponseType }
     * 
     */
    public PdbId2DomainIdsResponseType createPdbId2DomainIdsResponseType() {
        return new PdbId2DomainIdsResponseType();
    }

    /**
     * Create an instance of {@link Ssg2DomainsResponseType }
     * 
     */
    public Ssg2DomainsResponseType createSsg2DomainsResponseType() {
        return new Ssg2DomainsResponseType();
    }

    /**
     * Create an instance of {@link Superfamily2SsgsResponseType }
     * 
     */
    public Superfamily2SsgsResponseType createSuperfamily2SsgsResponseType() {
        return new Superfamily2SsgsResponseType();
    }

    /**
     * Create an instance of {@link PdbSuperfamily2ECsResponseType }
     * 
     */
    public PdbSuperfamily2ECsResponseType createPdbSuperfamily2ECsResponseType() {
        return new PdbSuperfamily2ECsResponseType();
    }

    /**
     * Create an instance of {@link DomainId2UniprotIdsType }
     * 
     */
    public DomainId2UniprotIdsType createDomainId2UniprotIdsType() {
        return new DomainId2UniprotIdsType();
    }

    /**
     * Create an instance of {@link UniProtId2DomainIdsType }
     * 
     */
    public UniProtId2DomainIdsType createUniProtId2DomainIdsType() {
        return new UniProtId2DomainIdsType();
    }

    /**
     * Create an instance of {@link UniProtId2DomainIdsResponseType }
     * 
     */
    public UniProtId2DomainIdsResponseType createUniProtId2DomainIdsResponseType() {
        return new UniProtId2DomainIdsResponseType();
    }

    /**
     * Create an instance of {@link EC2PdbSuperfamiliesResponseType }
     * 
     */
    public EC2PdbSuperfamiliesResponseType createEC2PdbSuperfamiliesResponseType() {
        return new EC2PdbSuperfamiliesResponseType();
    }

    /**
     * Create an instance of {@link Superfamily2SsgsRecordType }
     * 
     */
    public Superfamily2SsgsRecordType createSuperfamily2SsgsRecordType() {
        return new Superfamily2SsgsRecordType();
    }

    /**
     * Create an instance of {@link EC2PdbSuperfamiliesRequestRecordType }
     * 
     */
    public EC2PdbSuperfamiliesRequestRecordType createEC2PdbSuperfamiliesRequestRecordType() {
        return new EC2PdbSuperfamiliesRequestRecordType();
    }

    /**
     * Create an instance of {@link PdbSuperfamily2ECsRequestRecordType }
     * 
     */
    public PdbSuperfamily2ECsRequestRecordType createPdbSuperfamily2ECsRequestRecordType() {
        return new PdbSuperfamily2ECsRequestRecordType();
    }

    /**
     * Create an instance of {@link EC2PdbSuperfamiliesRecordType }
     * 
     */
    public EC2PdbSuperfamiliesRecordType createEC2PdbSuperfamiliesRecordType() {
        return new EC2PdbSuperfamiliesRecordType();
    }

    /**
     * Create an instance of {@link Domain2SsgRecordType }
     * 
     */
    public Domain2SsgRecordType createDomain2SsgRecordType() {
        return new Domain2SsgRecordType();
    }

    /**
     * Create an instance of {@link ChainId2DomainIdsRequestRecordType }
     * 
     */
    public ChainId2DomainIdsRequestRecordType createChainId2DomainIdsRequestRecordType() {
        return new ChainId2DomainIdsRequestRecordType();
    }

    /**
     * Create an instance of {@link Ssg2DomainsRecordType }
     * 
     */
    public Ssg2DomainsRecordType createSsg2DomainsRecordType() {
        return new Ssg2DomainsRecordType();
    }

    /**
     * Create an instance of {@link PdbSuperfamily2UniProtIdsRecordType }
     * 
     */
    public PdbSuperfamily2UniProtIdsRecordType createPdbSuperfamily2UniProtIdsRecordType() {
        return new PdbSuperfamily2UniProtIdsRecordType();
    }

    /**
     * Create an instance of {@link Ssg2DomainsRequestRecordType }
     * 
     */
    public Ssg2DomainsRequestRecordType createSsg2DomainsRequestRecordType() {
        return new Ssg2DomainsRequestRecordType();
    }

    /**
     * Create an instance of {@link PdbSuperfamily2UniProtIdsRequestRecordType }
     * 
     */
    public PdbSuperfamily2UniProtIdsRequestRecordType createPdbSuperfamily2UniProtIdsRequestRecordType() {
        return new PdbSuperfamily2UniProtIdsRequestRecordType();
    }

    /**
     * Create an instance of {@link PdbId2DomainIdsRecordType }
     * 
     */
    public PdbId2DomainIdsRecordType createPdbId2DomainIdsRecordType() {
        return new PdbId2DomainIdsRecordType();
    }

    /**
     * Create an instance of {@link ChainId2DomainIdsRecordType }
     * 
     */
    public ChainId2DomainIdsRecordType createChainId2DomainIdsRecordType() {
        return new ChainId2DomainIdsRecordType();
    }

    /**
     * Create an instance of {@link PdbSuperfamily2ECsRecordType }
     * 
     */
    public PdbSuperfamily2ECsRecordType createPdbSuperfamily2ECsRecordType() {
        return new PdbSuperfamily2ECsRecordType();
    }

    /**
     * Create an instance of {@link DomainId2UniprotIdsRequestRecordType }
     * 
     */
    public DomainId2UniprotIdsRequestRecordType createDomainId2UniprotIdsRequestRecordType() {
        return new DomainId2UniprotIdsRequestRecordType();
    }

    /**
     * Create an instance of {@link PdbId2DomainIdsRequestRecordType }
     * 
     */
    public PdbId2DomainIdsRequestRecordType createPdbId2DomainIdsRequestRecordType() {
        return new PdbId2DomainIdsRequestRecordType();
    }

    /**
     * Create an instance of {@link UniProtId2DomainIdsRecordType }
     * 
     */
    public UniProtId2DomainIdsRecordType createUniProtId2DomainIdsRecordType() {
        return new UniProtId2DomainIdsRecordType();
    }

    /**
     * Create an instance of {@link UniProtId2DomainIdsRequestRecordType }
     * 
     */
    public UniProtId2DomainIdsRequestRecordType createUniProtId2DomainIdsRequestRecordType() {
        return new UniProtId2DomainIdsRequestRecordType();
    }

    /**
     * Create an instance of {@link Domain2SsgRequestRecordType }
     * 
     */
    public Domain2SsgRequestRecordType createDomain2SsgRequestRecordType() {
        return new Domain2SsgRequestRecordType();
    }

    /**
     * Create an instance of {@link Superfamily2SsgsRequestRecordType }
     * 
     */
    public Superfamily2SsgsRequestRecordType createSuperfamily2SsgsRequestRecordType() {
        return new Superfamily2SsgsRequestRecordType();
    }

    /**
     * Create an instance of {@link DomainId2UniprotIdsRecordType }
     * 
     */
    public DomainId2UniprotIdsRecordType createDomainId2UniprotIdsRecordType() {
        return new DomainId2UniprotIdsRecordType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChainId2DomainIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "ChainId2DomainIds")
    public JAXBElement<ChainId2DomainIdsType> createChainId2DomainIds(ChainId2DomainIdsType value) {
        return new JAXBElement<ChainId2DomainIdsType>(_ChainId2DomainIds_QNAME, ChainId2DomainIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EC2PdbSuperfamiliesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "EC2PdbSuperfamilies")
    public JAXBElement<EC2PdbSuperfamiliesType> createEC2PdbSuperfamilies(EC2PdbSuperfamiliesType value) {
        return new JAXBElement<EC2PdbSuperfamiliesType>(_EC2PdbSuperfamilies_QNAME, EC2PdbSuperfamiliesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PdbId2DomainIdsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "PdbId2DomainIdsResponse")
    public JAXBElement<PdbId2DomainIdsResponseType> createPdbId2DomainIdsResponse(PdbId2DomainIdsResponseType value) {
        return new JAXBElement<PdbId2DomainIdsResponseType>(_PdbId2DomainIdsResponse_QNAME, PdbId2DomainIdsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ssg2DomainsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "Ssg2DomainsResponse")
    public JAXBElement<Ssg2DomainsResponseType> createSsg2DomainsResponse(Ssg2DomainsResponseType value) {
        return new JAXBElement<Ssg2DomainsResponseType>(_Ssg2DomainsResponse_QNAME, Ssg2DomainsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Superfamily2SsgsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "Superfamily2SsgsResponse")
    public JAXBElement<Superfamily2SsgsResponseType> createSuperfamily2SsgsResponse(Superfamily2SsgsResponseType value) {
        return new JAXBElement<Superfamily2SsgsResponseType>(_Superfamily2SsgsResponse_QNAME, Superfamily2SsgsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniProtId2DomainIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "UniProtId2DomainIds")
    public JAXBElement<UniProtId2DomainIdsType> createUniProtId2DomainIds(UniProtId2DomainIdsType value) {
        return new JAXBElement<UniProtId2DomainIdsType>(_UniProtId2DomainIds_QNAME, UniProtId2DomainIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PdbSuperfamily2ECsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "PdbSuperfamily2ECsResponse")
    public JAXBElement<PdbSuperfamily2ECsResponseType> createPdbSuperfamily2ECsResponse(PdbSuperfamily2ECsResponseType value) {
        return new JAXBElement<PdbSuperfamily2ECsResponseType>(_PdbSuperfamily2ECsResponse_QNAME, PdbSuperfamily2ECsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainId2UniprotIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "DomainId2UniprotIds")
    public JAXBElement<DomainId2UniprotIdsType> createDomainId2UniprotIds(DomainId2UniprotIdsType value) {
        return new JAXBElement<DomainId2UniprotIdsType>(_DomainId2UniprotIds_QNAME, DomainId2UniprotIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UniProtId2DomainIdsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "UniProtId2DomainIdsResponse")
    public JAXBElement<UniProtId2DomainIdsResponseType> createUniProtId2DomainIdsResponse(UniProtId2DomainIdsResponseType value) {
        return new JAXBElement<UniProtId2DomainIdsResponseType>(_UniProtId2DomainIdsResponse_QNAME, UniProtId2DomainIdsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EC2PdbSuperfamiliesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "EC2PdbSuperfamiliesResponse")
    public JAXBElement<EC2PdbSuperfamiliesResponseType> createEC2PdbSuperfamiliesResponse(EC2PdbSuperfamiliesResponseType value) {
        return new JAXBElement<EC2PdbSuperfamiliesResponseType>(_EC2PdbSuperfamiliesResponse_QNAME, EC2PdbSuperfamiliesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ssg2DomainsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "Ssg2Domains")
    public JAXBElement<Ssg2DomainsType> createSsg2Domains(Ssg2DomainsType value) {
        return new JAXBElement<Ssg2DomainsType>(_Ssg2Domains_QNAME, Ssg2DomainsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Superfamily2SsgsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "Superfamily2Ssgs")
    public JAXBElement<Superfamily2SsgsType> createSuperfamily2Ssgs(Superfamily2SsgsType value) {
        return new JAXBElement<Superfamily2SsgsType>(_Superfamily2Ssgs_QNAME, Superfamily2SsgsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Domain2SsgResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "Domain2SsgResponse")
    public JAXBElement<Domain2SsgResponseType> createDomain2SsgResponse(Domain2SsgResponseType value) {
        return new JAXBElement<Domain2SsgResponseType>(_Domain2SsgResponse_QNAME, Domain2SsgResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PdbSuperfamily2ECsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "PdbSuperfamily2ECs")
    public JAXBElement<PdbSuperfamily2ECsType> createPdbSuperfamily2ECs(PdbSuperfamily2ECsType value) {
        return new JAXBElement<PdbSuperfamily2ECsType>(_PdbSuperfamily2ECs_QNAME, PdbSuperfamily2ECsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PdbId2DomainIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "PdbId2DomainIds")
    public JAXBElement<PdbId2DomainIdsType> createPdbId2DomainIds(PdbId2DomainIdsType value) {
        return new JAXBElement<PdbId2DomainIdsType>(_PdbId2DomainIds_QNAME, PdbId2DomainIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PdbSuperfamily2UniProtIdsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "PdbSuperfamily2UniProtIds")
    public JAXBElement<PdbSuperfamily2UniProtIdsType> createPdbSuperfamily2UniProtIds(PdbSuperfamily2UniProtIdsType value) {
        return new JAXBElement<PdbSuperfamily2UniProtIdsType>(_PdbSuperfamily2UniProtIds_QNAME, PdbSuperfamily2UniProtIdsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Domain2SsgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "Domain2Ssg")
    public JAXBElement<Domain2SsgType> createDomain2Ssg(Domain2SsgType value) {
        return new JAXBElement<Domain2SsgType>(_Domain2Ssg_QNAME, Domain2SsgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainId2UniprotIdsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "DomainId2UniprotIdsResponse")
    public JAXBElement<DomainId2UniprotIdsResponseType> createDomainId2UniprotIdsResponse(DomainId2UniprotIdsResponseType value) {
        return new JAXBElement<DomainId2UniprotIdsResponseType>(_DomainId2UniprotIdsResponse_QNAME, DomainId2UniprotIdsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PdbSuperfamily2UniProtIdsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "PdbSuperfamily2UniProtIdsResponse")
    public JAXBElement<PdbSuperfamily2UniProtIdsResponseType> createPdbSuperfamily2UniProtIdsResponse(PdbSuperfamily2UniProtIdsResponseType value) {
        return new JAXBElement<PdbSuperfamily2UniProtIdsResponseType>(_PdbSuperfamily2UniProtIdsResponse_QNAME, PdbSuperfamily2UniProtIdsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChainId2DomainIdsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:3000/api/soap/dataservices", name = "ChainId2DomainIdsResponse")
    public JAXBElement<ChainId2DomainIdsResponseType> createChainId2DomainIdsResponse(ChainId2DomainIdsResponseType value) {
        return new JAXBElement<ChainId2DomainIdsResponseType>(_ChainId2DomainIdsResponse_QNAME, ChainId2DomainIdsResponseType.class, null, value);
    }

}
