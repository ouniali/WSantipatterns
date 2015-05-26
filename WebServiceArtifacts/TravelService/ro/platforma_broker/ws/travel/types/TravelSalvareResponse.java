
package ro.platforma_broker.ws.travel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelSalvareResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelSalvareResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CerereSalvata" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmailAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MesajEroare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelSalvareResponse", propOrder = {
    "cerereSalvata",
    "emailAgent",
    "mesajEroare"
})
public class TravelSalvareResponse {

    @XmlElement(name = "CerereSalvata")
    protected Boolean cerereSalvata;
    @XmlElementRef(name = "EmailAgent", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAgent;
    @XmlElementRef(name = "MesajEroare", namespace = "http://www.platforma-broker.ro/ws/travel/types/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mesajEroare;

    /**
     * Gets the value of the cerereSalvata property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCerereSalvata() {
        return cerereSalvata;
    }

    /**
     * Sets the value of the cerereSalvata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCerereSalvata(Boolean value) {
        this.cerereSalvata = value;
    }

    /**
     * Gets the value of the emailAgent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAgent() {
        return emailAgent;
    }

    /**
     * Sets the value of the emailAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAgent(JAXBElement<String> value) {
        this.emailAgent = value;
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

}
