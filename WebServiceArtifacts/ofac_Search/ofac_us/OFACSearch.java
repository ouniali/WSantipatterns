
package ofac_us;

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
 *         &lt;element name="ofac_idF" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name_word_1F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_word_2F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_word_3F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_word_4F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_word_5F" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="add_numF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="add_streetF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="add_cityF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="add_st_provF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="add_zipF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="add_countryF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="search_commentsF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "ofacIdF",
    "nameWord1F",
    "nameWord2F",
    "nameWord3F",
    "nameWord4F",
    "nameWord5F",
    "addNumF",
    "addStreetF",
    "addCityF",
    "addStProvF",
    "addZipF",
    "addCountryF",
    "searchCommentsF"
})
@XmlRootElement(name = "OFAC_Search")
public class OFACSearch {

    @XmlElement(name = "ofac_idF")
    protected int ofacIdF;
    @XmlElement(name = "name_word_1F")
    protected String nameWord1F;
    @XmlElement(name = "name_word_2F")
    protected String nameWord2F;
    @XmlElement(name = "name_word_3F")
    protected String nameWord3F;
    @XmlElement(name = "name_word_4F")
    protected String nameWord4F;
    @XmlElement(name = "name_word_5F")
    protected String nameWord5F;
    @XmlElement(name = "add_numF")
    protected String addNumF;
    @XmlElement(name = "add_streetF")
    protected String addStreetF;
    @XmlElement(name = "add_cityF")
    protected String addCityF;
    @XmlElement(name = "add_st_provF")
    protected String addStProvF;
    @XmlElement(name = "add_zipF")
    protected String addZipF;
    @XmlElement(name = "add_countryF")
    protected String addCountryF;
    @XmlElement(name = "search_commentsF")
    protected String searchCommentsF;

    /**
     * Gets the value of the ofacIdF property.
     * 
     */
    public int getOfacIdF() {
        return ofacIdF;
    }

    /**
     * Sets the value of the ofacIdF property.
     * 
     */
    public void setOfacIdF(int value) {
        this.ofacIdF = value;
    }

    /**
     * Gets the value of the nameWord1F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWord1F() {
        return nameWord1F;
    }

    /**
     * Sets the value of the nameWord1F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWord1F(String value) {
        this.nameWord1F = value;
    }

    /**
     * Gets the value of the nameWord2F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWord2F() {
        return nameWord2F;
    }

    /**
     * Sets the value of the nameWord2F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWord2F(String value) {
        this.nameWord2F = value;
    }

    /**
     * Gets the value of the nameWord3F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWord3F() {
        return nameWord3F;
    }

    /**
     * Sets the value of the nameWord3F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWord3F(String value) {
        this.nameWord3F = value;
    }

    /**
     * Gets the value of the nameWord4F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWord4F() {
        return nameWord4F;
    }

    /**
     * Sets the value of the nameWord4F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWord4F(String value) {
        this.nameWord4F = value;
    }

    /**
     * Gets the value of the nameWord5F property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWord5F() {
        return nameWord5F;
    }

    /**
     * Sets the value of the nameWord5F property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWord5F(String value) {
        this.nameWord5F = value;
    }

    /**
     * Gets the value of the addNumF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddNumF() {
        return addNumF;
    }

    /**
     * Sets the value of the addNumF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddNumF(String value) {
        this.addNumF = value;
    }

    /**
     * Gets the value of the addStreetF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddStreetF() {
        return addStreetF;
    }

    /**
     * Sets the value of the addStreetF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddStreetF(String value) {
        this.addStreetF = value;
    }

    /**
     * Gets the value of the addCityF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddCityF() {
        return addCityF;
    }

    /**
     * Sets the value of the addCityF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddCityF(String value) {
        this.addCityF = value;
    }

    /**
     * Gets the value of the addStProvF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddStProvF() {
        return addStProvF;
    }

    /**
     * Sets the value of the addStProvF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddStProvF(String value) {
        this.addStProvF = value;
    }

    /**
     * Gets the value of the addZipF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddZipF() {
        return addZipF;
    }

    /**
     * Sets the value of the addZipF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddZipF(String value) {
        this.addZipF = value;
    }

    /**
     * Gets the value of the addCountryF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddCountryF() {
        return addCountryF;
    }

    /**
     * Sets the value of the addCountryF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddCountryF(String value) {
        this.addCountryF = value;
    }

    /**
     * Gets the value of the searchCommentsF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCommentsF() {
        return searchCommentsF;
    }

    /**
     * Sets the value of the searchCommentsF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCommentsF(String value) {
        this.searchCommentsF = value;
    }

}
