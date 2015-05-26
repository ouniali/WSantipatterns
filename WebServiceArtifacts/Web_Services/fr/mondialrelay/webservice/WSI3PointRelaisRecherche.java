
package fr.mondialrelay.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Enseigne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumPointRelais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Taille" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Poids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelaiEnvoi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RayonRecherche" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeActivite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Security" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "enseigne",
    "pays",
    "numPointRelais",
    "ville",
    "cp",
    "latitude",
    "longitude",
    "taille",
    "poids",
    "action",
    "delaiEnvoi",
    "rayonRecherche",
    "typeActivite",
    "nace",
    "security"
})
@XmlRootElement(name = "WSI3_PointRelais_Recherche")
public class WSI3PointRelaisRecherche {

    @XmlElement(name = "Enseigne")
    protected String enseigne;
    @XmlElement(name = "Pays")
    protected String pays;
    @XmlElement(name = "NumPointRelais")
    protected String numPointRelais;
    @XmlElement(name = "Ville")
    protected String ville;
    @XmlElement(name = "CP")
    protected String cp;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "Taille")
    protected String taille;
    @XmlElement(name = "Poids")
    protected String poids;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElement(name = "DelaiEnvoi")
    protected String delaiEnvoi;
    @XmlElement(name = "RayonRecherche")
    protected String rayonRecherche;
    @XmlElement(name = "TypeActivite")
    protected String typeActivite;
    @XmlElement(name = "NACE")
    protected String nace;
    @XmlElement(name = "Security")
    protected String security;

    /**
     * Gets the value of the enseigne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnseigne() {
        return enseigne;
    }

    /**
     * Sets the value of the enseigne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnseigne(String value) {
        this.enseigne = value;
    }

    /**
     * Gets the value of the pays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPays() {
        return pays;
    }

    /**
     * Sets the value of the pays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPays(String value) {
        this.pays = value;
    }

    /**
     * Gets the value of the numPointRelais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPointRelais() {
        return numPointRelais;
    }

    /**
     * Sets the value of the numPointRelais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPointRelais(String value) {
        this.numPointRelais = value;
    }

    /**
     * Gets the value of the ville property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * Sets the value of the ville property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

    /**
     * Gets the value of the cp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP() {
        return cp;
    }

    /**
     * Sets the value of the cp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP(String value) {
        this.cp = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the taille property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaille() {
        return taille;
    }

    /**
     * Sets the value of the taille property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaille(String value) {
        this.taille = value;
    }

    /**
     * Gets the value of the poids property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoids() {
        return poids;
    }

    /**
     * Sets the value of the poids property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoids(String value) {
        this.poids = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the delaiEnvoi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelaiEnvoi() {
        return delaiEnvoi;
    }

    /**
     * Sets the value of the delaiEnvoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelaiEnvoi(String value) {
        this.delaiEnvoi = value;
    }

    /**
     * Gets the value of the rayonRecherche property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRayonRecherche() {
        return rayonRecherche;
    }

    /**
     * Sets the value of the rayonRecherche property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRayonRecherche(String value) {
        this.rayonRecherche = value;
    }

    /**
     * Gets the value of the typeActivite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeActivite() {
        return typeActivite;
    }

    /**
     * Sets the value of the typeActivite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeActivite(String value) {
        this.typeActivite = value;
    }

    /**
     * Gets the value of the nace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNACE() {
        return nace;
    }

    /**
     * Sets the value of the nace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNACE(String value) {
        this.nace = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

}
