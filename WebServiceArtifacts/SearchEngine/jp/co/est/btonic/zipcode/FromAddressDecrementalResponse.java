
package jp.co.est.btonic.zipcode;

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
 *         &lt;element name="FromAddressDecrementalResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SearchResult" type="{http://btonic.est.co.jp/zipcode/}FindList" minOccurs="0"/>
 *         &lt;element name="MatchAddressWord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fromAddressDecrementalResult",
    "searchResult",
    "matchAddressWord"
})
@XmlRootElement(name = "FromAddressDecrementalResponse")
public class FromAddressDecrementalResponse {

    @XmlElement(name = "FromAddressDecrementalResult")
    protected boolean fromAddressDecrementalResult;
    @XmlElement(name = "SearchResult")
    protected FindList searchResult;
    @XmlElement(name = "MatchAddressWord")
    protected String matchAddressWord;

    /**
     * Gets the value of the fromAddressDecrementalResult property.
     * 
     */
    public boolean isFromAddressDecrementalResult() {
        return fromAddressDecrementalResult;
    }

    /**
     * Sets the value of the fromAddressDecrementalResult property.
     * 
     */
    public void setFromAddressDecrementalResult(boolean value) {
        this.fromAddressDecrementalResult = value;
    }

    /**
     * Gets the value of the searchResult property.
     * 
     * @return
     *     possible object is
     *     {@link FindList }
     *     
     */
    public FindList getSearchResult() {
        return searchResult;
    }

    /**
     * Sets the value of the searchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindList }
     *     
     */
    public void setSearchResult(FindList value) {
        this.searchResult = value;
    }

    /**
     * Gets the value of the matchAddressWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchAddressWord() {
        return matchAddressWord;
    }

    /**
     * Sets the value of the matchAddressWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchAddressWord(String value) {
        this.matchAddressWord = value;
    }

}
