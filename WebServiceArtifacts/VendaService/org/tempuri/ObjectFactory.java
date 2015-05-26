
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ArrayOfHotel;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ArrayOfHotelCodigo;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ArrayOfHotelDestaque;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ArrayOfHotelFacilidade;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ArrayOfHotelFoto;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ArrayOfHotelLocalizacao;
import org.datacontract.schemas._2004._07.ftv_hotel_business.Atualizacao;
import org.datacontract.schemas._2004._07.ftv_hotel_business.CancelamentoParametro;
import org.datacontract.schemas._2004._07.ftv_hotel_business.CancelamentoRetorno;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ConsultaFacilidadeFiltro;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ConsultaFotoFiltro;
import org.datacontract.schemas._2004._07.ftv_hotel_business.CosultaFiltro;
import org.datacontract.schemas._2004._07.ftv_hotel_business.CosultaInformacaoFiltro;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelAlteradoConfirmacao;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelAlteradoConfirmacaoFiltro;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelAlteradoFiltro;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelDestaque;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelLocalizacaoFiltro;
import org.datacontract.schemas._2004._07.ftv_hotel_business.HotelRetorno;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ReservaParametro;
import org.datacontract.schemas._2004._07.ftv_hotel_business.ReservaRetorno;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _ContadorHoteisProcessadosConsultaFiltro_QNAME = new QName("http://tempuri.org/", "consultaFiltro");
    private final static QName _ReservarHotelResponseReservarHotelResult_QNAME = new QName("http://tempuri.org/", "ReservarHotelResult");
    private final static QName _ConsultarHotelDestaqueResponseConsultarHotelDestaqueResult_QNAME = new QName("http://tempuri.org/", "ConsultarHotelDestaqueResult");
    private final static QName _ConsultarHotelFotoResponseConsultarHotelFotoResult_QNAME = new QName("http://tempuri.org/", "ConsultarHotelFotoResult");
    private final static QName _RetornarResponseRetornarResult_QNAME = new QName("http://tempuri.org/", "RetornarResult");
    private final static QName _ConsultarHotelAlteradoResponseConsultarHotelAlteradoResult_QNAME = new QName("http://tempuri.org/", "ConsultarHotelAlteradoResult");
    private final static QName _ImportarReservaExternaResponseImportarReservaExternaResult_QNAME = new QName("http://tempuri.org/", "ImportarReservaExternaResult");
    private final static QName _ConsultarHotelFacilidadeCosultaFacilidadeFiltro_QNAME = new QName("http://tempuri.org/", "cosultaFacilidadeFiltro");
    private final static QName _ConsultarHotelDestaqueHotelDestaque_QNAME = new QName("http://tempuri.org/", "hotelDestaque");
    private final static QName _ConsultarResponseConsultarResult_QNAME = new QName("http://tempuri.org/", "ConsultarResult");
    private final static QName _ConsultarHotelInformacaoResponseConsultarHotelInformacaoResult_QNAME = new QName("http://tempuri.org/", "ConsultarHotelInformacaoResult");
    private final static QName _CancelarResponseCancelarResult_QNAME = new QName("http://tempuri.org/", "CancelarResult");
    private final static QName _ImportarReservaExternaAtualizacao_QNAME = new QName("http://tempuri.org/", "atualizacao");
    private final static QName _CancelarCancelamentoParametro_QNAME = new QName("http://tempuri.org/", "cancelamentoParametro");
    private final static QName _AtualizarStatusReservaIntegracaoResponseAtualizarStatusReservaIntegracaoResult_QNAME = new QName("http://tempuri.org/", "AtualizarStatusReservaIntegracaoResult");
    private final static QName _ReservarHotelReservaParametro_QNAME = new QName("http://tempuri.org/", "reservaParametro");
    private final static QName _ConsultarLocalizacaoResponseConsultarLocalizacaoResult_QNAME = new QName("http://tempuri.org/", "ConsultarLocalizacaoResult");
    private final static QName _ConsultarLocalizacaoHotelLocalizacaoFiltro_QNAME = new QName("http://tempuri.org/", "hotelLocalizacaoFiltro");
    private final static QName _ConsultarHotelAlteradoHotelAlteradoFiltro_QNAME = new QName("http://tempuri.org/", "hotelAlteradoFiltro");
    private final static QName _ConsultarHotelFacilidadeResponseConsultarHotelFacilidadeResult_QNAME = new QName("http://tempuri.org/", "ConsultarHotelFacilidadeResult");
    private final static QName _ConfirmarHotelAlteradoHotelAlteradoConfirmacaoFiltro_QNAME = new QName("http://tempuri.org/", "hotelAlteradoConfirmacaoFiltro");
    private final static QName _ConsultarHotelResponseConsultarHotelResult_QNAME = new QName("http://tempuri.org/", "ConsultarHotelResult");
    private final static QName _ConsultarHotelFotoCosultaFotoFiltro_QNAME = new QName("http://tempuri.org/", "cosultaFotoFiltro");
    private final static QName _ConfirmarHotelAlteradoResponseConfirmarHotelAlteradoResult_QNAME = new QName("http://tempuri.org/", "ConfirmarHotelAlteradoResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContadorHoteisProcessados }
     * 
     */
    public ContadorHoteisProcessados createContadorHoteisProcessados() {
        return new ContadorHoteisProcessados();
    }

    /**
     * Create an instance of {@link ConsultarHotelFacilidade }
     * 
     */
    public ConsultarHotelFacilidade createConsultarHotelFacilidade() {
        return new ConsultarHotelFacilidade();
    }

    /**
     * Create an instance of {@link Retornar }
     * 
     */
    public Retornar createRetornar() {
        return new Retornar();
    }

    /**
     * Create an instance of {@link ConsultarHotelFacilidadeResponse }
     * 
     */
    public ConsultarHotelFacilidadeResponse createConsultarHotelFacilidadeResponse() {
        return new ConsultarHotelFacilidadeResponse();
    }

    /**
     * Create an instance of {@link ConsultarLocalizacao }
     * 
     */
    public ConsultarLocalizacao createConsultarLocalizacao() {
        return new ConsultarLocalizacao();
    }

    /**
     * Create an instance of {@link ReservarHotel }
     * 
     */
    public ReservarHotel createReservarHotel() {
        return new ReservarHotel();
    }

    /**
     * Create an instance of {@link ConfirmarHotelAlterado }
     * 
     */
    public ConfirmarHotelAlterado createConfirmarHotelAlterado() {
        return new ConfirmarHotelAlterado();
    }

    /**
     * Create an instance of {@link RetornarResponse }
     * 
     */
    public RetornarResponse createRetornarResponse() {
        return new RetornarResponse();
    }

    /**
     * Create an instance of {@link ConfirmarHotelAlteradoResponse }
     * 
     */
    public ConfirmarHotelAlteradoResponse createConfirmarHotelAlteradoResponse() {
        return new ConfirmarHotelAlteradoResponse();
    }

    /**
     * Create an instance of {@link Cancelar }
     * 
     */
    public Cancelar createCancelar() {
        return new Cancelar();
    }

    /**
     * Create an instance of {@link ContadorHoteisProcessadosResponse }
     * 
     */
    public ContadorHoteisProcessadosResponse createContadorHoteisProcessadosResponse() {
        return new ContadorHoteisProcessadosResponse();
    }

    /**
     * Create an instance of {@link CancelarResponse }
     * 
     */
    public CancelarResponse createCancelarResponse() {
        return new CancelarResponse();
    }

    /**
     * Create an instance of {@link VerificarConsultaFinalizada }
     * 
     */
    public VerificarConsultaFinalizada createVerificarConsultaFinalizada() {
        return new VerificarConsultaFinalizada();
    }

    /**
     * Create an instance of {@link ConsultarHotelInformacao }
     * 
     */
    public ConsultarHotelInformacao createConsultarHotelInformacao() {
        return new ConsultarHotelInformacao();
    }

    /**
     * Create an instance of {@link ConsultarLocalizacaoResponse }
     * 
     */
    public ConsultarLocalizacaoResponse createConsultarLocalizacaoResponse() {
        return new ConsultarLocalizacaoResponse();
    }

    /**
     * Create an instance of {@link VerificarConsultaFinalizadaResponse }
     * 
     */
    public VerificarConsultaFinalizadaResponse createVerificarConsultaFinalizadaResponse() {
        return new VerificarConsultaFinalizadaResponse();
    }

    /**
     * Create an instance of {@link ConsultarHotel }
     * 
     */
    public ConsultarHotel createConsultarHotel() {
        return new ConsultarHotel();
    }

    /**
     * Create an instance of {@link Consultar }
     * 
     */
    public Consultar createConsultar() {
        return new Consultar();
    }

    /**
     * Create an instance of {@link ConsultarHotelAlteradoResponse }
     * 
     */
    public ConsultarHotelAlteradoResponse createConsultarHotelAlteradoResponse() {
        return new ConsultarHotelAlteradoResponse();
    }

    /**
     * Create an instance of {@link ConsultarHotelFoto }
     * 
     */
    public ConsultarHotelFoto createConsultarHotelFoto() {
        return new ConsultarHotelFoto();
    }

    /**
     * Create an instance of {@link AtualizarStatusReservaIntegracao }
     * 
     */
    public AtualizarStatusReservaIntegracao createAtualizarStatusReservaIntegracao() {
        return new AtualizarStatusReservaIntegracao();
    }

    /**
     * Create an instance of {@link AtualizarStatusReservaIntegracaoResponse }
     * 
     */
    public AtualizarStatusReservaIntegracaoResponse createAtualizarStatusReservaIntegracaoResponse() {
        return new AtualizarStatusReservaIntegracaoResponse();
    }

    /**
     * Create an instance of {@link ImportarReservaExternaResponse }
     * 
     */
    public ImportarReservaExternaResponse createImportarReservaExternaResponse() {
        return new ImportarReservaExternaResponse();
    }

    /**
     * Create an instance of {@link ImportarReservaExterna }
     * 
     */
    public ImportarReservaExterna createImportarReservaExterna() {
        return new ImportarReservaExterna();
    }

    /**
     * Create an instance of {@link ConsultarResponse }
     * 
     */
    public ConsultarResponse createConsultarResponse() {
        return new ConsultarResponse();
    }

    /**
     * Create an instance of {@link ConsultarHotelDestaque }
     * 
     */
    public ConsultarHotelDestaque createConsultarHotelDestaque() {
        return new ConsultarHotelDestaque();
    }

    /**
     * Create an instance of {@link ConsultarHotelAlterado }
     * 
     */
    public ConsultarHotelAlterado createConsultarHotelAlterado() {
        return new ConsultarHotelAlterado();
    }

    /**
     * Create an instance of {@link ReservarHotelResponse }
     * 
     */
    public ReservarHotelResponse createReservarHotelResponse() {
        return new ReservarHotelResponse();
    }

    /**
     * Create an instance of {@link ConsultarHotelDestaqueResponse }
     * 
     */
    public ConsultarHotelDestaqueResponse createConsultarHotelDestaqueResponse() {
        return new ConsultarHotelDestaqueResponse();
    }

    /**
     * Create an instance of {@link ConsultarHotelInformacaoResponse }
     * 
     */
    public ConsultarHotelInformacaoResponse createConsultarHotelInformacaoResponse() {
        return new ConsultarHotelInformacaoResponse();
    }

    /**
     * Create an instance of {@link ConsultarHotelFotoResponse }
     * 
     */
    public ConsultarHotelFotoResponse createConsultarHotelFotoResponse() {
        return new ConsultarHotelFotoResponse();
    }

    /**
     * Create an instance of {@link ConsultarHotelResponse }
     * 
     */
    public ConsultarHotelResponse createConsultarHotelResponse() {
        return new ConsultarHotelResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CosultaFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "consultaFiltro", scope = ContadorHoteisProcessados.class)
    public JAXBElement<CosultaFiltro> createContadorHoteisProcessadosConsultaFiltro(CosultaFiltro value) {
        return new JAXBElement<CosultaFiltro>(_ContadorHoteisProcessadosConsultaFiltro_QNAME, CosultaFiltro.class, ContadorHoteisProcessados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CosultaFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "consultaFiltro", scope = Retornar.class)
    public JAXBElement<CosultaFiltro> createRetornarConsultaFiltro(CosultaFiltro value) {
        return new JAXBElement<CosultaFiltro>(_ContadorHoteisProcessadosConsultaFiltro_QNAME, CosultaFiltro.class, Retornar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaRetorno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReservarHotelResult", scope = ReservarHotelResponse.class)
    public JAXBElement<ReservaRetorno> createReservarHotelResponseReservarHotelResult(ReservaRetorno value) {
        return new JAXBElement<ReservaRetorno>(_ReservarHotelResponseReservarHotelResult_QNAME, ReservaRetorno.class, ReservarHotelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelDestaque }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarHotelDestaqueResult", scope = ConsultarHotelDestaqueResponse.class)
    public JAXBElement<ArrayOfHotelDestaque> createConsultarHotelDestaqueResponseConsultarHotelDestaqueResult(ArrayOfHotelDestaque value) {
        return new JAXBElement<ArrayOfHotelDestaque>(_ConsultarHotelDestaqueResponseConsultarHotelDestaqueResult_QNAME, ArrayOfHotelDestaque.class, ConsultarHotelDestaqueResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CosultaInformacaoFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "consultaFiltro", scope = ConsultarHotelInformacao.class)
    public JAXBElement<CosultaInformacaoFiltro> createConsultarHotelInformacaoConsultaFiltro(CosultaInformacaoFiltro value) {
        return new JAXBElement<CosultaInformacaoFiltro>(_ContadorHoteisProcessadosConsultaFiltro_QNAME, CosultaInformacaoFiltro.class, ConsultarHotelInformacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelFoto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarHotelFotoResult", scope = ConsultarHotelFotoResponse.class)
    public JAXBElement<ArrayOfHotelFoto> createConsultarHotelFotoResponseConsultarHotelFotoResult(ArrayOfHotelFoto value) {
        return new JAXBElement<ArrayOfHotelFoto>(_ConsultarHotelFotoResponseConsultarHotelFotoResult_QNAME, ArrayOfHotelFoto.class, ConsultarHotelFotoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelRetorno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarResult", scope = RetornarResponse.class)
    public JAXBElement<HotelRetorno> createRetornarResponseRetornarResult(HotelRetorno value) {
        return new JAXBElement<HotelRetorno>(_RetornarResponseRetornarResult_QNAME, HotelRetorno.class, RetornarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarHotelAlteradoResult", scope = ConsultarHotelAlteradoResponse.class)
    public JAXBElement<ArrayOfHotelCodigo> createConsultarHotelAlteradoResponseConsultarHotelAlteradoResult(ArrayOfHotelCodigo value) {
        return new JAXBElement<ArrayOfHotelCodigo>(_ConsultarHotelAlteradoResponseConsultarHotelAlteradoResult_QNAME, ArrayOfHotelCodigo.class, ConsultarHotelAlteradoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Atualizacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ImportarReservaExternaResult", scope = ImportarReservaExternaResponse.class)
    public JAXBElement<Atualizacao> createImportarReservaExternaResponseImportarReservaExternaResult(Atualizacao value) {
        return new JAXBElement<Atualizacao>(_ImportarReservaExternaResponseImportarReservaExternaResult_QNAME, Atualizacao.class, ImportarReservaExternaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CosultaFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "consultaFiltro", scope = Consultar.class)
    public JAXBElement<CosultaFiltro> createConsultarConsultaFiltro(CosultaFiltro value) {
        return new JAXBElement<CosultaFiltro>(_ContadorHoteisProcessadosConsultaFiltro_QNAME, CosultaFiltro.class, Consultar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFacilidadeFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cosultaFacilidadeFiltro", scope = ConsultarHotelFacilidade.class)
    public JAXBElement<ConsultaFacilidadeFiltro> createConsultarHotelFacilidadeCosultaFacilidadeFiltro(ConsultaFacilidadeFiltro value) {
        return new JAXBElement<ConsultaFacilidadeFiltro>(_ConsultarHotelFacilidadeCosultaFacilidadeFiltro_QNAME, ConsultaFacilidadeFiltro.class, ConsultarHotelFacilidade.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelDestaque }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotelDestaque", scope = ConsultarHotelDestaque.class)
    public JAXBElement<HotelDestaque> createConsultarHotelDestaqueHotelDestaque(HotelDestaque value) {
        return new JAXBElement<HotelDestaque>(_ConsultarHotelDestaqueHotelDestaque_QNAME, HotelDestaque.class, ConsultarHotelDestaque.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelRetorno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarResult", scope = ConsultarResponse.class)
    public JAXBElement<HotelRetorno> createConsultarResponseConsultarResult(HotelRetorno value) {
        return new JAXBElement<HotelRetorno>(_ConsultarResponseConsultarResult_QNAME, HotelRetorno.class, ConsultarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarHotelInformacaoResult", scope = ConsultarHotelInformacaoResponse.class)
    public JAXBElement<ArrayOfHotel> createConsultarHotelInformacaoResponseConsultarHotelInformacaoResult(ArrayOfHotel value) {
        return new JAXBElement<ArrayOfHotel>(_ConsultarHotelInformacaoResponseConsultarHotelInformacaoResult_QNAME, ArrayOfHotel.class, ConsultarHotelInformacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelamentoRetorno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelarResult", scope = CancelarResponse.class)
    public JAXBElement<CancelamentoRetorno> createCancelarResponseCancelarResult(CancelamentoRetorno value) {
        return new JAXBElement<CancelamentoRetorno>(_CancelarResponseCancelarResult_QNAME, CancelamentoRetorno.class, CancelarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Atualizacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "atualizacao", scope = ImportarReservaExterna.class)
    public JAXBElement<Atualizacao> createImportarReservaExternaAtualizacao(Atualizacao value) {
        return new JAXBElement<Atualizacao>(_ImportarReservaExternaAtualizacao_QNAME, Atualizacao.class, ImportarReservaExterna.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelamentoParametro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cancelamentoParametro", scope = Cancelar.class)
    public JAXBElement<CancelamentoParametro> createCancelarCancelamentoParametro(CancelamentoParametro value) {
        return new JAXBElement<CancelamentoParametro>(_CancelarCancelamentoParametro_QNAME, CancelamentoParametro.class, Cancelar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Atualizacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AtualizarStatusReservaIntegracaoResult", scope = AtualizarStatusReservaIntegracaoResponse.class)
    public JAXBElement<Atualizacao> createAtualizarStatusReservaIntegracaoResponseAtualizarStatusReservaIntegracaoResult(Atualizacao value) {
        return new JAXBElement<Atualizacao>(_AtualizarStatusReservaIntegracaoResponseAtualizarStatusReservaIntegracaoResult_QNAME, Atualizacao.class, AtualizarStatusReservaIntegracaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaParametro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "reservaParametro", scope = ReservarHotel.class)
    public JAXBElement<ReservaParametro> createReservarHotelReservaParametro(ReservaParametro value) {
        return new JAXBElement<ReservaParametro>(_ReservarHotelReservaParametro_QNAME, ReservaParametro.class, ReservarHotel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelLocalizacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarLocalizacaoResult", scope = ConsultarLocalizacaoResponse.class)
    public JAXBElement<ArrayOfHotelLocalizacao> createConsultarLocalizacaoResponseConsultarLocalizacaoResult(ArrayOfHotelLocalizacao value) {
        return new JAXBElement<ArrayOfHotelLocalizacao>(_ConsultarLocalizacaoResponseConsultarLocalizacaoResult_QNAME, ArrayOfHotelLocalizacao.class, ConsultarLocalizacaoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelLocalizacaoFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotelLocalizacaoFiltro", scope = ConsultarLocalizacao.class)
    public JAXBElement<HotelLocalizacaoFiltro> createConsultarLocalizacaoHotelLocalizacaoFiltro(HotelLocalizacaoFiltro value) {
        return new JAXBElement<HotelLocalizacaoFiltro>(_ConsultarLocalizacaoHotelLocalizacaoFiltro_QNAME, HotelLocalizacaoFiltro.class, ConsultarLocalizacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelAlteradoFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotelAlteradoFiltro", scope = ConsultarHotelAlterado.class)
    public JAXBElement<HotelAlteradoFiltro> createConsultarHotelAlteradoHotelAlteradoFiltro(HotelAlteradoFiltro value) {
        return new JAXBElement<HotelAlteradoFiltro>(_ConsultarHotelAlteradoHotelAlteradoFiltro_QNAME, HotelAlteradoFiltro.class, ConsultarHotelAlterado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotelFacilidade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarHotelFacilidadeResult", scope = ConsultarHotelFacilidadeResponse.class)
    public JAXBElement<ArrayOfHotelFacilidade> createConsultarHotelFacilidadeResponseConsultarHotelFacilidadeResult(ArrayOfHotelFacilidade value) {
        return new JAXBElement<ArrayOfHotelFacilidade>(_ConsultarHotelFacilidadeResponseConsultarHotelFacilidadeResult_QNAME, ArrayOfHotelFacilidade.class, ConsultarHotelFacilidadeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Atualizacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "atualizacao", scope = AtualizarStatusReservaIntegracao.class)
    public JAXBElement<Atualizacao> createAtualizarStatusReservaIntegracaoAtualizacao(Atualizacao value) {
        return new JAXBElement<Atualizacao>(_ImportarReservaExternaAtualizacao_QNAME, Atualizacao.class, AtualizarStatusReservaIntegracao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelAlteradoConfirmacaoFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "hotelAlteradoConfirmacaoFiltro", scope = ConfirmarHotelAlterado.class)
    public JAXBElement<HotelAlteradoConfirmacaoFiltro> createConfirmarHotelAlteradoHotelAlteradoConfirmacaoFiltro(HotelAlteradoConfirmacaoFiltro value) {
        return new JAXBElement<HotelAlteradoConfirmacaoFiltro>(_ConfirmarHotelAlteradoHotelAlteradoConfirmacaoFiltro_QNAME, HotelAlteradoConfirmacaoFiltro.class, ConfirmarHotelAlterado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConsultarHotelResult", scope = ConsultarHotelResponse.class)
    public JAXBElement<ArrayOfHotel> createConsultarHotelResponseConsultarHotelResult(ArrayOfHotel value) {
        return new JAXBElement<ArrayOfHotel>(_ConsultarHotelResponseConsultarHotelResult_QNAME, ArrayOfHotel.class, ConsultarHotelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CosultaFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "consultaFiltro", scope = VerificarConsultaFinalizada.class)
    public JAXBElement<CosultaFiltro> createVerificarConsultaFinalizadaConsultaFiltro(CosultaFiltro value) {
        return new JAXBElement<CosultaFiltro>(_ContadorHoteisProcessadosConsultaFiltro_QNAME, CosultaFiltro.class, VerificarConsultaFinalizada.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaFotoFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cosultaFotoFiltro", scope = ConsultarHotelFoto.class)
    public JAXBElement<ConsultaFotoFiltro> createConsultarHotelFotoCosultaFotoFiltro(ConsultaFotoFiltro value) {
        return new JAXBElement<ConsultaFotoFiltro>(_ConsultarHotelFotoCosultaFotoFiltro_QNAME, ConsultaFotoFiltro.class, ConsultarHotelFoto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelAlteradoConfirmacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ConfirmarHotelAlteradoResult", scope = ConfirmarHotelAlteradoResponse.class)
    public JAXBElement<HotelAlteradoConfirmacao> createConfirmarHotelAlteradoResponseConfirmarHotelAlteradoResult(HotelAlteradoConfirmacao value) {
        return new JAXBElement<HotelAlteradoConfirmacao>(_ConfirmarHotelAlteradoResponseConfirmarHotelAlteradoResult_QNAME, HotelAlteradoConfirmacao.class, ConfirmarHotelAlteradoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CosultaFiltro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "consultaFiltro", scope = ConsultarHotel.class)
    public JAXBElement<CosultaFiltro> createConsultarHotelConsultaFiltro(CosultaFiltro value) {
        return new JAXBElement<CosultaFiltro>(_ContadorHoteisProcessadosConsultaFiltro_QNAME, CosultaFiltro.class, ConsultarHotel.class, value);
    }

}
