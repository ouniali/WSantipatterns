
package fr.mondialrelay.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ret_WSI2_sub_TracingColisDetaille complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_sub_TracingColisDetaille">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Libelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Heure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emplacement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Relais_Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Relais_Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_sub_TracingColisDetaille", propOrder = {
    "libelle",
    "date",
    "heure",
    "emplacement",
    "relaisNum",
    "relaisPays"
})
public class RetWSI2SubTracingColisDetaille {

    @XmlElement(name = "Libelle")
    protected String libelle;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Heure")
    protected String heure;
    @XmlElement(name = "Emplacement")
    protected String emplacement;
    @XmlElement(name = "Relais_Num")
    protected String relaisNum;
    @XmlElement(name = "Relais_Pays")
    protected String relaisPays;

    /**
     * Gets the value of the libelle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Sets the value of the libelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the heure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeure() {
        return heure;
    }

    /**
     * Sets the value of the heure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeure(String value) {
        this.heure = value;
    }

    /**
     * Gets the value of the emplacement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmplacement() {
        return emplacement;
    }

    /**
     * Sets the value of the emplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmplacement(String value) {
        this.emplacement = value;
    }

    /**
     * Gets the value of the relaisNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaisNum() {
        return relaisNum;
    }

    /**
     * Sets the value of the relaisNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaisNum(String value) {
        this.relaisNum = value;
    }

    /**
     * Gets the value of the relaisPays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaisPays() {
        return relaisPays;
    }

    /**
     * Sets the value of the relaisPays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaisPays(String value) {
        this.relaisPays = value;
    }

}
