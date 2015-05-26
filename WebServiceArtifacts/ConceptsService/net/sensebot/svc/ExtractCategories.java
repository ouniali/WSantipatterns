
package net.sensebot.svc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allURLs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numConcepts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "userName",
    "allURLs",
    "artClass",
    "artLength",
    "numConcepts",
    "lang"
})
@XmlRootElement(name = "ExtractCategories")
public class ExtractCategories {

    protected String userName;
    protected String allURLs;
    protected String artClass;
    protected String artLength;
    protected String numConcepts;
    protected String lang;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the allURLs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllURLs() {
        return allURLs;
    }

    /**
     * Sets the value of the allURLs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllURLs(String value) {
        this.allURLs = value;
    }

    /**
     * Gets the value of the artClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtClass() {
        return artClass;
    }

    /**
     * Sets the value of the artClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtClass(String value) {
        this.artClass = value;
    }

    /**
     * Gets the value of the artLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtLength() {
        return artLength;
    }

    /**
     * Sets the value of the artLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtLength(String value) {
        this.artLength = value;
    }

    /**
     * Gets the value of the numConcepts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumConcepts() {
        return numConcepts;
    }

    /**
     * Sets the value of the numConcepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumConcepts(String value) {
        this.numConcepts = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
