
package nl.textkernel.home.search;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.textkernel.home.search package. 
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

    private final static QName _SearchBoxException_QNAME = new QName("http://home.textkernel.nl/search", "SearchBoxException");
    private final static QName _SearchWithToken_QNAME = new QName("http://home.textkernel.nl/search", "searchWithToken");
    private final static QName _GetMetadataResponse_QNAME = new QName("http://home.textkernel.nl/search", "getMetadataResponse");
    private final static QName _SearchWithState_QNAME = new QName("http://home.textkernel.nl/search", "searchWithState");
    private final static QName _GetMetadataWithTokenResponse_QNAME = new QName("http://home.textkernel.nl/search", "getMetadataWithTokenResponse");
    private final static QName _SearchWithTokenResponse_QNAME = new QName("http://home.textkernel.nl/search", "searchWithTokenResponse");
    private final static QName _GetMetadataWithToken_QNAME = new QName("http://home.textkernel.nl/search", "getMetadataWithToken");
    private final static QName _SearchResponse_QNAME = new QName("http://home.textkernel.nl/search", "searchResponse");
    private final static QName _SearchWithStateResponse_QNAME = new QName("http://home.textkernel.nl/search", "searchWithStateResponse");
    private final static QName _GetMetadata_QNAME = new QName("http://home.textkernel.nl/search", "getMetadata");
    private final static QName _Search_QNAME = new QName("http://home.textkernel.nl/search", "search");
    private final static QName _AccessOptionsExternalTokens_QNAME = new QName("", "externalTokens");
    private final static QName _AccessOptionsSearcherAccess_QNAME = new QName("", "searcherAccess");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.textkernel.home.search
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link nl.textkernel.home.search.SearcherMetadata }
     * 
     */
    public nl.textkernel.home.search.SearcherMetadata createSearcherMetadata() {
        return new nl.textkernel.home.search.SearcherMetadata();
    }

    /**
     * Create an instance of {@link nl.textkernel.home.search.SearcherMetadata.ResultFieldLabels }
     * 
     */
    public nl.textkernel.home.search.SearcherMetadata.ResultFieldLabels createSearcherMetadataResultFieldLabels() {
        return new nl.textkernel.home.search.SearcherMetadata.ResultFieldLabels();
    }

    /**
     * Create an instance of {@link CompositeMetadata }
     * 
     */
    public CompositeMetadata createCompositeMetadata() {
        return new CompositeMetadata();
    }

    /**
     * Create an instance of {@link CompositeMetadata.LinkNameLabels }
     * 
     */
    public CompositeMetadata.LinkNameLabels createCompositeMetadataLinkNameLabels() {
        return new CompositeMetadata.LinkNameLabels();
    }

    /**
     * Create an instance of {@link CompositeMetadata.FieldNameLabels }
     * 
     */
    public CompositeMetadata.FieldNameLabels createCompositeMetadataFieldNameLabels() {
        return new CompositeMetadata.FieldNameLabels();
    }

    /**
     * Create an instance of {@link CompositeMetadata.SearcherMetadata }
     * 
     */
    public CompositeMetadata.SearcherMetadata createCompositeMetadataSearcherMetadata() {
        return new CompositeMetadata.SearcherMetadata();
    }

    /**
     * Create an instance of {@link ItemCountMap }
     * 
     */
    public ItemCountMap createItemCountMap() {
        return new ItemCountMap();
    }

    /**
     * Create an instance of {@link ItemCountMap.ItemCounts }
     * 
     */
    public ItemCountMap.ItemCounts createItemCountMapItemCounts() {
        return new ItemCountMap.ItemCounts();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link SearchResult.Synonyms }
     * 
     */
    public SearchResult.Synonyms createSearchResultSynonyms() {
        return new SearchResult.Synonyms();
    }

    /**
     * Create an instance of {@link SearchResult.FacetCounts }
     * 
     */
    public SearchResult.FacetCounts createSearchResultFacetCounts() {
        return new SearchResult.FacetCounts();
    }

    /**
     * Create an instance of {@link GetMetadata }
     * 
     */
    public GetMetadata createGetMetadata() {
        return new GetMetadata();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link SearchWithStateResponse }
     * 
     */
    public SearchWithStateResponse createSearchWithStateResponse() {
        return new SearchWithStateResponse();
    }

    /**
     * Create an instance of {@link GetMetadataWithToken }
     * 
     */
    public GetMetadataWithToken createGetMetadataWithToken() {
        return new GetMetadataWithToken();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link GetMetadataWithTokenResponse }
     * 
     */
    public GetMetadataWithTokenResponse createGetMetadataWithTokenResponse() {
        return new GetMetadataWithTokenResponse();
    }

    /**
     * Create an instance of {@link SearchWithTokenResponse }
     * 
     */
    public SearchWithTokenResponse createSearchWithTokenResponse() {
        return new SearchWithTokenResponse();
    }

    /**
     * Create an instance of {@link GetMetadataResponse }
     * 
     */
    public GetMetadataResponse createGetMetadataResponse() {
        return new GetMetadataResponse();
    }

    /**
     * Create an instance of {@link SearchWithState }
     * 
     */
    public SearchWithState createSearchWithState() {
        return new SearchWithState();
    }

    /**
     * Create an instance of {@link FaultBean }
     * 
     */
    public FaultBean createFaultBean() {
        return new FaultBean();
    }

    /**
     * Create an instance of {@link SearchWithToken }
     * 
     */
    public SearchWithToken createSearchWithToken() {
        return new SearchWithToken();
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link StringMap }
     * 
     */
    public StringMap createStringMap() {
        return new StringMap();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link SynonymSectionArray }
     * 
     */
    public SynonymSectionArray createSynonymSectionArray() {
        return new SynonymSectionArray();
    }

    /**
     * Create an instance of {@link ResultField }
     * 
     */
    public ResultField createResultField() {
        return new ResultField();
    }

    /**
     * Create an instance of {@link DocumentIdLink }
     * 
     */
    public DocumentIdLink createDocumentIdLink() {
        return new DocumentIdLink();
    }

    /**
     * Create an instance of {@link ActionLink }
     * 
     */
    public ActionLink createActionLink() {
        return new ActionLink();
    }

    /**
     * Create an instance of {@link QueryPart }
     * 
     */
    public QueryPart createQueryPart() {
        return new QueryPart();
    }

    /**
     * Create an instance of {@link SynonymSection }
     * 
     */
    public SynonymSection createSynonymSection() {
        return new SynonymSection();
    }

    /**
     * Create an instance of {@link StringMapEntry }
     * 
     */
    public StringMapEntry createStringMapEntry() {
        return new StringMapEntry();
    }

    /**
     * Create an instance of {@link UserOptions }
     * 
     */
    public UserOptions createUserOptions() {
        return new UserOptions();
    }

    /**
     * Create an instance of {@link SynonymItem }
     * 
     */
    public SynonymItem createSynonymItem() {
        return new SynonymItem();
    }

    /**
     * Create an instance of {@link CredentialsMapEntry }
     * 
     */
    public CredentialsMapEntry createCredentialsMapEntry() {
        return new CredentialsMapEntry();
    }

    /**
     * Create an instance of {@link DocumentIdItem }
     * 
     */
    public DocumentIdItem createDocumentIdItem() {
        return new DocumentIdItem();
    }

    /**
     * Create an instance of {@link SavingConfig }
     * 
     */
    public SavingConfig createSavingConfig() {
        return new SavingConfig();
    }

    /**
     * Create an instance of {@link ResultItem }
     * 
     */
    public ResultItem createResultItem() {
        return new ResultItem();
    }

    /**
     * Create an instance of {@link ActionItem }
     * 
     */
    public ActionItem createActionItem() {
        return new ActionItem();
    }

    /**
     * Create an instance of {@link CredentialsMap }
     * 
     */
    public CredentialsMap createCredentialsMap() {
        return new CredentialsMap();
    }

    /**
     * Create an instance of {@link Tagcloud }
     * 
     */
    public Tagcloud createTagcloud() {
        return new Tagcloud();
    }

    /**
     * Create an instance of {@link QueryPartItem }
     * 
     */
    public QueryPartItem createQueryPartItem() {
        return new QueryPartItem();
    }

    /**
     * Create an instance of {@link AccessOptions }
     * 
     */
    public AccessOptions createAccessOptions() {
        return new AccessOptions();
    }

    /**
     * Create an instance of {@link Facet }
     * 
     */
    public Facet createFacet() {
        return new Facet();
    }

    /**
     * Create an instance of {@link HeaderLink }
     * 
     */
    public HeaderLink createHeaderLink() {
        return new HeaderLink();
    }

    /**
     * Create an instance of {@link nl.textkernel.home.search.SearcherMetadata.ResultFieldLabels.Entry }
     * 
     */
    public nl.textkernel.home.search.SearcherMetadata.ResultFieldLabels.Entry createSearcherMetadataResultFieldLabelsEntry() {
        return new nl.textkernel.home.search.SearcherMetadata.ResultFieldLabels.Entry();
    }

    /**
     * Create an instance of {@link CompositeMetadata.LinkNameLabels.Entry }
     * 
     */
    public CompositeMetadata.LinkNameLabels.Entry createCompositeMetadataLinkNameLabelsEntry() {
        return new CompositeMetadata.LinkNameLabels.Entry();
    }

    /**
     * Create an instance of {@link CompositeMetadata.FieldNameLabels.Entry }
     * 
     */
    public CompositeMetadata.FieldNameLabels.Entry createCompositeMetadataFieldNameLabelsEntry() {
        return new CompositeMetadata.FieldNameLabels.Entry();
    }

    /**
     * Create an instance of {@link CompositeMetadata.SearcherMetadata.Entry }
     * 
     */
    public CompositeMetadata.SearcherMetadata.Entry createCompositeMetadataSearcherMetadataEntry() {
        return new CompositeMetadata.SearcherMetadata.Entry();
    }

    /**
     * Create an instance of {@link ItemCountMap.ItemCounts.Entry }
     * 
     */
    public ItemCountMap.ItemCounts.Entry createItemCountMapItemCountsEntry() {
        return new ItemCountMap.ItemCounts.Entry();
    }

    /**
     * Create an instance of {@link SearchResult.Synonyms.Entry }
     * 
     */
    public SearchResult.Synonyms.Entry createSearchResultSynonymsEntry() {
        return new SearchResult.Synonyms.Entry();
    }

    /**
     * Create an instance of {@link SearchResult.FacetCounts.Entry }
     * 
     */
    public SearchResult.FacetCounts.Entry createSearchResultFacetCountsEntry() {
        return new SearchResult.FacetCounts.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/search", name = "SearchBoxException")
    public JAXBElement<FaultBean> createSearchBoxException(FaultBean value) {
        return new JAXBElement<FaultBean>(_SearchBoxException_QNAME, FaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchWithToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/search", name = "searchWithToken")
    public JAXBElement<SearchWithToken> createSearchWithToken(SearchWithToken value) {
        return new JAXBElement<SearchWithToken>(_SearchWithToken_QNAME, SearchWithToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/search", name = "getMetadataResponse")
    public JAXBElement<GetMetadataResponse> createGetMetadataResponse(GetMetadataResponse value) {
        return new JAXBElement<GetMetadataResponse>(_GetMetadataResponse_QNAME, GetMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchWithState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/search", name = "searchWithState")
    public JAXBElement<SearchWithState> createSearchWithState(SearchWithState value) {
        return new JAXBElement<SearchWithState>(_SearchWithState_QNAME, SearchWithState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMetadataWithTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/search", name = "getMetadataWithTokenResponse")
    public JAXBElement<GetMetadataWithTokenResponse> createGetMetadataWithTokenResponse(GetMetadataWithTokenResponse value) {
        return new JAXBElement<GetMetadataWithTokenResponse>(_GetMetadataWithTokenResponse_QNAME, GetMetadataWithTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchWithTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/search", name = "searchWithTokenResponse")
    public JAXBElement<SearchWithTokenResponse> createSearchWithTokenResponse(SearchWithTokenResponse value) {
        return new JAXBElement<SearchWithTokenResponse>(_SearchWithTokenResponse_QNAME, SearchWithTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMetadataWithToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/search", name = "getMetadataWithToken")
    public JAXBElement<GetMetadataWithToken> createGetMetadataWithToken(GetMetadataWithToken value) {
        return new JAXBElement<GetMetadataWithToken>(_GetMetadataWithToken_QNAME, GetMetadataWithToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/search", name = "searchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchWithStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/search", name = "searchWithStateResponse")
    public JAXBElement<SearchWithStateResponse> createSearchWithStateResponse(SearchWithStateResponse value) {
        return new JAXBElement<SearchWithStateResponse>(_SearchWithStateResponse_QNAME, SearchWithStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/search", name = "getMetadata")
    public JAXBElement<GetMetadata> createGetMetadata(GetMetadata value) {
        return new JAXBElement<GetMetadata>(_GetMetadata_QNAME, GetMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Search }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://home.textkernel.nl/search", name = "search")
    public JAXBElement<Search> createSearch(Search value) {
        return new JAXBElement<Search>(_Search_QNAME, Search.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "externalTokens", scope = AccessOptions.class)
    public JAXBElement<StringMap> createAccessOptionsExternalTokens(StringMap value) {
        return new JAXBElement<StringMap>(_AccessOptionsExternalTokens_QNAME, StringMap.class, AccessOptions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CredentialsMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "searcherAccess", scope = AccessOptions.class)
    public JAXBElement<CredentialsMap> createAccessOptionsSearcherAccess(CredentialsMap value) {
        return new JAXBElement<CredentialsMap>(_AccessOptionsSearcherAccess_QNAME, CredentialsMap.class, AccessOptions.class, value);
    }

}
