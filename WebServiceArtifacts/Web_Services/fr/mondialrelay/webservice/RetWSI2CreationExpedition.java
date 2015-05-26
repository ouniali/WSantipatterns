
package fr.mondialrelay.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ret_WSI2_CreationExpedition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_CreationExpedition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_">
 *       &lt;sequence>
 *         &lt;element name="ExpeditionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRI_AgenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRI_Groupe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRI_Navette" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRI_Agence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRI_TourneeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRI_LivraisonMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodesBarres" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_CreationExpedition", propOrder = {
    "expeditionNum",
    "triAgenceCode",
    "triGroupe",
    "triNavette",
    "triAgence",
    "triTourneeCode",
    "triLivraisonMode",
    "codesBarres"
})
public class RetWSI2CreationExpedition
    extends Ret
{

    @XmlElement(name = "ExpeditionNum")
    protected String expeditionNum;
    @XmlElement(name = "TRI_AgenceCode")
    protected String triAgenceCode;
    @XmlElement(name = "TRI_Groupe")
    protected String triGroupe;
    @XmlElement(name = "TRI_Navette")
    protected String triNavette;
    @XmlElement(name = "TRI_Agence")
    protected String triAgence;
    @XmlElement(name = "TRI_TourneeCode")
    protected String triTourneeCode;
    @XmlElement(name = "TRI_LivraisonMode")
    protected String triLivraisonMode;
    @XmlElement(name = "CodesBarres")
    protected ArrayOfString codesBarres;

    /**
     * Gets the value of the expeditionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeditionNum() {
        return expeditionNum;
    }

    /**
     * Sets the value of the expeditionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeditionNum(String value) {
        this.expeditionNum = value;
    }

    /**
     * Gets the value of the triAgenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIAgenceCode() {
        return triAgenceCode;
    }

    /**
     * Sets the value of the triAgenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIAgenceCode(String value) {
        this.triAgenceCode = value;
    }

    /**
     * Gets the value of the triGroupe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIGroupe() {
        return triGroupe;
    }

    /**
     * Sets the value of the triGroupe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIGroupe(String value) {
        this.triGroupe = value;
    }

    /**
     * Gets the value of the triNavette property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRINavette() {
        return triNavette;
    }

    /**
     * Sets the value of the triNavette property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRINavette(String value) {
        this.triNavette = value;
    }

    /**
     * Gets the value of the triAgence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRIAgence() {
        return triAgence;
    }

    /**
     * Sets the value of the triAgence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRIAgence(String value) {
        this.triAgence = value;
    }

    /**
     * Gets the value of the triTourneeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRITourneeCode() {
        return triTourneeCode;
    }

    /**
     * Sets the value of the triTourneeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRITourneeCode(String value) {
        this.triTourneeCode = value;
    }

    /**
     * Gets the value of the triLivraisonMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRILivraisonMode() {
        return triLivraisonMode;
    }

    /**
     * Sets the value of the triLivraisonMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRILivraisonMode(String value) {
        this.triLivraisonMode = value;
    }

    /**
     * Gets the value of the codesBarres property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCodesBarres() {
        return codesBarres;
    }

    /**
     * Sets the value of the codesBarres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCodesBarres(ArrayOfString value) {
        this.codesBarres = value;
    }

}
