
package ro.platforma_broker.ws.travel.types;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.brokerplatform_ws_travel.PlanCalatorieAllianz;
import org.datacontract.schemas._2004._07.brokerplatform_ws_travel.PlanCalatorieCreditEurope;


/**
 * <p>Java class for TravelCotatieRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelCotatieRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcoperiereBagajeInEuro" type="{http://www.platforma-broker.ro/ws/travel/types/}AcoperireBagaje" minOccurs="0"/>
 *         &lt;element name="AcoperireBunuriElectroniceInEuro" type="{http://www.platforma-broker.ro/ws/travel/types/}AcoperireBunuriElectronice" minOccurs="0"/>
 *         &lt;element name="AcoperireCalatorie" type="{http://www.platforma-broker.ro/ws/travel/types/}AcoperireCalatorie"/>
 *         &lt;element name="AllianzProduct" type="{http://schemas.datacontract.org/2004/07/BrokerPlatform.Ws.Travel.Dto}PlanCalatorieAllianz" minOccurs="0"/>
 *         &lt;element name="AltaSumaAsigurataInEuro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Asigurat" type="{http://www.platforma-broker.ro/ws/travel/types/}Asigurat"/>
 *         &lt;element name="CodVoucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditEruopeProduct" type="{http://schemas.datacontract.org/2004/07/BrokerPlatform.Ws.Travel.Dto}PlanCalatorieCreditEurope" minOccurs="0"/>
 *         &lt;element name="DataInceputValabilitate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DataSfarsitValabilitate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExtindereAcoperireSporturiPericuloase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PlanCalatorieATEInsurance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Produse" type="{http://www.platforma-broker.ro/ws/travel/types/}ArrayOfProdusTravel"/>
 *         &lt;element name="ScopCalatorie" type="{http://www.platforma-broker.ro/ws/travel/types/}ScopCalatorie"/>
 *         &lt;element name="SumaAsigurataInEuro" type="{http://www.platforma-broker.ro/ws/travel/types/}SumaAsigurata"/>
 *         &lt;element name="SumaAsigurataRiscSuplimentarLegalInEuro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SumaAsigurataRiscSuplimentarStornoInEuro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaraDestinatieFinala" type="{http://www.platforma-broker.ro/ws/travel/types/}Tara"/>
 *         &lt;element name="TipCalatorie" type="{http://www.platforma-broker.ro/ws/travel/types/}TipCalatorie"/>
 *         &lt;element name="TipPolita" type="{http://www.platforma-broker.ro/ws/travel/types/}TipPolita"/>
 *         &lt;element name="TipReducere" type="{http://www.platforma-broker.ro/ws/travel/types/}TipReducere" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelCotatieRequest", propOrder = {
    "acoperiereBagajeInEuro",
    "acoperireBunuriElectroniceInEuro",
    "acoperireCalatorie",
    "allianzProduct",
    "altaSumaAsigurataInEuro",
    "asigurat",
    "codVoucher",
    "creditEruopeProduct",
    "dataInceputValabilitate",
    "dataSfarsitValabilitate",
    "extindereAcoperireSporturiPericuloase",
    "planCalatorieATEInsurance",
    "produse",
    "scopCalatorie",
    "sumaAsigurataInEuro",
    "sumaAsigurataRiscSuplimentarLegalInEuro",
    "sumaAsigurataRiscSuplimentarStornoInEuro",
    "taraDestinatieFinala",
    "tipCalatorie",
    "tipPolita",
    "tipReducere"
})
public class TravelCotatieRequest {

    @XmlElement(name = "AcoperiereBagajeInEuro")
    protected String acoperiereBagajeInEuro;
    @XmlElement(name = "AcoperireBunuriElectroniceInEuro")
    protected String acoperireBunuriElectroniceInEuro;
    @XmlElement(name = "AcoperireCalatorie", required = true)
    @XmlSchemaType(name = "string")
    protected AcoperireCalatorie acoperireCalatorie;
    @XmlElementRef(name = "AllianzProduct", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<PlanCalatorieAllianz> allianzProduct;
    @XmlElementRef(name = "AltaSumaAsigurataInEuro", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> altaSumaAsigurataInEuro;
    @XmlElement(name = "Asigurat", required = true, nillable = true)
    protected Asigurat asigurat;
    @XmlElementRef(name = "CodVoucher", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codVoucher;
    @XmlElementRef(name = "CreditEruopeProduct", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<PlanCalatorieCreditEurope> creditEruopeProduct;
    @XmlElement(name = "DataInceputValabilitate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInceputValabilitate;
    @XmlElement(name = "DataSfarsitValabilitate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSfarsitValabilitate;
    @XmlElement(name = "ExtindereAcoperireSporturiPericuloase")
    protected Boolean extindereAcoperireSporturiPericuloase;
    @XmlElementRef(name = "PlanCalatorieATEInsurance", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> planCalatorieATEInsurance;
    @XmlElement(name = "Produse", required = true, nillable = true)
    protected ArrayOfProdusTravel produse;
    @XmlElement(name = "ScopCalatorie", required = true)
    @XmlSchemaType(name = "string")
    protected ScopCalatorie scopCalatorie;
    @XmlElement(name = "SumaAsigurataInEuro", required = true)
    protected String sumaAsigurataInEuro;
    @XmlElementRef(name = "SumaAsigurataRiscSuplimentarLegalInEuro", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sumaAsigurataRiscSuplimentarLegalInEuro;
    @XmlElementRef(name = "SumaAsigurataRiscSuplimentarStornoInEuro", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sumaAsigurataRiscSuplimentarStornoInEuro;
    @XmlElement(name = "TaraDestinatieFinala", required = true)
    @XmlSchemaType(name = "string")
    protected Tara taraDestinatieFinala;
    @XmlElement(name = "TipCalatorie", required = true)
    @XmlSchemaType(name = "string")
    protected TipCalatorie tipCalatorie;
    @XmlElement(name = "TipPolita", required = true)
    @XmlSchemaType(name = "string")
    protected TipPolita tipPolita;
    @XmlElement(name = "TipReducere")
    @XmlSchemaType(name = "string")
    protected TipReducere tipReducere;

    /**
     * Gets the value of the acoperiereBagajeInEuro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcoperiereBagajeInEuro() {
        return acoperiereBagajeInEuro;
    }

    /**
     * Sets the value of the acoperiereBagajeInEuro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcoperiereBagajeInEuro(String value) {
        this.acoperiereBagajeInEuro = value;
    }

    /**
     * Gets the value of the acoperireBunuriElectroniceInEuro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcoperireBunuriElectroniceInEuro() {
        return acoperireBunuriElectroniceInEuro;
    }

    /**
     * Sets the value of the acoperireBunuriElectroniceInEuro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcoperireBunuriElectroniceInEuro(String value) {
        this.acoperireBunuriElectroniceInEuro = value;
    }

    /**
     * Gets the value of the acoperireCalatorie property.
     * 
     * @return
     *     possible object is
     *     {@link AcoperireCalatorie }
     *     
     */
    public AcoperireCalatorie getAcoperireCalatorie() {
        return acoperireCalatorie;
    }

    /**
     * Sets the value of the acoperireCalatorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcoperireCalatorie }
     *     
     */
    public void setAcoperireCalatorie(AcoperireCalatorie value) {
        this.acoperireCalatorie = value;
    }

    /**
     * Gets the value of the allianzProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlanCalatorieAllianz }{@code >}
     *     
     */
    public JAXBElement<PlanCalatorieAllianz> getAllianzProduct() {
        return allianzProduct;
    }

    /**
     * Sets the value of the allianzProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlanCalatorieAllianz }{@code >}
     *     
     */
    public void setAllianzProduct(JAXBElement<PlanCalatorieAllianz> value) {
        this.allianzProduct = value;
    }

    /**
     * Gets the value of the altaSumaAsigurataInEuro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAltaSumaAsigurataInEuro() {
        return altaSumaAsigurataInEuro;
    }

    /**
     * Sets the value of the altaSumaAsigurataInEuro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAltaSumaAsigurataInEuro(JAXBElement<BigDecimal> value) {
        this.altaSumaAsigurataInEuro = value;
    }

    /**
     * Gets the value of the asigurat property.
     * 
     * @return
     *     possible object is
     *     {@link Asigurat }
     *     
     */
    public Asigurat getAsigurat() {
        return asigurat;
    }

    /**
     * Sets the value of the asigurat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asigurat }
     *     
     */
    public void setAsigurat(Asigurat value) {
        this.asigurat = value;
    }

    /**
     * Gets the value of the codVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodVoucher() {
        return codVoucher;
    }

    /**
     * Sets the value of the codVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodVoucher(JAXBElement<String> value) {
        this.codVoucher = value;
    }

    /**
     * Gets the value of the creditEruopeProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlanCalatorieCreditEurope }{@code >}
     *     
     */
    public JAXBElement<PlanCalatorieCreditEurope> getCreditEruopeProduct() {
        return creditEruopeProduct;
    }

    /**
     * Sets the value of the creditEruopeProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlanCalatorieCreditEurope }{@code >}
     *     
     */
    public void setCreditEruopeProduct(JAXBElement<PlanCalatorieCreditEurope> value) {
        this.creditEruopeProduct = value;
    }

    /**
     * Gets the value of the dataInceputValabilitate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInceputValabilitate() {
        return dataInceputValabilitate;
    }

    /**
     * Sets the value of the dataInceputValabilitate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInceputValabilitate(XMLGregorianCalendar value) {
        this.dataInceputValabilitate = value;
    }

    /**
     * Gets the value of the dataSfarsitValabilitate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSfarsitValabilitate() {
        return dataSfarsitValabilitate;
    }

    /**
     * Sets the value of the dataSfarsitValabilitate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSfarsitValabilitate(XMLGregorianCalendar value) {
        this.dataSfarsitValabilitate = value;
    }

    /**
     * Gets the value of the extindereAcoperireSporturiPericuloase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtindereAcoperireSporturiPericuloase() {
        return extindereAcoperireSporturiPericuloase;
    }

    /**
     * Sets the value of the extindereAcoperireSporturiPericuloase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtindereAcoperireSporturiPericuloase(Boolean value) {
        this.extindereAcoperireSporturiPericuloase = value;
    }

    /**
     * Gets the value of the planCalatorieATEInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPlanCalatorieATEInsurance() {
        return planCalatorieATEInsurance;
    }

    /**
     * Sets the value of the planCalatorieATEInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPlanCalatorieATEInsurance(JAXBElement<Integer> value) {
        this.planCalatorieATEInsurance = value;
    }

    /**
     * Gets the value of the produse property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProdusTravel }
     *     
     */
    public ArrayOfProdusTravel getProduse() {
        return produse;
    }

    /**
     * Sets the value of the produse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProdusTravel }
     *     
     */
    public void setProduse(ArrayOfProdusTravel value) {
        this.produse = value;
    }

    /**
     * Gets the value of the scopCalatorie property.
     * 
     * @return
     *     possible object is
     *     {@link ScopCalatorie }
     *     
     */
    public ScopCalatorie getScopCalatorie() {
        return scopCalatorie;
    }

    /**
     * Sets the value of the scopCalatorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopCalatorie }
     *     
     */
    public void setScopCalatorie(ScopCalatorie value) {
        this.scopCalatorie = value;
    }

    /**
     * Gets the value of the sumaAsigurataInEuro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumaAsigurataInEuro() {
        return sumaAsigurataInEuro;
    }

    /**
     * Sets the value of the sumaAsigurataInEuro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumaAsigurataInEuro(String value) {
        this.sumaAsigurataInEuro = value;
    }

    /**
     * Gets the value of the sumaAsigurataRiscSuplimentarLegalInEuro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSumaAsigurataRiscSuplimentarLegalInEuro() {
        return sumaAsigurataRiscSuplimentarLegalInEuro;
    }

    /**
     * Sets the value of the sumaAsigurataRiscSuplimentarLegalInEuro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSumaAsigurataRiscSuplimentarLegalInEuro(JAXBElement<BigDecimal> value) {
        this.sumaAsigurataRiscSuplimentarLegalInEuro = value;
    }

    /**
     * Gets the value of the sumaAsigurataRiscSuplimentarStornoInEuro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSumaAsigurataRiscSuplimentarStornoInEuro() {
        return sumaAsigurataRiscSuplimentarStornoInEuro;
    }

    /**
     * Sets the value of the sumaAsigurataRiscSuplimentarStornoInEuro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSumaAsigurataRiscSuplimentarStornoInEuro(JAXBElement<BigDecimal> value) {
        this.sumaAsigurataRiscSuplimentarStornoInEuro = value;
    }

    /**
     * Gets the value of the taraDestinatieFinala property.
     * 
     * @return
     *     possible object is
     *     {@link Tara }
     *     
     */
    public Tara getTaraDestinatieFinala() {
        return taraDestinatieFinala;
    }

    /**
     * Sets the value of the taraDestinatieFinala property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tara }
     *     
     */
    public void setTaraDestinatieFinala(Tara value) {
        this.taraDestinatieFinala = value;
    }

    /**
     * Gets the value of the tipCalatorie property.
     * 
     * @return
     *     possible object is
     *     {@link TipCalatorie }
     *     
     */
    public TipCalatorie getTipCalatorie() {
        return tipCalatorie;
    }

    /**
     * Sets the value of the tipCalatorie property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipCalatorie }
     *     
     */
    public void setTipCalatorie(TipCalatorie value) {
        this.tipCalatorie = value;
    }

    /**
     * Gets the value of the tipPolita property.
     * 
     * @return
     *     possible object is
     *     {@link TipPolita }
     *     
     */
    public TipPolita getTipPolita() {
        return tipPolita;
    }

    /**
     * Sets the value of the tipPolita property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipPolita }
     *     
     */
    public void setTipPolita(TipPolita value) {
        this.tipPolita = value;
    }

    /**
     * Gets the value of the tipReducere property.
     * 
     * @return
     *     possible object is
     *     {@link TipReducere }
     *     
     */
    public TipReducere getTipReducere() {
        return tipReducere;
    }

    /**
     * Sets the value of the tipReducere property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipReducere }
     *     
     */
    public void setTipReducere(TipReducere value) {
        this.tipReducere = value;
    }

}
