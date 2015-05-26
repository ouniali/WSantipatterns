
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

    private final static QName _ArrayOfDistributionSet_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfDistributionSet");
    private final static QName _ArrayOfInstrumentTransformation_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfInstrumentTransformation");
    private final static QName _DistributionSet_QNAME = new QName("http://www.xignite.com/services/", "DistributionSet");
    private final static QName _ArrayOfDividendHistory_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfDividendHistory");
    private final static QName _ArrayOfIssuerAttributeChange_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfIssuerAttributeChange");
    private final static QName _PossibleValues_QNAME = new QName("http://www.xignite.com/services/", "PossibleValues");
    private final static QName _ArrayOfPaymentHistory_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfPaymentHistory");
    private final static QName _Header_QNAME = new QName("http://www.xignite.com/services/", "Header");
    private final static QName _ArrayOfIssuerTransformation_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfIssuerTransformation");
    private final static QName _ArrayOfInstrumentAttributeChange_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfInstrumentAttributeChange");
    private final static QName _ArrayOfSplitTotal_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfSplitTotal");
    private final static QName _ArrayOfCorporateAction_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfCorporateAction");
    private final static QName _ArrayOfSecurityAttributeChange_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfSecurityAttributeChange");
    private final static QName _ArrayOfSplitHistory_QNAME = new QName("http://www.xignite.com/services/", "ArrayOfSplitHistory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xignite.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSplitTotalsByExchangeResponse }
     * 
     */
    public GetSplitTotalsByExchangeResponse createGetSplitTotalsByExchangeResponse() {
        return new GetSplitTotalsByExchangeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSplitTotal }
     * 
     */
    public ArrayOfSplitTotal createArrayOfSplitTotal() {
        return new ArrayOfSplitTotal();
    }

    /**
     * Create an instance of {@link GetInstrumentAttributeChanges }
     * 
     */
    public GetInstrumentAttributeChanges createGetInstrumentAttributeChanges() {
        return new GetInstrumentAttributeChanges();
    }

    /**
     * Create an instance of {@link GetInstrumentTransformationsAll }
     * 
     */
    public GetInstrumentTransformationsAll createGetInstrumentTransformationsAll() {
        return new GetInstrumentTransformationsAll();
    }

    /**
     * Create an instance of {@link ArrayOfDistributionSet }
     * 
     */
    public ArrayOfDistributionSet createArrayOfDistributionSet() {
        return new ArrayOfDistributionSet();
    }

    /**
     * Create an instance of {@link ArrayOfInstrumentTransformation }
     * 
     */
    public ArrayOfInstrumentTransformation createArrayOfInstrumentTransformation() {
        return new ArrayOfInstrumentTransformation();
    }

    /**
     * Create an instance of {@link GetPaymentHistoriesByExchangeResponse }
     * 
     */
    public GetPaymentHistoriesByExchangeResponse createGetPaymentHistoriesByExchangeResponse() {
        return new GetPaymentHistoriesByExchangeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentHistory }
     * 
     */
    public ArrayOfPaymentHistory createArrayOfPaymentHistory() {
        return new ArrayOfPaymentHistory();
    }

    /**
     * Create an instance of {@link GetIssuerTransformationsAll }
     * 
     */
    public GetIssuerTransformationsAll createGetIssuerTransformationsAll() {
        return new GetIssuerTransformationsAll();
    }

    /**
     * Create an instance of {@link GetInstrumentAttributeChangesByExchangeResponse }
     * 
     */
    public GetInstrumentAttributeChangesByExchangeResponse createGetInstrumentAttributeChangesByExchangeResponse() {
        return new GetInstrumentAttributeChangesByExchangeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfInstrumentAttributeChange }
     * 
     */
    public ArrayOfInstrumentAttributeChange createArrayOfInstrumentAttributeChange() {
        return new ArrayOfInstrumentAttributeChange();
    }

    /**
     * Create an instance of {@link GetSplitTotalResponse }
     * 
     */
    public GetSplitTotalResponse createGetSplitTotalResponse() {
        return new GetSplitTotalResponse();
    }

    /**
     * Create an instance of {@link GetDistributionSetsResponse }
     * 
     */
    public GetDistributionSetsResponse createGetDistributionSetsResponse() {
        return new GetDistributionSetsResponse();
    }

    /**
     * Create an instance of {@link PossibleValues }
     * 
     */
    public PossibleValues createPossibleValues() {
        return new PossibleValues();
    }

    /**
     * Create an instance of {@link GetInstrumentTransformationsByExchangeResponse }
     * 
     */
    public GetInstrumentTransformationsByExchangeResponse createGetInstrumentTransformationsByExchangeResponse() {
        return new GetInstrumentTransformationsByExchangeResponse();
    }

    /**
     * Create an instance of {@link ListPaymentTypes }
     * 
     */
    public ListPaymentTypes createListPaymentTypes() {
        return new ListPaymentTypes();
    }

    /**
     * Create an instance of {@link GetCorporateActionsByExchangeResponse }
     * 
     */
    public GetCorporateActionsByExchangeResponse createGetCorporateActionsByExchangeResponse() {
        return new GetCorporateActionsByExchangeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCorporateAction }
     * 
     */
    public ArrayOfCorporateAction createArrayOfCorporateAction() {
        return new ArrayOfCorporateAction();
    }

    /**
     * Create an instance of {@link GetIssuerTransformations }
     * 
     */
    public GetIssuerTransformations createGetIssuerTransformations() {
        return new GetIssuerTransformations();
    }

    /**
     * Create an instance of {@link ListDividendClassificationsResponse }
     * 
     */
    public ListDividendClassificationsResponse createListDividendClassificationsResponse() {
        return new ListDividendClassificationsResponse();
    }

    /**
     * Create an instance of {@link GetInstrumentAttributeChangesAllResponse }
     * 
     */
    public GetInstrumentAttributeChangesAllResponse createGetInstrumentAttributeChangesAllResponse() {
        return new GetInstrumentAttributeChangesAllResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSplitHistory }
     * 
     */
    public ArrayOfSplitHistory createArrayOfSplitHistory() {
        return new ArrayOfSplitHistory();
    }

    /**
     * Create an instance of {@link GetCorporateActionsResponse }
     * 
     */
    public GetCorporateActionsResponse createGetCorporateActionsResponse() {
        return new GetCorporateActionsResponse();
    }

    /**
     * Create an instance of {@link GetCorporateActions }
     * 
     */
    public GetCorporateActions createGetCorporateActions() {
        return new GetCorporateActions();
    }

    /**
     * Create an instance of {@link GetSplitHistory }
     * 
     */
    public GetSplitHistory createGetSplitHistory() {
        return new GetSplitHistory();
    }

    /**
     * Create an instance of {@link GetInstrumentTransformationsAllResponse }
     * 
     */
    public GetInstrumentTransformationsAllResponse createGetInstrumentTransformationsAllResponse() {
        return new GetInstrumentTransformationsAllResponse();
    }

    /**
     * Create an instance of {@link GetSplitTotal }
     * 
     */
    public GetSplitTotal createGetSplitTotal() {
        return new GetSplitTotal();
    }

    /**
     * Create an instance of {@link ListExchangesResponse }
     * 
     */
    public ListExchangesResponse createListExchangesResponse() {
        return new ListExchangesResponse();
    }

    /**
     * Create an instance of {@link GetSecurityAttributeChangesByExchangeResponse }
     * 
     */
    public GetSecurityAttributeChangesByExchangeResponse createGetSecurityAttributeChangesByExchangeResponse() {
        return new GetSecurityAttributeChangesByExchangeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSecurityAttributeChange }
     * 
     */
    public ArrayOfSecurityAttributeChange createArrayOfSecurityAttributeChange() {
        return new ArrayOfSecurityAttributeChange();
    }

    /**
     * Create an instance of {@link GetDistributionSets }
     * 
     */
    public GetDistributionSets createGetDistributionSets() {
        return new GetDistributionSets();
    }

    /**
     * Create an instance of {@link GetCorporateActionsByExchange }
     * 
     */
    public GetCorporateActionsByExchange createGetCorporateActionsByExchange() {
        return new GetCorporateActionsByExchange();
    }

    /**
     * Create an instance of {@link GetDividendHistoriesByExchangeResponse }
     * 
     */
    public GetDividendHistoriesByExchangeResponse createGetDividendHistoriesByExchangeResponse() {
        return new GetDividendHistoriesByExchangeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDividendHistory }
     * 
     */
    public ArrayOfDividendHistory createArrayOfDividendHistory() {
        return new ArrayOfDividendHistory();
    }

    /**
     * Create an instance of {@link GetDividendHistoryResponse }
     * 
     */
    public GetDividendHistoryResponse createGetDividendHistoryResponse() {
        return new GetDividendHistoryResponse();
    }

    /**
     * Create an instance of {@link GetSplitHistoryResponse }
     * 
     */
    public GetSplitHistoryResponse createGetSplitHistoryResponse() {
        return new GetSplitHistoryResponse();
    }

    /**
     * Create an instance of {@link GetDistributionSet }
     * 
     */
    public GetDistributionSet createGetDistributionSet() {
        return new GetDistributionSet();
    }

    /**
     * Create an instance of {@link GetSecurityAttributeChangesAllResponse }
     * 
     */
    public GetSecurityAttributeChangesAllResponse createGetSecurityAttributeChangesAllResponse() {
        return new GetSecurityAttributeChangesAllResponse();
    }

    /**
     * Create an instance of {@link ListCurrencies }
     * 
     */
    public ListCurrencies createListCurrencies() {
        return new ListCurrencies();
    }

    /**
     * Create an instance of {@link GetSplitHistoriesByExchangeResponse }
     * 
     */
    public GetSplitHistoriesByExchangeResponse createGetSplitHistoriesByExchangeResponse() {
        return new GetSplitHistoriesByExchangeResponse();
    }

    /**
     * Create an instance of {@link ListInstrumentClasses }
     * 
     */
    public ListInstrumentClasses createListInstrumentClasses() {
        return new ListInstrumentClasses();
    }

    /**
     * Create an instance of {@link GetInstrumentAttributeChangesAll }
     * 
     */
    public GetInstrumentAttributeChangesAll createGetInstrumentAttributeChangesAll() {
        return new GetInstrumentAttributeChangesAll();
    }

    /**
     * Create an instance of {@link ListEventTypesResponse }
     * 
     */
    public ListEventTypesResponse createListEventTypesResponse() {
        return new ListEventTypesResponse();
    }

    /**
     * Create an instance of {@link GetIssuerTransformationsByExchange }
     * 
     */
    public GetIssuerTransformationsByExchange createGetIssuerTransformationsByExchange() {
        return new GetIssuerTransformationsByExchange();
    }

    /**
     * Create an instance of {@link ListDividendTypes }
     * 
     */
    public ListDividendTypes createListDividendTypes() {
        return new ListDividendTypes();
    }

    /**
     * Create an instance of {@link GetIssuerTransformationsResponse }
     * 
     */
    public GetIssuerTransformationsResponse createGetIssuerTransformationsResponse() {
        return new GetIssuerTransformationsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIssuerTransformation }
     * 
     */
    public ArrayOfIssuerTransformation createArrayOfIssuerTransformation() {
        return new ArrayOfIssuerTransformation();
    }

    /**
     * Create an instance of {@link GetIssuerAttributeChangesByExchangeResponse }
     * 
     */
    public GetIssuerAttributeChangesByExchangeResponse createGetIssuerAttributeChangesByExchangeResponse() {
        return new GetIssuerAttributeChangesByExchangeResponse();
    }

    /**
     * Create an instance of {@link ArrayOfIssuerAttributeChange }
     * 
     */
    public ArrayOfIssuerAttributeChange createArrayOfIssuerAttributeChange() {
        return new ArrayOfIssuerAttributeChange();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link ListEventTypes }
     * 
     */
    public ListEventTypes createListEventTypes() {
        return new ListEventTypes();
    }

    /**
     * Create an instance of {@link GetDistributionSetResponse }
     * 
     */
    public GetDistributionSetResponse createGetDistributionSetResponse() {
        return new GetDistributionSetResponse();
    }

    /**
     * Create an instance of {@link DistributionSet }
     * 
     */
    public DistributionSet createDistributionSet() {
        return new DistributionSet();
    }

    /**
     * Create an instance of {@link GetDividendHistory }
     * 
     */
    public GetDividendHistory createGetDividendHistory() {
        return new GetDividendHistory();
    }

    /**
     * Create an instance of {@link GetInstrumentAttributeChangesResponse }
     * 
     */
    public GetInstrumentAttributeChangesResponse createGetInstrumentAttributeChangesResponse() {
        return new GetInstrumentAttributeChangesResponse();
    }

    /**
     * Create an instance of {@link GetSecurityAttributeChanges }
     * 
     */
    public GetSecurityAttributeChanges createGetSecurityAttributeChanges() {
        return new GetSecurityAttributeChanges();
    }

    /**
     * Create an instance of {@link ListIndustries }
     * 
     */
    public ListIndustries createListIndustries() {
        return new ListIndustries();
    }

    /**
     * Create an instance of {@link GetIssuerAttributeChangesByExchange }
     * 
     */
    public GetIssuerAttributeChangesByExchange createGetIssuerAttributeChangesByExchange() {
        return new GetIssuerAttributeChangesByExchange();
    }

    /**
     * Create an instance of {@link GetIssuerAttributeChangesAllResponse }
     * 
     */
    public GetIssuerAttributeChangesAllResponse createGetIssuerAttributeChangesAllResponse() {
        return new GetIssuerAttributeChangesAllResponse();
    }

    /**
     * Create an instance of {@link ListDividendPaymentFrequencies }
     * 
     */
    public ListDividendPaymentFrequencies createListDividendPaymentFrequencies() {
        return new ListDividendPaymentFrequencies();
    }

    /**
     * Create an instance of {@link ListExchanges }
     * 
     */
    public ListExchanges createListExchanges() {
        return new ListExchanges();
    }

    /**
     * Create an instance of {@link GetIssuerTransformationsByExchangeResponse }
     * 
     */
    public GetIssuerTransformationsByExchangeResponse createGetIssuerTransformationsByExchangeResponse() {
        return new GetIssuerTransformationsByExchangeResponse();
    }

    /**
     * Create an instance of {@link GetSecurityAttributeChangesAll }
     * 
     */
    public GetSecurityAttributeChangesAll createGetSecurityAttributeChangesAll() {
        return new GetSecurityAttributeChangesAll();
    }

    /**
     * Create an instance of {@link GetDividendHistoriesByExchange }
     * 
     */
    public GetDividendHistoriesByExchange createGetDividendHistoriesByExchange() {
        return new GetDividendHistoriesByExchange();
    }

    /**
     * Create an instance of {@link GetPaymentHistoriesByExchange }
     * 
     */
    public GetPaymentHistoriesByExchange createGetPaymentHistoriesByExchange() {
        return new GetPaymentHistoriesByExchange();
    }

    /**
     * Create an instance of {@link GetPaymentHistory }
     * 
     */
    public GetPaymentHistory createGetPaymentHistory() {
        return new GetPaymentHistory();
    }

    /**
     * Create an instance of {@link ListCurrenciesResponse }
     * 
     */
    public ListCurrenciesResponse createListCurrenciesResponse() {
        return new ListCurrenciesResponse();
    }

    /**
     * Create an instance of {@link GetInstrumentTransformationsResponse }
     * 
     */
    public GetInstrumentTransformationsResponse createGetInstrumentTransformationsResponse() {
        return new GetInstrumentTransformationsResponse();
    }

    /**
     * Create an instance of {@link GetIssuerAttributeChanges }
     * 
     */
    public GetIssuerAttributeChanges createGetIssuerAttributeChanges() {
        return new GetIssuerAttributeChanges();
    }

    /**
     * Create an instance of {@link GetInstrumentTransformationsByExchange }
     * 
     */
    public GetInstrumentTransformationsByExchange createGetInstrumentTransformationsByExchange() {
        return new GetInstrumentTransformationsByExchange();
    }

    /**
     * Create an instance of {@link GetIssuerAttributeChangesResponse }
     * 
     */
    public GetIssuerAttributeChangesResponse createGetIssuerAttributeChangesResponse() {
        return new GetIssuerAttributeChangesResponse();
    }

    /**
     * Create an instance of {@link ListDividendTypesResponse }
     * 
     */
    public ListDividendTypesResponse createListDividendTypesResponse() {
        return new ListDividendTypesResponse();
    }

    /**
     * Create an instance of {@link ListIndustriesResponse }
     * 
     */
    public ListIndustriesResponse createListIndustriesResponse() {
        return new ListIndustriesResponse();
    }

    /**
     * Create an instance of {@link GetInstrumentTransformations }
     * 
     */
    public GetInstrumentTransformations createGetInstrumentTransformations() {
        return new GetInstrumentTransformations();
    }

    /**
     * Create an instance of {@link GetIssuerAttributeChangesAll }
     * 
     */
    public GetIssuerAttributeChangesAll createGetIssuerAttributeChangesAll() {
        return new GetIssuerAttributeChangesAll();
    }

    /**
     * Create an instance of {@link GetPaymentHistoryResponse }
     * 
     */
    public GetPaymentHistoryResponse createGetPaymentHistoryResponse() {
        return new GetPaymentHistoryResponse();
    }

    /**
     * Create an instance of {@link ListSectors }
     * 
     */
    public ListSectors createListSectors() {
        return new ListSectors();
    }

    /**
     * Create an instance of {@link ListSectorsResponse }
     * 
     */
    public ListSectorsResponse createListSectorsResponse() {
        return new ListSectorsResponse();
    }

    /**
     * Create an instance of {@link GetSplitHistoriesByExchange }
     * 
     */
    public GetSplitHistoriesByExchange createGetSplitHistoriesByExchange() {
        return new GetSplitHistoriesByExchange();
    }

    /**
     * Create an instance of {@link GetSecurityAttributeChangesResponse }
     * 
     */
    public GetSecurityAttributeChangesResponse createGetSecurityAttributeChangesResponse() {
        return new GetSecurityAttributeChangesResponse();
    }

    /**
     * Create an instance of {@link ListInstrumentClassesResponse }
     * 
     */
    public ListInstrumentClassesResponse createListInstrumentClassesResponse() {
        return new ListInstrumentClassesResponse();
    }

    /**
     * Create an instance of {@link ListDividendPaymentFrequenciesResponse }
     * 
     */
    public ListDividendPaymentFrequenciesResponse createListDividendPaymentFrequenciesResponse() {
        return new ListDividendPaymentFrequenciesResponse();
    }

    /**
     * Create an instance of {@link GetInstrumentAttributeChangesByExchange }
     * 
     */
    public GetInstrumentAttributeChangesByExchange createGetInstrumentAttributeChangesByExchange() {
        return new GetInstrumentAttributeChangesByExchange();
    }

    /**
     * Create an instance of {@link ListDividendClassifications }
     * 
     */
    public ListDividendClassifications createListDividendClassifications() {
        return new ListDividendClassifications();
    }

    /**
     * Create an instance of {@link ListPaymentTypesResponse }
     * 
     */
    public ListPaymentTypesResponse createListPaymentTypesResponse() {
        return new ListPaymentTypesResponse();
    }

    /**
     * Create an instance of {@link GetSecurityAttributeChangesByExchange }
     * 
     */
    public GetSecurityAttributeChangesByExchange createGetSecurityAttributeChangesByExchange() {
        return new GetSecurityAttributeChangesByExchange();
    }

    /**
     * Create an instance of {@link GetSplitTotalsByExchange }
     * 
     */
    public GetSplitTotalsByExchange createGetSplitTotalsByExchange() {
        return new GetSplitTotalsByExchange();
    }

    /**
     * Create an instance of {@link GetIssuerTransformationsAllResponse }
     * 
     */
    public GetIssuerTransformationsAllResponse createGetIssuerTransformationsAllResponse() {
        return new GetIssuerTransformationsAllResponse();
    }

    /**
     * Create an instance of {@link DistributionDividend }
     * 
     */
    public DistributionDividend createDistributionDividend() {
        return new DistributionDividend();
    }

    /**
     * Create an instance of {@link IssuerTransformation }
     * 
     */
    public IssuerTransformation createIssuerTransformation() {
        return new IssuerTransformation();
    }

    /**
     * Create an instance of {@link InstrumentTransformation }
     * 
     */
    public InstrumentTransformation createInstrumentTransformation() {
        return new InstrumentTransformation();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link SplitHistory }
     * 
     */
    public SplitHistory createSplitHistory() {
        return new SplitHistory();
    }

    /**
     * Create an instance of {@link Classification }
     * 
     */
    public Classification createClassification() {
        return new Classification();
    }

    /**
     * Create an instance of {@link SplitTotal }
     * 
     */
    public SplitTotal createSplitTotal() {
        return new SplitTotal();
    }

    /**
     * Create an instance of {@link Dividend }
     * 
     */
    public Dividend createDividend() {
        return new Dividend();
    }

    /**
     * Create an instance of {@link DividendHistory }
     * 
     */
    public DividendHistory createDividendHistory() {
        return new DividendHistory();
    }

    /**
     * Create an instance of {@link InstrumentTransformationInputOutput }
     * 
     */
    public InstrumentTransformationInputOutput createInstrumentTransformationInputOutput() {
        return new InstrumentTransformationInputOutput();
    }

    /**
     * Create an instance of {@link IssuerAttributeChange }
     * 
     */
    public IssuerAttributeChange createIssuerAttributeChange() {
        return new IssuerAttributeChange();
    }

    /**
     * Create an instance of {@link ArrayOfClassification }
     * 
     */
    public ArrayOfClassification createArrayOfClassification() {
        return new ArrayOfClassification();
    }

    /**
     * Create an instance of {@link Common }
     * 
     */
    public Common createCommon() {
        return new Common();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

    /**
     * Create an instance of {@link AttributeChange }
     * 
     */
    public AttributeChange createAttributeChange() {
        return new AttributeChange();
    }

    /**
     * Create an instance of {@link CorporateActionRole }
     * 
     */
    public CorporateActionRole createCorporateActionRole() {
        return new CorporateActionRole();
    }

    /**
     * Create an instance of {@link ArrayOfAlternateSecurityIdentifier }
     * 
     */
    public ArrayOfAlternateSecurityIdentifier createArrayOfAlternateSecurityIdentifier() {
        return new ArrayOfAlternateSecurityIdentifier();
    }

    /**
     * Create an instance of {@link PossibleValue }
     * 
     */
    public PossibleValue createPossibleValue() {
        return new PossibleValue();
    }

    /**
     * Create an instance of {@link ArrayOfPayment }
     * 
     */
    public ArrayOfPayment createArrayOfPayment() {
        return new ArrayOfPayment();
    }

    /**
     * Create an instance of {@link Split }
     * 
     */
    public Split createSplit() {
        return new Split();
    }

    /**
     * Create an instance of {@link ArrayOfInstrumentOutputChoice }
     * 
     */
    public ArrayOfInstrumentOutputChoice createArrayOfInstrumentOutputChoice() {
        return new ArrayOfInstrumentOutputChoice();
    }

    /**
     * Create an instance of {@link CorporateAction }
     * 
     */
    public CorporateAction createCorporateAction() {
        return new CorporateAction();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link ArrayOfInstrument }
     * 
     */
    public ArrayOfInstrument createArrayOfInstrument() {
        return new ArrayOfInstrument();
    }

    /**
     * Create an instance of {@link ArrayOfSecurity }
     * 
     */
    public ArrayOfSecurity createArrayOfSecurity() {
        return new ArrayOfSecurity();
    }

    /**
     * Create an instance of {@link DistributionPayment }
     * 
     */
    public DistributionPayment createDistributionPayment() {
        return new DistributionPayment();
    }

    /**
     * Create an instance of {@link Issuer }
     * 
     */
    public Issuer createIssuer() {
        return new Issuer();
    }

    /**
     * Create an instance of {@link CustomAttribute }
     * 
     */
    public CustomAttribute createCustomAttribute() {
        return new CustomAttribute();
    }

    /**
     * Create an instance of {@link ArrayOfDividend }
     * 
     */
    public ArrayOfDividend createArrayOfDividend() {
        return new ArrayOfDividend();
    }

    /**
     * Create an instance of {@link AlternateSecurityIdentifier }
     * 
     */
    public AlternateSecurityIdentifier createAlternateSecurityIdentifier() {
        return new AlternateSecurityIdentifier();
    }

    /**
     * Create an instance of {@link ArrayOfDistributionPayment }
     * 
     */
    public ArrayOfDistributionPayment createArrayOfDistributionPayment() {
        return new ArrayOfDistributionPayment();
    }

    /**
     * Create an instance of {@link ArrayOfInstrumentTransformationInputOutput }
     * 
     */
    public ArrayOfInstrumentTransformationInputOutput createArrayOfInstrumentTransformationInputOutput() {
        return new ArrayOfInstrumentTransformationInputOutput();
    }

    /**
     * Create an instance of {@link ArrayOfCorporateActionRole }
     * 
     */
    public ArrayOfCorporateActionRole createArrayOfCorporateActionRole() {
        return new ArrayOfCorporateActionRole();
    }

    /**
     * Create an instance of {@link ArrayOfPossibleValue }
     * 
     */
    public ArrayOfPossibleValue createArrayOfPossibleValue() {
        return new ArrayOfPossibleValue();
    }

    /**
     * Create an instance of {@link ArrayOfInterestPaymentFixing }
     * 
     */
    public ArrayOfInterestPaymentFixing createArrayOfInterestPaymentFixing() {
        return new ArrayOfInterestPaymentFixing();
    }

    /**
     * Create an instance of {@link PaymentHistory }
     * 
     */
    public PaymentHistory createPaymentHistory() {
        return new PaymentHistory();
    }

    /**
     * Create an instance of {@link SecurityAttributeChange }
     * 
     */
    public SecurityAttributeChange createSecurityAttributeChange() {
        return new SecurityAttributeChange();
    }

    /**
     * Create an instance of {@link ArrayOfCustomAttribute }
     * 
     */
    public ArrayOfCustomAttribute createArrayOfCustomAttribute() {
        return new ArrayOfCustomAttribute();
    }

    /**
     * Create an instance of {@link ArrayOfSplit }
     * 
     */
    public ArrayOfSplit createArrayOfSplit() {
        return new ArrayOfSplit();
    }

    /**
     * Create an instance of {@link InstrumentOutputChoice }
     * 
     */
    public InstrumentOutputChoice createInstrumentOutputChoice() {
        return new InstrumentOutputChoice();
    }

    /**
     * Create an instance of {@link ArrayOfDistributionDividend }
     * 
     */
    public ArrayOfDistributionDividend createArrayOfDistributionDividend() {
        return new ArrayOfDistributionDividend();
    }

    /**
     * Create an instance of {@link InstrumentAttributeChange }
     * 
     */
    public InstrumentAttributeChange createInstrumentAttributeChange() {
        return new InstrumentAttributeChange();
    }

    /**
     * Create an instance of {@link ArrayOfAttributeChange }
     * 
     */
    public ArrayOfAttributeChange createArrayOfAttributeChange() {
        return new ArrayOfAttributeChange();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfAction }
     * 
     */
    public ArrayOfAction createArrayOfAction() {
        return new ArrayOfAction();
    }

    /**
     * Create an instance of {@link Instrument }
     * 
     */
    public Instrument createInstrument() {
        return new Instrument();
    }

    /**
     * Create an instance of {@link InterestPaymentFixing }
     * 
     */
    public InterestPaymentFixing createInterestPaymentFixing() {
        return new InterestPaymentFixing();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDistributionSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfDistributionSet")
    public JAXBElement<ArrayOfDistributionSet> createArrayOfDistributionSet(ArrayOfDistributionSet value) {
        return new JAXBElement<ArrayOfDistributionSet>(_ArrayOfDistributionSet_QNAME, ArrayOfDistributionSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInstrumentTransformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfInstrumentTransformation")
    public JAXBElement<ArrayOfInstrumentTransformation> createArrayOfInstrumentTransformation(ArrayOfInstrumentTransformation value) {
        return new JAXBElement<ArrayOfInstrumentTransformation>(_ArrayOfInstrumentTransformation_QNAME, ArrayOfInstrumentTransformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistributionSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "DistributionSet")
    public JAXBElement<DistributionSet> createDistributionSet(DistributionSet value) {
        return new JAXBElement<DistributionSet>(_DistributionSet_QNAME, DistributionSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDividendHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfDividendHistory")
    public JAXBElement<ArrayOfDividendHistory> createArrayOfDividendHistory(ArrayOfDividendHistory value) {
        return new JAXBElement<ArrayOfDividendHistory>(_ArrayOfDividendHistory_QNAME, ArrayOfDividendHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIssuerAttributeChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfIssuerAttributeChange")
    public JAXBElement<ArrayOfIssuerAttributeChange> createArrayOfIssuerAttributeChange(ArrayOfIssuerAttributeChange value) {
        return new JAXBElement<ArrayOfIssuerAttributeChange>(_ArrayOfIssuerAttributeChange_QNAME, ArrayOfIssuerAttributeChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PossibleValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "PossibleValues")
    public JAXBElement<PossibleValues> createPossibleValues(PossibleValues value) {
        return new JAXBElement<PossibleValues>(_PossibleValues_QNAME, PossibleValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfPaymentHistory")
    public JAXBElement<ArrayOfPaymentHistory> createArrayOfPaymentHistory(ArrayOfPaymentHistory value) {
        return new JAXBElement<ArrayOfPaymentHistory>(_ArrayOfPaymentHistory_QNAME, ArrayOfPaymentHistory.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIssuerTransformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfIssuerTransformation")
    public JAXBElement<ArrayOfIssuerTransformation> createArrayOfIssuerTransformation(ArrayOfIssuerTransformation value) {
        return new JAXBElement<ArrayOfIssuerTransformation>(_ArrayOfIssuerTransformation_QNAME, ArrayOfIssuerTransformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInstrumentAttributeChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfInstrumentAttributeChange")
    public JAXBElement<ArrayOfInstrumentAttributeChange> createArrayOfInstrumentAttributeChange(ArrayOfInstrumentAttributeChange value) {
        return new JAXBElement<ArrayOfInstrumentAttributeChange>(_ArrayOfInstrumentAttributeChange_QNAME, ArrayOfInstrumentAttributeChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSplitTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfSplitTotal")
    public JAXBElement<ArrayOfSplitTotal> createArrayOfSplitTotal(ArrayOfSplitTotal value) {
        return new JAXBElement<ArrayOfSplitTotal>(_ArrayOfSplitTotal_QNAME, ArrayOfSplitTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCorporateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfCorporateAction")
    public JAXBElement<ArrayOfCorporateAction> createArrayOfCorporateAction(ArrayOfCorporateAction value) {
        return new JAXBElement<ArrayOfCorporateAction>(_ArrayOfCorporateAction_QNAME, ArrayOfCorporateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSecurityAttributeChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfSecurityAttributeChange")
    public JAXBElement<ArrayOfSecurityAttributeChange> createArrayOfSecurityAttributeChange(ArrayOfSecurityAttributeChange value) {
        return new JAXBElement<ArrayOfSecurityAttributeChange>(_ArrayOfSecurityAttributeChange_QNAME, ArrayOfSecurityAttributeChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSplitHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xignite.com/services/", name = "ArrayOfSplitHistory")
    public JAXBElement<ArrayOfSplitHistory> createArrayOfSplitHistory(ArrayOfSplitHistory value) {
        return new JAXBElement<ArrayOfSplitHistory>(_ArrayOfSplitHistory_QNAME, ArrayOfSplitHistory.class, null, value);
    }

}
