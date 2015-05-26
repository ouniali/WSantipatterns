
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
 *         &lt;element name="ModeCol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModeLiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NDossier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Langage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Ad1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Ad2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Ad3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Ad4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Tel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Tel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Langage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Ad1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Ad2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Ad3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Ad4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Tel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Tel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Poids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longueur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Taille" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NbColis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRT_Valeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRT_Devise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exp_Valeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exp_Devise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COL_Rel_Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COL_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIV_Rel_Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIV_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAvisage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TReprise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Montage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Instructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Security" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Texte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "modeCol",
    "modeLiv",
    "nDossier",
    "nClient",
    "expeLangage",
    "expeAd1",
    "expeAd2",
    "expeAd3",
    "expeAd4",
    "expeVille",
    "expeCP",
    "expePays",
    "expeTel1",
    "expeTel2",
    "expeMail",
    "destLangage",
    "destAd1",
    "destAd2",
    "destAd3",
    "destAd4",
    "destVille",
    "destCP",
    "destPays",
    "destTel1",
    "destTel2",
    "destMail",
    "poids",
    "longueur",
    "taille",
    "nbColis",
    "crtValeur",
    "crtDevise",
    "expValeur",
    "expDevise",
    "colRelPays",
    "colRel",
    "livRelPays",
    "livRel",
    "tAvisage",
    "tReprise",
    "montage",
    "trdv",
    "assurance",
    "instructions",
    "security",
    "texte"
})
@XmlRootElement(name = "WSI2_CreationEtiquette")
public class WSI2CreationEtiquette {

    @XmlElement(name = "Enseigne")
    protected String enseigne;
    @XmlElement(name = "ModeCol")
    protected String modeCol;
    @XmlElement(name = "ModeLiv")
    protected String modeLiv;
    @XmlElement(name = "NDossier")
    protected String nDossier;
    @XmlElement(name = "NClient")
    protected String nClient;
    @XmlElement(name = "Expe_Langage")
    protected String expeLangage;
    @XmlElement(name = "Expe_Ad1")
    protected String expeAd1;
    @XmlElement(name = "Expe_Ad2")
    protected String expeAd2;
    @XmlElement(name = "Expe_Ad3")
    protected String expeAd3;
    @XmlElement(name = "Expe_Ad4")
    protected String expeAd4;
    @XmlElement(name = "Expe_Ville")
    protected String expeVille;
    @XmlElement(name = "Expe_CP")
    protected String expeCP;
    @XmlElement(name = "Expe_Pays")
    protected String expePays;
    @XmlElement(name = "Expe_Tel1")
    protected String expeTel1;
    @XmlElement(name = "Expe_Tel2")
    protected String expeTel2;
    @XmlElement(name = "Expe_Mail")
    protected String expeMail;
    @XmlElement(name = "Dest_Langage")
    protected String destLangage;
    @XmlElement(name = "Dest_Ad1")
    protected String destAd1;
    @XmlElement(name = "Dest_Ad2")
    protected String destAd2;
    @XmlElement(name = "Dest_Ad3")
    protected String destAd3;
    @XmlElement(name = "Dest_Ad4")
    protected String destAd4;
    @XmlElement(name = "Dest_Ville")
    protected String destVille;
    @XmlElement(name = "Dest_CP")
    protected String destCP;
    @XmlElement(name = "Dest_Pays")
    protected String destPays;
    @XmlElement(name = "Dest_Tel1")
    protected String destTel1;
    @XmlElement(name = "Dest_Tel2")
    protected String destTel2;
    @XmlElement(name = "Dest_Mail")
    protected String destMail;
    @XmlElement(name = "Poids")
    protected String poids;
    @XmlElement(name = "Longueur")
    protected String longueur;
    @XmlElement(name = "Taille")
    protected String taille;
    @XmlElement(name = "NbColis")
    protected String nbColis;
    @XmlElement(name = "CRT_Valeur")
    protected String crtValeur;
    @XmlElement(name = "CRT_Devise")
    protected String crtDevise;
    @XmlElement(name = "Exp_Valeur")
    protected String expValeur;
    @XmlElement(name = "Exp_Devise")
    protected String expDevise;
    @XmlElement(name = "COL_Rel_Pays")
    protected String colRelPays;
    @XmlElement(name = "COL_Rel")
    protected String colRel;
    @XmlElement(name = "LIV_Rel_Pays")
    protected String livRelPays;
    @XmlElement(name = "LIV_Rel")
    protected String livRel;
    @XmlElement(name = "TAvisage")
    protected String tAvisage;
    @XmlElement(name = "TReprise")
    protected String tReprise;
    @XmlElement(name = "Montage")
    protected String montage;
    @XmlElement(name = "TRDV")
    protected String trdv;
    @XmlElement(name = "Assurance")
    protected String assurance;
    @XmlElement(name = "Instructions")
    protected String instructions;
    @XmlElement(name = "Security")
    protected String security;
    @XmlElement(name = "Texte")
    protected String texte;

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
     * Gets the value of the modeCol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeCol() {
        return modeCol;
    }

