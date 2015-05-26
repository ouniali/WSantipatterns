
package nl.lumc.conceptprofilemining.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.lumc.conceptprofilemining.services package. 
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

    private final static QName _FindSupportingDocuments_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "findSupportingDocuments");
    private final static QName _MapDatabaseIDListToConceptIDs_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "mapDatabaseIDListToConceptIDs");
    private final static QName _MapConceptIdToDatabasesResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "mapConceptIdToDatabasesResponse");
    private final static QName _MapDatabaseIDToConceptIDs_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "mapDatabaseIDToConceptIDs");
    private final static QName _FindDocumentsResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "findDocumentsResponse");
    private final static QName _ExplainScoresStringInput_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "explainScoresStringInput");
    private final static QName _GetSimilarConceptProfilesPredefined_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "getSimilarConceptProfilesPredefined");
    private final static QName _GetConceptSuggestionsFromTermResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "getConceptSuggestionsFromTermResponse");
    private final static QName _MapDatabaseIDToConceptIDsResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "mapDatabaseIDToConceptIDsResponse");
    private final static QName _GetConceptProfile_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "getConceptProfile");
    private final static QName _GetConceptSuggestionsFromTerm_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "getConceptSuggestionsFromTerm");
    private final static QName _GetConceptProfileResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "getConceptProfileResponse");
    private final static QName _FindCoOccurringDocumentsResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "findCoOccurringDocumentsResponse");
    private final static QName _Concept_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "Concept");
    private final static QName _ListPredefinedConceptSetsResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "listPredefinedConceptSetsResponse");
    private final static QName _GetSimilarConceptProfiles_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "getSimilarConceptProfiles");
    private final static QName _FindCoOccurringDocuments_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "findCoOccurringDocuments");
    private final static QName _FilterAgainstPredefinedConceptSet_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "filterAgainstPredefinedConceptSet");
    private final static QName _FilterConceptsWithProfileResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "filterConceptsWithProfileResponse");
    private final static QName _DatabaseIDs_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "DatabaseIDs");
    private final static QName _ExplainScoresStringInputResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "explainScoresStringInputResponse");
    private final static QName _FilterConceptsWithProfile_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "filterConceptsWithProfile");
    private final static QName _MapDatabaseIDListToConceptIDsResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "mapDatabaseIDListToConceptIDsResponse");
    private final static QName _ConceptSetInfo_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "ConceptSetInfo");
    private final static QName _ConceptSet_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "ConceptSet");
    private final static QName _MatchingResult_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "MatchingResult");
    private final static QName _SupportingDocument_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "SupportingDocument");
    private final static QName _PredefinedConceptSets_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "PredefinedConceptSets");
    private final static QName _GetPredefinedConceptSetResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "getPredefinedConceptSetResponse");
    private final static QName _ConceptTable_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "ConceptTable");
    private final static QName _ConceptProfile_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "ConceptProfile");
    private final static QName _SupportingDocumentsWrapper_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "SupportingDocumentsWrapper");
    private final static QName _FindSupportingDocumentsResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "findSupportingDocumentsResponse");
    private final static QName _ListPredefinedConceptSets_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "listPredefinedConceptSets");
    private final static QName _FilterAgainstPredefinedConceptSetResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "filterAgainstPredefinedConceptSetResponse");
    private final static QName _MapConceptIdToDatabases_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "mapConceptIdToDatabases");
    private final static QName _GetPredefinedConceptSet_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "getPredefinedConceptSet");
    private final static QName _GetSimilarConceptProfilesPredefinedResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "getSimilarConceptProfilesPredefinedResponse");
    private final static QName _DatabaseID_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "DatabaseID");
    private final static QName _ConceptContribution_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "conceptContribution");
    private final static QName _FindDocuments_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "findDocuments");
    private final static QName _GetSimilarConceptProfilesResponse_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "getSimilarConceptProfilesResponse");
    private final static QName _ConceptContributions_QNAME = new QName("http://services.conceptprofilemining.lumc.nl/", "ConceptContributions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.lumc.conceptprofilemining.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatabaseIDConceptSetWrapper }
     * 
     */
    public DatabaseIDConceptSetWrapper createDatabaseIDConceptSetWrapper() {
        return new DatabaseIDConceptSetWrapper();
    }

    /**
     * Create an instance of {@link DatabaseIDsWrapper }
     * 
     */
    public DatabaseIDsWrapper createDatabaseIDsWrapper() {
        return new DatabaseIDsWrapper();
    }

    /**
     * Create an instance of {@link SupportingDocumentsWrapper }
     * 
     */
    public SupportingDocumentsWrapper createSupportingDocumentsWrapper() {
        return new SupportingDocumentsWrapper();
    }

    /**
     * Create an instance of {@link ConceptTable }
     * 
     */
    public ConceptTable createConceptTable() {
        return new ConceptTable();
    }

    /**
     * Create an instance of {@link ConceptProfileWrapper }
     * 
     */
    public ConceptProfileWrapper createConceptProfileWrapper() {
        return new ConceptProfileWrapper();
    }

    /**
     * Create an instance of {@link PredefinedConceptSetsWrapper }
     * 
     */
    public PredefinedConceptSetsWrapper createPredefinedConceptSetsWrapper() {
        return new PredefinedConceptSetsWrapper();
    }

    /**
     * Create an instance of {@link MatchingResult }
     * 
     */
    public MatchingResult createMatchingResult() {
        return new MatchingResult();
    }

    /**
     * Create an instance of {@link ConceptContributionsWrapper }
     * 
     */
    public ConceptContributionsWrapper createConceptContributionsWrapper() {
        return new ConceptContributionsWrapper();
    }

    /**
     * Create an instance of {@link GetPredefinedConceptSet }
     * 
     */
    public GetPredefinedConceptSet createGetPredefinedConceptSet() {
        return new GetPredefinedConceptSet();
    }

    /**
     * Create an instance of {@link GetSimilarConceptProfilesPredefinedResponse }
     * 
     */
    public GetSimilarConceptProfilesPredefinedResponse createGetSimilarConceptProfilesPredefinedResponse() {
        return new GetSimilarConceptProfilesPredefinedResponse();
    }

    /**
     * Create an instance of {@link DatabaseIDWrapper }
     * 
     */
    public DatabaseIDWrapper createDatabaseIDWrapper() {
        return new DatabaseIDWrapper();
    }

    /**
     * Create an instance of {@link ConceptContribution }
     * 
     */
    public ConceptContribution createConceptContribution() {
        return new ConceptContribution();
    }

    /**
     * Create an instance of {@link FindDocuments }
     * 
     */
    public FindDocuments createFindDocuments() {
        return new FindDocuments();
    }

    /**
     * Create an instance of {@link GetSimilarConceptProfilesResponse }
     * 
     */
    public GetSimilarConceptProfilesResponse createGetSimilarConceptProfilesResponse() {
        return new GetSimilarConceptProfilesResponse();
    }

    /**
     * Create an instance of {@link ConceptSetInfo }
     * 
     */
    public ConceptSetInfo createConceptSetInfo() {
        return new ConceptSetInfo();
    }

    /**
     * Create an instance of {@link ExplainScoresStringInputResponse }
     * 
     */
    public ExplainScoresStringInputResponse createExplainScoresStringInputResponse() {
        return new ExplainScoresStringInputResponse();
    }

    /**
     * Create an instance of {@link FilterConceptsWithProfile }
     * 
     */
    public FilterConceptsWithProfile createFilterConceptsWithProfile() {
        return new FilterConceptsWithProfile();
    }

    /**
     * Create an instance of {@link MapDatabaseIDListToConceptIDsResponse }
     * 
     */
    public MapDatabaseIDListToConceptIDsResponse createMapDatabaseIDListToConceptIDsResponse() {
        return new MapDatabaseIDListToConceptIDsResponse();
    }

    /**
     * Create an instance of {@link ConceptSetWrapper }
     * 
     */
    public ConceptSetWrapper createConceptSetWrapper() {
        return new ConceptSetWrapper();
    }

    /**
     * Create an instance of {@link SupportingDocument }
     * 
     */
    public SupportingDocument createSupportingDocument() {
        return new SupportingDocument();
    }

    /**
     * Create an instance of {@link GetPredefinedConceptSetResponse }
     * 
     */
    public GetPredefinedConceptSetResponse createGetPredefinedConceptSetResponse() {
        return new GetPredefinedConceptSetResponse();
    }

    /**
     * Create an instance of {@link FilterAgainstPredefinedConceptSetResponse }
     * 
     */
    public FilterAgainstPredefinedConceptSetResponse createFilterAgainstPredefinedConceptSetResponse() {
        return new FilterAgainstPredefinedConceptSetResponse();
    }

    /**
     * Create an instance of {@link MapConceptIdToDatabases }
     * 
     */
    public MapConceptIdToDatabases createMapConceptIdToDatabases() {
        return new MapConceptIdToDatabases();
    }

    /**
     * Create an instance of {@link FindSupportingDocumentsResponse }
     * 
     */
    public FindSupportingDocumentsResponse createFindSupportingDocumentsResponse() {
        return new FindSupportingDocumentsResponse();
    }

    /**
     * Create an instance of {@link ListPredefinedConceptSets }
     * 
     */
    public ListPredefinedConceptSets createListPredefinedConceptSets() {
        return new ListPredefinedConceptSets();
    }

    /**
     * Create an instance of {@link ConceptWrapper }
     * 
     */
    public ConceptWrapper createConceptWrapper() {
        return new ConceptWrapper();
    }

    /**
     * Create an instance of {@link ListPredefinedConceptSetsResponse }
     * 
     */
    public ListPredefinedConceptSetsResponse createListPredefinedConceptSetsResponse() {
        return new ListPredefinedConceptSetsResponse();
    }

    /**
     * Create an instance of {@link GetSimilarConceptProfiles }
     * 
     */
    public GetSimilarConceptProfiles createGetSimilarConceptProfiles() {
        return new GetSimilarConceptProfiles();
    }

    /**
     * Create an instance of {@link FilterAgainstPredefinedConceptSet }
     * 
     */
    public FilterAgainstPredefinedConceptSet createFilterAgainstPredefinedConceptSet() {
        return new FilterAgainstPredefinedConceptSet();
    }

    /**
     * Create an instance of {@link FindCoOccurringDocuments }
     * 
     */
    public FindCoOccurringDocuments createFindCoOccurringDocuments() {
        return new FindCoOccurringDocuments();
    }

    /**
     * Create an instance of {@link FilterConceptsWithProfileResponse }
     * 
     */
    public FilterConceptsWithProfileResponse createFilterConceptsWithProfileResponse() {
        return new FilterConceptsWithProfileResponse();
    }

    /**
     * Create an instance of {@link MapConceptIdToDatabasesResponse }
     * 
     */
    public MapConceptIdToDatabasesResponse createMapConceptIdToDatabasesResponse() {
        return new MapConceptIdToDatabasesResponse();
    }

    /**
     * Create an instance of {@link FindSupportingDocuments }
     * 
     */
    public FindSupportingDocuments createFindSupportingDocuments() {
        return new FindSupportingDocuments();
    }

    /**
     * Create an instance of {@link MapDatabaseIDListToConceptIDs }
     * 
     */
    public MapDatabaseIDListToConceptIDs createMapDatabaseIDListToConceptIDs() {
        return new MapDatabaseIDListToConceptIDs();
    }

    /**
     * Create an instance of {@link MapDatabaseIDToConceptIDs }
     * 
     */
    public MapDatabaseIDToConceptIDs createMapDatabaseIDToConceptIDs() {
        return new MapDatabaseIDToConceptIDs();
    }

    /**
     * Create an instance of {@link FindDocumentsResponse }
     * 
     */
    public FindDocumentsResponse createFindDocumentsResponse() {
        return new FindDocumentsResponse();
    }

    /**
     * Create an instance of {@link ExplainScoresStringInput }
     * 
     */
    public ExplainScoresStringInput createExplainScoresStringInput() {
        return new ExplainScoresStringInput();
    }

    /**
     * Create an instance of {@link GetConceptSuggestionsFromTermResponse }
     * 
     */
    public GetConceptSuggestionsFromTermResponse createGetConceptSuggestionsFromTermResponse() {
        return new GetConceptSuggestionsFromTermResponse();
    }

    /**
     * Create an instance of {@link MapDatabaseIDToConceptIDsResponse }
     * 
     */
    public MapDatabaseIDToConceptIDsResponse createMapDatabaseIDToConceptIDsResponse() {
        return new MapDatabaseIDToConceptIDsResponse();
    }

    /**
     * Create an instance of {@link GetSimilarConceptProfilesPredefined }
     * 
     */
    public GetSimilarConceptProfilesPredefined createGetSimilarConceptProfilesPredefined() {
        return new GetSimilarConceptProfilesPredefined();
    }

    /**
     * Create an instance of {@link GetConceptProfile }
     * 
     */
    public GetConceptProfile createGetConceptProfile() {
        return new GetConceptProfile();
    }

    /**
     * Create an instance of {@link GetConceptSuggestionsFromTerm }
     * 
     */
    public GetConceptSuggestionsFromTerm createGetConceptSuggestionsFromTerm() {
        return new GetConceptSuggestionsFromTerm();
    }

    /**
     * Create an instance of {@link GetConceptProfileResponse }
     * 
     */
    public GetConceptProfileResponse createGetConceptProfileResponse() {
        return new GetConceptProfileResponse();
    }

    /**
     * Create an instance of {@link FindCoOccurringDocumentsResponse }
     * 
     */
    public FindCoOccurringDocumentsResponse createFindCoOccurringDocumentsResponse() {
        return new FindCoOccurringDocumentsResponse();
    }

    /**
     * Create an instance of {@link DatabaseIDConceptSetTuple }
     * 
     */
    public DatabaseIDConceptSetTuple createDatabaseIDConceptSetTuple() {
        return new DatabaseIDConceptSetTuple();
    }

    /**
     * Create an instance of {@link StringDoubleTuple }
     * 
     */
    public StringDoubleTuple createStringDoubleTuple() {
        return new StringDoubleTuple();
    }

    /**
     * Create an instance of {@link ScoreListImpl }
     * 
     */
    public ScoreListImpl createScoreListImpl() {
        return new ScoreListImpl();
    }

    /**
     * Create an instance of {@link SimilarityScoreLists }
     * 
     */
    public SimilarityScoreLists createSimilarityScoreLists() {
        return new SimilarityScoreLists();
    }

    /**
     * Create an instance of {@link DatabaseIDConceptSetWrapper.DatabaseIDConceptSetList }
     * 
     */
    public DatabaseIDConceptSetWrapper.DatabaseIDConceptSetList createDatabaseIDConceptSetWrapperDatabaseIDConceptSetList() {
        return new DatabaseIDConceptSetWrapper.DatabaseIDConceptSetList();
    }

    /**
     * Create an instance of {@link DatabaseIDsWrapper.DatabaseIdList }
     * 
     */
    public DatabaseIDsWrapper.DatabaseIdList createDatabaseIDsWrapperDatabaseIdList() {
        return new DatabaseIDsWrapper.DatabaseIdList();
    }

    /**
     * Create an instance of {@link SupportingDocumentsWrapper.SupportingDocumentsList }
     * 
     */
    public SupportingDocumentsWrapper.SupportingDocumentsList createSupportingDocumentsWrapperSupportingDocumentsList() {
        return new SupportingDocumentsWrapper.SupportingDocumentsList();
    }

    /**
     * Create an instance of {@link ConceptTable.ConceptRows }
     * 
     */
    public ConceptTable.ConceptRows createConceptTableConceptRows() {
        return new ConceptTable.ConceptRows();
    }

    /**
     * Create an instance of {@link ConceptProfileWrapper.ConceptVector }
     * 
     */
    public ConceptProfileWrapper.ConceptVector createConceptProfileWrapperConceptVector() {
        return new ConceptProfileWrapper.ConceptVector();
    }

    /**
     * Create an instance of {@link PredefinedConceptSetsWrapper.ConceptSetInfoList }
     * 
     */
    public PredefinedConceptSetsWrapper.ConceptSetInfoList createPredefinedConceptSetsWrapperConceptSetInfoList() {
        return new PredefinedConceptSetsWrapper.ConceptSetInfoList();
    }

    /**
     * Create an instance of {@link MatchingResult.MatchConceptProfileList }
     * 
     */
    public MatchingResult.MatchConceptProfileList createMatchingResultMatchConceptProfileList() {
        return new MatchingResult.MatchConceptProfileList();
    }

    /**
     * Create an instance of {@link MatchingResult.SummedSimilarityScoreList }
     * 
     */
    public MatchingResult.SummedSimilarityScoreList createMatchingResultSummedSimilarityScoreList() {
        return new MatchingResult.SummedSimilarityScoreList();
    }

    /**
     * Create an instance of {@link ConceptContributionsWrapper.ConceptContributionTable }
     * 
     */
    public ConceptContributionsWrapper.ConceptContributionTable createConceptContributionsWrapperConceptContributionTable() {
        return new ConceptContributionsWrapper.ConceptContributionTable();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSupportingDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "findSupportingDocuments")
    public JAXBElement<FindSupportingDocuments> createFindSupportingDocuments(FindSupportingDocuments value) {
        return new JAXBElement<FindSupportingDocuments>(_FindSupportingDocuments_QNAME, FindSupportingDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapDatabaseIDListToConceptIDs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "mapDatabaseIDListToConceptIDs")
    public JAXBElement<MapDatabaseIDListToConceptIDs> createMapDatabaseIDListToConceptIDs(MapDatabaseIDListToConceptIDs value) {
        return new JAXBElement<MapDatabaseIDListToConceptIDs>(_MapDatabaseIDListToConceptIDs_QNAME, MapDatabaseIDListToConceptIDs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapConceptIdToDatabasesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "mapConceptIdToDatabasesResponse")
    public JAXBElement<MapConceptIdToDatabasesResponse> createMapConceptIdToDatabasesResponse(MapConceptIdToDatabasesResponse value) {
        return new JAXBElement<MapConceptIdToDatabasesResponse>(_MapConceptIdToDatabasesResponse_QNAME, MapConceptIdToDatabasesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapDatabaseIDToConceptIDs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "mapDatabaseIDToConceptIDs")
    public JAXBElement<MapDatabaseIDToConceptIDs> createMapDatabaseIDToConceptIDs(MapDatabaseIDToConceptIDs value) {
        return new JAXBElement<MapDatabaseIDToConceptIDs>(_MapDatabaseIDToConceptIDs_QNAME, MapDatabaseIDToConceptIDs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "findDocumentsResponse")
    public JAXBElement<FindDocumentsResponse> createFindDocumentsResponse(FindDocumentsResponse value) {
        return new JAXBElement<FindDocumentsResponse>(_FindDocumentsResponse_QNAME, FindDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExplainScoresStringInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "explainScoresStringInput")
    public JAXBElement<ExplainScoresStringInput> createExplainScoresStringInput(ExplainScoresStringInput value) {
        return new JAXBElement<ExplainScoresStringInput>(_ExplainScoresStringInput_QNAME, ExplainScoresStringInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimilarConceptProfilesPredefined }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "getSimilarConceptProfilesPredefined")
    public JAXBElement<GetSimilarConceptProfilesPredefined> createGetSimilarConceptProfilesPredefined(GetSimilarConceptProfilesPredefined value) {
        return new JAXBElement<GetSimilarConceptProfilesPredefined>(_GetSimilarConceptProfilesPredefined_QNAME, GetSimilarConceptProfilesPredefined.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConceptSuggestionsFromTermResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "getConceptSuggestionsFromTermResponse")
    public JAXBElement<GetConceptSuggestionsFromTermResponse> createGetConceptSuggestionsFromTermResponse(GetConceptSuggestionsFromTermResponse value) {
        return new JAXBElement<GetConceptSuggestionsFromTermResponse>(_GetConceptSuggestionsFromTermResponse_QNAME, GetConceptSuggestionsFromTermResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapDatabaseIDToConceptIDsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "mapDatabaseIDToConceptIDsResponse")
    public JAXBElement<MapDatabaseIDToConceptIDsResponse> createMapDatabaseIDToConceptIDsResponse(MapDatabaseIDToConceptIDsResponse value) {
        return new JAXBElement<MapDatabaseIDToConceptIDsResponse>(_MapDatabaseIDToConceptIDsResponse_QNAME, MapDatabaseIDToConceptIDsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConceptProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "getConceptProfile")
    public JAXBElement<GetConceptProfile> createGetConceptProfile(GetConceptProfile value) {
        return new JAXBElement<GetConceptProfile>(_GetConceptProfile_QNAME, GetConceptProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConceptSuggestionsFromTerm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "getConceptSuggestionsFromTerm")
    public JAXBElement<GetConceptSuggestionsFromTerm> createGetConceptSuggestionsFromTerm(GetConceptSuggestionsFromTerm value) {
        return new JAXBElement<GetConceptSuggestionsFromTerm>(_GetConceptSuggestionsFromTerm_QNAME, GetConceptSuggestionsFromTerm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConceptProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "getConceptProfileResponse")
    public JAXBElement<GetConceptProfileResponse> createGetConceptProfileResponse(GetConceptProfileResponse value) {
        return new JAXBElement<GetConceptProfileResponse>(_GetConceptProfileResponse_QNAME, GetConceptProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCoOccurringDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "findCoOccurringDocumentsResponse")
    public JAXBElement<FindCoOccurringDocumentsResponse> createFindCoOccurringDocumentsResponse(FindCoOccurringDocumentsResponse value) {
        return new JAXBElement<FindCoOccurringDocumentsResponse>(_FindCoOccurringDocumentsResponse_QNAME, FindCoOccurringDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "Concept")
    public JAXBElement<ConceptWrapper> createConcept(ConceptWrapper value) {
        return new JAXBElement<ConceptWrapper>(_Concept_QNAME, ConceptWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPredefinedConceptSetsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "listPredefinedConceptSetsResponse")
    public JAXBElement<ListPredefinedConceptSetsResponse> createListPredefinedConceptSetsResponse(ListPredefinedConceptSetsResponse value) {
        return new JAXBElement<ListPredefinedConceptSetsResponse>(_ListPredefinedConceptSetsResponse_QNAME, ListPredefinedConceptSetsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimilarConceptProfiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "getSimilarConceptProfiles")
    public JAXBElement<GetSimilarConceptProfiles> createGetSimilarConceptProfiles(GetSimilarConceptProfiles value) {
        return new JAXBElement<GetSimilarConceptProfiles>(_GetSimilarConceptProfiles_QNAME, GetSimilarConceptProfiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCoOccurringDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "findCoOccurringDocuments")
    public JAXBElement<FindCoOccurringDocuments> createFindCoOccurringDocuments(FindCoOccurringDocuments value) {
        return new JAXBElement<FindCoOccurringDocuments>(_FindCoOccurringDocuments_QNAME, FindCoOccurringDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterAgainstPredefinedConceptSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "filterAgainstPredefinedConceptSet")
    public JAXBElement<FilterAgainstPredefinedConceptSet> createFilterAgainstPredefinedConceptSet(FilterAgainstPredefinedConceptSet value) {
        return new JAXBElement<FilterAgainstPredefinedConceptSet>(_FilterAgainstPredefinedConceptSet_QNAME, FilterAgainstPredefinedConceptSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterConceptsWithProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "filterConceptsWithProfileResponse")
    public JAXBElement<FilterConceptsWithProfileResponse> createFilterConceptsWithProfileResponse(FilterConceptsWithProfileResponse value) {
        return new JAXBElement<FilterConceptsWithProfileResponse>(_FilterConceptsWithProfileResponse_QNAME, FilterConceptsWithProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseIDsWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "DatabaseIDs")
    public JAXBElement<DatabaseIDsWrapper> createDatabaseIDs(DatabaseIDsWrapper value) {
        return new JAXBElement<DatabaseIDsWrapper>(_DatabaseIDs_QNAME, DatabaseIDsWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExplainScoresStringInputResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "explainScoresStringInputResponse")
    public JAXBElement<ExplainScoresStringInputResponse> createExplainScoresStringInputResponse(ExplainScoresStringInputResponse value) {
        return new JAXBElement<ExplainScoresStringInputResponse>(_ExplainScoresStringInputResponse_QNAME, ExplainScoresStringInputResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterConceptsWithProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "filterConceptsWithProfile")
    public JAXBElement<FilterConceptsWithProfile> createFilterConceptsWithProfile(FilterConceptsWithProfile value) {
        return new JAXBElement<FilterConceptsWithProfile>(_FilterConceptsWithProfile_QNAME, FilterConceptsWithProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapDatabaseIDListToConceptIDsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "mapDatabaseIDListToConceptIDsResponse")
    public JAXBElement<MapDatabaseIDListToConceptIDsResponse> createMapDatabaseIDListToConceptIDsResponse(MapDatabaseIDListToConceptIDsResponse value) {
        return new JAXBElement<MapDatabaseIDListToConceptIDsResponse>(_MapDatabaseIDListToConceptIDsResponse_QNAME, MapDatabaseIDListToConceptIDsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptSetInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "ConceptSetInfo")
    public JAXBElement<ConceptSetInfo> createConceptSetInfo(ConceptSetInfo value) {
        return new JAXBElement<ConceptSetInfo>(_ConceptSetInfo_QNAME, ConceptSetInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptSetWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "ConceptSet")
    public JAXBElement<ConceptSetWrapper> createConceptSet(ConceptSetWrapper value) {
        return new JAXBElement<ConceptSetWrapper>(_ConceptSet_QNAME, ConceptSetWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "MatchingResult")
    public JAXBElement<MatchingResult> createMatchingResult(MatchingResult value) {
        return new JAXBElement<MatchingResult>(_MatchingResult_QNAME, MatchingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupportingDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "SupportingDocument")
    public JAXBElement<SupportingDocument> createSupportingDocument(SupportingDocument value) {
        return new JAXBElement<SupportingDocument>(_SupportingDocument_QNAME, SupportingDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredefinedConceptSetsWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "PredefinedConceptSets")
    public JAXBElement<PredefinedConceptSetsWrapper> createPredefinedConceptSets(PredefinedConceptSetsWrapper value) {
        return new JAXBElement<PredefinedConceptSetsWrapper>(_PredefinedConceptSets_QNAME, PredefinedConceptSetsWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPredefinedConceptSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "getPredefinedConceptSetResponse")
    public JAXBElement<GetPredefinedConceptSetResponse> createGetPredefinedConceptSetResponse(GetPredefinedConceptSetResponse value) {
        return new JAXBElement<GetPredefinedConceptSetResponse>(_GetPredefinedConceptSetResponse_QNAME, GetPredefinedConceptSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "ConceptTable")
    public JAXBElement<ConceptTable> createConceptTable(ConceptTable value) {
        return new JAXBElement<ConceptTable>(_ConceptTable_QNAME, ConceptTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptProfileWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "ConceptProfile")
    public JAXBElement<ConceptProfileWrapper> createConceptProfile(ConceptProfileWrapper value) {
        return new JAXBElement<ConceptProfileWrapper>(_ConceptProfile_QNAME, ConceptProfileWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupportingDocumentsWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "SupportingDocumentsWrapper")
    public JAXBElement<SupportingDocumentsWrapper> createSupportingDocumentsWrapper(SupportingDocumentsWrapper value) {
        return new JAXBElement<SupportingDocumentsWrapper>(_SupportingDocumentsWrapper_QNAME, SupportingDocumentsWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSupportingDocumentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "findSupportingDocumentsResponse")
    public JAXBElement<FindSupportingDocumentsResponse> createFindSupportingDocumentsResponse(FindSupportingDocumentsResponse value) {
        return new JAXBElement<FindSupportingDocumentsResponse>(_FindSupportingDocumentsResponse_QNAME, FindSupportingDocumentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPredefinedConceptSets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "listPredefinedConceptSets")
    public JAXBElement<ListPredefinedConceptSets> createListPredefinedConceptSets(ListPredefinedConceptSets value) {
        return new JAXBElement<ListPredefinedConceptSets>(_ListPredefinedConceptSets_QNAME, ListPredefinedConceptSets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterAgainstPredefinedConceptSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "filterAgainstPredefinedConceptSetResponse")
    public JAXBElement<FilterAgainstPredefinedConceptSetResponse> createFilterAgainstPredefinedConceptSetResponse(FilterAgainstPredefinedConceptSetResponse value) {
        return new JAXBElement<FilterAgainstPredefinedConceptSetResponse>(_FilterAgainstPredefinedConceptSetResponse_QNAME, FilterAgainstPredefinedConceptSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MapConceptIdToDatabases }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "mapConceptIdToDatabases")
    public JAXBElement<MapConceptIdToDatabases> createMapConceptIdToDatabases(MapConceptIdToDatabases value) {
        return new JAXBElement<MapConceptIdToDatabases>(_MapConceptIdToDatabases_QNAME, MapConceptIdToDatabases.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPredefinedConceptSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "getPredefinedConceptSet")
    public JAXBElement<GetPredefinedConceptSet> createGetPredefinedConceptSet(GetPredefinedConceptSet value) {
        return new JAXBElement<GetPredefinedConceptSet>(_GetPredefinedConceptSet_QNAME, GetPredefinedConceptSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimilarConceptProfilesPredefinedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "getSimilarConceptProfilesPredefinedResponse")
    public JAXBElement<GetSimilarConceptProfilesPredefinedResponse> createGetSimilarConceptProfilesPredefinedResponse(GetSimilarConceptProfilesPredefinedResponse value) {
        return new JAXBElement<GetSimilarConceptProfilesPredefinedResponse>(_GetSimilarConceptProfilesPredefinedResponse_QNAME, GetSimilarConceptProfilesPredefinedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseIDWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "DatabaseID")
    public JAXBElement<DatabaseIDWrapper> createDatabaseID(DatabaseIDWrapper value) {
        return new JAXBElement<DatabaseIDWrapper>(_DatabaseID_QNAME, DatabaseIDWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptContribution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "conceptContribution")
    public JAXBElement<ConceptContribution> createConceptContribution(ConceptContribution value) {
        return new JAXBElement<ConceptContribution>(_ConceptContribution_QNAME, ConceptContribution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDocuments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "findDocuments")
    public JAXBElement<FindDocuments> createFindDocuments(FindDocuments value) {
        return new JAXBElement<FindDocuments>(_FindDocuments_QNAME, FindDocuments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimilarConceptProfilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "getSimilarConceptProfilesResponse")
    public JAXBElement<GetSimilarConceptProfilesResponse> createGetSimilarConceptProfilesResponse(GetSimilarConceptProfilesResponse value) {
        return new JAXBElement<GetSimilarConceptProfilesResponse>(_GetSimilarConceptProfilesResponse_QNAME, GetSimilarConceptProfilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConceptContributionsWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.conceptprofilemining.lumc.nl/", name = "ConceptContributions")
    public JAXBElement<ConceptContributionsWrapper> createConceptContributions(ConceptContributionsWrapper value) {
        return new JAXBElement<ConceptContributionsWrapper>(_ConceptContributions_QNAME, ConceptContributionsWrapper.class, null, value);
    }

}
