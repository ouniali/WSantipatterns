
package ro.platforma_broker.ws.travel.types;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.brokerplatform_ws_travel.PlanCalatorieAllianz;
import org.datacontract.schemas._2004._07.brokerplatform_ws_travel.PlanCalatorieCreditEurope;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ro.platforma_broker.ws.travel.types package. 
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

    private final static QName _TipReducere_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "TipReducere");
    private final static QName _TravelCotatieResponse_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "TravelCotatieResponse");
    private final static QName _TravelSalvareRequest_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "TravelSalvareRequest");
    private final static QName _Tara_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Tara");
    private final static QName _DomeniuActivitate_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "DomeniuActivitate");
    private final static QName _TipPolita_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "TipPolita");
    private final static QName _ProdusTravel_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "ProdusTravel");
    private final static QName _TravelSalvareResponse_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "TravelSalvareResponse");
    private final static QName _Adresa_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Adresa");
    private final static QName _StareSanatate_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "StareSanatate");
    private final static QName _TravelCotatie_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "TravelCotatie");
    private final static QName _ArrayOfTravelCotatie_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "ArrayOfTravelCotatie");
    private final static QName _Asigurat_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Asigurat");
    private final static QName _AcoperireCalatorie_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "AcoperireCalatorie");
    private final static QName _TravelCotatieRequest_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "TravelCotatieRequest");
    private final static QName _ArrayOfProdusTravel_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "ArrayOfProdusTravel");
    private final static QName _TipCalatorie_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "TipCalatorie");
    private final static QName _AcoperireBunuriElectronice_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "AcoperireBunuriElectronice");
    private final static QName _SumaAsigurata_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "SumaAsigurata");
    private final static QName _Judet_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Judet");
    private final static QName _AcoperireBagaje_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "AcoperireBagaje");
    private final static QName _ScopCalatorie_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "ScopCalatorie");
    private final static QName _TravelSalvareRequestDetaliiPlata_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "DetaliiPlata");
    private final static QName _TravelSalvareRequestSumaAsigurataRiscSuplimentarLegalInEuro_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "SumaAsigurataRiscSuplimentarLegalInEuro");
    private final static QName _TravelSalvareRequestAltaSumaAsigurataInEuro_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "AltaSumaAsigurataInEuro");
    private final static QName _TravelSalvareRequestTelefonPersoanaContact_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "TelefonPersoanaContact");
    private final static QName _TravelSalvareRequestReducereaSeAplicaLaPrima_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "ReducereaSeAplicaLaPrima");
    private final static QName _TravelSalvareRequestAstraMentiuniSpeciale_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "AstraMentiuniSpeciale");
    private final static QName _TravelSalvareRequestAdresaLivare_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "AdresaLivare");
    private final static QName _TravelSalvareRequestAllianzProduct_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "AllianzProduct");
    private final static QName _TravelSalvareRequestCodVoucher_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "CodVoucher");
    private final static QName _TravelSalvareRequestEmailPersoanaContact_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "EmailPersoanaContact");
    private final static QName _TravelSalvareRequestNumarComanda_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "NumarComanda");
    private final static QName _TravelSalvareRequestNumePersoanaContact_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "NumePersoanaContact");
    private final static QName _TravelSalvareRequestAstraTariTranzit_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "AstraTariTranzit");
    private final static QName _TravelSalvareRequestCreditEruopeProduct_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "CreditEruopeProduct");
    private final static QName _TravelSalvareRequestSumaAsigurataRiscSuplimentarStornoInEuro_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "SumaAsigurataRiscSuplimentarStornoInEuro");
    private final static QName _TravelSalvareRequestPretRedus_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "PretRedus");
    private final static QName _TravelCotatieResponseCotatii_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Cotatii");
    private final static QName _TravelSalvareResponseEmailAgent_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "EmailAgent");
    private final static QName _TravelSalvareResponseMesajEroare_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "MesajEroare");
    private final static QName _AsiguratEmail_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Email");
    private final static QName _AsiguratNumarTelefon_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "NumarTelefon");
    private final static QName _AsiguratNumarFax_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "NumarFax");
    private final static QName _AsiguratNume_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Nume");
    private final static QName _AsiguratSerieSiNumarPasaport_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "SerieSiNumarPasaport");
    private final static QName _AsiguratEsteElevSauStudent_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "EsteElevSauStudent");
    private final static QName _AsiguratPrenume_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Prenume");
    private final static QName _TravelCotatieEmailAgentVoucher_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "EmailAgentVoucher");
    private final static QName _TravelCotatiePrimaRON_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "PrimaRON");
    private final static QName _TravelCotatieSumaAsigurataEUR_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "SumaAsigurataEUR");
    private final static QName _TravelCotatieRequestPlanCalatorieATEInsurance_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "PlanCalatorieATEInsurance");
    private final static QName _AdresaCodPostal_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "CodPostal");
    private final static QName _AdresaApartament_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Apartament");
    private final static QName _AdresaBloc_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Bloc");
    private final static QName _AdresaNumarStrada_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "NumarStrada");
    private final static QName _AdresaScara_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Scara");
    private final static QName _AdresaStrada_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Strada");
    private final static QName _AdresaLocalitate_QNAME = new QName("http://www.platforma-broker.ro/ws/travel/types/", "Localitate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ro.platforma_broker.ws.travel.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TravelSalvareResponse }
     * 
     */
    public TravelSalvareResponse createTravelSalvareResponse() {
        return new TravelSalvareResponse();
    }

    /**
     * Create an instance of {@link TravelSalvareRequest }
     * 
     */
    public TravelSalvareRequest createTravelSalvareRequest() {
        return new TravelSalvareRequest();
    }

    /**
     * Create an instance of {@link TravelCotatieRequest }
     * 
     */
    public TravelCotatieRequest createTravelCotatieRequest() {
        return new TravelCotatieRequest();
    }

    /**
     * Create an instance of {@link TravelCotatieResponse }
     * 
     */
    public TravelCotatieResponse createTravelCotatieResponse() {
        return new TravelCotatieResponse();
    }

    /**
     * Create an instance of {@link Adresa }
     * 
     */
    public Adresa createAdresa() {
        return new Adresa();
    }

    /**
     * Create an instance of {@link Asigurat }
     * 
     */
    public Asigurat createAsigurat() {
        return new Asigurat();
    }

    /**
     * Create an instance of {@link ArrayOfTravelCotatie }
     * 
     */
    public ArrayOfTravelCotatie createArrayOfTravelCotatie() {
        return new ArrayOfTravelCotatie();
    }

    /**
     * Create an instance of {@link TravelCotatie }
     * 
     */
    public TravelCotatie createTravelCotatie() {
        return new TravelCotatie();
    }

    /**
     * Create an instance of {@link ArrayOfProdusTravel }
     * 
     */
    public ArrayOfProdusTravel createArrayOfProdusTravel() {
        return new ArrayOfProdusTravel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipReducere }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "TipReducere")
    public JAXBElement<TipReducere> createTipReducere(TipReducere value) {
        return new JAXBElement<TipReducere>(_TipReducere_QNAME, TipReducere.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelCotatieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "TravelCotatieResponse")
    public JAXBElement<TravelCotatieResponse> createTravelCotatieResponse(TravelCotatieResponse value) {
        return new JAXBElement<TravelCotatieResponse>(_TravelCotatieResponse_QNAME, TravelCotatieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelSalvareRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "TravelSalvareRequest")
    public JAXBElement<TravelSalvareRequest> createTravelSalvareRequest(TravelSalvareRequest value) {
        return new JAXBElement<TravelSalvareRequest>(_TravelSalvareRequest_QNAME, TravelSalvareRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tara }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Tara")
    public JAXBElement<Tara> createTara(Tara value) {
        return new JAXBElement<Tara>(_Tara_QNAME, Tara.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomeniuActivitate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "DomeniuActivitate")
    public JAXBElement<DomeniuActivitate> createDomeniuActivitate(DomeniuActivitate value) {
        return new JAXBElement<DomeniuActivitate>(_DomeniuActivitate_QNAME, DomeniuActivitate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipPolita }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "TipPolita")
    public JAXBElement<TipPolita> createTipPolita(TipPolita value) {
        return new JAXBElement<TipPolita>(_TipPolita_QNAME, TipPolita.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdusTravel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "ProdusTravel")
    public JAXBElement<ProdusTravel> createProdusTravel(ProdusTravel value) {
        return new JAXBElement<ProdusTravel>(_ProdusTravel_QNAME, ProdusTravel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelSalvareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "TravelSalvareResponse")
    public JAXBElement<TravelSalvareResponse> createTravelSalvareResponse(TravelSalvareResponse value) {
        return new JAXBElement<TravelSalvareResponse>(_TravelSalvareResponse_QNAME, TravelSalvareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Adresa")
    public JAXBElement<Adresa> createAdresa(Adresa value) {
        return new JAXBElement<Adresa>(_Adresa_QNAME, Adresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StareSanatate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "StareSanatate")
    public JAXBElement<StareSanatate> createStareSanatate(StareSanatate value) {
        return new JAXBElement<StareSanatate>(_StareSanatate_QNAME, StareSanatate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelCotatie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "TravelCotatie")
    public JAXBElement<TravelCotatie> createTravelCotatie(TravelCotatie value) {
        return new JAXBElement<TravelCotatie>(_TravelCotatie_QNAME, TravelCotatie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTravelCotatie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "ArrayOfTravelCotatie")
    public JAXBElement<ArrayOfTravelCotatie> createArrayOfTravelCotatie(ArrayOfTravelCotatie value) {
        return new JAXBElement<ArrayOfTravelCotatie>(_ArrayOfTravelCotatie_QNAME, ArrayOfTravelCotatie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Asigurat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Asigurat")
    public JAXBElement<Asigurat> createAsigurat(Asigurat value) {
        return new JAXBElement<Asigurat>(_Asigurat_QNAME, Asigurat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcoperireCalatorie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "AcoperireCalatorie")
    public JAXBElement<AcoperireCalatorie> createAcoperireCalatorie(AcoperireCalatorie value) {
        return new JAXBElement<AcoperireCalatorie>(_AcoperireCalatorie_QNAME, AcoperireCalatorie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelCotatieRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "TravelCotatieRequest")
    public JAXBElement<TravelCotatieRequest> createTravelCotatieRequest(TravelCotatieRequest value) {
        return new JAXBElement<TravelCotatieRequest>(_TravelCotatieRequest_QNAME, TravelCotatieRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProdusTravel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "ArrayOfProdusTravel")
    public JAXBElement<ArrayOfProdusTravel> createArrayOfProdusTravel(ArrayOfProdusTravel value) {
        return new JAXBElement<ArrayOfProdusTravel>(_ArrayOfProdusTravel_QNAME, ArrayOfProdusTravel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipCalatorie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "TipCalatorie")
    public JAXBElement<TipCalatorie> createTipCalatorie(TipCalatorie value) {
        return new JAXBElement<TipCalatorie>(_TipCalatorie_QNAME, TipCalatorie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "AcoperireBunuriElectronice")
    public JAXBElement<String> createAcoperireBunuriElectronice(String value) {
        return new JAXBElement<String>(_AcoperireBunuriElectronice_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "SumaAsigurata")
    public JAXBElement<String> createSumaAsigurata(String value) {
        return new JAXBElement<String>(_SumaAsigurata_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Judet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Judet")
    public JAXBElement<Judet> createJudet(Judet value) {
        return new JAXBElement<Judet>(_Judet_QNAME, Judet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "AcoperireBagaje")
    public JAXBElement<String> createAcoperireBagaje(String value) {
        return new JAXBElement<String>(_AcoperireBagaje_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScopCalatorie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "ScopCalatorie")
    public JAXBElement<ScopCalatorie> createScopCalatorie(ScopCalatorie value) {
        return new JAXBElement<ScopCalatorie>(_ScopCalatorie_QNAME, ScopCalatorie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "DetaliiPlata", scope = TravelSalvareRequest.class)
    public JAXBElement<String> createTravelSalvareRequestDetaliiPlata(String value) {
        return new JAXBElement<String>(_TravelSalvareRequestDetaliiPlata_QNAME, String.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "SumaAsigurataRiscSuplimentarLegalInEuro", scope = TravelSalvareRequest.class)
    public JAXBElement<BigDecimal> createTravelSalvareRequestSumaAsigurataRiscSuplimentarLegalInEuro(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TravelSalvareRequestSumaAsigurataRiscSuplimentarLegalInEuro_QNAME, BigDecimal.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "AltaSumaAsigurataInEuro", scope = TravelSalvareRequest.class)
    public JAXBElement<BigDecimal> createTravelSalvareRequestAltaSumaAsigurataInEuro(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TravelSalvareRequestAltaSumaAsigurataInEuro_QNAME, BigDecimal.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "TelefonPersoanaContact", scope = TravelSalvareRequest.class)
    public JAXBElement<String> createTravelSalvareRequestTelefonPersoanaContact(String value) {
        return new JAXBElement<String>(_TravelSalvareRequestTelefonPersoanaContact_QNAME, String.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "ReducereaSeAplicaLaPrima", scope = TravelSalvareRequest.class)
    public JAXBElement<Boolean> createTravelSalvareRequestReducereaSeAplicaLaPrima(Boolean value) {
        return new JAXBElement<Boolean>(_TravelSalvareRequestReducereaSeAplicaLaPrima_QNAME, Boolean.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "AstraMentiuniSpeciale", scope = TravelSalvareRequest.class)
    public JAXBElement<String> createTravelSalvareRequestAstraMentiuniSpeciale(String value) {
        return new JAXBElement<String>(_TravelSalvareRequestAstraMentiuniSpeciale_QNAME, String.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "AdresaLivare", scope = TravelSalvareRequest.class)
    public JAXBElement<String> createTravelSalvareRequestAdresaLivare(String value) {
        return new JAXBElement<String>(_TravelSalvareRequestAdresaLivare_QNAME, String.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanCalatorieAllianz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "AllianzProduct", scope = TravelSalvareRequest.class)
    public JAXBElement<PlanCalatorieAllianz> createTravelSalvareRequestAllianzProduct(PlanCalatorieAllianz value) {
        return new JAXBElement<PlanCalatorieAllianz>(_TravelSalvareRequestAllianzProduct_QNAME, PlanCalatorieAllianz.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "CodVoucher", scope = TravelSalvareRequest.class)
    public JAXBElement<String> createTravelSalvareRequestCodVoucher(String value) {
        return new JAXBElement<String>(_TravelSalvareRequestCodVoucher_QNAME, String.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "EmailPersoanaContact", scope = TravelSalvareRequest.class)
    public JAXBElement<String> createTravelSalvareRequestEmailPersoanaContact(String value) {
        return new JAXBElement<String>(_TravelSalvareRequestEmailPersoanaContact_QNAME, String.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "NumarComanda", scope = TravelSalvareRequest.class)
    public JAXBElement<String> createTravelSalvareRequestNumarComanda(String value) {
        return new JAXBElement<String>(_TravelSalvareRequestNumarComanda_QNAME, String.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "NumePersoanaContact", scope = TravelSalvareRequest.class)
    public JAXBElement<String> createTravelSalvareRequestNumePersoanaContact(String value) {
        return new JAXBElement<String>(_TravelSalvareRequestNumePersoanaContact_QNAME, String.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "AstraTariTranzit", scope = TravelSalvareRequest.class)
    public JAXBElement<String> createTravelSalvareRequestAstraTariTranzit(String value) {
        return new JAXBElement<String>(_TravelSalvareRequestAstraTariTranzit_QNAME, String.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanCalatorieCreditEurope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "CreditEruopeProduct", scope = TravelSalvareRequest.class)
    public JAXBElement<PlanCalatorieCreditEurope> createTravelSalvareRequestCreditEruopeProduct(PlanCalatorieCreditEurope value) {
        return new JAXBElement<PlanCalatorieCreditEurope>(_TravelSalvareRequestCreditEruopeProduct_QNAME, PlanCalatorieCreditEurope.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "SumaAsigurataRiscSuplimentarStornoInEuro", scope = TravelSalvareRequest.class)
    public JAXBElement<BigDecimal> createTravelSalvareRequestSumaAsigurataRiscSuplimentarStornoInEuro(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TravelSalvareRequestSumaAsigurataRiscSuplimentarStornoInEuro_QNAME, BigDecimal.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "PretRedus", scope = TravelSalvareRequest.class)
    public JAXBElement<BigDecimal> createTravelSalvareRequestPretRedus(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TravelSalvareRequestPretRedus_QNAME, BigDecimal.class, TravelSalvareRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTravelCotatie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Cotatii", scope = TravelCotatieResponse.class)
    public JAXBElement<ArrayOfTravelCotatie> createTravelCotatieResponseCotatii(ArrayOfTravelCotatie value) {
        return new JAXBElement<ArrayOfTravelCotatie>(_TravelCotatieResponseCotatii_QNAME, ArrayOfTravelCotatie.class, TravelCotatieResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "EmailAgent", scope = TravelSalvareResponse.class)
    public JAXBElement<String> createTravelSalvareResponseEmailAgent(String value) {
        return new JAXBElement<String>(_TravelSalvareResponseEmailAgent_QNAME, String.class, TravelSalvareResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "MesajEroare", scope = TravelSalvareResponse.class)
    public JAXBElement<String> createTravelSalvareResponseMesajEroare(String value) {
        return new JAXBElement<String>(_TravelSalvareResponseMesajEroare_QNAME, String.class, TravelSalvareResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Email", scope = Asigurat.class)
    public JAXBElement<String> createAsiguratEmail(String value) {
        return new JAXBElement<String>(_AsiguratEmail_QNAME, String.class, Asigurat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "NumarTelefon", scope = Asigurat.class)
    public JAXBElement<String> createAsiguratNumarTelefon(String value) {
        return new JAXBElement<String>(_AsiguratNumarTelefon_QNAME, String.class, Asigurat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "NumarFax", scope = Asigurat.class)
    public JAXBElement<String> createAsiguratNumarFax(String value) {
        return new JAXBElement<String>(_AsiguratNumarFax_QNAME, String.class, Asigurat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Adresa", scope = Asigurat.class)
    public JAXBElement<Adresa> createAsiguratAdresa(Adresa value) {
        return new JAXBElement<Adresa>(_Adresa_QNAME, Adresa.class, Asigurat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Nume", scope = Asigurat.class)
    public JAXBElement<String> createAsiguratNume(String value) {
        return new JAXBElement<String>(_AsiguratNume_QNAME, String.class, Asigurat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "SerieSiNumarPasaport", scope = Asigurat.class)
    public JAXBElement<String> createAsiguratSerieSiNumarPasaport(String value) {
        return new JAXBElement<String>(_AsiguratSerieSiNumarPasaport_QNAME, String.class, Asigurat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "EsteElevSauStudent", scope = Asigurat.class)
    public JAXBElement<Boolean> createAsiguratEsteElevSauStudent(Boolean value) {
        return new JAXBElement<Boolean>(_AsiguratEsteElevSauStudent_QNAME, Boolean.class, Asigurat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Prenume", scope = Asigurat.class)
    public JAXBElement<String> createAsiguratPrenume(String value) {
        return new JAXBElement<String>(_AsiguratPrenume_QNAME, String.class, Asigurat.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "MesajEroare", scope = TravelCotatie.class)
    public JAXBElement<String> createTravelCotatieMesajEroare(String value) {
        return new JAXBElement<String>(_TravelSalvareResponseMesajEroare_QNAME, String.class, TravelCotatie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "EmailAgentVoucher", scope = TravelCotatie.class)
    public JAXBElement<String> createTravelCotatieEmailAgentVoucher(String value) {
        return new JAXBElement<String>(_TravelCotatieEmailAgentVoucher_QNAME, String.class, TravelCotatie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "PrimaRON", scope = TravelCotatie.class)
    public JAXBElement<BigDecimal> createTravelCotatiePrimaRON(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TravelCotatiePrimaRON_QNAME, BigDecimal.class, TravelCotatie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "SumaAsigurataEUR", scope = TravelCotatie.class)
    public JAXBElement<BigDecimal> createTravelCotatieSumaAsigurataEUR(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TravelCotatieSumaAsigurataEUR_QNAME, BigDecimal.class, TravelCotatie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "PlanCalatorieATEInsurance", scope = TravelCotatieRequest.class)
    public JAXBElement<Integer> createTravelCotatieRequestPlanCalatorieATEInsurance(Integer value) {
        return new JAXBElement<Integer>(_TravelCotatieRequestPlanCalatorieATEInsurance_QNAME, Integer.class, TravelCotatieRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "SumaAsigurataRiscSuplimentarLegalInEuro", scope = TravelCotatieRequest.class)
    public JAXBElement<BigDecimal> createTravelCotatieRequestSumaAsigurataRiscSuplimentarLegalInEuro(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TravelSalvareRequestSumaAsigurataRiscSuplimentarLegalInEuro_QNAME, BigDecimal.class, TravelCotatieRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "AltaSumaAsigurataInEuro", scope = TravelCotatieRequest.class)
    public JAXBElement<BigDecimal> createTravelCotatieRequestAltaSumaAsigurataInEuro(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TravelSalvareRequestAltaSumaAsigurataInEuro_QNAME, BigDecimal.class, TravelCotatieRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanCalatorieCreditEurope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "CreditEruopeProduct", scope = TravelCotatieRequest.class)
    public JAXBElement<PlanCalatorieCreditEurope> createTravelCotatieRequestCreditEruopeProduct(PlanCalatorieCreditEurope value) {
        return new JAXBElement<PlanCalatorieCreditEurope>(_TravelSalvareRequestCreditEruopeProduct_QNAME, PlanCalatorieCreditEurope.class, TravelCotatieRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "SumaAsigurataRiscSuplimentarStornoInEuro", scope = TravelCotatieRequest.class)
    public JAXBElement<BigDecimal> createTravelCotatieRequestSumaAsigurataRiscSuplimentarStornoInEuro(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TravelSalvareRequestSumaAsigurataRiscSuplimentarStornoInEuro_QNAME, BigDecimal.class, TravelCotatieRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanCalatorieAllianz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "AllianzProduct", scope = TravelCotatieRequest.class)
    public JAXBElement<PlanCalatorieAllianz> createTravelCotatieRequestAllianzProduct(PlanCalatorieAllianz value) {
        return new JAXBElement<PlanCalatorieAllianz>(_TravelSalvareRequestAllianzProduct_QNAME, PlanCalatorieAllianz.class, TravelCotatieRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "CodVoucher", scope = TravelCotatieRequest.class)
    public JAXBElement<String> createTravelCotatieRequestCodVoucher(String value) {
        return new JAXBElement<String>(_TravelSalvareRequestCodVoucher_QNAME, String.class, TravelCotatieRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "CodPostal", scope = Adresa.class)
    public JAXBElement<Integer> createAdresaCodPostal(Integer value) {
        return new JAXBElement<Integer>(_AdresaCodPostal_QNAME, Integer.class, Adresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Apartament", scope = Adresa.class)
    public JAXBElement<String> createAdresaApartament(String value) {
        return new JAXBElement<String>(_AdresaApartament_QNAME, String.class, Adresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Bloc", scope = Adresa.class)
    public JAXBElement<String> createAdresaBloc(String value) {
        return new JAXBElement<String>(_AdresaBloc_QNAME, String.class, Adresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "NumarStrada", scope = Adresa.class)
    public JAXBElement<String> createAdresaNumarStrada(String value) {
        return new JAXBElement<String>(_AdresaNumarStrada_QNAME, String.class, Adresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Scara", scope = Adresa.class)
    public JAXBElement<String> createAdresaScara(String value) {
        return new JAXBElement<String>(_AdresaScara_QNAME, String.class, Adresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Strada", scope = Adresa.class)
    public JAXBElement<String> createAdresaStrada(String value) {
        return new JAXBElement<String>(_AdresaStrada_QNAME, String.class, Adresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.platforma-broker.ro/ws/travel/types/", name = "Localitate", scope = Adresa.class)
    public JAXBElement<String> createAdresaLocalitate(String value) {
        return new JAXBElement<String>(_AdresaLocalitate_QNAME, String.class, Adresa.class, value);
    }

}
