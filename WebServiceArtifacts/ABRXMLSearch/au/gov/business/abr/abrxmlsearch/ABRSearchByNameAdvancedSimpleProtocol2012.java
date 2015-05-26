
package au.gov.business.abr.abrxmlsearch;

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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tradingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NSW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QLD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchWidth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minimumScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxSearchResults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "name",
    "postcode",
    "legalName",
    "tradingName",
    "businessName",
    "nsw",
    "sa",
    "act",
    "vic",
    "wa",
    "nt",
    "qld",
    "tas",
    "authenticationGuid",
    "searchWidth",
    "minimumScore",
    "maxSearchResults"
})
@XmlRootElement(name = "ABRSearchByNameAdvancedSimpleProtocol2012")
public class ABRSearchByNameAdvancedSimpleProtocol2012 {

    protected String name;
    protected String postcode;
    protected String legalName;
    protected String tradingName;
    protected String businessName;
    @XmlElement(name = "NSW")
    protected String nsw;
    @XmlElement(name = "SA")
    protected String sa;
    @XmlElement(name = "ACT")
    protected String act;
    @XmlElement(name = "VIC")
    protected String vic;
    @XmlElement(name = "WA")
    protected String wa;
    @XmlElement(name = "NT")
    protected String nt;
    @XmlElement(name = "QLD")
    protected String qld;
    @XmlElement(name = "TAS")
    protected String tas;
    protected String authenticationGuid;
    protected String searchWidth;
    protected String minimumScore;
    protected String maxSearchResults;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the tradingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingName() {
        return tradingName;
    }

    /**
     * Sets the value of the tradingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingName(String value) {
        this.tradingName = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the nsw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSW() {
        return nsw;
    }

    /**
     * Sets the value of the nsw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSW(String value) {
        this.nsw = value;
    }

    /**
     * Gets the value of the sa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSA() {
        return sa;
    }

    /**
     * Sets the value of the sa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSA(String value) {
        this.sa = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACT() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACT(String value) {
        this.act = value;
    }

    /**
     * Gets the value of the vic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIC() {
        return vic;
    }

    /**
     * Sets the value of the vic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIC(String value) {
        this.vic = value;
    }

    /**
     * Gets the value of the wa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWA() {
        return wa;
    }

    /**
     * Sets the value of the wa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWA(String value) {
        this.wa = value;
    }

    /**
     * Gets the value of the nt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNT() {
        return nt;
    }

    /**
     * Sets the value of the nt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNT(String value) {
        this.nt = value;
    }

    /**
     * Gets the value of the qld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQLD() {
        return qld;
    }

    /**
     * Sets the value of the qld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQLD(String value) {
        this.qld = value;
    }

    /**
     * Gets the value of the tas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAS() {
        return tas;
    }

    /**
     * Sets the value of the tas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAS(String value) {
        this.tas = value;
    }

    /**
     * Gets the value of the authenticationGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationGuid() {
        return authenticationGuid;
    }

    /**
     * Sets the value of the authenticationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationGuid(String value) {
        this.authenticationGuid = value;
    }

    /**
     * Gets the value of the searchWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchWidth() {
        return searchWidth;
    }

    /**
     * Sets the value of the searchWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchWidth(String value) {
        this.searchWidth = value;
    }

    /**
     * Gets the value of the minimumScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumScore() {
        return minimumScore;
    }

    /**
     * Sets the value of the minimumScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumScore(String value) {
        this.minimumScore = value;
    }

    /**
     * Gets the value of the maxSearchResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxSearchResults() {
        return maxSearchResults;
    }

    /**
     * Sets the value of the maxSearchResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxSearchResults(String value) {
        this.maxSearchResults = value;
    }

}
