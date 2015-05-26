
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.brokerplatform_core_model.TipPersoana;


/**
 * <p>Java class for Asigurat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Asigurat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Adresa" type="{http://www.platforma-broker.ro/ws/travel/types/}Adresa" minOccurs="0"/>
 *         &lt;element name="AreAltaBoala" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AreBoalaBoalaAparatRespirator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AreBoalaCardio" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AreBoalaDefinitiva" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AreBoalaGradInvaliditate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AreBoalaInterna" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AreBoalaNeuro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CNP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DomeniuActivitateAsigurat" type="{http://www.platforma-broker.ro/ws/travel/types/}DomeniuActivitate" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EsteElevSauStudent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumarFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumarTelefon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prenume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerieSiNumarPasaport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StareSanatate" type="{http://www.platforma-broker.ro/ws/travel/types/}StareSanatate"/>
 *         &lt;element name="TipPersoanaAsigurat" type="{http://schemas.datacontract.org/2004/07/BrokerPlatform.Core.Model.Common}TipPersoana" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asigurat", propOrder = {
    "adresa",
    "areAltaBoala",
    "areBoalaBoalaAparatRespirator",
    "areBoalaCardio",
    "areBoalaDefinitiva",
    "areBoalaGradInvaliditate",
    "areBoalaInterna",
    "areBoalaNeuro",
    "cnp",
    "domeniuActivitateAsigurat",
    "email",
    "esteElevSauStudent",
    "numarFax",
    "numarTelefon",
    "nume",
    "prenume",
    "serieSiNumarPasaport",
    "stareSanatate",
    "tipPersoanaAsigurat"
})
public class Asigurat {

    @XmlElementRef(name = "Adresa", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Adresa> adresa;
    @XmlElement(name = "AreAltaBoala")
    protected boolean areAltaBoala;
    @XmlElement(name = "AreBoalaBoalaAparatRespirator")
    protected boolean areBoalaBoalaAparatRespirator;
    @XmlElement(name = "AreBoalaCardio")
    protected boolean areBoalaCardio;
    @XmlElement(name = "AreBoalaDefinitiva")
    protected boolean areBoalaDefinitiva;
    @XmlElement(name = "AreBoalaGradInvaliditate")
    protected boolean areBoalaGradInvaliditate;
    @XmlElement(name = "AreBoalaInterna")
    protected boolean areBoalaInterna;
    @XmlElement(name = "AreBoalaNeuro")
    protected boolean areBoalaNeuro;
    @XmlElement(name = "CNP", required = true, nillable = true)
    protected String cnp;
    @XmlElement(name = "DomeniuActivitateAsigurat")
    @XmlSchemaType(name = "string")
    protected DomeniuActivitate domeniuActivitateAsigurat;
    @XmlElementRef(name = "Email", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "EsteElevSauStudent", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> esteElevSauStudent;
    @XmlElementRef(name = "NumarFax", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numarFax;
    @XmlElementRef(name = "NumarTelefon", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numarTelefon;
    @XmlElementRef(name = "Nume", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nume;
    @XmlElementRef(name = "Prenume", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prenume;
    @XmlElementRef(name = "SerieSiNumarPasaport", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serieSiNumarPasaport;
    @XmlElement(name = "StareSanatate", required = true)
    @XmlSchemaType(name = "string")
    protected StareSanatate stareSanatate;
    @XmlElement(name = "TipPersoanaAsigurat")
    @XmlSchemaType(name = "string")
    protected TipPersoana tipPersoanaAsigurat;

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Adresa }{@code >}
     *     
     */
    public JAXBElement<Adresa> getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Adresa }{@code >}
     *     
     */
    public void setAdresa(JAXBElement<Adresa> value) {
        this.adresa = value;
    }

    /**
     * Gets the value of the areAltaBoala property.
     * 
     */
    public boolean isAreAltaBoala() {
        return areAltaBoala;
    }

    /**
     * Sets the value of the areAltaBoala property.
     * 
     */
    public void setAreAltaBoala(boolean value) {
        this.areAltaBoala = value;
    }

    /**
     * Gets the value of the areBoalaBoalaAparatRespirator property.
     * 
     */
    public boolean isAreBoalaBoalaAparatRespirator() {
        return areBoalaBoalaAparatRespirator;
    }

    /**
     * Sets the value of the areBoalaBoalaAparatRespirator property.
     * 
     */
    public void setAreBoalaBoalaAparatRespirator(boolean value) {
        this.areBoalaBoalaAparatRespirator = value;
    }

    /**
     * Gets the value of the areBoalaCardio property.
     * 
     */
    public boolean isAreBoalaCardio() {
        return areBoalaCardio;
    }

    /**
     * Sets the value of the areBoalaCardio property.
     * 
     */
    public void setAreBoalaCardio(boolean value) {
        this.areBoalaCardio = value;
    }

    /**
     * Gets the value of the areBoalaDefinitiva property.
     * 
     */
    public boolean isAreBoalaDefinitiva() {
        return areBoalaDefinitiva;
    }

    /**
     * Sets the value of the areBoalaDefinitiva property.
     * 
     */
    public void setAreBoalaDefinitiva(boolean value) {
        this.areBoalaDefinitiva = value;
    }

    /**
     * Gets the value of the areBoalaGradInvaliditate property.
     * 
     */
    public boolean isAreBoalaGradInvaliditate() {
        return areBoalaGradInvaliditate;
    }

    /**
     * Sets the value of the areBoalaGradInvaliditate property.
     * 
     */
    public void setAreBoalaGradInvaliditate(boolean value) {
        this.areBoalaGradInvaliditate = value;
    }

    /**
     * Gets the value of the areBoalaInterna property.
     * 
     */
    public boolean isAreBoalaInterna() {
        return areBoalaInterna;
    }

    /**
     * Sets the value of the areBoalaInterna property.
     * 
     */
    public void setAreBoalaInterna(boolean value) {
        this.areBoalaInterna = value;
    }

    /**
     * Gets the value of the areBoalaNeuro property.
     * 
     */
    public boolean isAreBoalaNeuro() {
        return areBoalaNeuro;
    }

    /**
     * Sets the value of the areBoalaNeuro property.
     * 
     */
    public void setAreBoalaNeuro(boolean value) {
        this.areBoalaNeuro = value;
    }

    /**
     * Gets the value of the cnp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNP() {
        return cnp;
    }

    /**
     * Sets the value of the cnp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNP(String value) {
        this.cnp = value;
    }

    /**
     * Gets the value of the domeniuActivitateAsigurat property.
     * 
     * @return
     *     possible object is
     *     {@link DomeniuActivitate }
     *     
     */
    public DomeniuActivitate getDomeniuActivitateAsigurat() {
        return domeniuActivitateAsigurat;
    }

    /**
     * Sets the value of the domeniuActivitateAsigurat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomeniuActivitate }
     *     
     */
    public void setDomeniuActivitateAsigurat(DomeniuActivitate value) {
        this.domeniuActivitateAsigurat = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the esteElevSauStudent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEsteElevSauStudent() {
        return esteElevSauStudent;
    }

    /**
     * Sets the value of the esteElevSauStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEsteElevSauStudent(JAXBElement<Boolean> value) {
        this.esteElevSauStudent = value;
    }

    /**
     * Gets the value of the numarFax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumarFax() {
        return numarFax;
    }

    /**
     * Sets the value of the numarFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumarFax(JAXBElement<String> value) {
        this.numarFax = value;
    }

    /**
     * Gets the value of the numarTelefon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumarTelefon() {
        return numarTelefon;
    }

    /**
     * Sets the value of the numarTelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumarTelefon(JAXBElement<String> value) {
        this.numarTelefon = value;
    }

    /**
     * Gets the value of the nume property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNume() {
        return nume;
    }

    /**
     * Sets the value of the nume property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNume(JAXBElement<String> value) {
        this.nume = value;
    }

    /**
     * Gets the value of the prenume property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrenume() {
        return prenume;
    }

    /**
     * Sets the value of the prenume property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrenume(JAXBElement<String> value) {
        this.prenume = value;
    }

    /**
     * Gets the value of the serieSiNumarPasaport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerieSiNumarPasaport() {
        return serieSiNumarPasaport;
    }

    /**
     * Sets the value of the serieSiNumarPasaport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerieSiNumarPasaport(JAXBElement<String> value) {
        this.serieSiNumarPasaport = value;
    }

    /**
     * Gets the value of the stareSanatate property.
     * 
     * @return
     *     possible object is
     *     {@link StareSanatate }
     *     
     */
    public StareSanatate getStareSanatate() {
        return stareSanatate;
    }

    /**
     * Sets the value of the stareSanatate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StareSanatate }
     *     
     */
    public void setStareSanatate(StareSanatate value) {
        this.stareSanatate = value;
    }

    /**
     * Gets the value of the tipPersoanaAsigurat property.
     * 
     * @return
     *     possible object is
     *     {@link TipPersoana }
     *     
     */
    public TipPersoana getTipPersoanaAsigurat() {
        return tipPersoanaAsigurat;
    }

    /**
     * Sets the value of the tipPersoanaAsigurat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipPersoana }
     *     
     */
    public void setTipPersoanaAsigurat(TipPersoana value) {
        this.tipPersoanaAsigurat = value;
    }

}
