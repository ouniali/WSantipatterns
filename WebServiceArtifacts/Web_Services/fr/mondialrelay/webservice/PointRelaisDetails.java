
package fr.mondialrelay.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointRelais_Details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointRelais_Details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Localisation1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Localisation2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeActivite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NACE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Horaires_Lundi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Mardi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Mercredi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Jeudi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Vendredi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Samedi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Dimanche" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Informations_Dispo" type="{http://www.mondialrelay.fr/webservice/}ArrayOfPeriode" minOccurs="0"/>
 *         &lt;element name="URL_Photo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL_Plan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointRelais_Details", propOrder = {
    "stat",
    "num",
    "lgAdr1",
    "lgAdr2",
    "lgAdr3",
    "lgAdr4",
    "cp",
    "ville",
    "pays",
    "localisation1",
    "localisation2",
    "latitude",
    "longitude",
    "typeActivite",
    "nace",
    "information",
    "horairesLundi",
    "horairesMardi",
    "horairesMercredi",
    "horairesJeudi",
    "horairesVendredi",
    "horairesSamedi",
    "horairesDimanche",
    "informationsDispo",
    "urlPhoto",
    "urlPlan",
    "distance"
})
public class PointRelaisDetails {

    @XmlElement(name = "STAT")
    protected String stat;
    @XmlElement(name = "Num")
    protected String num;
    @XmlElement(name = "LgAdr1")
    protected String lgAdr1;
    @XmlElement(name = "LgAdr2")
    protected String lgAdr2;
    @XmlElement(name = "LgAdr3")
    protected String lgAdr3;
    @XmlElement(name = "LgAdr4")
    protected String lgAdr4;
    @XmlElement(name = "CP")
    protected String cp;
    @XmlElement(name = "Ville")
    protected String ville;
    @XmlElement(name = "Pays")
    protected String pays;
    @XmlElement(name = "Localisation1")
    protected String localisation1;
    @XmlElement(name = "Localisation2")
    protected String localisation2;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longitude")
    protected String longitude;
    @XmlElement(name = "TypeActivite")
    protected String typeActivite;
    @XmlElement(name = "NACE")
    protected String nace;
    @XmlElement(name = "Information")
    protected String information;
    @XmlElement(name = "Horaires_Lundi")
    protected ArrayOfString horairesLundi;
    @XmlElement(name = "Horaires_Mardi")
    protected ArrayOfString horairesMardi;
    @XmlElement(name = "Horaires_Mercredi")
    protected ArrayOfString horairesMercredi;
    @XmlElement(name = "Horaires_Jeudi")
    protected ArrayOfString horairesJeudi;
    @XmlElement(name = "Horaires_Vendredi")
    protected ArrayOfString horairesVendredi;
    @XmlElement(name = "Horaires_Samedi")
    protected ArrayOfString horairesSamedi;
    @XmlElement(name = "Horaires_Dimanche")
    protected ArrayOfString horairesDimanche;
    @XmlElement(name = "Informations_Dispo")
    protected ArrayOfPeriode informationsDispo;
    @XmlElement(name = "URL_Photo")
    protected String urlPhoto;
    @XmlElement(name = "URL_Plan")
    protected String urlPlan;
    @XmlElement(name = "Distance")
    protected String distance;

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAT() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAT(String value) {
        this.stat = value;
    }

    /**
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * Gets the value of the lgAdr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr1() {
        return lgAdr1;
    }

    /**
     * Sets the value of the lgAdr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr1(String value) {
        this.lgAdr1 = value;
    }

    /**
     * Gets the value of the lgAdr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr2() {
        return lgAdr2;
    }

    /**
     * Sets the value of the lgAdr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr2(String value) {
        this.lgAdr2 = value;
    }

    /**
     * Gets the value of the lgAdr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr3() {
        return lgAdr3;
    }

    /**
     * Sets the value of the lgAdr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr3(String value) {
        this.lgAdr3 = value;
    }

    /**
     * Gets the value of the lgAdr4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr4() {
        return lgAdr4;
    }

    /**
     * Sets the value of the lgAdr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr4(String value) {
        this.lgAdr4 = value;
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
     * Gets the value of the localisation1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalisation1() {
        return localisation1;
    }

    /**
     * Sets the value of the localisation1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalisation1(String value) {
        this.localisation1 = value;
    }

    /**
     * Gets the value of the localisation2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalisation2() {
        return localisation2;
    }

    /**
     * Sets the value of the localisation2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalisation2(String value) {
        this.localisation2 = value;
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
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformation(String value) {
        this.information = value;
    }

    /**
     * Gets the value of the horairesLundi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesLundi() {
        return horairesLundi;
    }

    /**
     * Sets the value of the horairesLundi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesLundi(ArrayOfString value) {
        this.horairesLundi = value;
    }

    /**
     * Gets the value of the horairesMardi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesMardi() {
        return horairesMardi;
    }

    /**
     * Sets the value of the horairesMardi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesMardi(ArrayOfString value) {
        this.horairesMardi = value;
    }

    /**
     * Gets the value of the horairesMercredi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesMercredi() {
        return horairesMercredi;
    }

    /**
     * Sets the value of the horairesMercredi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesMercredi(ArrayOfString value) {
        this.horairesMercredi = value;
    }

    /**
     * Gets the value of the horairesJeudi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesJeudi() {
        return horairesJeudi;
    }

    /**
     * Sets the value of the horairesJeudi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesJeudi(ArrayOfString value) {
        this.horairesJeudi = value;
    }

    /**
     * Gets the value of the horairesVendredi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesVendredi() {
        return horairesVendredi;
    }

    /**
     * Sets the value of the horairesVendredi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesVendredi(ArrayOfString value) {
        this.horairesVendredi = value;
    }

    /**
     * Gets the value of the horairesSamedi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesSamedi() {
        return horairesSamedi;
    }

    /**
     * Sets the value of the horairesSamedi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesSamedi(ArrayOfString value) {
        this.horairesSamedi = value;
    }

    /**
     * Gets the value of the horairesDimanche property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesDimanche() {
        return horairesDimanche;
    }

    /**
     * Sets the value of the horairesDimanche property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesDimanche(ArrayOfString value) {
        this.horairesDimanche = value;
    }

    /**
     * Gets the value of the informationsDispo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPeriode }
     *     
     */
    public ArrayOfPeriode getInformationsDispo() {
        return informationsDispo;
    }

    /**
     * Sets the value of the informationsDispo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPeriode }
     *     
     */
    public void setInformationsDispo(ArrayOfPeriode value) {
        this.informationsDispo = value;
    }

    /**
     * Gets the value of the urlPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPhoto() {
        return urlPhoto;
    }

    /**
     * Sets the value of the urlPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPhoto(String value) {
        this.urlPhoto = value;
    }

    /**
     * Gets the value of the urlPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPlan() {
        return urlPlan;
    }

    /**
     * Sets the value of the urlPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPlan(String value) {
        this.urlPlan = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

}
