
package ro.platforma_broker.ws.travel.types;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelCotatie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelCotatie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DurataApelServiciu" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EmailAgentVoucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MesajEroare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaRON" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrimaRedusa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProdusTravel" type="{http://www.platforma-broker.ro/ws/travel/types/}ProdusTravel" minOccurs="0"/>
 *         &lt;element name="ReducereVoucher" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SumaAsigurataEUR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelCotatie", propOrder = {
    "durataApelServiciu",
    "emailAgentVoucher",
    "mesajEroare",
    "primaRON",
    "primaRedusa",
    "produsTravel",
    "reducereVoucher",
    "sumaAsigurataEUR"
})
public class TravelCotatie {

    @XmlElement(name = "DurataApelServiciu")
    protected Double durataApelServiciu;
    @XmlElementRef(name = "EmailAgentVoucher", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAgentVoucher;
    @XmlElementRef(name = "MesajEroare", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mesajEroare;
    @XmlElementRef(name = "PrimaRON", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> primaRON;
    @XmlElement(name = "PrimaRedusa")
    protected BigDecimal primaRedusa;
    @XmlElement(name = "ProdusTravel")
    @XmlSchemaType(name = "string")
    protected ProdusTravel produsTravel;
    @XmlElement(name = "ReducereVoucher")
    protected BigDecimal reducereVoucher;
    @XmlElementRef(name = "SumaAsigurataEUR", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> sumaAsigurataEUR;

    /**
     * Gets the value of the durataApelServiciu property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDurataApelServiciu() {
        return durataApelServiciu;
    }

    /**
     * Sets the value of the durataApelServiciu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDurataApelServiciu(Double value) {
        this.durataApelServiciu = value;
    }

    /**
     * Gets the value of the emailAgentVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAgentVoucher() {
        return emailAgentVoucher;
    }

    /**
     * Sets the value of the emailAgentVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAgentVoucher(JAXBElement<String> value) {
        this.emailAgentVoucher = value;
    }

    /**
     * Gets the value of the mesajEroare property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMesajEroare() {
        return mesajEroare;
    }

    /**
     * Sets the value of the mesajEroare property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMesajEroare(JAXBElement<String> value) {
        this.mesajEroare = value;
    }

    /**
     * Gets the value of the primaRON property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrimaRON() {
        return primaRON;
    }

    /**
     * Sets the value of the primaRON property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrimaRON(JAXBElement<BigDecimal> value) {
        this.primaRON = value;
    }

    /**
     * Gets the value of the primaRedusa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrimaRedusa() {
        return primaRedusa;
    }

    /**
     * Sets the value of the primaRedusa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrimaRedusa(BigDecimal value) {
        this.primaRedusa = value;
    }

    /**
     * Gets the value of the produsTravel property.
     * 
     * @return
     *     possible object is
     *     {@link ProdusTravel }
     *     
     */
    public ProdusTravel getProdusTravel() {
        return produsTravel;
    }

    /**
     * Sets the value of the produsTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdusTravel }
     *     
     */
    public void setProdusTravel(ProdusTravel value) {
        this.produsTravel = value;
    }

    /**
     * Gets the value of the reducereVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReducereVoucher() {
        return reducereVoucher;
    }

    /**
     * Sets the value of the reducereVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReducereVoucher(BigDecimal value) {
        this.reducereVoucher = value;
    }

    /**
     * Gets the value of the sumaAsigurataEUR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSumaAsigurataEUR() {
        return sumaAsigurataEUR;
    }

    /**
     * Sets the value of the sumaAsigurataEUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSumaAsigurataEUR(JAXBElement<BigDecimal> value) {
        this.sumaAsigurataEUR = value;
    }

}