    /**
     * Sets the value of the modeCol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeCol(String value) {
        this.modeCol = value;
    }

    /**
     * Gets the value of the modeLiv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeLiv() {
        return modeLiv;
    }

    /**
     * Sets the value of the modeLiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeLiv(String value) {
        this.modeLiv = value;
    }

    /**
     * Gets the value of the nDossier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDossier() {
        return nDossier;
    }

    /**
     * Sets the value of the nDossier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDossier(String value) {
        this.nDossier = value;
    }

    /**
     * Gets the value of the nClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNClient() {
        return nClient;
    }

    /**
     * Sets the value of the nClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNClient(String value) {
        this.nClient = value;
    }

    /**
     * Gets the value of the expeLangage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeLangage() {
        return expeLangage;
    }

    /**
     * Sets the value of the expeLangage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeLangage(String value) {
        this.expeLangage = value;
    }

    /**
     * Gets the value of the expeAd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeAd1() {
        return expeAd1;
    }

    /**
     * Sets the value of the expeAd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeAd1(String value) {
        this.expeAd1 = value;
    }

    /**
     * Gets the value of the expeAd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeAd2() {
        return expeAd2;
    }

    /**
     * Sets the value of the expeAd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeAd2(String value) {
        this.expeAd2 = value;
    }

    /**
     * Gets the value of the expeAd3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeAd3() {
        return expeAd3;
    }

    /**
     * Sets the value of the expeAd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeAd3(String value) {
        this.expeAd3 = value;
    }

    /**
     * Gets the value of the expeAd4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeAd4() {
        return expeAd4;
    }

    /**
     * Sets the value of the expeAd4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeAd4(String value) {
        this.expeAd4 = value;
    }

    /**
     * Gets the value of the expeVille property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeVille() {
        return expeVille;
    }

    /**
     * Sets the value of the expeVille property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeVille(String value) {
        this.expeVille = value;
    }

    /**
     * Gets the value of the expeCP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeCP() {
        return expeCP;
    }

    /**
     * Sets the value of the expeCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeCP(String value) {
        this.expeCP = value;
    }

    /**
     * Gets the value of the expePays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpePays() {
        return expePays;
    }

    /**
     * Sets the value of the expePays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpePays(String value) {
        this.expePays = value;
    }

    /**
     * Gets the value of the expeTel1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeTel1() {
        return expeTel1;
    }

    /**
     * Sets the value of the expeTel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeTel1(String value) {
        this.expeTel1 = value;
    }

    /**
     * Gets the value of the expeTel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeTel2() {
        return expeTel2;
    }

    /**
     * Sets the value of the expeTel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeTel2(String value) {
        this.expeTel2 = value;
    }

    /**
     * Gets the value of the expeMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeMail() {
        return expeMail;
    }

    /**
     * Sets the value of the expeMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeMail(String value) {
        this.expeMail = value;
    }

    /**
     * Gets the value of the destLangage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestLangage() {
        return destLangage;
    }

    /**
     * Sets the value of the destLangage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestLangage(String value) {
        this.destLangage = value;
    }

    /**
     * Gets the value of the destAd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAd1() {
        return destAd1;
    }

    /**
     * Sets the value of the destAd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAd1(String value) {
        this.destAd1 = value;
    }

    /**
     * Gets the value of the destAd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAd2() {
        return destAd2;
    }

    /**
     * Sets the value of the destAd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAd2(String value) {
        this.destAd2 = value;
    }

    /**
     * Gets the value of the destAd3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAd3() {
        return destAd3;
    }

    /**
     * Sets the value of the destAd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAd3(String value) {
        this.destAd3 = value;
    }

    /**
     * Gets the value of the destAd4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAd4() {
        return destAd4;
    }

    /**
     * Sets the value of the destAd4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAd4(String value) {
        this.destAd4 = value;
    }

    /**
     * Gets the value of the destVille property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestVille() {
        return destVille;
    }

    /**
     * Sets the value of the destVille property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestVille(String value) {
        this.destVille = value;
    }

    /**
     * Gets the value of the destCP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCP() {
        return destCP;
    }

    /**
     * Sets the value of the destCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCP(String value) {
        this.destCP = value;
    }

    /**
     * Gets the value of the destPays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestPays() {
        return destPays;
    }

    /**
     * Sets the value of the destPays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestPays(String value) {
        this.destPays = value;
    }

    /**
     * Gets the value of the destTel1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestTel1() {
        return destTel1;
    }

    /**
     * Sets the value of the destTel1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestTel1(String value) {
        this.destTel1 = value;
    }

    /**
     * Gets the value of the destTel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestTel2() {
        return destTel2;
    }

    /**
     * Sets the value of the destTel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestTel2(String value) {
        this.destTel2 = value;
    }

    /**
     * Gets the value of the destMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestMail() {
        return destMail;
    }

    /**
     * Sets the value of the destMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestMail(String value) {
        this.destMail = value;
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
     * Gets the value of the longueur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongueur() {
        return longueur;
    }

    /**
     * Sets the value of the longueur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongueur(String value) {
        this.longueur = value;
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
     * Gets the value of the nbColis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbColis() {
        return nbColis;
    }

    /**
     * Sets the value of the nbColis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbColis(String value) {
        this.nbColis = value;
    }

    /**
     * Gets the value of the crtValeur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRTValeur() {
        return crtValeur;
    }

    /**
     * Sets the value of the crtValeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRTValeur(String value) {
        this.crtValeur = value;
    }

    /**
     * Gets the value of the crtDevise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRTDevise() {
        return crtDevise;
    }

    /**
     * Sets the value of the crtDevise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRTDevise(String value) {
        this.crtDevise = value;
    }

    /**
     * Gets the value of the expValeur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpValeur() {
        return expValeur;
    }

    /**
     * Sets the value of the expValeur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpValeur(String value) {
        this.expValeur = value;
    }

    /**
     * Gets the value of the expDevise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDevise() {
        return expDevise;
    }

    /**
     * Sets the value of the expDevise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDevise(String value) {
        this.expDevise = value;
    }

    /**
     * Gets the value of the colRelPays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLRelPays() {
        return colRelPays;
    }

    /**
     * Sets the value of the colRelPays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLRelPays(String value) {
        this.colRelPays = value;
    }

    /**
     * Gets the value of the colRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLRel() {
        return colRel;
    }

    /**
     * Sets the value of the colRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLRel(String value) {
        this.colRel = value;
    }

    /**
     * Gets the value of the livRelPays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIVRelPays() {
        return livRelPays;
    }

    /**
     * Sets the value of the livRelPays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIVRelPays(String value) {
        this.livRelPays = value;
    }

    /**
     * Gets the value of the livRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIVRel() {
        return livRel;
    }

    /**
     * Sets the value of the livRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIVRel(String value) {
        this.livRel = value;
    }

    /**
     * Gets the value of the tAvisage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAvisage() {
        return tAvisage;
    }

    /**
     * Sets the value of the tAvisage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAvisage(String value) {
        this.tAvisage = value;
    }

    /**
     * Gets the value of the tReprise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTReprise() {
        return tReprise;
    }

    /**
     * Sets the value of the tReprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTReprise(String value) {
        this.tReprise = value;
    }

    /**
     * Gets the value of the montage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontage() {
        return montage;
    }

    /**
     * Sets the value of the montage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontage(String value) {
        this.montage = value;
    }

    /**
     * Gets the value of the trdv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRDV() {
        return trdv;
    }

    /**
     * Sets the value of the trdv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRDV(String value) {
        this.trdv = value;
    }

    /**
     * Gets the value of the assurance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssurance() {
        return assurance;
    }

    /**
     * Sets the value of the assurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssurance(String value) {
        this.assurance = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Sets the value of the instructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructions(String value) {
        this.instructions = value;
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

    /**
     * Gets the value of the texte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Sets the value of the texte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexte(String value) {
        this.texte = value;
    }

}
